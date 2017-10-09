/*******************************************************************************
 * Copyright (c) 2013-2017 University of Stuttgart
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * and the Apache License 2.0 which both accompany this distribution,
 * and are available at http://www.eclipse.org/legal/epl-v20.html
 * and http://www.apache.org/licenses/LICENSE-2.0
 *
 * Contributors:
 *    Oliver Kopp - initial code generation using vhudson-jaxb-ri-2.1-2
 *    Christoph Kleine - Builder implementation
 *******************************************************************************/

package org.eclipse.winery.model.tosca;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;


/**
 * <p>Java class for tCapabilityDefinition complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tCapabilityDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/tosca/ns/2011/12}tExtensibleElements">
 *       &lt;sequence>
 *         &lt;element name="Constraints" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Constraint" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tConstraint"
 * maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="capabilityType" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="lowerBound" type="{http://www.w3.org/2001/XMLSchema}int" default="1" />
 *       &lt;attribute name="upperBound" default="1">
 *         &lt;simpleType>
 *           &lt;union>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
 *                 &lt;pattern value="([1-9]+[0-9]*)"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="unbounded"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCapabilityDefinition", propOrder = {
    "constraints"
})
public class TCapabilityDefinition extends TExtensibleElements {
    @XmlElement(name = "Constraints")
    protected TCapabilityDefinition.Constraints constraints;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "capabilityType", required = true)
    protected QName capabilityType;
    @XmlAttribute(name = "lowerBound")
    protected Integer lowerBound;
    @XmlAttribute(name = "upperBound")
    protected String upperBound;

    public TCapabilityDefinition() {
    }

    public TCapabilityDefinition(Builder builder) {
        super(builder);
        this.constraints = builder.constraints;
        this.name = builder.name;
        this.capabilityType = builder.capabilityType;
        this.lowerBound = builder.lowerBound;
        this.upperBound = builder.upperBound;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TCapabilityDefinition)) return false;
        TCapabilityDefinition that = (TCapabilityDefinition) o;
        return Objects.equals(constraints, that.constraints) &&
            Objects.equals(name, that.name) &&
            Objects.equals(capabilityType, that.capabilityType) &&
            Objects.equals(lowerBound, that.lowerBound) &&
            Objects.equals(upperBound, that.upperBound);
    }

    @Override
    public int hashCode() {
        return Objects.hash(constraints, name, capabilityType, lowerBound, upperBound);
    }

    /**
     * Gets the value of the constraints property.
     *
     * @return possible object is {@link TCapabilityDefinition.Constraints }
     */
    /*@Nullable*/
    public TCapabilityDefinition.Constraints getConstraints() {
        return constraints;
    }

    /**
     * Sets the value of the constraints property.
     *
     * @param value allowed object is {@link TCapabilityDefinition.Constraints }
     */
    public void setConstraints(TCapabilityDefinition.Constraints value) {
        this.constraints = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is {@link String }
     */
    @NonNull
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the capabilityType property.
     *
     * @return possible object is {@link QName }
     */
    @Nullable
    public QName getCapabilityType() {
        return capabilityType;
    }

    /**
     * Sets the value of the capabilityType property.
     *
     * @param value allowed object is {@link QName }
     */
    public void setCapabilityType(QName value) {
        this.capabilityType = value;
    }

    /**
     * Gets the value of the lowerBound property.
     *
     * @return possible object is {@link Integer }
     */
    @NonNull
    public int getLowerBound() {
        if (lowerBound == null) {
            return 1;
        } else {
            return lowerBound;
        }
    }

    /**
     * Sets the value of the lowerBound property.
     *
     * @param value allowed object is {@link Integer }
     */
    public void setLowerBound(Integer value) {
        this.lowerBound = value;
    }

    /**
     * Gets the value of the upperBound property.
     *
     * @return possible object is {@link String }
     */
    @NonNull
    public String getUpperBound() {
        if (upperBound == null) {
            return "1";
        } else {
            return upperBound;
        }
    }

    /**
     * Sets the value of the upperBound property.
     *
     * @param value allowed object is {@link String }
     */
    public void setUpperBound(String value) {
        this.upperBound = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Constraint" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tConstraint"
     * maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "constraint"
    })
    public static class Constraints {

        @XmlElement(name = "Constraint", required = true)
        protected List<TConstraint> constraint;

        /**
         * Gets the value of the constraint property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the constraint property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConstraint().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TConstraint }
         */
        @NonNull
        public List<TConstraint> getConstraint() {
            if (constraint == null) {
                constraint = new ArrayList<TConstraint>();
            }
            return this.constraint;
        }
    }

    public static class Builder extends TExtensibleElements.Builder<Builder> {
        private final String name;
        private final QName capabilityType;

        private TCapabilityDefinition.Constraints constraints;
        private Integer lowerBound;
        private String upperBound;

        public Builder(String name, QName capabilityType) {
            this.name = name;
            this.capabilityType = capabilityType;
        }

        public Builder setConstraints(TCapabilityDefinition.Constraints constraints) {
            this.constraints = constraints;
            return this;
        }

        public Builder setLowerBound(Integer lowerBound) {
            this.lowerBound = lowerBound;
            return this;
        }

        public Builder setUpperBound(String upperBound) {
            this.upperBound = upperBound;
            return this;
        }

        public Builder addConstraints(TCapabilityDefinition.Constraints constraints) {
            if (constraints == null || constraints.getConstraint().isEmpty()) {
                return this;
            }

            if (this.constraints == null) {
                this.constraints = constraints;
            } else {
                this.constraints.getConstraint().addAll(constraints.getConstraint());
            }
            return this;
        }

        public Builder addConstraints(List<TConstraint> constraints) {
            if (constraints == null) {
                return this;
            }

            TCapabilityDefinition.Constraints tmp = new TCapabilityDefinition.Constraints();
            tmp.getConstraint().addAll(constraints);
            return addConstraints(tmp);
        }

        public Builder addConstraints(TConstraint constraints) {
            if (constraints == null) {
                return this;
            }

            TCapabilityDefinition.Constraints tmp = new TCapabilityDefinition.Constraints();
            tmp.getConstraint().add(constraints);
            return addConstraints(tmp);
        }

        @Override
        public Builder self() {
            return this;
        }

        public TCapabilityDefinition build() {
            return new TCapabilityDefinition(this);
        }
    }
}
