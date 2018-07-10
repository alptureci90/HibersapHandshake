package hiberSAPExample.purchaseOrder.bapiStructure;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * PO_ITEM_SCHEDULES STRUCTURE  BAPIEKET
 */

@BapiStructure
public class BSPOItemSchedules {

    // Item Number of Purchasing Document
    @Parameter("PO_ITEM")
    private String poItem;

    // Delivery Schedule Line Counter
    @Parameter("SERIAL_NO")
    private int serialNo;

    // Date type (day, week, month, interval)
    @Parameter("DEL_DATCAT")
    private String delDatCat;

    // Item delivery date
    @Parameter("DELIV_DATE")
    private Date deliveryDate;

    // Delivery Date Time-Spot
    @Parameter("DELIV_TIME")
    private Date deliveryTime;

    // Scheduled Quantity
    @Parameter("QUANTITY")
    private BigDecimal quantity;

    // Purchase requisition number
    @Parameter("PREQ_NO")
    private String preqNo;

    // Item number of purchase requisition
    @Parameter("PREQ_ITEM")
    private int preqItem;

    // Creation indicator (purchase requisition/schedule lines)
    @Parameter("CREATE_IND")
    private String createInd;

    // Number of quota arrangement
    @Parameter("QUOTA_NO")
    private String quotaNo;

    // Quota arrangement item
    @Parameter("QUOTA_ITEM")
    private int quotaItem;

    // BOM explosion number
    @Parameter("BOMEXPL_NO")
    private String bomExplNum;

    // Number of reservation/dependent requirements
    @Parameter("RESERV_NO")
    private int reservNo;

    // Batch Number
    @Parameter("BATCH")
    private String batch;

    // Vendor Batch Number
    @Parameter("VEND_BATCH")
    private String vendBatch;

    // Production Version
    @Parameter("VERSION")
    private String version;

    // Category of delivery date
    @Parameter("DEL_DATCAT_EXT")
    private String delDatCatExt;

    public String getPoItem() {
        return poItem;
    }

    public void setPoItem(String poItem) {
        this.poItem = poItem;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public String getDelDatCat() {
        return delDatCat;
    }

    public void setDelDatCat(String delDatCat) {
        this.delDatCat = delDatCat;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public String getPreqNo() {
        return preqNo;
    }

    public void setPreqNo(String preqNo) {
        this.preqNo = preqNo;
    }

    public int getPreqItem() {
        return preqItem;
    }

    public void setPreqItem(int preqItem) {
        this.preqItem = preqItem;
    }

    public String getCreateInd() {
        return createInd;
    }

    public void setCreateInd(String createInd) {
        this.createInd = createInd;
    }

    public String getQuotaNo() {
        return quotaNo;
    }

    public void setQuotaNo(String quotaNo) {
        this.quotaNo = quotaNo;
    }

    public int getQuotaItem() {
        return quotaItem;
    }

    public void setQuotaItem(int quotaItem) {
        this.quotaItem = quotaItem;
    }

    public String getBomExplNum() {
        return bomExplNum;
    }

    public void setBomExplNum(String bomExplNum) {
        this.bomExplNum = bomExplNum;
    }

    public int getReservNo() {
        return reservNo;
    }

    public void setReservNo(int reservNo) {
        this.reservNo = reservNo;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getVendBatch() {
        return vendBatch;
    }

    public void setVendBatch(String vendBatch) {
        this.vendBatch = vendBatch;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDelDatCatExt() {
        return delDatCatExt;
    }

    public void setDelDatCatExt(String delDatCatExt) {
        this.delDatCatExt = delDatCatExt;
    }

}
