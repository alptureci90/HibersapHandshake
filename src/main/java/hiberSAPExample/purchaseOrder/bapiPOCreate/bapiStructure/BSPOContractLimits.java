package hiberSAPExample.purchaseOrder.bapiPOCreate.bapiStructure;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

import java.math.BigDecimal;

/**
 * PO_CONTRACT_LIMITS STRUCTURE  BAPIESUCC OPTIONAL
 */
@BapiStructure
public class BSPOContractLimits {


    // Package number
    @Parameter("PCKG_NO")
    private int packageNumber;

    // Internal line number for limits
    @Parameter("LINE_NO")
    private int lineNo;

    // Contract number
    @Parameter("CON_NUMBER")
    private String contractNo;

    // Item number, contract
    @Parameter("CON_ITEM")
    private int contractItemNo;

    // Overall limit
    @Parameter("LIMIT")
    private BigDecimal limit;

    // No Limit
    @Parameter("NO_LIMIT")
    private String noLimit;

    // Price Change in Entry Sheet
    @Parameter("PRICE_CHG")
    private String priceChange;

    // Short Text 1
    @Parameter("SHORT_TEXT")
    private String shortTxt;

    // Deletion Indicator
    @Parameter("DELETE_IND")
    private String deleteInd;

    public int getPackageNumber() {
        return packageNumber;
    }

    public void setPackageNumber(int packageNumber) {
        this.packageNumber = packageNumber;
    }

    public int getLineNo() {
        return lineNo;
    }

    public void setLineNo(int lineNo) {
        this.lineNo = lineNo;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public int getContractItemNo() {
        return contractItemNo;
    }

    public void setContractItemNo(int contractItemNo) {
        this.contractItemNo = contractItemNo;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

    public String getNoLimit() {
        return noLimit;
    }

    public void setNoLimit(String noLimit) {
        this.noLimit = noLimit;
    }

    public String getPriceChange() {
        return priceChange;
    }

    public void setPriceChange(String priceChange) {
        this.priceChange = priceChange;
    }

    public String getShortTxt() {
        return shortTxt;
    }

    public void setShortTxt(String shortTxt) {
        this.shortTxt = shortTxt;
    }

    public String getDeleteInd() {
        return deleteInd;
    }

    public void setDeleteInd(String deleteInd) {
        this.deleteInd = deleteInd;
    }
}
