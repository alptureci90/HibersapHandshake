package hiberSAPExample.sapSessionManager;

import org.hibersap.configuration.AnnotationConfiguration;
import org.hibersap.session.SessionManager;

public abstract class SAPSessionManager implements SessionManager {

    public static SessionManager createSessionManager() {
        AnnotationConfiguration configuration = new AnnotationConfiguration("A12");
        return configuration.buildSessionManager();
    }
}
