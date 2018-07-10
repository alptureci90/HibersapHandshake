package hiberSAPExample.Invoice.bapiStructure;

import org.hibersap.annotations.BapiStructure;

import org.hibersap.annotations.Parameter;

import java.math.BigDecimal;
import java.util.Date;

@BapiStructure
public class BSGLAccountData{

    @Parameter("INVOICE_DOC_ITEM")
    private int invoiceDocItem;

    @Parameter("GL_ACCOUNT")
    private String glAccount;

    @Parameter("ITEM_AMOUNT")
    private int itemAmount;

    // Debit/Credit Indicator
    @Parameter("DB_CR_IND")
    private String dbCrInd;

    @Parameter("NEG_POSTNG")
    private String negPostng;

    @Parameter("COMP_CODE")
    private String compCode;

    @Parameter("TAX_CODE")
    private String taxCode;

    @Parameter("TAXJURCODE")
    private String taxJurCode;

    @Parameter("ITEM_TEXT")
    private String itemText;

    @Parameter("COSTCENTER")
    private String costCenter;

    @Parameter("SD_DOC")
    private String sdDoc;

    @Parameter("SDOC_ITEM")
    private int sDocItem;

    @Parameter("ORDERID")
    private String orderId;

    @Parameter("REF_DATE")
    private Date refDate;

    @Parameter("CMMT_ITEM")
    private String cmmtItem; //Commitment Item

    @Parameter("FUNDS_CTR")
    private String fundsCtr;

    @Parameter("FUNC_AREA")
    private String funcArea;

    @Parameter("PROFIT_CTR")
    private String profitCtr;

    @Parameter("FUND")
    private String fund;

    @Parameter("BUS_AREA")
    private String busArea;

    @Parameter("TR_PART_BA")
    private String trPartBA; // Trading partner's Business Area

    //===========

    @Parameter("COSTOBJECT")
    private String costObject;

    @Parameter("NETWORK")
    private String network;

    @Parameter("ACTIVITY")
    private String activity;

    @Parameter("WBS_ELEM")
    private int wbsElem;

    @Parameter("ACTTYPE")
    private String actType;

    @Parameter("RL_EST_KEY")
    private String rlEstKey;

    @Parameter("PERSON_NO")
    private int personNo;

    @Parameter("CO_BUSPROC")
    private String coBusProc; // Business Process

    @Parameter("GRANT_NBR")
    private String grantNbr;

    @Parameter("CMMT_ITEM_LONG")
    private String cmmtItemLong;

    @Parameter("FUNC_AREA_LONG")
    private String funcAreaLong;

    @Parameter("QUANTITY")
    private int quantity;

    @Parameter("BASE_UOM")
    private String baseUOM;

    @Parameter("ALLOC_NMBR")
    private String allocNmbr;

    @Parameter("CSHDIS_IND")
    private String cshdisInd;

    @Parameter("TAX_BASE_AMOUNT")
    private BigDecimal taxBaseAmount;

    @Parameter("PROFIT_SEGM_NO")
    private int profitSegmNo;

    @Parameter("PLANT")
    private String plant;

    @Parameter("BUDGET_PERIOD")
    private String budgetPeriod;

    public int getInvoiceDocItem() {
        return invoiceDocItem;
    }

    public void setInvoiceDocItem(int invoiceDocItem) {
        this.invoiceDocItem = invoiceDocItem;
    }

    public String getGlAccount() {
        return glAccount;
    }

    public void setGlAccount(String glAccount) {
        this.glAccount = glAccount;
    }

    public int getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(int itemAmount) {
        this.itemAmount = itemAmount;
    }

    public String getDbCrInd() {
        return dbCrInd;
    }

    public void setDbCrInd(String dbCrInd) {
        this.dbCrInd = dbCrInd;
    }

    public String getNegPostng() {
        return negPostng;
    }

    public void setNegPostng(String negPostng) {
        this.negPostng = negPostng;
    }

    public String getCompCode() {
        return compCode;
    }

    public void setCompCode(String compCode) {
        this.compCode = compCode;
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

    public String getItemText() {
        return itemText;
    }

    public void setItemText(String itemText) {
        this.itemText = itemText;
    }

    public String getCostCenter() {
        return costCenter;
    }

    public void setCostCenter(String costCenter) {
        this.costCenter = costCenter;
    }

    public String getSdDoc() {
        return sdDoc;
    }

    public void setSdDoc(String sdDoc) {
        this.sdDoc = sdDoc;
    }

    public int getsDocItem() {
        return sDocItem;
    }

    public void setsDocItem(int sDocItem) {
        this.sDocItem = sDocItem;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getRefDate() {
        return refDate;
    }

    public void setRefDate(Date refDate) {
        this.refDate = refDate;
    }

    public String getCmmtItem() {
        return cmmtItem;
    }

    public void setCmmtItem(String cmmtItem) {
        this.cmmtItem = cmmtItem;
    }

    public String getFundsCtr() {
        return fundsCtr;
    }

    public void setFundsCtr(String fundsCtr) {
        this.fundsCtr = fundsCtr;
    }

    public String getFuncArea() {
        return funcArea;
    }

    public void setFuncArea(String funcArea) {
        this.funcArea = funcArea;
    }

    public String getProfitCtr() {
        return profitCtr;
    }

    public void setProfitCtr(String profitCtr) {
        this.profitCtr = profitCtr;
    }

    public String getFund() {
        return fund;
    }

    public void setFund(String fund) {
        this.fund = fund;
    }

    public String getBusArea() {
        return busArea;
    }

    public void setBusArea(String busArea) {
        this.busArea = busArea;
    }

    public String getTrPartBA() {
        return trPartBA;
    }

    public void setTrPartBA(String trPartBA) {
        this.trPartBA = trPartBA;
    }

    public String getCostObject() {
        return costObject;
    }

    public void setCostObject(String costObject) {
        this.costObject = costObject;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public int getWbsElem() {
        return wbsElem;
    }

    public void setWbsElem(int wbsElem) {
        this.wbsElem = wbsElem;
    }

    public String getActType() {
        return actType;
    }

    public void setActType(String actType) {
        this.actType = actType;
    }

    public String getRlEstKey() {
        return rlEstKey;
    }

    public void setRlEstKey(String rlEstKey) {
        this.rlEstKey = rlEstKey;
    }

    public int getPersonNo() {
        return personNo;
    }

    public void setPersonNo(int personNo) {
        this.personNo = personNo;
    }

    public String getCoBusProc() {
        return coBusProc;
    }

    public void setCoBusProc(String coBusProc) {
        this.coBusProc = coBusProc;
    }

    public String getGrantNbr() {
        return grantNbr;
    }

    public void setGrantNbr(String grantNbr) {
        this.grantNbr = grantNbr;
    }

    public String getCmmtItemLong() {
        return cmmtItemLong;
    }

    public void setCmmtItemLong(String cmmtItemLong) {
        this.cmmtItemLong = cmmtItemLong;
    }

    public String getFuncAreaLong() {
        return funcAreaLong;
    }

    public void setFuncAreaLong(String funcAreaLong) {
        this.funcAreaLong = funcAreaLong;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBaseUOM() {
        return baseUOM;
    }

    public void setBaseUOM(String baseUOM) {
        this.baseUOM = baseUOM;
    }

    public String getAllocNmbr() {
        return allocNmbr;
    }

    public void setAllocNmbr(String allocNmbr) {
        this.allocNmbr = allocNmbr;
    }

    public String getCshdisInd() {
        return cshdisInd;
    }

    public void setCshdisInd(String cshdisInd) {
        this.cshdisInd = cshdisInd;
    }

    public BigDecimal getTaxBaseAmount() {
        return taxBaseAmount;
    }

    public void setTaxBaseAmount(BigDecimal taxBaseAmount) {
        this.taxBaseAmount = taxBaseAmount;
    }

    public int getProfitSegmNo() {
        return profitSegmNo;
    }

    public void setProfitSegmNo(int profitSegmNo) {
        this.profitSegmNo = profitSegmNo;
    }

    public String getPlant() {
        return plant;
    }

    public void setPlant(String plant) {
        this.plant = plant;
    }

    public String getBudgetPeriod() {
        return budgetPeriod;
    }

    public void setBudgetPeriod(String budgetPeriod) {
        this.budgetPeriod = budgetPeriod;
    }
}
