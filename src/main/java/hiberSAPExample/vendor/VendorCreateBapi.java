package hiberSAPExample.vendor;


import hiberSAPExample.superBapi.SuperBapi;
import hiberSAPExample.utilities.BapiRet2;
import org.hibersap.annotations.Bapi;
import org.hibersap.annotations.Export;
import org.hibersap.annotations.Parameter;
import org.hibersap.annotations.ParameterType;

@Bapi("BAPI_VENDOR_GETDETAIL")
public class VendorCreateBapi extends SuperBapi {

    @Export
    @Parameter(value="RETURN", type = ParameterType.STRUCTURE)
    private BapiRet2 returnData;

    @Export
    @Parameter(value = "VENDORNO", type = ParameterType.SIMPLE)
    private String vendorNo;


    @Export
    @Parameter(value = "VENDOR", type = ParameterType.SIMPLE)
    private String vendor;


    public BapiRet2 getReturnData() {
        return returnData;
    }

    public void setReturnData(BapiRet2 returnData) {
        this.returnData = returnData;
    }

    public String getVendorNo() {
        return vendorNo;
    }

    public void setVendorNo(String vendorNo) {
        this.vendorNo = vendorNo;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    @Override
    public String toString(){

        StringBuffer sb = new StringBuffer();

        sb.append("vendor Create Result: ");
        sb.append(getReturnData().toString());
        sb.append("\nNew vendor No: " + getVendorNo());
        sb.append("\nNew vendor Name:" + getVendor());

        return sb.toString();
    }
}
