/*
 * An XML document type.
 * Localname: atualizaPagamentoNaEntrega
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntregaDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one atualizaPagamentoNaEntrega(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class AtualizaPagamentoNaEntregaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntregaDocument
{
    
    public AtualizaPagamentoNaEntregaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATUALIZAPAGAMENTONAENTREGA$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "atualizaPagamentoNaEntrega");
    
    
    /**
     * Gets the "atualizaPagamentoNaEntrega" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntrega getAtualizaPagamentoNaEntrega()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntrega target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntrega)get_store().find_element_user(ATUALIZAPAGAMENTONAENTREGA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "atualizaPagamentoNaEntrega" element
     */
    public void setAtualizaPagamentoNaEntrega(br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntrega atualizaPagamentoNaEntrega)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntrega target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntrega)get_store().find_element_user(ATUALIZAPAGAMENTONAENTREGA$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntrega)get_store().add_element_user(ATUALIZAPAGAMENTONAENTREGA$0);
            }
            target.set(atualizaPagamentoNaEntrega);
        }
    }
    
    /**
     * Appends and returns a new empty "atualizaPagamentoNaEntrega" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntrega addNewAtualizaPagamentoNaEntrega()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntrega target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntrega)get_store().add_element_user(ATUALIZAPAGAMENTONAENTREGA$0);
            return target;
        }
    }
}
