package hiberSAPExample.Invoice;


import hiberSAPExample.Bapi.SuperBapi;
import hiberSAPExample.Invoice.bapiStructure.*;
import hiberSAPExample.utilities.BSBapiParex;
import hiberSAPExample.utilities.BSAddress;
import hiberSAPExample.utilities.BapiRet2;
import org.hibersap.annotations.*;

import java.util.List;

@Bapi("BAPI_INCOMINGINVOICE_CREATE")
public class IncomingInvoiceCreate extends SuperBapi {

    //===IMPORT===/
    @Import
    @Parameter(value = "HEADERDATA", type = ParameterType.STRUCTURE)
    private BSIncomingInvoiceHeaderData incomingInvoice;

    //OPTIONAL
    @Import
    @Parameter(value = "ADDRESSDATA", type = ParameterType.STRUCTURE)
    private BSAddress invoiceAddress;

    //===EXPORT===//
    @Export
    //@Parameter(value = "INVOICEDOCNUMBER", type = ParameterType.STRUCTURE)
    @Parameter("INVOICEDOCNUMBER")
    private String invoiceDocNumber;// BSInvoiceDetailHeader headerData;

    @Export
    //@Parameter(value = "FISCALYEAR", type = ParameterType.STRUCTURE)
    @Parameter("FISCALYEAR")
    private String fiscalYear; //BSFiscalYear fiscalYear;

    //===TABLE===//
    @Table
    @Parameter("ITEMDATA")
    private List<BSItemData> itemData;

    // OPTIONAL
    @Table
    @Parameter("ACCOUNTINGDATA")
    private List<BSAccountingData> accountingData;

    // OPTIONAL
    @Table
    @Parameter("GLACCOUNTDATE")
    private List<BSGLAccountData> glAccountData;

    // OPTIONAL
    @Table
    @Parameter("MATERIALDATA")
    private List<BSMaterialData> materialData;

    // OPTIONAL
    @Table
    @Parameter("TAXDATA")
    private List<BSTaxData> taxData;

    // OPTIONAL
    @Table
    @Parameter("WITHTAXDATA")
    private List<BSWithTaxData> withTaxData;

    // OPTIONAL
    @Table
    @Parameter("VENDORITEMSPLITDATA")
    private List<BSVendorItemSplitData> vendorItemSplitData;

    @Table
    @Parameter("RETURN")
    private List<BapiRet2> bapiRet2;

    //OPTIONAL
    @Table
    @Parameter("EXTENSIONIN")
    private List<BSBapiParex> bapiParex;

    public BSIncomingInvoiceHeaderData getIncomingInvoice() {
        return incomingInvoice;
    }

    public void setIncomingInvoice( BSIncomingInvoiceHeaderData incomingInvoice) {
        this.incomingInvoice = incomingInvoice;
    }

    public BSAddress getInvoiceAddress() {
        return invoiceAddress;
    }

    public void setInvoiceAddress(BSAddress invoiceAddress) {
        this.invoiceAddress = invoiceAddress;
    }

    public String getInvoiceDocNumber(){ //BSInvoiceDetailHeader getHeaderData() {
        return invoiceDocNumber;
    }

    public void setHeaderData(String invoiceDocNumber){ //BSInvoiceDetailHeader invoiceDocNumber) {
        this.invoiceDocNumber = invoiceDocNumber;
    }

    public String getFiscalYear(){  //BSFiscalYear getFiscalYear() {
        return fiscalYear;
    }

    public void setFiscalYear(String fiscaYear){ //BSFiscalYear fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    public List<BSItemData> getItemData() {
        return itemData;
    }

    public void setItemData(List<BSItemData> itemData) {
        this.itemData = itemData;
    }

    public List<BSAccountingData> getAccountingData() {
        return accountingData;
    }

    public void setAccountingData(List<BSAccountingData> accountingData) {
        this.accountingData = accountingData;
    }

    public List<BSGLAccountData> getGlAccountData() {
        return glAccountData;
    }

    public void setGlAccountData(List<BSGLAccountData> glAccountData) {
        this.glAccountData = glAccountData;
    }

    public List<BSMaterialData> getMaterialData() {
        return materialData;
    }

    public void setMaterialData(List<BSMaterialData> materialData) {
        this.materialData = materialData;
    }

    public List<BSTaxData> getTaxData() {
        return taxData;
    }

    public void setTaxData(List<BSTaxData> taxData) {
        this.taxData = taxData;
    }

    public List<BSWithTaxData> getWithTaxData() {
        return withTaxData;
    }

    public void setWithTaxData(List<BSWithTaxData> withTaxData) {
        this.withTaxData = withTaxData;
    }

    public List<BSVendorItemSplitData> getVendorItemSplitData() {
        return vendorItemSplitData;
    }

    public void setVendorItemSplitData(List<BSVendorItemSplitData> vendorItemSplitData) {
        this.vendorItemSplitData = vendorItemSplitData;
    }

    public List<BapiRet2> getBapiRet2() {
        return bapiRet2;
    }

    public void setBapiRet2(List<BapiRet2> bapiRet2) {
        this.bapiRet2 = bapiRet2;
    }

    public List<BSBapiParex> getBapiParex() {
        return bapiParex;
    }

    public void setBapiParex(List<BSBapiParex> bapiParex) {
        this.bapiParex = bapiParex;
    }
}
