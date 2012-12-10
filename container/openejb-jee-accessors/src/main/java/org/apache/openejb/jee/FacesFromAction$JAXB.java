/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
    * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.openejb.jee;

import com.envoisolutions.sxc.jaxb.JAXBObject;
import com.envoisolutions.sxc.jaxb.LifecycleCallback;
import com.envoisolutions.sxc.jaxb.RuntimeContext;
import com.envoisolutions.sxc.util.Attribute;
import com.envoisolutions.sxc.util.XoXMLStreamReader;
import com.envoisolutions.sxc.util.XoXMLStreamWriter;

import javax.xml.XMLConstants;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.namespace.QName;

@SuppressWarnings({
        "StringEquality"
})
public class FacesFromAction$JAXB
        extends JAXBObject<FacesFromAction> {


    public FacesFromAction$JAXB() {
        super(FacesFromAction.class, null, new QName("http://java.sun.com/xml/ns/javaee".intern(), "faces-config-from-actionType".intern()));
    }

    public static FacesFromAction readFacesFromAction(XoXMLStreamReader reader, RuntimeContext context)
            throws Exception {
        return _read(reader, context);
    }

    public static void writeFacesFromAction(XoXMLStreamWriter writer, FacesFromAction facesFromAction, RuntimeContext context)
            throws Exception {
        _write(writer, facesFromAction, context);
    }

    public void write(XoXMLStreamWriter writer, FacesFromAction facesFromAction, RuntimeContext context)
            throws Exception {
        _write(writer, facesFromAction, context);
    }

    public final static FacesFromAction _read(XoXMLStreamReader reader, RuntimeContext context)
            throws Exception {

        // Check for xsi:nil
        if (reader.isXsiNil()) {
            return null;
        }

        if (context == null) {
            context = new RuntimeContext();
        }

        FacesFromAction facesFromAction = new FacesFromAction();
        context.beforeUnmarshal(facesFromAction, LifecycleCallback.NONE);


        // Check xsi:type
        QName xsiType = reader.getXsiType();
        if (xsiType != null) {
            if (("faces-config-from-actionType" != xsiType.getLocalPart()) || ("http://java.sun.com/xml/ns/javaee" != xsiType.getNamespaceURI())) {
                return context.unexpectedXsiType(reader, FacesFromAction.class);
            }
        }

        // Read attributes
        for (Attribute attribute : reader.getAttributes()) {
            if (("id" == attribute.getLocalName()) && (("" == attribute.getNamespace()) || (attribute.getNamespace() == null))) {
                // ATTRIBUTE: id
                String id = Adapters.collapsedStringAdapterAdapter.unmarshal(attribute.getValue());
                context.addXmlId(reader, id, facesFromAction);
                facesFromAction.id = id;
            } else if (XMLConstants.W3C_XML_SCHEMA_INSTANCE_NS_URI != attribute.getNamespace()) {
                context.unexpectedAttribute(attribute, new QName("", "id"));
            }
        }

        // VALUE: value
        facesFromAction.value = null;

        context.afterUnmarshal(facesFromAction, LifecycleCallback.NONE);

        return facesFromAction;
    }

    public final FacesFromAction read(XoXMLStreamReader reader, RuntimeContext context)
            throws Exception {
        return _read(reader, context);
    }

    public final static void _write(XoXMLStreamWriter writer, FacesFromAction facesFromAction, RuntimeContext context)
            throws Exception {
        if (facesFromAction == null) {
            writer.writeXsiNil();
            return;
        }

        if (context == null) {
            context = new RuntimeContext();
        }

        if (FacesFromAction.class != facesFromAction.getClass()) {
            context.unexpectedSubclass(writer, facesFromAction, FacesFromAction.class);
            return;
        }

        context.beforeMarshal(facesFromAction, LifecycleCallback.NONE);


        // ATTRIBUTE: id
        String idRaw = facesFromAction.id;
        if (idRaw != null) {
            String id = null;
            try {
                id = Adapters.collapsedStringAdapterAdapter.marshal(idRaw);
            } catch (Exception e) {
                context.xmlAdapterError(facesFromAction, "id", CollapsedStringAdapter.class, String.class, String.class, e);
            }
            writer.writeAttribute("", "", "id", id);
        }

        // VALUE: value
        FacesELExpression value = facesFromAction.value;

        context.afterMarshal(facesFromAction, LifecycleCallback.NONE);
    }

}
