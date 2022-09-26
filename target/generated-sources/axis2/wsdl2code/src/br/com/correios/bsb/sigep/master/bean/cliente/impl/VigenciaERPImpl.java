/*
 * XML Type:  vigenciaERP
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.VigenciaERP
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML vigenciaERP(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class VigenciaERPImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.VigenciaERP
{
    
    public VigenciaERPImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAFINAL$0 = 
        new javax.xml.namespace.QName("", "dataFinal");
    private static final javax.xml.namespace.QName DATAINICIAL$2 = 
        new javax.xml.namespace.QName("", "dataInicial");
    private static final javax.xml.namespace.QName DATAJFIM$4 = 
        new javax.xml.namespace.QName("", "datajFim");
    private static final javax.xml.namespace.QName DATAJINI$6 = 
        new javax.xml.namespace.QName("", "datajIni");
    private static final javax.xml.namespace.QName ID$8 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "dataFinal" element
     */
    public java.util.Calendar getDataFinal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAFINAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dataFinal" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDataFinal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAFINAL$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "dataFinal" element
     */
    public boolean isSetDataFinal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAFINAL$0) != 0;
        }
    }
    
    /**
     * Sets the "dataFinal" element
     */
    public void setDataFinal(java.util.Calendar dataFinal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAFINAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAFINAL$0);
            }
            target.setCalendarValue(dataFinal);
        }
    }
    
    /**
     * Sets (as xml) the "dataFinal" element
     */
    public void xsetDataFinal(org.apache.xmlbeans.XmlDateTime dataFinal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAFINAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATAFINAL$0);
            }
            target.set(dataFinal);
        }
    }
    
    /**
     * Unsets the "dataFinal" element
     */
    public void unsetDataFinal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAFINAL$0, 0);
        }
    }
    
    /**
     * Gets the "dataInicial" element
     */
    public java.util.Calendar getDataInicial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAINICIAL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dataInicial" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDataInicial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAINICIAL$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "dataInicial" element
     */
    public boolean isSetDataInicial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAINICIAL$2) != 0;
        }
    }
    
    /**
     * Sets the "dataInicial" element
     */
    public void setDataInicial(java.util.Calendar dataInicial)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAINICIAL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAINICIAL$2);
            }
            target.setCalendarValue(dataInicial);
        }
    }
    
    /**
     * Sets (as xml) the "dataInicial" element
     */
    public void xsetDataInicial(org.apache.xmlbeans.XmlDateTime dataInicial)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAINICIAL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATAINICIAL$2);
            }
            target.set(dataInicial);
        }
    }
    
    /**
     * Unsets the "dataInicial" element
     */
    public void unsetDataInicial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAINICIAL$2, 0);
        }
    }
    
    /**
     * Gets the "datajFim" element
     */
    public int getDatajFim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAJFIM$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "datajFim" element
     */
    public org.apache.xmlbeans.XmlInt xgetDatajFim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DATAJFIM$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "datajFim" element
     */
    public boolean isSetDatajFim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAJFIM$4) != 0;
        }
    }
    
    /**
     * Sets the "datajFim" element
     */
    public void setDatajFim(int datajFim)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAJFIM$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAJFIM$4);
            }
            target.setIntValue(datajFim);
        }
    }
    
    /**
     * Sets (as xml) the "datajFim" element
     */
    public void xsetDatajFim(org.apache.xmlbeans.XmlInt datajFim)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DATAJFIM$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DATAJFIM$4);
            }
            target.set(datajFim);
        }
    }
    
    /**
     * Unsets the "datajFim" element
     */
    public void unsetDatajFim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAJFIM$4, 0);
        }
    }
    
    /**
     * Gets the "datajIni" element
     */
    public int getDatajIni()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAJINI$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "datajIni" element
     */
    public org.apache.xmlbeans.XmlInt xgetDatajIni()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DATAJINI$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "datajIni" element
     */
    public boolean isSetDatajIni()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAJINI$6) != 0;
        }
    }
    
    /**
     * Sets the "datajIni" element
     */
    public void setDatajIni(int datajIni)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAJINI$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAJINI$6);
            }
            target.setIntValue(datajIni);
        }
    }
    
    /**
     * Sets (as xml) the "datajIni" element
     */
    public void xsetDatajIni(org.apache.xmlbeans.XmlInt datajIni)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DATAJINI$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DATAJINI$6);
            }
            target.set(datajIni);
        }
    }
    
    /**
     * Unsets the "datajIni" element
     */
    public void unsetDatajIni()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAJINI$6, 0);
        }
    }
    
    /**
     * Gets the "id" element
     */
    public long getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$8, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" element
     */
    public org.apache.xmlbeans.XmlLong xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(ID$8, 0);
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
            return get_store().count_elements(ID$8) != 0;
        }
    }
    
    /**
     * Sets the "id" element
     */
    public void setId(long id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$8);
            }
            target.setLongValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" element
     */
    public void xsetId(org.apache.xmlbeans.XmlLong id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(ID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(ID$8);
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
            get_store().remove_element(ID$8, 0);
        }
    }
}
