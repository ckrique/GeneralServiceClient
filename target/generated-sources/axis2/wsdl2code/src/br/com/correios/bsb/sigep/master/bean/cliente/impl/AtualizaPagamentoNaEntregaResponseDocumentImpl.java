/*
 * An XML document type.
 * Localname: atualizaPagamentoNaEntregaResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntregaResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one atualizaPagamentoNaEntregaResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class AtualizaPagamentoNaEntregaResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntregaResponseDocument
{
    
    public AtualizaPagamentoNaEntregaResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATUALIZAPAGAMENTONAENTREGARESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "atualizaPagamentoNaEntregaResponse");
    
    
    /**
     * Gets the "atualizaPagamentoNaEntregaResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntregaResponse getAtualizaPagamentoNaEntregaResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntregaResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntregaResponse)get_store().find_element_user(ATUALIZAPAGAMENTONAENTREGARESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "atualizaPagamentoNaEntregaResponse" element
     */
    public void setAtualizaPagamentoNaEntregaResponse(br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntregaResponse atualizaPagamentoNaEntregaResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntregaResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntregaResponse)get_store().find_element_user(ATUALIZAPAGAMENTONAENTREGARESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntregaResponse)get_store().add_element_user(ATUALIZAPAGAMENTONAENTREGARESPONSE$0);
            }
            target.set(atualizaPagamentoNaEntregaResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "atualizaPagamentoNaEntregaResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntregaResponse addNewAtualizaPagamentoNaEntregaResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntregaResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntregaResponse)get_store().add_element_user(ATUALIZAPAGAMENTONAENTREGARESPONSE$0);
            return target;
        }
    }
}
