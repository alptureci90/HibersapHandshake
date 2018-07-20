package hiberSAPExample.invoice.bapiStructure;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

import java.math.BigDecimal;

/**
 * BAPI_INCINV_CREATE_TAX
 */
@BapiStructure
public class BSTaxData {

    @Parameter("TAX_CODE")
    private String taxCode;

    @Parameter("TAX_AMOUNT")
    private BigDecimal taxAmount;

    @Parameter("TAX_BASE_AMOUNT")
    private BigDecimal taxBaseAmount;

    @Parameter("COND_TYPE")
    private String condType;

    @Parameter("TAXJURCODE")
    private String taxJurCode;

    @Parameter("TAXJURCODE_DEEP")
    private String taxJurCodeDeep;

    @Parameter("ITEM_TAX")
    private int itemTax;

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public BigDecimal getTaxBaseAmount() {
        return taxBaseAmount;
    }

    public void setTaxBaseAmount(BigDecimal taxBaseAmount) {
        this.taxBaseAmount = taxBaseAmount;
    }

    public String getCondType() {
        return condType;
    }

    public void setCondType(String condType) {
        this.condType = condType;
    }

    public String getTaxJurCode() {
        return taxJurCode;
    }

    public void setTaxJurCode(String taxJurCode) {
        this.taxJurCode = taxJurCode;
    }

    public String getTaxJurCodeDeep() {
        return taxJurCodeDeep;
    }

    public void setTaxJurCodeDeep(String taxJurCodeDeep) {
        this.taxJurCodeDeep = taxJurCodeDeep;
    }

    public int getItemTax() {
        return itemTax;
    }

    public void setItemTax(int itemTax) {
        this.itemTax = itemTax;
    }
}
