package hiberSAPExample.invoice.bapiStructure;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

import java.math.BigDecimal;
import java.util.Date;

@BapiStructure
public class BSItemData {

    //Document Item in invoice Document
    @Parameter("INVOICE_DOC_ITEM")
    private String invoiceDocItem;

    //Purchase Order Number
    @Parameter("PO_NUMBER")
    private String poNumber;

    //Item Number of Purchasing Document
    @Parameter("PO_ITEM")
    private String poItem;

    //Document No. of a Reference Document
    @Parameter("REF_DOC")
    private String refDoc;

    //Fiscal Year of Current Period
    @Parameter("REF_DOC_YEAR")
    private String refDocYear;

    //Item of a Reference Document
    @Parameter("REF_DOC_IT")
    private String refDocItem;

    //Indicator: subsequent debit/credit
    @Parameter("DE_CRE_IND")
    private String debitCreditInd;

    //Tax Code
    @Parameter("TAX_CODE")
    private String taxCode;

    //Tax Jurisdiction
    @Parameter("TAXJURCODE")
    private String taxJurCode;

    //Amount in document currency
    @Parameter("ITEM_AMOUNT")
    private BigDecimal itemAmount;

    //Quantity
    @Parameter("QUANTITY")
    private BigDecimal quantity;

    //Purchase Order Unit of Measure
    @Parameter("PO_UNIT")
    private String poUnitOfMeasure;

    //Order unit in ISO code
    @Parameter("PO_UNIT_ISO")
    private String poUnitOfMeasureISO;

    //Quantity in Purchase Order Price Unit
    @Parameter("PO_PR_QNT")
    private BigDecimal quantityInPOPriceUnit;

    //Order Price Unit (Purchasing)
    @Parameter("PO_PR_UOM")
    private String orderPriceUnit;

    //Purchase order price unit in ISO code
    @Parameter("PO_PR_UOM_ISO")
    private String orderPriceUnitISO;

    //Condition Type
    @Parameter("COND_TYPE")
    private String conditionType;

    //Step number
    @Parameter("COND_ST_NO")
    private String conditionStepNum;

    //Condition counter
    @Parameter("COND_COUNT")
    private String conditionCounter;

    //Entry Sheet Number
    @Parameter("SHEET_NO")
    private String sheetNo;

    //Item Text
    @Parameter("ITEM_TEXT")
    private String itemText;

    //Final invoice Indicator
    @Parameter("FINAL_INV")
    private String finalInvoiceIndicator;

    //Line Number
    @Parameter("SHEET_ITEM")
    private String sheetItem;

    //Clearing Indicator for GR/IR Posting for External Services
    @Parameter("GRIR_CLEAR_SRV")
    private String clearingIndicatorForGR_IRPostingForExternalServices;

    //Account Number of vendor or Creditor
    @Parameter("FREIGHT_VEN")
    private String accNumOfVendOrCreditor;

    //Indicator: Line item not liable to cash discount?
    @Parameter("CSHDIS_IND")
    private String lineItemLiableIndicator;

    //Retention Amount in Document Currency
    @Parameter("Retention Amount in Document Currency")
    private String retentionAmountCurrencyType;

    //Retention in Percent
    @Parameter("RETENTION_PERCENTAGE")
    private BigDecimal retentionPercentage;

    //Due Date for Retention
    @Parameter("RETENTION_DUE_DATE")
    private Date retentionDueDate;

    //Item Not Relevant to Retention @Converter
    @Parameter("NO_RETENTION")
    private String noRetentionIndicator;

    //Valuation Type
    @Parameter("VALUATION_TYPE")
    private String valuationType;


    public String getInvoiceDocItem() {
        return invoiceDocItem;
    }

    public void setInvoiceDocItem(String invoiceDocItem) {
        this.invoiceDocItem = invoiceDocItem;
    }

    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }

    public String getPoItem() {
        return poItem;
    }

    public void setPoItem(String poItem) {
        this.poItem = poItem;
    }

    public String getRefDoc() {
        return refDoc;
    }

    public void setRefDoc(String refDoc) {
        this.refDoc = refDoc;
    }

    public String getRefDocYear() {
        return refDocYear;
    }

    public void setRefDocYear(String refDocYear) {
        this.refDocYear = refDocYear;
    }

    public String getRefDocItem() {
        return refDocItem;
    }

    public void setRefDocItem(String refDocItem) {
        this.refDocItem = refDocItem;
    }

    public String getDebitCreditInd() {
        return debitCreditInd;
    }

    public void setDebitCreditInd(String debitCreditInd) {
        this.debitCreditInd = debitCreditInd;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getTaxJurCode() {
        return taxJurCode;
    }

    public void setTaxJurCode(String taxJurCode) {
        this.taxJurCode = taxJurCode;
    }

    public BigDecimal getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(BigDecimal itemAmount) {
        this.itemAmount = itemAmount;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public String getPoUnitOfMeasure() {
        return poUnitOfMeasure;
    }

    public void setPoUnitOfMeasure(String poUnitOfMeasure) {
        this.poUnitOfMeasure = poUnitOfMeasure;
    }

    public String getPoUnitOfMeasureISO() {
        return poUnitOfMeasureISO;
    }

    public void setPoUnitOfMeasureISO(String poUnitOfMeasureISO) {
        this.poUnitOfMeasureISO = poUnitOfMeasureISO;
    }

    public BigDecimal getQuantityInPOPriceUnit() {
        return quantityInPOPriceUnit;
    }

    public void setQuantityInPOPriceUnit(BigDecimal quantityInPOPriceUnit) {
        this.quantityInPOPriceUnit = quantityInPOPriceUnit;
    }

    public String getOrderPriceUnit() {
        return orderPriceUnit;
    }

    public void setOrderPriceUnit(String orderPriceUnit) {
        this.orderPriceUnit = orderPriceUnit;
    }

    public String getOrderPriceUnitISO() {
        return orderPriceUnitISO;
    }

    public void setOrderPriceUnitISO(String orderPriceUnitISO) {
        this.orderPriceUnitISO = orderPriceUnitISO;
    }

    public String getConditionType() {
        return conditionType;
    }

    public void setConditionType(String conditionType) {
        this.conditionType = conditionType;
    }

    public String getConditionStepNum() {
        return conditionStepNum;
    }

    public void setConditionStepNum(String conditionStepNum) {
        this.conditionStepNum = conditionStepNum;
    }

    public String getConditionCounter() {
        return conditionCounter;
    }

    public void setConditionCounter(String conditionCounter) {
        this.conditionCounter = conditionCounter;
    }

    public String getSheetNo() {
        return sheetNo;
    }

    public void setSheetNo(String sheetNo) {
        this.sheetNo = sheetNo;
    }

    public String getItemText() {
        return itemText;
    }

    public void setItemText(String itemText) {
        this.itemText = itemText;
    }

    public String getFinalInvoiceIndicator() {
        return finalInvoiceIndicator;
    }

    public void setFinalInvoiceIndicator(String finalInvoiceIndicator) {
        this.finalInvoiceIndicator = finalInvoiceIndicator;
    }

    public String getSheetItem() {
        return sheetItem;
    }

    public void setSheetItem(String sheetItem) {
        this.sheetItem = sheetItem;
    }

    public String getClearingIndicatorForGR_IRPostingForExternalServices() {
        return clearingIndicatorForGR_IRPostingForExternalServices;
    }

    public void setClearingIndicatorForGR_IRPostingForExternalServices(String clearingIndicatorForGR_IRPostingForExternalServices) {
        this.clearingIndicatorForGR_IRPostingForExternalServices = clearingIndicatorForGR_IRPostingForExternalServices;
    }

    public String getAccNumOfVendOrCreditor() {
        return accNumOfVendOrCreditor;
    }

    public void setAccNumOfVendOrCreditor(String accNumOfVendOrCreditor) {
        this.accNumOfVendOrCreditor = accNumOfVendOrCreditor;
    }

    public String getLineItemLiableIndicator() {
        return lineItemLiableIndicator;
    }

    public void setLineItemLiableIndicator(String lineItemLiableIndicator) {
        this.lineItemLiableIndicator = lineItemLiableIndicator;
    }

    public String getRetentionAmountCurrencyType() {
        return retentionAmountCurrencyType;
    }

    public void setRetentionAmountCurrencyType(String retentionAmountCurrencyType) {
        this.retentionAmountCurrencyType = retentionAmountCurrencyType;
    }

    public BigDecimal getRetentionPercentage() {
        return retentionPercentage;
    }

    public void setRetentionPercentage(BigDecimal retentionPercentage) {
        this.retentionPercentage = retentionPercentage;
    }

    public Date getRetentionDueDate() {
        return retentionDueDate;
    }

    public void setRetentionDueDate(Date retentionDueDate) {
        this.retentionDueDate = retentionDueDate;
    }

    public String getNoRetentionIndicator() {
        return noRetentionIndicator;
    }

    public void setNoRetentionIndicator(String noRetentionIndicator) {
        this.noRetentionIndicator = noRetentionIndicator;
    }

    public String getValuationType() {
        return valuationType;
    }

    public void setValuationType(String valuationType) {
        this.valuationType = valuationType;
    }
}
