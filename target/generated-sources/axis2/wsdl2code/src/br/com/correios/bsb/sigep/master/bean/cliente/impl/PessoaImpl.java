/*
 * XML Type:  pessoa
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.Pessoa
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML pessoa(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class PessoaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.Pessoa
{
    
    public PessoaImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BAIRRO$0 = 
        new javax.xml.namespace.QName("", "bairro");
    private static final javax.xml.namespace.QName CEP$2 = 
        new javax.xml.namespace.QName("", "cep");
    private static final javax.xml.namespace.QName CIDADE$4 = 
        new javax.xml.namespace.QName("", "cidade");
    private static final javax.xml.namespace.QName COMPLEMENTO$6 = 
        new javax.xml.namespace.QName("", "complemento");
    private static final javax.xml.namespace.QName DDD$8 = 
        new javax.xml.namespace.QName("", "ddd");
    private static final javax.xml.namespace.QName EMAIL$10 = 
        new javax.xml.namespace.QName("", "email");
    private static final javax.xml.namespace.QName LOGRADOURO$12 = 
        new javax.xml.namespace.QName("", "logradouro");
    private static final javax.xml.namespace.QName NOME$14 = 
        new javax.xml.namespace.QName("", "nome");
    private static final javax.xml.namespace.QName NUMERO$16 = 
        new javax.xml.namespace.QName("", "numero");
    private static final javax.xml.namespace.QName REFERENCIA$18 = 
        new javax.xml.namespace.QName("", "referencia");
    private static final javax.xml.namespace.QName TELEFONE$20 = 
        new javax.xml.namespace.QName("", "telefone");
    private static final javax.xml.namespace.QName UF$22 = 
        new javax.xml.namespace.QName("", "uf");
    
    
    /**
     * Gets the "bairro" element
     */
    public java.lang.String getBairro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BAIRRO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "bairro" element
     */
    public org.apache.xmlbeans.XmlString xgetBairro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BAIRRO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "bairro" element
     */
    public boolean isSetBairro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BAIRRO$0) != 0;
        }
    }
    
    /**
     * Sets the "bairro" element
     */
    public void setBairro(java.lang.String bairro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BAIRRO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BAIRRO$0);
            }
            target.setStringValue(bairro);
        }
    }
    
    /**
     * Sets (as xml) the "bairro" element
     */
    public void xsetBairro(org.apache.xmlbeans.XmlString bairro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BAIRRO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BAIRRO$0);
            }
            target.set(bairro);
        }
    }
    
    /**
     * Unsets the "bairro" element
     */
    public void unsetBairro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BAIRRO$0, 0);
        }
    }
    
    /**
     * Gets the "cep" element
     */
    public java.lang.String getCep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CEP$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cep" element
     */
    public org.apache.xmlbeans.XmlString xgetCep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CEP$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "cep" element
     */
    public boolean isSetCep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CEP$2) != 0;
        }
    }
    
    /**
     * Sets the "cep" element
     */
    public void setCep(java.lang.String cep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CEP$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CEP$2);
            }
            target.setStringValue(cep);
        }
    }
    
    /**
     * Sets (as xml) the "cep" element
     */
    public void xsetCep(org.apache.xmlbeans.XmlString cep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CEP$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CEP$2);
            }
            target.set(cep);
        }
    }
    
    /**
     * Unsets the "cep" element
     */
    public void unsetCep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CEP$2, 0);
        }
    }
    
    /**
     * Gets the "cidade" element
     */
    public java.lang.String getCidade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CIDADE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cidade" element
     */
    public org.apache.xmlbeans.XmlString xgetCidade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CIDADE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "cidade" element
     */
    public boolean isSetCidade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CIDADE$4) != 0;
        }
    }
    
    /**
     * Sets the "cidade" element
     */
    public void setCidade(java.lang.String cidade)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CIDADE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CIDADE$4);
            }
            target.setStringValue(cidade);
        }
    }
    
    /**
     * Sets (as xml) the "cidade" element
     */
    public void xsetCidade(org.apache.xmlbeans.XmlString cidade)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CIDADE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CIDADE$4);
            }
            target.set(cidade);
        }
    }
    
    /**
     * Unsets the "cidade" element
     */
    public void unsetCidade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CIDADE$4, 0);
        }
    }
    
    /**
     * Gets the "complemento" element
     */
    public java.lang.String getComplemento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPLEMENTO$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "complemento" element
     */
    public org.apache.xmlbeans.XmlString xgetComplemento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMPLEMENTO$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "complemento" element
     */
    public boolean isSetComplemento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPLEMENTO$6) != 0;
        }
    }
    
    /**
     * Sets the "complemento" element
     */
    public void setComplemento(java.lang.String complemento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPLEMENTO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPLEMENTO$6);
            }
            target.setStringValue(complemento);
        }
    }
    
    /**
     * Sets (as xml) the "complemento" element
     */
    public void xsetComplemento(org.apache.xmlbeans.XmlString complemento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMPLEMENTO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMPLEMENTO$6);
            }
            target.set(complemento);
        }
    }
    
    /**
     * Unsets the "complemento" element
     */
    public void unsetComplemento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPLEMENTO$6, 0);
        }
    }
    
    /**
     * Gets the "ddd" element
     */
    public java.lang.String getDdd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DDD$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ddd" element
     */
    public org.apache.xmlbeans.XmlString xgetDdd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DDD$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "ddd" element
     */
    public boolean isSetDdd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DDD$8) != 0;
        }
    }
    
    /**
     * Sets the "ddd" element
     */
    public void setDdd(java.lang.String ddd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DDD$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DDD$8);
            }
            target.setStringValue(ddd);
        }
    }
    
    /**
     * Sets (as xml) the "ddd" element
     */
    public void xsetDdd(org.apache.xmlbeans.XmlString ddd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DDD$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DDD$8);
            }
            target.set(ddd);
        }
    }
    
    /**
     * Unsets the "ddd" element
     */
    public void unsetDdd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DDD$8, 0);
        }
    }
    
    /**
     * Gets the "email" element
     */
    public java.lang.String getEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "email" element
     */
    public org.apache.xmlbeans.XmlString xgetEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "email" element
     */
    public boolean isSetEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMAIL$10) != 0;
        }
    }
    
    /**
     * Sets the "email" element
     */
    public void setEmail(java.lang.String email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAIL$10);
            }
            target.setStringValue(email);
        }
    }
    
    /**
     * Sets (as xml) the "email" element
     */
    public void xsetEmail(org.apache.xmlbeans.XmlString email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAIL$10);
            }
            target.set(email);
        }
    }
    
    /**
     * Unsets the "email" element
     */
    public void unsetEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMAIL$10, 0);
        }
    }
    
    /**
     * Gets the "logradouro" element
     */
    public java.lang.String getLogradouro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGRADOURO$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "logradouro" element
     */
    public org.apache.xmlbeans.XmlString xgetLogradouro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGRADOURO$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "logradouro" element
     */
    public boolean isSetLogradouro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOGRADOURO$12) != 0;
        }
    }
    
    /**
     * Sets the "logradouro" element
     */
    public void setLogradouro(java.lang.String logradouro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGRADOURO$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOGRADOURO$12);
            }
            target.setStringValue(logradouro);
        }
    }
    
    /**
     * Sets (as xml) the "logradouro" element
     */
    public void xsetLogradouro(org.apache.xmlbeans.XmlString logradouro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGRADOURO$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOGRADOURO$12);
            }
            target.set(logradouro);
        }
    }
    
    /**
     * Unsets the "logradouro" element
     */
    public void unsetLogradouro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOGRADOURO$12, 0);
        }
    }
    
    /**
     * Gets the "nome" element
     */
    public java.lang.String getNome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOME$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nome" element
     */
    public org.apache.xmlbeans.XmlString xgetNome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOME$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "nome" element
     */
    public boolean isSetNome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOME$14) != 0;
        }
    }
    
    /**
     * Sets the "nome" element
     */
    public void setNome(java.lang.String nome)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOME$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOME$14);
            }
            target.setStringValue(nome);
        }
    }
    
    /**
     * Sets (as xml) the "nome" element
     */
    public void xsetNome(org.apache.xmlbeans.XmlString nome)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOME$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOME$14);
            }
            target.set(nome);
        }
    }
    
    /**
     * Unsets the "nome" element
     */
    public void unsetNome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOME$14, 0);
        }
    }
    
    /**
     * Gets the "numero" element
     */
    public java.lang.String getNumero()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMERO$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "numero" element
     */
    public org.apache.xmlbeans.XmlString xgetNumero()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMERO$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "numero" element
     */
    public boolean isSetNumero()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMERO$16) != 0;
        }
    }
    
    /**
     * Sets the "numero" element
     */
    public void setNumero(java.lang.String numero)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMERO$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMERO$16);
            }
            target.setStringValue(numero);
        }
    }
    
    /**
     * Sets (as xml) the "numero" element
     */
    public void xsetNumero(org.apache.xmlbeans.XmlString numero)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMERO$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMERO$16);
            }
            target.set(numero);
        }
    }
    
    /**
     * Unsets the "numero" element
     */
    public void unsetNumero()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMERO$16, 0);
        }
    }
    
    /**
     * Gets the "referencia" element
     */
    public java.lang.String getReferencia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCIA$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "referencia" element
     */
    public org.apache.xmlbeans.XmlString xgetReferencia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCIA$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "referencia" element
     */
    public boolean isSetReferencia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCIA$18) != 0;
        }
    }
    
    /**
     * Sets the "referencia" element
     */
    public void setReferencia(java.lang.String referencia)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCIA$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERENCIA$18);
            }
            target.setStringValue(referencia);
        }
    }
    
    /**
     * Sets (as xml) the "referencia" element
     */
    public void xsetReferencia(org.apache.xmlbeans.XmlString referencia)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCIA$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REFERENCIA$18);
            }
            target.set(referencia);
        }
    }
    
    /**
     * Unsets the "referencia" element
     */
    public void unsetReferencia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCIA$18, 0);
        }
    }
    
    /**
     * Gets the "telefone" element
     */
    public java.lang.String getTelefone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEFONE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "telefone" element
     */
    public org.apache.xmlbeans.XmlString xgetTelefone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEFONE$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "telefone" element
     */
    public boolean isSetTelefone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TELEFONE$20) != 0;
        }
    }
    
    /**
     * Sets the "telefone" element
     */
    public void setTelefone(java.lang.String telefone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEFONE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TELEFONE$20);
            }
            target.setStringValue(telefone);
        }
    }
    
    /**
     * Sets (as xml) the "telefone" element
     */
    public void xsetTelefone(org.apache.xmlbeans.XmlString telefone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEFONE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TELEFONE$20);
            }
            target.set(telefone);
        }
    }
    
    /**
     * Unsets the "telefone" element
     */
    public void unsetTelefone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TELEFONE$20, 0);
        }
    }
    
    /**
     * Gets the "uf" element
     */
    public java.lang.String getUf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UF$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "uf" element
     */
    public org.apache.xmlbeans.XmlString xgetUf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UF$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "uf" element
     */
    public boolean isSetUf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UF$22) != 0;
        }
    }
    
    /**
     * Sets the "uf" element
     */
    public void setUf(java.lang.String uf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UF$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UF$22);
            }
            target.setStringValue(uf);
        }
    }
    
    /**
     * Sets (as xml) the "uf" element
     */
    public void xsetUf(org.apache.xmlbeans.XmlString uf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UF$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UF$22);
            }
            target.set(uf);
        }
    }
    
    /**
     * Unsets the "uf" element
     */
    public void unsetUf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UF$22, 0);
        }
    }
}
