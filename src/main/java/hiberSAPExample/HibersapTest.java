package hiberSAPExample;

import hiberSAPExample.Flight.Flight;
import hiberSAPExample.Flight.FlightListBapi;
import hiberSAPExample.Vendor.VendorDetailBapi;
import hiberSAPExample.utilities.BapiRet2;
import org.hibersap.configuration.AnnotationConfiguration;
import org.hibersap.session.Session;
import org.hibersap.session.SessionManager;

import java.util.List;

public class HibersapTest {

    public SessionManager createSessionManager() {
        AnnotationConfiguration configuration = new AnnotationConfiguration("A12");
        return configuration.buildSessionManager();
    }

    public void showFlightList() {

        SessionManager sessionManager = createSessionManager();

        Session session = sessionManager.openSession();
        try {
            FlightListBapi flightList = new FlightListBapi( "US", "NEW YORK",
                    "US", "SAN FRANCISCO",
                    null, true, 10 );
            session.execute( flightList );
            showFlightListResult( flightList );
        }
        finally {
            session.close();
        }
    }

    private void showFlightListResult( FlightListBapi flightList ) {

        System.out.println( "AirlineId: " + flightList.getFromCountryKey() );
        System.out.println( "FromCity: " + flightList.getFromCity() );
        System.out.println( "ToCountryKey: " + flightList.getToCountryKey() );
        System.out.println( "ToCity: " + flightList.getToCity() );
        System.out.println( "AirlineCarrier: " + flightList
                .getAirlineCarrier() );
        System.out.println( "Afternoon: " + flightList.getAfternoon() );
        System.out.println( "MaxRead: " + flightList.getMaxRead() );

        System.out.println( "\nFlightData" );
        List<Flight> flights = flightList.getFlightList();
        for ( Flight flight : flights ) {
            System.out.print( "\t" + flight.getAirportFrom() );
            System.out.print( "\t" + flight.getAirportTo() );
            System.out.print( "\t" + flight.getCarrierId() );
            System.out.print( "\t" + flight.getConnectionId() );
            System.out.print( "\t" + flight.getSeatsMax() );
            System.out.print( "\t" + flight.getSeatsOccupied() );
            System.out.println( "\t" + flight.getDepartureTime() );
        }

        System.out.println( "\nReturn" );
        BapiRet2 returnStruct = flightList.getReturnData();
        System.out.println( "\tMessage: " + returnStruct.getMessage() );
        System.out.println( "\tNumber: " + returnStruct.getNumber() );
        System.out.println( "\tType: " + returnStruct.getType() );
        System.out.println( "\tId: " + returnStruct.getId() );
    }

    public void getVendorDetail(){
        SessionManager sessionManager = createSessionManager();
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

    public static void main( String[] args ) {

        //new HibersapTest().showFlightList();
        new HibersapTest().getVendorDetail();
    }
}
