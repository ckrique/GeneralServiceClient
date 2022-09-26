/*
 * XML Type:  coletaSimultanea
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML coletaSimultanea(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class ColetaSimultaneaImpl extends br.com.correios.bsb.sigep.master.bean.cliente.impl.ColetaImpl implements br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea
{
    
    public ColetaSimultaneaImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJ$0 = 
        new javax.xml.namespace.QName("", "obj");
    private static final javax.xml.namespace.QName OBS$2 = 
        new javax.xml.namespace.QName("", "obs");
    
    
    /**
     * Gets the "obj" element
     */
    public java.lang.String getObj()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJ$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "obj" element
     */
    public org.apache.xmlbeans.XmlString xgetObj()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBJ$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "obj" element
     */
    public boolean isSetObj()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJ$0) != 0;
        }
    }
    
    /**
     * Sets the "obj" element
     */
    public void setObj(java.lang.String obj)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJ$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OBJ$0);
            }
            target.setStringValue(obj);
        }
    }
    
    /**
     * Sets (as xml) the "obj" element
     */
    public void xsetObj(org.apache.xmlbeans.XmlString obj)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBJ$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OBJ$0);
            }
            target.set(obj);
        }
    }
    
    /**
     * Unsets the "obj" element
     */
    public void unsetObj()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJ$0, 0);
        }
    }
    
    /**
     * Gets the "obs" element
     */
    public java.lang.String getObs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "obs" element
     */
    public org.apache.xmlbeans.XmlString xgetObs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBS$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "obs" element
     */
    public boolean isSetObs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBS$2) != 0;
        }
    }
    
    /**
     * Sets the "obs" element
     */
    public void setObs(java.lang.String obs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OBS$2);
            }
            target.setStringValue(obs);
        }
    }
    
    /**
     * Sets (as xml) the "obs" element
     */
    public void xsetObs(org.apache.xmlbeans.XmlString obs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OBS$2);
            }
            target.set(obs);
        }
    }
    
    /**
     * Unsets the "obs" element
     */
    public void unsetObs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBS$2, 0);
        }
    }
}
