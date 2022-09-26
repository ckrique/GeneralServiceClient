/*
 * XML Type:  servicoAdicionalTO
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalTO
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML servicoAdicionalTO(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class ServicoAdicionalTOImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalTO
{
    
    public ServicoAdicionalTOImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORIA$0 = 
        new javax.xml.namespace.QName("", "categoria");
    private static final javax.xml.namespace.QName CODIGO$2 = 
        new javax.xml.namespace.QName("", "codigo");
    private static final javax.xml.namespace.QName SIGLA$4 = 
        new javax.xml.namespace.QName("", "sigla");
    private static final javax.xml.namespace.QName TIPO$6 = 
        new javax.xml.namespace.QName("", "tipo");
    
    
    /**
     * Gets the "categoria" element
     */
    public java.lang.String getCategoria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORIA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "categoria" element
     */
    public org.apache.xmlbeans.XmlString xgetCategoria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORIA$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "categoria" element
     */
    public boolean isSetCategoria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORIA$0) != 0;
        }
    }
    
    /**
     * Sets the "categoria" element
     */
    public void setCategoria(java.lang.String categoria)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORIA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORIA$0);
            }
            target.setStringValue(categoria);
        }
    }
    
    /**
     * Sets (as xml) the "categoria" element
     */
    public void xsetCategoria(org.apache.xmlbeans.XmlString categoria)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORIA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CATEGORIA$0);
            }
            target.set(categoria);
        }
    }
    
    /**
     * Unsets the "categoria" element
     */
    public void unsetCategoria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORIA$0, 0);
        }
    }
    
    /**
     * Gets the "codigo" element
     */
    public java.lang.String getCodigo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codigo" element
     */
    public org.apache.xmlbeans.XmlString xgetCodigo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGO$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "codigo" element
     */
    public boolean isSetCodigo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODIGO$2) != 0;
        }
    }
    
    /**
     * Sets the "codigo" element
     */
    public void setCodigo(java.lang.String codigo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODIGO$2);
            }
            target.setStringValue(codigo);
        }
    }
    
    /**
     * Sets (as xml) the "codigo" element
     */
    public void xsetCodigo(org.apache.xmlbeans.XmlString codigo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODIGO$2);
            }
            target.set(codigo);
        }
    }
    
    /**
     * Unsets the "codigo" element
     */
    public void unsetCodigo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODIGO$2, 0);
        }
    }
    
    /**
     * Gets the "sigla" element
     */
    public java.lang.String getSigla()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGLA$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sigla" element
     */
    public org.apache.xmlbeans.XmlString xgetSigla()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIGLA$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "sigla" element
     */
    public boolean isSetSigla()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIGLA$4) != 0;
        }
    }
    
    /**
     * Sets the "sigla" element
     */
    public void setSigla(java.lang.String sigla)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGLA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIGLA$4);
            }
            target.setStringValue(sigla);
        }
    }
    
    /**
     * Sets (as xml) the "sigla" element
     */
    public void xsetSigla(org.apache.xmlbeans.XmlString sigla)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIGLA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SIGLA$4);
            }
            target.set(sigla);
        }
    }
    
    /**
     * Unsets the "sigla" element
     */
    public void unsetSigla()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIGLA$4, 0);
        }
    }
    
    /**
     * Gets the "tipo" element
     */
    public java.lang.String getTipo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPO$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tipo" element
     */
    public org.apache.xmlbeans.XmlString xgetTipo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPO$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "tipo" element
     */
    public boolean isSetTipo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIPO$6) != 0;
        }
    }
    
    /**
     * Sets the "tipo" element
     */
    public void setTipo(java.lang.String tipo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPO$6);
            }
            target.setStringValue(tipo);
        }
    }
    
    /**
     * Sets (as xml) the "tipo" element
     */
    public void xsetTipo(org.apache.xmlbeans.XmlString tipo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIPO$6);
            }
            target.set(tipo);
        }
    }
    
    /**
     * Unsets the "tipo" element
     */
    public void unsetTipo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIPO$6, 0);
        }
    }
}
