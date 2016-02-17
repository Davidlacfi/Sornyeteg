
package org.datacontract.schemas._2004._07.wcfservicewebrole1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TempInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TempInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HLTTemp" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="MTTemp" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TempInfo", propOrder = {
    "hltTemp",
    "mtTemp"
})
public class TempInfo {

    @XmlElement(name = "HLTTemp")
    protected Float hltTemp;
    @XmlElement(name = "MTTemp")
    protected Float mtTemp;

    /**
     * Gets the value of the hltTemp property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHLTTemp() {
        return hltTemp;
    }

    /**
     * Sets the value of the hltTemp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHLTTemp(Float value) {
        this.hltTemp = value;
    }

    /**
     * Gets the value of the mtTemp property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMTTemp() {
        return mtTemp;
    }

    /**
     * Sets the value of the mtTemp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMTTemp(Float value) {
        this.mtTemp = value;
    }

}
