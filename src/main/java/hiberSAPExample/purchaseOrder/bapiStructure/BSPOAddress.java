package hiberSAPExample.purchaseOrder.bapiStructure;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

import java.util.Date;

@BapiStructure
public class BSPOAddress {

    // Address Number
    @Parameter("ADDRNUMBER")
    private String addrNumber;

    // Handle for Creating Addresses/Persons (Bus. Addr. Services)
    @Parameter("ADDRHANDLE")
    private String addrHandle;

    // Version ID for International Addresses
    @Parameter("NATION")
    private String nation;

    // Date referred to
    @Parameter("DATE")
    private Date date;

    // Valid-from date - in current Release only 00010101 possible
    @Parameter("DATE_FROM")
    private Date dateFrom;

    // Valid-to date in current Release only 99991231 possible
    @Parameter("DATE_TO")
    private Date dateTo;

    // Form-of-Address Key
    @Parameter("TITLE")
    private String title;

    // Name 1
    @Parameter("NAME1")
    private String name1;

    // Name 2
    @Parameter("NAME2")
    private String name2;

    // Name 3
    @Parameter("NAME3")
    private String name3;

    // Name 4
    @Parameter("NAME4")
    private String name4;

    // Converted name field (with form of address)
    @Parameter("NAME_TXT")
    private String nameTxt;

    // c/o name
    @Parameter("NAME_CO")
    private String nameCO;

    // City
    @Parameter("CITY1")
    private String city1;

    // District
    @Parameter("CITY2")
    private String district;

    // City code for city/street file
    @Parameter("CITY_CODE")
    private String cityCode;

    // District code for City and Street file
    @Parameter("CITYP_CODE")
    private String districtCode;

    // City file test status
    @Parameter("CHCKSTATUS")
    private String checkStatus;

    // City postal code
    @Parameter("POST_CODE1")
    private String postCode;

    // PO Box Postal Code
    @Parameter("POST_CODE2")
    private String poBoxPostCode;

    // Company Postal Code (for Large Customers)
    @Parameter("POST_CODE3")
    private String compPostCode;

    // PO Box
    @Parameter("PO_BOX")
    private String poBox;

    // Flag: PO Box Without Number
    @Parameter("PO_BOX_NUM")
    private String poBoxNum;

    // PO Box city
    @Parameter("PO_BOX_LOC")
    private String poBoxLoc;

    // City PO box code (City file)
    @Parameter("CITY_CODE2")
    private String cityPOBoxCode;

    // Region for PO Box (Country, State, Province, ...)
    @Parameter("PO_BOX_REG")
    private String poBoxReg;

    // PO box country
    @Parameter("PO_BOX_CTY")
    private String poBoxCountry;

    // (Not Supported) Post Delivery District
    @Parameter("POSTALAREA")
    private String postalArea;

    // Transportation zone to or from which the goods are delivered
    @Parameter("TRANSPZONE")
    private String transpZone;

    // Street
    @Parameter("STREET")
    private String street;

    // Street Number for City/Street File
    @Parameter("STREETCODE")
    private String streetCode;

    // (Not Supported) Abbreviation of Street Name
    @Parameter("STREETABBR")
    private String streetAbbr;

    // House Number
    @Parameter("HOUSE_NUM1")
    private String houseNum1;

    // House number supplement
    @Parameter("HOUSE_NUM2")
    private String houseNum2;

    // (Not supported) House Number Range
    @Parameter("HOUSE_NUM3")
    private String houseNum3;

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
    @Parameter("ROOMNUMBER")
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

    // (Not Supported) Phonetic Search Sort Field
    @Parameter("SORT_PHN")
    private String sortPhn;

    // (Not Supported) Address Data Source (Key)
    @Parameter("ADDRORIGIN")
    private String addrOrigin;

    // Extension (only for data conversion) (data line/telebox)
    @Parameter("EXTENSION1")
    private String extension1;

    // Extension (only for data conversion) (data line/telebox)
    @Parameter("EXTENSION2")
    private String extension2;

    // Address time zone
    @Parameter("TIME_ZONE")
    private String timeZone;

    // Tax Jurisdiction
    @Parameter("TAXJURCODE")
    private String taxJurisdationCode;

    // (Not supported) Physical address ID
    @Parameter("ADDRESS_ID")
    private String addressId;

    // Address notes
    @Parameter("REMARK")
    private String remark;

    // Communication Method (Key) (Business Address Services)
    @Parameter("DEFLT_COMM")
    private String defCommunicationMethod;

    // First telephone no.: dialling code+number
    @Parameter("TEL_NUMBER")
    private String telNumber;

    // First Telephone No.: Extension
    @Parameter("TEL_EXTENS")
    private String telExtension;

    // First fax no.: dialling code+number
    @Parameter("FAX_NUMBER")
    private String faxNumber;

    // First fax no.: extension
    @Parameter("FAX_EXTENS")
    private String faxExtension;

    // Building (Number or Code)
    @Parameter("BUILD_LONG")
    private String buildLong;

    public String getAddrNumber() {
        return addrNumber;
    }

    public void setAddrNumber(String addrNumber) {
        this.addrNumber = addrNumber;
    }

    public String getAddrHandle() {
        return addrHandle;
    }

    public void setAddrHandle(String addrHandle) {
        this.addrHandle = addrHandle;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getNameTxt() {
        return nameTxt;
    }

    public void setNameTxt(String nameTxt) {
        this.nameTxt = nameTxt;
    }

    public String getNameCO() {
        return nameCO;
    }

    public void setNameCO(String nameCO) {
        this.nameCO = nameCO;
    }

    public String getCity1() {
        return city1;
    }

    public void setCity1(String city1) {
        this.city1 = city1;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus;
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

    public String getPoBoxNum() {
        return poBoxNum;
    }

    public void setPoBoxNum(String poBoxNum) {
        this.poBoxNum = poBoxNum;
    }

    public String getPoBoxLoc() {
        return poBoxLoc;
    }

    public void setPoBoxLoc(String poBoxLoc) {
        this.poBoxLoc = poBoxLoc;
    }

    public String getCityPOBoxCode() {
        return cityPOBoxCode;
    }

    public void setCityPOBoxCode(String cityPOBoxCode) {
        this.cityPOBoxCode = cityPOBoxCode;
    }

    public String getPoBoxReg() {
        return poBoxReg;
    }

    public void setPoBoxReg(String poBoxReg) {
        this.poBoxReg = poBoxReg;
    }

    public String getPoBoxCountry() {
        return poBoxCountry;
    }

    public void setPoBoxCountry(String poBoxCountry) {
        this.poBoxCountry = poBoxCountry;
    }

    public String getPostalArea() {
        return postalArea;
    }

    public void setPostalArea(String postalArea) {
        this.postalArea = postalArea;
    }

    public String getTranspZone() {
        return transpZone;
    }

    public void setTranspZone(String transpZone) {
        this.transpZone = transpZone;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetCode() {
        return streetCode;
    }

    public void setStreetCode(String streetCode) {
        this.streetCode = streetCode;
    }

    public String getStreetAbbr() {
        return streetAbbr;
    }

    public void setStreetAbbr(String streetAbbr) {
        this.streetAbbr = streetAbbr;
    }

    public String getHouseNum1() {
        return houseNum1;
    }

    public void setHouseNum1(String houseNum1) {
        this.houseNum1 = houseNum1;
    }

    public String getHouseNum2() {
        return houseNum2;
    }

    public void setHouseNum2(String houseNum2) {
        this.houseNum2 = houseNum2;
    }

    public String getHouseNum3() {
        return houseNum3;
    }

    public void setHouseNum3(String houseNum3) {
        this.houseNum3 = houseNum3;
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

    public String getSortPhn() {
        return sortPhn;
    }

    public void setSortPhn(String sortPhn) {
        this.sortPhn = sortPhn;
    }

    public String getAddrOrigin() {
        return addrOrigin;
    }

    public void setAddrOrigin(String addrOrigin) {
        this.addrOrigin = addrOrigin;
    }

    public String getExtension1() {
        return extension1;
    }

    public void setExtension1(String extension1) {
        this.extension1 = extension1;
    }

    public String getExtension2() {
        return extension2;
    }

    public void setExtension2(String extension2) {
        this.extension2 = extension2;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getTaxJurisdationCode() {
        return taxJurisdationCode;
    }

    public void setTaxJurisdationCode(String taxJurisdationCode) {
        this.taxJurisdationCode = taxJurisdationCode;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDefCommunicationMethod() {
        return defCommunicationMethod;
    }

    public void setDefCommunicationMethod(String defCommunicationMethod) {
        this.defCommunicationMethod = defCommunicationMethod;
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

    public String getBuildLong() {
        return buildLong;
    }

    public void setBuildLong(String buildLong) {
        this.buildLong = buildLong;
    }
}
