/*
 * An XML document type.
 * Localname: pesquisarEmbalagensPorServico
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one pesquisarEmbalagensPorServico(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class PesquisarEmbalagensPorServicoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoDocument
{
    
    public PesquisarEmbalagensPorServicoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PESQUISAREMBALAGENSPORSERVICO$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "pesquisarEmbalagensPorServico");
    
    
    /**
     * Gets the "pesquisarEmbalagensPorServico" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServico getPesquisarEmbalagensPorServico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServico target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServico)get_store().find_element_user(PESQUISAREMBALAGENSPORSERVICO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pesquisarEmbalagensPorServico" element
     */
    public void setPesquisarEmbalagensPorServico(br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServico pesquisarEmbalagensPorServico)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServico target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServico)get_store().find_element_user(PESQUISAREMBALAGENSPORSERVICO$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServico)get_store().add_element_user(PESQUISAREMBALAGENSPORSERVICO$0);
            }
            target.set(pesquisarEmbalagensPorServico);
        }
    }
    
    /**
     * Appends and returns a new empty "pesquisarEmbalagensPorServico" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServico addNewPesquisarEmbalagensPorServico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServico target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServico)get_store().add_element_user(PESQUISAREMBALAGENSPORSERVICO$0);
            return target;
        }
    }
}
