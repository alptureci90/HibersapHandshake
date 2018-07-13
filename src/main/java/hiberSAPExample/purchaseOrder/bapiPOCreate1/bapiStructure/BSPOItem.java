package hiberSAPExample.purchaseOrder.bapiPOCreate1.bapiStructure;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Convert;
import org.hibersap.annotations.Parameter;
import org.hibersap.conversion.BooleanConverter;

import java.math.BigDecimal;

/**
 * POITEM STRUCTURE  BAPIMEPOITEM OPTIONAL
 */

@BapiStructure
public class BSPOItem {

    // Item Number of Purchasing Document
    @Parameter("PO_ITEM")
    private String poItem;

    // Short Text
    @Parameter("SHORT_TEXT")
    private String shortText;

    // Article Number
    @Parameter("MATERIAL")
    private String material;

    // Site
    @Parameter("PLANT")
    private String plant;

    // Merchandise Category
    @Parameter("MATL_GROUP")
    private String materialGroup;

    // Number of Purchasing Info Record
    @Parameter("INFO_REC")
    private String infoRec;

    // Purchase Order Quantity
    @Parameter("QUANTITY")
    private BigDecimal quantity;

    // Purchase Order Unit of Measure
    @Parameter("PO_UNIT")
    private String unitOfMeasure;

    // Numerator for Conversion of Order Price Unit into Order Unit
    @Parameter("CONV_NUM1")
    private BigDecimal conversionNumerator;

    // Denominator for Conv. of Order Price Unit into Order Unit
    @Parameter("CONV_DEN1")
    private BigDecimal conversionDenumartor;

    // Currency amount for BAPIS (with 9 decimal places)
    @Parameter("NET_PRICE")
    private BigDecimal netPrice;

    // Price Unit
    @Parameter("PRICE_UNIT")
    private BigDecimal priceUnit;

    // Goods Receipt Processing Time in Days
    @Parameter("GR_PR_TIME")
    private BigDecimal goodsReceiptProcessingDays;

    // Number of Days for First Reminder/Expediter
    @Parameter("REMINDER1")
    private BigDecimal reminder1;

    // Number of Days for Second Reminder/Expediter
    @Parameter("REMINDER2")
    private BigDecimal reminder2;

    // Number of Days for Third Reminder/Expediter
    @Parameter("REMINDER3")
    private BigDecimal reminder3;

    // Overdelivery Tolerance Limit
    @Parameter("OVER_DLV_TOL")
    private BigDecimal overDeliveryLimit;

    // Underdelivery Tolerance Limit
    @Parameter("UNDER_DLV_TOL")
    private BigDecimal underDeliveryLimit;

    // "Delivery Completed" Indicator
    @Parameter("NO_MORE_GR")
    private String deliveryCompletedIndicator;

    // Account Assignment Category
    @Parameter("ACCTASSCAT")
    private String accountAssignmentCategory;

    // Item Number of Principal Purchase Agreement
    @Parameter("AGMT_ITEM")
    private String agreementItemNumber;

    // Planned Delivery Time in Days
    @Parameter("PLAN_DEL")
    private BigDecimal plannedDeliveryInDays;

    // Net Weight
    @Parameter("NET_WEIGHT")
    private BigDecimal netWeight;

    // Gross Weight
    @Parameter("GROSS_WT")
    private BigDecimal grossWeight;

    // Volume
    @Parameter("VOLUME")
    private BigDecimal volume;

    // Higher-Level Item in Purchasing Documents
    @Parameter("HL_ITEM")
    private String higherLevelItem;

    // Number of Points
    @Parameter("POINTS")
    private BigDecimal points;

    // Minimum Remaining Shelf Life
    @Parameter("MINREMLIFE")
    private BigDecimal minRemaningShelfLife;

    // Item Number of RFQ
    @Parameter("RFQ_ITEM")
    private String rfqItem;

    // Item Number of Purchase Requisition
    @Parameter("PREQ_ITEM")
    private String preqItem;

    // Item of reference document
    @Parameter("REF_ITEM")
    private String refItem;

    // Period Indicator for Shelf Life Expiration Date
    @Parameter("PERIOD_IND_EXPIRATION_DATE")
    private String expirationDateRemainder;


    public String getPoItem() {
        return poItem;
    }

    public void setPoItem(String poItem) {
        this.poItem = poItem;
    }

    public String getShortText() {
        return shortText;
    }

    public void setShortText(String shortText) {
        this.shortText = shortText;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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

    public String getInfoRec() {
        return infoRec;
    }

    public void setInfoRec(String infoRec) {
        this.infoRec = infoRec;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public BigDecimal getConversionNumerator() {
        return conversionNumerator;
    }

    public void setConversionNumerator(BigDecimal conversionNumerator) {
        this.conversionNumerator = conversionNumerator;
    }

    public BigDecimal getConversionDenumartor() {
        return conversionDenumartor;
    }

    public void setConversionDenumartor(BigDecimal conversionDenumartor) {
        this.conversionDenumartor = conversionDenumartor;
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

    public BigDecimal getGoodsReceiptProcessingDays() {
        return goodsReceiptProcessingDays;
    }

    public void setGoodsReceiptProcessingDays(BigDecimal goodsReceiptProcessingDays) {
        this.goodsReceiptProcessingDays = goodsReceiptProcessingDays;
    }

    public BigDecimal getReminder1() {
        return reminder1;
    }

    public void setReminder1(BigDecimal reminder1) {
        this.reminder1 = reminder1;
    }

    public BigDecimal getReminder2() {
        return reminder2;
    }

    public void setReminder2(BigDecimal reminder2) {
        this.reminder2 = reminder2;
    }

    public BigDecimal getReminder3() {
        return reminder3;
    }

    public void setReminder3(BigDecimal reminder3) {
        this.reminder3 = reminder3;
    }

    public BigDecimal getOverDeliveryLimit() {
        return overDeliveryLimit;
    }

    public void setOverDeliveryLimit(BigDecimal overDeliveryLimit) {
        this.overDeliveryLimit = overDeliveryLimit;
    }

    public BigDecimal getUnderDeliveryLimit() {
        return underDeliveryLimit;
    }

    public void setUnderDeliveryLimit(BigDecimal underDeliveryLimit) {
        this.underDeliveryLimit = underDeliveryLimit;
    }

    public String getDeliveryCompletedIndicator() {
        return deliveryCompletedIndicator;
    }

    public void setDeliveryCompletedIndicator(String deliveryCompletedIndicator) {
        this.deliveryCompletedIndicator = deliveryCompletedIndicator;
    }

    public String getAccountAssignmentCategory() {
        return accountAssignmentCategory;
    }

    public void setAccountAssignmentCategory(String accountAssignmentCategory) {
        this.accountAssignmentCategory = accountAssignmentCategory;
    }

    public String getAgreementItemNumber() {
        return agreementItemNumber;
    }

    public void setAgreementItemNumber(String agreementItemNumber) {
        this.agreementItemNumber = agreementItemNumber;
    }

    public BigDecimal getPlannedDeliveryInDays() {
        return plannedDeliveryInDays;
    }

    public void setPlannedDeliveryInDays(BigDecimal plannedDeliveryInDays) {
        this.plannedDeliveryInDays = plannedDeliveryInDays;
    }

    public BigDecimal getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(BigDecimal netWeight) {
        this.netWeight = netWeight;
    }

    public BigDecimal getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(BigDecimal grossWeight) {
        this.grossWeight = grossWeight;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public String getHigherLevelItem() {
        return higherLevelItem;
    }

    public void setHigherLevelItem(String higherLevelItem) {
        this.higherLevelItem = higherLevelItem;
    }

    public BigDecimal getPoints() {
        return points;
    }

    public void setPoints(BigDecimal points) {
        this.points = points;
    }

    public BigDecimal getMinRemaningShelfLife() {
        return minRemaningShelfLife;
    }

    public void setMinRemaningShelfLife(BigDecimal minRemaningShelfLife) {
        this.minRemaningShelfLife = minRemaningShelfLife;
    }

    public String getRfqItem() {
        return rfqItem;
    }

    public void setRfqItem(String rfqItem) {
        this.rfqItem = rfqItem;
    }

    public String getPreqItem() {
        return preqItem;
    }

    public void setPreqItem(String preqItem) {
        this.preqItem = preqItem;
    }

    public String getRefItem() {
        return refItem;
    }

    public void setRefItem(String refItem) {
        this.refItem = refItem;
    }

    public String getExpirationDateRemainder() {
        return expirationDateRemainder;
    }

    public void setExpirationDateRemainder(String expirationDateRemainder) {
        this.expirationDateRemainder = expirationDateRemainder;
    }
}
