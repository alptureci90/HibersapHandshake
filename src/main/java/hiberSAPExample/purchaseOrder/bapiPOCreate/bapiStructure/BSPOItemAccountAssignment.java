package hiberSAPExample.purchaseOrder.bapiPOCreate.bapiStructure;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * PO_ITEM_ACCOUNT_ASSIGNMENT STRUCTURE  BAPIEKKN OPTIONAL
 */

@BapiStructure
public class BSPOItemAccountAssignment {

    // Item Number of Purchasing Document
    @Parameter("PO_ITEM")
    private String poItem;

    // Sequential Number of Account Assignment
    @Parameter("SERIAL_NO")
    private String serialNo;

    // Quantity
    @Parameter("QUANTITY")
    private BigDecimal quantity;

    // Distribution percentage in the case of multiple acct assgt
    @Parameter("DISTR_PERC")
    private BigDecimal distrPerc;

    // G/L Account Number
    @Parameter("G_L_ACCT")
    private String glAccountNumber;

    // Business Area
    @Parameter("BUS_AREA")
    private String businessArea;

    // Cost Center
    @Parameter("COST_CTR")
    private String costCenter;

    // Project definition
    @Parameter("PROJ_EXT")
    private String projectDefinition;

    // Sales and Distribution Document Number
    @Parameter("SD_DOC")
    private String salesDistributionDocNumber;

    // Sales Document Item
    @Parameter("SDOC_ITEM")
    private String salesDocItem;

    // Schedule Line Number
    @Parameter("SCHED_LINE")
    private String schedLine;

    // Main Asset Number
    @Parameter("ASSET_NO")
    private String mainAssetNumber;

    // Asset Subnumber
    @Parameter("SUB_NUMBER")
    private String assetSubNumber;

    // Order Number
    @Parameter("ORDER_NO")
    private String orderNumber;

    // Goods recipient
    @Parameter("GR_RCPT")
    private String goodsRecipient;

    // Unloading Point
    @Parameter("UNLOAD_PT")
    private String unloadPoint;

    // Controlling Area
    @Parameter("CO_AREA")
    private String coArea;

    // Posting to cost center?
    @Parameter("TO_COSTCTR")
    private String postingToCostCenter;

    // Post To Order
    @Parameter("TO_ORDER")
    private String postToOrder;

    // Post to project
    @Parameter("TO_PROJECT")
    private String postToProject;

    // Cost Object
    @Parameter("COST_OBJ")
    private String costObject;

    // Profitability Segment Number (CO-PA)
    @Parameter("PROF_SEGM")
    private String profSegm;

    // Profit Center
    @Parameter("PROFIT_CTR")
    private String profitCenter;

    // Work breakdown structure element (WBS element)
    @Parameter("WBS_ELEM_E")
    private String wbsElement;

    // Network Number for Account Assignment
    @Parameter("NETWORK")
    private String network;

    // Routing number of operations in the order
    @Parameter("ROUTING_NO")
    private String routingNo;

    // Internal Key for Real Estate Object
    @Parameter("RL_EST_KEY")
    private String rlEstKey;

    // Internal counter
    @Parameter("COUNTER")
    private String counter;

    // Partner account number
    @Parameter("PART_ACCT")
    private String partnerAccountNumber;

    // Commitment Item
    @Parameter("CMMT_ITEM")
    private String cmmtItem;

    // Recovery Indicator
    @Parameter("REC_IND")
    private String recInd;

    // Funds Center
    @Parameter("FUNDS_CTR")
    private String fundsCenter;

    // Fund
    @Parameter("FUND")
    private String fund;

    // Functional Area
    @Parameter("FUNC_AREA")
    private String funcArea;

    // Reference date for settlement
    @Parameter("REF_DATE")
    private Date refDate;

    // Activity Number
    @Parameter("ACTIVITY")
    private String activity;

    // Grant
    @Parameter("GRANT_NBR")
    private String grantNo;

    // Commitment item
    @Parameter("CMMT_ITEM_LONG")
    private String cmmtItemLong;

    // Functional Area
    @Parameter("FUNC_AREA_LONG")
    private String funcAreaLong;

    // Document number for earmarked funds
    @Parameter("FUNDS_RES")
    private String fundsRes;

    // Earmarked Funds: Document Item
    @Parameter("RES_ITEM")
    private String resItem;

    // FM: Budget Period
    @Parameter("BUDGET_PERIOD")
    private String budgetPeriod;

    public String getPoItem() {
        return poItem;
    }

    public void setPoItem(String poItem) {
        this.poItem = poItem;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getDistrPerc() {
        return distrPerc;
    }

    public void setDistrPerc(BigDecimal distrPerc) {
        this.distrPerc = distrPerc;
    }

    public String getGlAccountNumber() {
        return glAccountNumber;
    }

    public void setGlAccountNumber(String glAccountNumber) {
        this.glAccountNumber = glAccountNumber;
    }

    public String getBusinessArea() {
        return businessArea;
    }

    public void setBusinessArea(String businessArea) {
        this.businessArea = businessArea;
    }

    public String getCostCenter() {
        return costCenter;
    }

    public void setCostCenter(String costCenter) {
        this.costCenter = costCenter;
    }

    public String getProjectDefinition() {
        return projectDefinition;
    }

    public void setProjectDefinition(String projectDefinition) {
        this.projectDefinition = projectDefinition;
    }

    public String getSalesDistributionDocNumber() {
        return salesDistributionDocNumber;
    }

    public void setSalesDistributionDocNumber(String salesDistributionDocNumber) {
        this.salesDistributionDocNumber = salesDistributionDocNumber;
    }

    public String getSalesDocItem() {
        return salesDocItem;
    }

    public void setSalesDocItem(String salesDocItem) {
        this.salesDocItem = salesDocItem;
    }

    public String getSchedLine() {
        return schedLine;
    }

    public void setSchedLine(String schedLine) {
        this.schedLine = schedLine;
    }

    public String getMainAssetNumber() {
        return mainAssetNumber;
    }

    public void setMainAssetNumber(String mainAssetNumber) {
        this.mainAssetNumber = mainAssetNumber;
    }

    public String getAssetSubNumber() {
        return assetSubNumber;
    }

    public void setAssetSubNumber(String assetSubNumber) {
        this.assetSubNumber = assetSubNumber;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getGoodsRecipient() {
        return goodsRecipient;
    }

    public void setGoodsRecipient(String goodsRecipient) {
        this.goodsRecipient = goodsRecipient;
    }

    public String getUnloadPoint() {
        return unloadPoint;
    }

    public void setUnloadPoint(String unloadPoint) {
        this.unloadPoint = unloadPoint;
    }

    public String getCoArea() {
        return coArea;
    }

    public void setCoArea(String coArea) {
        this.coArea = coArea;
    }

    public String getPostingToCostCenter() {
        return postingToCostCenter;
    }

    public void setPostingToCostCenter(String postingToCostCenter) {
        this.postingToCostCenter = postingToCostCenter;
    }

    public String getPostToOrder() {
        return postToOrder;
    }

    public void setPostToOrder(String postToOrder) {
        this.postToOrder = postToOrder;
    }

    public String getPostToProject() {
        return postToProject;
    }

    public void setPostToProject(String postToProject) {
        this.postToProject = postToProject;
    }

    public String getCostObject() {
        return costObject;
    }

    public void setCostObject(String costObject) {
        this.costObject = costObject;
    }

    public String getProfSegm() {
        return profSegm;
    }

    public void setProfSegm(String profSegm) {
        this.profSegm = profSegm;
    }

    public String getProfitCenter() {
        return profitCenter;
    }

    public void setProfitCenter(String profitCenter) {
        this.profitCenter = profitCenter;
    }

    public String getWbsElement() {
        return wbsElement;
    }

    public void setWbsElement(String wbsElement) {
        this.wbsElement = wbsElement;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getRoutingNo() {
        return routingNo;
    }

    public void setRoutingNo(String routingNo) {
        this.routingNo = routingNo;
    }

    public String getRlEstKey() {
        return rlEstKey;
    }

    public void setRlEstKey(String rlEstKey) {
        this.rlEstKey = rlEstKey;
    }

    public String getCounter() {
        return counter;
    }

    public void setCounter(String counter) {
        this.counter = counter;
    }

    public String getPartnerAccountNumber() {
        return partnerAccountNumber;
    }

    public void setPartnerAccountNumber(String partnerAccountNumber) {
        this.partnerAccountNumber = partnerAccountNumber;
    }

    public String getCmmtItem() {
        return cmmtItem;
    }

    public void setCmmtItem(String cmmtItem) {
        this.cmmtItem = cmmtItem;
    }

    public String getRecInd() {
        return recInd;
    }

    public void setRecInd(String recInd) {
        this.recInd = recInd;
    }

    public String getFundsCenter() {
        return fundsCenter;
    }

    public void setFundsCenter(String fundsCenter) {
        this.fundsCenter = fundsCenter;
    }

    public String getFund() {
        return fund;
    }

    public void setFund(String fund) {
        this.fund = fund;
    }

    public String getFuncArea() {
        return funcArea;
    }

    public void setFuncArea(String funcArea) {
        this.funcArea = funcArea;
    }

    public Date getRefDate() {
        return refDate;
    }

    public void setRefDate(Date refDate) {
        this.refDate = refDate;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getGrantNo() {
        return grantNo;
    }

    public void setGrantNo(String grantNo) {
        this.grantNo = grantNo;
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

    public String getFundsRes() {
        return fundsRes;
    }

    public void setFundsRes(String fundsRes) {
        this.fundsRes = fundsRes;
    }

    public String getResItem() {
        return resItem;
    }

    public void setResItem(String resItem) {
        this.resItem = resItem;
    }

    public String getBudgetPeriod() {
        return budgetPeriod;
    }

    public void setBudgetPeriod(String budgetPeriod) {
        this.budgetPeriod = budgetPeriod;
    }
}
