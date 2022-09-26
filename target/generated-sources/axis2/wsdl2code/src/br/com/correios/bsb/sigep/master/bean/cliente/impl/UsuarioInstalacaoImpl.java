/*
 * XML Type:  usuarioInstalacao
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML usuarioInstalacao(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class UsuarioInstalacaoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao
{
    
    public UsuarioInstalacaoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAATUALIZACAO$0 = 
        new javax.xml.namespace.QName("", "dataAtualizacao");
    private static final javax.xml.namespace.QName DATAINCLUSAO$2 = 
        new javax.xml.namespace.QName("", "dataInclusao");
    private static final javax.xml.namespace.QName DATASENHA$4 = 
        new javax.xml.namespace.QName("", "dataSenha");
    private static final javax.xml.namespace.QName GERENTEMASTER$6 = 
        new javax.xml.namespace.QName("", "gerenteMaster");
    private static final javax.xml.namespace.QName HASHSENHA$8 = 
        new javax.xml.namespace.QName("", "hashSenha");
    private static final javax.xml.namespace.QName ID$10 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName LOGIN$12 = 
        new javax.xml.namespace.QName("", "login");
    private static final javax.xml.namespace.QName NOME$14 = 
        new javax.xml.namespace.QName("", "nome");
    private static final javax.xml.namespace.QName PARAMETROS$16 = 
        new javax.xml.namespace.QName("", "parametros");
    private static final javax.xml.namespace.QName SENHA$18 = 
        new javax.xml.namespace.QName("", "senha");
    private static final javax.xml.namespace.QName STATUS$20 = 
        new javax.xml.namespace.QName("", "status");
    private static final javax.xml.namespace.QName VALIDADE$22 = 
        new javax.xml.namespace.QName("", "validade");
    
    
    /**
     * Gets the "dataAtualizacao" element
     */
    public java.util.Calendar getDataAtualizacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAATUALIZACAO$0, 0);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAATUALIZACAO$0, 0);
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
            return get_store().count_elements(DATAATUALIZACAO$0) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAATUALIZACAO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAATUALIZACAO$0);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAATUALIZACAO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATAATUALIZACAO$0);
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
            get_store().remove_element(DATAATUALIZACAO$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAINCLUSAO$2, 0);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAINCLUSAO$2, 0);
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
            return get_store().count_elements(DATAINCLUSAO$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAINCLUSAO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAINCLUSAO$2);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAINCLUSAO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATAINCLUSAO$2);
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
            get_store().remove_element(DATAINCLUSAO$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATASENHA$4, 0);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATASENHA$4, 0);
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
            return get_store().count_elements(DATASENHA$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATASENHA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATASENHA$4);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATASENHA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATASENHA$4);
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
            get_store().remove_element(DATASENHA$4, 0);
        }
    }
    
    /**
     * Gets the "gerenteMaster" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta getGerenteMaster()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta)get_store().find_element_user(GERENTEMASTER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "gerenteMaster" element
     */
    public boolean isSetGerenteMaster()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GERENTEMASTER$6) != 0;
        }
    }
    
    /**
     * Sets the "gerenteMaster" element
     */
    public void setGerenteMaster(br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta gerenteMaster)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta)get_store().find_element_user(GERENTEMASTER$6, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta)get_store().add_element_user(GERENTEMASTER$6);
            }
            target.set(gerenteMaster);
        }
    }
    
    /**
     * Appends and returns a new empty "gerenteMaster" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta addNewGerenteMaster()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta)get_store().add_element_user(GERENTEMASTER$6);
            return target;
        }
    }
    
    /**
     * Unsets the "gerenteMaster" element
     */
    public void unsetGerenteMaster()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GERENTEMASTER$6, 0);
        }
    }
    
    /**
     * Gets the "hashSenha" element
     */
    public java.lang.String getHashSenha()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASHSENHA$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "hashSenha" element
     */
    public org.apache.xmlbeans.XmlString xgetHashSenha()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HASHSENHA$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "hashSenha" element
     */
    public boolean isSetHashSenha()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HASHSENHA$8) != 0;
        }
    }
    
    /**
     * Sets the "hashSenha" element
     */
    public void setHashSenha(java.lang.String hashSenha)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASHSENHA$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASHSENHA$8);
            }
            target.setStringValue(hashSenha);
        }
    }
    
    /**
     * Sets (as xml) the "hashSenha" element
     */
    public void xsetHashSenha(org.apache.xmlbeans.XmlString hashSenha)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HASHSENHA$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HASHSENHA$8);
            }
            target.set(hashSenha);
        }
    }
    
    /**
     * Unsets the "hashSenha" element
     */
    public void unsetHashSenha()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HASHSENHA$8, 0);
        }
    }
    
    /**
     * Gets the "id" element
     */
    public long getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$10, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" element
     */
    public org.apache.xmlbeans.XmlLong xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(ID$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "id" element
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ID$10) != 0;
        }
    }
    
    /**
     * Sets the "id" element
     */
    public void setId(long id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$10);
            }
            target.setLongValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" element
     */
    public void xsetId(org.apache.xmlbeans.XmlLong id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(ID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(ID$10);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" element
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ID$10, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGIN$12, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGIN$12, 0);
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
            return get_store().count_elements(LOGIN$12) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGIN$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOGIN$12);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGIN$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOGIN$12);
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
            get_store().remove_element(LOGIN$12, 0);
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
     * Gets array of all "parametros" elements
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ParametroMaster[] getParametrosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARAMETROS$16, targetList);
            br.com.correios.bsb.sigep.master.bean.cliente.ParametroMaster[] result = new br.com.correios.bsb.sigep.master.bean.cliente.ParametroMaster[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "parametros" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ParametroMaster getParametrosArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ParametroMaster target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ParametroMaster)get_store().find_element_user(PARAMETROS$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "parametros" element
     */
    public boolean isNilParametrosArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ParametroMaster target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ParametroMaster)get_store().find_element_user(PARAMETROS$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "parametros" element
     */
    public int sizeOfParametrosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARAMETROS$16);
        }
    }
    
    /**
     * Sets array of all "parametros" element
     */
    public void setParametrosArray(br.com.correios.bsb.sigep.master.bean.cliente.ParametroMaster[] parametrosArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(parametrosArray, PARAMETROS$16);
        }
    }
    
    /**
     * Sets ith "parametros" element
     */
    public void setParametrosArray(int i, br.com.correios.bsb.sigep.master.bean.cliente.ParametroMaster parametros)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ParametroMaster target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ParametroMaster)get_store().find_element_user(PARAMETROS$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(parametros);
        }
    }
    
    /**
     * Nils the ith "parametros" element
     */
    public void setNilParametrosArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ParametroMaster target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ParametroMaster)get_store().find_element_user(PARAMETROS$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "parametros" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ParametroMaster insertNewParametros(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ParametroMaster target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ParametroMaster)get_store().insert_element_user(PARAMETROS$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "parametros" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ParametroMaster addNewParametros()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ParametroMaster target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ParametroMaster)get_store().add_element_user(PARAMETROS$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "parametros" element
     */
    public void removeParametros(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARAMETROS$16, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENHA$18, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENHA$18, 0);
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
            return get_store().count_elements(SENHA$18) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENHA$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENHA$18);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENHA$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SENHA$18);
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
            get_store().remove_element(SENHA$18, 0);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.StatusUsuario.Enum getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$20, 0);
            if (target == null)
            {
                return null;
            }
            return (br.com.correios.bsb.sigep.master.bean.cliente.StatusUsuario.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "status" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.StatusUsuario xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.StatusUsuario target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.StatusUsuario)get_store().find_element_user(STATUS$20, 0);
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
            return get_store().count_elements(STATUS$20) != 0;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(br.com.correios.bsb.sigep.master.bean.cliente.StatusUsuario.Enum status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$20);
            }
            target.setEnumValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "status" element
     */
    public void xsetStatus(br.com.correios.bsb.sigep.master.bean.cliente.StatusUsuario status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.StatusUsuario target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.StatusUsuario)get_store().find_element_user(STATUS$20, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.StatusUsuario)get_store().add_element_user(STATUS$20);
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
            get_store().remove_element(STATUS$20, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALIDADE$22, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALIDADE$22, 0);
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
            return get_store().count_elements(VALIDADE$22) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALIDADE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALIDADE$22);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALIDADE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VALIDADE$22);
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
            get_store().remove_element(VALIDADE$22, 0);
        }
    }
}
