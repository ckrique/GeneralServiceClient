/*
 * XML Type:  servicoERP
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML servicoERP(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class ServicoERPImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP
{
    
    public ServicoERPImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODIGO$0 = 
        new javax.xml.namespace.QName("", "codigo");
    private static final javax.xml.namespace.QName DATAATUALIZACAO$2 = 
        new javax.xml.namespace.QName("", "dataAtualizacao");
    private static final javax.xml.namespace.QName DATAJATUALIZACAO$4 = 
        new javax.xml.namespace.QName("", "datajAtualizacao");
    private static final javax.xml.namespace.QName DESCRICAO$6 = 
        new javax.xml.namespace.QName("", "descricao");
    private static final javax.xml.namespace.QName HORAJATUALIZACAO$8 = 
        new javax.xml.namespace.QName("", "horajAtualizacao");
    private static final javax.xml.namespace.QName ID$10 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName SERVICOSIGEP$12 = 
        new javax.xml.namespace.QName("", "servicoSigep");
    private static final javax.xml.namespace.QName SERVICOSADICIONAIS$14 = 
        new javax.xml.namespace.QName("", "servicosAdicionais");
    private static final javax.xml.namespace.QName TIPO1CODIGO$16 = 
        new javax.xml.namespace.QName("", "tipo1Codigo");
    private static final javax.xml.namespace.QName TIPO1DESCRICAO$18 = 
        new javax.xml.namespace.QName("", "tipo1Descricao");
    private static final javax.xml.namespace.QName TIPO2CODIGO$20 = 
        new javax.xml.namespace.QName("", "tipo2Codigo");
    private static final javax.xml.namespace.QName TIPO2DESCRICAO$22 = 
        new javax.xml.namespace.QName("", "tipo2Descricao");
    private static final javax.xml.namespace.QName VIGENCIA$24 = 
        new javax.xml.namespace.QName("", "vigencia");
    
    
    /**
     * Gets the "codigo" element
     */
    public java.lang.String getCodigo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codigo" element
     */
    public org.apache.xmlbeans.XmlString xgetCodigo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "codigo" element
     */
    public boolean isSetCodigo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODIGO$0) != 0;
        }
    }
    
    /**
     * Sets the "codigo" element
     */
    public void setCodigo(java.lang.String codigo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODIGO$0);
            }
            target.setStringValue(codigo);
        }
    }
    
    /**
     * Sets (as xml) the "codigo" element
     */
    public void xsetCodigo(org.apache.xmlbeans.XmlString codigo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODIGO$0);
            }
            target.set(codigo);
        }
    }
    
    /**
     * Unsets the "codigo" element
     */
    public void unsetCodigo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODIGO$0, 0);
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
     * Gets the "datajAtualizacao" element
     */
    public int getDatajAtualizacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAJATUALIZACAO$4, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DATAJATUALIZACAO$4, 0);
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
            return get_store().count_elements(DATAJATUALIZACAO$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAJATUALIZACAO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAJATUALIZACAO$4);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DATAJATUALIZACAO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DATAJATUALIZACAO$4);
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
            get_store().remove_element(DATAJATUALIZACAO$4, 0);
        }
    }
    
    /**
     * Gets the "descricao" element
     */
    public java.lang.String getDescricao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRICAO$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "descricao" element
     */
    public org.apache.xmlbeans.XmlString xgetDescricao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRICAO$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "descricao" element
     */
    public boolean isSetDescricao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRICAO$6) != 0;
        }
    }
    
    /**
     * Sets the "descricao" element
     */
    public void setDescricao(java.lang.String descricao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRICAO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRICAO$6);
            }
            target.setStringValue(descricao);
        }
    }
    
    /**
     * Sets (as xml) the "descricao" element
     */
    public void xsetDescricao(org.apache.xmlbeans.XmlString descricao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRICAO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRICAO$6);
            }
            target.set(descricao);
        }
    }
    
    /**
     * Unsets the "descricao" element
     */
    public void unsetDescricao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRICAO$6, 0);
        }
    }
    
    /**
     * Gets the "horajAtualizacao" element
     */
    public int getHorajAtualizacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HORAJATUALIZACAO$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "horajAtualizacao" element
     */
    public org.apache.xmlbeans.XmlInt xgetHorajAtualizacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HORAJATUALIZACAO$8, 0);
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
            return get_store().count_elements(HORAJATUALIZACAO$8) != 0;
        }
    }
    
    /**
     * Sets the "horajAtualizacao" element
     */
    public void setHorajAtualizacao(int horajAtualizacao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HORAJATUALIZACAO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HORAJATUALIZACAO$8);
            }
            target.setIntValue(horajAtualizacao);
        }
    }
    
    /**
     * Sets (as xml) the "horajAtualizacao" element
     */
    public void xsetHorajAtualizacao(org.apache.xmlbeans.XmlInt horajAtualizacao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HORAJATUALIZACAO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(HORAJATUALIZACAO$8);
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
            get_store().remove_element(HORAJATUALIZACAO$8, 0);
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
     * Gets the "servicoSigep" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep getServicoSigep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep)get_store().find_element_user(SERVICOSIGEP$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "servicoSigep" element
     */
    public boolean isSetServicoSigep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICOSIGEP$12) != 0;
        }
    }
    
    /**
     * Sets the "servicoSigep" element
     */
    public void setServicoSigep(br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep servicoSigep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep)get_store().find_element_user(SERVICOSIGEP$12, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep)get_store().add_element_user(SERVICOSIGEP$12);
            }
            target.set(servicoSigep);
        }
    }
    
    /**
     * Appends and returns a new empty "servicoSigep" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep addNewServicoSigep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep)get_store().add_element_user(SERVICOSIGEP$12);
            return target;
        }
    }
    
    /**
     * Unsets the "servicoSigep" element
     */
    public void unsetServicoSigep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICOSIGEP$12, 0);
        }
    }
    
    /**
     * Gets array of all "servicosAdicionais" elements
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalERP[] getServicosAdicionaisArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SERVICOSADICIONAIS$14, targetList);
            br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalERP[] result = new br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalERP[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "servicosAdicionais" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalERP getServicosAdicionaisArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalERP)get_store().find_element_user(SERVICOSADICIONAIS$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "servicosAdicionais" element
     */
    public boolean isNilServicosAdicionaisArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalERP)get_store().find_element_user(SERVICOSADICIONAIS$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
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
            return get_store().count_elements(SERVICOSADICIONAIS$14);
        }
    }
    
    /**
     * Sets array of all "servicosAdicionais" element
     */
    public void setServicosAdicionaisArray(br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalERP[] servicosAdicionaisArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(servicosAdicionaisArray, SERVICOSADICIONAIS$14);
        }
    }
    
    /**
     * Sets ith "servicosAdicionais" element
     */
    public void setServicosAdicionaisArray(int i, br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalERP servicosAdicionais)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalERP)get_store().find_element_user(SERVICOSADICIONAIS$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(servicosAdicionais);
        }
    }
    
    /**
     * Nils the ith "servicosAdicionais" element
     */
    public void setNilServicosAdicionaisArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalERP)get_store().find_element_user(SERVICOSADICIONAIS$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "servicosAdicionais" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalERP insertNewServicosAdicionais(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalERP)get_store().insert_element_user(SERVICOSADICIONAIS$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "servicosAdicionais" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalERP addNewServicosAdicionais()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalERP)get_store().add_element_user(SERVICOSADICIONAIS$14);
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
            get_store().remove_element(SERVICOSADICIONAIS$14, i);
        }
    }
    
    /**
     * Gets the "tipo1Codigo" element
     */
    public java.lang.String getTipo1Codigo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPO1CODIGO$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tipo1Codigo" element
     */
    public org.apache.xmlbeans.XmlString xgetTipo1Codigo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPO1CODIGO$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "tipo1Codigo" element
     */
    public boolean isSetTipo1Codigo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIPO1CODIGO$16) != 0;
        }
    }
    
    /**
     * Sets the "tipo1Codigo" element
     */
    public void setTipo1Codigo(java.lang.String tipo1Codigo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPO1CODIGO$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPO1CODIGO$16);
            }
            target.setStringValue(tipo1Codigo);
        }
    }
    
    /**
     * Sets (as xml) the "tipo1Codigo" element
     */
    public void xsetTipo1Codigo(org.apache.xmlbeans.XmlString tipo1Codigo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPO1CODIGO$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIPO1CODIGO$16);
            }
            target.set(tipo1Codigo);
        }
    }
    
    /**
     * Unsets the "tipo1Codigo" element
     */
    public void unsetTipo1Codigo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIPO1CODIGO$16, 0);
        }
    }
    
    /**
     * Gets the "tipo1Descricao" element
     */
    public java.lang.String getTipo1Descricao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPO1DESCRICAO$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tipo1Descricao" element
     */
    public org.apache.xmlbeans.XmlString xgetTipo1Descricao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPO1DESCRICAO$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "tipo1Descricao" element
     */
    public boolean isSetTipo1Descricao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIPO1DESCRICAO$18) != 0;
        }
    }
    
    /**
     * Sets the "tipo1Descricao" element
     */
    public void setTipo1Descricao(java.lang.String tipo1Descricao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPO1DESCRICAO$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPO1DESCRICAO$18);
            }
            target.setStringValue(tipo1Descricao);
        }
    }
    
    /**
     * Sets (as xml) the "tipo1Descricao" element
     */
    public void xsetTipo1Descricao(org.apache.xmlbeans.XmlString tipo1Descricao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPO1DESCRICAO$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIPO1DESCRICAO$18);
            }
            target.set(tipo1Descricao);
        }
    }
    
    /**
     * Unsets the "tipo1Descricao" element
     */
    public void unsetTipo1Descricao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIPO1DESCRICAO$18, 0);
        }
    }
    
    /**
     * Gets the "tipo2Codigo" element
     */
    public java.lang.String getTipo2Codigo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPO2CODIGO$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tipo2Codigo" element
     */
    public org.apache.xmlbeans.XmlString xgetTipo2Codigo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPO2CODIGO$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "tipo2Codigo" element
     */
    public boolean isSetTipo2Codigo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIPO2CODIGO$20) != 0;
        }
    }
    
    /**
     * Sets the "tipo2Codigo" element
     */
    public void setTipo2Codigo(java.lang.String tipo2Codigo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPO2CODIGO$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPO2CODIGO$20);
            }
            target.setStringValue(tipo2Codigo);
        }
    }
    
    /**
     * Sets (as xml) the "tipo2Codigo" element
     */
    public void xsetTipo2Codigo(org.apache.xmlbeans.XmlString tipo2Codigo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPO2CODIGO$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIPO2CODIGO$20);
            }
            target.set(tipo2Codigo);
        }
    }
    
    /**
     * Unsets the "tipo2Codigo" element
     */
    public void unsetTipo2Codigo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIPO2CODIGO$20, 0);
        }
    }
    
    /**
     * Gets the "tipo2Descricao" element
     */
    public java.lang.String getTipo2Descricao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPO2DESCRICAO$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tipo2Descricao" element
     */
    public org.apache.xmlbeans.XmlString xgetTipo2Descricao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPO2DESCRICAO$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "tipo2Descricao" element
     */
    public boolean isSetTipo2Descricao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIPO2DESCRICAO$22) != 0;
        }
    }
    
    /**
     * Sets the "tipo2Descricao" element
     */
    public void setTipo2Descricao(java.lang.String tipo2Descricao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPO2DESCRICAO$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPO2DESCRICAO$22);
            }
            target.setStringValue(tipo2Descricao);
        }
    }
    
    /**
     * Sets (as xml) the "tipo2Descricao" element
     */
    public void xsetTipo2Descricao(org.apache.xmlbeans.XmlString tipo2Descricao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPO2DESCRICAO$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIPO2DESCRICAO$22);
            }
            target.set(tipo2Descricao);
        }
    }
    
    /**
     * Unsets the "tipo2Descricao" element
     */
    public void unsetTipo2Descricao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIPO2DESCRICAO$22, 0);
        }
    }
    
    /**
     * Gets the "vigencia" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.VigenciaERP getVigencia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.VigenciaERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.VigenciaERP)get_store().find_element_user(VIGENCIA$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "vigencia" element
     */
    public boolean isSetVigencia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VIGENCIA$24) != 0;
        }
    }
    
    /**
     * Sets the "vigencia" element
     */
    public void setVigencia(br.com.correios.bsb.sigep.master.bean.cliente.VigenciaERP vigencia)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.VigenciaERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.VigenciaERP)get_store().find_element_user(VIGENCIA$24, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.VigenciaERP)get_store().add_element_user(VIGENCIA$24);
            }
            target.set(vigencia);
        }
    }
    
    /**
     * Appends and returns a new empty "vigencia" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.VigenciaERP addNewVigencia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.VigenciaERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.VigenciaERP)get_store().add_element_user(VIGENCIA$24);
            return target;
        }
    }
    
    /**
     * Unsets the "vigencia" element
     */
    public void unsetVigencia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VIGENCIA$24, 0);
        }
    }
}
