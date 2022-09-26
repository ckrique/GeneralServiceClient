/*
 * XML Type:  clienteERP
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML clienteERP(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class ClienteERPImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP
{
    
    public ClienteERPImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CNPJ$0 = 
        new javax.xml.namespace.QName("", "cnpj");
    private static final javax.xml.namespace.QName CONTRATOS$2 = 
        new javax.xml.namespace.QName("", "contratos");
    private static final javax.xml.namespace.QName DATAATUALIZACAO$4 = 
        new javax.xml.namespace.QName("", "dataAtualizacao");
    private static final javax.xml.namespace.QName DATAJATUALIZACAO$6 = 
        new javax.xml.namespace.QName("", "datajAtualizacao");
    private static final javax.xml.namespace.QName DESCRICAOSTATUSCLIENTE$8 = 
        new javax.xml.namespace.QName("", "descricaoStatusCliente");
    private static final javax.xml.namespace.QName GERENTECONTA$10 = 
        new javax.xml.namespace.QName("", "gerenteConta");
    private static final javax.xml.namespace.QName HORAJATUALIZACAO$12 = 
        new javax.xml.namespace.QName("", "horajAtualizacao");
    private static final javax.xml.namespace.QName ID$14 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName INSCRICAOESTADUAL$16 = 
        new javax.xml.namespace.QName("", "inscricaoEstadual");
    private static final javax.xml.namespace.QName NOME$18 = 
        new javax.xml.namespace.QName("", "nome");
    private static final javax.xml.namespace.QName STATUSCODIGO$20 = 
        new javax.xml.namespace.QName("", "statusCodigo");
    
    
    /**
     * Gets the "cnpj" element
     */
    public java.lang.String getCnpj()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CNPJ$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cnpj" element
     */
    public org.apache.xmlbeans.XmlString xgetCnpj()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CNPJ$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "cnpj" element
     */
    public boolean isSetCnpj()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CNPJ$0) != 0;
        }
    }
    
    /**
     * Sets the "cnpj" element
     */
    public void setCnpj(java.lang.String cnpj)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CNPJ$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CNPJ$0);
            }
            target.setStringValue(cnpj);
        }
    }
    
    /**
     * Sets (as xml) the "cnpj" element
     */
    public void xsetCnpj(org.apache.xmlbeans.XmlString cnpj)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CNPJ$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CNPJ$0);
            }
            target.set(cnpj);
        }
    }
    
    /**
     * Unsets the "cnpj" element
     */
    public void unsetCnpj()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CNPJ$0, 0);
        }
    }
    
    /**
     * Gets array of all "contratos" elements
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP[] getContratosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTRATOS$2, targetList);
            br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP[] result = new br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "contratos" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP getContratosArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP)get_store().find_element_user(CONTRATOS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "contratos" element
     */
    public boolean isNilContratosArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP)get_store().find_element_user(CONTRATOS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "contratos" element
     */
    public int sizeOfContratosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTRATOS$2);
        }
    }
    
    /**
     * Sets array of all "contratos" element
     */
    public void setContratosArray(br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP[] contratosArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(contratosArray, CONTRATOS$2);
        }
    }
    
    /**
     * Sets ith "contratos" element
     */
    public void setContratosArray(int i, br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP contratos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP)get_store().find_element_user(CONTRATOS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(contratos);
        }
    }
    
    /**
     * Nils the ith "contratos" element
     */
    public void setNilContratosArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP)get_store().find_element_user(CONTRATOS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "contratos" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP insertNewContratos(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP)get_store().insert_element_user(CONTRATOS$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "contratos" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP addNewContratos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP)get_store().add_element_user(CONTRATOS$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "contratos" element
     */
    public void removeContratos(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTRATOS$2, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAATUALIZACAO$4, 0);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAATUALIZACAO$4, 0);
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
            return get_store().count_elements(DATAATUALIZACAO$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAATUALIZACAO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAATUALIZACAO$4);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAATUALIZACAO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATAATUALIZACAO$4);
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
            get_store().remove_element(DATAATUALIZACAO$4, 0);
        }
    }
    
    /**
     * Gets the "datajAtualizacao" element
     */
    public int getDatajAtualizacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAJATUALIZACAO$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "datajAtualizacao" element
     */
    public org.apache.xmlbeans.XmlInt xgetDatajAtualizacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DATAJATUALIZACAO$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "datajAtualizacao" element
     */
    public boolean isSetDatajAtualizacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAJATUALIZACAO$6) != 0;
        }
    }
    
    /**
     * Sets the "datajAtualizacao" element
     */
    public void setDatajAtualizacao(int datajAtualizacao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAJATUALIZACAO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAJATUALIZACAO$6);
            }
            target.setIntValue(datajAtualizacao);
        }
    }
    
    /**
     * Sets (as xml) the "datajAtualizacao" element
     */
    public void xsetDatajAtualizacao(org.apache.xmlbeans.XmlInt datajAtualizacao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DATAJATUALIZACAO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DATAJATUALIZACAO$6);
            }
            target.set(datajAtualizacao);
        }
    }
    
    /**
     * Unsets the "datajAtualizacao" element
     */
    public void unsetDatajAtualizacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAJATUALIZACAO$6, 0);
        }
    }
    
    /**
     * Gets the "descricaoStatusCliente" element
     */
    public java.lang.String getDescricaoStatusCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRICAOSTATUSCLIENTE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "descricaoStatusCliente" element
     */
    public org.apache.xmlbeans.XmlString xgetDescricaoStatusCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRICAOSTATUSCLIENTE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "descricaoStatusCliente" element
     */
    public boolean isSetDescricaoStatusCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRICAOSTATUSCLIENTE$8) != 0;
        }
    }
    
    /**
     * Sets the "descricaoStatusCliente" element
     */
    public void setDescricaoStatusCliente(java.lang.String descricaoStatusCliente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRICAOSTATUSCLIENTE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRICAOSTATUSCLIENTE$8);
            }
            target.setStringValue(descricaoStatusCliente);
        }
    }
    
    /**
     * Sets (as xml) the "descricaoStatusCliente" element
     */
    public void xsetDescricaoStatusCliente(org.apache.xmlbeans.XmlString descricaoStatusCliente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRICAOSTATUSCLIENTE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRICAOSTATUSCLIENTE$8);
            }
            target.set(descricaoStatusCliente);
        }
    }
    
    /**
     * Unsets the "descricaoStatusCliente" element
     */
    public void unsetDescricaoStatusCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRICAOSTATUSCLIENTE$8, 0);
        }
    }
    
    /**
     * Gets array of all "gerenteConta" elements
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta[] getGerenteContaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GERENTECONTA$10, targetList);
            br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta[] result = new br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "gerenteConta" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta getGerenteContaArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta)get_store().find_element_user(GERENTECONTA$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "gerenteConta" element
     */
    public boolean isNilGerenteContaArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta)get_store().find_element_user(GERENTECONTA$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "gerenteConta" element
     */
    public int sizeOfGerenteContaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GERENTECONTA$10);
        }
    }
    
    /**
     * Sets array of all "gerenteConta" element
     */
    public void setGerenteContaArray(br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta[] gerenteContaArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(gerenteContaArray, GERENTECONTA$10);
        }
    }
    
    /**
     * Sets ith "gerenteConta" element
     */
    public void setGerenteContaArray(int i, br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta gerenteConta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta)get_store().find_element_user(GERENTECONTA$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(gerenteConta);
        }
    }
    
    /**
     * Nils the ith "gerenteConta" element
     */
    public void setNilGerenteContaArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta)get_store().find_element_user(GERENTECONTA$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "gerenteConta" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta insertNewGerenteConta(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta)get_store().insert_element_user(GERENTECONTA$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "gerenteConta" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta addNewGerenteConta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta)get_store().add_element_user(GERENTECONTA$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "gerenteConta" element
     */
    public void removeGerenteConta(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GERENTECONTA$10, i);
        }
    }
    
    /**
     * Gets the "horajAtualizacao" element
     */
    public long getHorajAtualizacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HORAJATUALIZACAO$12, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "horajAtualizacao" element
     */
    public org.apache.xmlbeans.XmlLong xgetHorajAtualizacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(HORAJATUALIZACAO$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "horajAtualizacao" element
     */
    public boolean isSetHorajAtualizacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HORAJATUALIZACAO$12) != 0;
        }
    }
    
    /**
     * Sets the "horajAtualizacao" element
     */
    public void setHorajAtualizacao(long horajAtualizacao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HORAJATUALIZACAO$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HORAJATUALIZACAO$12);
            }
            target.setLongValue(horajAtualizacao);
        }
    }
    
    /**
     * Sets (as xml) the "horajAtualizacao" element
     */
    public void xsetHorajAtualizacao(org.apache.xmlbeans.XmlLong horajAtualizacao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(HORAJATUALIZACAO$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(HORAJATUALIZACAO$12);
            }
            target.set(horajAtualizacao);
        }
    }
    
    /**
     * Unsets the "horajAtualizacao" element
     */
    public void unsetHorajAtualizacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HORAJATUALIZACAO$12, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$14, 0);
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
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(ID$14, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$14);
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
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(ID$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(ID$14);
            }
            target.set(id);
        }
    }
    
    /**
     * Gets the "inscricaoEstadual" element
     */
    public java.lang.String getInscricaoEstadual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSCRICAOESTADUAL$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "inscricaoEstadual" element
     */
    public org.apache.xmlbeans.XmlString xgetInscricaoEstadual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INSCRICAOESTADUAL$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "inscricaoEstadual" element
     */
    public boolean isSetInscricaoEstadual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INSCRICAOESTADUAL$16) != 0;
        }
    }
    
    /**
     * Sets the "inscricaoEstadual" element
     */
    public void setInscricaoEstadual(java.lang.String inscricaoEstadual)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSCRICAOESTADUAL$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INSCRICAOESTADUAL$16);
            }
            target.setStringValue(inscricaoEstadual);
        }
    }
    
    /**
     * Sets (as xml) the "inscricaoEstadual" element
     */
    public void xsetInscricaoEstadual(org.apache.xmlbeans.XmlString inscricaoEstadual)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INSCRICAOESTADUAL$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INSCRICAOESTADUAL$16);
            }
            target.set(inscricaoEstadual);
        }
    }
    
    /**
     * Unsets the "inscricaoEstadual" element
     */
    public void unsetInscricaoEstadual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INSCRICAOESTADUAL$16, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOME$18, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOME$18, 0);
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
            return get_store().count_elements(NOME$18) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOME$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOME$18);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOME$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOME$18);
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
            get_store().remove_element(NOME$18, 0);
        }
    }
    
    /**
     * Gets the "statusCodigo" element
     */
    public java.lang.String getStatusCodigo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSCODIGO$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "statusCodigo" element
     */
    public org.apache.xmlbeans.XmlString xgetStatusCodigo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSCODIGO$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "statusCodigo" element
     */
    public boolean isSetStatusCodigo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUSCODIGO$20) != 0;
        }
    }
    
    /**
     * Sets the "statusCodigo" element
     */
    public void setStatusCodigo(java.lang.String statusCodigo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSCODIGO$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUSCODIGO$20);
            }
            target.setStringValue(statusCodigo);
        }
    }
    
    /**
     * Sets (as xml) the "statusCodigo" element
     */
    public void xsetStatusCodigo(org.apache.xmlbeans.XmlString statusCodigo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSCODIGO$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUSCODIGO$20);
            }
            target.set(statusCodigo);
        }
    }
    
    /**
     * Unsets the "statusCodigo" element
     */
    public void unsetStatusCodigo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUSCODIGO$20, 0);
        }
    }
}
