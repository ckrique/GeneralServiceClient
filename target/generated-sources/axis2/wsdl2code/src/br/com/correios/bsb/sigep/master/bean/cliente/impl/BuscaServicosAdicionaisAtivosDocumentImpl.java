/*
 * An XML document type.
 * Localname: buscaServicosAdicionaisAtivos
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivosDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one buscaServicosAdicionaisAtivos(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class BuscaServicosAdicionaisAtivosDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivosDocument
{
    
    public BuscaServicosAdicionaisAtivosDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSCASERVICOSADICIONAISATIVOS$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaServicosAdicionaisAtivos");
    
    
    /**
     * Gets the "buscaServicosAdicionaisAtivos" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivos getBuscaServicosAdicionaisAtivos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivos target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivos)get_store().find_element_user(BUSCASERVICOSADICIONAISATIVOS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "buscaServicosAdicionaisAtivos" element
     */
    public void setBuscaServicosAdicionaisAtivos(br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivos buscaServicosAdicionaisAtivos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivos target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivos)get_store().find_element_user(BUSCASERVICOSADICIONAISATIVOS$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivos)get_store().add_element_user(BUSCASERVICOSADICIONAISATIVOS$0);
            }
            target.set(buscaServicosAdicionaisAtivos);
        }
    }
    
    /**
     * Appends and returns a new empty "buscaServicosAdicionaisAtivos" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivos addNewBuscaServicosAdicionaisAtivos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivos target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivos)get_store().add_element_user(BUSCASERVICOSADICIONAISATIVOS$0);
            return target;
        }
    }
}
