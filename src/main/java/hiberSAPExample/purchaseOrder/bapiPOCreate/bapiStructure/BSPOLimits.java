package hiberSAPExample.purchaseOrder.bapiPOCreate.bapiStructure;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

import java.math.BigDecimal;

/**
 * PO_LIMITS STRUCTURE  BAPIESUHC OPTIONAL
 */
@BapiStructure
public class BSPOLimits {

    // Package number
    @Parameter("PCKG_NO")
    private int packageNo;

    // Overall limit
    @Parameter("LIMIT")
    private BigDecimal overallLimit;

    // No Limit
    @Parameter("NO_LIMIT")
    private String noLimit;

    // Expected value
    @Parameter("EXP_VALUE")
    private BigDecimal expectedValue;

    // Limits exist for service types
    @Parameter("SSC_EXIST")
    private String limitExist;

    // Limit on contract items exists
    @Parameter("CON_EXIST")
    private String conExist;

    // Limit on service packages exists
    @Parameter("TMP_EXIST")
    private String tmpExist;

    // Price Change in Entry Sheet
    @Parameter("PRICE_CHG")
    private String priceChange;

    // Free limit
    @Parameter("FREE_LIMIT")
    private BigDecimal freeLimit;

    // No Limit
    @Parameter("NO_FRLIMIT")
    private String noFreeLimit;

    // Short Description of Service Type
    @Parameter("SERV_TYPE")
    private String servType;

    // Edition of Service Type
    @Parameter("EDITION")
    private int edition;

    // Value limits on service types
    @Parameter("SSC_LIMIT")
    private BigDecimal sscLimit;

    // No limit on standard service type
    @Parameter("SSC_NOLIM")
    private String noLimitOnStandardServiceType;

    // Price Change in Entry Sheet
    @Parameter("SSC_PRSCHG")
    private String priceChangeInEntrySheet;

    // Percentage for price determination
    @Parameter("SSC_PERC")
    private BigDecimal sscPerc;

    // Number of a Set of Model Service Specifications
    @Parameter("TMP_NUMBER")
    private String tmpNumber;

    // Limits on model service specifications
    @Parameter("TMP_LIMIT")
    private BigDecimal tmpLimit;

    // No Limit on Model Specifications
    @Parameter("TMP_NOLIM")
    private String tmpNoLimit;

    // Price Change in Entry Sheet
    @Parameter("TMP_PRSCHG")
    private String tmpPriceChange;

    // Percentage for Price Determination
    @Parameter("TMP_PERC")
    private BigDecimal tmpPercentage;

    // Percentage for price determination
    @Parameter("CONT_PERC")
    private BigDecimal contPercentage;

    public int getPackageNo() {
        return packageNo;
    }

    public void setPackageNo(int packageNo) {
        this.packageNo = packageNo;
    }

    public BigDecimal getOverallLimit() {
        return overallLimit;
    }

    public void setOverallLimit(BigDecimal overallLimit) {
        this.overallLimit = overallLimit;
    }

    public String getNoLimit() {
        return noLimit;
    }

    public void setNoLimit(String noLimit) {
        this.noLimit = noLimit;
    }

    public BigDecimal getExpectedValue() {
        return expectedValue;
    }

    public void setExpectedValue(BigDecimal expectedValue) {
        this.expectedValue = expectedValue;
    }

    public String getLimitExist() {
        return limitExist;
    }

    public void setLimitExist(String limitExist) {
        this.limitExist = limitExist;
    }

    public String getConExist() {
        return conExist;
    }

    public void setConExist(String conExist) {
        this.conExist = conExist;
    }

    public String getTmpExist() {
        return tmpExist;
    }

    public void setTmpExist(String tmpExist) {
        this.tmpExist = tmpExist;
    }

    public String getPriceChange() {
        return priceChange;
    }

    public void setPriceChange(String priceChange) {
        this.priceChange = priceChange;
    }

    public BigDecimal getFreeLimit() {
        return freeLimit;
    }

    public void setFreeLimit(BigDecimal freeLimit) {
        this.freeLimit = freeLimit;
    }

    public String getNoFreeLimit() {
        return noFreeLimit;
    }

    public void setNoFreeLimit(String noFreeLimit) {
        this.noFreeLimit = noFreeLimit;
    }

    public String getServType() {
        return servType;
    }

    public void setServType(String servType) {
        this.servType = servType;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public BigDecimal getSscLimit() {
        return sscLimit;
    }

    public void setSscLimit(BigDecimal sscLimit) {
        this.sscLimit = sscLimit;
    }

    public String getNoLimitOnStandardServiceType() {
        return noLimitOnStandardServiceType;
    }

    public void setNoLimitOnStandardServiceType(String noLimitOnStandardServiceType) {
        this.noLimitOnStandardServiceType = noLimitOnStandardServiceType;
    }

    public String getPriceChangeInEntrySheet() {
        return priceChangeInEntrySheet;
    }

    public void setPriceChangeInEntrySheet(String priceChangeInEntrySheet) {
        this.priceChangeInEntrySheet = priceChangeInEntrySheet;
    }

    public BigDecimal getSscPerc() {
        return sscPerc;
    }

    public void setSscPerc(BigDecimal sscPerc) {
        this.sscPerc = sscPerc;
    }

    public String getTmpNumber() {
        return tmpNumber;
    }

    public void setTmpNumber(String tmpNumber) {
        this.tmpNumber = tmpNumber;
    }

    public BigDecimal getTmpLimit() {
        return tmpLimit;
    }

    public void setTmpLimit(BigDecimal tmpLimit) {
        this.tmpLimit = tmpLimit;
    }

    public String getTmpNoLimit() {
        return tmpNoLimit;
    }

    public void setTmpNoLimit(String tmpNoLimit) {
        this.tmpNoLimit = tmpNoLimit;
    }

    public String getTmpPriceChange() {
        return tmpPriceChange;
    }

    public void setTmpPriceChange(String tmpPriceChange) {
        this.tmpPriceChange = tmpPriceChange;
    }

    public BigDecimal getTmpPercentage() {
        return tmpPercentage;
    }

    public void setTmpPercentage(BigDecimal tmpPercentage) {
        this.tmpPercentage = tmpPercentage;
    }

    public BigDecimal getContPercentage() {
        return contPercentage;
    }

    public void setContPercentage(BigDecimal contPercentage) {
        this.contPercentage = contPercentage;
    }
}
