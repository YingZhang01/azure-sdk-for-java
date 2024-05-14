// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.servicebus.administration.implementation.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.xml.XmlReader;
import com.azure.xml.XmlToken;
import com.azure.xml.XmlWriter;
import javax.xml.stream.XMLStreamException;

/**
 * The EmptyRuleAction model.
 */
@Immutable
public final class EmptyRuleActionImpl extends RuleActionImpl {
    private static final String SCHEMAS_MICROSOFT_COM_SERVICEBUS_CONNECT
        = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect";

    private static final String WWW_W3_ORG_TWO_ZERO_ZERO_ONE_XMLSCHEMA_INSTANCE
        = "http://www.w3.org/2001/XMLSchema-instance";

    /*
     * The type property.
     */
    private String type = "EmptyRuleAction";

    /**
     * Creates an instance of EmptyRuleAction class.
     */
    public EmptyRuleActionImpl() {
    }

    /**
     * Get the type property: The type property.
     * 
     * @return the type value.
     */
    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter) throws XMLStreamException {
        return toXml(xmlWriter, null);
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter, String rootElementName) throws XMLStreamException {
        rootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "Action" : rootElementName;
        xmlWriter.writeStartElement(rootElementName);
        xmlWriter.writeNamespace(SCHEMAS_MICROSOFT_COM_SERVICEBUS_CONNECT);
        xmlWriter.writeNamespace("xsi", WWW_W3_ORG_TWO_ZERO_ZERO_ONE_XMLSCHEMA_INSTANCE);
        xmlWriter.writeStringAttribute(WWW_W3_ORG_TWO_ZERO_ZERO_ONE_XMLSCHEMA_INSTANCE, "type", this.type);
        return xmlWriter.writeEndElement();
    }

    /**
     * Reads an instance of EmptyRuleAction from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @return An instance of EmptyRuleAction if the XmlReader was pointing to an instance of it, or null if it was
     * pointing to XML null.
     * @throws IllegalStateException If the deserialized XML object has an invalid polymorphic discriminator value.
     * @throws XMLStreamException If an error occurs while reading the EmptyRuleAction.
     */
    public static EmptyRuleActionImpl fromXml(XmlReader xmlReader) throws XMLStreamException {
        return fromXml(xmlReader, null);
    }

    /**
     * Reads an instance of EmptyRuleAction from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @param rootElementName Optional root element name to override the default defined by the model. Used to support
     * cases where the model can deserialize from different root element names.
     * @return An instance of EmptyRuleAction if the XmlReader was pointing to an instance of it, or null if it was
     * pointing to XML null.
     * @throws IllegalStateException If the deserialized XML object has an invalid polymorphic discriminator value.
     * @throws XMLStreamException If an error occurs while reading the EmptyRuleAction.
     */
    public static EmptyRuleActionImpl fromXml(XmlReader xmlReader, String rootElementName) throws XMLStreamException {
        String finalRootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "Action" : rootElementName;
        return xmlReader.readObject(SCHEMAS_MICROSOFT_COM_SERVICEBUS_CONNECT, finalRootElementName, reader -> {
            EmptyRuleActionImpl deserializedEmptyRuleAction = new EmptyRuleActionImpl();
            String discriminatorValue
                = reader.getStringAttribute(WWW_W3_ORG_TWO_ZERO_ZERO_ONE_XMLSCHEMA_INSTANCE, "type");
            if (!"EmptyRuleAction".equals(discriminatorValue)) {
                throw new IllegalStateException(
                    "'type' was expected to be non-null and equal to 'EmptyRuleAction'. The found 'type' was '"
                        + discriminatorValue + "'.");
            }
            deserializedEmptyRuleAction.type = discriminatorValue;
            while (reader.nextElement() != XmlToken.END_ELEMENT) {
                reader.skipElement();
            }

            return deserializedEmptyRuleAction;
        });
    }
}
