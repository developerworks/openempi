//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.6 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.04.18 时间 10:19:46 AM SGT 
//


package org.openhie.openempi.configuration.xml.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>FieldType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FieldType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="column-index" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="field-name" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="subfields" type="{http://configuration.openempi.openhie.org/fileloadermap}SubFieldsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="datatype" type="{http://configuration.openempi.openhie.org/fileloadermap}datatype" />
 *       &lt;attribute name="date-format-string" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="delimiter" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="enclosing-character" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-cluster-id" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="is-identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="is-ignored" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="identifier-domain-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="namespace-identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="one-to-many" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="universal-identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="universal-identifier-type-code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldType", propOrder = {
    "columnIndex",
    "fieldName",
    "subfields"
})
public class FieldType {

    @XmlElement(name = "column-index", required = true)
    protected BigInteger columnIndex;
    @XmlElement(name = "field-name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fieldName;
    protected SubFieldsType subfields;
    @XmlAttribute(name = "datatype")
    protected Datatype datatype;
    @XmlAttribute(name = "date-format-string")
    protected String dateFormatString;
    @XmlAttribute(name = "delimiter")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String delimiter;
    @XmlAttribute(name = "enclosing-character")
    protected String enclosingCharacter;
    @XmlAttribute(name = "is-cluster-id")
    protected Boolean isClusterId;
    @XmlAttribute(name = "is-identifier")
    protected Boolean isIdentifier;
    @XmlAttribute(name = "is-ignored")
    protected Boolean isIgnored;
    @XmlAttribute(name = "identifier-domain-name")
    protected String identifierDomainName;
    @XmlAttribute(name = "namespace-identifier")
    protected String namespaceIdentifier;
    @XmlAttribute(name = "one-to-many")
    protected Boolean oneToMany;
    @XmlAttribute(name = "universal-identifier")
    protected String universalIdentifier;
    @XmlAttribute(name = "universal-identifier-type-code")
    protected String universalIdentifierTypeCode;

    /**
     * 获取columnIndex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getColumnIndex() {
        return columnIndex;
    }

    /**
     * 设置columnIndex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setColumnIndex(BigInteger value) {
        this.columnIndex = value;
    }

    /**
     * 获取fieldName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * 设置fieldName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**
     * 获取subfields属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SubFieldsType }
     *     
     */
    public SubFieldsType getSubfields() {
        return subfields;
    }

    /**
     * 设置subfields属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SubFieldsType }
     *     
     */
    public void setSubfields(SubFieldsType value) {
        this.subfields = value;
    }

    /**
     * 获取datatype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Datatype }
     *     
     */
    public Datatype getDatatype() {
        return datatype;
    }

    /**
     * 设置datatype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Datatype }
     *     
     */
    public void setDatatype(Datatype value) {
        this.datatype = value;
    }

    /**
     * 获取dateFormatString属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFormatString() {
        return dateFormatString;
    }

    /**
     * 设置dateFormatString属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFormatString(String value) {
        this.dateFormatString = value;
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
     * 获取enclosingCharacter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnclosingCharacter() {
        return enclosingCharacter;
    }

    /**
     * 设置enclosingCharacter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnclosingCharacter(String value) {
        this.enclosingCharacter = value;
    }

    /**
     * 获取isClusterId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsClusterId() {
        if (isClusterId == null) {
            return false;
        } else {
            return isClusterId;
        }
    }

    /**
     * 设置isClusterId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsClusterId(Boolean value) {
        this.isClusterId = value;
    }

    /**
     * 获取isIdentifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsIdentifier() {
        if (isIdentifier == null) {
            return false;
        } else {
            return isIdentifier;
        }
    }

    /**
     * 设置isIdentifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsIdentifier(Boolean value) {
        this.isIdentifier = value;
    }

    /**
     * 获取isIgnored属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsIgnored() {
        if (isIgnored == null) {
            return false;
        } else {
            return isIgnored;
        }
    }

    /**
     * 设置isIgnored属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsIgnored(Boolean value) {
        this.isIgnored = value;
    }

    /**
     * 获取identifierDomainName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifierDomainName() {
        return identifierDomainName;
    }

    /**
     * 设置identifierDomainName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifierDomainName(String value) {
        this.identifierDomainName = value;
    }

    /**
     * 获取namespaceIdentifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespaceIdentifier() {
        return namespaceIdentifier;
    }

    /**
     * 设置namespaceIdentifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespaceIdentifier(String value) {
        this.namespaceIdentifier = value;
    }

    /**
     * 获取oneToMany属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOneToMany() {
        if (oneToMany == null) {
            return false;
        } else {
            return oneToMany;
        }
    }

    /**
     * 设置oneToMany属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOneToMany(Boolean value) {
        this.oneToMany = value;
    }

    /**
     * 获取universalIdentifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversalIdentifier() {
        return universalIdentifier;
    }

    /**
     * 设置universalIdentifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversalIdentifier(String value) {
        this.universalIdentifier = value;
    }

    /**
     * 获取universalIdentifierTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversalIdentifierTypeCode() {
        return universalIdentifierTypeCode;
    }

    /**
     * 设置universalIdentifierTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversalIdentifierTypeCode(String value) {
        this.universalIdentifierTypeCode = value;
    }

}
