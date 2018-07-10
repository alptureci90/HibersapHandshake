package hiberSAPExample.Invoice;

import hiberSAPExample.Invoice.bapiStructure.BSIncomingInvoiceHeaderData;
import hiberSAPExample.Vendor.MainVendorAppTest;
import hiberSAPExample.Vendor.VendorListBapi;
import hiberSAPExample.sapSessionManager.SAPSessionManager;
import hiberSAPExample.utilities.BapiRet2;
import org.hibersap.session.Session;
import org.hibersap.session.SessionManager;

import java.util.Date;
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
            //Test 1
            Date docDate = new Date();
            Date pstnDate = new Date();
            String compCode = "8800";
            String currency = "USD";

            BSIncomingInvoiceHeaderData invoiceHeader = new BSIncomingInvoiceHeaderData(docDate, pstnDate, compCode, currency);

            SessionManager sessionManager = SAPSessionManager.createSessionManager();
            Session session = sessionManager.openSession();

            try{
                IncomingInvoiceCreate createInvoice = new IncomingInvoiceCreate();
                createInvoice.setIncommingInvoice(invoiceHeader);

                session.execute(createInvoice);

                showCreateResult(createInvoice);




            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                session.close();
            }

        }
    }

    public void showCreateResult(IncomingInvoiceCreate createInvoice){
        List<BapiRet2> result = createInvoice.getBapiRet2();
        System.out.println(result.toString());
    }


}
