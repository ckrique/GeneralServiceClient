/*
 * XML Type:  validaPlp
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlp
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML validaPlp(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class ValidaPlpImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlp
{
    
    public ValidaPlpImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLIENTE$0 = 
        new javax.xml.namespace.QName("", "cliente");
    private static final javax.xml.namespace.QName NUMERO$2 = 
        new javax.xml.namespace.QName("", "numero");
    private static final javax.xml.namespace.QName DIRETORIA$4 = 
        new javax.xml.namespace.QName("", "diretoria");
    private static final javax.xml.namespace.QName CARTAO$6 = 
        new javax.xml.namespace.QName("", "cartao");
    private static final javax.xml.namespace.QName UNIDADEPOSTAGEM$8 = 
        new javax.xml.namespace.QName("", "unidadePostagem");
    private static final javax.xml.namespace.QName SERVICO$10 = 
        new javax.xml.namespace.QName("", "servico");
    private static final javax.xml.namespace.QName SERVICOSADICIONAIS$12 = 
        new javax.xml.namespace.QName("", "servicosAdicionais");
    private static final javax.xml.namespace.QName USUARIO$14 = 
        new javax.xml.namespace.QName("", "usuario");
    private static final javax.xml.namespace.QName SENHA$16 = 
        new javax.xml.namespace.QName("", "senha");
    
    
    /**
     * Gets the "cliente" element
     */
    public long getCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIENTE$0, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "cliente" element
     */
    public org.apache.xmlbeans.XmlLong xgetCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CLIENTE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "cliente" element
     */
    public void setCliente(long cliente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIENTE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLIENTE$0);
            }
            target.setLongValue(cliente);
        }
    }
    
    /**
     * Sets (as xml) the "cliente" element
     */
    public void xsetCliente(org.apache.xmlbeans.XmlLong cliente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CLIENTE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(CLIENTE$0);
            }
            target.set(cliente);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMERO$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMERO$2, 0);
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
            return get_store().count_elements(NUMERO$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMERO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMERO$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMERO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMERO$2);
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
            get_store().remove_element(NUMERO$2, 0);
        }
    }
    
    /**
     * Gets the "diretoria" element
     */
    public long getDiretoria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRETORIA$4, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "diretoria" element
     */
    public org.apache.xmlbeans.XmlLong xgetDiretoria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(DIRETORIA$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "diretoria" element
     */
    public void setDiretoria(long diretoria)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRETORIA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIRETORIA$4);
            }
            target.setLongValue(diretoria);
        }
    }
    
    /**
     * Sets (as xml) the "diretoria" element
     */
    public void xsetDiretoria(org.apache.xmlbeans.XmlLong diretoria)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(DIRETORIA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(DIRETORIA$4);
            }
            target.set(diretoria);
        }
    }
    
    /**
     * Gets the "cartao" element
     */
    public java.lang.String getCartao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARTAO$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cartao" element
     */
    public org.apache.xmlbeans.XmlString xgetCartao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CARTAO$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "cartao" element
     */
    public boolean isSetCartao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CARTAO$6) != 0;
        }
    }
    
    /**
     * Sets the "cartao" element
     */
    public void setCartao(java.lang.String cartao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARTAO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CARTAO$6);
            }
            target.setStringValue(cartao);
        }
    }
    
    /**
     * Sets (as xml) the "cartao" element
     */
    public void xsetCartao(org.apache.xmlbeans.XmlString cartao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CARTAO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CARTAO$6);
            }
            target.set(cartao);
        }
    }
    
    /**
     * Unsets the "cartao" element
     */
    public void unsetCartao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CARTAO$6, 0);
        }
    }
    
    /**
     * Gets the "unidadePostagem" element
     */
    public java.lang.String getUnidadePostagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIDADEPOSTAGEM$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "unidadePostagem" element
     */
    public org.apache.xmlbeans.XmlString xgetUnidadePostagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UNIDADEPOSTAGEM$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "unidadePostagem" element
     */
    public boolean isSetUnidadePostagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNIDADEPOSTAGEM$8) != 0;
        }
    }
    
    /**
     * Sets the "unidadePostagem" element
     */
    public void setUnidadePostagem(java.lang.String unidadePostagem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIDADEPOSTAGEM$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNIDADEPOSTAGEM$8);
            }
            target.setStringValue(unidadePostagem);
        }
    }
    
    /**
     * Sets (as xml) the "unidadePostagem" element
     */
    public void xsetUnidadePostagem(org.apache.xmlbeans.XmlString unidadePostagem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UNIDADEPOSTAGEM$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UNIDADEPOSTAGEM$8);
            }
            target.set(unidadePostagem);
        }
    }
    
    /**
     * Unsets the "unidadePostagem" element
     */
    public void unsetUnidadePostagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNIDADEPOSTAGEM$8, 0);
        }
    }
    
    /**
     * Gets the "servico" element
     */
    public long getServico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICO$10, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "servico" element
     */
    public org.apache.xmlbeans.XmlLong xgetServico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(SERVICO$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "servico" element
     */
    public boolean isSetServico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICO$10) != 0;
        }
    }
    
    /**
     * Sets the "servico" element
     */
    public void setServico(long servico)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICO$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICO$10);
            }
            target.setLongValue(servico);
        }
    }
    
    /**
     * Sets (as xml) the "servico" element
     */
    public void xsetServico(org.apache.xmlbeans.XmlLong servico)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(SERVICO$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(SERVICO$10);
            }
            target.set(servico);
        }
    }
    
    /**
     * Unsets the "servico" element
     */
    public void unsetServico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICO$10, 0);
        }
    }
    
    /**
     * Gets array of all "servicosAdicionais" elements
     */
    public java.lang.String[] getServicosAdicionaisArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SERVICOSADICIONAIS$12, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "servicosAdicionais" element
     */
    public java.lang.String getServicosAdicionaisArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICOSADICIONAIS$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "servicosAdicionais" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetServicosAdicionaisArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SERVICOSADICIONAIS$12, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "servicosAdicionais" element
     */
    public org.apache.xmlbeans.XmlString xgetServicosAdicionaisArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICOSADICIONAIS$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "servicosAdicionais" element
     */
    public int sizeOfServicosAdicionaisArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICOSADICIONAIS$12);
        }
    }
    
    /**
     * Sets array of all "servicosAdicionais" element
     */
    public void setServicosAdicionaisArray(java.lang.String[] servicosAdicionaisArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(servicosAdicionaisArray, SERVICOSADICIONAIS$12);
        }
    }
    
    /**
     * Sets ith "servicosAdicionais" element
     */
    public void setServicosAdicionaisArray(int i, java.lang.String servicosAdicionais)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICOSADICIONAIS$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(servicosAdicionais);
        }
    }
    
    /**
     * Sets (as xml) array of all "servicosAdicionais" element
     */
    public void xsetServicosAdicionaisArray(org.apache.xmlbeans.XmlString[]servicosAdicionaisArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(servicosAdicionaisArray, SERVICOSADICIONAIS$12);
        }
    }
    
    /**
     * Sets (as xml) ith "servicosAdicionais" element
     */
    public void xsetServicosAdicionaisArray(int i, org.apache.xmlbeans.XmlString servicosAdicionais)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICOSADICIONAIS$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(servicosAdicionais);
        }
    }
    
    /**
     * Inserts the value as the ith "servicosAdicionais" element
     */
    public void insertServicosAdicionais(int i, java.lang.String servicosAdicionais)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SERVICOSADICIONAIS$12, i);
            target.setStringValue(servicosAdicionais);
        }
    }
    
    /**
     * Appends the value as the last "servicosAdicionais" element
     */
    public void addServicosAdicionais(java.lang.String servicosAdicionais)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICOSADICIONAIS$12);
            target.setStringValue(servicosAdicionais);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "servicosAdicionais" element
     */
    public org.apache.xmlbeans.XmlString insertNewServicosAdicionais(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(SERVICOSADICIONAIS$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "servicosAdicionais" element
     */
    public org.apache.xmlbeans.XmlString addNewServicosAdicionais()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SERVICOSADICIONAIS$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "servicosAdicionais" element
     */
    public void removeServicosAdicionais(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICOSADICIONAIS$12, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USUARIO$14, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USUARIO$14, 0);
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
            return get_store().count_elements(USUARIO$14) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USUARIO$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USUARIO$14);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USUARIO$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USUARIO$14);
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
            get_store().remove_element(USUARIO$14, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENHA$16, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENHA$16, 0);
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
            return get_store().count_elements(SENHA$16) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENHA$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENHA$16);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENHA$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SENHA$16);
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
            get_store().remove_element(SENHA$16, 0);
        }
    }
}
