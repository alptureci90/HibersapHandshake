package hiberSAPExample.purchaseOrder.bapiPOCreate1.bapiStructure;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Convert;
import org.hibersap.annotations.Parameter;
import org.hibersap.conversion.BooleanConverter;

/**
 * IMPORT TABLE
 * POACCOUNTX STRUCTURE  BAPIMEPOACCOUNTX OPTIONAL
 */
@BapiStructure
public class BSPOAccountX {

    // Item Number of Purchasing Document
    @Parameter("PO_ITEM")
    private String poItem;

    // Sequential Number of Account Assignment
    @Parameter("SERIAL_NO")
    private String serialNumber;

    //
    @Parameter("PO_ITEMX")
    private String poItemX;

    //
    @Parameter("CREAT_DATE")
    private String createDateX;

    //
    @Parameter("QUANTITY")
    private String quantityX;

    //
    @Parameter("GL_ACCOUNT")
    private String glAccountX;

    //
    @Parameter("COSTCENTER")
    private String costCenterX;


    public String getPoItem() {
        return poItem;
    }

    public void setPoItem(String poItem) {
        this.poItem = poItem;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getPoItemX() {
        return poItemX;
    }

    public void setPoItemX(String poItemX) {
        this.poItemX = poItemX;
    }

    public String getCreateDateX() {
        return createDateX;
    }

    public void setCreateDateX(String createDateX) {
        this.createDateX = createDateX;
    }

    public String getQuantityX() {
        return quantityX;
    }

    public void setQuantityX(String quantityX) {
        this.quantityX = quantityX;
    }

    public String getGlAccountX() {
        return glAccountX;
    }

    public void setGlAccountX(String glAccountX) {
        this.glAccountX = glAccountX;
    }

    public String getCostCenterX() {
        return costCenterX;
    }

    public void setCostCenterX(String costCenterX) {
        this.costCenterX = costCenterX;
    }
}
