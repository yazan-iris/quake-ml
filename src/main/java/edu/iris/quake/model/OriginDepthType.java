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
 * <p>Java class for OriginDepthType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OriginDepthType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="from location"/>
 *     &lt;enumeration value="from moment tensor inversion"/>
 *     &lt;enumeration value="from modeling of broad-band P waveforms"/>
 *     &lt;enumeration value="constrained by depth phases"/>
 *     &lt;enumeration value="constrained by direct phases"/>
 *     &lt;enumeration value="constrained by depth and direct phases"/>
 *     &lt;enumeration value="operator assigned"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OriginDepthType")
@XmlEnum
public enum OriginDepthType {

    @XmlEnumValue("from location")
    FROM_LOCATION("from location"),
    @XmlEnumValue("from moment tensor inversion")
    FROM_MOMENT_TENSOR_INVERSION("from moment tensor inversion"),
    @XmlEnumValue("from modeling of broad-band P waveforms")
    FROM_MODELING_OF_BROAD_BAND_P_WAVEFORMS("from modeling of broad-band P waveforms"),
    @XmlEnumValue("constrained by depth phases")
    CONSTRAINED_BY_DEPTH_PHASES("constrained by depth phases"),
    @XmlEnumValue("constrained by direct phases")
    CONSTRAINED_BY_DIRECT_PHASES("constrained by direct phases"),
    @XmlEnumValue("constrained by depth and direct phases")
    CONSTRAINED_BY_DEPTH_AND_DIRECT_PHASES("constrained by depth and direct phases"),
    @XmlEnumValue("operator assigned")
    OPERATOR_ASSIGNED("operator assigned"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    OriginDepthType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OriginDepthType fromValue(String v) {
        for (OriginDepthType c: OriginDepthType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
