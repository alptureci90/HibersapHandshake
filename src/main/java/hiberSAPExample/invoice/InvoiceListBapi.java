package hiberSAPExample.invoice;


import hiberSAPExample.invoice.bapiStructure.BSInvoiceListHeader;
import org.hibersap.annotations.Bapi;
import org.hibersap.annotations.Import;
import org.hibersap.annotations.Parameter;
import org.hibersap.annotations.Table;

import java.util.List;

@Bapi("BAPI_INCOMINGINVOICE_GETLIST")
public class InvoiceListBapi {

    public InvoiceListBapi(){
        // No specific constructor needed

    }

    @Import
    @Parameter("TM_DOCUMENTS")
    private String tmDocuments;

    @Import
    @Parameter("ERP_DOCUMENTS")
    private String erpDocuments;

   /* @Table
    @Parameter("VENDOR_RA")
    private List<vendor> vendorList;

    @Table
    @Parameter("PSTNGDATE_RA")
    private List<String> postingDateList;

    @Table
    @Parameter("DOCDATE_RA")
    private List<String> docDateList;

    @Table
    @Parameter("CPUDATE_RA")
    private  List<String> cpuDateList;

    @Table
    @Parameter("PERSON_EXT_RA")
    private  List<String> person;

    @Table
    @Parameter("STATUS_RA")
    private  List<String> status;

    @Table
    @Parameter("REFDOC_RA")
    private  List<String> refDoc;*/

    @Table
    @Parameter("HEADERLIST")
    private  List<BSInvoiceListHeader> headerList;

    /*@Table
    @Parameter("RETURN")
    private BapiRet2 ret;*/

    public String getTmDocuments() {
        return tmDocuments;
    }

    public String getErpDocuments() {
        return erpDocuments;
    }

    /*public List<vendor> getVendorList() {
        return vendorList;
    }

    public List<String> getPostingDateList() {
        return postingDateList;
    }

    public List<String> getDocDateList() {
        return docDateList;
    }

    public List<String> getCpuDateList() {
        return cpuDateList;
    }

    public List<String> getPerson() {
        return person;
    }

    public List<String> getStatus() {
        return status;
    }

    public List<String> getRefDoc() {
        return refDoc;
    }*/

    public List<BSInvoiceListHeader> getHeaderList() {
        return headerList;
    }

    /*public BapiRet2 getRet() {
        return ret;
    }*/
}
