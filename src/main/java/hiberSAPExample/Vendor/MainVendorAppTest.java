package hiberSAPExample.Vendor;

import hiberSAPExample.sapSessionManager.*;
import org.hibersap.session.Session;
import org.hibersap.session.SessionManager;

public class MainVendorAppTest {

    public static void main(String[] args){

        MainVendorAppTest test = new MainVendorAppTest();
        //test.getVendorDetail();
        test.getVendorList();


    }

    public void getVendorList(){
        SessionManager sessionManager = SAPSessionManager.createSessionManager();
        Session session = sessionManager.openSession();

        try{
            VendorListBapi vendorList = new VendorListBapi("0001");
            session.execute(vendorList);
            showVendorList(vendorList);
        } finally {
            session.close();
        }
    }

    public void getVendorDetail(){
        SessionManager sessionManager = SAPSessionManager.createSessionManager();
        Session session = sessionManager.openSession();

        try{
            VendorDetailBapi vendorDetail = new VendorDetailBapi("0000100386", "0001");
            session.execute(vendorDetail);
            showVendorDetail(vendorDetail);
        } finally {
            session.close();
        }

    }

    public void showVendorDetail(VendorDetailBapi vendorDetail){

    }

    public void showVendorList(VendorListBapi vendorList){

    }

}
