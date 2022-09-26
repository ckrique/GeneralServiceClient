/*
 * XML Type:  produto
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.Produto
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML produto(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class ProdutoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.Produto
{
    
    public ProdutoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODIGO$0 = 
        new javax.xml.namespace.QName("", "codigo");
    private static final javax.xml.namespace.QName QTD$2 = 
        new javax.xml.namespace.QName("", "qtd");
    private static final javax.xml.namespace.QName TIPO$4 = 
        new javax.xml.namespace.QName("", "tipo");
    
    
    /**
     * Gets the "codigo" element
     */
    public java.lang.String getCodigo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGO$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGO$0, 0);
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
            return get_store().count_elements(CODIGO$0) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODIGO$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODIGO$0);
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
            get_store().remove_element(CODIGO$0, 0);
        }
    }
    
    /**
     * Gets the "qtd" element
     */
    public java.lang.String getQtd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QTD$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "qtd" element
     */
    public org.apache.xmlbeans.XmlString xgetQtd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QTD$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "qtd" element
     */
    public boolean isSetQtd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QTD$2) != 0;
        }
    }
    
    /**
     * Sets the "qtd" element
     */
    public void setQtd(java.lang.String qtd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QTD$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QTD$2);
            }
            target.setStringValue(qtd);
        }
    }
    
    /**
     * Sets (as xml) the "qtd" element
     */
    public void xsetQtd(org.apache.xmlbeans.XmlString qtd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QTD$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QTD$2);
            }
            target.set(qtd);
        }
    }
    
    /**
     * Unsets the "qtd" element
     */
    public void unsetQtd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QTD$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPO$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPO$4, 0);
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
            return get_store().count_elements(TIPO$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPO$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIPO$4);
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
            get_store().remove_element(TIPO$4, 0);
        }
    }
}
