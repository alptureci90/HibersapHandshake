package hiberSAPExample.purchaseOrder.bapiStructure;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

/**
 * HEADER_ADD_DATA_RELEVANT
 */
@BapiStructure
public class BSBapiMMParaSelection {

    // Selection Flag
    @Parameter("SELECTION")
    private String selection;

    // Release Group
    @Parameter("REL_GROUP")
    private String releaseGroup;

    // Purchase Requisition Release Code
    @Parameter("REL_CODE")
    private String purchaseRequisitionReleaseCode;

    // Release Status / State
    @Parameter("REL_STATUS")
    private String releaseStatus;

    // Release Code
    @Parameter("PO_REL_CODE")
    private String releaseCode;

    // Purchasing Document Number
    @Parameter("PO_NUMBER")
    private String poNumber;

    // Release Indicator: Purchasing Document
    @Parameter("PO_REL_IND")
    private String purchDocRelIndicator;

    // Release Indicator
    @Parameter("REL_IND")
    private String releaseIndicator;

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
    }

    public String getReleaseGroup() {
        return releaseGroup;
    }

    public void setReleaseGroup(String releaseGroup) {
        this.releaseGroup = releaseGroup;
    }

    public String getPurchaseRequisitionReleaseCode() {
        return purchaseRequisitionReleaseCode;
    }

    public void setPurchaseRequisitionReleaseCode(String purchaseRequisitionReleaseCode) {
        this.purchaseRequisitionReleaseCode = purchaseRequisitionReleaseCode;
    }

    public String getReleaseStatus() {
        return releaseStatus;
    }

    public void setReleaseStatus(String releaseStatus) {
        this.releaseStatus = releaseStatus;
    }

    public String getReleaseCode() {
        return releaseCode;
    }

    public void setReleaseCode(String releaseCode) {
        this.releaseCode = releaseCode;
    }

    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }

    public String getPurchDocRelIndicator() {
        return purchDocRelIndicator;
    }

    public void setPurchDocRelIndicator(String purchDocRelIndicator) {
        this.purchDocRelIndicator = purchDocRelIndicator;
    }

    public String getReleaseIndicator() {
        return releaseIndicator;
    }

    public void setReleaseIndicator(String releaseIndicator) {
        this.releaseIndicator = releaseIndicator;
    }
}
