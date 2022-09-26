/*
 * An XML document type.
 * Localname: pesquisarServicosAdicionais
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionaisDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one pesquisarServicosAdicionais(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class PesquisarServicosAdicionaisDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionaisDocument
{
    
    public PesquisarServicosAdicionaisDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PESQUISARSERVICOSADICIONAIS$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "pesquisarServicosAdicionais");
    
    
    /**
     * Gets the "pesquisarServicosAdicionais" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionais getPesquisarServicosAdicionais()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionais target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionais)get_store().find_element_user(PESQUISARSERVICOSADICIONAIS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pesquisarServicosAdicionais" element
     */
    public void setPesquisarServicosAdicionais(br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionais pesquisarServicosAdicionais)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionais target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionais)get_store().find_element_user(PESQUISARSERVICOSADICIONAIS$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionais)get_store().add_element_user(PESQUISARSERVICOSADICIONAIS$0);
            }
            target.set(pesquisarServicosAdicionais);
        }
    }
    
    /**
     * Appends and returns a new empty "pesquisarServicosAdicionais" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionais addNewPesquisarServicosAdicionais()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionais target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionais)get_store().add_element_user(PESQUISARSERVICOSADICIONAIS$0);
            return target;
        }
    }
}
