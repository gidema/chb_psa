//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.04.14 at 01:24:43 PM CEST 
//


package nl.chb.psa;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{}stopplacecode"/&gt;
 *         &lt;element ref="{}stopplaceref"/&gt;
 *         &lt;element ref="{}userstopcodes"/&gt;
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
    "stopplacecode",
    "stopplaceref",
    "userstopcodes"
})
@XmlRootElement(name = "stopplace")
public class Stopplace {

    @XmlElement(required = true)
    protected String stopplacecode;
    @XmlElement(required = true)
    protected String stopplaceref;
    @XmlElement(required = true)
    protected Userstopcodes userstopcodes;

    /**
     * Gets the value of the stopplacecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopplacecode() {
        return stopplacecode;
    }

    /**
     * Sets the value of the stopplacecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopplacecode(String value) {
        this.stopplacecode = value;
    }

    /**
     * Gets the value of the stopplaceref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopplaceref() {
        return stopplaceref;
    }

    /**
     * Sets the value of the stopplaceref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopplaceref(String value) {
        this.stopplaceref = value;
    }

    /**
     * Gets the value of the userstopcodes property.
     * 
     * @return
     *     possible object is
     *     {@link Userstopcodes }
     *     
     */
    public Userstopcodes getUserstopcodes() {
        return userstopcodes;
    }

    /**
     * Sets the value of the userstopcodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Userstopcodes }
     *     
     */
    public void setUserstopcodes(Userstopcodes value) {
        this.userstopcodes = value;
    }

}