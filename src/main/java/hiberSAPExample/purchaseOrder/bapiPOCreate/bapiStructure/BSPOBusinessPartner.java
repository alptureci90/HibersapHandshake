package hiberSAPExample.purchaseOrder.bapiPOCreate.bapiStructure;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

/**
 * PO_BUSINESS_PARTNER STRUCTURE  BAPIEKKOP OPTIONAL
 */
@BapiStructure
public class BSPOBusinessPartner {


    // Language-specific description of partner function
    @Parameter("PARTNERDESC")
    private String partnerDesc;

    // Language Key
    @Parameter("LANGU")
    private String language;

    // Number of a Business Partner in vendor Master Record
    @Parameter("BUSPARTNO")
    private String businessPartnerNumber;

    // Deletion Indicator
    @Parameter("DELETE_IND")
    private String deleteInd;

    public String getPartnerDesc() {
        return partnerDesc;
    }

    public void setPartnerDesc(String partnerDesc) {
        this.partnerDesc = partnerDesc;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getBusinessPartnerNumber() {
        return businessPartnerNumber;
    }

    public void setBusinessPartnerNumber(String businessPartnerNumber) {
        this.businessPartnerNumber = businessPartnerNumber;
    }

    public String getDeleteInd() {
        return deleteInd;
    }

    public void setDeleteInd(String deleteInd) {
        this.deleteInd = deleteInd;
    }
}
