package hiberSAPExample.purchaseOrder.bapiPOCreate1.bapiStructure;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  VALUE(POHEADER) LIKE  BAPIMEPOHEADER STRUCTURE  BAPIMEPOHEADER
 */

@BapiStructure
public class BSPOHeader {

    // Purchasing Document Number
    @Parameter("PO_NUMBER")
    private String poNumber;

    // Company Code
    @Parameter("COMP_CODE")
    private String compCode;

    // Purchasing Document Type
    @Parameter("DOC_TYPE")
    private String docType;


    // Deletion Indicator in Purchasing Document
    @Parameter("DELETE_IND")
    private String deletionInd;

    // Status of Purchasing Document
    @Parameter("STATUS")
    private String status;

    // Date on Which Record Was Created
    @Parameter("CREAT_DATE")
    private Date createDate;

    // Name of Person who Created the Object
    @Parameter("CREATED_BY")
    private String createdBy;


    // Item Number Interval
    @Parameter("ITEM_INTVL")
    private String itemNumberInterval;

    // vendor Account Number
    @Parameter("VENDOR")
    private String vendor;

    // Language Key
    @Parameter("LANGU")
    private String languageKey;

    // ISO code for language key
    @Parameter("LANGU_ISO")
    private String languageISO;

    // Terms of Payment Key
    @Parameter("PMNTTRMS")
    private String paymentTerms;

    // Cash (Prompt Payment) Discount Days
    @Parameter("DSCNT1_TO")
    private BigDecimal discountDays1;

    // Cash (Prompt Payment) Discount Days
    @Parameter("DSCNT2_TO")
    private BigDecimal discountDays2;

    // Cash (Prompt Payment) Discount Days
    @Parameter("DSCNT3_TO")
    private BigDecimal discountDays3;

    // Cash Discount Percentage 1
    @Parameter("DSCT_PCT1")
    private BigDecimal discountPercentage1;

    // Cash Discount Percentage 2
    @Parameter("DSCT_PCT2")
    private BigDecimal discountPercentage2;

    // Purchasing Organization
    @Parameter("PURCH_ORG")
    private String purchOrg;

    // Purchasing Group
    @Parameter("PUR_GROUP")
    private String purchGroup;

    // Currency Key
    @Parameter("CURRENCY")
    private String currency;

    // ISO code currency
    @Parameter("CURRENCY_ISO")
    private String currencyISO;

    // Exchange Rate
    @Parameter("EXCH_RATE")
    private BigDecimal exchangeRate;

    // Indicator: Fixing of Exchange Rate
    @Parameter("EX_RATE_FX")
    private String exchangeRateIndicator;

    // Purchasing Document Date
    @Parameter("DOC_DATE")
    private Date docDate;

    // Start of Validity Period
    @Parameter("VPER_START")
    private Date validityPeriodStart;

    // End of Validity Period
    @Parameter("VPER_END")
    private Date validityPeriodEnd;

    // Warranty Date
    @Parameter("WARRANTY")
    private Date warrantyDate;

    // Quotation Number
    @Parameter("QUOTATION")
    private String quotation;

    // Quotation Submission Date
    @Parameter("QUOT_DATE")
    private Date quotationSubmissionDate;

    // Your Reference
    @Parameter("REF_1")
    private String yourReference;

    // Responsible Salesperson at vendor's Office
    @Parameter("SALES_PERS")
    private String salesPerson;

    // ...
    // ...
    // ...

    // Item Number Interval for Subitems
    @Parameter("SUBITEMINT")
    private String subItemInterval;

    // ...
    // ...
    // ...

    // Reason for Cancellation
    @Parameter("REASON_CANCEL")
    private String cancelationReason;

    // ...
    // ...
    // ...

    // Retention in Percent
    @Parameter("RETENTION_PERCENTAGE")
    private BigDecimal retentionPercentage;

    // ...
    // ...
    // ...

    // Down Payment Amount in BAPI
    @Parameter("DOWNPAY_AMOUNT")
    private BigDecimal downPaymentAmount;

    // Down Payment Percentage
    @Parameter("DOWNPAY_PERCENT")
    private BigDecimal downPaymentPercentage;


    // === GETTER & SETTER === //

    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }

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

    public String getDeletionInd() {
        return deletionInd;
    }

    public void setDeletionInd(String deletionInd) {
        this.deletionInd = deletionInd;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getItemNumberInterval() {
        return itemNumberInterval;
    }

    public void setItemNumberInterval(String itemNumberInterval) {
        this.itemNumberInterval = itemNumberInterval;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getLanguageKey() {
        return languageKey;
    }

    public void setLanguageKey(String languageKey) {
        this.languageKey = languageKey;
    }

    public String getLanguageISO() {
        return languageISO;
    }

    public void setLanguageISO(String languageISO) {
        this.languageISO = languageISO;
    }

    public String getPaymentTerms() {
        return paymentTerms;
    }

    public void setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms;
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

    public String getCurrencyISO() {
        return currencyISO;
    }

    public void setCurrencyISO(String currencyISO) {
        this.currencyISO = currencyISO;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public String getExchangeRateIndicator() {
        return exchangeRateIndicator;
    }

    public void setExchangeRateIndicator(String exchangeRateIndicator) {
        this.exchangeRateIndicator = exchangeRateIndicator;
    }

    public Date getDocDate() {
        return docDate;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
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

    public Date getWarrantyDate() {
        return warrantyDate;
    }

    public void setWarrantyDate(Date warrantyDate) {
        this.warrantyDate = warrantyDate;
    }

    public String getQuotation() {
        return quotation;
    }

    public void setQuotation(String quotation) {
        this.quotation = quotation;
    }

    public Date getQuotationSubmissionDate() {
        return quotationSubmissionDate;
    }

    public void setQuotationSubmissionDate(Date quotationSubmissionDate) {
        this.quotationSubmissionDate = quotationSubmissionDate;
    }

    public String getYourReference() {
        return yourReference;
    }

    public void setYourReference(String yourReference) {
        this.yourReference = yourReference;
    }

    public String getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(String salesPerson) {
        this.salesPerson = salesPerson;
    }

    public String getSubItemInterval() {
        return subItemInterval;
    }

    public void setSubItemInterval(String subItemInterval) {
        this.subItemInterval = subItemInterval;
    }

    public String getCancelationReason() {
        return cancelationReason;
    }

    public void setCancelationReason(String cancelationReason) {
        this.cancelationReason = cancelationReason;
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
