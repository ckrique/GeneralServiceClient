/*
 * XML Type:  remetente
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.Remetente
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML remetente(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class RemetenteImpl extends br.com.correios.bsb.sigep.master.bean.cliente.impl.PessoaImpl implements br.com.correios.bsb.sigep.master.bean.cliente.Remetente
{
    
    public RemetenteImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CELULAR$0 = 
        new javax.xml.namespace.QName("", "celular");
    private static final javax.xml.namespace.QName DDDCELULAR$2 = 
        new javax.xml.namespace.QName("", "ddd_celular");
    private static final javax.xml.namespace.QName IDENTIFICACAO$4 = 
        new javax.xml.namespace.QName("", "identificacao");
    private static final javax.xml.namespace.QName SMS$6 = 
        new javax.xml.namespace.QName("", "sms");
    
    
    /**
     * Gets the "celular" element
     */
    public java.lang.String getCelular()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CELULAR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "celular" element
     */
    public org.apache.xmlbeans.XmlString xgetCelular()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CELULAR$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "celular" element
     */
    public boolean isSetCelular()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CELULAR$0) != 0;
        }
    }
    
    /**
     * Sets the "celular" element
     */
    public void setCelular(java.lang.String celular)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CELULAR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CELULAR$0);
            }
            target.setStringValue(celular);
        }
    }
    
    /**
     * Sets (as xml) the "celular" element
     */
    public void xsetCelular(org.apache.xmlbeans.XmlString celular)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CELULAR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CELULAR$0);
            }
            target.set(celular);
        }
    }
    
    /**
     * Unsets the "celular" element
     */
    public void unsetCelular()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CELULAR$0, 0);
        }
    }
    
    /**
     * Gets the "ddd_celular" element
     */
    public java.lang.String getDddCelular()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DDDCELULAR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ddd_celular" element
     */
    public org.apache.xmlbeans.XmlString xgetDddCelular()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DDDCELULAR$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "ddd_celular" element
     */
    public boolean isSetDddCelular()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DDDCELULAR$2) != 0;
        }
    }
    
    /**
     * Sets the "ddd_celular" element
     */
    public void setDddCelular(java.lang.String dddCelular)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DDDCELULAR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DDDCELULAR$2);
            }
            target.setStringValue(dddCelular);
        }
    }
    
    /**
     * Sets (as xml) the "ddd_celular" element
     */
    public void xsetDddCelular(org.apache.xmlbeans.XmlString dddCelular)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DDDCELULAR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DDDCELULAR$2);
            }
            target.set(dddCelular);
        }
    }
    
    /**
     * Unsets the "ddd_celular" element
     */
    public void unsetDddCelular()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DDDCELULAR$2, 0);
        }
    }
    
    /**
     * Gets the "identificacao" element
     */
    public java.lang.String getIdentificacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFICACAO$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "identificacao" element
     */
    public org.apache.xmlbeans.XmlString xgetIdentificacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDENTIFICACAO$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "identificacao" element
     */
    public boolean isSetIdentificacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFICACAO$4) != 0;
        }
    }
    
    /**
     * Sets the "identificacao" element
     */
    public void setIdentificacao(java.lang.String identificacao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFICACAO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDENTIFICACAO$4);
            }
            target.setStringValue(identificacao);
        }
    }
    
    /**
     * Sets (as xml) the "identificacao" element
     */
    public void xsetIdentificacao(org.apache.xmlbeans.XmlString identificacao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDENTIFICACAO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDENTIFICACAO$4);
            }
            target.set(identificacao);
        }
    }
    
    /**
     * Unsets the "identificacao" element
     */
    public void unsetIdentificacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFICACAO$4, 0);
        }
    }
    
    /**
     * Gets the "sms" element
     */
    public java.lang.String getSms()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SMS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sms" element
     */
    public org.apache.xmlbeans.XmlString xgetSms()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SMS$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "sms" element
     */
    public boolean isSetSms()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SMS$6) != 0;
        }
    }
    
    /**
     * Sets the "sms" element
     */
    public void setSms(java.lang.String sms)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SMS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SMS$6);
            }
            target.setStringValue(sms);
        }
    }
    
    /**
     * Sets (as xml) the "sms" element
     */
    public void xsetSms(org.apache.xmlbeans.XmlString sms)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SMS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SMS$6);
            }
            target.set(sms);
        }
    }
    
    /**
     * Unsets the "sms" element
     */
    public void unsetSms()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SMS$6, 0);
        }
    }
}
