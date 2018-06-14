package hiberSAPExample.Invoice;

import hiberSAPExample.utilities.BapiAddress;
import hiberSAPExample.utilities.BapiTaxData;
import org.hibersap.annotations.*;

import java.util.List;

@Bapi("BAPI_INCOMINGINVOICE_GETDETAIL")
public class InvoiceDetailBapi {

    public InvoiceDetailBapi(String invoiceDocNumber, String fiscalYear){
        this.invoiceDocNumber = invoiceDocNumber;
        this.fiscalYear = fiscalYear;
    }

    @Import
    @Parameter("INVOICEDOCNUMBER")
    private String invoiceDocNumber;

    @Import
    @Parameter("FISCALYEAR")
    private String fiscalYear;

    @Export
    @Parameter(value = "HEADERDATA", type = ParameterType.STRUCTURE)
    private BapiInvoiceDetailHeader headerData;

    @Export
    @Parameter(value = "ADDRESSDATA", type = ParameterType.STRUCTURE)
    private BapiAddress address;

    @Table
    @Parameter("ITEMDATA")
    private List<BapiItemData> itemData;

    @Table
    @Parameter("TAXDATA")
    private List<BapiTaxData> taxData;


}
