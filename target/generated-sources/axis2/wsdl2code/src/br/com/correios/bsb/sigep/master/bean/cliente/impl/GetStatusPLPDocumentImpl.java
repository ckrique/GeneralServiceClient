/*
 * An XML document type.
 * Localname: getStatusPLP
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLPDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one getStatusPLP(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class GetStatusPLPDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLPDocument
{
    
    public GetStatusPLPDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSTATUSPLP$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "getStatusPLP");
    
    
    /**
     * Gets the "getStatusPLP" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLP getGetStatusPLP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLP)get_store().find_element_user(GETSTATUSPLP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getStatusPLP" element
     */
    public void setGetStatusPLP(br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLP getStatusPLP)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLP)get_store().find_element_user(GETSTATUSPLP$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLP)get_store().add_element_user(GETSTATUSPLP$0);
            }
            target.set(getStatusPLP);
        }
    }
    
    /**
     * Appends and returns a new empty "getStatusPLP" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLP addNewGetStatusPLP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLP)get_store().add_element_user(GETSTATUSPLP$0);
            return target;
        }
    }
}
