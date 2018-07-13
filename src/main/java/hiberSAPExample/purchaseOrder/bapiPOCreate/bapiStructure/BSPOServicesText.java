package hiberSAPExample.purchaseOrder.bapiPOCreate.bapiStructure;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

/**
 * PO_SERVICES_TEXT STRUCTURE  BAPIESLLTX OPTIONAL
 */

@BapiStructure
public class BSPOServicesText {

    // Package number
    @Parameter("PCKG_NO")
    private int packageNo;

    // Line Number
    @Parameter("LINE_NO")
    private int lineNo;

    // Text ID
    @Parameter("TEXT_ID")
    private String textId;

    // Tag column
    @Parameter("FORMAT_COL")
    private String formalCol;

    // Text Line
    @Parameter("TEXT_LINE")
    private String textLine;

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

    public String getTextId() {
        return textId;
    }

    public void setTextId(String textId) {
        this.textId = textId;
    }

    public String getFormalCol() {
        return formalCol;
    }

    public void setFormalCol(String formalCol) {
        this.formalCol = formalCol;
    }

    public String getTextLine() {
        return textLine;
    }

    public void setTextLine(String textLine) {
        this.textLine = textLine;
    }
}
