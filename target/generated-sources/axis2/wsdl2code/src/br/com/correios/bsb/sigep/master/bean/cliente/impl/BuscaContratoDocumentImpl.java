/*
 * An XML document type.
 * Localname: buscaContrato
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.BuscaContratoDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one buscaContrato(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class BuscaContratoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.BuscaContratoDocument
{
    
    public BuscaContratoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSCACONTRATO$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaContrato");
    
    
    /**
     * Gets the "buscaContrato" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BuscaContrato getBuscaContrato()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaContrato target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaContrato)get_store().find_element_user(BUSCACONTRATO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "buscaContrato" element
     */
    public void setBuscaContrato(br.com.correios.bsb.sigep.master.bean.cliente.BuscaContrato buscaContrato)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaContrato target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaContrato)get_store().find_element_user(BUSCACONTRATO$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaContrato)get_store().add_element_user(BUSCACONTRATO$0);
            }
            target.set(buscaContrato);
        }
    }
    
    /**
     * Appends and returns a new empty "buscaContrato" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BuscaContrato addNewBuscaContrato()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaContrato target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaContrato)get_store().add_element_user(BUSCACONTRATO$0);
            return target;
        }
    }
}
