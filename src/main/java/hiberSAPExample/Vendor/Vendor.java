package hiberSAPExample.Vendor;

import java.util.Date;
import org.hibersap.*;
import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;
import org.hibersap.util.DateUtil;

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
