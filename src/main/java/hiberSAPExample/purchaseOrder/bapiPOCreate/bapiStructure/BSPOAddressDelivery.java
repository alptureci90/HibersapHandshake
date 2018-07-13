package hiberSAPExample.purchaseOrder.bapiPOCreate.bapiStructure;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

/**
 * POADDRDELIVERY STRUCTURE  BAPIMEPOADDRDELIVERY OPTIONAL
 */

@BapiStructure
public class BSPOAddressDelivery {

    // Item Number of Purchasing Document
    @Parameter("PO_ITEM")
    private String poItem;

    // Address number
    @Parameter("ADDR_NO")
    private String addrNumber;

    // Form of address text
    @Parameter("FORMOFADDR")
    private String formoAddr;

    // Name 1
    @Parameter("NAME")
    private String name1;

    // Name 2
    @Parameter("NAME_2")
    private String name2;

    // Name 3
    @Parameter("NAME_3")
    private String name3;

    // Name 4
    @Parameter("NAME_4")
    private String name4;

    // c/o name
    @Parameter("C_O_NAME")
    private String nameCO;

    // City
    @Parameter("CITY")
    private String city;

    // District
    @Parameter("DISTRICT")
    private String district;

    // City code for city/street file
    @Parameter("CITY_NO")
    private String cityNumber;

    // City postal code
    @Parameter("POSTL_COD1")
    private String postCode;

    // PO Box Postal Code
    @Parameter("POSTL_COD2")
    private String poBoxPostCode;

    // Company Postal Code (for Large Customers)
    @Parameter("POSTL_COD3")
    private String compPostCode;

    // PO Box
    @Parameter("PO_BOX")
    private String poBox;

    // PO Box city
    @Parameter("PO_BOX_CIT")
    private String poBoxCit;

    // (Not Supported) Post Delivery District
    @Parameter("DELIV_DIS")
    private String delivDist;

    // Street
    @Parameter("STREET")
    private String street;

    // Street Number for City/Street File
    @Parameter("STREET_NO")
    private String streetNumber;

    // (Not Supported) Abbreviation of Street Name
    @Parameter("STR_ABBR")
    private String streetAbbr;

    // House Number
    @Parameter("HOUSE_NO")
    private String houseNumber;

    // Street 2
    @Parameter("STR_SUPPL1")
    private String streetSuppl1;

    // Street 3
    @Parameter("STR_SUPPL2")
    private String streetSuppl2;

    // Street 5
    @Parameter("LOCATION")
    private String location;

    // old: building (no. or abbreviation)
    @Parameter("BUILDING")
    private String building;

    // Floor in building
    @Parameter("FLOOR")
    private String floor;

    // Room or Appartment Number
    @Parameter("ROOM_NO")
    private String roomNumber;

    // Country Key
    @Parameter("COUNTRY")
    private String country;

    // Language Key
    @Parameter("LANGU")
    private String language;

    // Region (State, Province, County)
    @Parameter("REGION")
    private String region;

    // Search Term 1
    @Parameter("SORT1")
    private String sort1;

    // Search Term 2
    @Parameter("SORT2")
    private String sort2;

    // Address time zone
    @Parameter("TIME_ZONE")
    private String timeZone;

    // Tax Jurisdiction
    @Parameter("TAXJURCODE")
    private String taxJurCode;

    // Address notes
    @Parameter("ADR_NOTES")
    private String adrNotes;

    // Communication Method (Key) (Business Address Services)
    @Parameter("COMM_TYPE")
    private String commType;

    // First telephone no.: dialling code+number
    @Parameter("TEL1_NUMBR")
    private String telNumber;

    // First Telephone No.: Extension
    @Parameter("TEL1_EXT")
    private String telExtension;

    // First fax no.: dialling code+number
    @Parameter("FAX_NUMBER")
    private String faxNumber;

    // First fax no.: extension
    @Parameter("FAX_EXTENS")
    private String faxExtension;

    // Street
    @Parameter("STREET_LNG")
    private String streetLong;

    // District code for City and Street file
    @Parameter("DISTRCT_NO")
    private String districtNumber;

    // City file test status
    @Parameter("CHCKSTATUS")
    private String chckStatus;

    // City PO box code (City file)
    @Parameter("PBOXCIT_NO")
    private String pBoxCityNumber;

    // Transportation zone to or from which the goods are delivered
    @Parameter("TRANSPZONE")
    private String transpZone;

    // House number supplement
    @Parameter("HOUSE_NO2")
    private String houseNo2;

    // E-Mail Address
    @Parameter("E_MAIL")
    private String email;

    // Street 4
    @Parameter("STR_SUPPL3")
    private String streetSuppl3;

    // Title text
    @Parameter("TITLE")
    private String titleText;

    // Country ISO code
    @Parameter("COUNTRYISO")
    private String countryISO;

    // 2-Character SAP Language Code
    @Parameter("LANGU_ISO")
    private String languageISO;

    // Building (Number or Code)
    @Parameter("BUILD_LONG")
    private String buildLong;

    // Regional structure grouping
    @Parameter("REGIOGROUP")
    private String regionalGroup;

    // Vendor to be supplied/who is to receive delivery
    @Parameter("SUPP_VENDOR")
    private String vendor;

    // Customer
    @Parameter("CUSTOMER")
    private String customer;

    // Subcontracting vendor
    @Parameter("SC_VENDOR")
    private String subcontractingVendor;

    public String getPoItem() {
        return poItem;
    }

    public void setPoItem(String poItem) {
        this.poItem = poItem;
    }

    public String getAddrNumber() {
        return addrNumber;
    }

    public void setAddrNumber(String addrNumber) {
        this.addrNumber = addrNumber;
    }

    public String getFormoAddr() {
        return formoAddr;
    }

    public void setFormoAddr(String formoAddr) {
        this.formoAddr = formoAddr;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public String getName4() {
        return name4;
    }

    public void setName4(String name4) {
        this.name4 = name4;
    }

    public String getNameCO() {
        return nameCO;
    }

    public void setNameCO(String nameCO) {
        this.nameCO = nameCO;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCityNumber() {
        return cityNumber;
    }

    public void setCityNumber(String cityNumber) {
        this.cityNumber = cityNumber;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getPoBoxPostCode() {
        return poBoxPostCode;
    }

    public void setPoBoxPostCode(String poBoxPostCode) {
        this.poBoxPostCode = poBoxPostCode;
    }

    public String getCompPostCode() {
        return compPostCode;
    }

    public void setCompPostCode(String compPostCode) {
        this.compPostCode = compPostCode;
    }

    public String getPoBox() {
        return poBox;
    }

    public void setPoBox(String poBox) {
        this.poBox = poBox;
    }

    public String getPoBoxCit() {
        return poBoxCit;
    }

    public void setPoBoxCit(String poBoxCit) {
        this.poBoxCit = poBoxCit;
    }

    public String getDelivDist() {
        return delivDist;
    }

    public void setDelivDist(String delivDist) {
        this.delivDist = delivDist;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetAbbr() {
        return streetAbbr;
    }

    public void setStreetAbbr(String streetAbbr) {
        this.streetAbbr = streetAbbr;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetSuppl1() {
        return streetSuppl1;
    }

    public void setStreetSuppl1(String streetSuppl1) {
        this.streetSuppl1 = streetSuppl1;
    }

    public String getStreetSuppl2() {
        return streetSuppl2;
    }

    public void setStreetSuppl2(String streetSuppl2) {
        this.streetSuppl2 = streetSuppl2;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSort1() {
        return sort1;
    }

    public void setSort1(String sort1) {
        this.sort1 = sort1;
    }

    public String getSort2() {
        return sort2;
    }

    public void setSort2(String sort2) {
        this.sort2 = sort2;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getTaxJurCode() {
        return taxJurCode;
    }

    public void setTaxJurCode(String taxJurCode) {
        this.taxJurCode = taxJurCode;
    }

    public String getAdrNotes() {
        return adrNotes;
    }

    public void setAdrNotes(String adrNotes) {
        this.adrNotes = adrNotes;
    }

    public String getCommType() {
        return commType;
    }

    public void setCommType(String commType) {
        this.commType = commType;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getTelExtension() {
        return telExtension;
    }

    public void setTelExtension(String telExtension) {
        this.telExtension = telExtension;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getFaxExtension() {
        return faxExtension;
    }

    public void setFaxExtension(String faxExtension) {
        this.faxExtension = faxExtension;
    }

    public String getStreetLong() {
        return streetLong;
    }

    public void setStreetLong(String streetLong) {
        this.streetLong = streetLong;
    }

    public String getDistrictNumber() {
        return districtNumber;
    }

    public void setDistrictNumber(String districtNumber) {
        this.districtNumber = districtNumber;
    }

    public String getChckStatus() {
        return chckStatus;
    }

    public void setChckStatus(String chckStatus) {
        this.chckStatus = chckStatus;
    }

    public String getpBoxCityNumber() {
        return pBoxCityNumber;
    }

    public void setpBoxCityNumber(String pBoxCityNumber) {
        this.pBoxCityNumber = pBoxCityNumber;
    }

    public String getTranspZone() {
        return transpZone;
    }

    public void setTranspZone(String transpZone) {
        this.transpZone = transpZone;
    }

    public String getHouseNo2() {
        return houseNo2;
    }

    public void setHouseNo2(String houseNo2) {
        this.houseNo2 = houseNo2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreetSuppl3() {
        return streetSuppl3;
    }

    public void setStreetSuppl3(String streetSuppl3) {
        this.streetSuppl3 = streetSuppl3;
    }

    public String getTitleText() {
        return titleText;
    }

    public void setTitleText(String titleText) {
        this.titleText = titleText;
    }

    public String getCountryISO() {
        return countryISO;
    }

    public void setCountryISO(String countryISO) {
        this.countryISO = countryISO;
    }

    public String getLanguageISO() {
        return languageISO;
    }

    public void setLanguageISO(String languageISO) {
        this.languageISO = languageISO;
    }

    public String getBuildLong() {
        return buildLong;
    }

    public void setBuildLong(String buildLong) {
        this.buildLong = buildLong;
    }

    public String getRegionalGroup() {
        return regionalGroup;
    }

    public void setRegionalGroup(String regionalGroup) {
        this.regionalGroup = regionalGroup;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getSubcontractingVendor() {
        return subcontractingVendor;
    }

    public void setSubcontractingVendor(String subcontractingVendor) {
        this.subcontractingVendor = subcontractingVendor;
    }
}
