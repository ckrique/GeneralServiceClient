/*
 * An XML document type.
 * Localname: buscaTarifaVale
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaValeDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one buscaTarifaVale(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class BuscaTarifaValeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaValeDocument
{
    
    public BuscaTarifaValeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSCATARIFAVALE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaTarifaVale");
    
    
    /**
     * Gets the "buscaTarifaVale" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaVale getBuscaTarifaVale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaVale target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaVale)get_store().find_element_user(BUSCATARIFAVALE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "buscaTarifaVale" element
     */
    public void setBuscaTarifaVale(br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaVale buscaTarifaVale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaVale target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaVale)get_store().find_element_user(BUSCATARIFAVALE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaVale)get_store().add_element_user(BUSCATARIFAVALE$0);
            }
            target.set(buscaTarifaVale);
        }
    }
    
    /**
     * Appends and returns a new empty "buscaTarifaVale" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaVale addNewBuscaTarifaVale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaVale target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaVale)get_store().add_element_user(BUSCATARIFAVALE$0);
            return target;
        }
    }
}
