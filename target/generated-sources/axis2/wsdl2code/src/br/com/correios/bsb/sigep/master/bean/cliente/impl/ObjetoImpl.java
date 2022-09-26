/*
 * XML Type:  objeto
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.Objeto
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML objeto(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class ObjetoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.Objeto
{
    
    public ObjetoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESC$0 = 
        new javax.xml.namespace.QName("", "desc");
    private static final javax.xml.namespace.QName ENTREGA$2 = 
        new javax.xml.namespace.QName("", "entrega");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName ITEM$6 = 
        new javax.xml.namespace.QName("", "item");
    private static final javax.xml.namespace.QName NUM$8 = 
        new javax.xml.namespace.QName("", "num");
    
    
    /**
     * Gets the "desc" element
     */
    public java.lang.String getDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "desc" element
     */
    public org.apache.xmlbeans.XmlString xgetDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESC$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "desc" element
     */
    public boolean isSetDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESC$0) != 0;
        }
    }
    
    /**
     * Sets the "desc" element
     */
    public void setDesc(java.lang.String desc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESC$0);
            }
            target.setStringValue(desc);
        }
    }
    
    /**
     * Sets (as xml) the "desc" element
     */
    public void xsetDesc(org.apache.xmlbeans.XmlString desc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESC$0);
            }
            target.set(desc);
        }
    }
    
    /**
     * Unsets the "desc" element
     */
    public void unsetDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESC$0, 0);
        }
    }
    
    /**
     * Gets the "entrega" element
     */
    public java.lang.String getEntrega()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTREGA$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "entrega" element
     */
    public org.apache.xmlbeans.XmlString xgetEntrega()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTREGA$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "entrega" element
     */
    public boolean isSetEntrega()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTREGA$2) != 0;
        }
    }
    
    /**
     * Sets the "entrega" element
     */
    public void setEntrega(java.lang.String entrega)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTREGA$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTREGA$2);
            }
            target.setStringValue(entrega);
        }
    }
    
    /**
     * Sets (as xml) the "entrega" element
     */
    public void xsetEntrega(org.apache.xmlbeans.XmlString entrega)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTREGA$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTREGA$2);
            }
            target.set(entrega);
        }
    }
    
    /**
     * Unsets the "entrega" element
     */
    public void unsetEntrega()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTREGA$2, 0);
        }
    }
    
    /**
     * Gets the "id" element
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" element
     */
    public org.apache.xmlbeans.XmlString xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "id" element
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ID$4) != 0;
        }
    }
    
    /**
     * Sets the "id" element
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$4);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" element
     */
    public void xsetId(org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ID$4);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" element
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ID$4, 0);
        }
    }
    
    /**
     * Gets the "item" element
     */
    public java.lang.String getItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ITEM$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "item" element
     */
    public org.apache.xmlbeans.XmlString xgetItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ITEM$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "item" element
     */
    public boolean isSetItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ITEM$6) != 0;
        }
    }
    
    /**
     * Sets the "item" element
     */
    public void setItem(java.lang.String item)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ITEM$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ITEM$6);
            }
            target.setStringValue(item);
        }
    }
    
    /**
     * Sets (as xml) the "item" element
     */
    public void xsetItem(org.apache.xmlbeans.XmlString item)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ITEM$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ITEM$6);
            }
            target.set(item);
        }
    }
    
    /**
     * Unsets the "item" element
     */
    public void unsetItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ITEM$6, 0);
        }
    }
    
    /**
     * Gets the "num" element
     */
    public java.lang.String getNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUM$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "num" element
     */
    public org.apache.xmlbeans.XmlString xgetNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUM$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "num" element
     */
    public boolean isSetNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUM$8) != 0;
        }
    }
    
    /**
     * Sets the "num" element
     */
    public void setNum(java.lang.String num)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUM$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUM$8);
            }
            target.setStringValue(num);
        }
    }
    
    /**
     * Sets (as xml) the "num" element
     */
    public void xsetNum(org.apache.xmlbeans.XmlString num)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUM$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUM$8);
            }
            target.set(num);
        }
    }
    
    /**
     * Unsets the "num" element
     */
    public void unsetNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUM$8, 0);
        }
    }
}
