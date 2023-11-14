
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
@WebServiceClient(name = "AgenceServiceReservationImplService", targetNamespace = "http://service.archi.m1/", wsdlLocation = "http://localhost:8090/agencesservice/A1699892793072/reservation?wsdl")
public class AgenceServiceReservationImplService
    extends Service
{

    private final static URL AGENCESERVICERESERVATIONIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException AGENCESERVICERESERVATIONIMPLSERVICE_EXCEPTION;
    private final static QName AGENCESERVICERESERVATIONIMPLSERVICE_QNAME = new QName("http://service.archi.m1/", "AgenceServiceReservationImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8090/agencesservice/A1699892793072/reservation?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        AGENCESERVICERESERVATIONIMPLSERVICE_WSDL_LOCATION = url;
        AGENCESERVICERESERVATIONIMPLSERVICE_EXCEPTION = e;
    }

    public AgenceServiceReservationImplService() {
        super(__getWsdlLocation(), AGENCESERVICERESERVATIONIMPLSERVICE_QNAME);
    }

    public AgenceServiceReservationImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), AGENCESERVICERESERVATIONIMPLSERVICE_QNAME, features);
    }

    public AgenceServiceReservationImplService(URL wsdlLocation) {
        super(wsdlLocation, AGENCESERVICERESERVATIONIMPLSERVICE_QNAME);
    }

    public AgenceServiceReservationImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, AGENCESERVICERESERVATIONIMPLSERVICE_QNAME, features);
    }

    public AgenceServiceReservationImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AgenceServiceReservationImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AgenceServiceReservation
     */
    @WebEndpoint(name = "AgenceServiceReservationImplPort")
    public AgenceServiceReservation getAgenceServiceReservationImplPort() {
        return super.getPort(new QName("http://service.archi.m1/", "AgenceServiceReservationImplPort"), AgenceServiceReservation.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AgenceServiceReservation
     */
    @WebEndpoint(name = "AgenceServiceReservationImplPort")
    public AgenceServiceReservation getAgenceServiceReservationImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.archi.m1/", "AgenceServiceReservationImplPort"), AgenceServiceReservation.class, features);
    }

    private static URL __getWsdlLocation() {
        if (AGENCESERVICERESERVATIONIMPLSERVICE_EXCEPTION!= null) {
            throw AGENCESERVICERESERVATIONIMPLSERVICE_EXCEPTION;
        }
        return AGENCESERVICERESERVATIONIMPLSERVICE_WSDL_LOCATION;
    }

}
