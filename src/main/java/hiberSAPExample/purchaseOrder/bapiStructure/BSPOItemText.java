package hiberSAPExample.purchaseOrder.bapiStructure;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

/**
 * PO_ITEM_TEXT STRUCTURE  BAPIEKPOTX OPTIONAL
 */

@BapiStructure
public class BSPOItemText {

    // Purchasing Document Number
    @Parameter("PO_NUMBER")
    private String poNumber;

    // Item Number of Purchasing Document
    @Parameter("PO_ITEM")
    private String poItemNo;

    // Text ID
    @Parameter("TEXT_ID")
    private String textId;

    // Tag column
    @Parameter("TEXT_FORM")
    private String textForm;

    // Text Line
    @Parameter("TEXT_LINE")
    private String textLine;

    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }

    public String getPoItemNo() {
        return poItemNo;
    }

    public void setPoItemNo(String poItemNo) {
        this.poItemNo = poItemNo;
    }

    public String getTextId() {
        return textId;
    }

    public void setTextId(String textId) {
        this.textId = textId;
    }

    public String getTextForm() {
        return textForm;
    }

    public void setTextForm(String textForm) {
        this.textForm = textForm;
    }

    public String getTextLine() {
        return textLine;
    }

    public void setTextLine(String textLine) {
        this.textLine = textLine;
    }
}
