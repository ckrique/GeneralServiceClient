/*
 * XML Type:  getStatusPLP
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLP
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML getStatusPLP(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class GetStatusPLPImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLP
{
    
    public GetStatusPLPImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARG0$0 = 
        new javax.xml.namespace.QName("", "arg0");
    private static final javax.xml.namespace.QName ARG1$2 = 
        new javax.xml.namespace.QName("", "arg1");
    
    
    /**
     * Gets array of all "arg0" elements
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal[] getArg0Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARG0$0, targetList);
            br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal[] result = new br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "arg0" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal getArg0Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal)get_store().find_element_user(ARG0$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "arg0" element
     */
    public int sizeOfArg0Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARG0$0);
        }
    }
    
    /**
     * Sets array of all "arg0" element
     */
    public void setArg0Array(br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal[] arg0Array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(arg0Array, ARG0$0);
        }
    }
    
    /**
     * Sets ith "arg0" element
     */
    public void setArg0Array(int i, br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal arg0)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal)get_store().find_element_user(ARG0$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arg0);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "arg0" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal insertNewArg0(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal)get_store().insert_element_user(ARG0$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "arg0" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal addNewArg0()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal)get_store().add_element_user(ARG0$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "arg0" element
     */
    public void removeArg0(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARG0$0, i);
        }
    }
    
    /**
     * Gets the "arg1" element
     */
    public java.lang.String getArg1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARG1$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "arg1" element
     */
    public org.apache.xmlbeans.XmlString xgetArg1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG1$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "arg1" element
     */
    public boolean isSetArg1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARG1$2) != 0;
        }
    }
    
    /**
     * Sets the "arg1" element
     */
    public void setArg1(java.lang.String arg1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARG1$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARG1$2);
            }
            target.setStringValue(arg1);
        }
    }
    
    /**
     * Sets (as xml) the "arg1" element
     */
    public void xsetArg1(org.apache.xmlbeans.XmlString arg1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG1$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARG1$2);
            }
            target.set(arg1);
        }
    }
    
    /**
     * Unsets the "arg1" element
     */
    public void unsetArg1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARG1$2, 0);
        }
    }
}
