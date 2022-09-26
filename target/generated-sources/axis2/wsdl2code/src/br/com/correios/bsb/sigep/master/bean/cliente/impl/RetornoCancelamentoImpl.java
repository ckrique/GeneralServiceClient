/*
 * XML Type:  retornoCancelamento
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML retornoCancelamento(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class RetornoCancelamentoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento
{
    
    public RetornoCancelamentoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODERRO$0 = 
        new javax.xml.namespace.QName("", "cod_erro");
    private static final javax.xml.namespace.QName CODIGOADMINISTRATIVO$2 = 
        new javax.xml.namespace.QName("", "codigo_administrativo");
    private static final javax.xml.namespace.QName DATA$4 = 
        new javax.xml.namespace.QName("", "data");
    private static final javax.xml.namespace.QName HORA$6 = 
        new javax.xml.namespace.QName("", "hora");
    private static final javax.xml.namespace.QName MSGERRO$8 = 
        new javax.xml.namespace.QName("", "msg_erro");
    private static final javax.xml.namespace.QName OBJETOPOSTAL$10 = 
        new javax.xml.namespace.QName("", "objeto_postal");
    
    
    /**
     * Gets the "cod_erro" element
     */
    public java.lang.String getCodErro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODERRO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cod_erro" element
     */
    public org.apache.xmlbeans.XmlString xgetCodErro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODERRO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "cod_erro" element
     */
    public boolean isSetCodErro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODERRO$0) != 0;
        }
    }
    
    /**
     * Sets the "cod_erro" element
     */
    public void setCodErro(java.lang.String codErro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODERRO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODERRO$0);
            }
            target.setStringValue(codErro);
        }
    }
    
    /**
     * Sets (as xml) the "cod_erro" element
     */
    public void xsetCodErro(org.apache.xmlbeans.XmlString codErro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODERRO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODERRO$0);
            }
            target.set(codErro);
        }
    }
    
    /**
     * Unsets the "cod_erro" element
     */
    public void unsetCodErro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODERRO$0, 0);
        }
    }
    
    /**
     * Gets the "codigo_administrativo" element
     */
    public java.lang.String getCodigoAdministrativo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGOADMINISTRATIVO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codigo_administrativo" element
     */
    public org.apache.xmlbeans.XmlString xgetCodigoAdministrativo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOADMINISTRATIVO$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "codigo_administrativo" element
     */
    public boolean isSetCodigoAdministrativo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODIGOADMINISTRATIVO$2) != 0;
        }
    }
    
    /**
     * Sets the "codigo_administrativo" element
     */
    public void setCodigoAdministrativo(java.lang.String codigoAdministrativo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGOADMINISTRATIVO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODIGOADMINISTRATIVO$2);
            }
            target.setStringValue(codigoAdministrativo);
        }
    }
    
    /**
     * Sets (as xml) the "codigo_administrativo" element
     */
    public void xsetCodigoAdministrativo(org.apache.xmlbeans.XmlString codigoAdministrativo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOADMINISTRATIVO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODIGOADMINISTRATIVO$2);
            }
            target.set(codigoAdministrativo);
        }
    }
    
    /**
     * Unsets the "codigo_administrativo" element
     */
    public void unsetCodigoAdministrativo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODIGOADMINISTRATIVO$2, 0);
        }
    }
    
    /**
     * Gets the "data" element
     */
    public java.lang.String getData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATA$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "data" element
     */
    public org.apache.xmlbeans.XmlString xgetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATA$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "data" element
     */
    public boolean isSetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATA$4) != 0;
        }
    }
    
    /**
     * Sets the "data" element
     */
    public void setData(java.lang.String data)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATA$4);
            }
            target.setStringValue(data);
        }
    }
    
    /**
     * Sets (as xml) the "data" element
     */
    public void xsetData(org.apache.xmlbeans.XmlString data)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATA$4);
            }
            target.set(data);
        }
    }
    
    /**
     * Unsets the "data" element
     */
    public void unsetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATA$4, 0);
        }
    }
    
    /**
     * Gets the "hora" element
     */
    public java.lang.String getHora()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HORA$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "hora" element
     */
    public org.apache.xmlbeans.XmlString xgetHora()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HORA$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "hora" element
     */
    public boolean isSetHora()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HORA$6) != 0;
        }
    }
    
    /**
     * Sets the "hora" element
     */
    public void setHora(java.lang.String hora)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HORA$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HORA$6);
            }
            target.setStringValue(hora);
        }
    }
    
    /**
     * Sets (as xml) the "hora" element
     */
    public void xsetHora(org.apache.xmlbeans.XmlString hora)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HORA$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HORA$6);
            }
            target.set(hora);
        }
    }
    
    /**
     * Unsets the "hora" element
     */
    public void unsetHora()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HORA$6, 0);
        }
    }
    
    /**
     * Gets the "msg_erro" element
     */
    public java.lang.String getMsgErro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MSGERRO$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "msg_erro" element
     */
    public org.apache.xmlbeans.XmlString xgetMsgErro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MSGERRO$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "msg_erro" element
     */
    public boolean isSetMsgErro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MSGERRO$8) != 0;
        }
    }
    
    /**
     * Sets the "msg_erro" element
     */
    public void setMsgErro(java.lang.String msgErro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MSGERRO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MSGERRO$8);
            }
            target.setStringValue(msgErro);
        }
    }
    
    /**
     * Sets (as xml) the "msg_erro" element
     */
    public void xsetMsgErro(org.apache.xmlbeans.XmlString msgErro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MSGERRO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MSGERRO$8);
            }
            target.set(msgErro);
        }
    }
    
    /**
     * Unsets the "msg_erro" element
     */
    public void unsetMsgErro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MSGERRO$8, 0);
        }
    }
    
    /**
     * Gets the "objeto_postal" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ObjetoSimplificado getObjetoPostal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ObjetoSimplificado target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ObjetoSimplificado)get_store().find_element_user(OBJETOPOSTAL$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "objeto_postal" element
     */
    public boolean isSetObjetoPostal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJETOPOSTAL$10) != 0;
        }
    }
    
    /**
     * Sets the "objeto_postal" element
     */
    public void setObjetoPostal(br.com.correios.bsb.sigep.master.bean.cliente.ObjetoSimplificado objetoPostal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ObjetoSimplificado target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ObjetoSimplificado)get_store().find_element_user(OBJETOPOSTAL$10, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.ObjetoSimplificado)get_store().add_element_user(OBJETOPOSTAL$10);
            }
            target.set(objetoPostal);
        }
    }
    
    /**
     * Appends and returns a new empty "objeto_postal" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ObjetoSimplificado addNewObjetoPostal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ObjetoSimplificado target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ObjetoSimplificado)get_store().add_element_user(OBJETOPOSTAL$10);
            return target;
        }
    }
    
    /**
     * Unsets the "objeto_postal" element
     */
    public void unsetObjetoPostal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJETOPOSTAL$10, 0);
        }
    }
}
