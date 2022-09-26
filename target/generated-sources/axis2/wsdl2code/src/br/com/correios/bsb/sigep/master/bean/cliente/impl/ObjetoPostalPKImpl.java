/*
 * XML Type:  objetoPostalPK
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostalPK
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML objetoPostalPK(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class ObjetoPostalPKImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostalPK
{
    
    public ObjetoPostalPKImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODIGOETIQUETA$0 = 
        new javax.xml.namespace.QName("", "codigoEtiqueta");
    private static final javax.xml.namespace.QName PLPNU$2 = 
        new javax.xml.namespace.QName("", "plpNu");
    
    
    /**
     * Gets the "codigoEtiqueta" element
     */
    public java.lang.String getCodigoEtiqueta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGOETIQUETA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codigoEtiqueta" element
     */
    public org.apache.xmlbeans.XmlString xgetCodigoEtiqueta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOETIQUETA$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "codigoEtiqueta" element
     */
    public boolean isSetCodigoEtiqueta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODIGOETIQUETA$0) != 0;
        }
    }
    
    /**
     * Sets the "codigoEtiqueta" element
     */
    public void setCodigoEtiqueta(java.lang.String codigoEtiqueta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGOETIQUETA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODIGOETIQUETA$0);
            }
            target.setStringValue(codigoEtiqueta);
        }
    }
    
    /**
     * Sets (as xml) the "codigoEtiqueta" element
     */
    public void xsetCodigoEtiqueta(org.apache.xmlbeans.XmlString codigoEtiqueta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOETIQUETA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODIGOETIQUETA$0);
            }
            target.set(codigoEtiqueta);
        }
    }
    
    /**
     * Unsets the "codigoEtiqueta" element
     */
    public void unsetCodigoEtiqueta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODIGOETIQUETA$0, 0);
        }
    }
    
    /**
     * Gets the "plpNu" element
     */
    public long getPlpNu()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLPNU$2, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "plpNu" element
     */
    public org.apache.xmlbeans.XmlLong xgetPlpNu()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(PLPNU$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "plpNu" element
     */
    public void setPlpNu(long plpNu)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLPNU$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PLPNU$2);
            }
            target.setLongValue(plpNu);
        }
    }
    
    /**
     * Sets (as xml) the "plpNu" element
     */
    public void xsetPlpNu(org.apache.xmlbeans.XmlLong plpNu)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(PLPNU$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(PLPNU$2);
            }
            target.set(plpNu);
        }
    }
}
