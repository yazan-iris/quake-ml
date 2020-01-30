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
 * <p>Java class for EventDescriptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EventDescriptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="felt report"/>
 *     &lt;enumeration value="Flinn-Engdahl region"/>
 *     &lt;enumeration value="local time"/>
 *     &lt;enumeration value="tectonic summary"/>
 *     &lt;enumeration value="nearest cities"/>
 *     &lt;enumeration value="earthquake name"/>
 *     &lt;enumeration value="region name"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EventDescriptionType")
@XmlEnum
public enum EventDescriptionType {

    @XmlEnumValue("felt report")
    FELT_REPORT("felt report"),
    @XmlEnumValue("Flinn-Engdahl region")
    FLINN_ENGDAHL_REGION("Flinn-Engdahl region"),
    @XmlEnumValue("local time")
    LOCAL_TIME("local time"),
    @XmlEnumValue("tectonic summary")
    TECTONIC_SUMMARY("tectonic summary"),
    @XmlEnumValue("nearest cities")
    NEAREST_CITIES("nearest cities"),
    @XmlEnumValue("earthquake name")
    EARTHQUAKE_NAME("earthquake name"),
    @XmlEnumValue("region name")
    REGION_NAME("region name");
    private final String value;

    EventDescriptionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EventDescriptionType fromValue(String v) {
        for (EventDescriptionType c: EventDescriptionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
