package hiberSAPExample.Invoice;

import hiberSAPExample.Invoice.bapiStructure.BSIncomingInvoiceHeaderData;
import hiberSAPExample.Invoice.bapiStructure.BSItemData;
import hiberSAPExample.sapSessionManager.SAPSessionManager;
import hiberSAPExample.utilities.BapiRet2;
import org.hibersap.session.Session;
import org.hibersap.session.SessionManager;

import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class MainInvoiceAppTest {

    public static void main(String[] args){
        MainInvoiceAppTest test = new MainInvoiceAppTest();
        //test.getInvoiceDetail();
        //test.getInvoiceList();
        test.createInvoice();
    }

    public void getInvoiceDetail(){
        SessionManager sessionManager = SAPSessionManager.createSessionManager();
        Session session = sessionManager.openSession();

        try{
            InvoiceDetailBapi invoiceDetail = new InvoiceDetailBapi("5105601201", "1998");
            session.execute(invoiceDetail);
            showInvoiceDetail(invoiceDetail);
        } finally {
            session.close();
        }
    }

    public void showInvoiceDetail(InvoiceDetailBapi invoiceDetail){

    }

    public void getInvoiceList(){
        SessionManager sessionManager = SAPSessionManager.createSessionManager();
        Session session = sessionManager.openSession();

        try{
            InvoiceListBapi invoiceList = new InvoiceListBapi();
            session.execute(invoiceList);
            showInvoiceList(invoiceList);
        } finally {
            session.close();
        }
    }

    public void showInvoiceList(InvoiceListBapi invoiceList){

    }

    public void createInvoice(){
        {
            IncomingInvoiceCreate createIncomingInvoice = new IncomingInvoiceCreate();
            createIncomingInvoice.setIncomingInvoice(mapIncomingInvoiceHeaderData());

            List<BSItemData> itemList = new LinkedList<>();
            itemList.add(mapIncomingInvoiceItemData());
            createIncomingInvoice.setItemData(itemList);

            try{
                SAPSessionManager.executeSession(createIncomingInvoice);

            } catch (Exception e) {
                System.out.println("Exception in session.Execute for BAPI_INCOMINGINVOICE_CREATE = IncomingInvoiceCreate.java");
                e.printStackTrace();
            }

            showCreateResult(createIncomingInvoice);
        }
    }

    public void showCreateResult(IncomingInvoiceCreate createdInvoice){
        System.out.println("Created Incoming Invoice Document Number:\t" + createdInvoice.getInvoiceDocNumber());
        System.out.println("Created Incoming Invoice Fiscal Year:\t" + createdInvoice.getFiscalYear());
        List<BapiRet2> result = createdInvoice.getBapiRet2();
        System.out.println(result.toString());
    }

    private BSIncomingInvoiceHeaderData mapIncomingInvoiceHeaderData(){
        BSIncomingInvoiceHeaderData bsheaderData = new BSIncomingInvoiceHeaderData();
        IncomingInvoiceHeader header = new IncomingInvoiceHeader();

        try  {

            bsheaderData.setInvoiceInd(header.getInvoiceIndicator());
            bsheaderData.setDocDate(header.getDocDate());
            bsheaderData.setPstngDate(header.getPostingDate());
            bsheaderData.setCompCode(header.getCompCode());
            bsheaderData.setCurrency(header.getCurrency());
            bsheaderData.setGrossAmount(header.getGrossAmount());
            bsheaderData.setCalcTaxInd(header.getCalculateTaxIndicator());

        } catch (Exception e){
            System.out.println("Exception in mapping IncomingInvoice Header Data");
            e.printStackTrace();
        }

        return bsheaderData;
    }

    private BSItemData mapIncomingInvoiceItemData(){

        IncomingInvoiceItemData itemData = new IncomingInvoiceItemData();
        BSItemData bsItemData = new BSItemData();

        try {

            bsItemData.setInvoiceDocItem(itemData.getItemNo());
            bsItemData.setPoNumber(itemData.getPoNumber());
            bsItemData.setPoItem(itemData.getPoItemNo());
            bsItemData.setTaxCode(itemData.getTaxCode());
            bsItemData.setTaxJurCode(itemData.getTaxJurCode());
            bsItemData.setItemAmount(itemData.getItemAmount());
            bsItemData.setQuantity(itemData.getQuantity());
            bsItemData.setPoUnitOfMeasure(itemData.getUnitofMeasure());

        } catch (Exception e){
            System.out.println("Exception in mapping Incoming Invoice Item Data!");
            e.printStackTrace();
        }
        return bsItemData;

    }

    class IncomingInvoiceHeader{

        //  should be 'X' for invoice and 'empty' for credit memo.
        private String invoiceIndicator = "X";
        private Date docDate = new Date();
        private Date postingDate = new Date();
        private String compCode = "8800";
        private String currency = "USD";
        private BigDecimal grossAmount = new BigDecimal(444);
        private String calculateTaxIndicator = "X";

        public String getInvoiceIndicator() {
            return invoiceIndicator;
        }

        public void setInvoiceIndicator(String invoiceIndicator) {
            this.invoiceIndicator = invoiceIndicator;
        }

        public Date getDocDate() {
            return docDate;
        }

        public void setDocDate(Date docDate) {
            this.docDate = docDate;
        }

        public Date getPostingDate() {
            return postingDate;
        }

        public void setPostingDate(Date postingDate) {
            this.postingDate = postingDate;
        }

        public String getCompCode() {
            return compCode;
        }

        public void setCompCode(String compCode) {
            this.compCode = compCode;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public BigDecimal getGrossAmount() {
            return grossAmount;
        }

        public void setGrossAmount(BigDecimal grossAmount) {
            this.grossAmount = grossAmount;
        }

        public String getCalculateTaxIndicator() {
            return calculateTaxIndicator;
        }

        public void setCalculateTaxIndicator(String calculateTaxIndicator) {
            this.calculateTaxIndicator = calculateTaxIndicator;
        }
    }

    class IncomingInvoiceItemData{

        private String itemNo = "000010";
        //need to be 10 char
        private String poNumber = "4500017572";
        // it might have to be equal to item number of the appropriate PO
        private String poItemNo = "00010"; // I already know this 00010 is for po 4500017572
        private String taxCode = "S0";
        private String taxJurCode = "CA0000000"; // probably char must be 10
        private BigDecimal itemAmount = new BigDecimal(444);
        private BigDecimal quantity = new BigDecimal(10);
        private String unitofMeasure = "EH";

        public String getItemNo() {
            return itemNo;
        }

        public void setItemNo(String itemNo) {
            this.itemNo = itemNo;
        }

        public String getPoNumber() {
            return poNumber;
        }

        public void setPoNumber(String poNumber) {
            this.poNumber = poNumber;
        }

        public String getPoItemNo() {
            return poItemNo;
        }

        public void setPoItemNo(String poItemNo) {
            this.poItemNo = poItemNo;
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

        public String getUnitofMeasure() {
            return unitofMeasure;
        }

        public void setUnitofMeasure(String unitofMeasure) {
            this.unitofMeasure = unitofMeasure;
        }
    }


}
