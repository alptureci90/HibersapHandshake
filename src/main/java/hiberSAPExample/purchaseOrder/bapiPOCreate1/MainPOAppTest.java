package hiberSAPExample.purchaseOrder.bapiPOCreate1;

import hiberSAPExample.purchaseOrder.bapiPOCreate1.bapiStructure.*;
import hiberSAPExample.sapSessionManager.SAPSessionManager;
import hiberSAPExample.utilities.BapiRet2;
import org.hibersap.session.Session;
import org.hibersap.session.SessionManager;

import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * TODO: character length recognition.
 */

public class MainPOAppTest {

    private final String SAP_TRUE = "X";
    // serial account assignment to POAccount and POAccountX has to be the same. 
    // If different serial numbers are assigned, then system blows up. 
    private final String SERIAL_4_ACCOUNTS = "001";

    private final String ITEM_NUMBER = "00010";

    private final BigDecimal BIG_DECIMAL_0 = new BigDecimal(0);

    public static void main(String[] args){

        MainPOAppTest test = new MainPOAppTest();

        test.createPO1();
    }

    private void createPO1(){


        // POHeader
        BSPOHeader poHeader = mapPOHeader();

        // POHeaderX
        BSPOHeaderX poHeaderX = mapPOHeaderX();

        // POItem
        List<BSPOItem> poItemList = new LinkedList<>();
        poItemList.add(mapPOItem());

        // POItemX
        List<BSPOItemX> poItemXList = new LinkedList<>();
        poItemXList.add(mapPOItemX());

        // POAccount
        List<BSPOAccount> poAccountList = new LinkedList<>();
        poAccountList.add(mapPOAccount());

        // POAccountX
        List<BSPOAccountX> poAccountXList = new LinkedList<>();
        poAccountXList.add(mapPOAccountX());

        PurchaseOrderCreate1 poCreateBapi = new PurchaseOrderCreate1();
        poCreateBapi.setPoHeader(poHeader);
        poCreateBapi.setPoHeaderX(poHeaderX);
        poCreateBapi.setPoItemList(poItemList);
        poCreateBapi.setPoItemXList(poItemXList);
        poCreateBapi.setPoAccountList(poAccountList);
        poCreateBapi.setPoAccountXList(poAccountXList);

        try{
            SAPSessionManager.executeSession(poCreateBapi);
        } catch (Exception e){
            System.out.println("Exception in BAPI_PO_CREATE1 execute statement!");
            e.printStackTrace();
        }

        showResult(poCreateBapi);
    }

    private void showResult(PurchaseOrderCreate1 poCreateResult){

        System.out.println("Created Purchase Order Number:\t" + poCreateResult.getPoGeneratedPONumber());

        for (BapiRet2 result : poCreateResult.getPoResultList()){
            System.out.println("\n" + result.toString());
        }

    }

    private BSPOHeader mapPOHeader(){
        // POHeader
        POHeader po = new POHeader();
        BSPOHeader poHeader = new BSPOHeader();
        try {
            
            poHeader.setCompCode(po.getCompCode());
            poHeader.setDocType(po.getDocType());
            //poHeader.setCreateDate(po.getCreatedDate());
            //poHeader.setCreatedBy(po.getCreatedBy());
            //poHeader.setItemNumberInterval(po.getItemInterval());
            poHeader.setVendor(po.getVendor());
            //poHeader.setDiscountDays1(po.getDiscountDays1());
            //poHeader.setDiscountDays2(po.getDiscountDays2());
            //poHeader.setDiscountDays3(po.getDiscountDays3());
            //poHeader.setDiscountPercentage1(po.getDiscountPercentage1());
            //poHeader.setDiscountPercentage2(po.getDiscountPercentage2());
            poHeader.setPurchOrg(po.getPurchOrg());
            poHeader.setPurchGroup(po.getPurchGroup());
            poHeader.setCurrency(po.getCurrency());
            poHeader.setDocDate(po.getDocDate());
            //poHeader.setSubItemInterval(po.getSubItem());
            //poHeader.setCancelationReason(po.getReasonForCancelation());
            //poHeader.setRetentionPercentage(po.getRetentionPercentage());
            //poHeader.setDownPaymentAmount(po.getDownPaymentAmount());
            //poHeader.setDownPaymentPercentage(po.getDownPaymentPercentage());
        } catch (Exception e){
            System.out.println("Error in mapping PO Header Data");
            e.printStackTrace();
        }
        
        return poHeader;
    }
    
    private BSPOHeaderX mapPOHeaderX(){
        // POHeaderX
        POHeaderX po = new POHeaderX();
        BSPOHeaderX poHeaderX = new BSPOHeaderX();
        try {
            poHeaderX.setCompCodeX(po.getCompCodeX());
            poHeaderX.setDocTypeX(po.getDocTypeX());
            //poHeaderX.setCreatedDateX(po.getCreateDateX());
            //poHeaderX.setCreatedByX(po.getCreateByX());
            poHeaderX.setVendorX(po.getVendorX());
            poHeaderX.setPurchOrgX(po.getPurchOrgX());
            poHeaderX.setPurchGroupX(po.getPurchGroupX());
            poHeaderX.setCurrencyX(po.getCurrencyX());
            poHeaderX.setDocDateX(po.getDocDateX());
        } catch (Exception e){
            System.out.println("Error in mapping BSPOHeaderX Data");
        }
        return poHeaderX;
    }
    
    private BSPOItem mapPOItem(){
       // PO Item Data
        POItem po = new POItem();
        BSPOItem poItem = new BSPOItem();
        try {
            poItem.setPoItem(po.getPoItem());
            poItem.setShortText(po.getShortText());
            poItem.setMaterial(po.getMaterial());
            poItem.setPlant(po.getPlant());
            poItem.setMaterialGroup(po.getMaterialGroup());
            //poItem.setInfoRec(po.getInfoRec());
            poItem.setQuantity(po.getQuantity());
            poItem.setUnitOfMeasure(po.getUnitOfMeasure());
            //poItem.setConversionNumerator(po.getConversionNum());
            //poItem.setConversionDenumartor(po.getConversionDenum());
            poItem.setNetPrice(po.getNetPrice());
            poItem.setPriceUnit(po.getPriceUnit());
            //poItem.setGoodsReceiptProcessingDays(po.getGoodsReceiptProcessingDays());
            //poItem.setReminder1(po.getReminder1());
            //poItem.setReminder2(po.getReminder2());
            //poItem.setReminder3(po.getReminder3());
            //poItem.setOverDeliveryLimit(po.getOverDeliveryLimit());
            //poItem.setUnderDeliveryLimit(po.getUnderDeliveryLimit());
            //poItem.setDeliveryCompletedIndicator(po.getDeliveryCompletedIndicator());
            poItem.setAccountAssignmentCategory(po.getAccountAssignmentCategory());
            //poItem.setAgreementItemNumber(po.getAgreementItemNumber());  //*
            //poItem.setPlannedDeliveryInDays(po.getPlannedDeliveryInDays());
            //poItem.setNetWeight(po.getNetWeight());
            //poItem.setGrossWeight(po.getGrossWeight());
            //poItem.setVolume(po.getVolume());
            //poItem.setHigherLevelItem(po.getHigherLevelItem());//*
            //poItem.setPoints(po.getPoints());
            //poItem.setMinRemaningShelfLife(po.getMinRemaningSelfLife());
            //poItem.setRfqItem(po.getRfqItem());//*
            //poItem.setPreqItem(po.getPreqItem());//*
            //poItem.setRefItem(po.getRefItem());//*
            //poItem.setExpirationDateRemainder(po.getExpirationDateDemainder());
        } catch (Exception e){
            System.out.println("Exception in mapping PO Item Data");
            e.printStackTrace();
        }
        return poItem;
    }
    
    private BSPOItemX mapPOItemX(){
        // PO Item X
        POItemX po = new POItemX();
        BSPOItemX poItemX = new BSPOItemX();
        try {
            poItemX.setPoItem(po.getPoItem1());
            poItemX.setPoItemX(po.getPoItemX());
            poItemX.setShortText(po.getShortTermX());
            poItemX.setMaterial(po.getMaterialX());
            poItemX.setPlant(po.getPlantX());
            poItemX.setMaterialGroup(po.getMaterialGroupX());
            poItemX.setQuantity(po.getQuantityX());
            poItemX.setPoUnit(po.getPoUnitX());
            poItemX.setNetPrice(po.getNetPriceX());
            poItemX.setPriceUnit(po.getPriceUnitX());
            //poItemX.setDeliveryCompletedIndicator(po.getDeliveryCompletedIndicatorX());
            poItemX.setAccountAssignmentCategory(po.getAccountAssignmentCategoryX());
        } catch (Exception e){
            System.out.println("Exception in mapping PO ItemX");
            e.printStackTrace();
        }
        return poItemX;
    }

    private BSPOAccount mapPOAccount(){
        // PO Account
        POAccount po = new POAccount();
        BSPOAccount poAccount = new BSPOAccount();
        try {
            poAccount.setPoItem(po.getPoItemAccount());
            poAccount.setSerialNum(po.getSerialNum());
            //poAccount.setCreateDate(po.getCreatedDateAccount());
            poAccount.setQuantity(po.getQuantityAccount());
            //poAccount.setDistributionPercentage(po.getDistributionPercentageAccount());
            //poAccount.setNetValue(po.getNetValue());
            poAccount.setGlAccount(po.getGlAccount());
            poAccount.setCostCenter(po.getCostCenter());
            //poAccount.setSalesDocItemNumber(po.getSalesDocItemNumber()); //*
            //poAccount.setScheduleLineNumber(po.getScheduleLineNumber()); //*
            //poAccount.setNonDITax(po.getNonDITax());
            //poAccount.setEarmarkedFundsItemNumber(po.getEarmarkedFundsItemNumber()); //*

        } catch (Exception e){
            System.out.println("Exception in mapping PO Account data!");
            e.printStackTrace();
        }
        return poAccount;
    }

    private BSPOAccountX mapPOAccountX(){
        // PO Account X
        POAccountX po = new POAccountX();
        BSPOAccountX poAccountX = new BSPOAccountX();

        try {
            poAccountX.setPoItem(po.getPoItem());
            poAccountX.setSerialNumber(po.getSerialNum());
            poAccountX.setPoItemX(po.getPoItemAccountX());
            //poAccountX.setCreateDateX(po.getCreateDateAccountX());
            poAccountX.setQuantityX(po.getQuantityAccountX());
            poAccountX.setGlAccountX(po.getGlAccountX());
            poAccountX.setCostCenterX(po.getCostCenterX());
        } catch (Exception e){
            System.out.println("Exception in mapping PO Account X!");
            e.printStackTrace();
        }
        return poAccountX;
    }


    class POHeader{
        // POHeader Data
        private String compCode = "8800";
        private String docType = "NB";
        private Date createdDate = new Date();
        private String createdBy = "ECC1116";
        private String itemInterval = "00000";
        private String vendor = "AIR2VEND";
        private BigDecimal discountDays1 = BIG_DECIMAL_0;
        private BigDecimal discountDays2 = BIG_DECIMAL_0;
        private BigDecimal discountDays3 = BIG_DECIMAL_0;
        private BigDecimal discountPercentage1 = BIG_DECIMAL_0;
        private BigDecimal discountPercentage2 = BIG_DECIMAL_0;
        private String purchOrg = "8800";
        private String purchGroup = "880";
        private String currency = "USD";
        private Date docDate = new Date();
        private String subItem = "00000";
        private String reasonForCancelation = "00";
        private BigDecimal retentionPercentage = BIG_DECIMAL_0;
        private BigDecimal downPaymentAmount = BIG_DECIMAL_0;
        private BigDecimal downPaymentPercentage = BIG_DECIMAL_0;

        public String getCompCode() {
            return compCode;
        }

        public void setCompCode(String compCode) {
            this.compCode = compCode;
        }

        public String getDocType() {
            return docType;
        }

        public void setDocType(String docType) {
            this.docType = docType;
        }

        public Date getCreatedDate() {
            return createdDate;
        }

        public void setCreatedDate(Date createdDate) {
            this.createdDate = createdDate;
        }

        public String getCreatedBy() {
            return createdBy;
        }

        public void setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
        }

        public String getItemInterval() {
            return itemInterval;
        }

        public void setItemInterval(String itemInterval) {
            this.itemInterval = itemInterval;
        }

        public String getVendor() {
            return vendor;
        }

        public void setVendor(String vendor) {
            this.vendor = vendor;
        }

        public BigDecimal getDiscountDays1() {
            return discountDays1;
        }

        public void setDiscountDays1(BigDecimal discountDays1) {
            this.discountDays1 = discountDays1;
        }

        public BigDecimal getDiscountDays2() {
            return discountDays2;
        }

        public void setDiscountDays2(BigDecimal discountDays2) {
            this.discountDays2 = discountDays2;
        }

        public BigDecimal getDiscountDays3() {
            return discountDays3;
        }

        public void setDiscountDays3(BigDecimal discountDays3) {
            this.discountDays3 = discountDays3;
        }

        public BigDecimal getDiscountPercentage1() {
            return discountPercentage1;
        }

        public void setDiscountPercentage1(BigDecimal discountPercentage1) {
            this.discountPercentage1 = discountPercentage1;
        }

        public BigDecimal getDiscountPercentage2() {
            return discountPercentage2;
        }

        public void setDiscountPercentage2(BigDecimal discountPercentage2) {
            this.discountPercentage2 = discountPercentage2;
        }

        public String getPurchOrg() {
            return purchOrg;
        }

        public void setPurchOrg(String purchOrg) {
            this.purchOrg = purchOrg;
        }

        public String getPurchGroup() {
            return purchGroup;
        }

        public void setPurchGroup(String purchGroup) {
            this.purchGroup = purchGroup;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public Date getDocDate() {
            return docDate;
        }

        public void setDocDate(Date docDate) {
            this.docDate = docDate;
        }

        public String getSubItem() {
            return subItem;
        }

        public void setSubItem(String subItem) {
            this.subItem = subItem;
        }

        public String getReasonForCancelation() {
            return reasonForCancelation;
        }

        public void setReasonForCancelation(String reasonForCancelation) {
            this.reasonForCancelation = reasonForCancelation;
        }

        public BigDecimal getRetentionPercentage() {
            return retentionPercentage;
        }

        public void setRetentionPercentage(BigDecimal retentionPercentage) {
            this.retentionPercentage = retentionPercentage;
        }

        public BigDecimal getDownPaymentAmount() {
            return downPaymentAmount;
        }

        public void setDownPaymentAmount(BigDecimal downPaymentAmount) {
            this.downPaymentAmount = downPaymentAmount;
        }

        public BigDecimal getDownPaymentPercentage() {
            return downPaymentPercentage;
        }

        public void setDownPaymentPercentage(BigDecimal downPaymentPercentage) {
            this.downPaymentPercentage = downPaymentPercentage;
        }
    }

    class POHeaderX{

        // POHeaderX Data
        private String compCodeX = SAP_TRUE,
                docTypeX = SAP_TRUE,
                createDateX = SAP_TRUE,
                createByX = SAP_TRUE,
                vendorX = SAP_TRUE,
                purchOrgX = SAP_TRUE,
                purchGroupX = SAP_TRUE,
                currencyX = SAP_TRUE,
                docDateX = SAP_TRUE;

        public String getCompCodeX() {
            return compCodeX;
        }

        public void setCompCodeX(String compCodeX) {
            this.compCodeX = compCodeX;
        }

        public String getDocTypeX() {
            return docTypeX;
        }

        public void setDocTypeX(String docTypeX) {
            this.docTypeX = docTypeX;
        }

        public String getCreateDateX() {
            return createDateX;
        }

        public void setCreateDateX(String createDateX) {
            this.createDateX = createDateX;
        }

        public String getCreateByX() {
            return createByX;
        }

        public void setCreateByX(String createByX) {
            this.createByX = createByX;
        }

        public String getVendorX() {
            return vendorX;
        }

        public void setVendorX(String vendorX) {
            this.vendorX = vendorX;
        }

        public String getPurchOrgX() {
            return purchOrgX;
        }

        public void setPurchOrgX(String purchOrgX) {
            this.purchOrgX = purchOrgX;
        }

        public String getPurchGroupX() {
            return purchGroupX;
        }

        public void setPurchGroupX(String purchGroupX) {
            this.purchGroupX = purchGroupX;
        }

        public String getCurrencyX() {
            return currencyX;
        }

        public void setCurrencyX(String currencyX) {
            this.currencyX = currencyX;
        }

        public String getDocDateX() {
            return docDateX;
        }

        public void setDocDateX(String docDateX) {
            this.docDateX = docDateX;
        }
    }

    class POItem{
        // POItem Data
        private String poItem = ITEM_NUMBER;
        private String shortText = "AI RETAIL ARTICLE NO.2";
        private String material = "AIR2ART";
        private String plant = "8800";
        private String materialGroup = "00710";
        private String infoRec = "";
        private BigDecimal quantity = new BigDecimal(10);
        private String unitOfMeasure = "UN";
        private BigDecimal conversionNum = BIG_DECIMAL_0;
        private BigDecimal conversionDenum = BIG_DECIMAL_0;
        private BigDecimal netPrice = new BigDecimal(444);
        private BigDecimal priceUnit = new BigDecimal(1);
        private BigDecimal goodsReceiptProcessingDays =  BIG_DECIMAL_0;
        private BigDecimal reminder1 = BIG_DECIMAL_0;
        private BigDecimal reminder2 = BIG_DECIMAL_0;
        private BigDecimal reminder3 = BIG_DECIMAL_0;
        private BigDecimal overDeliveryLimit = BIG_DECIMAL_0;
        private BigDecimal underDeliveryLimit = BIG_DECIMAL_0;
        private String deliveryCompletedIndicator = "X";
        private String accountAssignmentCategory = "K";
        private String agreementItemNumber = "00000";
        private BigDecimal plannedDeliveryInDays = BIG_DECIMAL_0;
        private BigDecimal netWeight = BIG_DECIMAL_0;
        private BigDecimal grossWeight = BIG_DECIMAL_0;
        private BigDecimal volume = BIG_DECIMAL_0;
        private String higherLevelItem = "00000";
        private BigDecimal points = BIG_DECIMAL_0;
        private BigDecimal minRemaningSelfLife = BIG_DECIMAL_0;
        private String rfqItem = "00000";
        private String preqItem = "00000";
        private String refItem = "00000";
        private String expirationDateDemainder = "D";


            public String getPoItem () {
            return poItem;
        }

            public void setPoItem (String poItem){
            this.poItem = poItem;
        }

            public String getShortText () {
            return shortText;
        }

            public void setShortText (String shortText){
            this.shortText = shortText;
        }

            public String getMaterial () {
            return material;
        }

            public void setMaterial (String material){
            this.material = material;
        }

            public String getPlant () {
            return plant;
        }

            public void setPlant (String plant){
            this.plant = plant;
        }

            public String getMaterialGroup () {
            return materialGroup;
        }

            public void setMaterialGroup (String materialGroup){
            this.materialGroup = materialGroup;
        }

            public String getInfoRec () {
            return infoRec;
        }

            public void setInfoRec (String infoRec){
            this.infoRec = infoRec;
        }

            public BigDecimal getQuantity () {
            return quantity;
        }

            public void setQuantity (BigDecimal quantity){
            this.quantity = quantity;
        }

            public String getUnitOfMeasure () {
            return unitOfMeasure;
        }

            public void setUnitOfMeasure (String unitOfMeasure){
            this.unitOfMeasure = unitOfMeasure;
        }

            public BigDecimal getConversionNum () {
            return conversionNum;
        }

            public void setConversionNum (BigDecimal conversionNum){
            this.conversionNum = conversionNum;
        }

            public BigDecimal getConversionDenum () {
            return conversionDenum;
        }

            public void setConversionDenum (BigDecimal conversionDenum){
            this.conversionDenum = conversionDenum;
        }

            public BigDecimal getNetPrice () {
            return netPrice;
        }

            public void setNetPrice (BigDecimal netPrice){
            this.netPrice = netPrice;
        }

            public BigDecimal getPriceUnit () {
            return priceUnit;
        }

            public void setPriceUnit (BigDecimal priceUnit){
            this.priceUnit = priceUnit;
        }

            public BigDecimal getGoodsReceiptProcessingDays () {
            return goodsReceiptProcessingDays;
        }

            public void setGoodsReceiptProcessingDays (BigDecimal goodsReceiptProcessingDays){
            this.goodsReceiptProcessingDays = goodsReceiptProcessingDays;
        }

            public BigDecimal getReminder1 () {
            return reminder1;
        }

            public void setReminder1 (BigDecimal reminder1){
            this.reminder1 = reminder1;
        }

            public BigDecimal getReminder2 () {
            return reminder2;
        }

            public void setReminder2 (BigDecimal reminder2){
            this.reminder2 = reminder2;
        }

            public BigDecimal getReminder3 () {
            return reminder3;
        }

            public void setReminder3 (BigDecimal reminder3){
            this.reminder3 = reminder3;
        }

            public BigDecimal getOverDeliveryLimit () {
            return overDeliveryLimit;
        }

            public void setOverDeliveryLimit (BigDecimal overDeliveryLimit){
            this.overDeliveryLimit = overDeliveryLimit;
        }

            public BigDecimal getUnderDeliveryLimit () {
            return underDeliveryLimit;
        }

            public void setUnderDeliveryLimit (BigDecimal underDeliveryLimit){
            this.underDeliveryLimit = underDeliveryLimit;
        }

            public String getDeliveryCompletedIndicator () {
            return deliveryCompletedIndicator;
        }

            public void setDeliveryCompletedIndicator (String deliveryCompletedIndicator){
            this.deliveryCompletedIndicator = deliveryCompletedIndicator;
        }

            public String getAccountAssignmentCategory () {
            return accountAssignmentCategory;
        }

            public void setAccountAssignmentCategory (String accountAssignmentCategory){
            this.accountAssignmentCategory = accountAssignmentCategory;
        }

            public String getAgreementItemNumber () {
            return agreementItemNumber;
        }

            public void setAgreementItemNumber (String agreementItemNumber){
            this.agreementItemNumber = agreementItemNumber;
        }

            public BigDecimal getPlannedDeliveryInDays () {
            return plannedDeliveryInDays;
        }

            public void setPlannedDeliveryInDays (BigDecimal plannedDeliveryInDays){
            this.plannedDeliveryInDays = plannedDeliveryInDays;
        }

            public BigDecimal getNetWeight () {
            return netWeight;
        }

            public void setNetWeight (BigDecimal netWeight){
            this.netWeight = netWeight;
        }

            public BigDecimal getGrossWeight () {
            return grossWeight;
        }

            public void setGrossWeight (BigDecimal grossWeight){
            this.grossWeight = grossWeight;
        }

            public BigDecimal getVolume () {
            return volume;
        }

            public void setVolume (BigDecimal volume){
            this.volume = volume;
        }

            public String getHigherLevelItem () {
            return higherLevelItem;
        }

            public void setHigherLevelItem (String higherLevelItem){
            this.higherLevelItem = higherLevelItem;
        }

            public BigDecimal getPoints () {
            return points;
        }

            public void setPoints (BigDecimal points){
            this.points = points;
        }

            public BigDecimal getMinRemaningSelfLife () {
            return minRemaningSelfLife;
        }

            public void setMinRemaningSelfLife (BigDecimal minRemaningSelfLife){
            this.minRemaningSelfLife = minRemaningSelfLife;
        }

            public String getRfqItem () {
            return rfqItem;
        }

            public void setRfqItem (String rfqItem){
            this.rfqItem = rfqItem;
        }

            public String getPreqItem () {
            return preqItem;
        }

            public void setPreqItem (String preqItem){
            this.preqItem = preqItem;
        }

            public String getRefItem () {
            return refItem;
        }

            public void setRefItem (String refItem){
            this.refItem = refItem;
        }

            public String getExpirationDateDemainder () {
            return expirationDateDemainder;
        }

            public void setExpirationDateDemainder (String expirationDateDemainder){
            this.expirationDateDemainder = expirationDateDemainder;
        }

    }

    class POItemX{
        // POItemX Data
        private String poItem = ITEM_NUMBER;
        private String poItemX = SAP_TRUE,
                shortTermX = SAP_TRUE,
                materialX = SAP_TRUE,
                plantX = SAP_TRUE,
                materialGroupX = SAP_TRUE,
                quantityX = SAP_TRUE,
                poUnitX = SAP_TRUE,
                netPriceX = SAP_TRUE,
                priceUnitX = SAP_TRUE,
                deliveryCompletedIndicatorX = SAP_TRUE,
                accountAssignmentCategoryX = SAP_TRUE;

        public String getPoItem1() {
            return poItem;
        }

        public void setPoItem1(String poItem1) {
            this.poItem = poItem1;
        }

        public String getPoItemX() {
            return poItemX;
        }

        public void setPoItemX(String poItemX) {
            this.poItemX = poItemX;
        }

        public String getShortTermX() {
            return shortTermX;
        }

        public void setShortTermX(String shortTermX) {
            this.shortTermX = shortTermX;
        }

        public String getMaterialX() {
            return materialX;
        }

        public void setMaterialX(String materialX) {
            this.materialX = materialX;
        }

        public String getPlantX() {
            return plantX;
        }

        public void setPlantX(String plantX) {
            this.plantX = plantX;
        }

        public String getMaterialGroupX() {
            return materialGroupX;
        }

        public void setMaterialGroupX(String materialGroupX) {
            this.materialGroupX = materialGroupX;
        }

        public String getQuantityX() {
            return quantityX;
        }

        public void setQuantityX(String quantityX) {
            this.quantityX = quantityX;
        }

        public String getPoUnitX() {
            return poUnitX;
        }

        public void setPoUnitX(String poUnitX) {
            this.poUnitX = poUnitX;
        }

        public String getNetPriceX() {
            return netPriceX;
        }

        public void setNetPriceX(String netPriceX) {
            this.netPriceX = netPriceX;
        }

        public String getPriceUnitX() {
            return priceUnitX;
        }

        public void setPriceUnitX(String priceUnitX) {
            this.priceUnitX = priceUnitX;
        }

        public String getDeliveryCompletedIndicatorX() {
            return deliveryCompletedIndicatorX;
        }

        public void setDeliveryCompletedIndicatorX(String deliveryCompletedIndicatorX) {
            this.deliveryCompletedIndicatorX = deliveryCompletedIndicatorX;
        }

        public String getAccountAssignmentCategoryX() {
            return accountAssignmentCategoryX;
        }

        public void setAccountAssignmentCategoryX(String accountAssignmentCategoryX) {
            this.accountAssignmentCategoryX = accountAssignmentCategoryX;
        }
    }

    class POAccount{
        // POAccount Data
        private String poItemAccount = ITEM_NUMBER;
        private String serialNum = SERIAL_4_ACCOUNTS;
        private Date createdDateAccount = new Date();
        private BigDecimal quantityAccount = new BigDecimal(10);
        private BigDecimal distributionPercentageAccount = BIG_DECIMAL_0;
        private BigDecimal netValue = BIG_DECIMAL_0;
        // account number needs to be 10 char
        private String glAccount = "0770100020";
        // cost center needs to be 10 char
        private String costCenter = "0000008800";
        private String salesDocItemNumber = "000000";
        private String scheduleLineNumber = "0000";
        private BigDecimal nonDITax = BIG_DECIMAL_0;
        private String earmarkedFundsItemNumber = "000";

        public String getPoItemAccount() {
            return poItemAccount;
        }

        public void setPoItemAccount(String poItemAccount) {
            this.poItemAccount = poItemAccount;
        }

        public String getSerialNum() {
            return serialNum;
        }

        public void setSerialNum(String serialNum) {
            this.serialNum = serialNum;
        }

        public Date getCreatedDateAccount() {
            return createdDateAccount;
        }

        public void setCreatedDateAccount(Date createdDateAccount) {
            this.createdDateAccount = createdDateAccount;
        }

        public BigDecimal getQuantityAccount() {
            return quantityAccount;
        }

        public void setQuantityAccount(BigDecimal quantityAccount) {
            this.quantityAccount = quantityAccount;
        }

        public BigDecimal getDistributionPercentageAccount() {
            return distributionPercentageAccount;
        }

        public void setDistributionPercentageAccount(BigDecimal distributionPercentageAccount) {
            this.distributionPercentageAccount = distributionPercentageAccount;
        }

        public BigDecimal getNetValue() {
            return netValue;
        }

        public void setNetValue(BigDecimal netValue) {
            this.netValue = netValue;
        }

        public String getGlAccount() {
            return glAccount;
        }

        public void setGlAccount(String glAccount) {
            this.glAccount = glAccount;
        }

        public String getCostCenter() {
            return costCenter;
        }

        public void setCostCenter(String costCenter) {
            this.costCenter = costCenter;
        }

        public String getSalesDocItemNumber() {
            return salesDocItemNumber;
        }

        public void setSalesDocItemNumber(String salesDocItemNumber) {
            this.salesDocItemNumber = salesDocItemNumber;
        }

        public String getScheduleLineNumber() {
            return scheduleLineNumber;
        }

        public void setScheduleLineNumber(String scheduleLineNumber) {
            this.scheduleLineNumber = scheduleLineNumber;
        }

        public BigDecimal getNonDITax() {
            return nonDITax;
        }

        public void setNonDITax(BigDecimal nonDITax) {
            this.nonDITax = nonDITax;
        }

        public String getEarmarkedFundsItemNumber() {
            return earmarkedFundsItemNumber;
        }

        public void setEarmarkedFundsItemNumber(String earmarkedFundsItemNumber) {
            this.earmarkedFundsItemNumber = earmarkedFundsItemNumber;
        }
    }

    class POAccountX{
        // POAccountX Data
        private String poItem = ITEM_NUMBER;
        private String serialNum = SERIAL_4_ACCOUNTS;
        private String poItemAccountX = SAP_TRUE,
                createDateAccountX = SAP_TRUE,
                quantityAccountX = SAP_TRUE,
                glAccountX = SAP_TRUE,
                costCenterX = SAP_TRUE;

        public String getPoItem() {
            return poItem;
        }

        public void setPoItem(String poItem) {
            this.poItem = poItem;
        }

        public String getSerialNum() {  return serialNum;   }

        public void setSerialNum(String serialNum) {
            this.serialNum = serialNum;
        }

        public String getPoItemAccountX() {  return poItemAccountX;    }

        public void setPoItemAccountX(String poItemAccountX) {
            this.poItemAccountX = poItemAccountX;
        }

        public String getCreateDateAccountX() {
            return createDateAccountX;
        }

        public void setCreateDateAccountX(String createDateAccountX) {
            this.createDateAccountX = createDateAccountX;
        }

        public String getQuantityAccountX() {
            return quantityAccountX;
        }

        public void setQuantityAccountX(String quantityAccountX) {
            this.quantityAccountX = quantityAccountX;
        }

        public String getGlAccountX() {
            return glAccountX;
        }

        public void setGlAccountX(String glAccountX) {
            this.glAccountX = glAccountX;
        }

        public String getCostCenterX() {
            return costCenterX;
        }

        public void setCostCenterX(String costCenterX) {
            this.costCenterX = costCenterX;
        }

    }



}
