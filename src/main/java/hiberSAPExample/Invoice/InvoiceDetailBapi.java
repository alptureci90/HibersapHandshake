package hiberSAPExample.Invoice;

import hiberSAPExample.Invoice.bapiStructure.BSInvoiceDetailHeader;
import hiberSAPExample.Invoice.bapiStructure.BSItemData;
import hiberSAPExample.utilities.BSAddress;
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
    private BSInvoiceDetailHeader headerData;

    @Export
    @Parameter(value = "ADDRESSDATA", type = ParameterType.STRUCTURE)
    private BSAddress address;

    @Table
    @Parameter("ITEMDATA")
    private List<BSItemData> itemData;

    @Table
    @Parameter("TAXDATA")
    private List<BapiTaxData> taxData;


}
