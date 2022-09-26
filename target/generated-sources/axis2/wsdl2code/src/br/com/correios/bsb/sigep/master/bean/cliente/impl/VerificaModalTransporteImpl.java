/*
 * XML Type:  verificaModalTransporte
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporte
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML verificaModalTransporte(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class VerificaModalTransporteImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporte
{
    
    public VerificaModalTransporteImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODIGOSERVICO$0 = 
        new javax.xml.namespace.QName("", "codigoServico");
    private static final javax.xml.namespace.QName CEPORIGEM$2 = 
        new javax.xml.namespace.QName("", "cepOrigem");
    private static final javax.xml.namespace.QName CEPDESTINO$4 = 
        new javax.xml.namespace.QName("", "cepDestino");
    private static final javax.xml.namespace.QName USUARIO$6 = 
        new javax.xml.namespace.QName("", "usuario");
    private static final javax.xml.namespace.QName SENHA$8 = 
        new javax.xml.namespace.QName("", "senha");
    
    
    /**
     * Gets the "codigoServico" element
     */
    public java.lang.String getCodigoServico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGOSERVICO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codigoServico" element
     */
    public org.apache.xmlbeans.XmlString xgetCodigoServico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOSERVICO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "codigoServico" element
     */
    public boolean isSetCodigoServico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODIGOSERVICO$0) != 0;
        }
    }
    
    /**
     * Sets the "codigoServico" element
     */
    public void setCodigoServico(java.lang.String codigoServico)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGOSERVICO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODIGOSERVICO$0);
            }
            target.setStringValue(codigoServico);
        }
    }
    
    /**
     * Sets (as xml) the "codigoServico" element
     */
    public void xsetCodigoServico(org.apache.xmlbeans.XmlString codigoServico)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOSERVICO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODIGOSERVICO$0);
            }
            target.set(codigoServico);
        }
    }
    
    /**
     * Unsets the "codigoServico" element
     */
    public void unsetCodigoServico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODIGOSERVICO$0, 0);
        }
    }
    
    /**
     * Gets the "cepOrigem" element
     */
    public java.lang.String getCepOrigem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CEPORIGEM$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cepOrigem" element
     */
    public org.apache.xmlbeans.XmlString xgetCepOrigem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CEPORIGEM$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "cepOrigem" element
     */
    public boolean isSetCepOrigem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CEPORIGEM$2) != 0;
        }
    }
    
    /**
     * Sets the "cepOrigem" element
     */
    public void setCepOrigem(java.lang.String cepOrigem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CEPORIGEM$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CEPORIGEM$2);
            }
            target.setStringValue(cepOrigem);
        }
    }
    
    /**
     * Sets (as xml) the "cepOrigem" element
     */
    public void xsetCepOrigem(org.apache.xmlbeans.XmlString cepOrigem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CEPORIGEM$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CEPORIGEM$2);
            }
            target.set(cepOrigem);
        }
    }
    
    /**
     * Unsets the "cepOrigem" element
     */
    public void unsetCepOrigem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CEPORIGEM$2, 0);
        }
    }
    
    /**
     * Gets the "cepDestino" element
     */
    public java.lang.String getCepDestino()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CEPDESTINO$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cepDestino" element
     */
    public org.apache.xmlbeans.XmlString xgetCepDestino()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CEPDESTINO$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "cepDestino" element
     */
    public boolean isSetCepDestino()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CEPDESTINO$4) != 0;
        }
    }
    
    /**
     * Sets the "cepDestino" element
     */
    public void setCepDestino(java.lang.String cepDestino)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CEPDESTINO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CEPDESTINO$4);
            }
            target.setStringValue(cepDestino);
        }
    }
    
    /**
     * Sets (as xml) the "cepDestino" element
     */
    public void xsetCepDestino(org.apache.xmlbeans.XmlString cepDestino)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CEPDESTINO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CEPDESTINO$4);
            }
            target.set(cepDestino);
        }
    }
    
    /**
     * Unsets the "cepDestino" element
     */
    public void unsetCepDestino()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CEPDESTINO$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USUARIO$6, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USUARIO$6, 0);
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
            return get_store().count_elements(USUARIO$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USUARIO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USUARIO$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USUARIO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USUARIO$6);
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
            get_store().remove_element(USUARIO$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENHA$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENHA$8, 0);
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
            return get_store().count_elements(SENHA$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENHA$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENHA$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENHA$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SENHA$8);
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
            get_store().remove_element(SENHA$8, 0);
        }
    }
}
