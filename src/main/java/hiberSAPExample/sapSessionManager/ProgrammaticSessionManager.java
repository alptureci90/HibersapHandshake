package hiberSAPExample.sapSessionManager;

import com.sap.conn.jco.ext.DestinationDataProvider;
import org.hibersap.configuration.AnnotationConfiguration;
import org.hibersap.configuration.xml.SessionManagerConfig;
import org.hibersap.execution.jco.JCoContext;
import org.hibersap.session.SessionManager;

public class ProgrammaticSessionManager {

    /**
     * This method is used to create SessionManager which exists with the life time of the application,.
     */

    public void programmaticSessionManager(){

        // Go connect to the DB.Or any other file to find the different SAP system.
        // SessionManagers will manager their own connection for each and every one of those SAP Instances.

        SessionManagerConfig cfg = new SessionManagerConfig("A12")
                .setContext(JCoContext.class.getName())
                .setProperty(DestinationDataProvider.JCO_ASHOST, "")
                .setProperty(DestinationDataProvider.JCO_CLIENT, "")
                .setProperty(DestinationDataProvider.JCO_USER, "")
                .setProperty(DestinationDataProvider.JCO_PASSWD, "")
                .setProperty(DestinationDataProvider.JCO_LANG, "")
                .setProperty(DestinationDataProvider.JCO_SYSNR, "")
                //.addAnnotatedClass(IncomingInvoiceCreate.class)
                //.addAnnotatedClass(PurchaseOrderCreate1.class)
                .addAnnotatedClass("hiberSAPExample.invoice.IncomingInvoiceCreate")
                .addAnnotatedClass("hiberSAPExample.purchaseOrder.bapiPOCreate1.PurchaseOrderCreate1");

        AnnotationConfiguration configuration = new AnnotationConfiguration(cfg);
        SessionManager sessionManager = configuration.buildSessionManager() ;


    }



}
