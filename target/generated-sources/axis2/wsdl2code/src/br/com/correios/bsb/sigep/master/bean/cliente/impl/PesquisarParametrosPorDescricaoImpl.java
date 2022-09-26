/*
 * XML Type:  pesquisarParametrosPorDescricao
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.PesquisarParametrosPorDescricao
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML pesquisarParametrosPorDescricao(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class PesquisarParametrosPorDescricaoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.PesquisarParametrosPorDescricao
{
    
    public PesquisarParametrosPorDescricaoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PREFIX$0 = 
        new javax.xml.namespace.QName("", "prefix");
    
    
    /**
     * Gets the "prefix" element
     */
    public java.lang.String getPrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFIX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "prefix" element
     */
    public org.apache.xmlbeans.XmlString xgetPrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREFIX$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "prefix" element
     */
    public boolean isSetPrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREFIX$0) != 0;
        }
    }
    
    /**
     * Sets the "prefix" element
     */
    public void setPrefix(java.lang.String prefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFIX$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREFIX$0);
            }
            target.setStringValue(prefix);
        }
    }
    
    /**
     * Sets (as xml) the "prefix" element
     */
    public void xsetPrefix(org.apache.xmlbeans.XmlString prefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREFIX$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PREFIX$0);
            }
            target.set(prefix);
        }
    }
    
    /**
     * Unsets the "prefix" element
     */
    public void unsetPrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREFIX$0, 0);
        }
    }
}
