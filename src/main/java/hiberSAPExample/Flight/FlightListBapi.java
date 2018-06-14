package hiberSAPExample.Flight;


import java.util.List;

import hiberSAPExample.utilities.BapiRet2;
import org.hibersap.annotations.*;
import org.hibersap.conversion.BooleanConverter;

@Bapi("BAPI_SFLIGHT_GETLIST")
public class FlightListBapi {

    @Import
    @Parameter("FROMCOUNTRYKEY")
    private final String fromCountryKey;

    @Import
    @Parameter("FROMCITY")
    private final String fromCity;

    @Import
    @Parameter("TOCOUNTRYKEY")
    private final String toCountryKey;

    @Import
    @Parameter("TOCITY")
    private final String toCity;

    @Import
    @Parameter("AIRLINECARRIER")
    private final String airlineCarrier;

    @Import
    @Parameter("AFTERNOON")
    @Convert(converter = BooleanConverter.class)
    private final boolean afternoon;

    @Import
    @Parameter("MAXREAD")
    private final int maxRead;

    @Export
    @Parameter(value="RETURN", type = ParameterType.STRUCTURE)
    private BapiRet2 returnData;



    @Table
    @Parameter("FLIGHTLIST")
    private List<Flight> flightList;

    public FlightListBapi(String fromCountryKey,
                          String fromCity,
                          String toCountryKey,
                          String toCity,
                          String airlineCarrier,
                          boolean afternoon,
                          int maxRead) {

        this.fromCountryKey = fromCountryKey;
        this.fromCity = fromCity;
        this.toCountryKey = toCountryKey;
        this.toCity = toCity;
        this.airlineCarrier = airlineCarrier;
        this.afternoon = afternoon;
        this.maxRead = maxRead;
    }

    public boolean getAfternoon() {
        return this.afternoon;
    }

    public String getFromCountryKey() {
        return this.fromCountryKey;
    }

    public String getFromCity() {
        return this.fromCity;
    }

    public String getToCountryKey() {
        return this.toCountryKey;
    }

    public String getToCity() {
        return this.toCity;
    }

    public String getAirlineCarrier() {
        return this.airlineCarrier;
    }

    public int getMaxRead() {
        return this.maxRead;
    }

    public List<Flight> getFlightList() {
        return this.flightList;
    }

    public BapiRet2 getReturnData() {
        return this.returnData;
    }



}
