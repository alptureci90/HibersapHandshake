package hiberSAPExample.purchaseOrder.bapiStructure;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

import java.util.Date;

/**
 * PO_HEADER
 */

@BapiStructure
public class BSPOHeader {

    @Parameter("DOC_DATE")
    private Date docDate;

    @Parameter("DOC_TYPE")
    private String docType;

    @Parameter("DOC_CAT")
    private String docCat;

    @Parameter("CO_CODE")
    private String coCode;

    @Parameter("PURCH_ORG")
    private String purchOrg;

    @Parameter("PUR_GROUP")
    private String purGroup;

    @Parameter("AGREEMENT")
    private String agreement;

    @Parameter("VENDOR")
    private String vendor;

    @Parameter("PO_NUMBER")
    private String poNumber;

    @Parameter("SUPPL_PLNT")
    private String supplPlant;

    @Parameter("CREATED_BY")
    private String createdBy;

    @Parameter("LANGU")
    private String language;

    @Parameter("LANGU_ISO")
    private String languageISO;

    public Date getDocDate() {
        return docDate;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getDocCat() {
        return docCat;
    }

    public void setDocCat(String docCat) {
        this.docCat = docCat;
    }

    public String getCoCode() {
        return coCode;
    }

    public void setCoCode(String coCode) {
        this.coCode = coCode;
    }

    public String getPurchOrg() {
        return purchOrg;
    }

    public void setPurchOrg(String purchOrg) {
        this.purchOrg = purchOrg;
    }

    public String getPurGroup() {
        return purGroup;
    }

    public void setPurGroup(String purGroup) {
        this.purGroup = purGroup;
    }

    public String getAgreement() {
        return agreement;
    }

    public void setAgreement(String agreement) {
        this.agreement = agreement;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }

    public String getSupplPlant() {
        return supplPlant;
    }

    public void setSupplPlant(String supplPlant) {
        this.supplPlant = supplPlant;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguageISO() {
        return languageISO;
    }

    public void setLanguageISO(String languageISO) {
        this.languageISO = languageISO;
    }
}
