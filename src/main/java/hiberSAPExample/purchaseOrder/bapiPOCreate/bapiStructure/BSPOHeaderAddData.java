package hiberSAPExample.purchaseOrder.bapiPOCreate.bapiStructure;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * PO_HEADER_ADD_DATA
 */
@BapiStructure
public class BSPOHeaderAddData {

    // Payment Terms
    @Parameter("PMNTTRMS")
    private String pmnttrms;

    // Cash Discount Days 1
    @Parameter("DSCNT1_TO")
    private BigDecimal cashDiscount1;

    // Cash Discount Days 2
    @Parameter("DSCNT2_TO")
    private BigDecimal cashDiscount2;

    // Cash Discount Days 3
    @Parameter("DSCNT3_TO")
    private BigDecimal cashDiscount3;

    // Cash Discount Percentage 1
    @Parameter("CASH_DISC1")
    private BigDecimal cashDiscountPercentage1;

    // Cash Discount Percentage 2
    @Parameter("CASH_DISC2")
    private BigDecimal cashDiscountPercentage2;

    // Created By
    @Parameter("CREATED_BY")
    private String createdBy;

    // Currency Key
    @Parameter("CURRENCY")
    private String currency;

    // Direct Quoted Exchange Rate
    @Parameter("EXCH_RATE")
    private BigDecimal exchRate;

    // Indicator: Fixing of Exchange Rate
    @Parameter("EX_RATE_FX")
    private String exRateFix;

    // Incoterms Part 1
    @Parameter("INCOTERMS1")
    private String incoTerms1;

    // Incoterms Part 2
    @Parameter("INCOTERMS2")
    private String incoTerms2;

    // Your reference
    @Parameter("REF_1")
    private String ref1;

    // Responsible Salesperson at vendor's Office
    @Parameter("SALES_PERS")
    private String salesPers;

    // vendor's Telephone Number
    @Parameter("TELEPHONE")
    private String telephone;

    // Mode of Transport for Foreign Trade
    @Parameter("TRNSP_MODE")
    private String transpMode;

    // Customs Office: Office of Exit/Entry for Foreign Trade
    @Parameter("CUSTOMS")
    private String customs;

    // Indirect Quoted Exchange Rate
    @Parameter("EXCH_RATE_CM")
    private BigDecimal exchRateCm;

    // Start of Validity Period
    @Parameter("VPER_START")
    private Date validityPeriodStart;

    // End of Validity Period
    @Parameter("VPER_END")
    private Date validityPeriodEnd;

    // Our Reference
    @Parameter("OUR_REF")
    private String ourReference;

    public String getPmnttrms() {
        return pmnttrms;
    }

    public void setPmnttrms(String pmnttrms) {
        this.pmnttrms = pmnttrms;
    }

    public BigDecimal getCashDiscount1() {
        return cashDiscount1;
    }

    public void setCashDiscount1(BigDecimal cashDiscount1) {
        this.cashDiscount1 = cashDiscount1;
    }

    public BigDecimal getCashDiscount2() {
        return cashDiscount2;
    }

    public void setCashDiscount2(BigDecimal cashDiscount2) {
        this.cashDiscount2 = cashDiscount2;
    }

    public BigDecimal getCashDiscount3() {
        return cashDiscount3;
    }

    public void setCashDiscount3(BigDecimal cashDiscount3) {
        this.cashDiscount3 = cashDiscount3;
    }

    public BigDecimal getCashDiscountPercentage1() {
        return cashDiscountPercentage1;
    }

    public void setCashDiscountPercentage1(BigDecimal cashDiscountPercentage1) {
        this.cashDiscountPercentage1 = cashDiscountPercentage1;
    }

    public BigDecimal getCashDiscountPercentage2() {
        return cashDiscountPercentage2;
    }

    public void setCashDiscountPercentage2(BigDecimal cashDiscountPercentage2) {
        this.cashDiscountPercentage2 = cashDiscountPercentage2;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getExchRate() {
        return exchRate;
    }

    public void setExchRate(BigDecimal exchRate) {
        this.exchRate = exchRate;
    }

    public String getExRateFix() {
        return exRateFix;
    }

    public void setExRateFix(String exRateFix) {
        this.exRateFix = exRateFix;
    }

    public String getIncoTerms1() {
        return incoTerms1;
    }

    public void setIncoTerms1(String incoTerms1) {
        this.incoTerms1 = incoTerms1;
    }

    public String getIncoTerms2() {
        return incoTerms2;
    }

    public void setIncoTerms2(String incoTerms2) {
        this.incoTerms2 = incoTerms2;
    }

    public String getRef1() {
        return ref1;
    }

    public void setRef1(String ref1) {
        this.ref1 = ref1;
    }

    public String getSalesPers() {
        return salesPers;
    }

    public void setSalesPers(String salesPers) {
        this.salesPers = salesPers;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTranspMode() {
        return transpMode;
    }

    public void setTranspMode(String transpMode) {
        this.transpMode = transpMode;
    }

    public String getCustoms() {
        return customs;
    }

    public void setCustoms(String customs) {
        this.customs = customs;
    }

    public BigDecimal getExchRateCm() {
        return exchRateCm;
    }

    public void setExchRateCm(BigDecimal exchRateCm) {
        this.exchRateCm = exchRateCm;
    }

    public Date getValidityPeriodStart() {
        return validityPeriodStart;
    }

    public void setValidityPeriodStart(Date validityPeriodStart) {
        this.validityPeriodStart = validityPeriodStart;
    }

    public Date getValidityPeriodEnd() {
        return validityPeriodEnd;
    }

    public void setValidityPeriodEnd(Date validityPeriodEnd) {
        this.validityPeriodEnd = validityPeriodEnd;
    }

    public String getOurReference() {
        return ourReference;
    }

    public void setOurReference(String ourReference) {
        this.ourReference = ourReference;
    }
}
