/*
 * An XML document type.
 * Localname: buscaServicos
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one buscaServicos(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class BuscaServicosDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosDocument
{
    
    public BuscaServicosDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSCASERVICOS$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaServicos");
    
    
    /**
     * Gets the "buscaServicos" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicos getBuscaServicos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicos target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicos)get_store().find_element_user(BUSCASERVICOS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "buscaServicos" element
     */
    public void setBuscaServicos(br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicos buscaServicos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicos target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicos)get_store().find_element_user(BUSCASERVICOS$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicos)get_store().add_element_user(BUSCASERVICOS$0);
            }
            target.set(buscaServicos);
        }
    }
    
    /**
     * Appends and returns a new empty "buscaServicos" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicos addNewBuscaServicos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicos target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicos)get_store().add_element_user(BUSCASERVICOS$0);
            return target;
        }
    }
}
