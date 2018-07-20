package hiberSAPExample.sapSessionManager;

import hiberSAPExample.superBapi.SuperBapi;
import org.hibersap.configuration.AnnotationConfiguration;
import org.hibersap.session.Session;
import org.hibersap.session.SessionManager;
import org.hibersap.session.Transaction;

public abstract class SAPSessionManager implements SessionManager {

    public static SessionManager createSessionManager() {
        AnnotationConfiguration configuration = new AnnotationConfiguration("A12");
        return configuration.buildSessionManager();
    }

    public static void executeSession(SuperBapi bapiToExecute){

        SessionManager sessionManager = createSessionManager();
        Session session = sessionManager.openSession();
        Transaction transaction = null;

        try{
            transaction = session.beginTransaction();
            session.execute(bapiToExecute);
            transaction.commit();
        } catch (Exception e){
            System.out.println("Exception in session.execute for superBapi call:\t" + bapiToExecute.getClass().getName());
            e.printStackTrace();
            transaction.rollback();
            System.out.println("Transaction Rolled Back!");

        } finally {
            session.close();
            sessionManager.close();
        }

    }
}
