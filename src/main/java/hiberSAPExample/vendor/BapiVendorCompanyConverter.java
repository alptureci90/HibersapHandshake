package hiberSAPExample.vendor;


import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

@BapiStructure
public class BapiVendorCompanyConverter {

    @Parameter("VENDOR")
    private String vendor;

    @Parameter("COMP")
    private String company;

    @Parameter("CL")
    private String cl;

    @Parameter("HD_OFFICE")
    private String hdOffice;

    @Parameter("ALT_PAYEE")
    private String altPayee;

    @Parameter("C")
    private String c;

    @Parameter("PMNT")
    private String pmnt;

    @Parameter("ACT_AT_VEN")
    private String act_at_ven ;

    @Parameter("VEND_USER")
    private String vendUser;

    @Parameter("INTERNET")
    private String internet;

    @Parameter("FAX")
    private String fax;

    @Parameter("PAYMENT_ME")
    private String paymentMethod;

    @Parameter("TEL")
    private String tel;

    public String getVendor() {
        return vendor;
    }

    public String getCompany() {
        return company;
    }

    public String getCl() {
        return cl;
    }

    public String getHdOffice() {
        return hdOffice;
    }

    public String getAltPayee() {
        return altPayee;
    }

    public String getC() {
        return c;
    }

    public String getPmnt() {
        return pmnt;
    }

    public String getAct_at_ven() {
        return act_at_ven;
    }

    public String getVendUser() {
        return vendUser;
    }

    public String getInternet() {
        return internet;
    }

    public String getFax() {
        return fax;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getTel() {
        return tel;
    }
}
