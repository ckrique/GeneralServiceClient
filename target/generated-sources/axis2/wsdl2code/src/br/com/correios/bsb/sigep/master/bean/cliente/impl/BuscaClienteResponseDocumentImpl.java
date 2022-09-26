/*
 * An XML document type.
 * Localname: buscaClienteResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.BuscaClienteResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one buscaClienteResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class BuscaClienteResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.BuscaClienteResponseDocument
{
    
    public BuscaClienteResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSCACLIENTERESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaClienteResponse");
    
    
    /**
     * Gets the "buscaClienteResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BuscaClienteResponse getBuscaClienteResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaClienteResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaClienteResponse)get_store().find_element_user(BUSCACLIENTERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "buscaClienteResponse" element
     */
    public void setBuscaClienteResponse(br.com.correios.bsb.sigep.master.bean.cliente.BuscaClienteResponse buscaClienteResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaClienteResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaClienteResponse)get_store().find_element_user(BUSCACLIENTERESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaClienteResponse)get_store().add_element_user(BUSCACLIENTERESPONSE$0);
            }
            target.set(buscaClienteResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "buscaClienteResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BuscaClienteResponse addNewBuscaClienteResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaClienteResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaClienteResponse)get_store().add_element_user(BUSCACLIENTERESPONSE$0);
            return target;
        }
    }
}
