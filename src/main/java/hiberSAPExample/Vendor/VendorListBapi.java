package hiberSAPExample.Vendor;

import hiberSAPExample.Bapi.SuperBapi;
import hiberSAPExample.utilities.BapiRet2;
import org.hibersap.annotations.*;

import java.util.List;

@Bapi("BBP_VENDOR_GETLIST")
public class VendorListBapi extends SuperBapi {


    public VendorListBapi(String companyCode){
        this.companyCode = companyCode;
    }


    @Import
    @Parameter("COMP_CODE")
    private final String companyCode;

    @Export
    @Parameter(value="RETURN", type = ParameterType.STRUCTURE)
    private BapiRet2 returnData;

    @Table
    @Parameter("VENDOR")
    private List<Vendor> vendorList;

    public String getCompanyCode() {
        return companyCode;
    }

    public BapiRet2 getReturnData() {
        return returnData;
    }

    public List<Vendor> getVendorList() {
        return vendorList;
    }
}
