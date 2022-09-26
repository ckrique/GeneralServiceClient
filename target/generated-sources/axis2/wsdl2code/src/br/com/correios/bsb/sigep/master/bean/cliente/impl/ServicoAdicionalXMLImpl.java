/*
 * XML Type:  servicoAdicionalXML
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML servicoAdicionalXML(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class ServicoAdicionalXMLImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML
{
    
    public ServicoAdicionalXMLImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORIA$0 = 
        new javax.xml.namespace.QName("", "categoria");
    private static final javax.xml.namespace.QName CODIGO$2 = 
        new javax.xml.namespace.QName("", "codigo");
    private static final javax.xml.namespace.QName DESCRICAO$4 = 
        new javax.xml.namespace.QName("", "descricao");
    private static final javax.xml.namespace.QName MAXIMOVALORDECLARADO$6 = 
        new javax.xml.namespace.QName("", "maximoValorDeclarado");
    private static final javax.xml.namespace.QName MINIMOVALORDECLARADO$8 = 
        new javax.xml.namespace.QName("", "minimoValorDeclarado");
    private static final javax.xml.namespace.QName SIGLA$10 = 
        new javax.xml.namespace.QName("", "sigla");
    
    
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
     * Gets the "descricao" element
     */
    public java.lang.String getDescricao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRICAO$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "descricao" element
     */
    public org.apache.xmlbeans.XmlString xgetDescricao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRICAO$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "descricao" element
     */
    public boolean isSetDescricao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRICAO$4) != 0;
        }
    }
    
    /**
     * Sets the "descricao" element
     */
    public void setDescricao(java.lang.String descricao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRICAO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRICAO$4);
            }
            target.setStringValue(descricao);
        }
    }
    
    /**
     * Sets (as xml) the "descricao" element
     */
    public void xsetDescricao(org.apache.xmlbeans.XmlString descricao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRICAO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRICAO$4);
            }
            target.set(descricao);
        }
    }
    
    /**
     * Unsets the "descricao" element
     */
    public void unsetDescricao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRICAO$4, 0);
        }
    }
    
    /**
     * Gets the "maximoValorDeclarado" element
     */
    public double getMaximoValorDeclarado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXIMOVALORDECLARADO$6, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "maximoValorDeclarado" element
     */
    public org.apache.xmlbeans.XmlDouble xgetMaximoValorDeclarado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MAXIMOVALORDECLARADO$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "maximoValorDeclarado" element
     */
    public boolean isSetMaximoValorDeclarado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXIMOVALORDECLARADO$6) != 0;
        }
    }
    
    /**
     * Sets the "maximoValorDeclarado" element
     */
    public void setMaximoValorDeclarado(double maximoValorDeclarado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXIMOVALORDECLARADO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXIMOVALORDECLARADO$6);
            }
            target.setDoubleValue(maximoValorDeclarado);
        }
    }
    
    /**
     * Sets (as xml) the "maximoValorDeclarado" element
     */
    public void xsetMaximoValorDeclarado(org.apache.xmlbeans.XmlDouble maximoValorDeclarado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MAXIMOVALORDECLARADO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(MAXIMOVALORDECLARADO$6);
            }
            target.set(maximoValorDeclarado);
        }
    }
    
    /**
     * Unsets the "maximoValorDeclarado" element
     */
    public void unsetMaximoValorDeclarado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXIMOVALORDECLARADO$6, 0);
        }
    }
    
    /**
     * Gets the "minimoValorDeclarado" element
     */
    public double getMinimoValorDeclarado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIMOVALORDECLARADO$8, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "minimoValorDeclarado" element
     */
    public org.apache.xmlbeans.XmlDouble xgetMinimoValorDeclarado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MINIMOVALORDECLARADO$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "minimoValorDeclarado" element
     */
    public boolean isSetMinimoValorDeclarado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MINIMOVALORDECLARADO$8) != 0;
        }
    }
    
    /**
     * Sets the "minimoValorDeclarado" element
     */
    public void setMinimoValorDeclarado(double minimoValorDeclarado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIMOVALORDECLARADO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINIMOVALORDECLARADO$8);
            }
            target.setDoubleValue(minimoValorDeclarado);
        }
    }
    
    /**
     * Sets (as xml) the "minimoValorDeclarado" element
     */
    public void xsetMinimoValorDeclarado(org.apache.xmlbeans.XmlDouble minimoValorDeclarado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MINIMOVALORDECLARADO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(MINIMOVALORDECLARADO$8);
            }
            target.set(minimoValorDeclarado);
        }
    }
    
    /**
     * Unsets the "minimoValorDeclarado" element
     */
    public void unsetMinimoValorDeclarado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MINIMOVALORDECLARADO$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGLA$10, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIGLA$10, 0);
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
            return get_store().count_elements(SIGLA$10) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGLA$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIGLA$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIGLA$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SIGLA$10);
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
            get_store().remove_element(SIGLA$10, 0);
        }
    }
}
