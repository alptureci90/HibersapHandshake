package hiberSAPExample.purchaseOrder.bapiPOCreate1;

import hiberSAPExample.superBapi.SuperBapi;
import hiberSAPExample.purchaseOrder.bapiPOCreate1.bapiStructure.*;
import hiberSAPExample.utilities.BapiRet2;
import org.hibersap.annotations.*;

import java.util.List;


@Bapi("BAPI_PO_CREATE1")
public class PurchaseOrderCreate1 extends SuperBapi {

    // === IMPORT === //

    /**
     *  VALUE(POHEADER) LIKE  BAPIMEPOHEADER STRUCTURE  BAPIMEPOHEADER
     */
    @Import
    @Parameter(value = "POHEADER", type = ParameterType.STRUCTURE)
    private BSPOHeader poHeader;

    /**
     * *"     VALUE(POHEADERX) LIKE  BAPIMEPOHEADERX STRUCTURE
     * *"        BAPIMEPOHEADERX OPTIONAL
     */
    @Import
    @Parameter(value = "POHEADERX", type = ParameterType.STRUCTURE)
    private BSPOHeaderX poHeaderX;

    // === EXPORT PARAMETERS=== //

    /**
     * VALUE(EXPPURCHASEORDER) LIKE  BAPIMEPOHEADER-PO_NUMBER
     */
    @Export
    @Parameter("EXPPURCHASEORDER")
    private String poGeneratedPONumber;

    /**
     *VALUE(EXPHEADER) LIKE  BAPIMEPOHEADER STRUCTURE  BAPIMEPOHEADER
     */
    @Export
    @Parameter(value = "EXPHEADER", type = ParameterType.STRUCTURE)
    private BSPOHeader exportPOHeader;


    // === TABLES === //

    /**
     *   RETURN STRUCTURE  BAPIRET2 OPTIONAL
     */
    @Table
    @Parameter(value = "RETURN", type = ParameterType.STRUCTURE)
    private List<BapiRet2> poResultList;

    /**
     * IMPORT TABLE
     * POITEM STRUCTURE  BAPIMEPOITEM OPTIONAL
     */
    @Table
    @Parameter(value = "POITEM", type = ParameterType.STRUCTURE)
    private List<BSPOItem> poItemList;

    /**
     * IMPORT TABLE
     * POITEMX STRUCTURE  BAPIMEPOITEMX OPTIONAL
     */
    @Table
    @Parameter(value = "POITEMX", type = ParameterType.STRUCTURE)
    private List<BSPOItemX> poItemXList;

    /**
     * IMPORT TABLE
     * POACCOUNT STRUCTURE  BAPIMEPOACCOUNT OPTIONAL
     */
    @Table
    @Parameter(value = "POACCOUNT", type = ParameterType.STRUCTURE)
    private List<BSPOAccount> poAccountList;

    /**
     * IMPORT TABLE
     * POACCOUNTX STRUCTURE  BAPIMEPOACCOUNTX OPTIONAL
     */
    @Table
    @Parameter(value = "POACCOUNTX", type = ParameterType.STRUCTURE)
    private List<BSPOAccountX> poAccountXList;


    // === GETTER & SETTER === //


    public BSPOHeader getPoHeader() {
        return poHeader;
    }

    public void setPoHeader(BSPOHeader poHeader) {
        this.poHeader = poHeader;
    }

    public BSPOHeaderX getPoHeaderX() {
        return poHeaderX;
    }

    public void setPoHeaderX(BSPOHeaderX poHeaderX) {
        this.poHeaderX = poHeaderX;
    }

    public String getPoGeneratedPONumber() {
        return poGeneratedPONumber;
    }

    public void setPoGeneratedPONumber(String poGeneratedPONumber) {
        this.poGeneratedPONumber = poGeneratedPONumber;
    }

    public BSPOHeader getExportPOHeader() {
        return exportPOHeader;
    }

    public void setExportPOHeader(BSPOHeader exportPOHeader) {
        this.exportPOHeader = exportPOHeader;
    }

    public List<BapiRet2> getPoResultList() {
        return poResultList;
    }

    public void setPoResultList(List<BapiRet2> poResultList) {
        this.poResultList = poResultList;
    }

    public List<BSPOItem> getPoItemList() {
        return poItemList;
    }

    public void setPoItemList(List<BSPOItem> poItemList) {
        this.poItemList = poItemList;
    }

    public List<BSPOItemX> getPoItemXList() {
        return poItemXList;
    }

    public void setPoItemXList(List<BSPOItemX> poItemXList) {
        this.poItemXList = poItemXList;
    }

    public List<BSPOAccount> getPoAccountList() {
        return poAccountList;
    }

    public void setPoAccountList(List<BSPOAccount> poAccountList) {
        this.poAccountList = poAccountList;
    }

    public List<BSPOAccountX> getPoAccountXList() {
        return poAccountXList;
    }

    public void setPoAccountXList(List<BSPOAccountX> poAccountXList) {
        this.poAccountXList = poAccountXList;
    }
}
