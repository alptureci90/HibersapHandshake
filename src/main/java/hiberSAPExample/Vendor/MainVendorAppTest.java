package hiberSAPExample.Vendor;

import com.sap.conn.jco.JCoException;
import hiberSAPExample.sapSessionManager.*;
import org.hibersap.session.Session;
import org.hibersap.session.SessionManager;

public class MainVendorAppTest {

    public static void main(String[] args){

        MainVendorAppTest test = new MainVendorAppTest();
        //test.getVendorDetail();
        //test.getVendorList();
        test.postVendor();

    }

    public void postVendor(){
        // TODO: NOT WORKING!
        Vendor vendor = new Vendor();
        vendor.setName("New Vendor");
        vendor.setVendor("Vendor10100008");

        //SessionManager sessionManager = SAPSessionManager.createSessionManager();
        //Session session = sessionManager.openSession();

        try{

            VendorCreateBapi vendorCreate = new VendorCreateBapi();
            SAPSessionManager.executeSession(vendorCreate);
            showVendorCreateOutput(vendorCreate);

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void getVendorList(){
        VendorListBapi vendorList = new VendorListBapi("8800");
        try{
            SAPSessionManager.executeSession(vendorList);
        } catch (Exception e){

        }
        showVendorList(vendorList);
    }

    public void getVendorDetail(){

            VendorDetailBapi vendorDetail = new VendorDetailBapi("0000100386", "0001");

            SAPSessionManager.executeSession(vendorDetail);

            showVendorDetail(vendorDetail);

    }

    public void showVendorDetail(VendorDetailBapi vendorDetail){
        // TODO
    }

    public void showVendorList(VendorListBapi vendorList){
        // TODO
    }

    public void showVendorCreateOutput(VendorCreateBapi newVendor){

        System.out.println(newVendor.toString());

    }

}
