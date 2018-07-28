//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.6 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.04.18 时间 10:19:46 AM SGT 
//


package org.openhie.openempi.configuration.xml.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fields" type="{http://configuration.openempi.openhie.org/fileloadermap}FieldsType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="delimiter" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="header-first-line" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="training-data-extractor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fields"
})
@XmlRootElement(name = "file-loader-map")
public class FileLoaderMap {

    @XmlElement(required = true)
    protected FieldsType fields;
    @XmlAttribute(name = "delimiter")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String delimiter;
    @XmlAttribute(name = "header-first-line")
    protected Boolean headerFirstLine;
    @XmlAttribute(name = "training-data-extractor")
    protected String trainingDataExtractor;

    /**
     * 获取fields属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FieldsType }
     *     
     */
    public FieldsType getFields() {
        return fields;
    }

    /**
     * 设置fields属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FieldsType }
     *     
     */
    public void setFields(FieldsType value) {
        this.fields = value;
    }

    /**
     * 获取delimiter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * 设置delimiter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelimiter(String value) {
        this.delimiter = value;
    }

    /**
     * 获取headerFirstLine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHeaderFirstLine() {
        return headerFirstLine;
    }

    /**
     * 设置headerFirstLine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHeaderFirstLine(Boolean value) {
        this.headerFirstLine = value;
    }

    /**
     * 获取trainingDataExtractor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainingDataExtractor() {
        return trainingDataExtractor;
    }

    /**
     * 设置trainingDataExtractor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainingDataExtractor(String value) {
        this.trainingDataExtractor = value;
    }

}
