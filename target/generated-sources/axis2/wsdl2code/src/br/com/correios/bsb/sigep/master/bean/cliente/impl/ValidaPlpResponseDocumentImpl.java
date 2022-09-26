/*
 * An XML document type.
 * Localname: validaPlpResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlpResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one validaPlpResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class ValidaPlpResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlpResponseDocument
{
    
    public ValidaPlpResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDAPLPRESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "validaPlpResponse");
    
    
    /**
     * Gets the "validaPlpResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlpResponse getValidaPlpResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlpResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlpResponse)get_store().find_element_user(VALIDAPLPRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "validaPlpResponse" element
     */
    public void setValidaPlpResponse(br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlpResponse validaPlpResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlpResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlpResponse)get_store().find_element_user(VALIDAPLPRESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlpResponse)get_store().add_element_user(VALIDAPLPRESPONSE$0);
            }
            target.set(validaPlpResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "validaPlpResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlpResponse addNewValidaPlpResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlpResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlpResponse)get_store().add_element_user(VALIDAPLPRESPONSE$0);
            return target;
        }
    }
}
