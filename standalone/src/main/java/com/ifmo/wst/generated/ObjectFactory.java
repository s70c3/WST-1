
package com.ifmo.wst.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ifmo.wst.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetStationsResponse_QNAME = new QName("http://app.wst.ifmo.com/", "getStationsResponse");
    private final static QName _GetStations_QNAME = new QName("http://app.wst.ifmo.com/", "getStations");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ifmo.wst.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStationsResponse }
     * 
     */
    public GetStationsResponse createGetStationsResponse() {
        return new GetStationsResponse();
    }

    /**
     * Create an instance of {@link GetStations }
     * 
     */
    public GetStations createGetStations() {
        return new GetStations();
    }

    /**
     * Create an instance of {@link Station }
     * 
     */
    public Station createStation() {
        return new Station();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://app.wst.ifmo.com/", name = "getStationsResponse")
    public JAXBElement<GetStationsResponse> createGetStationsResponse(GetStationsResponse value) {
        return new JAXBElement<GetStationsResponse>(_GetStationsResponse_QNAME, GetStationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://app.wst.ifmo.com/", name = "getStations")
    public JAXBElement<GetStations> createGetStations(GetStations value) {
        return new JAXBElement<GetStations>(_GetStations_QNAME, GetStations.class, null, value);
    }

}
