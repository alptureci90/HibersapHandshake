package hiberSAPExample.invoice.bapiStructure;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

import java.math.BigDecimal;
import java.util.Date;

@BapiStructure
public class BSInvoiceDetailHeader {

    @Parameter("INV_DOC_NO")
    private String invDocNum;

    @Parameter("FISC")
    private String fiscal;

    @Parameter("I")
    private String i;

    @Parameter("DO")
    private String doc;

    @Parameter("DOC_DATE")
    private Date docDate;

    @Parameter("PSTNG_DATE")
    private Date pstngDate;

    @Parameter("USERNAME")
    private String username;

    @Parameter("REF_DOC_NO")
    private String refDocNum;

    @Parameter("COMP")
    private String comp;

    @Parameter("DIFF_INV")
    private String diffInv;

    @Parameter("CURRE")
    private String curre;

    @Parameter("CUR")
    private String cur;

    @Parameter("EXCH_RATE")
    private BigDecimal exchRate;

    @Parameter("EXCH_RATE_V")
    private BigDecimal exchRateV;

    @Parameter("GROSS_AMNT")
    private BigDecimal grossAmnt;

    @Parameter("C")
    private String c;

    @Parameter("PMNT")
    private String pmnt;

    @Parameter("BLINE_DATE")
    private Date blineDate;

    @Parameter("DSCT")
    private String dsct;

    @Parameter("DSCT")
    private String dsct2;

    @Parameter("NETT")
    private String nett;

    @Parameter("DSCT_P")
    private String dsctP;

    @Parameter("DSCT_P")
    private String dsctP2;

    @Parameter("I")
    private String i2;

    @Parameter("HEADER_TEXT")
    private String headerText;

    @Parameter("P")
    private String p;

    @Parameter("DEL_COSTS")
    private BigDecimal delCosts;

    @Parameter("DE")
    private String de;

    @Parameter("DEL_COSTS_TAXJ")
    private String delCostsTaxJ;

    @Parameter("PERSON_EXT")
    private String personExt;

    @Parameter("ENTRY_DATE")
    private Date entryDate;

    @Parameter("ENTRY_TI")
    private String entryTime;

    @Parameter("DISCNT")
    private BigDecimal discnt;

    @Parameter("SAPR")
    private String sapr;

    @Parameter("LOG_SYSTEM")
    private String logSystem;

    @Parameter("REVERSAL_D")
    private String reversalD;

    @Parameter("REVE")
    private String reve;

    @Parameter("AUTINVRED")
    private BigDecimal autInvRed;

    @Parameter("TAXINVRED")
    private BigDecimal taxInvRed;

    @Parameter("VEND_ERROR")
    private BigDecimal vendError;

    @Parameter("TAX_ERROR")
    private BigDecimal taxError;

    @Parameter("P")
    private String p2;

    @Parameter("PM")
    private String pm;

    @Parameter("I")
    private String i3;

    @Parameter("SCB")
    private String scb;

    @Parameter("SUP")
    private String sup;

    @Parameter("B")
    private String b;

    @Parameter("REF_DOC_NO_LONG")
    private String refDocNumLong;

    @Parameter("DSCT_AMOUNT")
    private BigDecimal dsctAmount;

    @Parameter("PO")
    private String po;

    @Parameter("PO_REF_NO")
    private String poRefNum;

    @Parameter("PAYEE_PAYE")
    private String payeePaye;

    @Parameter("PART")
    private String part;

    @Parameter("HOUSE")
    private String house;

    @Parameter("ALLOC_NMBR")
    private String allocNum;

    @Parameter("PAYMT_REF")
    private String paymyref;

    @Parameter("INV_REF_NO")
    private String invRefNum;

    @Parameter("INV_")
    private String inv;

    @Parameter("INV_REC_DA")
    private String invRecDate;

    @Parameter("PL")
    private String pl;

    @Parameter("PLANNING_D")
    private String planningDate;

    @Parameter("F")
    private String f;

    @Parameter("BUS_")
    private String bus;

    @Parameter("ITEM_TEXT")
    private String itemText;

    @Parameter("J_")
    private String j;


    public String getInvDocNum() {
        return invDocNum;
    }

    public String getFiscal() {
        return fiscal;
    }

    public String getI() {
        return i;
    }

    public String getDoc() {
        return doc;
    }

    public Date getDocDate() {
        return docDate;
    }

    public Date getPstngDate() {
        return pstngDate;
    }

    public String getUsername() {
        return username;
    }

    public String getRefDocNum() {
        return refDocNum;
    }

    public String getComp() {
        return comp;
    }

    public String getDiffInv() {
        return diffInv;
    }

    public String getCurre() {
        return curre;
    }

    public String getCur() {
        return cur;
    }

    public BigDecimal getExchRate() {
        return exchRate;
    }

    public BigDecimal getExchRateV() {
        return exchRateV;
    }

    public BigDecimal getGrossAmnt() {
        return grossAmnt;
    }

    public String getC() {
        return c;
    }

    public String getPmnt() {
        return pmnt;
    }

    public Date getBlineDate() {
        return blineDate;
    }

    public String getDsct() {
        return dsct;
    }

    public String getDsct2() {
        return dsct2;
    }

    public String getNett() {
        return nett;
    }

    public String getDsctP() {
        return dsctP;
    }

    public String getDsctP2() {
        return dsctP2;
    }

    public String getI2() {
        return i2;
    }

    public String getHeaderText() {
        return headerText;
    }

    public String getP() {
        return p;
    }

    public BigDecimal getDelCosts() {
        return delCosts;
    }

    public String getDe() {
        return de;
    }

    public String getDelCostsTaxJ() {
        return delCostsTaxJ;
    }

    public String getPersonExt() {
        return personExt;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public String getEntryTime() {
        return entryTime;
    }

    public BigDecimal getDiscnt() {
        return discnt;
    }

    public String getSapr() {
        return sapr;
    }

    public String getLogSystem() {
        return logSystem;
    }

    public String getReversalD() {
        return reversalD;
    }

    public String getReve() {
        return reve;
    }

    public BigDecimal getAutInvRed() {
        return autInvRed;
    }

    public BigDecimal getTaxInvRed() {
        return taxInvRed;
    }

    public BigDecimal getVendError() {
        return vendError;
    }

    public BigDecimal getTaxError() {
        return taxError;
    }

    public String getP2() {
        return p2;
    }

    public String getPm() {
        return pm;
    }

    public String getI3() {
        return i3;
    }

    public String getScb() {
        return scb;
    }

    public String getSup() {
        return sup;
    }

    public String getB() {
        return b;
    }

    public String getRefDocNumLong() {
        return refDocNumLong;
    }

    public BigDecimal getDsctAmount() {
        return dsctAmount;
    }

    public String getPo() {
        return po;
    }

    public String getPoRefNum() {
        return poRefNum;
    }

    public String getPayeePaye() {
        return payeePaye;
    }

    public String getPart() {
        return part;
    }

    public String getHouse() {
        return house;
    }

    public String getAllocNum() {
        return allocNum;
    }

    public String getPaymyref() {
        return paymyref;
    }

    public String getInvRefNum() {
        return invRefNum;
    }

    public String getInv() {
        return inv;
    }

    public String getInvRecDate() {
        return invRecDate;
    }

    public String getPl() {
        return pl;
    }

    public String getPlanningDate() {
        return planningDate;
    }

    public String getF() {
        return f;
    }

    public String getBus() {
        return bus;
    }

    public String getItemText() {
        return itemText;
    }

    public String getJ() {
        return j;
    }

    public void setInvDocNum(String invDocNum) {
        this.invDocNum = invDocNum;
    }

    public void setFiscal(String fiscal) {
        this.fiscal = fiscal;
    }

    public void setI(String i) {
        this.i = i;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
    }

    public void setPstngDate(Date pstngDate) {
        this.pstngDate = pstngDate;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setRefDocNum(String refDocNum) {
        this.refDocNum = refDocNum;
    }

    public void setComp(String comp) {
        this.comp = comp;
    }

    public void setDiffInv(String diffInv) {
        this.diffInv = diffInv;
    }

    public void setCurre(String curre) {
        this.curre = curre;
    }

    public void setCur(String cur) {
        this.cur = cur;
    }

    public void setExchRate(BigDecimal exchRate) {
        this.exchRate = exchRate;
    }

    public void setExchRateV(BigDecimal exchRateV) {
        this.exchRateV = exchRateV;
    }

    public void setGrossAmnt(BigDecimal grossAmnt) {
        this.grossAmnt = grossAmnt;
    }

    public void setC(String c) {
        this.c = c;
    }

    public void setPmnt(String pmnt) {
        this.pmnt = pmnt;
    }

    public void setBlineDate(Date blineDate) {
        this.blineDate = blineDate;
    }

    public void setDsct(String dsct) {
        this.dsct = dsct;
    }

    public void setDsct2(String dsct2) {
        this.dsct2 = dsct2;
    }

    public void setNett(String nett) {
        this.nett = nett;
    }

    public void setDsctP(String dsctP) {
        this.dsctP = dsctP;
    }

    public void setDsctP2(String dsctP2) {
        this.dsctP2 = dsctP2;
    }

    public void setI2(String i2) {
        this.i2 = i2;
    }

    public void setHeaderText(String headerText) {
        this.headerText = headerText;
    }

    public void setP(String p) {
        this.p = p;
    }

    public void setDelCosts(BigDecimal delCosts) {
        this.delCosts = delCosts;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public void setDelCostsTaxJ(String delCostsTaxJ) {
        this.delCostsTaxJ = delCostsTaxJ;
    }

    public void setPersonExt(String personExt) {
        this.personExt = personExt;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    public void setDiscnt(BigDecimal discnt) {
        this.discnt = discnt;
    }

    public void setSapr(String sapr) {
        this.sapr = sapr;
    }

    public void setLogSystem(String logSystem) {
        this.logSystem = logSystem;
    }

    public void setReversalD(String reversalD) {
        this.reversalD = reversalD;
    }

    public void setReve(String reve) {
        this.reve = reve;
    }

    public void setAutInvRed(BigDecimal autInvRed) {
        this.autInvRed = autInvRed;
    }

    public void setTaxInvRed(BigDecimal taxInvRed) {
        this.taxInvRed = taxInvRed;
    }

    public void setVendError(BigDecimal vendError) {
        this.vendError = vendError;
    }

    public void setTaxError(BigDecimal taxError) {
        this.taxError = taxError;
    }

    public void setP2(String p2) {
        this.p2 = p2;
    }

    public void setPm(String pm) {
        this.pm = pm;
    }

    public void setI3(String i3) {
        this.i3 = i3;
    }

    public void setScb(String scb) {
        this.scb = scb;
    }

    public void setSup(String sup) {
        this.sup = sup;
    }

    public void setB(String b) {
        this.b = b;
    }

    public void setRefDocNumLong(String refDocNumLong) {
        this.refDocNumLong = refDocNumLong;
    }

    public void setDsctAmount(BigDecimal dsctAmount) {
        this.dsctAmount = dsctAmount;
    }

    public void setPo(String po) {
        this.po = po;
    }

    public void setPoRefNum(String poRefNum) {
        this.poRefNum = poRefNum;
    }

    public void setPayeePaye(String payeePaye) {
        this.payeePaye = payeePaye;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public void setAllocNum(String allocNum) {
        this.allocNum = allocNum;
    }

    public void setPaymyref(String paymyref) {
        this.paymyref = paymyref;
    }

    public void setInvRefNum(String invRefNum) {
        this.invRefNum = invRefNum;
    }

    public void setInv(String inv) {
        this.inv = inv;
    }

    public void setInvRecDate(String invRecDate) {
        this.invRecDate = invRecDate;
    }

    public void setPl(String pl) {
        this.pl = pl;
    }

    public void setPlanningDate(String planningDate) {
        this.planningDate = planningDate;
    }

    public void setF(String f) {
        this.f = f;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    public void setItemText(String itemText) {
        this.itemText = itemText;
    }

    public void setJ(String j) {
        this.j = j;
    }
}
