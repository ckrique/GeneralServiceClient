/*
 * An XML document type.
 * Localname: integrarUsuarioScol
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScolDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one integrarUsuarioScol(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class IntegrarUsuarioScolDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScolDocument
{
    
    public IntegrarUsuarioScolDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTEGRARUSUARIOSCOL$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "integrarUsuarioScol");
    
    
    /**
     * Gets the "integrarUsuarioScol" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScol getIntegrarUsuarioScol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScol target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScol)get_store().find_element_user(INTEGRARUSUARIOSCOL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "integrarUsuarioScol" element
     */
    public void setIntegrarUsuarioScol(br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScol integrarUsuarioScol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScol target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScol)get_store().find_element_user(INTEGRARUSUARIOSCOL$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScol)get_store().add_element_user(INTEGRARUSUARIOSCOL$0);
            }
            target.set(integrarUsuarioScol);
        }
    }
    
    /**
     * Appends and returns a new empty "integrarUsuarioScol" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScol addNewIntegrarUsuarioScol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScol target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScol)get_store().add_element_user(INTEGRARUSUARIOSCOL$0);
            return target;
        }
    }
}
