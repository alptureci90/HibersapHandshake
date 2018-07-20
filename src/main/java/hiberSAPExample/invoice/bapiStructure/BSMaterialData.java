package hiberSAPExample.invoice.bapiStructure;

import org.hibersap.annotations.Parameter;

import java.math.BigDecimal;

/**
 * BAPI_INCINV_CREATE_MATERIAL
 */
public class BSMaterialData {

    //Doc item in invoice
    @Parameter("INVOICE_DOC_ITEM")
    private int invoiceDocItem;

    @Parameter("MATERIAL")
    private String material;

    @Parameter("VAL_AREA")
    private String valuationArea;

    @Parameter("VALUATION_TYPE")
    private String valuationType;

    @Parameter("DB_CR_IND")
    private String dbCrInd; // Debit/Credit Indicator

    @Parameter("ITEM_AMOUNT")
    private BigDecimal itemAmount;

    @Parameter("QUANTITY")
    private BigDecimal quantity;

    @Parameter("BASE_UOM")
    private String baseUom;

    @Parameter("BASE_UOM_ISO")
    private String baseUomIso;

    @Parameter("TAX_CODE")
    private String taxCode;

    @Parameter("TAXJURCODE")
    private String taxJurCode;

    @Parameter("MATERIAL_EXTERNAL")
    private String materialExternal;

    @Parameter("MATERIAL_GUID")
    private String materialGuid;

    @Parameter("MATERIAL_VERSION")
    private String materialVersion;

    public int getInvoiceDocItem() {
        return invoiceDocItem;
    }

    public void setInvoiceDocItem(int invoiceDocItem) {
        this.invoiceDocItem = invoiceDocItem;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getValuationArea() {
        return valuationArea;
    }

    public void setValuationArea(String valuationArea) {
        this.valuationArea = valuationArea;
    }

    public String getValuationType() {
        return valuationType;
    }

    public void setValuationType(String valuationType) {
        this.valuationType = valuationType;
    }

    public String getDbCrInd() {
        return dbCrInd;
    }

    public void setDbCrInd(String dbCrInd) {
        this.dbCrInd = dbCrInd;
    }

    public BigDecimal getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(BigDecimal itemAmount) {
        this.itemAmount = itemAmount;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public String getBaseUom() {
        return baseUom;
    }

    public void setBaseUom(String baseUom) {
        this.baseUom = baseUom;
    }

    public String getBaseUomIso() {
        return baseUomIso;
    }

    public void setBaseUomIso(String baseUomIso) {
        this.baseUomIso = baseUomIso;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getTaxJurCode() {
        return taxJurCode;
    }

    public void setTaxJurCode(String taxJurCode) {
        this.taxJurCode = taxJurCode;
    }

    public String getMaterialExternal() {
        return materialExternal;
    }

    public void setMaterialExternal(String materialExternal) {
        this.materialExternal = materialExternal;
    }

    public String getMaterialGuid() {
        return materialGuid;
    }

    public void setMaterialGuid(String materialGuid) {
        this.materialGuid = materialGuid;
    }

    public String getMaterialVersion() {
        return materialVersion;
    }

    public void setMaterialVersion(String materialVersion) {
        this.materialVersion = materialVersion;
    }
}
