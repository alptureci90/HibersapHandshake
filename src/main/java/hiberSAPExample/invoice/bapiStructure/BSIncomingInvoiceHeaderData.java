package hiberSAPExample.invoice.bapiStructure;


import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * This Class if for BAPI_INCINV_CREATE_HEADER BapiStructure
 *
 * @link: https://sapmm.wordpress.com/2010/03/14/fu-bapi_incominginvoice_create/
 *
 */

@BapiStructure
public class BSIncomingInvoiceHeaderData {

    public BSIncomingInvoiceHeaderData(){

    }

    public BSIncomingInvoiceHeaderData(Date docDate, Date pstngDate, String compCode, String currency){
        this.docDate = docDate;
        this.pstngDate = pstngDate;
        this.compCode = compCode;
        this.currency = currency;
    }

    /**
     * Indicator: Post invoice
     */
    @Parameter("INVOICE_IND")
    private String invoiceInd;

    /**
     * Indicator: Document Type
     */
    @Parameter("DOC_TYPE")
    private String docType;

    /**
     * Indicator: Document Date in the Document
     */
    @Parameter("DOC_DATE")
    private Date docDate;

    /**
     * Indicator: Posting Date in the Document
     */
    @Parameter("PSTNG_DATE")
    private Date pstngDate;


    /**
     * Reference Document Number
     */
    @Parameter("REF_DOC_NO")
    private String refDocNo;

    /**
     * Company Code
     */
    @Parameter("COMP_CODE")
    private String compCode;

    /**
     * Different Invoicing Party
     */
    @Parameter("DIFF_INV")
    private String diffInv;

    /**
     * Currency Key
     */
    @Parameter("CURRENCY")
    private String currency;

    /**
     * ISO Currency Code
     */
    @Parameter("CURRENCY_ISO")
    private String currencyISO;

    /**
     * Direct Quoted Exchange Rate
     */
    @Parameter("EXCH_RATE")
    private BigDecimal exchRate;

    /**
     * Indirect Quoted Exchange Rate
     */
    @Parameter("EXCH_RATE_V")
    private BigDecimal exchRateV;

    /**
     * Gross invoice Amount in Document Currency
     */
    @Parameter("GROSS_AMOUNT")
    private BigDecimal grossAmount;

    /**
     * Calculate Tax Automatically
     */
    @Parameter("CALC_TAX_IND")
    private String calcTaxInd;

    /**
     * Terms of Payment Key
     */
    @Parameter("PMNTTRMS")
    private String pmntTrms;

    /**
     * Baseline Date for Due Date Calculation
     */
    @Parameter("BLINE_DATE")
    private Date blineDate;

    /**
     * Cash Discount Days 1
     */
    @Parameter("DSCT_DAYS1")
    private BigDecimal dsctDays1;

    /**
     * Cash Discount Days 2
     */
    @Parameter("DSCT_DAYS2")
    private BigDecimal dsctDays2;

    /**
     * Net Payment Terms Period
     */
    @Parameter("NETTERMS")
    private BigDecimal netTerms;

    /**
     * Cash Discount Percentage 1
     */
    @Parameter("DSCT_PCT1")
    private BigDecimal dsctPct1;

    /**
     * Cash Discount Percentage 2
     */
    @Parameter("DSCT_PCT2")
    private BigDecimal dsctPct2;

    /**
     * Origin of a Logistics invoice Verification Document
     */
    @Parameter("IV_CATEGORY")
    private String ivCategory;

    /**
     * Document Header Text
     */
    @Parameter("HEADER_TXT")
    private String headerTxt;

    /**
     * Payment Block Key
     */
    @Parameter("PMNT_BLOCK")
    private String pmntBlock;

    /**
     * Unplanned Delivery Costs
     */
    @Parameter("DEL_COSTS")
    private BigDecimal delCosts;

    /**
     * Tax Code for Delivery Costs
     */
    @Parameter("DEL_COSTS_TAXC")
    private String delCostsTaxC;

    /**
     * Jurisdiction Code for delivery costs
     */
    @Parameter("DEL_COSTS_TAXJ")
    private String delCostsTaxJ;

    /**
     * Entered by external system user.
     */
    @Parameter("PERSON_EXT")
    private String personExt;

    /**
     * Payment Method
     */
    @Parameter("PYMT_METH")
    private String pymtMeth;

    /**
     *vPayment Method Supplement
     */
    @Parameter("PMTMTHSUPL")
    private String pmtMthSup;

    /**
     * Document Number of an invoice Document
     */
    @Parameter("INV_DOC_NO")
    private String invDocNo;

    /**
     * State Central Bank Indicator
     */
    @Parameter("SCBANK_IND")
    private String scBankInd;

    /**
     * Supplying Country
     */
    @Parameter("SUPCOUNTRY")
    private String supCountry;


    /**
     * Service Indicator (Foreign Payment)
     */
    @Parameter("BLLSRV_IND")
    private String bllSrvInd;

    /**
     * Reference Document Number ( for dependencies see long text!)
     */
    @Parameter("REF_DOC_NO_LONG")
    private String refDocNoLong;

    /**
     * Casch Doscount Amount in Document Currency
     */
    @Parameter("DSCT_AMOUNT")
    private BigDecimal dsctAmount;

    /**
     * ISR Subscriber Number
     */
    @Parameter("PO_SUB_NO")
    private String poSubNo;

    /**
     * ISR Check Debit
     */
    @Parameter("PO_CHECKDG")
    private String poCheckDg;

    /**
     * ISR Reference Number
     */
    @Parameter("PO_REF_NO")
    private String poRefNo;

    /**
     * Payee / Payer
     */
    @Parameter("PAYEE_PAYER")
    private String payeePayer;

    /**
     * Partner Bank Type
     */
    @Parameter("PARTNER_BK")
    private String partnerBK;

    /**
     * Short Key for a House Bank
     */
    @Parameter("HOUSEBANKID")
    private String houseBankId;

    //==============================

    /**
     * @help: Assignment Number
     */
    @Parameter("ALLOC_NMBR")
    private String allocNmbr;

    /**
     * Payment Reference
     */
    @Parameter("PAYMT_REF")
    private String paymtRef;

    /**
     * invoice Reference: Document Number for invoice Reference
     */
    @Parameter("INV_REF_NO")
    private String invRefNo;

    /**
     * Fiscal Year of the relevant invoice (for Credit Memo)
     */
    @Parameter("INV_YEAR")
    private String invYear;

    /**
     * invoice Receipt Date
     */
    @Parameter("INV_REC_DATE")
    private Date invRecDate;

    /**
     * Planning Level
     */
    @Parameter("PLANNING_LEVEL")
    private String planningLevel;

    /**
     * Planning Date
     */
    @Parameter("PLANNING_DATE")
    private Date planningDate;

    /**
     * Fixed Payment Terms
     */
    @Parameter("FIXED_TERMS")
    private String fixedTerms;

    /**
     * Business Area
     */
    @Parameter("BUS_AREA")
    private String busArea;

    /**
     * Lot Number for Documents.
     */
    @Parameter("LOT_NUMBER")
    private String lotNumber;

    /**
     * Item Text
     */
    @Parameter("ITEM_TEXT")
    private String itemText;

    /**
     * NOTA Fiscal Type
     */
    @Parameter("J_1BNFTYPE")
    private String j1BnfType;

    /**
     * @Indicator: Triangular deal within the EU?
     */
    @Parameter("EU_TRIANG_DEAL")
    private String euTriangDeal;

    /**
     * Reporting Country for Delivery of Goods within the EU?
     */
    @Parameter("REPCOUNTRY")
    private String repCountry;

    /**
     * VAT Registration Number
     */
    @Parameter("VAT_REG_NO")
    private String vatRegNo;

    /**
     * Business Place
     */
    @Parameter("BUSINESS_PLACE")
    private String businessPlace;

    /**
     * Exchange Rate for Taxes
     */
    @Parameter("TAX_EXCH_RATE")
    private BigDecimal taxExchRate;

    /**
     * @Indicator: Capital Goods Affected?
     */
    @Parameter("GOODS_AFFECTED")
    private String goodsAffected;

    /**
     * Due Date for Retention
     */
    @Parameter("RET_DUE_PROP")
    private Date retDueProp;

    /**
     * Posting Logic for Delivery Items (invoice/ Credit memo)
     */
    @Parameter("DELIV_POSTING")
    private String delivPosting;

    /**
     * Posting Logic for return Items( invoice / Credit memo)
     */
    @Parameter("RETURN_POSTING")
    private String returnPosting;

    public String getInvoiceInd() {
        return invoiceInd;
    }

    public void setInvoiceInd(String invoiceId) {
        this.invoiceInd = invoiceId;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public Date getDocDate() {
        return docDate;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
    }

    public Date getPstngDate() {
        return pstngDate;
    }

    public void setPstngDate(Date pstngDate) {
        this.pstngDate = pstngDate;
    }

    public String getRefDocNo() {
        return refDocNo;
    }

    public void setRefDocNo(String refDocNo) {
        this.refDocNo = refDocNo;
    }

    public String getCompCode() {
        return compCode;
    }

    public void setCompCode(String compCode) {
        this.compCode = compCode;
    }

    public String getDiffInv() {
        return diffInv;
    }

    public void setDiffInv(String diffInv) {
        this.diffInv = diffInv;
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

    public BigDecimal getExchRate() {
        return exchRate;
    }

    public void setExchRate(BigDecimal exchRate) {
        this.exchRate = exchRate;
    }

    public BigDecimal getExchRateV() {
        return exchRateV;
    }

    public void setExchRateV(BigDecimal exchRateV) {
        this.exchRateV = exchRateV;
    }

    public BigDecimal getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(BigDecimal grossAmount) {
        this.grossAmount = grossAmount;
    }

    public String getCalcTaxInd() {
        return calcTaxInd;
    }

    public void setCalcTaxInd(String calcTaxInd) {
        this.calcTaxInd = calcTaxInd;
    }

    public String getPmntTrms() {
        return pmntTrms;
    }

    public void setPmntTrms(String pmntTrms) {
        this.pmntTrms = pmntTrms;
    }

    public Date getBlineDate() {
        return blineDate;
    }

    public void setBlineDate(Date blineDate) {
        this.blineDate = blineDate;
    }

    public BigDecimal getDsctDays1() {
        return dsctDays1;
    }

    public void setDsctDays1(BigDecimal dsctDays1) {
        this.dsctDays1 = dsctDays1;
    }

    public BigDecimal getDsctDays2() {
        return dsctDays2;
    }

    public void setDsctDays2(BigDecimal dsctDays2) {
        this.dsctDays2 = dsctDays2;
    }

    public BigDecimal getNetTerms() {
        return netTerms;
    }

    public void setNetTerms(BigDecimal netTerms) {
        this.netTerms = netTerms;
    }

    public BigDecimal getDsctPct1() {
        return dsctPct1;
    }

    public void setDsctPct1(BigDecimal dsctPct1) {
        this.dsctPct1 = dsctPct1;
    }

    public BigDecimal getDsctPct2() {
        return dsctPct2;
    }

    public void setDsctPct2(BigDecimal dsctPct2) {
        this.dsctPct2 = dsctPct2;
    }

    public String getIvCategory() {
        return ivCategory;
    }

    public void setIvCategory(String ivCategory) {
        this.ivCategory = ivCategory;
    }

    public String getHeaderTxt() {
        return headerTxt;
    }

    public void setHeaderTxt(String headerTxt) {
        this.headerTxt = headerTxt;
    }

    public String getPmntBlock() {
        return pmntBlock;
    }

    public void setPmntBlock(String pmntBlock) {
        this.pmntBlock = pmntBlock;
    }

    public BigDecimal getDelCosts() {
        return delCosts;
    }

    public void setDelCosts(BigDecimal delCosts) {
        this.delCosts = delCosts;
    }

    public String getDelCostsTaxC() {
        return delCostsTaxC;
    }

    public void setDelCostsTaxC(String delCostsTaxC) {
        this.delCostsTaxC = delCostsTaxC;
    }

    public String getDelCostsTaxJ() {
        return delCostsTaxJ;
    }

    public void setDelCostsTaxJ(String delCostsTaxJ) {
        this.delCostsTaxJ = delCostsTaxJ;
    }

    public String getPersonExt() {
        return personExt;
    }

    public void setPersonExt(String personExt) {
        this.personExt = personExt;
    }

    public String getPymtMeth() {
        return pymtMeth;
    }

    public void setPymtMeth(String pymtMeth) {
        this.pymtMeth = pymtMeth;
    }

    public String getPmtMthSup() {
        return pmtMthSup;
    }

    public void setPmtMthSup(String pmtMthSup) {
        this.pmtMthSup = pmtMthSup;
    }

    public String getInvDocNo() {
        return invDocNo;
    }

    public void setInvDocNo(String invDocNo) {
        this.invDocNo = invDocNo;
    }

    public String getScBankInd() {
        return scBankInd;
    }

    public void setScBankInd(String scBankInd) {
        this.scBankInd = scBankInd;
    }

    public String getSupCountry() {
        return supCountry;
    }

    public void setSupCountry(String supCountry) {
        this.supCountry = supCountry;
    }

    public String getBllSrvInd() {
        return bllSrvInd;
    }

    public void setBllSrvInd(String bllSrvInd) {
        this.bllSrvInd = bllSrvInd;
    }

    public String getRefDocNoLong() {
        return refDocNoLong;
    }

    public void setRefDocNoLong(String refDocNoLong) {
        this.refDocNoLong = refDocNoLong;
    }

    public BigDecimal getDsctAmount() {
        return dsctAmount;
    }

    public void setDsctAmount(BigDecimal dsctAmount) {
        this.dsctAmount = dsctAmount;
    }

    public String getPoSubNo() {
        return poSubNo;
    }

    public void setPoSubNo(String poSubNo) {
        this.poSubNo = poSubNo;
    }

    public String getPoCheckDg() {
        return poCheckDg;
    }

    public void setPoCheckDg(String poCheckDg) {
        this.poCheckDg = poCheckDg;
    }

    public String getPoRefNo() {
        return poRefNo;
    }

    public void setPoRefNo(String poRefNo) {
        this.poRefNo = poRefNo;
    }

    public String getPayeePayer() {
        return payeePayer;
    }

    public void setPayeePayer(String payeePayer) {
        this.payeePayer = payeePayer;
    }

    public String getPartnerBK() {
        return partnerBK;
    }

    public void setPartnerBK(String partnerBK) {
        this.partnerBK = partnerBK;
    }

    public String getHouseBankId() {
        return houseBankId;
    }

    public void setHouseBankId(String houseBankId) {
        this.houseBankId = houseBankId;
    }

    public String getAllocNmbr() {
        return allocNmbr;
    }

    public void setAllocNmbr(String allocNmbr) {
        this.allocNmbr = allocNmbr;
    }

    public String getPaymtRef() {
        return paymtRef;
    }

    public void setPaymtRef(String paymtRef) {
        this.paymtRef = paymtRef;
    }

    public String getInvRefNo() {
        return invRefNo;
    }

    public void setInvRefNo(String invRefNo) {
        this.invRefNo = invRefNo;
    }

    public String getInvYear() {
        return invYear;
    }

    public void setInvYear(String invYear) {
        this.invYear = invYear;
    }

    public Date getInvRecDate() {
        return invRecDate;
    }

    public void setInvRecDate(Date invRecDate) {
        this.invRecDate = invRecDate;
    }

    public String getPlanningLevel() {
        return planningLevel;
    }

    public void setPlanningLevel(String planningLevel) {
        this.planningLevel = planningLevel;
    }

    public Date getPlanningDate() {
        return planningDate;
    }

    public void setPlanningDate(Date planningDate) {
        this.planningDate = planningDate;
    }

    public String getFixedTerms() {
        return fixedTerms;
    }

    public void setFixedTerms(String fixedTerms) {
        this.fixedTerms = fixedTerms;
    }

    public String getBusArea() {
        return busArea;
    }

    public void setBusArea(String busArea) {
        this.busArea = busArea;
    }

    public String getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    public String getItemText() {
        return itemText;
    }

    public void setItemText(String itemText) {
        this.itemText = itemText;
    }

    public String getJ1BnfType() {
        return j1BnfType;
    }

    public void setJ1BnfType(String j1BnfType) {
        this.j1BnfType = j1BnfType;
    }

    public String getEuTriangDeal() {
        return euTriangDeal;
    }

    public void setEuTriangDeal(String euTriangDeal) {
        this.euTriangDeal = euTriangDeal;
    }

    public String getRepCountry() {
        return repCountry;
    }

    public void setRepCountry(String repCountry) {
        this.repCountry = repCountry;
    }

    public String getVatRegNo() {
        return vatRegNo;
    }

    public void setVatRegNo(String vatRegNo) {
        this.vatRegNo = vatRegNo;
    }

    public String getBusinessPlace() {
        return businessPlace;
    }

    public void setBusinessPlace(String businessPlace) {
        this.businessPlace = businessPlace;
    }

    public BigDecimal getTaxExchRate() {
        return taxExchRate;
    }

    public void setTaxExchRate(BigDecimal taxExchRate) {
        this.taxExchRate = taxExchRate;
    }

    public String getGoodsAffected() {
        return goodsAffected;
    }

    public void setGoodsAffected(String goodsAffected) {
        this.goodsAffected = goodsAffected;
    }

    public Date getRetDueProp() {
        return retDueProp;
    }

    public void setRetDueProp(Date retDueProp) {
        this.retDueProp = retDueProp;
    }

    public String getDelivPosting() {
        return delivPosting;
    }

    public void setDelivPosting(String delivPosting) {
        this.delivPosting = delivPosting;
    }

    public String getReturnPosting() {
        return returnPosting;
    }

    public void setReturnPosting(String returnPosting) {
        this.returnPosting = returnPosting;
    }
}
