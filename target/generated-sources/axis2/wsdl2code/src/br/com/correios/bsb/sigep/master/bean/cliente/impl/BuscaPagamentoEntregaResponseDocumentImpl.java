/*
 * An XML document type.
 * Localname: buscaPagamentoEntregaResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntregaResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one buscaPagamentoEntregaResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class BuscaPagamentoEntregaResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntregaResponseDocument
{
    
    public BuscaPagamentoEntregaResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSCAPAGAMENTOENTREGARESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaPagamentoEntregaResponse");
    
    
    /**
     * Gets the "buscaPagamentoEntregaResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntregaResponse getBuscaPagamentoEntregaResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntregaResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntregaResponse)get_store().find_element_user(BUSCAPAGAMENTOENTREGARESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "buscaPagamentoEntregaResponse" element
     */
    public void setBuscaPagamentoEntregaResponse(br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntregaResponse buscaPagamentoEntregaResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntregaResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntregaResponse)get_store().find_element_user(BUSCAPAGAMENTOENTREGARESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntregaResponse)get_store().add_element_user(BUSCAPAGAMENTOENTREGARESPONSE$0);
            }
            target.set(buscaPagamentoEntregaResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "buscaPagamentoEntregaResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntregaResponse addNewBuscaPagamentoEntregaResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntregaResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntregaResponse)get_store().add_element_user(BUSCAPAGAMENTOENTREGARESPONSE$0);
            return target;
        }
    }
}
