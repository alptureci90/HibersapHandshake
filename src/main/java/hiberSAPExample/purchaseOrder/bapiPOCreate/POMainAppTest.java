package hiberSAPExample.purchaseOrder.bapiPOCreate;

import hiberSAPExample.purchaseOrder.bapiPOCreate.bapiStructure.*;
import hiberSAPExample.sapSessionManager.SAPSessionManager;
import org.hibersap.session.Session;
import org.hibersap.session.SessionManager;

import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * DON'T USE THIS = OBSELETE!!!!
 * @link: /bapiPOCreate1.MainPOAppTest.java
 *
 */

public class POMainAppTest {

    public static void main(String[] args){
        POMainAppTest test = new POMainAppTest();
        test.createPO();

    }

    public void createPO(){

        PO po = new PO();


        // PARAMETER: POHEADER

        BSPOHeader header = new BSPOHeader();

        header.setCoCode(po.getCompCode());
        header.setDocType(po.getDocType());
        header.setDocDate(po.getDocDate());
        header.setCreatedBy(po.getCreatedBy());
        header.setVendor(po.getVendor());
        header.setPurchOrg(po.getPurchOrg());
        header.setPurGroup(po.getPurGroup());


        // PARAMETER: POHEADERX
        // BSPOHeaderAddData headerAddData =  new BSPOHeaderAddData();

        // PARAMETER: POITEM

        BSPOItems item = new BSPOItems();

        item.setPoItem(po.getPoItem());
        item.setMaterial(po.getMaterial());
        item.setMaterialNum(po.getMaterial());
        item.setShortText(po.getShortText());
        item.setPlant(po.getPlant());
        item.setMatGroup(po.getMaterialGroup());
        item.setDispQuan(po.getQuan());
        item.setUnit(po.getPoUnit());
        item.setConversionNumerator1(po.getConversionNumerator());
        item.setConversionDenominator1(po.getConversionDenumerator());
        item.setNetPrice(po.getNetPrice());
        item.setPriceUnit(po.getPriceUnit());
        item.setAccountAssignment(po.accountAssignment);

        List<BSPOItems> itemsList = new LinkedList<>();
        itemsList.add(item);


        // PARAMETER: POACCOUNT

        BSPOItemAccountAssignment itemAccountAssignment = new BSPOItemAccountAssignment();

        itemAccountAssignment.setPoItem(po.getPoItem());
        itemAccountAssignment.setSerialNo(po.getSerial());
        itemAccountAssignment.setQuantity(po.getQuan());
        itemAccountAssignment.setDistrPerc(po.getDistPercentage());
        itemAccountAssignment.setGlAccountNumber(po.getGlAccount());
        itemAccountAssignment.setCostCenter(po.getCostCenter());


        // PARAMETER: POITEMSCHEDULE

        BSPOItemSchedules itemSchedules = new BSPOItemSchedules();
        itemSchedules.setPoItem(po.getPoItem());
        itemSchedules.setQuantity(new BigDecimal(10));

        List<BSPOItemAccountAssignment> itemAccountAssignmentList = new LinkedList<>();
        itemAccountAssignmentList.add(itemAccountAssignment);


        try {

           PurchaseOrderCreate poCreate = new PurchaseOrderCreate();

           poCreate.setPoHeader(header);
           poCreate.setBspoItems(itemsList);
           poCreate.setBspoItemAccountAssignment(itemAccountAssignmentList);

           SAPSessionManager.executeSession(poCreate);

        } catch (Exception e){
            System.out.println("Exception in BAPI_PO_CREATE execute statement!");
            e.printStackTrace();
        }

    }

    private void showCreatePOResult(PurchaseOrderCreate poCreateResult){
        System.out.println(poCreateResult.getBapiRet2().get(0).getMessage());
    }

    class PO {


        // PARAMETER: POHEADER

        private String compCode = "8800";
        private String docType = "NB";
        private Date createdDate = new Date();
        private String createdBy = "ECC1116";

        // private String itemInterval = "0000001000" // or else?
        private String vendor = "AIR2VEND";
        private String paymentTerms = "0001";
        private String purchOrg = "8800";
        private String purGroup = "880";
        private String currency = "USD";
        private Date docDate = new Date();

        // PARAMETER: POHEADERX

        private String compCodeX = "X";
        private String docTypeX = "X";
        private String itemIntervalX = "X";
        private String vendorX = "X";
        private String paymentTermsX = "X";
        private String purchOrgX = "X";
        private String purGroupX = "X";

        // PARAMETER: POITEM

        private String poItem = "00010";
        private String material = "AIR2ART"; //in retail this is 'article'
        private String shortText = "AI RETAIL ARTICLE NO.2";
        private String plant = "8800"; // in retail this is 'Site'
        private String materialGroup = "00710";
        private BigDecimal quantity = new BigDecimal(10);
        private String poUnit = "UN";
        private BigDecimal conversionNumerator = new BigDecimal(0);
        private BigDecimal conversionDenumerator = new BigDecimal(0);
        private BigDecimal netPrice = new BigDecimal(444);
        private BigDecimal priceUnit = new BigDecimal(1);
        // private String noMoreGr = "X";
        private String accountAssignment = "K";
        // Item number of principal purchase agreement
        //private String agmtItem = "00000";


        // PARAMETER: POACCOUNT
        private String poItem1 = "00010";
        private String serial = "00";
        private Date createDate = new Date();
        private BigDecimal quan = new BigDecimal(10);
        private BigDecimal distPercentage = new BigDecimal(0);
        private BigDecimal netValue = new BigDecimal(0);
        private String glAccount = "770100020";
        private String costCenter = "8800";

        // ============= GETTER & SETTER ============== //


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

        public String getVendor() {
            return vendor;
        }

        public void setVendor(String vendor) {
            this.vendor = vendor;
        }

        public String getPaymentTerms() {
            return paymentTerms;
        }

        public void setPaymentTerms(String paymentTerms) {
            this.paymentTerms = paymentTerms;
        }

        public String getPurchOrg() {
            return purchOrg;
        }

        public void setPurchOrg(String purchOrg) {
            this.purchOrg = purchOrg;
        }

        public String getPurGroup() {
            return purGroup;
        }

        public void setPurGroup(String purGroup) {
            this.purGroup = purGroup;
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

        public String getItemIntervalX() {
            return itemIntervalX;
        }

        public void setItemIntervalX(String itemIntervalX) {
            this.itemIntervalX = itemIntervalX;
        }

        public String getVendorX() {
            return vendorX;
        }

        public void setVendorX(String vendorX) {
            this.vendorX = vendorX;
        }

        public String getPaymentTermsX() {
            return paymentTermsX;
        }

        public void setPaymentTermsX(String paymentTermsX) {
            this.paymentTermsX = paymentTermsX;
        }

        public String getPurchOrgX() {
            return purchOrgX;
        }

        public void setPurchOrgX(String purchOrgX) {
            this.purchOrgX = purchOrgX;
        }

        public String getPurGroupX() {
            return purGroupX;
        }

        public void setPurGroupX(String purGroupX) {
            this.purGroupX = purGroupX;
        }

        public String getPoItem() {
            return poItem;
        }

        public void setPoItem(String poItem) {
            this.poItem = poItem;
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public String getShortText() {
            return shortText;
        }

        public void setShortText(String shortText) {
            this.shortText = shortText;
        }

        public String getPlant() {
            return plant;
        }

        public void setPlant(String plant) {
            this.plant = plant;
        }

        public String getMaterialGroup() {
            return materialGroup;
        }

        public void setMaterialGroup(String materialGroup) {
            this.materialGroup = materialGroup;
        }

        public BigDecimal getQuantity() {
            return quantity;
        }

        public void setQuantity(BigDecimal quantity) {
            this.quantity = quantity;
        }

        public String getPoUnit() {
            return poUnit;
        }

        public void setPoUnit(String poUnit) {
            this.poUnit = poUnit;
        }

        public BigDecimal getConversionNumerator() {
            return conversionNumerator;
        }

        public void setConversionNumerator(BigDecimal conversionNumerator) {
            this.conversionNumerator = conversionNumerator;
        }

        public BigDecimal getConversionDenumerator() {
            return conversionDenumerator;
        }

        public void setConversionDenumerator(BigDecimal conversionDenumerator) {
            this.conversionDenumerator = conversionDenumerator;
        }

        public BigDecimal getNetPrice() {
            return netPrice;
        }

        public void setNetPrice(BigDecimal netPrice) {
            this.netPrice = netPrice;
        }

        public BigDecimal getPriceUnit() {
            return priceUnit;
        }

        public void setPriceUnit(BigDecimal priceUnit) {
            this.priceUnit = priceUnit;
        }

        public String getAccountAssignment() {
            return accountAssignment;
        }

        public void setAccountAssignment(String accountAssignment) {
            this.accountAssignment = accountAssignment;
        }

        public String getPoItem1() {
            return poItem1;
        }

        public void setPoItem1(String poItem1) {
            this.poItem1 = poItem1;
        }

        public String getSerial() {
            return serial;
        }

        public void setSerial(String serial) {
            this.serial = serial;
        }

        public Date getCreateDate() {
            return createDate;
        }

        public void setCreateDate(Date createDate) {
            this.createDate = createDate;
        }

        public BigDecimal getQuan() {
            return quan;
        }

        public void setQuan(BigDecimal quan) {
            this.quan = quan;
        }

        public BigDecimal getDistPercentage() {
            return distPercentage;
        }

        public void setDistPercentage(BigDecimal distPercentage) {
            this.distPercentage = distPercentage;
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
    }


}
