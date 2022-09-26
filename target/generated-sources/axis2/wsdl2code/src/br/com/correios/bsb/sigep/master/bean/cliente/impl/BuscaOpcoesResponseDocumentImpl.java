/*
 * An XML document type.
 * Localname: buscaOpcoesResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.BuscaOpcoesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one buscaOpcoesResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class BuscaOpcoesResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.BuscaOpcoesResponseDocument
{
    
    public BuscaOpcoesResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSCAOPCOESRESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaOpcoesResponse");
    
    
    /**
     * Gets the "buscaOpcoesResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BuscaOpcoesResponse getBuscaOpcoesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaOpcoesResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaOpcoesResponse)get_store().find_element_user(BUSCAOPCOESRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "buscaOpcoesResponse" element
     */
    public void setBuscaOpcoesResponse(br.com.correios.bsb.sigep.master.bean.cliente.BuscaOpcoesResponse buscaOpcoesResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaOpcoesResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaOpcoesResponse)get_store().find_element_user(BUSCAOPCOESRESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaOpcoesResponse)get_store().add_element_user(BUSCAOPCOESRESPONSE$0);
            }
            target.set(buscaOpcoesResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "buscaOpcoesResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BuscaOpcoesResponse addNewBuscaOpcoesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaOpcoesResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaOpcoesResponse)get_store().add_element_user(BUSCAOPCOESRESPONSE$0);
            return target;
        }
    }
}
