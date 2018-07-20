package hiberSAPExample.invoice.bapiStructure;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

import java.math.BigDecimal;
import java.util.Date;

@BapiStructure
public class BSInvoiceListHeader {

    @Parameter("INV_DOC_NO")
    private String invoiceDocNum;

    @Parameter("FISC")
    private String fisc;

    @Parameter("PSTNG_DATE")
    private Date pstngDate;

    @Parameter("DOC_DATE")
    private Date docDate;

    @Parameter("ENTRY_DATE")
    private Date entryDate;

    @Parameter("ENTRY_TI")
    private String entryTime;

    @Parameter("COMP")
    private String company;

    @Parameter("GROSS_AMNT")
    private BigDecimal grossAmnt;

    @Parameter("CURRE")
    private String curre;

    @Parameter("CUR")
    private String cur;

    @Parameter("DIFF_INV")
    private String diffInv;

    @Parameter("REC_DOC_NO")
    private String recDocNum;

    @Parameter("HEADER_TXT")
    private String headerTxt;

    @Parameter("PERSON_EXT")
    private String personExt;

    @Parameter("I")
    private String i;

    @Parameter("REF_DOC_NO_LONG")
    private String refDocNumLong;

    public String getInvoiceDocNum() {
        return invoiceDocNum;
    }

    public String getFisc() {
        return fisc;
    }

    public Date getPstngDate() {
        return pstngDate;
    }

    public Date getDocDate() {
        return docDate;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public String getEntryTime() {
        return entryTime;
    }

    public String getCompany() {
        return company;
    }

    public BigDecimal getGrossAmnt() {
        return grossAmnt;
    }

    public String getCurre() {
        return curre;
    }

    public String getCur() {
        return cur;
    }

    public String getDiffInv() {
        return diffInv;
    }

    public String getRecDocNum() {
        return recDocNum;
    }

    public String getHeaderTxt() {
        return headerTxt;
    }

    public String getPersonExt() {
        return personExt;
    }

    public String getI() {
        return i;
    }

    public String getRefDocNumLong() {
        return refDocNumLong;
    }
}
