package hiberSAPExample.Invoice.bapiStructure;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

import java.math.BigDecimal;

@BapiStructure
public class BSItemData {

    @Parameter("INVOIC")
    private String invoiceId;

    @Parameter("PO_NUMBER")
    private String poNumber;

    @Parameter("PO_IT")
    private String poItem;

    @Parameter("SE")
    private String se;

    @Parameter("REF_DOC")
    private String refDoc;

    @Parameter("REF_")
    private String ref;

    @Parameter("REF_")
    private String ref2;

    @Parameter("D")
    private String d;

    @Parameter("TA")
    private String ta;

    @Parameter("TAXJURCODE")
    private String taxJurCode;

    @Parameter("ITEM_AMOUNT")
    private BigDecimal itemAmount;

    @Parameter("QUANTITY")
    private BigDecimal quantity;

    @Parameter("PO_")
    private String po;

    @Parameter("PO_")
    private String po2;

    @Parameter("PO_PR_QNT")
    private BigDecimal poPrQnt;

    @Parameter("COND")
    private String cond;

    @Parameter("CON")
    private String con;

    @Parameter("CO")
    private String co;

    @Parameter("REF_DOC_NO")
    private String refDocNum;

    @Parameter("QTY_INVCD")
    private BigDecimal qtyInvcd;

    @Parameter("INVQTYPOU")
    private BigDecimal invQtyPou;

    @Parameter("INV_AMNTFC")
    private BigDecimal invAmntfc;

    @Parameter("ITEM_TEXT")
    private String itemText;

    @Parameter("F")
    private String f;

    @Parameter("REF_DOC_NO_LONG")
    private String refDocNumLong;

    @Parameter("G")
    private String g;

    @Parameter("C")
    private String c;

    @Parameter("RETENTION_DOCU_C")
    private String retentionDocC;

    @Parameter("RETENT")
    private String retent;

    @Parameter("RETENTION_")
    private String retention;

    public String getInvoiceId() {
        return invoiceId;
    }

    public String getPoNumber() {
        return poNumber;
    }

    public String getPoItem() {
        return poItem;
    }

    public String getSe() {
        return se;
    }

    public String getRefDoc() {
        return refDoc;
    }

    public String getRef() {
        return ref;
    }

    public String getRef2() {
        return ref2;
    }

    public String getD() {
        return d;
    }

    public String getTa() {
        return ta;
    }

    public String getTaxJurCode() {
        return taxJurCode;
    }

    public BigDecimal getItemAmount() {
        return itemAmount;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public String getPo() {
        return po;
    }

    public String getPo2() {
        return po2;
    }

    public BigDecimal getPoPrQnt() {
        return poPrQnt;
    }

    public String getCond() {
        return cond;
    }

    public String getCon() {
        return con;
    }

    public String getCo() {
        return co;
    }

    public String getRefDocNum() {
        return refDocNum;
    }

    public BigDecimal getQtyInvcd() {
        return qtyInvcd;
    }

    public BigDecimal getInvQtyPou() {
        return invQtyPou;
    }

    public BigDecimal getInvAmntfc() {
        return invAmntfc;
    }

    public String getItemText() {
        return itemText;
    }

    public String getF() {
        return f;
    }

    public String getRefDocNumLong() {
        return refDocNumLong;
    }

    public String getG() {
        return g;
    }

    public String getC() {
        return c;
    }

    public String getRetentionDocC() {
        return retentionDocC;
    }

    public String getRetent() {
        return retent;
    }

    public String getRetention() {
        return retention;
    }
}
