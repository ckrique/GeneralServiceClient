/*
 * XML Type:  solicitaEtiquetas
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML solicitaEtiquetas(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class SolicitaEtiquetasImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas
{
    
    public SolicitaEtiquetasImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIPODESTINATARIO$0 = 
        new javax.xml.namespace.QName("", "tipoDestinatario");
    private static final javax.xml.namespace.QName IDENTIFICADOR$2 = 
        new javax.xml.namespace.QName("", "identificador");
    private static final javax.xml.namespace.QName IDSERVICO$4 = 
        new javax.xml.namespace.QName("", "idServico");
    private static final javax.xml.namespace.QName QTDETIQUETAS$6 = 
        new javax.xml.namespace.QName("", "qtdEtiquetas");
    private static final javax.xml.namespace.QName USUARIO$8 = 
        new javax.xml.namespace.QName("", "usuario");
    private static final javax.xml.namespace.QName SENHA$10 = 
        new javax.xml.namespace.QName("", "senha");
    
    
    /**
     * Gets the "tipoDestinatario" element
     */
    public java.lang.String getTipoDestinatario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPODESTINATARIO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tipoDestinatario" element
     */
    public org.apache.xmlbeans.XmlString xgetTipoDestinatario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPODESTINATARIO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "tipoDestinatario" element
     */
    public boolean isSetTipoDestinatario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIPODESTINATARIO$0) != 0;
        }
    }
    
    /**
     * Sets the "tipoDestinatario" element
     */
    public void setTipoDestinatario(java.lang.String tipoDestinatario)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPODESTINATARIO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPODESTINATARIO$0);
            }
            target.setStringValue(tipoDestinatario);
        }
    }
    
    /**
     * Sets (as xml) the "tipoDestinatario" element
     */
    public void xsetTipoDestinatario(org.apache.xmlbeans.XmlString tipoDestinatario)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPODESTINATARIO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIPODESTINATARIO$0);
            }
            target.set(tipoDestinatario);
        }
    }
    
    /**
     * Unsets the "tipoDestinatario" element
     */
    public void unsetTipoDestinatario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIPODESTINATARIO$0, 0);
        }
    }
    
    /**
     * Gets the "identificador" element
     */
    public java.lang.String getIdentificador()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFICADOR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "identificador" element
     */
    public org.apache.xmlbeans.XmlString xgetIdentificador()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDENTIFICADOR$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "identificador" element
     */
    public boolean isSetIdentificador()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFICADOR$2) != 0;
        }
    }
    
    /**
     * Sets the "identificador" element
     */
    public void setIdentificador(java.lang.String identificador)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFICADOR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDENTIFICADOR$2);
            }
            target.setStringValue(identificador);
        }
    }
    
    /**
     * Sets (as xml) the "identificador" element
     */
    public void xsetIdentificador(org.apache.xmlbeans.XmlString identificador)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDENTIFICADOR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDENTIFICADOR$2);
            }
            target.set(identificador);
        }
    }
    
    /**
     * Unsets the "identificador" element
     */
    public void unsetIdentificador()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFICADOR$2, 0);
        }
    }
    
    /**
     * Gets the "idServico" element
     */
    public long getIdServico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDSERVICO$4, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "idServico" element
     */
    public org.apache.xmlbeans.XmlLong xgetIdServico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(IDSERVICO$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "idServico" element
     */
    public boolean isSetIdServico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDSERVICO$4) != 0;
        }
    }
    
    /**
     * Sets the "idServico" element
     */
    public void setIdServico(long idServico)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDSERVICO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDSERVICO$4);
            }
            target.setLongValue(idServico);
        }
    }
    
    /**
     * Sets (as xml) the "idServico" element
     */
    public void xsetIdServico(org.apache.xmlbeans.XmlLong idServico)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(IDSERVICO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(IDSERVICO$4);
            }
            target.set(idServico);
        }
    }
    
    /**
     * Unsets the "idServico" element
     */
    public void unsetIdServico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDSERVICO$4, 0);
        }
    }
    
    /**
     * Gets the "qtdEtiquetas" element
     */
    public int getQtdEtiquetas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QTDETIQUETAS$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "qtdEtiquetas" element
     */
    public org.apache.xmlbeans.XmlInt xgetQtdEtiquetas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(QTDETIQUETAS$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "qtdEtiquetas" element
     */
    public boolean isSetQtdEtiquetas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QTDETIQUETAS$6) != 0;
        }
    }
    
    /**
     * Sets the "qtdEtiquetas" element
     */
    public void setQtdEtiquetas(int qtdEtiquetas)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QTDETIQUETAS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QTDETIQUETAS$6);
            }
            target.setIntValue(qtdEtiquetas);
        }
    }
    
    /**
     * Sets (as xml) the "qtdEtiquetas" element
     */
    public void xsetQtdEtiquetas(org.apache.xmlbeans.XmlInt qtdEtiquetas)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(QTDETIQUETAS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(QTDETIQUETAS$6);
            }
            target.set(qtdEtiquetas);
        }
    }
    
    /**
     * Unsets the "qtdEtiquetas" element
     */
    public void unsetQtdEtiquetas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QTDETIQUETAS$6, 0);
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
