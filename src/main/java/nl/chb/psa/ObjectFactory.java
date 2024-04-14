//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.04.14 at 01:24:43 PM CEST 
//


package nl.chb.psa;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.chb.psa package. 
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

    private final static QName _Dataownercode_QNAME = new QName("", "dataownercode");
    private final static QName _Userstopcode_QNAME = new QName("", "userstopcode");
    private final static QName _Validfrom_QNAME = new QName("", "validfrom");
    private final static QName _Validthru_QNAME = new QName("", "validthru");
    private final static QName _Quaycode_QNAME = new QName("", "quaycode");
    private final static QName _Quayref_QNAME = new QName("", "quayref");
    private final static QName _Stopplacecode_QNAME = new QName("", "stopplacecode");
    private final static QName _Stopplaceref_QNAME = new QName("", "stopplaceref");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.chb.psa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Userstopcodedata }
     * 
     */
    public Userstopcodedata createUserstopcodedata() {
        return new Userstopcodedata();
    }

    /**
     * Create an instance of {@link Userstopcodes }
     * 
     */
    public Userstopcodes createUserstopcodes() {
        return new Userstopcodes();
    }

    /**
     * Create an instance of {@link Quay }
     * 
     */
    public Quay createQuay() {
        return new Quay();
    }

    /**
     * Create an instance of {@link Quays }
     * 
     */
    public Quays createQuays() {
        return new Quays();
    }

    /**
     * Create an instance of {@link Stopplace }
     * 
     */
    public Stopplace createStopplace() {
        return new Stopplace();
    }

    /**
     * Create an instance of {@link Stopplaces }
     * 
     */
    public Stopplaces createStopplaces() {
        return new Stopplaces();
    }

    /**
     * Create an instance of {@link Export }
     * 
     */
    public Export createExport() {
        return new Export();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "dataownercode")
    public JAXBElement<String> createDataownercode(String value) {
        return new JAXBElement<String>(_Dataownercode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "userstopcode")
    public JAXBElement<String> createUserstopcode(String value) {
        return new JAXBElement<String>(_Userstopcode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "validfrom")
    public JAXBElement<String> createValidfrom(String value) {
        return new JAXBElement<String>(_Validfrom_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "validthru")
    public JAXBElement<String> createValidthru(String value) {
        return new JAXBElement<String>(_Validthru_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "quaycode")
    public JAXBElement<String> createQuaycode(String value) {
        return new JAXBElement<String>(_Quaycode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "quayref")
    public JAXBElement<String> createQuayref(String value) {
        return new JAXBElement<String>(_Quayref_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "stopplacecode")
    public JAXBElement<String> createStopplacecode(String value) {
        return new JAXBElement<String>(_Stopplacecode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "stopplaceref")
    public JAXBElement<String> createStopplaceref(String value) {
        return new JAXBElement<String>(_Stopplaceref_QNAME, String.class, null, value);
    }

}