//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.24 at 02:22:50 PM PDT 
//


package edu.iris.quake.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MomentTensorCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MomentTensorCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="teleseismic"/>
 *     &lt;enumeration value="regional"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MomentTensorCategory")
@XmlEnum
public enum MomentTensorCategory {

    @XmlEnumValue("teleseismic")
    TELESEISMIC("teleseismic"),
    @XmlEnumValue("regional")
    REGIONAL("regional");
    private final String value;

    MomentTensorCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MomentTensorCategory fromValue(String v) {
        for (MomentTensorCategory c: MomentTensorCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}