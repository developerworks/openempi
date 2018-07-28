//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.6 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.04.18 时间 10:19:46 AM SGT 
//


package org.openhie.openempi.configuration.xml.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>datatype的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="datatype">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="String"/>
 *     &lt;enumeration value="Date"/>
 *     &lt;enumeration value="Integer"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "datatype")
@XmlEnum
public enum Datatype {

    @XmlEnumValue("String")
    STRING("String"),
    @XmlEnumValue("Date")
    DATE("Date"),
    @XmlEnumValue("Integer")
    INTEGER("Integer");
    private final String value;

    Datatype(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Datatype fromValue(String v) {
        for (Datatype c: Datatype.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
