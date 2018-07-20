package hiberSAPExample.vendor;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

@BapiStructure
public class Vendor {

    @Parameter("VENDOR_NO")
    private String vendor;

    @Parameter("NAME")
    private String name;


    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public void setName(String name) {
        this.name = name;
    }
}
