/*
 * XML Type:  consultaCEP
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEP
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML consultaCEP(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class ConsultaCEPImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEP
{
    
    public ConsultaCEPImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CEP$0 = 
        new javax.xml.namespace.QName("", "cep");
    
    
    /**
     * Gets the "cep" element
     */
    public java.lang.String getCep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CEP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cep" element
     */
    public org.apache.xmlbeans.XmlString xgetCep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CEP$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "cep" element
     */
    public boolean isSetCep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CEP$0) != 0;
        }
    }
    
    /**
     * Sets the "cep" element
     */
    public void setCep(java.lang.String cep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CEP$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CEP$0);
            }
            target.setStringValue(cep);
        }
    }
    
    /**
     * Sets (as xml) the "cep" element
     */
    public void xsetCep(org.apache.xmlbeans.XmlString cep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CEP$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CEP$0);
            }
            target.set(cep);
        }
    }
    
    /**
     * Unsets the "cep" element
     */
    public void unsetCep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CEP$0, 0);
        }
    }
}
