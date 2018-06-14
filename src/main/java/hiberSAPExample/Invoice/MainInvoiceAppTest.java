package hiberSAPExample.Invoice;

import hiberSAPExample.Vendor.MainVendorAppTest;
import hiberSAPExample.Vendor.VendorListBapi;
import hiberSAPExample.sapSessionManager.SAPSessionManager;
import org.hibersap.session.Session;
import org.hibersap.session.SessionManager;

public class MainInvoiceAppTest {



    public static void main(String[] args){
        MainInvoiceAppTest test = new MainInvoiceAppTest();
        test.getInvoiceDetail();
        //test.getInvoiceList();
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


}
