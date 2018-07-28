/**
 *
 * Copyright (C) 2002-2012 "SYSNET International, Inc."
 * support@sysnetint.com [http://www.sysnetint.com]
 *
 * This file is part of OpenEMPI.
 *
 * OpenEMPI is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package org.hl7.v3;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IVL_REAL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IVL_REAL">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}SXCM_REAL">
 *       &lt;choice minOccurs="0">
 *         &lt;sequence>
 *           &lt;element name="low" type="{urn:hl7-org:v3}IVXB_REAL"/>
 *           &lt;choice minOccurs="0">
 *             &lt;element name="width" type="{urn:hl7-org:v3}REAL" minOccurs="0"/>
 *             &lt;element name="high" type="{urn:hl7-org:v3}IVXB_REAL" minOccurs="0"/>
 *           &lt;/choice>
 *         &lt;/sequence>
 *         &lt;element name="high" type="{urn:hl7-org:v3}IVXB_REAL"/>
 *         &lt;sequence>
 *           &lt;element name="width" type="{urn:hl7-org:v3}REAL"/>
 *           &lt;element name="high" type="{urn:hl7-org:v3}IVXB_REAL" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="center" type="{urn:hl7-org:v3}REAL"/>
 *           &lt;element name="width" type="{urn:hl7-org:v3}REAL" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IVL_REAL", propOrder = {
    "rest"
})
public class IVLREAL
    extends SXCMREAL
{

    @XmlElementRefs({
        @XmlElementRef(name = "low", namespace = "urn:hl7-org:v3", type = JAXBElement.class),
        @XmlElementRef(name = "center", namespace = "urn:hl7-org:v3", type = JAXBElement.class),
        @XmlElementRef(name = "width", namespace = "urn:hl7-org:v3", type = JAXBElement.class),
        @XmlElementRef(name = "high", namespace = "urn:hl7-org:v3", type = JAXBElement.class)
    })
    protected List<JAXBElement<? extends REAL>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "High" is used by two different parts of a schema. See: 
     * line 900 of file:/sysnet/projects/openempi-development/openempi/pixpdq/src/main/resources/schema/HL7V3/NE2008/coreschemas/datatypes.xsd
     * line 891 of file:/sysnet/projects/openempi-development/openempi/pixpdq/src/main/resources/schema/HL7V3/NE2008/coreschemas/datatypes.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link IVXBREAL }{@code >}
     * {@link JAXBElement }{@code <}{@link REAL }{@code >}
     * {@link JAXBElement }{@code <}{@link IVXBREAL }{@code >}
     * {@link JAXBElement }{@code <}{@link REAL }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends REAL>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<? extends REAL>>();
        }
        return this.rest;
    }

}
