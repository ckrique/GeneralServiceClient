/*
 * An XML document type.
 * Localname: cancelarObjetoResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjetoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one cancelarObjetoResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class CancelarObjetoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjetoResponseDocument
{
    
    public CancelarObjetoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CANCELAROBJETORESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "cancelarObjetoResponse");
    
    
    /**
     * Gets the "cancelarObjetoResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjetoResponse getCancelarObjetoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjetoResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjetoResponse)get_store().find_element_user(CANCELAROBJETORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cancelarObjetoResponse" element
     */
    public void setCancelarObjetoResponse(br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjetoResponse cancelarObjetoResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjetoResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjetoResponse)get_store().find_element_user(CANCELAROBJETORESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjetoResponse)get_store().add_element_user(CANCELAROBJETORESPONSE$0);
            }
            target.set(cancelarObjetoResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "cancelarObjetoResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjetoResponse addNewCancelarObjetoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjetoResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjetoResponse)get_store().add_element_user(CANCELAROBJETORESPONSE$0);
            return target;
        }
    }
}
