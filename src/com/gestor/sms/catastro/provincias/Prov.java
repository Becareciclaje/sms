//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.11 at 01:40:07 PM CEST 
//


package com.gestor.sms.catastro.provincias;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cpine" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="np" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cpine",
    "np"
})
@XmlRootElement(name = "prov")
public class Prov {

    protected int cpine;
    @XmlElement(required = true)
    protected String np;

    /**
     * Gets the value of the cpine property.
     * 
     */
    public int getCpine() {
        return cpine;
    }

    /**
     * Sets the value of the cpine property.
     * 
     */
    public void setCpine(int value) {
        this.cpine = value;
    }

    /**
     * Gets the value of the np property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNp() {
        return np;
    }

    /**
     * Sets the value of the np property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNp(String value) {
        this.np = value;
    }

}
