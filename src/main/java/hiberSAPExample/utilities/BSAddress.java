package hiberSAPExample.utilities;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

@BapiStructure
public class BSAddress {

    @Parameter("ACC_1_TIME")
    private String acc1Time; //Indicator: Is the account a one-time account?

    @Parameter("NAME")
    private String name;

    @Parameter("NAME_2")
    private String name2;

    @Parameter("NAME_3")
    private String name3;

    @Parameter("NAME_4")
    private String name4;

    @Parameter("POSTL_CODE")
    private String postlCode;

    @Parameter("CITY")
    private String city;

    @Parameter("COUNTRY")
    private String country;

    @Parameter("STREET")
    private String street;

    @Parameter("PO_BOX")
    private String poBox;

    @Parameter("POBX_PCD")
    private String poBxPCd; //P.O. Box Postal Code

    @Parameter("POBK_CURAC")
    private String poBkCurAc; //Account Number of Bank Account At Post Office

    @Parameter("BANK_ACCT")
    private String bankAcct; //Bank Account Number

    @Parameter("BANK_NO")
    private String bankNo; // Bank Number

    @Parameter("BANK_CTRY")
    private String bankCtry; // Bank Country Key

    @Parameter("TAX_NO_1")
    private String taxNo1;

    @Parameter("TAX_NO_2")
    private String taxNo2;

    @Parameter("SLS_PUR_TX")
    private String slsPurTx; // Liable for VAT

    @Parameter("EQUAL_TAX")
    private String equalTax; // Indicator: Business Partner Subject to Equalization Tax?

    @Parameter("REGION")
    private String region;

    @Parameter("CTRL_KEY")
    private String ctrlKey; // Bank Control Key

    @Parameter("INSTR_KEY")
    private String instrKey; // Instruction key for Data Medium Exchange

    @Parameter("DME_IND")
    private String dmeInd; // Indicator for Data Medium Exhange

    @Parameter("LANGU")
    private String langu; // Language Key

    @Parameter("ENCR_PAYM_RECIP")
    private String encrPaymRecip; // Payee Code

    @Parameter("TAX_CATEGORY")
    private String taxCategory; // Tax Type

    @Parameter("TAX_NO_TY")
    private String taxNoTy; // Tax Number Type

    @Parameter("SOLE_PROP")
    private String saoleProp; // Natural Person

    @Parameter("TAX_NO_3")
    private String taxNo3;

    @Parameter("TAX_NO_4")
    private String taxNo4;

    @Parameter("BANK_REF")
    private String bankRef; // reference specifications fpr bank details

    @Parameter("REP_NAME")
    private String repName; // Name of representative

    @Parameter("BUS_TYPE")
    private String busType; // Type of Business

    @Parameter("IND_TYPE")
    private String indTyp; // Type of industry

    @Parameter("FORM_OF_ADDR") // Title
    private String formOfAddr;

    @Parameter("VAT_REG_NO") // VAT registration Number
    private String vatRegNo;

    public String getAcc1Time() {
        return acc1Time;
    }

    public void setAcc1Time(String acc1Time) {
        this.acc1Time = acc1Time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getPostlCode() {
        return postlCode;
    }

    public void setPostlCode(String postlCode) {
        this.postlCode = postlCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPoBox() {
        return poBox;
    }

    public void setPoBox(String poBox) {
        this.poBox = poBox;
    }

    public String getPoBxPCd() {
        return poBxPCd;
    }

    public void setPoBxPCd(String poBxPCd) {
        this.poBxPCd = poBxPCd;
    }

    public String getPoBkCurAc() {
        return poBkCurAc;
    }

    public void setPoBkCurAc(String poBkCurAc) {
        this.poBkCurAc = poBkCurAc;
    }

    public String getBankAcct() {
        return bankAcct;
    }

    public void setBankAcct(String bankAcct) {
        this.bankAcct = bankAcct;
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    public String getBankCtry() {
        return bankCtry;
    }

    public void setBankCtry(String bankCtry) {
        this.bankCtry = bankCtry;
    }

    public String getTaxNo1() {
        return taxNo1;
    }

    public void setTaxNo1(String taxNo1) {
        this.taxNo1 = taxNo1;
    }

    public String getTaxNo2() {
        return taxNo2;
    }

    public void setTaxNo2(String taxNo2) {
        this.taxNo2 = taxNo2;
    }

    public String getSlsPurTx() {
        return slsPurTx;
    }

    public void setSlsPurTx(String slsPurTx) {
        this.slsPurTx = slsPurTx;
    }

    public String getEqualTax() {
        return equalTax;
    }

    public void setEqualTax(String equalTax) {
        this.equalTax = equalTax;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCtrlKey() {
        return ctrlKey;
    }

    public void setCtrlKey(String ctrlKey) {
        this.ctrlKey = ctrlKey;
    }

    public String getInstrKey() {
        return instrKey;
    }

    public void setInstrKey(String instrKey) {
        this.instrKey = instrKey;
    }

    public String getDmeInd() {
        return dmeInd;
    }

    public void setDmeInd(String dmeInd) {
        this.dmeInd = dmeInd;
    }

    public String getLangu() {
        return langu;
    }

    public void setLangu(String langu) {
        this.langu = langu;
    }

    public String getEncrPaymRecip() {
        return encrPaymRecip;
    }

    public void setEncrPaymRecip(String encrPaymRecip) {
        this.encrPaymRecip = encrPaymRecip;
    }

    public String getTaxCategory() {
        return taxCategory;
    }

    public void setTaxCategory(String taxCategory) {
        this.taxCategory = taxCategory;
    }

    public String getTaxNoTy() {
        return taxNoTy;
    }

    public void setTaxNoTy(String taxNoTy) {
        this.taxNoTy = taxNoTy;
    }

    public String getSaoleProp() {
        return saoleProp;
    }

    public void setSaoleProp(String saoleProp) {
        this.saoleProp = saoleProp;
    }

    public String getTaxNo3() {
        return taxNo3;
    }

    public void setTaxNo3(String taxNo3) {
        this.taxNo3 = taxNo3;
    }

    public String getTaxNo4() {
        return taxNo4;
    }

    public void setTaxNo4(String taxNo4) {
        this.taxNo4 = taxNo4;
    }

    public String getBankRef() {
        return bankRef;
    }

    public void setBankRef(String bankRef) {
        this.bankRef = bankRef;
    }

    public String getRepName() {
        return repName;
    }

    public void setRepName(String repName) {
        this.repName = repName;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public String getIndTyp() {
        return indTyp;
    }

    public void setIndTyp(String indTyp) {
        this.indTyp = indTyp;
    }

    public String getFormOfAddr() {
        return formOfAddr;
    }

    public void setFormOfAddr(String formOfAddr) {
        this.formOfAddr = formOfAddr;
    }

    public String getVatRegNo() {
        return vatRegNo;
    }

    public void setVatRegNo(String vatRegNo) {
        this.vatRegNo = vatRegNo;
    }
}
