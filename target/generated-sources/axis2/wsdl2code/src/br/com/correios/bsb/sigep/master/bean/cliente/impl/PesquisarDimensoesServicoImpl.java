/*
 * XML Type:  pesquisarDimensoesServico
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServico
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML pesquisarDimensoesServico(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class PesquisarDimensoesServicoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServico
{
    
    public PesquisarDimensoesServicoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODIGO$0 = 
        new javax.xml.namespace.QName("", "codigo");
    private static final javax.xml.namespace.QName EMBALAGEM$2 = 
        new javax.xml.namespace.QName("", "embalagem");
    
    
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
     * Gets the "embalagem" element
     */
    public java.lang.String getEmbalagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMBALAGEM$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "embalagem" element
     */
    public org.apache.xmlbeans.XmlString xgetEmbalagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMBALAGEM$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "embalagem" element
     */
    public boolean isSetEmbalagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMBALAGEM$2) != 0;
        }
    }
    
    /**
     * Sets the "embalagem" element
     */
    public void setEmbalagem(java.lang.String embalagem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMBALAGEM$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMBALAGEM$2);
            }
            target.setStringValue(embalagem);
        }
    }
    
    /**
     * Sets (as xml) the "embalagem" element
     */
    public void xsetEmbalagem(org.apache.xmlbeans.XmlString embalagem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMBALAGEM$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMBALAGEM$2);
            }
            target.set(embalagem);
        }
    }
    
    /**
     * Unsets the "embalagem" element
     */
    public void unsetEmbalagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMBALAGEM$2, 0);
        }
    }
}
