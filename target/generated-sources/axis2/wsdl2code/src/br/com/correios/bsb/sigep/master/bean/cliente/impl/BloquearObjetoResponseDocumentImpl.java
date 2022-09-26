/*
 * An XML document type.
 * Localname: bloquearObjetoResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjetoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one bloquearObjetoResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class BloquearObjetoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjetoResponseDocument
{
    
    public BloquearObjetoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLOQUEAROBJETORESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "bloquearObjetoResponse");
    
    
    /**
     * Gets the "bloquearObjetoResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjetoResponse getBloquearObjetoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjetoResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjetoResponse)get_store().find_element_user(BLOQUEAROBJETORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "bloquearObjetoResponse" element
     */
    public void setBloquearObjetoResponse(br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjetoResponse bloquearObjetoResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjetoResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjetoResponse)get_store().find_element_user(BLOQUEAROBJETORESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjetoResponse)get_store().add_element_user(BLOQUEAROBJETORESPONSE$0);
            }
            target.set(bloquearObjetoResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "bloquearObjetoResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjetoResponse addNewBloquearObjetoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjetoResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjetoResponse)get_store().add_element_user(BLOQUEAROBJETORESPONSE$0);
            return target;
        }
    }
}
