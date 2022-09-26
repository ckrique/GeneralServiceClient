/*
 * An XML document type.
 * Localname: buscaServicosXServicosAdicionais
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionaisDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one buscaServicosXServicosAdicionais(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class BuscaServicosXServicosAdicionaisDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionaisDocument
{
    
    public BuscaServicosXServicosAdicionaisDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSCASERVICOSXSERVICOSADICIONAIS$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaServicosXServicosAdicionais");
    
    
    /**
     * Gets the "buscaServicosXServicosAdicionais" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionais getBuscaServicosXServicosAdicionais()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionais target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionais)get_store().find_element_user(BUSCASERVICOSXSERVICOSADICIONAIS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "buscaServicosXServicosAdicionais" element
     */
    public void setBuscaServicosXServicosAdicionais(br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionais buscaServicosXServicosAdicionais)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionais target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionais)get_store().find_element_user(BUSCASERVICOSXSERVICOSADICIONAIS$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionais)get_store().add_element_user(BUSCASERVICOSXSERVICOSADICIONAIS$0);
            }
            target.set(buscaServicosXServicosAdicionais);
        }
    }
    
    /**
     * Appends and returns a new empty "buscaServicosXServicosAdicionais" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionais addNewBuscaServicosXServicosAdicionais()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionais target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionais)get_store().add_element_user(BUSCASERVICOSXSERVICOSADICIONAIS$0);
            return target;
        }
    }
}
