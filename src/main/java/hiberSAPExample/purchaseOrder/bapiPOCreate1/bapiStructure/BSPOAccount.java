package hiberSAPExample.purchaseOrder.bapiPOCreate1.bapiStructure;


import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * IMPORT TABLE
 * POACCOUNT STRUCTURE  BAPIMEPOACCOUNT OPTIONAL
 */
@BapiStructure
public class BSPOAccount {

    // Item Number of Purchasing Document
    @Parameter("PO_ITEM")
    private String poItem;

    // Sequential Number of Account Assignment
    @Parameter("SERIAL_NO")
    private String serialNum;

    // Date on Which Record Was Created
    @Parameter("CREAT_DATE")
    private Date createDate;

    // Purchase Order Quantity
    @Parameter("QUANTITY")
    private BigDecimal quantity;

    // Distribution Percentage in Case of Multiple Account Assgt
    @Parameter("DISTR_PERC")
    private BigDecimal distributionPercentage;

    // Currency amount for BAPIS (with 9 decimal places)
    @Parameter("NET_VALUE")
    private BigDecimal netValue;

    // G/L Account Number
    @Parameter("GL_ACCOUNT")
    private String glAccount;

    // Cost Center
    @Parameter("COSTCENTER")
    private String costCenter;

    // Sales Document Item
    @Parameter("ITM_NUMBER")
    private String salesDocItemNumber;

    // Delivery Schedule Line Number
    @Parameter("SCHED_LINE")
    private String scheduleLineNumber;

    // Currency amount for BAPIS (with 9 decimal places)
    @Parameter("NOND_ITAX")
    private BigDecimal nonDITax;

    // Earmarked Funds: Document Item
    @Parameter("RES_ITEM")
    private String earmarkedFundsItemNumber;


    public String getPoItem() {
        return poItem;
    }

    public void setPoItem(String poItem) {
        this.poItem = poItem;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getDistributionPercentage() {
        return distributionPercentage;
    }

    public void setDistributionPercentage(BigDecimal distributionPercentage) {
        this.distributionPercentage = distributionPercentage;
    }

    public BigDecimal getNetValue() {
        return netValue;
    }

    public void setNetValue(BigDecimal netValue) {
        this.netValue = netValue;
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

    public String getSalesDocItemNumber() {
        return salesDocItemNumber;
    }

    public void setSalesDocItemNumber(String salesDocItemNumber) {
        this.salesDocItemNumber = salesDocItemNumber;
    }

    public String getScheduleLineNumber() {
        return scheduleLineNumber;
    }

    public void setScheduleLineNumber(String scheduleLineNumber) {
        this.scheduleLineNumber = scheduleLineNumber;
    }

    public BigDecimal getNonDITax() {
        return nonDITax;
    }

    public void setNonDITax(BigDecimal nonDITax) {
        this.nonDITax = nonDITax;
    }

    public String getEarmarkedFundsItemNumber() {
        return earmarkedFundsItemNumber;
    }

    public void setEarmarkedFundsItemNumber(String earmarkedFundsItemNumber) {
        this.earmarkedFundsItemNumber = earmarkedFundsItemNumber;
    }
}
