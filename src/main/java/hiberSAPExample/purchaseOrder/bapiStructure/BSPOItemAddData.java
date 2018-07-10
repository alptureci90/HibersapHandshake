package hiberSAPExample.purchaseOrder.bapiStructure;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * PO_ITEM_ADD_DATA STRUCTURE  BAPIEKPOA OPTIONAL
 */

@BapiStructure
public class BSPOItemAddData {

    // Indicator: Update Info Record
    @Parameter("INFO_UPD")
    private String infoUpd;

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
    @Parameter("OVERDELTOL")
    private BigDecimal overDelTolerance;

    // Indicator: Unlimited Overdelivery Allowed
    @Parameter("UNLIMITED")
    private String unlimited;

    // Underdelivery Tolerance Limit
    @Parameter("UNDER_TOL")
    private BigDecimal underTolerance;

    // Goods Receipt Indicator
    @Parameter("GR_IND")
    private String grInd;

    // Goods Receipt, Non-Valuated
    @Parameter("GR_NON_VAL")
    private String grNonVal;

    // Invoice receipt indicator
    @Parameter("IR_IND")
    private String irInd;

    // "Delivery Completed" Indicator
    @Parameter("DEL_COMPL")
    private String deliveryCompleted;

    // Final Invoice Indicator
    @Parameter("FINAL_INV")
    private String finalInv;

    // Business Transaction Type for Foreign Trade
    @Parameter("BUS_TRANST")
    private String busTranst;

    // Export/Import procedure for foreign trade (5 digits)
    @Parameter("EXPIMPPROC")
    private String expImpProcedure;

    // Commodity Code/Import Code Number for Foreign Trade
    @Parameter("COMM_CODE")
    private String commCode;

    // Region of Origin of Material (Non-Preferential Origin)
    @Parameter("REG_ORIGIN")
    private String regOfOrigin;

    // Country of Origin of Material (Non-Preferential Origin)
    @Parameter("COUNT_ORIG")
    private String countryOfOrigin;

    // Item Number of Purchasing Document
    @Parameter("PO_ITEM")
    private String poItem;

    public String getInfoUpd() {
        return infoUpd;
    }

    public void setInfoUpd(String infoUpd) {
        this.infoUpd = infoUpd;
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

    public BigDecimal getOverDelTolerance() {
        return overDelTolerance;
    }

    public void setOverDelTolerance(BigDecimal overDelTolerance) {
        this.overDelTolerance = overDelTolerance;
    }

    public String getUnlimited() {
        return unlimited;
    }

    public void setUnlimited(String unlimited) {
        this.unlimited = unlimited;
    }

    public BigDecimal getUnderTolerance() {
        return underTolerance;
    }

    public void setUnderTolerance(BigDecimal underTolerance) {
        this.underTolerance = underTolerance;
    }

    public String getGrInd() {
        return grInd;
    }

    public void setGrInd(String grInd) {
        this.grInd = grInd;
    }

    public String getGrNonVal() {
        return grNonVal;
    }

    public void setGrNonVal(String grNonVal) {
        this.grNonVal = grNonVal;
    }

    public String getIrInd() {
        return irInd;
    }

    public void setIrInd(String irInd) {
        this.irInd = irInd;
    }

    public String getDeliveryCompleted() {
        return deliveryCompleted;
    }

    public void setDeliveryCompleted(String deliveryCompleted) {
        this.deliveryCompleted = deliveryCompleted;
    }

    public String getFinalInv() {
        return finalInv;
    }

    public void setFinalInv(String finalInv) {
        this.finalInv = finalInv;
    }

    public String getBusTranst() {
        return busTranst;
    }

    public void setBusTranst(String busTranst) {
        this.busTranst = busTranst;
    }

    public String getExpImpProcedure() {
        return expImpProcedure;
    }

    public void setExpImpProcedure(String expImpProcedure) {
        this.expImpProcedure = expImpProcedure;
    }

    public String getCommCode() {
        return commCode;
    }

    public void setCommCode(String commCode) {
        this.commCode = commCode;
    }

    public String getRegOfOrigin() {
        return regOfOrigin;
    }

    public void setRegOfOrigin(String regOfOrigin) {
        this.regOfOrigin = regOfOrigin;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getPoItem() {
        return poItem;
    }

    public void setPoItem(String poItem) {
        this.poItem = poItem;
    }
}
