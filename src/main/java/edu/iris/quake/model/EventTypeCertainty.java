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
 * <p>Java class for EventTypeCertainty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EventTypeCertainty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="known"/>
 *     &lt;enumeration value="suspected"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EventTypeCertainty")
@XmlEnum
public enum EventTypeCertainty {

    @XmlEnumValue("known")
    KNOWN("known"),
    @XmlEnumValue("suspected")
    SUSPECTED("suspected");
    private final String value;

    EventTypeCertainty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EventTypeCertainty fromValue(String v) {
        for (EventTypeCertainty c: EventTypeCertainty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
