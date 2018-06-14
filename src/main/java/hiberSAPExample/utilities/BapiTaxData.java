package hiberSAPExample.utilities;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

import java.math.BigDecimal;

@BapiStructure
public class BapiTaxData {


    @Parameter("TA")
    private String ta;

    @Parameter("TAX_AMOUNT")
    private BigDecimal taxAmount;

    @Parameter("VEND_ERROR")
    private BigDecimal vendError;

    @Parameter("TAX_ERROR")
    private BigDecimal taxError;

    public String getTa() {
        return ta;
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public BigDecimal getVendError() {
        return vendError;
    }

    public BigDecimal getTaxError() {
        return taxError;
    }
}
