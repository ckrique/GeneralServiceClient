/*
 * XML Type:  parametroMaster
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ParametroMaster
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML parametroMaster(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class ParametroMasterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.ParametroMaster
{
    
    public ParametroMasterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRMCOPARAMETRO$0 = 
        new javax.xml.namespace.QName("", "prmCoParametro");
    private static final javax.xml.namespace.QName PRMTXPARAMETRO$2 = 
        new javax.xml.namespace.QName("", "prmTxParametro");
    private static final javax.xml.namespace.QName PRMTXVALOR$4 = 
        new javax.xml.namespace.QName("", "prmTxValor");
    
    
    /**
     * Gets the "prmCoParametro" element
     */
    public long getPrmCoParametro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRMCOPARAMETRO$0, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "prmCoParametro" element
     */
    public org.apache.xmlbeans.XmlLong xgetPrmCoParametro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(PRMCOPARAMETRO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "prmCoParametro" element
     */
    public void setPrmCoParametro(long prmCoParametro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRMCOPARAMETRO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRMCOPARAMETRO$0);
            }
            target.setLongValue(prmCoParametro);
        }
    }
    
    /**
     * Sets (as xml) the "prmCoParametro" element
     */
    public void xsetPrmCoParametro(org.apache.xmlbeans.XmlLong prmCoParametro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(PRMCOPARAMETRO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(PRMCOPARAMETRO$0);
            }
            target.set(prmCoParametro);
        }
    }
    
    /**
     * Gets the "prmTxParametro" element
     */
    public java.lang.String getPrmTxParametro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRMTXPARAMETRO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "prmTxParametro" element
     */
    public org.apache.xmlbeans.XmlString xgetPrmTxParametro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRMTXPARAMETRO$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "prmTxParametro" element
     */
    public boolean isSetPrmTxParametro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRMTXPARAMETRO$2) != 0;
        }
    }
    
    /**
     * Sets the "prmTxParametro" element
     */
    public void setPrmTxParametro(java.lang.String prmTxParametro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRMTXPARAMETRO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRMTXPARAMETRO$2);
            }
            target.setStringValue(prmTxParametro);
        }
    }
    
    /**
     * Sets (as xml) the "prmTxParametro" element
     */
    public void xsetPrmTxParametro(org.apache.xmlbeans.XmlString prmTxParametro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRMTXPARAMETRO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRMTXPARAMETRO$2);
            }
            target.set(prmTxParametro);
        }
    }
    
    /**
     * Unsets the "prmTxParametro" element
     */
    public void unsetPrmTxParametro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRMTXPARAMETRO$2, 0);
        }
    }
    
    /**
     * Gets the "prmTxValor" element
     */
    public java.lang.String getPrmTxValor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRMTXVALOR$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "prmTxValor" element
     */
    public org.apache.xmlbeans.XmlString xgetPrmTxValor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRMTXVALOR$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "prmTxValor" element
     */
    public boolean isSetPrmTxValor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRMTXVALOR$4) != 0;
        }
    }
    
    /**
     * Sets the "prmTxValor" element
     */
    public void setPrmTxValor(java.lang.String prmTxValor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRMTXVALOR$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRMTXVALOR$4);
            }
            target.setStringValue(prmTxValor);
        }
    }
    
    /**
     * Sets (as xml) the "prmTxValor" element
     */
    public void xsetPrmTxValor(org.apache.xmlbeans.XmlString prmTxValor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRMTXVALOR$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRMTXVALOR$4);
            }
            target.set(prmTxValor);
        }
    }
    
    /**
     * Unsets the "prmTxValor" element
     */
    public void unsetPrmTxValor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRMTXVALOR$4, 0);
        }
    }
}
