package hiberSAPExample.purchaseOrder.bapiStructure;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

import java.math.BigDecimal;

/**
 * PO_SRV_ACCASS_VALUES STRUCTURE  BAPIESKLC OPTIONAL
 */

@BapiStructure
public class BSPOSrvAccassValues {


    // Package number
    @Parameter("PCKG_NO")
    private int packageNo;

    // Line Number
    @Parameter("LINE_NO")
    private int lineNo;

    // Seq. Number of Acc. Assignment Specification: Service Line
    @Parameter("SERNO_LINE")
    private int serNoLine;

    // Percentage for Account Assignment Value Distribution
    @Parameter("PERCENTAGE")
    private BigDecimal percentage;

    // Sequential Number of Account Assignment
    @Parameter("SERIAL_NO")
    private int serialNo;

    // Quantity with Sign
    @Parameter("QUANTITY")
    private String quantity;

    // Net Value of Item
    @Parameter("NET_VALUE")
    private String netValue;

    public int getPackageNo() {
        return packageNo;
    }

    public void setPackageNo(int packageNo) {
        this.packageNo = packageNo;
    }

    public int getLineNo() {
        return lineNo;
    }

    public void setLineNo(int lineNo) {
        this.lineNo = lineNo;
    }

    public int getSerNoLine() {
        return serNoLine;
    }

    public void setSerNoLine(int serNoLine) {
        this.serNoLine = serNoLine;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getNetValue() {
        return netValue;
    }

    public void setNetValue(String netValue) {
        this.netValue = netValue;
    }
}
