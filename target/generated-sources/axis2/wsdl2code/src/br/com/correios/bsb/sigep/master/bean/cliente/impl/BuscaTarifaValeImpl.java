/*
 * XML Type:  buscaTarifaVale
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaVale
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML buscaTarifaVale(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class BuscaTarifaValeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaVale
{
    
    public BuscaTarifaValeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODADMINISTRATIVO$0 = 
        new javax.xml.namespace.QName("", "codAdministrativo");
    private static final javax.xml.namespace.QName USUARIO$2 = 
        new javax.xml.namespace.QName("", "usuario");
    private static final javax.xml.namespace.QName SENHA$4 = 
        new javax.xml.namespace.QName("", "senha");
    private static final javax.xml.namespace.QName CODSERVICO$6 = 
        new javax.xml.namespace.QName("", "codServico");
    private static final javax.xml.namespace.QName CEPORIGEM$8 = 
        new javax.xml.namespace.QName("", "cepOrigem");
    private static final javax.xml.namespace.QName CEPDESTINO$10 = 
        new javax.xml.namespace.QName("", "cepDestino");
    private static final javax.xml.namespace.QName PESO$12 = 
        new javax.xml.namespace.QName("", "peso");
    private static final javax.xml.namespace.QName CODFORMATO$14 = 
        new javax.xml.namespace.QName("", "codFormato");
    private static final javax.xml.namespace.QName COMPRIMENTO$16 = 
        new javax.xml.namespace.QName("", "comprimento");
    private static final javax.xml.namespace.QName ALTURA$18 = 
        new javax.xml.namespace.QName("", "altura");
    private static final javax.xml.namespace.QName LARGURA$20 = 
        new javax.xml.namespace.QName("", "largura");
    private static final javax.xml.namespace.QName VALORDECLARADO$22 = 
        new javax.xml.namespace.QName("", "valorDeclarado");
    private static final javax.xml.namespace.QName SERVICOADICIONAL$24 = 
        new javax.xml.namespace.QName("", "servicoAdicional");
    
    
    /**
     * Gets the "codAdministrativo" element
     */
    public java.lang.String getCodAdministrativo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODADMINISTRATIVO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codAdministrativo" element
     */
    public org.apache.xmlbeans.XmlString xgetCodAdministrativo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODADMINISTRATIVO$0, 0);
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
    public void setCodAdministrativo(java.lang.String codAdministrativo)
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
            target.setStringValue(codAdministrativo);
        }
    }
    
    /**
     * Sets (as xml) the "codAdministrativo" element
     */
    public void xsetCodAdministrativo(org.apache.xmlbeans.XmlString codAdministrativo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODADMINISTRATIVO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODADMINISTRATIVO$0);
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
    
    /**
     * Gets the "codServico" element
     */
    public java.lang.String getCodServico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODSERVICO$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codServico" element
     */
    public org.apache.xmlbeans.XmlString xgetCodServico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODSERVICO$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "codServico" element
     */
    public boolean isSetCodServico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODSERVICO$6) != 0;
        }
    }
    
    /**
     * Sets the "codServico" element
     */
    public void setCodServico(java.lang.String codServico)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODSERVICO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODSERVICO$6);
            }
            target.setStringValue(codServico);
        }
    }
    
    /**
     * Sets (as xml) the "codServico" element
     */
    public void xsetCodServico(org.apache.xmlbeans.XmlString codServico)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODSERVICO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODSERVICO$6);
            }
            target.set(codServico);
        }
    }
    
    /**
     * Unsets the "codServico" element
     */
    public void unsetCodServico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODSERVICO$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CEPORIGEM$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CEPORIGEM$8, 0);
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
            return get_store().count_elements(CEPORIGEM$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CEPORIGEM$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CEPORIGEM$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CEPORIGEM$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CEPORIGEM$8);
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
            get_store().remove_element(CEPORIGEM$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CEPDESTINO$10, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CEPDESTINO$10, 0);
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
            return get_store().count_elements(CEPDESTINO$10) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CEPDESTINO$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CEPDESTINO$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CEPDESTINO$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CEPDESTINO$10);
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
            get_store().remove_element(CEPDESTINO$10, 0);
        }
    }
    
    /**
     * Gets the "peso" element
     */
    public java.lang.String getPeso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PESO$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "peso" element
     */
    public org.apache.xmlbeans.XmlString xgetPeso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PESO$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "peso" element
     */
    public boolean isSetPeso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PESO$12) != 0;
        }
    }
    
    /**
     * Sets the "peso" element
     */
    public void setPeso(java.lang.String peso)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PESO$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PESO$12);
            }
            target.setStringValue(peso);
        }
    }
    
    /**
     * Sets (as xml) the "peso" element
     */
    public void xsetPeso(org.apache.xmlbeans.XmlString peso)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PESO$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PESO$12);
            }
            target.set(peso);
        }
    }
    
    /**
     * Unsets the "peso" element
     */
    public void unsetPeso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PESO$12, 0);
        }
    }
    
    /**
     * Gets the "codFormato" element
     */
    public int getCodFormato()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODFORMATO$14, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "codFormato" element
     */
    public org.apache.xmlbeans.XmlInt xgetCodFormato()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CODFORMATO$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "codFormato" element
     */
    public boolean isSetCodFormato()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODFORMATO$14) != 0;
        }
    }
    
    /**
     * Sets the "codFormato" element
     */
    public void setCodFormato(int codFormato)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODFORMATO$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODFORMATO$14);
            }
            target.setIntValue(codFormato);
        }
    }
    
    /**
     * Sets (as xml) the "codFormato" element
     */
    public void xsetCodFormato(org.apache.xmlbeans.XmlInt codFormato)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CODFORMATO$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CODFORMATO$14);
            }
            target.set(codFormato);
        }
    }
    
    /**
     * Unsets the "codFormato" element
     */
    public void unsetCodFormato()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODFORMATO$14, 0);
        }
    }
    
    /**
     * Gets the "comprimento" element
     */
    public double getComprimento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPRIMENTO$16, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "comprimento" element
     */
    public org.apache.xmlbeans.XmlDouble xgetComprimento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(COMPRIMENTO$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "comprimento" element
     */
    public boolean isSetComprimento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPRIMENTO$16) != 0;
        }
    }
    
    /**
     * Sets the "comprimento" element
     */
    public void setComprimento(double comprimento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPRIMENTO$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPRIMENTO$16);
            }
            target.setDoubleValue(comprimento);
        }
    }
    
    /**
     * Sets (as xml) the "comprimento" element
     */
    public void xsetComprimento(org.apache.xmlbeans.XmlDouble comprimento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(COMPRIMENTO$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(COMPRIMENTO$16);
            }
            target.set(comprimento);
        }
    }
    
    /**
     * Unsets the "comprimento" element
     */
    public void unsetComprimento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPRIMENTO$16, 0);
        }
    }
    
    /**
     * Gets the "altura" element
     */
    public double getAltura()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTURA$18, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "altura" element
     */
    public org.apache.xmlbeans.XmlDouble xgetAltura()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(ALTURA$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "altura" element
     */
    public boolean isSetAltura()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALTURA$18) != 0;
        }
    }
    
    /**
     * Sets the "altura" element
     */
    public void setAltura(double altura)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTURA$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALTURA$18);
            }
            target.setDoubleValue(altura);
        }
    }
    
    /**
     * Sets (as xml) the "altura" element
     */
    public void xsetAltura(org.apache.xmlbeans.XmlDouble altura)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(ALTURA$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(ALTURA$18);
            }
            target.set(altura);
        }
    }
    
    /**
     * Unsets the "altura" element
     */
    public void unsetAltura()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALTURA$18, 0);
        }
    }
    
    /**
     * Gets the "largura" element
     */
    public double getLargura()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LARGURA$20, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "largura" element
     */
    public org.apache.xmlbeans.XmlDouble xgetLargura()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(LARGURA$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "largura" element
     */
    public boolean isSetLargura()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LARGURA$20) != 0;
        }
    }
    
    /**
     * Sets the "largura" element
     */
    public void setLargura(double largura)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LARGURA$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LARGURA$20);
            }
            target.setDoubleValue(largura);
        }
    }
    
    /**
     * Sets (as xml) the "largura" element
     */
    public void xsetLargura(org.apache.xmlbeans.XmlDouble largura)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(LARGURA$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(LARGURA$20);
            }
            target.set(largura);
        }
    }
    
    /**
     * Unsets the "largura" element
     */
    public void unsetLargura()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LARGURA$20, 0);
        }
    }
    
    /**
     * Gets the "valorDeclarado" element
     */
    public double getValorDeclarado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALORDECLARADO$22, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "valorDeclarado" element
     */
    public org.apache.xmlbeans.XmlDouble xgetValorDeclarado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(VALORDECLARADO$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "valorDeclarado" element
     */
    public boolean isSetValorDeclarado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALORDECLARADO$22) != 0;
        }
    }
    
    /**
     * Sets the "valorDeclarado" element
     */
    public void setValorDeclarado(double valorDeclarado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALORDECLARADO$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALORDECLARADO$22);
            }
            target.setDoubleValue(valorDeclarado);
        }
    }
    
    /**
     * Sets (as xml) the "valorDeclarado" element
     */
    public void xsetValorDeclarado(org.apache.xmlbeans.XmlDouble valorDeclarado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(VALORDECLARADO$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(VALORDECLARADO$22);
            }
            target.set(valorDeclarado);
        }
    }
    
    /**
     * Unsets the "valorDeclarado" element
     */
    public void unsetValorDeclarado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALORDECLARADO$22, 0);
        }
    }
    
    /**
     * Gets the "servicoAdicional" element
     */
    public java.lang.String getServicoAdicional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICOADICIONAL$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "servicoAdicional" element
     */
    public org.apache.xmlbeans.XmlString xgetServicoAdicional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICOADICIONAL$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "servicoAdicional" element
     */
    public boolean isSetServicoAdicional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICOADICIONAL$24) != 0;
        }
    }
    
    /**
     * Sets the "servicoAdicional" element
     */
    public void setServicoAdicional(java.lang.String servicoAdicional)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICOADICIONAL$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICOADICIONAL$24);
            }
            target.setStringValue(servicoAdicional);
        }
    }
    
    /**
     * Sets (as xml) the "servicoAdicional" element
     */
    public void xsetServicoAdicional(org.apache.xmlbeans.XmlString servicoAdicional)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICOADICIONAL$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SERVICOADICIONAL$24);
            }
            target.set(servicoAdicional);
        }
    }
    
    /**
     * Unsets the "servicoAdicional" element
     */
    public void unsetServicoAdicional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICOADICIONAL$24, 0);
        }
    }
}
