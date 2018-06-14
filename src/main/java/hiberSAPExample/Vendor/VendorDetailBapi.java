package hiberSAPExample.Vendor;

import hiberSAPExample.utilities.BapiRet2;
import org.hibersap.annotations.*;


@Bapi("BAPI_VENDOR_GETDETAIL")
public class VendorDetailBapi {

    @Import
    @Parameter("VENDORNO")
    private final String vendorNo;

    @Import
    @Parameter("COMPANYCODE")
    private final String companyCode;

    @Export
    @Parameter(value="RETURN", type = ParameterType.STRUCTURE)
    private BapiRet2 returnData;

    @Export
    @Parameter(value = "GENERALDETAIL", type = ParameterType.STRUCTURE)
    private BapiVendorConverter generalDetail;


    @Export
    @Parameter(value = "COMPANYDETAIL", type = ParameterType.STRUCTURE)
    private BapiVendorCompanyConverter vendorCompanyConverter;

    public VendorDetailBapi(String vendorNo,
                          String companyCode) {

        this.vendorNo = vendorNo;
        this.companyCode = companyCode;
    }

    public String getVendorNo() {
        return this.vendorNo;
    }

    public String getCompanyCode() {
        return this.companyCode;
    }

    public BapiRet2 getReturnData() {
        return this.returnData;
    }

    public BapiVendorConverter getGeneralDetail() {
        return generalDetail;
    }

    public BapiVendorCompanyConverter getVendorCompanyConverter() {
        return vendorCompanyConverter;
    }
}
