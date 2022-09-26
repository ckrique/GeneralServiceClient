/*
 * An XML document type.
 * Localname: fechaPlpResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one fechaPlpResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class FechaPlpResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpResponseDocument
{
    
    public FechaPlpResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FECHAPLPRESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "fechaPlpResponse");
    
    
    /**
     * Gets the "fechaPlpResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpResponse getFechaPlpResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpResponse)get_store().find_element_user(FECHAPLPRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fechaPlpResponse" element
     */
    public void setFechaPlpResponse(br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpResponse fechaPlpResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpResponse)get_store().find_element_user(FECHAPLPRESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpResponse)get_store().add_element_user(FECHAPLPRESPONSE$0);
            }
            target.set(fechaPlpResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "fechaPlpResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpResponse addNewFechaPlpResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpResponse)get_store().add_element_user(FECHAPLPRESPONSE$0);
            return target;
        }
    }
}
