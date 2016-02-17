
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.wcfservicewebrole1.TempInfo;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _UpdateTempInfoMTTemp_QNAME = new QName("http://tempuri.org/", "MTTemp");
    private final static QName _UpdateTempInfoHLTTemp_QNAME = new QName("http://tempuri.org/", "HLTTemp");
    private final static QName _UpdateTempInfoResponseUpdateTempInfoResult_QNAME = new QName("http://tempuri.org/", "UpdateTempInfoResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateTempInfo }
     * 
     */
    public UpdateTempInfo createUpdateTempInfo() {
        return new UpdateTempInfo();
    }

    /**
     * Create an instance of {@link UpdateTempInfoResponse }
     * 
     */
    public UpdateTempInfoResponse createUpdateTempInfoResponse() {
        return new UpdateTempInfoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TempInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "MTTemp", scope = UpdateTempInfo.class)
    public JAXBElement<TempInfo> createUpdateTempInfoMTTemp(TempInfo value) {
        return new JAXBElement<TempInfo>(_UpdateTempInfoMTTemp_QNAME, TempInfo.class, UpdateTempInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TempInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "HLTTemp", scope = UpdateTempInfo.class)
    public JAXBElement<TempInfo> createUpdateTempInfoHLTTemp(TempInfo value) {
        return new JAXBElement<TempInfo>(_UpdateTempInfoHLTTemp_QNAME, TempInfo.class, UpdateTempInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UpdateTempInfoResult", scope = UpdateTempInfoResponse.class)
    public JAXBElement<String> createUpdateTempInfoResponseUpdateTempInfoResult(String value) {
        return new JAXBElement<String>(_UpdateTempInfoResponseUpdateTempInfoResult_QNAME, String.class, UpdateTempInfoResponse.class, value);
    }

}
