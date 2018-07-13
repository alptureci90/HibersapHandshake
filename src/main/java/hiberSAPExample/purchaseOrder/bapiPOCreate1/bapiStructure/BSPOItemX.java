package hiberSAPExample.purchaseOrder.bapiPOCreate1.bapiStructure;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Convert;
import org.hibersap.annotations.Parameter;
import org.hibersap.conversion.BooleanConverter;

import java.math.BigDecimal;

/**
 * POITEMX STRUCTURE  BAPIMEPOITEMX OPTIONAL
 */
@BapiStructure
public class BSPOItemX {


    // Item Number of Purchasing Document
    @Parameter("PO_ITEM")
    private String poItem;

    // Updated information in related user data field
    @Parameter("PO_ITEMX")
    private String poItemX;

    //
    @Parameter("SHORT_TEXT")
    private String shortText;

    //
    @Parameter("MATERIAL")
    private String material;

    //
    @Parameter("PLANT")
    private String plant;

    //
    @Parameter("MATL_GROUP")
    private String materialGroup;

    //
    @Parameter("QUANTITY")
    private String quantity;

    //
    @Parameter("PO_UNIT")
    private String poUnit;

    //
    @Parameter("NET_PRICE")
    private String netPrice;

    //
    @Parameter("PRICE_UNIT")
    private String priceUnit;

    //
    @Parameter("NO_MORE_GR")
    private String deliveryCompletedIndicator;

    //
    @Parameter("ACCTASSCAT")
    private String accountAssignmentCategory;


    public String getPoItem() {
        return poItem;
    }

    public void setPoItem(String poItem) {
        this.poItem = poItem;
    }

    public String getPoItemX() {
        return poItemX;
    }

    public void setPoItemX(String poItemX) {
        this.poItemX = poItemX;
    }

    public String getShortText() {
        return shortText;
    }

    public void setShortText(String shortText) {
        this.shortText = shortText;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPlant() {
        return plant;
    }

    public void setPlant(String plant) {
        this.plant = plant;
    }

    public String getMaterialGroup() {
        return materialGroup;
    }

    public void setMaterialGroup(String materialGroup) {
        this.materialGroup = materialGroup;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPoUnit() {
        return poUnit;
    }

    public void setPoUnit(String poUnit) {
        this.poUnit = poUnit;
    }

    public String getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(String netPrice) {
        this.netPrice = netPrice;
    }

    public String getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(String priceUnit) {
        this.priceUnit = priceUnit;
    }

    public String getDeliveryCompletedIndicator() {
        return deliveryCompletedIndicator;
    }

    public void setDeliveryCompletedIndicator(String deliveryCompletedIndicator) {
        this.deliveryCompletedIndicator = deliveryCompletedIndicator;
    }

    public String getAccountAssignmentCategory() {
        return accountAssignmentCategory;
    }

    public void setAccountAssignmentCategory(String accountAssignmentCategory) {
        this.accountAssignmentCategory = accountAssignmentCategory;
    }
}
