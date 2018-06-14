package hiberSAPExample.Vendor;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Convert;
import org.hibersap.annotations.Parameter;
import org.hibersap.conversion.CharConverter;

import java.util.Date;

@BapiStructure
public class BapiVendorConverter {

    @Parameter("VENDOR")
    private String vendor;

    @Parameter("NAME")
    private String name;

    @Parameter("NAME_2")
    private String name2;

    @Parameter("NAME_3")
    private String name3;

    @Parameter("NAME_4")
    private String name4;

    @Parameter("CITY")
    private String city;

    @Parameter("DISTRICT")
    private String district;

    @Parameter("PO_BOX")
    private String poBox;

    @Parameter("POBX_PCD")
    private String pobxPcd;

    @Parameter("POSTL_CODE")
    private String postl_code;

    @Parameter("REG")
    private String reg;

    @Parameter("STREET")
    private String street;

    @Parameter("COU")
    private String cou;

    @Parameter("CO")
    private String co;

    @Parameter("POBX_CTY")
    private String pobxCty;

    @Parameter("LA")
    private String la;

    @Parameter("TELEPHONE")
    private String telephone;

    @Parameter("FORMOFADDR")
    private String formOfAddr;

    @Parameter("TELEPHONE2")
    private String telephone2;

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public String getName2() {
        return name2;
    }

    public String getName3() {
        return name3;
    }

    public String getName4() {
        return name4;
    }

    public String getCity() {
        return city;
    }

    public String getDistrict() {
        return district;
    }

    public String getPoBox() {
        return poBox;
    }

    public String getPobxPcd() {
        return pobxPcd;
    }

    public String getPostl_code() {
        return postl_code;
    }

    public String getReg() {
        return reg;
    }

    public String getStreet() {
        return street;
    }

    public String getCou() {
        return cou;
    }

    public String getCo() {
        return co;
    }

    public String getPobxCty() {
        return pobxCty;
    }

    public String getLa() {
        return la;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getFormOfAddr() {
        return formOfAddr;
    }

    public String getTelephone2() {
        return telephone2;
    }
}
