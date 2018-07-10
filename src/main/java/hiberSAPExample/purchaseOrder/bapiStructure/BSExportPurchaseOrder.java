package hiberSAPExample.purchaseOrder.bapiStructure;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

/**
 * PURCHASEORDER
 *
 * EXPORTING
 * VALUE(PURCHASEORDER) LIKE  BAPIEKKOC-PO_NUMBER
 */

@BapiStructure
public class BSExportPurchaseOrder {

    // Purchasing Document Number
    @Parameter("PO_NUMBER")
    private String poNumber;

    // Supplying (issuing) plant in case of stock transport order
    @Parameter("SUPPL_PLNT")
    private String supplyingPlant;

    // Name of Person Who Created the Object
    @Parameter("CREATED_BY")
    private String createdBy;

    // Language Key
    @Parameter("LANGU")
    private String language;

    // ISO code for language key
    @Parameter("LANGU_ISO")
    private String languageISO;

    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }

    public String getSupplyingPlant() {
        return supplyingPlant;
    }

    public void setSupplyingPlant(String supplyingPlant) {
        this.supplyingPlant = supplyingPlant;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguageISO() {
        return languageISO;
    }

    public void setLanguageISO(String languageISO) {
        this.languageISO = languageISO;
    }
}
