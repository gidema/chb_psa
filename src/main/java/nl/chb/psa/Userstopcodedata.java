//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.04.15 at 05:22:24 PM CEST 
//


package nl.chb.psa;

import java.time.LocalDateTime;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import nl.chb.psa.binding.LocalDateTimeXmlAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}dataownercode"/&gt;
 *         &lt;element ref="{}userstopcode"/&gt;
 *         &lt;element ref="{}validfrom"/&gt;
 *         &lt;element ref="{}validthru" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dataownercode",
    "userstopcode",
    "validfrom",
    "validthru"
})
@XmlRootElement(name = "userstopcodedata")
public class Userstopcodedata {

    @XmlElement(required = true)
    protected String dataownercode;
    @XmlElement(required = true)
    protected String userstopcode;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeXmlAdapter.class)
    protected LocalDateTime validfrom;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeXmlAdapter.class)
    protected LocalDateTime validthru;

    /**
     * Gets the value of the dataownercode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataownercode() {
        return dataownercode;
    }

    /**
     * Sets the value of the dataownercode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataownercode(String value) {
        this.dataownercode = value;
    }

    /**
     * Gets the value of the userstopcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserstopcode() {
        return userstopcode;
    }

    /**
     * Sets the value of the userstopcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserstopcode(String value) {
        this.userstopcode = value;
    }

    /**
     * Gets the value of the validfrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getValidfrom() {
        return validfrom;
    }

    /**
     * Sets the value of the validfrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidfrom(LocalDateTime value) {
        this.validfrom = value;
    }

    /**
     * Gets the value of the validthru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getValidthru() {
        return validthru;
    }

    /**
     * Sets the value of the validthru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidthru(LocalDateTime value) {
        this.validthru = value;
    }

}
