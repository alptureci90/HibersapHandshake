package hiberSAPExample.purchaseOrder.bapiPOCreate.bapiStructure;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

import java.math.BigDecimal;
import java.util.Date;


/**
 * PO_SERVICES STRUCTURE  BAPIESLLC OPTIONAL
 */

@BapiStructure
public class BSPOServices {


    // Package number
    @Parameter("PCKG_NO")
    private int packageNo;

    // Internal line number
    @Parameter("LINE_NO")
    private int internalLineNo;

    // Line Number
    @Parameter("EXT_LINE")
    private int externalLineNo;

    // Hierarchy level of group
    @Parameter("OUTL_LEVEL")
    private int outlLevel;

    // Outline Level
    @Parameter("OUTL_NO")
    private String outlineNumber;

    // Indicator: Outline line
    @Parameter("OUTL_IND")
    private String outlInd;

    // Subpackage number
    @Parameter("SUBPCKG_NO")
    private int subpackageNo;

    // Activity Number
    @Parameter("SERVICE")
    private String service;

    // Short Description of Service Type
    @Parameter("SERV_TYPE")
    private String serviceType;

    // Edition of Service Type
    @Parameter("EDITION")
    private int edition;

    // Standard Service Catalog Item
    @Parameter("SSC_ITEM")
    private String sscItem;

    // vendor's Service Number
    @Parameter("EXT_SERV")
    private String externalServiceNumber;

    // Quantity with Sign
    @Parameter("QUANTITY")
    private String quantity;

    // Base Unit of Measure
    @Parameter("BASE_UOM")
    private String baseUnitOfMeasure;

    // ISO code for unit of measurement
    @Parameter("UOM_ISO")
    private String uomISO;

    // Overfulfillment Tolerance
    @Parameter("OVF_TOL")
    private BigDecimal overfulfillmentTolerance;

    // Unlimited Overfulfillment
    @Parameter("OVF_UNLIM")
    private String unlimitedOverfulfillment;

    // Price unit
    @Parameter("PRICE_UNIT")
    private BigDecimal priceUnit;

    // Gross price
    @Parameter("GR_PRICE")
    private BigDecimal grossPrice;

    // Lower Limit
    @Parameter("FROM_LINE")
    private String lowerLimit;

    // Upper Limit
    @Parameter("TO_LINE")
    private String upperLimit;

    // Short Text
    @Parameter("SHORT_TEXT")
    private String shortText;

    // Distribution indicator for multiple account assignment
    @Parameter("DISTRIB")
    private String distributionIndicator;

    // Personnel Number
    @Parameter("PERS_NO")
    private int personnelNo;

    // Wage Type
    @Parameter("WAGETYPE")
    private String wageType;

    // Source package number
    @Parameter("PLN_PCKG")
    private int sourcePackageNo;

    // Entry: Planned package line
    @Parameter("PLN_LINE")
    private int plannedPackageLine;

    // Entry: Unplanned from contract
    @Parameter("CON_PCKG")
    private int unplannedPackageFromContract;

    // Entry: Unplanned from contract
    @Parameter("CON_LINE")
    private int conLine;

    // Entry: Unplanned service from model specifications
    @Parameter("TMP_PCKG")
    private int tmpPackage;

    // Entry: Unplanned service from model specifications
    @Parameter("TMP_LINE")
    private int tmpLine;

    // Service line refers to standard service catalog limits
    @Parameter("SSC_LIM")
    private String sscLim;

    // Entry: Unplanned, limit line
    @Parameter("LIMIT_LINE")
    private int unplannedLimitLine;

    // Target Value
    @Parameter("TARGET_VAL")
    private BigDecimal targetValue;

    // Alternatives: Reference to basic item
    @Parameter("BASLINE_NO")
    private int baselineNo;

    // Basic Line
    @Parameter("BASIC_LINE")
    private String basicLine;

    // Alternative Line
    @Parameter("ALTERNAT")
    private String alternativeLine;

    // Bidder's Line
    @Parameter("BIDDER")
    private String bidder;

    // Supplementary Line
    @Parameter("SUPP_LINE")
    private String suppLine;

    // Line with Open Quantity
    @Parameter("OPEN_QTY")
    private String openQty;

    // Informatory Line
    @Parameter("INFORM")
    private String inform;

    //Blanket Line
    @Parameter("BLANKET")
    private String blanket;

    // Contingency Line
    @Parameter("EVENTUAL")
    private String eventual;

    // Tax on Sales/Purchases Code
    @Parameter("TAX_CODE")
    private String taxCode;

    // Tax Jurisdiction
    @Parameter("TAXJURCODE")
    private String taxJurCode;

    // Price Change in Entry Sheet
    @Parameter("PRICE_CHG")
    private String priceChange;

    // Material Group
    @Parameter("MATL_GROUP")
    private String materialGroup;

    // Date
    @Parameter("DATE")
    private Date date;

    // Start Time
    @Parameter("Start Time")
    private Date startTime;

    // End Time
    @Parameter("ENDTIME")
    private Date endTime;

    // External Personnel Number
    @Parameter("EXTPERS_NO")
    private String externalPersonnelNumber;

    // Formula Number
    @Parameter("FORMULA")
    private String formula;

    // Formula Value
    @Parameter("FORM_VAL1")
    private int formVal1;

    // Formula Value
    @Parameter("FORM_VAL2")
    private int formVal2;

    // Formula Value
    @Parameter("FORM_VAL3")
    private int formVal3;

    // Formula Value
    @Parameter("FORM_VAL4")
    private int formVal4;

    // Formula Value
    @Parameter("FORM_VAL5")
    private int formVal5;

    // User-Defined Field
    @Parameter("USERF1_NUM")
    private int userDefField1;

    // User-Defined Field
    @Parameter("USERF2_NUM")
    private int userDefField2;

    // User-Defined Field
    @Parameter("USERF1_TXT")
    private String userDefTxt1;

    // User-Defined Field
    @Parameter("USERF2_TXT")
    private String userDefTxt2;

    // Hierarchically superior line number
    @Parameter("HI_LINE_NO")
    private int hiLineNo;

    // External Reference Key for Service
    @Parameter("EXTREFKEY")
    private String extRefKey;

    // Deletion Indicator
    @Parameter("DELETE_IND")
    private String deleteInd;

    // Period of Performance Start Date
    @Parameter("PER_SDATE")
    private Date perfStartDate;

    // Period of Performance End Date
    @Parameter("PER_EDATE")
    private Date perfEndDate;

    // SRM Reference Key
    @Parameter("EXTERNAL_ITEM_ID")
    private String externalItemId;

    // Item Key for eSOA Messages
    @Parameter("SERVICE_ITEM_KEY")
    private int serviceItemKey;

    // Net value
    @Parameter("NET_VALUE")
    private BigDecimal netValue;

    public int getPackageNo() {
        return packageNo;
    }

    public void setPackageNo(int packageNo) {
        this.packageNo = packageNo;
    }

    public int getInternalLineNo() {
        return internalLineNo;
    }

    public void setInternalLineNo(int internalLineNo) {
        this.internalLineNo = internalLineNo;
    }

    public int getExternalLineNo() {
        return externalLineNo;
    }

    public void setExternalLineNo(int externalLineNo) {
        this.externalLineNo = externalLineNo;
    }

    public int getOutlLevel() {
        return outlLevel;
    }

    public void setOutlLevel(int outlLevel) {
        this.outlLevel = outlLevel;
    }

    public String getOutlineNumber() {
        return outlineNumber;
    }

    public void setOutlineNumber(String outlineNumber) {
        this.outlineNumber = outlineNumber;
    }

    public String getOutlInd() {
        return outlInd;
    }

    public void setOutlInd(String outlInd) {
        this.outlInd = outlInd;
    }

    public int getSubpackageNo() {
        return subpackageNo;
    }

    public void setSubpackageNo(int subpackageNo) {
        this.subpackageNo = subpackageNo;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public String getSscItem() {
        return sscItem;
    }

    public void setSscItem(String sscItem) {
        this.sscItem = sscItem;
    }

    public String getExternalServiceNumber() {
        return externalServiceNumber;
    }

    public void setExternalServiceNumber(String externalServiceNumber) {
        this.externalServiceNumber = externalServiceNumber;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getBaseUnitOfMeasure() {
        return baseUnitOfMeasure;
    }

    public void setBaseUnitOfMeasure(String baseUnitOfMeasure) {
        this.baseUnitOfMeasure = baseUnitOfMeasure;
    }

    public String getUomISO() {
        return uomISO;
    }

    public void setUomISO(String uomISO) {
        this.uomISO = uomISO;
    }

    public BigDecimal getOverfulfillmentTolerance() {
        return overfulfillmentTolerance;
    }

    public void setOverfulfillmentTolerance(BigDecimal overfulfillmentTolerance) {
        this.overfulfillmentTolerance = overfulfillmentTolerance;
    }

    public String getUnlimitedOverfulfillment() {
        return unlimitedOverfulfillment;
    }

    public void setUnlimitedOverfulfillment(String unlimitedOverfulfillment) {
        this.unlimitedOverfulfillment = unlimitedOverfulfillment;
    }

    public BigDecimal getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(BigDecimal priceUnit) {
        this.priceUnit = priceUnit;
    }

    public BigDecimal getGrossPrice() {
        return grossPrice;
    }

    public void setGrossPrice(BigDecimal grossPrice) {
        this.grossPrice = grossPrice;
    }

    public String getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(String lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public String getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(String upperLimit) {
        this.upperLimit = upperLimit;
    }

    public String getShortText() {
        return shortText;
    }

    public void setShortText(String shortText) {
        this.shortText = shortText;
    }

    public String getDistributionIndicator() {
        return distributionIndicator;
    }

    public void setDistributionIndicator(String distributionIndicator) {
        this.distributionIndicator = distributionIndicator;
    }

    public int getPersonnelNo() {
        return personnelNo;
    }

    public void setPersonnelNo(int personnelNo) {
        this.personnelNo = personnelNo;
    }

    public String getWageType() {
        return wageType;
    }

    public void setWageType(String wageType) {
        this.wageType = wageType;
    }

    public int getSourcePackageNo() {
        return sourcePackageNo;
    }

    public void setSourcePackageNo(int sourcePackageNo) {
        this.sourcePackageNo = sourcePackageNo;
    }

    public int getPlannedPackageLine() {
        return plannedPackageLine;
    }

    public void setPlannedPackageLine(int plannedPackageLine) {
        this.plannedPackageLine = plannedPackageLine;
    }

    public int getUnplannedPackageFromContract() {
        return unplannedPackageFromContract;
    }

    public void setUnplannedPackageFromContract(int unplannedPackageFromContract) {
        this.unplannedPackageFromContract = unplannedPackageFromContract;
    }

    public int getConLine() {
        return conLine;
    }

    public void setConLine(int conLine) {
        this.conLine = conLine;
    }

    public int getTmpPackage() {
        return tmpPackage;
    }

    public void setTmpPackage(int tmpPackage) {
        this.tmpPackage = tmpPackage;
    }

    public int getTmpLine() {
        return tmpLine;
    }

    public void setTmpLine(int tmpLine) {
        this.tmpLine = tmpLine;
    }

    public String getSscLim() {
        return sscLim;
    }

    public void setSscLim(String sscLim) {
        this.sscLim = sscLim;
    }

    public int getUnplannedLimitLine() {
        return unplannedLimitLine;
    }

    public void setUnplannedLimitLine(int unplannedLimitLine) {
        this.unplannedLimitLine = unplannedLimitLine;
    }

    public BigDecimal getTargetValue() {
        return targetValue;
    }

    public void setTargetValue(BigDecimal targetValue) {
        this.targetValue = targetValue;
    }

    public int getBaselineNo() {
        return baselineNo;
    }

    public void setBaselineNo(int baselineNo) {
        this.baselineNo = baselineNo;
    }

    public String getBasicLine() {
        return basicLine;
    }

    public void setBasicLine(String basicLine) {
        this.basicLine = basicLine;
    }

    public String getAlternativeLine() {
        return alternativeLine;
    }

    public void setAlternativeLine(String alternativeLine) {
        this.alternativeLine = alternativeLine;
    }

    public String getBidder() {
        return bidder;
    }

    public void setBidder(String bidder) {
        this.bidder = bidder;
    }

    public String getSuppLine() {
        return suppLine;
    }

    public void setSuppLine(String suppLine) {
        this.suppLine = suppLine;
    }

    public String getOpenQty() {
        return openQty;
    }

    public void setOpenQty(String openQty) {
        this.openQty = openQty;
    }

    public String getInform() {
        return inform;
    }

    public void setInform(String inform) {
        this.inform = inform;
    }

    public String getBlanket() {
        return blanket;
    }

    public void setBlanket(String blanket) {
        this.blanket = blanket;
    }

    public String getEventual() {
        return eventual;
    }

    public void setEventual(String eventual) {
        this.eventual = eventual;
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

    public String getPriceChange() {
        return priceChange;
    }

    public void setPriceChange(String priceChange) {
        this.priceChange = priceChange;
    }

    public String getMaterialGroup() {
        return materialGroup;
    }

    public void setMaterialGroup(String materialGroup) {
        this.materialGroup = materialGroup;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getExternalPersonnelNumber() {
        return externalPersonnelNumber;
    }

    public void setExternalPersonnelNumber(String externalPersonnelNumber) {
        this.externalPersonnelNumber = externalPersonnelNumber;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public int getFormVal1() {
        return formVal1;
    }

    public void setFormVal1(int formVal1) {
        this.formVal1 = formVal1;
    }

    public int getFormVal2() {
        return formVal2;
    }

    public void setFormVal2(int formVal2) {
        this.formVal2 = formVal2;
    }

    public int getFormVal3() {
        return formVal3;
    }

    public void setFormVal3(int formVal3) {
        this.formVal3 = formVal3;
    }

    public int getFormVal4() {
        return formVal4;
    }

    public void setFormVal4(int formVal4) {
        this.formVal4 = formVal4;
    }

    public int getFormVal5() {
        return formVal5;
    }

    public void setFormVal5(int formVal5) {
        this.formVal5 = formVal5;
    }

    public int getUserDefField1() {
        return userDefField1;
    }

    public void setUserDefField1(int userDefField1) {
        this.userDefField1 = userDefField1;
    }

    public int getUserDefField2() {
        return userDefField2;
    }

    public void setUserDefField2(int userDefField2) {
        this.userDefField2 = userDefField2;
    }

    public String getUserDefTxt1() {
        return userDefTxt1;
    }

    public void setUserDefTxt1(String userDefTxt1) {
        this.userDefTxt1 = userDefTxt1;
    }

    public String getUserDefTxt2() {
        return userDefTxt2;
    }

    public void setUserDefTxt2(String userDefTxt2) {
        this.userDefTxt2 = userDefTxt2;
    }

    public int getHiLineNo() {
        return hiLineNo;
    }

    public void setHiLineNo(int hiLineNo) {
        this.hiLineNo = hiLineNo;
    }

    public String getExtRefKey() {
        return extRefKey;
    }

    public void setExtRefKey(String extRefKey) {
        this.extRefKey = extRefKey;
    }

    public String getDeleteInd() {
        return deleteInd;
    }

    public void setDeleteInd(String deleteInd) {
        this.deleteInd = deleteInd;
    }

    public Date getPerfStartDate() {
        return perfStartDate;
    }

    public void setPerfStartDate(Date perfStartDate) {
        this.perfStartDate = perfStartDate;
    }

    public Date getPerfEndDate() {
        return perfEndDate;
    }

    public void setPerfEndDate(Date perfEndDate) {
        this.perfEndDate = perfEndDate;
    }

    public String getExternalItemId() {
        return externalItemId;
    }

    public void setExternalItemId(String externalItemId) {
        this.externalItemId = externalItemId;
    }

    public int getServiceItemKey() {
        return serviceItemKey;
    }

    public void setServiceItemKey(int serviceItemKey) {
        this.serviceItemKey = serviceItemKey;
    }

    public BigDecimal getNetValue() {
        return netValue;
    }

    public void setNetValue(BigDecimal netValue) {
        this.netValue = netValue;
    }
}
