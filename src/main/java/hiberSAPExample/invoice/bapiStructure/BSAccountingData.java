package hiberSAPExample.invoice.bapiStructure;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

import java.util.Date;

/**
 * BAPI_INCINV_CREATE_ACCOUNT OPTIONAL
 */

@BapiStructure
public class BSAccountingData {

    //Doc item in invoice
    @Parameter("INVOICE_DOC_ITEM")
    private int invoiceDocItem;

    // Unplanned Account Assignment
    @Parameter("XUNPL")
    private String xunpl;

    // Sequential Num of Account
    @Parameter("SERIAL_NO")
    private int serialNo;

    @Parameter("TAX_CODE")
    private String taxCode;

    //Tax Jurisdiction
    @Parameter("TAXJURCODE")
    private String taxJurCode;

    @Parameter("ITEM_AMOUNT")
    private double itemAmount;

    @Parameter("QUANTITY")
    private int quantity;

    @Parameter("PO_UNIT")
    private String poUnit;

    @Parameter("PO_UNIT_ISO")
    private String poUnitISO;

    @Parameter("PO_PR_QNT")
    private int poPrQnt;

    @Parameter("PO_PR_UOM")
    private String poPrUom;

    @Parameter("PO_PR_UOM_ISO")
    private String poPrUomISO;

    @Parameter("GL_ACCOUNT")
    private String glAccount;

    @Parameter("COSTCENTER")
    private String costCenter;

    @Parameter("SD_DOC")
    private String sdDoc;

    @Parameter("SDOC_ITEM")
    private int sDocItem;

    @Parameter("ASSET_NO")
    private String assetNo;

    @Parameter("SUB_NUMBER")
    private String subNumber;

    @Parameter("ORDER_ID")
    private String orderId;

    @Parameter("REF_DATE")
    private Date refDate;

    @Parameter("CMMT_ITEM")
    private String cmmtItem;

    //========================


    @Parameter("FUNDS_CTR")
    private String fundsCtr; // Funds Center

    @Parameter("FUNC_AREA")
    private String funcArea;

    @Parameter("FUND")
    private String fund;

    @Parameter("BUS_AREA")
    private String busArea;

    @Parameter("RL_EST_KEY")
    private String rlEstKey; // Internal Key for Real Estate...

    @Parameter("CO_AREA")
    private String coArea; // Controlling Area

    @Parameter("COSTOBJECT")
    private String costObject;

    @Parameter("NETWORK")
    private String network;

    @Parameter("ACTIVITY")
    private String activity;

    @Parameter("PROFIT_SEGM_NO")
    private int profitSegmNo;

    @Parameter("PROFIT_CTR")
    private String profitCtr; // Profit Center

    @Parameter("WBS_ELEM")
    private int wbsElem; // Work Breakdown Structure E...

    @Parameter("GRANT_NBR")
    private String grantNbr; // Grans

    @Parameter("CMMT_ITEM_LONG")
    private String cmmtItemLong;

    @Parameter("FUNC_AREA_LONG")
    private String funcAreaLong;

    @Parameter("BUDGET_PERIOD")
    private String budgetPeriod;

    @Parameter("DEL_CREATE_DATE")
    private Date delCreateDate;

    public int getInvoiceDocItem() {
        return invoiceDocItem;
    }

    public void setInvoiceDocItem(int invoiceDocItem) {
        this.invoiceDocItem = invoiceDocItem;
    }

    public String getXunpl() {
        return xunpl;
    }

    public void setXunpl(String xunpl) {
        this.xunpl = xunpl;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
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

    public double getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(double itemAmount) {
        this.itemAmount = itemAmount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPoUnit() {
        return poUnit;
    }

    public void setPoUnit(String poUnit) {
        this.poUnit = poUnit;
    }

    public String getPoUnitISO() {
        return poUnitISO;
    }

    public void setPoUnitISO(String poUnitISO) {
        this.poUnitISO = poUnitISO;
    }

    public int getPoPrQnt() {
        return poPrQnt;
    }

    public void setPoPrQnt(int poPrQnt) {
        this.poPrQnt = poPrQnt;
    }

    public String getPoPrUom() {
        return poPrUom;
    }

    public void setPoPrUom(String poPrUom) {
        this.poPrUom = poPrUom;
    }

    public String getPoPrUomISO() {
        return poPrUomISO;
    }

    public void setPoPrUomISO(String poPrUomISO) {
        this.poPrUomISO = poPrUomISO;
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

    public String getAssetNo() {
        return assetNo;
    }

    public void setAssetNo(String assetNo) {
        this.assetNo = assetNo;
    }

    public String getSubNumber() {
        return subNumber;
    }

    public void setSubNumber(String subNumber) {
        this.subNumber = subNumber;
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

    public String getRlEstKey() {
        return rlEstKey;
    }

    public void setRlEstKey(String rlEstKey) {
        this.rlEstKey = rlEstKey;
    }

    public String getCoArea() {
        return coArea;
    }

    public void setCoArea(String coArea) {
        this.coArea = coArea;
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

    public int getProfitSegmNo() {
        return profitSegmNo;
    }

    public void setProfitSegmNo(int profitSegmNo) {
        this.profitSegmNo = profitSegmNo;
    }

    public String getProfitCtr() {
        return profitCtr;
    }

    public void setProfitCtr(String profitCtr) {
        this.profitCtr = profitCtr;
    }

    public int getWbsElem() {
        return wbsElem;
    }

    public void setWbsElem(int wbsElem) {
        this.wbsElem = wbsElem;
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

    public String getBudgetPeriod() {
        return budgetPeriod;
    }

    public void setBudgetPeriod(String budgetPeriod) {
        this.budgetPeriod = budgetPeriod;
    }

    public Date getDelCreateDate() {
        return delCreateDate;
    }

    public void setDelCreateDate(Date delCreateDate) {
        this.delCreateDate = delCreateDate;
    }
}
