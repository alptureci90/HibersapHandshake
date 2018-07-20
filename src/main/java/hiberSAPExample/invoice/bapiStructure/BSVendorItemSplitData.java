package hiberSAPExample.invoice.bapiStructure;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

import java.math.BigDecimal;

/**
 * BAPI_INCINV_CREATE_VENDORSPLIT
 */

@BapiStructure
public class BSVendorItemSplitData {

    @Parameter("SPLIT_KEY")
    private int splitKey;

    @Parameter("SPLIT_AMOUNT")
    private BigDecimal splitAmount;

    @Parameter("PYMT_METH")
    private String pymtMeth;

    @Parameter("TAX_CODE")
    private String taxCode;

    @Parameter("PMTMTHSUPL")
    private String pmtMthSupl;  //Payment Method Supplement

    @Parameter("PMNTTRMS")
    private String pmntTrms; // Payment Terms

    public int getSplitKey() {
        return splitKey;
    }

    public void setSplitKey(int splitKey) {
        this.splitKey = splitKey;
    }

    public BigDecimal getSplitAmount() {
        return splitAmount;
    }

    public void setSplitAmount(BigDecimal splitAmount) {
        this.splitAmount = splitAmount;
    }

    public String getPymtMeth() {
        return pymtMeth;
    }

    public void setPymtMeth(String pymtMeth) {
        this.pymtMeth = pymtMeth;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getPmtMthSupl() {
        return pmtMthSupl;
    }

    public void setPmtMthSupl(String pmtMthSupl) {
        this.pmtMthSupl = pmtMthSupl;
    }

    public String getPmntTrms() {
        return pmntTrms;
    }

    public void setPmntTrms(String pmntTrms) {
        this.pmntTrms = pmntTrms;
    }
}
