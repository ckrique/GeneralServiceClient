/*
 * XML Type:  obterClienteAtualizacao
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacao
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML obterClienteAtualizacao(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class ObterClienteAtualizacaoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacao
{
    
    public ObterClienteAtualizacaoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CNPJCLIENTE$0 = 
        new javax.xml.namespace.QName("", "cnpjCliente");
    private static final javax.xml.namespace.QName USUARIO$2 = 
        new javax.xml.namespace.QName("", "usuario");
    private static final javax.xml.namespace.QName SENHA$4 = 
        new javax.xml.namespace.QName("", "senha");
    
    
    /**
     * Gets the "cnpjCliente" element
     */
    public java.lang.String getCnpjCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CNPJCLIENTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cnpjCliente" element
     */
    public org.apache.xmlbeans.XmlString xgetCnpjCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CNPJCLIENTE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "cnpjCliente" element
     */
    public boolean isSetCnpjCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CNPJCLIENTE$0) != 0;
        }
    }
    
    /**
     * Sets the "cnpjCliente" element
     */
    public void setCnpjCliente(java.lang.String cnpjCliente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CNPJCLIENTE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CNPJCLIENTE$0);
            }
            target.setStringValue(cnpjCliente);
        }
    }
    
    /**
     * Sets (as xml) the "cnpjCliente" element
     */
    public void xsetCnpjCliente(org.apache.xmlbeans.XmlString cnpjCliente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CNPJCLIENTE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CNPJCLIENTE$0);
            }
            target.set(cnpjCliente);
        }
    }
    
    /**
     * Unsets the "cnpjCliente" element
     */
    public void unsetCnpjCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CNPJCLIENTE$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USUARIO$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USUARIO$2, 0);
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
            return get_store().count_elements(USUARIO$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USUARIO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USUARIO$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USUARIO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USUARIO$2);
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
            get_store().remove_element(USUARIO$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENHA$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENHA$4, 0);
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
            return get_store().count_elements(SENHA$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENHA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENHA$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENHA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SENHA$4);
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
            get_store().remove_element(SENHA$4, 0);
        }
    }
}
