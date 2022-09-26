/*
 * An XML document type.
 * Localname: obterClienteAtualizacao
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacaoDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one obterClienteAtualizacao(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class ObterClienteAtualizacaoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacaoDocument
{
    
    public ObterClienteAtualizacaoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBTERCLIENTEATUALIZACAO$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "obterClienteAtualizacao");
    
    
    /**
     * Gets the "obterClienteAtualizacao" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacao getObterClienteAtualizacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacao target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacao)get_store().find_element_user(OBTERCLIENTEATUALIZACAO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "obterClienteAtualizacao" element
     */
    public void setObterClienteAtualizacao(br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacao obterClienteAtualizacao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacao target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacao)get_store().find_element_user(OBTERCLIENTEATUALIZACAO$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacao)get_store().add_element_user(OBTERCLIENTEATUALIZACAO$0);
            }
            target.set(obterClienteAtualizacao);
        }
    }
    
    /**
     * Appends and returns a new empty "obterClienteAtualizacao" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacao addNewObterClienteAtualizacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacao target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacao)get_store().add_element_user(OBTERCLIENTEATUALIZACAO$0);
            return target;
        }
    }
}
