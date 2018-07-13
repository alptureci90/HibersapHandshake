package hiberSAPExample.purchaseOrder.bapiPOCreate1.bapiStructure;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Convert;
import org.hibersap.annotations.Parameter;
import org.hibersap.conversion.BooleanConverter;

/**
 * *"     VALUE(POHEADERX) LIKE  BAPIMEPOHEADERX STRUCTURE
 * *"        BAPIMEPOHEADERX OPTIONAL
 */

@BapiStructure
public class BSPOHeaderX {


    // Updated information in related user data field
    @Parameter("COMP_CODE")
    
    private String compCodeX;

    //
    @Parameter("DOC_TYPE")
    
    private String docTypeX;

    //
    @Parameter("CREAT_DATE")
    
    private String createdDateX;

    //
    @Parameter("CREATED_BY")
    
    private String createdByX;

    //
    @Parameter("VENDOR")
    
    private String vendorX;

    //
    @Parameter("PURCH_ORG")
    
    private String purchOrgX;

    //
    @Parameter("PUR_GROUP")
    
    private String purchGroupX;

    //
    @Parameter("CURRENCY")
    
    private String currencyX;

    @Parameter("DOC_DATE")
    
    private String docDateX;

    public String getCompCodeX() {
        return compCodeX;
    }

    public void setCompCodeX(String compCodeX) {
        this.compCodeX = compCodeX;
    }

    public String getDocTypeX() {
        return docTypeX;
    }

    public void setDocTypeX(String docTypeX) {
        this.docTypeX = docTypeX;
    }

    public String getCreatedDateX() {
        return createdDateX;
    }

    public void setCreatedDateX(String createdDateX) {
        this.createdDateX = createdDateX;
    }

    public String getCreatedByX() {
        return createdByX;
    }

    public void setCreatedByX(String createdByX) {
        this.createdByX = createdByX;
    }

    public String getVendorX() {
        return vendorX;
    }

    public void setVendorX(String vendorX) {
        this.vendorX = vendorX;
    }

    public String getPurchOrgX() {
        return purchOrgX;
    }

    public void setPurchOrgX(String purchOrgX) {
        this.purchOrgX = purchOrgX;
    }

    public String getPurchGroupX() {
        return purchGroupX;
    }

    public void setPurchGroupX(String purchGroupX) {
        this.purchGroupX = purchGroupX;
    }

    public String getCurrencyX() {
        return currencyX;
    }

    public void setCurrencyX(String currencyX) {
        this.currencyX = currencyX;
    }

    public String getDocDateX() {
        return docDateX;
    }

    public void setDocDateX(String docDateX) {
        this.docDateX = docDateX;
    }
}
