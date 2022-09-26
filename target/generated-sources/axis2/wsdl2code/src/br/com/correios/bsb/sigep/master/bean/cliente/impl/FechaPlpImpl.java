/*
 * XML Type:  fechaPlp
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML fechaPlp(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class FechaPlpImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp
{
    
    public FechaPlpImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName XML$0 = 
        new javax.xml.namespace.QName("", "xml");
    private static final javax.xml.namespace.QName IDPLPCLIENTE$2 = 
        new javax.xml.namespace.QName("", "idPlpCliente");
    private static final javax.xml.namespace.QName CARTAOPOSTAGEM$4 = 
        new javax.xml.namespace.QName("", "cartaoPostagem");
    private static final javax.xml.namespace.QName FAIXAETIQUETAS$6 = 
        new javax.xml.namespace.QName("", "faixaEtiquetas");
    private static final javax.xml.namespace.QName USUARIO$8 = 
        new javax.xml.namespace.QName("", "usuario");
    private static final javax.xml.namespace.QName SENHA$10 = 
        new javax.xml.namespace.QName("", "senha");
    
    
    /**
     * Gets the "xml" element
     */
    public java.lang.String getXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(XML$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "xml" element
     */
    public org.apache.xmlbeans.XmlString xgetXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(XML$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "xml" element
     */
    public boolean isSetXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(XML$0) != 0;
        }
    }
    
    /**
     * Sets the "xml" element
     */
    public void setXml(java.lang.String xml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(XML$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(XML$0);
            }
            target.setStringValue(xml);
        }
    }
    
    /**
     * Sets (as xml) the "xml" element
     */
    public void xsetXml(org.apache.xmlbeans.XmlString xml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(XML$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(XML$0);
            }
            target.set(xml);
        }
    }
    
    /**
     * Unsets the "xml" element
     */
    public void unsetXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(XML$0, 0);
        }
    }
    
    /**
     * Gets the "idPlpCliente" element
     */
    public long getIdPlpCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDPLPCLIENTE$2, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "idPlpCliente" element
     */
    public org.apache.xmlbeans.XmlLong xgetIdPlpCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(IDPLPCLIENTE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "idPlpCliente" element
     */
    public boolean isSetIdPlpCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDPLPCLIENTE$2) != 0;
        }
    }
    
    /**
     * Sets the "idPlpCliente" element
     */
    public void setIdPlpCliente(long idPlpCliente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDPLPCLIENTE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDPLPCLIENTE$2);
            }
            target.setLongValue(idPlpCliente);
        }
    }
    
    /**
     * Sets (as xml) the "idPlpCliente" element
     */
    public void xsetIdPlpCliente(org.apache.xmlbeans.XmlLong idPlpCliente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(IDPLPCLIENTE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(IDPLPCLIENTE$2);
            }
            target.set(idPlpCliente);
        }
    }
    
    /**
     * Unsets the "idPlpCliente" element
     */
    public void unsetIdPlpCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDPLPCLIENTE$2, 0);
        }
    }
    
    /**
     * Gets the "cartaoPostagem" element
     */
    public java.lang.String getCartaoPostagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARTAOPOSTAGEM$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cartaoPostagem" element
     */
    public org.apache.xmlbeans.XmlString xgetCartaoPostagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CARTAOPOSTAGEM$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "cartaoPostagem" element
     */
    public boolean isSetCartaoPostagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CARTAOPOSTAGEM$4) != 0;
        }
    }
    
    /**
     * Sets the "cartaoPostagem" element
     */
    public void setCartaoPostagem(java.lang.String cartaoPostagem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARTAOPOSTAGEM$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CARTAOPOSTAGEM$4);
            }
            target.setStringValue(cartaoPostagem);
        }
    }
    
    /**
     * Sets (as xml) the "cartaoPostagem" element
     */
    public void xsetCartaoPostagem(org.apache.xmlbeans.XmlString cartaoPostagem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CARTAOPOSTAGEM$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CARTAOPOSTAGEM$4);
            }
            target.set(cartaoPostagem);
        }
    }
    
    /**
     * Unsets the "cartaoPostagem" element
     */
    public void unsetCartaoPostagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CARTAOPOSTAGEM$4, 0);
        }
    }
    
    /**
     * Gets the "faixaEtiquetas" element
     */
    public java.lang.String getFaixaEtiquetas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAIXAETIQUETAS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "faixaEtiquetas" element
     */
    public org.apache.xmlbeans.XmlString xgetFaixaEtiquetas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAIXAETIQUETAS$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "faixaEtiquetas" element
     */
    public boolean isSetFaixaEtiquetas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAIXAETIQUETAS$6) != 0;
        }
    }
    
    /**
     * Sets the "faixaEtiquetas" element
     */
    public void setFaixaEtiquetas(java.lang.String faixaEtiquetas)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAIXAETIQUETAS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAIXAETIQUETAS$6);
            }
            target.setStringValue(faixaEtiquetas);
        }
    }
    
    /**
     * Sets (as xml) the "faixaEtiquetas" element
     */
    public void xsetFaixaEtiquetas(org.apache.xmlbeans.XmlString faixaEtiquetas)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAIXAETIQUETAS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FAIXAETIQUETAS$6);
            }
            target.set(faixaEtiquetas);
        }
    }
    
    /**
     * Unsets the "faixaEtiquetas" element
     */
    public void unsetFaixaEtiquetas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAIXAETIQUETAS$6, 0);
        }
    }
    
    /**
     * Gets the "usuario" element
     */
    public java.lang.String getUsuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USUARIO$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "usuario" element
     */
    public org.apache.xmlbeans.XmlString xgetUsuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USUARIO$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "usuario" element
     */
    public boolean isSetUsuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USUARIO$8) != 0;
        }
    }
    
    /**
     * Sets the "usuario" element
     */
    public void setUsuario(java.lang.String usuario)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USUARIO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USUARIO$8);
            }
            target.setStringValue(usuario);
        }
    }
    
    /**
     * Sets (as xml) the "usuario" element
     */
    public void xsetUsuario(org.apache.xmlbeans.XmlString usuario)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USUARIO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USUARIO$8);
            }
            target.set(usuario);
        }
    }
    
    /**
     * Unsets the "usuario" element
     */
    public void unsetUsuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USUARIO$8, 0);
        }
    }
    
    /**
     * Gets the "senha" element
     */
    public java.lang.String getSenha()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENHA$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "senha" element
     */
    public org.apache.xmlbeans.XmlString xgetSenha()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENHA$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "senha" element
     */
    public boolean isSetSenha()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENHA$10) != 0;
        }
    }
    
    /**
     * Sets the "senha" element
     */
    public void setSenha(java.lang.String senha)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENHA$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENHA$10);
            }
            target.setStringValue(senha);
        }
    }
    
    /**
     * Sets (as xml) the "senha" element
     */
    public void xsetSenha(org.apache.xmlbeans.XmlString senha)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENHA$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SENHA$10);
            }
            target.set(senha);
        }
    }
    
    /**
     * Unsets the "senha" element
     */
    public void unsetSenha()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENHA$10, 0);
        }
    }
}
