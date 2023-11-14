
package m1.archi.agence;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "UserServiceInscriptionImplService", targetNamespace = "http://service.archi.m1/", wsdlLocation = "http://localhost:8090/agencesservice/A1699892793072/inscription?wsdl")
public class UserServiceInscriptionImplService
    extends Service
{

    private final static URL USERSERVICEINSCRIPTIONIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException USERSERVICEINSCRIPTIONIMPLSERVICE_EXCEPTION;
    private final static QName USERSERVICEINSCRIPTIONIMPLSERVICE_QNAME = new QName("http://service.archi.m1/", "UserServiceInscriptionImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8090/agencesservice/A1699892793072/inscription?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        USERSERVICEINSCRIPTIONIMPLSERVICE_WSDL_LOCATION = url;
        USERSERVICEINSCRIPTIONIMPLSERVICE_EXCEPTION = e;
    }

    public UserServiceInscriptionImplService() {
        super(__getWsdlLocation(), USERSERVICEINSCRIPTIONIMPLSERVICE_QNAME);
    }

    public UserServiceInscriptionImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), USERSERVICEINSCRIPTIONIMPLSERVICE_QNAME, features);
    }

    public UserServiceInscriptionImplService(URL wsdlLocation) {
        super(wsdlLocation, USERSERVICEINSCRIPTIONIMPLSERVICE_QNAME);
    }

    public UserServiceInscriptionImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, USERSERVICEINSCRIPTIONIMPLSERVICE_QNAME, features);
    }

    public UserServiceInscriptionImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UserServiceInscriptionImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UserServiceInscription
     */
    @WebEndpoint(name = "UserServiceInscriptionImplPort")
    public UserServiceInscription getUserServiceInscriptionImplPort() {
        return super.getPort(new QName("http://service.archi.m1/", "UserServiceInscriptionImplPort"), UserServiceInscription.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserServiceInscription
     */
    @WebEndpoint(name = "UserServiceInscriptionImplPort")
    public UserServiceInscription getUserServiceInscriptionImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.archi.m1/", "UserServiceInscriptionImplPort"), UserServiceInscription.class, features);
    }

    private static URL __getWsdlLocation() {
        if (USERSERVICEINSCRIPTIONIMPLSERVICE_EXCEPTION!= null) {
            throw USERSERVICEINSCRIPTIONIMPLSERVICE_EXCEPTION;
        }
        return USERSERVICEINSCRIPTIONIMPLSERVICE_WSDL_LOCATION;
    }

}