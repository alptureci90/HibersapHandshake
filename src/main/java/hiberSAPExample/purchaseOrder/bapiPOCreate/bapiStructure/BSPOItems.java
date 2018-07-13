package hiberSAPExample.purchaseOrder.bapiPOCreate.bapiStructure;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

import java.math.BigDecimal;

/**
 * PO_ITEMS STRUCTURE  BAPIEKPOC
 */

@BapiStructure
public class BSPOItems {

    // Purchasing Document Number
    @Parameter("PO_NUMBER")
    private String poNumber;

    // Item Number of Purchasing Document
    @Parameter("PO_ITEM")
    private String poItem;

    // Address
    @Parameter("ADDRESS")
    private String address;

    // Material Number
    @Parameter("MATERIAL")
    private String material;

    // Material number
    @Parameter("PUR_MAT")
    private String materialNum;

    // Number of purchasing info record
    @Parameter("INFO_REC")
    private String infoRec;

    // Item category in purchasing document
    @Parameter("ITEM_CAT")
    private String itemCategory;

    // Account assignment category
    @Parameter("ACCTASSCAT")
    private String accountAssignment;

    // Number of principal purchase agreement
    @Parameter("AGREEMENT")
    private String agreement;

    // Item number of principal purchase agreement
    @Parameter("AGMT_ITEM")
    private String agmtItem;

    // Storage Location
    @Parameter("STORE_LOC")
    private String storeLoc;

    // Material Group
    @Parameter("MAT_GRP")
    private String matGroup;

    // Short Text
    @Parameter("SHORT_TEXT")
    private String shortText;

    // Distribution indicator for multiple account assignment
    @Parameter("DISTRIB")
    private String distribution;

    // Partial invoice indicator
    @Parameter("PART_INV")
    private String partialInvoiceIndicator;

    // Kanban Indicator
    @Parameter("KANBAN_IND")
    private String kanbanIndicator;

    // Plant
    @Parameter("PLANT")
    private String plant;

    // Allocation Table Number
    @Parameter("ALLOC_TBL")
    private String allocTable;

    // Item number of allocation table
    @Parameter("AT_ITEM")
    private String atItem;

    // Order unit
    @Parameter("UNIT")
    private String unit;

    // Net price in purchasing document (in document currency)
    @Parameter("NET_PRICE")
    private BigDecimal netPrice;

    // Price unit
    @Parameter("PRICE_UNIT")
    private BigDecimal priceUnit;

    // Numerator for Conversion of Order Price Unit into Order Unit
    @Parameter("CONV_NUM1")
    private BigDecimal conversionNumerator1;

    // Denominator for Conv. of Order Price Unit into Order Unit
    @Parameter("CONV_DEN1")
    private BigDecimal conversionDenominator1;

    // Order Price Unit (Purchasing)
    @Parameter("ORDERPR_UN")
    private String orderPriceUnit;

    // Package number
    @Parameter("PCKG_NO")
    private String packageNo;

    // Promotion
    @Parameter("PROMOTION")
    private String promotion;

    // Order Acknowledgment Requirement
    @Parameter("ACKN_REQD")
    private String acknReqd;

    // Requirement Tracking Number
    @Parameter("TRACKINGNO")
    private String trackingNO;

    // Planned Delivery Time in Days
    @Parameter("PLAN_DEL")
    private BigDecimal plannedDeliveryInDays;

    // Returns Item
    @Parameter("RET_ITEM")
    private String returnsItem;

    // Relevant to Allocation Table
    @Parameter("AT_RELEV")
    private String allocationRelevant;

    // Material number used by vendor
    @Parameter("VEND_MAT")
    private String vendorMaterialNumber;

    // Mfr part profile
    @Parameter("MANUF_PROF")
    private String manufProf;

    // Manufacturer Part Number
    @Parameter("MANU_MAT")
    private String manufecturarMaterialNumber;

    // Manufacturer number
    @Parameter("MFR_NO")
    private String mfrNo;

    // External manufacturer code name or number
    @Parameter("MFR_NO_EXT")
    private String mfrNoExt;

    // Indicator: adopt price - do not use info record
    @Parameter("PO_PRICE")
    private String poPrice;

    // Shipping Instructions
    @Parameter("SHIPPING")
    private String shipping;

    // Item category in purchasing document
    @Parameter("ITEM_CAT_EXT")
    private String itemCatExt;

    // Order unit in ISO code
    @Parameter("PO_UNIT_ISO")
    private String poUnitISO;

    // ISO code for purchase order price unit
    @Parameter("ORDERPR_UN_ISO")
    private String orderPriceUnitISO;

    // Name of requisitioner/requester
    @Parameter("PREQ_NAME")
    private String preqName;

    // PO quantity: total of all sched. lines for display purposes
    @Parameter("DISP_QUAN")
    private BigDecimal dispQuan;

    // Stock Type
    @Parameter("QUAL_INSP")
    private String stockType;

    // "Delivery Completed" Indicator
    @Parameter("NO_MORE_GR")
    private String deliveryCompletedIndicator;

    // Deletion indicator in purchasing document
    @Parameter("DELETE_IND")
    private String deletionIndicator;

    // Indicator: suppress rounding in purchase order item
    @Parameter("NO_ROUNDING")
    private String noRounding;

    // Tax on Sales/Purchases Code
    @Parameter("TAX_CODE")
    private String taxCode;

    // Long Material Number for MATERIAL Field
    @Parameter("MATERIAL_EXTERNAL")
    private String materialExternal;

    // External GUID for MATERIAL Field
    @Parameter("MATERIAL_GUID")
    private String materialGuid;

    // Version Number for MATERIAL Field
    @Parameter("MATERIAL_VERSION")
    private String materialVersion;

    // Long Material Number for PUR_MAT Field
    @Parameter("PUR_MAT_EXTERNAL")
    private String purMatExternal;

    // External GUID for PUR_MAT Field
    @Parameter("PUR_MAT_GUID")
    private String purMatGuid;

    // Version Number for PUR_MAT Field
    @Parameter("PUR_MAT_VERSION")
    private String purMatVersion;

    // Valuation type
    @Parameter("VAL_TYPE")
    private String valuationType;

    // Purchase requisition closed
    @Parameter("PR_CLOSED")
    private String purchaseRequisitionClosed;

    // Order Acknowledgment Number
    @Parameter("ACKNOWL_NO")
    private String acknowledgmentNumber;

    // Requirement Segment
    @Parameter("REQ_SEGMENT")
    private String requirementSegment;

    // Stock Segment
    @Parameter("STK_SEGMENT")
    private String stockSegment;

    // Material Number (40 Characters, needed f. technical reasons)
    @Parameter("MATERIAL_LONG")
    private String materialLong;

    // Material Number (40 Characters, Technical Requirement)
    @Parameter("PUR_MAT_LONG")
    private String purMatLong;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterialNum() {
        return materialNum;
    }

    public void setMaterialNum(String materialNum) {
        this.materialNum = materialNum;
    }

    public String getInfoRec() {
        return infoRec;
    }

    public void setInfoRec(String infoRec) {
        this.infoRec = infoRec;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public String getAccountAssignment() {
        return accountAssignment;
    }

    public void setAccountAssignment(String accountAssignment) {
        this.accountAssignment = accountAssignment;
    }

    public String getAgreement() {
        return agreement;
    }

    public void setAgreement(String agreement) {
        this.agreement = agreement;
    }

    public String getAgmtItem() {
        return agmtItem;
    }

    public void setAgmtItem(String agmtItem) {
        this.agmtItem = agmtItem;
    }

    public String getStoreLoc() {
        return storeLoc;
    }

    public void setStoreLoc(String storeLoc) {
        this.storeLoc = storeLoc;
    }

    public String getMatGroup() {
        return matGroup;
    }

    public void setMatGroup(String matGroup) {
        this.matGroup = matGroup;
    }

    public String getShortText() {
        return shortText;
    }

    public void setShortText(String shortText) {
        this.shortText = shortText;
    }

    public String getDistribution() {
        return distribution;
    }

    public void setDistribution(String distribution) {
        this.distribution = distribution;
    }

    public String getPartialInvoiceIndicator() {
        return partialInvoiceIndicator;
    }

    public void setPartialInvoiceIndicator(String partialInvoiceIndicator) {
        this.partialInvoiceIndicator = partialInvoiceIndicator;
    }

    public String getKanbanIndicator() {
        return kanbanIndicator;
    }

    public void setKanbanIndicator(String kanbanIndicator) {
        this.kanbanIndicator = kanbanIndicator;
    }

    public String getPlant() {
        return plant;
    }

    public void setPlant(String plant) {
        this.plant = plant;
    }

    public String getAllocTable() {
        return allocTable;
    }

    public void setAllocTable(String allocTable) {
        this.allocTable = allocTable;
    }

    public String getAtItem() {
        return atItem;
    }

    public void setAtItem(String atItem) {
        this.atItem = atItem;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
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

    public BigDecimal getConversionNumerator1() {
        return conversionNumerator1;
    }

    public void setConversionNumerator1(BigDecimal conversionNumerator1) {
        this.conversionNumerator1 = conversionNumerator1;
    }

    public BigDecimal getConversionDenominator1() {
        return conversionDenominator1;
    }

    public void setConversionDenominator1(BigDecimal conversionDenominator1) {
        this.conversionDenominator1 = conversionDenominator1;
    }

    public String getOrderPriceUnit() {
        return orderPriceUnit;
    }

    public void setOrderPriceUnit(String orderPriceUnit) {
        this.orderPriceUnit = orderPriceUnit;
    }

    public String getPackageNo() {
        return packageNo;
    }

    public void setPackageNo(String packageNo) {
        this.packageNo = packageNo;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    public String getAcknReqd() {
        return acknReqd;
    }

    public void setAcknReqd(String acknReqd) {
        this.acknReqd = acknReqd;
    }

    public String getTrackingNO() {
        return trackingNO;
    }

    public void setTrackingNO(String trackingNO) {
        this.trackingNO = trackingNO;
    }

    public BigDecimal getPlannedDeliveryInDays() {
        return plannedDeliveryInDays;
    }

    public void setPlannedDeliveryInDays(BigDecimal plannedDeliveryInDays) {
        this.plannedDeliveryInDays = plannedDeliveryInDays;
    }

    public String getReturnsItem() {
        return returnsItem;
    }

    public void setReturnsItem(String returnsItem) {
        this.returnsItem = returnsItem;
    }

    public String getAllocationRelevant() {
        return allocationRelevant;
    }

    public void setAllocationRelevant(String allocationRelevant) {
        this.allocationRelevant = allocationRelevant;
    }

    public String getVendorMaterialNumber() {
        return vendorMaterialNumber;
    }

    public void setVendorMaterialNumber(String vendorMaterialNumber) {
        this.vendorMaterialNumber = vendorMaterialNumber;
    }

    public String getManufProf() {
        return manufProf;
    }

    public void setManufProf(String manufProf) {
        this.manufProf = manufProf;
    }

    public String getManufecturarMaterialNumber() {
        return manufecturarMaterialNumber;
    }

    public void setManufecturarMaterialNumber(String manufecturarMaterialNumber) {
        this.manufecturarMaterialNumber = manufecturarMaterialNumber;
    }

    public String getMfrNo() {
        return mfrNo;
    }

    public void setMfrNo(String mfrNo) {
        this.mfrNo = mfrNo;
    }

    public String getMfrNoExt() {
        return mfrNoExt;
    }

    public void setMfrNoExt(String mfrNoExt) {
        this.mfrNoExt = mfrNoExt;
    }

    public String getPoPrice() {
        return poPrice;
    }

    public void setPoPrice(String poPrice) {
        this.poPrice = poPrice;
    }

    public String getShipping() {
        return shipping;
    }

    public void setShipping(String shipping) {
        this.shipping = shipping;
    }

    public String getItemCatExt() {
        return itemCatExt;
    }

    public void setItemCatExt(String itemCatExt) {
        this.itemCatExt = itemCatExt;
    }

    public String getPoUnitISO() {
        return poUnitISO;
    }

    public void setPoUnitISO(String poUnitISO) {
        this.poUnitISO = poUnitISO;
    }

    public String getOrderPriceUnitISO() {
        return orderPriceUnitISO;
    }

    public void setOrderPriceUnitISO(String orderPriceUnitISO) {
        this.orderPriceUnitISO = orderPriceUnitISO;
    }

    public String getPreqName() {
        return preqName;
    }

    public void setPreqName(String preqName) {
        this.preqName = preqName;
    }

    public BigDecimal getDispQuan() {
        return dispQuan;
    }

    public void setDispQuan(BigDecimal dispQuan) {
        this.dispQuan = dispQuan;
    }

    public String getStockType() {
        return stockType;
    }

    public void setStockType(String stockType) {
        this.stockType = stockType;
    }

    public String getDeliveryCompletedIndicator() {
        return deliveryCompletedIndicator;
    }

    public void setDeliveryCompletedIndicator(String deliveryCompletedIndicator) {
        this.deliveryCompletedIndicator = deliveryCompletedIndicator;
    }

    public String getDeletionIndicator() {
        return deletionIndicator;
    }

    public void setDeletionIndicator(String deletionIndicator) {
        this.deletionIndicator = deletionIndicator;
    }

    public String getNoRounding() {
        return noRounding;
    }

    public void setNoRounding(String noRounding) {
        this.noRounding = noRounding;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getMaterialExternal() {
        return materialExternal;
    }

    public void setMaterialExternal(String materialExternal) {
        this.materialExternal = materialExternal;
    }

    public String getMaterialGuid() {
        return materialGuid;
    }

    public void setMaterialGuid(String materialGuid) {
        this.materialGuid = materialGuid;
    }

    public String getMaterialVersion() {
        return materialVersion;
    }

    public void setMaterialVersion(String materialVersion) {
        this.materialVersion = materialVersion;
    }

    public String getPurMatExternal() {
        return purMatExternal;
    }

    public void setPurMatExternal(String purMatExternal) {
        this.purMatExternal = purMatExternal;
    }

    public String getPurMatGuid() {
        return purMatGuid;
    }

    public void setPurMatGuid(String purMatGuid) {
        this.purMatGuid = purMatGuid;
    }

    public String getPurMatVersion() {
        return purMatVersion;
    }

    public void setPurMatVersion(String purMatVersion) {
        this.purMatVersion = purMatVersion;
    }

    public String getValuationType() {
        return valuationType;
    }

    public void setValuationType(String valuationType) {
        this.valuationType = valuationType;
    }

    public String getPurchaseRequisitionClosed() {
        return purchaseRequisitionClosed;
    }

    public void setPurchaseRequisitionClosed(String purchaseRequisitionClosed) {
        this.purchaseRequisitionClosed = purchaseRequisitionClosed;
    }

    public String getAcknowledgmentNumber() {
        return acknowledgmentNumber;
    }

    public void setAcknowledgmentNumber(String acknowledgmentNumber) {
        this.acknowledgmentNumber = acknowledgmentNumber;
    }

    public String getRequirementSegment() {
        return requirementSegment;
    }

    public void setRequirementSegment(String requirementSegment) {
        this.requirementSegment = requirementSegment;
    }

    public String getStockSegment() {
        return stockSegment;
    }

    public void setStockSegment(String stockSegment) {
        this.stockSegment = stockSegment;
    }

    public String getMaterialLong() {
        return materialLong;
    }

    public void setMaterialLong(String materialLong) {
        this.materialLong = materialLong;
    }

    public String getPurMatLong() {
        return purMatLong;
    }

    public void setPurMatLong(String purMatLong) {
        this.purMatLong = purMatLong;
    }
}
