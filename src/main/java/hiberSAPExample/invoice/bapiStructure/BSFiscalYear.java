package hiberSAPExample.invoice.bapiStructure;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

import java.util.Date;

@BapiStructure
public class BSFiscalYear {

    @Parameter("FISC_YEAR")
    private int fiscYear;

    @Parameter("PSTNG_DATE")
    private Date pstngDate;

    @Parameter("REASON_REV")
    private String reasonRev;

    @Parameter("DISC_SHIFT")
    private String discShift;

    @Parameter("REF_DOC_CATEGORY")
    private String refDocCategory;

}
