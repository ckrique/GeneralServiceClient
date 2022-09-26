/*
 * XML Type:  valorDeclarado
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ValorDeclarado
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML valorDeclarado(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class ValorDeclaradoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.ValorDeclarado
{
    
    public ValorDeclaradoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAXIMO$0 = 
        new javax.xml.namespace.QName("", "maximo");
    private static final javax.xml.namespace.QName MINIMO$2 = 
        new javax.xml.namespace.QName("", "minimo");
    
    
    /**
     * Gets the "maximo" element
     */
    public double getMaximo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXIMO$0, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "maximo" element
     */
    public org.apache.xmlbeans.XmlDouble xgetMaximo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MAXIMO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "maximo" element
     */
    public boolean isSetMaximo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXIMO$0) != 0;
        }
    }
    
    /**
     * Sets the "maximo" element
     */
    public void setMaximo(double maximo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXIMO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXIMO$0);
            }
            target.setDoubleValue(maximo);
        }
    }
    
    /**
     * Sets (as xml) the "maximo" element
     */
    public void xsetMaximo(org.apache.xmlbeans.XmlDouble maximo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MAXIMO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(MAXIMO$0);
            }
            target.set(maximo);
        }
    }
    
    /**
     * Unsets the "maximo" element
     */
    public void unsetMaximo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXIMO$0, 0);
        }
    }
    
    /**
     * Gets the "minimo" element
     */
    public double getMinimo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIMO$2, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "minimo" element
     */
    public org.apache.xmlbeans.XmlDouble xgetMinimo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MINIMO$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "minimo" element
     */
    public boolean isSetMinimo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MINIMO$2) != 0;
        }
    }
    
    /**
     * Sets the "minimo" element
     */
    public void setMinimo(double minimo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIMO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINIMO$2);
            }
            target.setDoubleValue(minimo);
        }
    }
    
    /**
     * Sets (as xml) the "minimo" element
     */
    public void xsetMinimo(org.apache.xmlbeans.XmlDouble minimo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MINIMO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(MINIMO$2);
            }
            target.set(minimo);
        }
    }
    
    /**
     * Unsets the "minimo" element
     */
    public void unsetMinimo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MINIMO$2, 0);
        }
    }
}
