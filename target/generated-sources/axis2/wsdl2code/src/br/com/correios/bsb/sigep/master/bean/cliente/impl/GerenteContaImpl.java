/*
 * XML Type:  gerenteConta
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML gerenteConta(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class GerenteContaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta
{
    
    public GerenteContaImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLIENTESVISIVEIS$0 = 
        new javax.xml.namespace.QName("", "clientesVisiveis");
    private static final javax.xml.namespace.QName DATAATUALIZACAO$2 = 
        new javax.xml.namespace.QName("", "dataAtualizacao");
    private static final javax.xml.namespace.QName DATAINCLUSAO$4 = 
        new javax.xml.namespace.QName("", "dataInclusao");
    private static final javax.xml.namespace.QName DATASENHA$6 = 
        new javax.xml.namespace.QName("", "dataSenha");
    private static final javax.xml.namespace.QName LOGIN$8 = 
        new javax.xml.namespace.QName("", "login");
    private static final javax.xml.namespace.QName MATRICULA$10 = 
        new javax.xml.namespace.QName("", "matricula");
    private static final javax.xml.namespace.QName SENHA$12 = 
        new javax.xml.namespace.QName("", "senha");
    private static final javax.xml.namespace.QName STATUS$14 = 
        new javax.xml.namespace.QName("", "status");
    private static final javax.xml.namespace.QName TIPOGERENTE$16 = 
        new javax.xml.namespace.QName("", "tipoGerente");
    private static final javax.xml.namespace.QName USUARIOSINSTALACAO$18 = 
        new javax.xml.namespace.QName("", "usuariosInstalacao");
    private static final javax.xml.namespace.QName VALIDADE$20 = 
        new javax.xml.namespace.QName("", "validade");
    
    
    /**
     * Gets array of all "clientesVisiveis" elements
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP[] getClientesVisiveisArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CLIENTESVISIVEIS$0, targetList);
            br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP[] result = new br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "clientesVisiveis" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP getClientesVisiveisArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP)get_store().find_element_user(CLIENTESVISIVEIS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "clientesVisiveis" element
     */
    public boolean isNilClientesVisiveisArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP)get_store().find_element_user(CLIENTESVISIVEIS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "clientesVisiveis" element
     */
    public int sizeOfClientesVisiveisArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLIENTESVISIVEIS$0);
        }
    }
    
    /**
     * Sets array of all "clientesVisiveis" element
     */
    public void setClientesVisiveisArray(br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP[] clientesVisiveisArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(clientesVisiveisArray, CLIENTESVISIVEIS$0);
        }
    }
    
    /**
     * Sets ith "clientesVisiveis" element
     */
    public void setClientesVisiveisArray(int i, br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP clientesVisiveis)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP)get_store().find_element_user(CLIENTESVISIVEIS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(clientesVisiveis);
        }
    }
    
    /**
     * Nils the ith "clientesVisiveis" element
     */
    public void setNilClientesVisiveisArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP)get_store().find_element_user(CLIENTESVISIVEIS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "clientesVisiveis" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP insertNewClientesVisiveis(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP)get_store().insert_element_user(CLIENTESVISIVEIS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "clientesVisiveis" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP addNewClientesVisiveis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP)get_store().add_element_user(CLIENTESVISIVEIS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "clientesVisiveis" element
     */
    public void removeClientesVisiveis(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLIENTESVISIVEIS$0, i);
        }
    }
    
    /**
     * Gets the "dataAtualizacao" element
     */
    public java.util.Calendar getDataAtualizacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAATUALIZACAO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dataAtualizacao" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDataAtualizacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAATUALIZACAO$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "dataAtualizacao" element
     */
    public boolean isSetDataAtualizacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAATUALIZACAO$2) != 0;
        }
    }
    
    /**
     * Sets the "dataAtualizacao" element
     */
    public void setDataAtualizacao(java.util.Calendar dataAtualizacao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAATUALIZACAO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAATUALIZACAO$2);
            }
            target.setCalendarValue(dataAtualizacao);
        }
    }
    
    /**
     * Sets (as xml) the "dataAtualizacao" element
     */
    public void xsetDataAtualizacao(org.apache.xmlbeans.XmlDateTime dataAtualizacao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAATUALIZACAO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATAATUALIZACAO$2);
            }
            target.set(dataAtualizacao);
        }
    }
    
    /**
     * Unsets the "dataAtualizacao" element
     */
    public void unsetDataAtualizacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAATUALIZACAO$2, 0);
        }
    }
    
    /**
     * Gets the "dataInclusao" element
     */
    public java.util.Calendar getDataInclusao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAINCLUSAO$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dataInclusao" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDataInclusao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAINCLUSAO$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "dataInclusao" element
     */
    public boolean isSetDataInclusao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAINCLUSAO$4) != 0;
        }
    }
    
    /**
     * Sets the "dataInclusao" element
     */
    public void setDataInclusao(java.util.Calendar dataInclusao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAINCLUSAO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAINCLUSAO$4);
            }
            target.setCalendarValue(dataInclusao);
        }
    }
    
    /**
     * Sets (as xml) the "dataInclusao" element
     */
    public void xsetDataInclusao(org.apache.xmlbeans.XmlDateTime dataInclusao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAINCLUSAO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATAINCLUSAO$4);
            }
            target.set(dataInclusao);
        }
    }
    
    /**
     * Unsets the "dataInclusao" element
     */
    public void unsetDataInclusao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAINCLUSAO$4, 0);
        }
    }
    
    /**
     * Gets the "dataSenha" element
     */
    public java.util.Calendar getDataSenha()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATASENHA$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dataSenha" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDataSenha()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATASENHA$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "dataSenha" element
     */
    public boolean isSetDataSenha()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATASENHA$6) != 0;
        }
    }
    
    /**
     * Sets the "dataSenha" element
     */
    public void setDataSenha(java.util.Calendar dataSenha)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATASENHA$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATASENHA$6);
            }
            target.setCalendarValue(dataSenha);
        }
    }
    
    /**
     * Sets (as xml) the "dataSenha" element
     */
    public void xsetDataSenha(org.apache.xmlbeans.XmlDateTime dataSenha)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATASENHA$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATASENHA$6);
            }
            target.set(dataSenha);
        }
    }
    
    /**
     * Unsets the "dataSenha" element
     */
    public void unsetDataSenha()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATASENHA$6, 0);
        }
    }
    
    /**
     * Gets the "login" element
     */
    public java.lang.String getLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGIN$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "login" element
     */
    public org.apache.xmlbeans.XmlString xgetLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGIN$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "login" element
     */
    public boolean isSetLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOGIN$8) != 0;
        }
    }
    
    /**
     * Sets the "login" element
     */
    public void setLogin(java.lang.String login)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGIN$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOGIN$8);
            }
            target.setStringValue(login);
        }
    }
    
    /**
     * Sets (as xml) the "login" element
     */
    public void xsetLogin(org.apache.xmlbeans.XmlString login)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGIN$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOGIN$8);
            }
            target.set(login);
        }
    }
    
    /**
     * Unsets the "login" element
     */
    public void unsetLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOGIN$8, 0);
        }
    }
    
    /**
     * Gets the "matricula" element
     */
    public java.lang.String getMatricula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MATRICULA$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "matricula" element
     */
    public org.apache.xmlbeans.XmlString xgetMatricula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MATRICULA$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "matricula" element
     */
    public boolean isSetMatricula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MATRICULA$10) != 0;
        }
    }
    
    /**
     * Sets the "matricula" element
     */
    public void setMatricula(java.lang.String matricula)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MATRICULA$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MATRICULA$10);
            }
            target.setStringValue(matricula);
        }
    }
    
    /**
     * Sets (as xml) the "matricula" element
     */
    public void xsetMatricula(org.apache.xmlbeans.XmlString matricula)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MATRICULA$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MATRICULA$10);
            }
            target.set(matricula);
        }
    }
    
    /**
     * Unsets the "matricula" element
     */
    public void unsetMatricula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MATRICULA$10, 0);
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
    
    /**
     * Gets the "status" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.StatusGerente.Enum getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$14, 0);
            if (target == null)
            {
                return null;
            }
            return (br.com.correios.bsb.sigep.master.bean.cliente.StatusGerente.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "status" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.StatusGerente xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.StatusGerente target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.StatusGerente)get_store().find_element_user(STATUS$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "status" element
     */
    public boolean isSetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUS$14) != 0;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(br.com.correios.bsb.sigep.master.bean.cliente.StatusGerente.Enum status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$14);
            }
            target.setEnumValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "status" element
     */
    public void xsetStatus(br.com.correios.bsb.sigep.master.bean.cliente.StatusGerente status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.StatusGerente target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.StatusGerente)get_store().find_element_user(STATUS$14, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.StatusGerente)get_store().add_element_user(STATUS$14);
            }
            target.set(status);
        }
    }
    
    /**
     * Unsets the "status" element
     */
    public void unsetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUS$14, 0);
        }
    }
    
    /**
     * Gets the "tipoGerente" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.TipoGerente.Enum getTipoGerente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOGERENTE$16, 0);
            if (target == null)
            {
                return null;
            }
            return (br.com.correios.bsb.sigep.master.bean.cliente.TipoGerente.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "tipoGerente" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.TipoGerente xgetTipoGerente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.TipoGerente target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.TipoGerente)get_store().find_element_user(TIPOGERENTE$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "tipoGerente" element
     */
    public boolean isSetTipoGerente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIPOGERENTE$16) != 0;
        }
    }
    
    /**
     * Sets the "tipoGerente" element
     */
    public void setTipoGerente(br.com.correios.bsb.sigep.master.bean.cliente.TipoGerente.Enum tipoGerente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOGERENTE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPOGERENTE$16);
            }
            target.setEnumValue(tipoGerente);
        }
    }
    
    /**
     * Sets (as xml) the "tipoGerente" element
     */
    public void xsetTipoGerente(br.com.correios.bsb.sigep.master.bean.cliente.TipoGerente tipoGerente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.TipoGerente target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.TipoGerente)get_store().find_element_user(TIPOGERENTE$16, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.TipoGerente)get_store().add_element_user(TIPOGERENTE$16);
            }
            target.set(tipoGerente);
        }
    }
    
    /**
     * Unsets the "tipoGerente" element
     */
    public void unsetTipoGerente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIPOGERENTE$16, 0);
        }
    }
    
    /**
     * Gets array of all "usuariosInstalacao" elements
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao[] getUsuariosInstalacaoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(USUARIOSINSTALACAO$18, targetList);
            br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao[] result = new br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "usuariosInstalacao" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao getUsuariosInstalacaoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao)get_store().find_element_user(USUARIOSINSTALACAO$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "usuariosInstalacao" element
     */
    public boolean isNilUsuariosInstalacaoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao)get_store().find_element_user(USUARIOSINSTALACAO$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "usuariosInstalacao" element
     */
    public int sizeOfUsuariosInstalacaoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USUARIOSINSTALACAO$18);
        }
    }
    
    /**
     * Sets array of all "usuariosInstalacao" element
     */
    public void setUsuariosInstalacaoArray(br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao[] usuariosInstalacaoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(usuariosInstalacaoArray, USUARIOSINSTALACAO$18);
        }
    }
    
    /**
     * Sets ith "usuariosInstalacao" element
     */
    public void setUsuariosInstalacaoArray(int i, br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao usuariosInstalacao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao)get_store().find_element_user(USUARIOSINSTALACAO$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(usuariosInstalacao);
        }
    }
    
    /**
     * Nils the ith "usuariosInstalacao" element
     */
    public void setNilUsuariosInstalacaoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao)get_store().find_element_user(USUARIOSINSTALACAO$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "usuariosInstalacao" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao insertNewUsuariosInstalacao(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao)get_store().insert_element_user(USUARIOSINSTALACAO$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "usuariosInstalacao" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao addNewUsuariosInstalacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao)get_store().add_element_user(USUARIOSINSTALACAO$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "usuariosInstalacao" element
     */
    public void removeUsuariosInstalacao(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USUARIOSINSTALACAO$18, i);
        }
    }
    
    /**
     * Gets the "validade" element
     */
    public java.lang.String getValidade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALIDADE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "validade" element
     */
    public org.apache.xmlbeans.XmlString xgetValidade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALIDADE$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "validade" element
     */
    public boolean isSetValidade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALIDADE$20) != 0;
        }
    }
    
    /**
     * Sets the "validade" element
     */
    public void setValidade(java.lang.String validade)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALIDADE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALIDADE$20);
            }
            target.setStringValue(validade);
        }
    }
    
    /**
     * Sets (as xml) the "validade" element
     */
    public void xsetValidade(org.apache.xmlbeans.XmlString validade)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALIDADE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VALIDADE$20);
            }
            target.set(validade);
        }
    }
    
    /**
     * Unsets the "validade" element
     */
    public void unsetValidade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALIDADE$20, 0);
        }
    }
}
