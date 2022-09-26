/*
 * XML Type:  validarPostagemSimultanea
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML validarPostagemSimultanea(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class ValidarPostagemSimultaneaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea
{
    
    public ValidarPostagemSimultaneaImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODADMINISTRATIVO$0 = 
        new javax.xml.namespace.QName("", "codAdministrativo");
    private static final javax.xml.namespace.QName CODIGOSERVICO$2 = 
        new javax.xml.namespace.QName("", "codigoServico");
    private static final javax.xml.namespace.QName IDCARTAOPOSTAGEM$4 = 
        new javax.xml.namespace.QName("", "idCartaoPostagem");
    private static final javax.xml.namespace.QName CEPDESTINATARIO$6 = 
        new javax.xml.namespace.QName("", "cepDestinatario");
    private static final javax.xml.namespace.QName COLETA$8 = 
        new javax.xml.namespace.QName("", "coleta");
    private static final javax.xml.namespace.QName USUARIO$10 = 
        new javax.xml.namespace.QName("", "usuario");
    private static final javax.xml.namespace.QName SENHA$12 = 
        new javax.xml.namespace.QName("", "senha");
    
    
    /**
     * Gets the "codAdministrativo" element
     */
    public int getCodAdministrativo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODADMINISTRATIVO$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "codAdministrativo" element
     */
    public org.apache.xmlbeans.XmlInt xgetCodAdministrativo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CODADMINISTRATIVO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "codAdministrativo" element
     */
    public boolean isSetCodAdministrativo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODADMINISTRATIVO$0) != 0;
        }
    }
    
    /**
     * Sets the "codAdministrativo" element
     */
    public void setCodAdministrativo(int codAdministrativo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODADMINISTRATIVO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODADMINISTRATIVO$0);
            }
            target.setIntValue(codAdministrativo);
        }
    }
    
    /**
     * Sets (as xml) the "codAdministrativo" element
     */
    public void xsetCodAdministrativo(org.apache.xmlbeans.XmlInt codAdministrativo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CODADMINISTRATIVO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CODADMINISTRATIVO$0);
            }
            target.set(codAdministrativo);
        }
    }
    
    /**
     * Unsets the "codAdministrativo" element
     */
    public void unsetCodAdministrativo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODADMINISTRATIVO$0, 0);
        }
    }
    
    /**
     * Gets the "codigoServico" element
     */
    public int getCodigoServico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGOSERVICO$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "codigoServico" element
     */
    public org.apache.xmlbeans.XmlInt xgetCodigoServico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CODIGOSERVICO$2, 0);
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
            return get_store().count_elements(CODIGOSERVICO$2) != 0;
        }
    }
    
    /**
     * Sets the "codigoServico" element
     */
    public void setCodigoServico(int codigoServico)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGOSERVICO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODIGOSERVICO$2);
            }
            target.setIntValue(codigoServico);
        }
    }
    
    /**
     * Sets (as xml) the "codigoServico" element
     */
    public void xsetCodigoServico(org.apache.xmlbeans.XmlInt codigoServico)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CODIGOSERVICO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CODIGOSERVICO$2);
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
            get_store().remove_element(CODIGOSERVICO$2, 0);
        }
    }
    
    /**
     * Gets the "idCartaoPostagem" element
     */
    public java.lang.String getIdCartaoPostagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDCARTAOPOSTAGEM$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "idCartaoPostagem" element
     */
    public org.apache.xmlbeans.XmlString xgetIdCartaoPostagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDCARTAOPOSTAGEM$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "idCartaoPostagem" element
     */
    public boolean isSetIdCartaoPostagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDCARTAOPOSTAGEM$4) != 0;
        }
    }
    
    /**
     * Sets the "idCartaoPostagem" element
     */
    public void setIdCartaoPostagem(java.lang.String idCartaoPostagem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDCARTAOPOSTAGEM$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDCARTAOPOSTAGEM$4);
            }
            target.setStringValue(idCartaoPostagem);
        }
    }
    
    /**
     * Sets (as xml) the "idCartaoPostagem" element
     */
    public void xsetIdCartaoPostagem(org.apache.xmlbeans.XmlString idCartaoPostagem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDCARTAOPOSTAGEM$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDCARTAOPOSTAGEM$4);
            }
            target.set(idCartaoPostagem);
        }
    }
    
    /**
     * Unsets the "idCartaoPostagem" element
     */
    public void unsetIdCartaoPostagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDCARTAOPOSTAGEM$4, 0);
        }
    }
    
    /**
     * Gets the "cepDestinatario" element
     */
    public java.lang.String getCepDestinatario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CEPDESTINATARIO$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cepDestinatario" element
     */
    public org.apache.xmlbeans.XmlString xgetCepDestinatario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CEPDESTINATARIO$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "cepDestinatario" element
     */
    public boolean isSetCepDestinatario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CEPDESTINATARIO$6) != 0;
        }
    }
    
    /**
     * Sets the "cepDestinatario" element
     */
    public void setCepDestinatario(java.lang.String cepDestinatario)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CEPDESTINATARIO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CEPDESTINATARIO$6);
            }
            target.setStringValue(cepDestinatario);
        }
    }
    
    /**
     * Sets (as xml) the "cepDestinatario" element
     */
    public void xsetCepDestinatario(org.apache.xmlbeans.XmlString cepDestinatario)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CEPDESTINATARIO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CEPDESTINATARIO$6);
            }
            target.set(cepDestinatario);
        }
    }
    
    /**
     * Unsets the "cepDestinatario" element
     */
    public void unsetCepDestinatario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CEPDESTINATARIO$6, 0);
        }
    }
    
    /**
     * Gets the "coleta" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea getColeta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea)get_store().find_element_user(COLETA$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "coleta" element
     */
    public boolean isSetColeta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLETA$8) != 0;
        }
    }
    
    /**
     * Sets the "coleta" element
     */
    public void setColeta(br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea coleta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea)get_store().find_element_user(COLETA$8, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea)get_store().add_element_user(COLETA$8);
            }
            target.set(coleta);
        }
    }
    
    /**
     * Appends and returns a new empty "coleta" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea addNewColeta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea)get_store().add_element_user(COLETA$8);
            return target;
        }
    }
    
    /**
     * Unsets the "coleta" element
     */
    public void unsetColeta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLETA$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USUARIO$10, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USUARIO$10, 0);
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
            return get_store().count_elements(USUARIO$10) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USUARIO$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USUARIO$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USUARIO$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USUARIO$10);
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
            get_store().remove_element(USUARIO$10, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENHA$12, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENHA$12, 0);
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
            return get_store().count_elements(SENHA$12) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENHA$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENHA$12);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENHA$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SENHA$12);
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
            get_store().remove_element(SENHA$12, 0);
        }
    }
}
