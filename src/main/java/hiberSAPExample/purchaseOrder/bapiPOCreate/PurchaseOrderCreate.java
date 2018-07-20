package hiberSAPExample.purchaseOrder.bapiPOCreate;

import hiberSAPExample.superBapi.SuperBapi;
import hiberSAPExample.purchaseOrder.bapiPOCreate.bapiStructure.*;
import hiberSAPExample.utilities.BSBapiParex;
import hiberSAPExample.utilities.BapiRet2;
import org.hibersap.annotations.*;

import java.util.List;

@Bapi("BAPI_PO_CREATE")
public class PurchaseOrderCreate extends SuperBapi {

    // ===IMPORT=== //
    @Import
    @Parameter(value = "PO_HEADER", type = ParameterType.STRUCTURE)
    private BSPOHeader poHeader;

    // Optional
    @Import
    @Parameter(value = "PO_HEADER_ADD_DATA",type = ParameterType.STRUCTURE)
    private BSPOHeaderAddData poHeaderAddData;

    /**
     * VALUE(HEADER_ADD_DATA_RELEVANT) LIKE  BAPIMMPARA-SELECTION
     * OPTIONAL
     */
    @Import
    @Parameter("HEADER_ADD_DATA_RELEVANT")
    private String bspoHeaderAddDataRelevant;

    /**
     * VALUE(PO_ADDRESS) LIKE  BAPIADDRESS STRUCTURE  BAPIADDRESS
     * OPTIONAL
     */
    @Import
    @Parameter(value = "PO_ADDRESS", type = ParameterType.STRUCTURE)
    private BSPOAddress poAddress;

    /**
     * VALUE(SKIP_ITEMS_WITH_ERROR) LIKE  BAPIMMPARA-SELECTION DEFAULT 'X'
     */
    @Import
    @Parameter("SKIP_ITEMS_WITH_ERROR")
    private String skipItemsWithError;

    /**
     * VALUE(ITEM_ADD_DATA_RELEVANT) LIKE  BAPIMMPARA-SELECTION
     * OPTIONAL
     */
    @Import
    @Parameter("ITEM_ADD_DATA_RELEVANT")
    private  String itemAddDataRelevant;

    /**
     * VALUE(HEADER_TECH_FIELDS) LIKE  BAPITECH STRUCTURE  BAPITECH
     * OPTIONAL
     */
    @Import
    @Parameter(value = "HEADER_TECH_FIELDS", type = ParameterType.STRUCTURE)
    private BSBapiTech bapiTech;

    // ===EXPORT=== //
    /**
     * *"  EXPORTING
     * *"     VALUE(PURCHASEORDER) LIKE  BAPIEKKOC-PO_NUMBER
     */
    @Export
    @Parameter("PURCHASEORDER")
    private String bsExportPurchaseOrder;

    // ===TABLE=== //
    /**
     * PO_ITEMS STRUCTURE  BAPIEKPOC
     */
    @Table
    @Parameter(value = "PO_ITEMS", type = ParameterType.STRUCTURE)
    private List<BSPOItems> bspoItems;

    /**
     * PO_ITEM_ADD_DATA STRUCTURE  BAPIEKPOA OPTIONAL
     */
    @Table
    @Parameter(value = "PO_ITEM_ADD_DATA", type = ParameterType.STRUCTURE)
    private List<BSPOItemAddData> bspoItemAddData;

    /**
     * PO_ITEM_SCHEDULES STRUCTURE  BAPIEKET
     */
    @Table
    @Parameter(value = "PO_ITEM_SCHEDULES", type = ParameterType.STRUCTURE)
    private List<BSPOItemSchedules> bspoItemSchedules;

    /**
     * PO_ITEM_ACCOUNT_ASSIGNMENT STRUCTURE  BAPIEKKN OPTIONAL
     */
    @Table
    @Parameter(value = "PO_ITEM_ACCOUNT_ASSIGNMENT", type = ParameterType.STRUCTURE)
    private List<BSPOItemAccountAssignment> bspoItemAccountAssignment;

    /**
     * PO_ITEM_TEXT STRUCTURE  BAPIEKPOTX OPTIONAL
     */
    @Table
    @Parameter(value = "PO_ITEM_TEXT", type = ParameterType.STRUCTURE)
    private List<BSPOItemText> bspoItemText;

    /**
     * RETURN STRUCTURE  BAPIRETURN OPTIONAL
     */
    @Table
    @Parameter(value = "RETURN", type = ParameterType.STRUCTURE)
    private List<BapiRet2> bapiRet2;

    /**
     * PO_LIMITS STRUCTURE  BAPIESUHC OPTIONAL
     */
    @Table
    @Parameter(value = "PO_LIMITS", type = ParameterType.STRUCTURE)
    private List<BSPOLimits> bspoLimits;

    /**
     * PO_CONTRACT_LIMITS STRUCTURE  BAPIESUCC OPTIONAL
     */
    @Table
    @Parameter(value = "PO_CONTRACT_LIMITS", type = ParameterType.STRUCTURE)
    private List<BSPOContractLimits> bspoContractLimits;

    /**
     * PO_SERVICES STRUCTURE  BAPIESLLC OPTIONAL
     */
    @Table
    @Parameter(value = "PO_SERVICES", type = ParameterType.STRUCTURE)
    private List<BSPOServices> bspoServices;

    /**
     * PO_SRV_ACCASS_VALUES STRUCTURE  BAPIESKLC OPTIONAL
     */
    @Table
    @Parameter(value = "PO_SRV_ACCASS_VALUES", type = ParameterType.STRUCTURE)
    private List<BSPOSrvAccassValues> bspoSrvAccassValues;

    /**
     * PO_SERVICES_TEXT STRUCTURE  BAPIESLLTX OPTIONAL
     */
    @Table
    @Parameter(value = "PO_SERVICES_TEXT", type = ParameterType.STRUCTURE)
    private List<BSPOServicesText> bspoServicesText;

    /**
     * PO_BUSINESS_PARTNER STRUCTURE  BAPIEKKOP OPTIONAL
     */
    @Table
    @Parameter(value = "PO_BUSINESS_PARTNER", type = ParameterType.STRUCTURE)
    private List<BSPOBusinessPartner> bspoBusinessPartner;

    /**
     * EXTENSIONIN STRUCTURE  BAPIPAREX OPTIONAL
     */
    @Table
    @Parameter(value = "EXTENSIONIN", type = ParameterType.STRUCTURE)
    private List<BSBapiParex> bsBapiParex;

    /**
     * POADDRDELIVERY STRUCTURE  BAPIMEPOADDRDELIVERY OPTIONAL
     */
    @Table
    @Parameter(value = "POADDRDELIVERY", type = ParameterType.STRUCTURE)
    private List<BSPOAddressDelivery> bspoAddressDelivery;


    // ============= GETTER & SETTER ============== //


    public BSPOHeader getPoHeader() {
        return poHeader;
    }

    public void setPoHeader(BSPOHeader poHeader) {
        this.poHeader = poHeader;
    }

    public BSPOHeaderAddData getPoHeaderAddData() {
        return poHeaderAddData;
    }

    public void setPoHeaderAddData(BSPOHeaderAddData poHeaderAddData) {
        this.poHeaderAddData = poHeaderAddData;
    }

    public String getBspoHeaderAddDataRelevant() {
        return bspoHeaderAddDataRelevant;
    }

    public void setBspoHeaderAddDataRelevant(String bspoHeaderAddDataRelevant) {
        this.bspoHeaderAddDataRelevant = bspoHeaderAddDataRelevant;
    }

    public BSPOAddress getPoAddress() {
        return poAddress;
    }

    public void setPoAddress(BSPOAddress poAddress) {
        this.poAddress = poAddress;
    }

    public String getSkipItemsWithError() {
        return skipItemsWithError;
    }

    public void setSkipItemsWithError(String skipItemsWithError) {
        this.skipItemsWithError = skipItemsWithError;
    }

    public String getItemAddDataRelevant() {
        return itemAddDataRelevant;
    }

    public void setItemAddDataRelevant(String itemAddDataRelevant) {
        this.itemAddDataRelevant = itemAddDataRelevant;
    }

    public BSBapiTech getBapiTech() {
        return bapiTech;
    }

    public void setBapiTech(BSBapiTech bapiTech) {
        this.bapiTech = bapiTech;
    }

    public String getBsExportPurchaseOrder() {
        return bsExportPurchaseOrder;
    }

    public void setBsExportPurchaseOrder(String bsExportPurchaseOrder) {
        this.bsExportPurchaseOrder = bsExportPurchaseOrder;
    }

    public List<BSPOItems> getBspoItems() {
        return bspoItems;
    }

    public void setBspoItems(List<BSPOItems> bspoItems) {
        this.bspoItems = bspoItems;
    }

    public List<BSPOItemAddData> getBspoItemAddData() {
        return bspoItemAddData;
    }

    public void setBspoItemAddData(List<BSPOItemAddData> bspoItemAddData) {
        this.bspoItemAddData = bspoItemAddData;
    }

    public List<BSPOItemSchedules> getBspoItemSchedules() {
        return bspoItemSchedules;
    }

    public void setBspoItemSchedules(List<BSPOItemSchedules> bspoItemSchedules) {
        this.bspoItemSchedules = bspoItemSchedules;
    }

    public List<BSPOItemAccountAssignment> getBspoItemAccountAssignment() {
        return bspoItemAccountAssignment;
    }

    public void setBspoItemAccountAssignment(List<BSPOItemAccountAssignment> bspoItemAccountAssignment) {
        this.bspoItemAccountAssignment = bspoItemAccountAssignment;
    }

    public List<BSPOItemText> getBspoItemText() {
        return bspoItemText;
    }

    public void setBspoItemText(List<BSPOItemText> bspoItemText) {
        this.bspoItemText = bspoItemText;
    }

    public List<BapiRet2> getBapiRet2() {
        return bapiRet2;
    }

    public void setBapiRet2(List<BapiRet2> bapiRet2) {
        this.bapiRet2 = bapiRet2;
    }

    public List<BSPOLimits> getBspoLimits() {
        return bspoLimits;
    }

    public void setBspoLimits(List<BSPOLimits> bspoLimits) {
        this.bspoLimits = bspoLimits;
    }

    public List<BSPOContractLimits> getBspoContractLimits() {
        return bspoContractLimits;
    }

    public void setBspoContractLimits(List<BSPOContractLimits> bspoContractLimits) {
        this.bspoContractLimits = bspoContractLimits;
    }

    public List<BSPOServices> getBspoServices() {
        return bspoServices;
    }

    public void setBspoServices(List<BSPOServices> bspoServices) {
        this.bspoServices = bspoServices;
    }

    public List<BSPOSrvAccassValues> getBspoSrvAccassValues() {
        return bspoSrvAccassValues;
    }

    public void setBspoSrvAccassValues(List<BSPOSrvAccassValues> bspoSrvAccassValues) {
        this.bspoSrvAccassValues = bspoSrvAccassValues;
    }

    public List<BSPOServicesText> getBspoServicesText() {
        return bspoServicesText;
    }

    public void setBspoServicesText(List<BSPOServicesText> bspoServicesText) {
        this.bspoServicesText = bspoServicesText;
    }

    public List<BSPOBusinessPartner> getBspoBusinessPartner() {
        return bspoBusinessPartner;
    }

    public void setBspoBusinessPartner(List<BSPOBusinessPartner> bspoBusinessPartner) {
        this.bspoBusinessPartner = bspoBusinessPartner;
    }

    public List<BSBapiParex> getBsBapiParex() {
        return bsBapiParex;
    }

    public void setBsBapiParex(List<BSBapiParex> bsBapiParex) {
        this.bsBapiParex = bsBapiParex;
    }

    public List<BSPOAddressDelivery> getBspoAddressDelivery() {
        return bspoAddressDelivery;
    }

    public void setBspoAddressDelivery(List<BSPOAddressDelivery> bspoAddressDelivery) {
        this.bspoAddressDelivery = bspoAddressDelivery;
    }
}
