//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.24 at 02:22:51 PM PDT 
//


package org.quakeml_1_2.helpers;

import java.math.BigDecimal;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter3
    extends XmlAdapter<String, BigDecimal>
{


    public BigDecimal unmarshal(String value) {
        return (javax.xml.bind.DatatypeConverter.parseDecimal(value));
    }

    public String marshal(BigDecimal value) {
        if (value == null) {
            return null;
        }
        return (javax.xml.bind.DatatypeConverter.printDecimal(value));
    }

}
