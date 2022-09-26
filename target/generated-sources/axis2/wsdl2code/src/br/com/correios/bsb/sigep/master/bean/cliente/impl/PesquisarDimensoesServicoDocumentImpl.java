/*
 * An XML document type.
 * Localname: pesquisarDimensoesServico
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServicoDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one pesquisarDimensoesServico(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class PesquisarDimensoesServicoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServicoDocument
{
    
    public PesquisarDimensoesServicoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PESQUISARDIMENSOESSERVICO$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "pesquisarDimensoesServico");
    
    
    /**
     * Gets the "pesquisarDimensoesServico" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServico getPesquisarDimensoesServico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServico target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServico)get_store().find_element_user(PESQUISARDIMENSOESSERVICO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pesquisarDimensoesServico" element
     */
    public void setPesquisarDimensoesServico(br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServico pesquisarDimensoesServico)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServico target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServico)get_store().find_element_user(PESQUISARDIMENSOESSERVICO$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServico)get_store().add_element_user(PESQUISARDIMENSOESSERVICO$0);
            }
            target.set(pesquisarDimensoesServico);
        }
    }
    
    /**
     * Appends and returns a new empty "pesquisarDimensoesServico" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServico addNewPesquisarDimensoesServico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServico target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServico)get_store().add_element_user(PESQUISARDIMENSOESSERVICO$0);
            return target;
        }
    }
}
