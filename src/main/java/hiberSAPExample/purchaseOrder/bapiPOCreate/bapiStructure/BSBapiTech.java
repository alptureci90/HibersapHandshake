package hiberSAPExample.purchaseOrder.bapiPOCreate.bapiStructure;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

/**
 * BAPITECH
 */
@BapiStructure
public class BSBapiTech {

    @Parameter("NO_PRICE_FROM_PO")
    private String noPriceFromPO;

    @Parameter("NO_MESSAGING")
    private String noMessaging;

    @Parameter("NO_MESSAGE_REQ")
    private String noMessageReq;

    @Parameter("NO_AUTHORITY")
    private String noAuthority;

    public String getNoPriceFromPO() {
        return noPriceFromPO;
    }

    public void setNoPriceFromPO(String noPriceFromPO) {
        this.noPriceFromPO = noPriceFromPO;
    }

    public String getNoMessaging() {
        return noMessaging;
    }

    public void setNoMessaging(String noMessaging) {
        this.noMessaging = noMessaging;
    }

    public String getNoMessageReq() {
        return noMessageReq;
    }

    public void setNoMessageReq(String noMessageReq) {
        this.noMessageReq = noMessageReq;
    }

    public String getNoAuthority() {
        return noAuthority;
    }

    public void setNoAuthority(String noAuthority) {
        this.noAuthority = noAuthority;
    }
}
