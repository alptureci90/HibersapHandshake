package hiberSAPExample.Invoice.bapiStructure;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

import java.math.BigDecimal;

/**
 * BAPI_INCINV_CREATE_WITHTAX
 */
@BapiStructure
public class BSWithTaxData {

    @Parameter("SPLIT_KEY")
    private int splitKey;

    @Parameter("WI_TAX_TYPE")
    private String wiTaxType;

    @Parameter("WI_TAX_CODE")
    private String wiTaxCode;

    @Parameter("WI_TAX_BASE")
    private BigDecimal wiTaxBase;

    @Parameter("WI_TAX_AMT")
    private BigDecimal wiTaxAmt;

    @Parameter("WI_TAX_WITHHELD_AMT")
    private BigDecimal wiTaxWithheldAmt;

    public int getSplitKey() {
        return splitKey;
    }

    public void setSplitKey(int splitKey) {
        this.splitKey = splitKey;
    }

    public String getWiTaxType() {
        return wiTaxType;
    }

    public void setWiTaxType(String wiTaxType) {
        this.wiTaxType = wiTaxType;
    }

    public String getWiTaxCode() {
        return wiTaxCode;
    }

    public void setWiTaxCode(String wiTaxCode) {
        this.wiTaxCode = wiTaxCode;
    }

    public BigDecimal getWiTaxBase() {
        return wiTaxBase;
    }

    public void setWiTaxBase(BigDecimal wiTaxBase) {
        this.wiTaxBase = wiTaxBase;
    }

    public BigDecimal getWiTaxAmt() {
        return wiTaxAmt;
    }

    public void setWiTaxAmt(BigDecimal wiTaxAmt) {
        this.wiTaxAmt = wiTaxAmt;
    }

    public BigDecimal getWiTaxWithheldAmt() {
        return wiTaxWithheldAmt;
    }

    public void setWiTaxWithheldAmt(BigDecimal wiTaxWithheldAmt) {
        this.wiTaxWithheldAmt = wiTaxWithheldAmt;
    }
}
