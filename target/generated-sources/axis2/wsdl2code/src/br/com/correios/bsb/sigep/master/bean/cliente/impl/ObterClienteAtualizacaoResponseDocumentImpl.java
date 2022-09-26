/*
 * An XML document type.
 * Localname: obterClienteAtualizacaoResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacaoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one obterClienteAtualizacaoResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class ObterClienteAtualizacaoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacaoResponseDocument
{
    
    public ObterClienteAtualizacaoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBTERCLIENTEATUALIZACAORESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "obterClienteAtualizacaoResponse");
    
    
    /**
     * Gets the "obterClienteAtualizacaoResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacaoResponse getObterClienteAtualizacaoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacaoResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacaoResponse)get_store().find_element_user(OBTERCLIENTEATUALIZACAORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "obterClienteAtualizacaoResponse" element
     */
    public void setObterClienteAtualizacaoResponse(br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacaoResponse obterClienteAtualizacaoResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacaoResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacaoResponse)get_store().find_element_user(OBTERCLIENTEATUALIZACAORESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacaoResponse)get_store().add_element_user(OBTERCLIENTEATUALIZACAORESPONSE$0);
            }
            target.set(obterClienteAtualizacaoResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "obterClienteAtualizacaoResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacaoResponse addNewObterClienteAtualizacaoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacaoResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacaoResponse)get_store().add_element_user(OBTERCLIENTEATUALIZACAORESPONSE$0);
            return target;
        }
    }
}
