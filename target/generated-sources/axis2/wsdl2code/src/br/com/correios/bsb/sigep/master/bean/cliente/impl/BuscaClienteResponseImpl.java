/*
 * XML Type:  buscaClienteResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.BuscaClienteResponse
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML buscaClienteResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class BuscaClienteResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.BuscaClienteResponse
{
    
    public BuscaClienteResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RETURN$0 = 
        new javax.xml.namespace.QName("", "return");
    
    
    /**
     * Gets the "return" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP getReturn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP)get_store().find_element_user(RETURN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "return" element
     */
    public boolean isSetReturn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RETURN$0) != 0;
        }
    }
    
    /**
     * Sets the "return" element
     */
    public void setReturn(br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP xreturn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP)get_store().find_element_user(RETURN$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP)get_store().add_element_user(RETURN$0);
            }
            target.set(xreturn);
        }
    }
    
    /**
     * Appends and returns a new empty "return" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP addNewReturn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP)get_store().add_element_user(RETURN$0);
            return target;
        }
    }
    
    /**
     * Unsets the "return" element
     */
    public void unsetReturn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RETURN$0, 0);
        }
    }
}
