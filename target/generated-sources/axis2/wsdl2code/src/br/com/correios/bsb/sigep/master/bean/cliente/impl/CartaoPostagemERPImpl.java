/*
 * XML Type:  cartaoPostagemERP
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML cartaoPostagemERP(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class CartaoPostagemERPImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP
{
    
    public CartaoPostagemERPImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODIGOADMINISTRATIVO$0 = 
        new javax.xml.namespace.QName("", "codigoAdministrativo");
    private static final javax.xml.namespace.QName CONTRATOS$2 = 
        new javax.xml.namespace.QName("", "contratos");
    private static final javax.xml.namespace.QName DATAATUALIZACAO$4 = 
        new javax.xml.namespace.QName("", "dataAtualizacao");
    private static final javax.xml.namespace.QName DATAVIGENCIAFIM$6 = 
        new javax.xml.namespace.QName("", "dataVigenciaFim");
    private static final javax.xml.namespace.QName DATAVIGENCIAINICIO$8 = 
        new javax.xml.namespace.QName("", "dataVigenciaInicio");
    private static final javax.xml.namespace.QName DATAJATUALIZACAO$10 = 
        new javax.xml.namespace.QName("", "datajAtualizacao");
    private static final javax.xml.namespace.QName DATAJVIGENCIAFIM$12 = 
        new javax.xml.namespace.QName("", "datajVigenciaFim");
    private static final javax.xml.namespace.QName DATAJVIGENCIAINICIO$14 = 
        new javax.xml.namespace.QName("", "datajVigenciaInicio");
    private static final javax.xml.namespace.QName DESCRICAOSTATUSCARTAO$16 = 
        new javax.xml.namespace.QName("", "descricaoStatusCartao");
    private static final javax.xml.namespace.QName DESCRICAOUNIDADEPOSTAGEMGENERICA$18 = 
        new javax.xml.namespace.QName("", "descricaoUnidadePostagemGenerica");
    private static final javax.xml.namespace.QName HORAJATUALIZACAO$20 = 
        new javax.xml.namespace.QName("", "horajAtualizacao");
    private static final javax.xml.namespace.QName NUMERO$22 = 
        new javax.xml.namespace.QName("", "numero");
    private static final javax.xml.namespace.QName SERVICOS$24 = 
        new javax.xml.namespace.QName("", "servicos");
    private static final javax.xml.namespace.QName STATUSCARTAOPOSTAGEM$26 = 
        new javax.xml.namespace.QName("", "statusCartaoPostagem");
    private static final javax.xml.namespace.QName STATUSCODIGO$28 = 
        new javax.xml.namespace.QName("", "statusCodigo");
    private static final javax.xml.namespace.QName UNIDADEGENERICA$30 = 
        new javax.xml.namespace.QName("", "unidadeGenerica");
    private static final javax.xml.namespace.QName UNIDADESPOSTAGEM$32 = 
        new javax.xml.namespace.QName("", "unidadesPostagem");
    
    
    /**
     * Gets the "codigoAdministrativo" element
     */
    public java.lang.String getCodigoAdministrativo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGOADMINISTRATIVO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codigoAdministrativo" element
     */
    public org.apache.xmlbeans.XmlString xgetCodigoAdministrativo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOADMINISTRATIVO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "codigoAdministrativo" element
     */
    public boolean isSetCodigoAdministrativo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODIGOADMINISTRATIVO$0) != 0;
        }
    }
    
    /**
     * Sets the "codigoAdministrativo" element
     */
    public void setCodigoAdministrativo(java.lang.String codigoAdministrativo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGOADMINISTRATIVO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODIGOADMINISTRATIVO$0);
            }
            target.setStringValue(codigoAdministrativo);
        }
    }
    
    /**
     * Sets (as xml) the "codigoAdministrativo" element
     */
    public void xsetCodigoAdministrativo(org.apache.xmlbeans.XmlString codigoAdministrativo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOADMINISTRATIVO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODIGOADMINISTRATIVO$0);
            }
            target.set(codigoAdministrativo);
        }
    }
    
    /**
     * Unsets the "codigoAdministrativo" element
     */
    public void unsetCodigoAdministrativo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODIGOADMINISTRATIVO$0, 0);
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
     * Gets the "dataVigenciaFim" element
     */
    public java.util.Calendar getDataVigenciaFim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAVIGENCIAFIM$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dataVigenciaFim" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDataVigenciaFim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAVIGENCIAFIM$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "dataVigenciaFim" element
     */
    public boolean isSetDataVigenciaFim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAVIGENCIAFIM$6) != 0;
        }
    }
    
    /**
     * Sets the "dataVigenciaFim" element
     */
    public void setDataVigenciaFim(java.util.Calendar dataVigenciaFim)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAVIGENCIAFIM$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAVIGENCIAFIM$6);
            }
            target.setCalendarValue(dataVigenciaFim);
        }
    }
    
    /**
     * Sets (as xml) the "dataVigenciaFim" element
     */
    public void xsetDataVigenciaFim(org.apache.xmlbeans.XmlDateTime dataVigenciaFim)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAVIGENCIAFIM$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATAVIGENCIAFIM$6);
            }
            target.set(dataVigenciaFim);
        }
    }
    
    /**
     * Unsets the "dataVigenciaFim" element
     */
    public void unsetDataVigenciaFim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAVIGENCIAFIM$6, 0);
        }
    }
    
    /**
     * Gets the "dataVigenciaInicio" element
     */
    public java.util.Calendar getDataVigenciaInicio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAVIGENCIAINICIO$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dataVigenciaInicio" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDataVigenciaInicio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAVIGENCIAINICIO$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "dataVigenciaInicio" element
     */
    public boolean isSetDataVigenciaInicio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAVIGENCIAINICIO$8) != 0;
        }
    }
    
    /**
     * Sets the "dataVigenciaInicio" element
     */
    public void setDataVigenciaInicio(java.util.Calendar dataVigenciaInicio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAVIGENCIAINICIO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAVIGENCIAINICIO$8);
            }
            target.setCalendarValue(dataVigenciaInicio);
        }
    }
    
    /**
     * Sets (as xml) the "dataVigenciaInicio" element
     */
    public void xsetDataVigenciaInicio(org.apache.xmlbeans.XmlDateTime dataVigenciaInicio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAVIGENCIAINICIO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATAVIGENCIAINICIO$8);
            }
            target.set(dataVigenciaInicio);
        }
    }
    
    /**
     * Unsets the "dataVigenciaInicio" element
     */
    public void unsetDataVigenciaInicio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAVIGENCIAINICIO$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAJATUALIZACAO$10, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DATAJATUALIZACAO$10, 0);
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
            return get_store().count_elements(DATAJATUALIZACAO$10) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAJATUALIZACAO$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAJATUALIZACAO$10);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DATAJATUALIZACAO$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DATAJATUALIZACAO$10);
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
            get_store().remove_element(DATAJATUALIZACAO$10, 0);
        }
    }
    
    /**
     * Gets the "datajVigenciaFim" element
     */
    public int getDatajVigenciaFim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAJVIGENCIAFIM$12, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "datajVigenciaFim" element
     */
    public org.apache.xmlbeans.XmlInt xgetDatajVigenciaFim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DATAJVIGENCIAFIM$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "datajVigenciaFim" element
     */
    public boolean isSetDatajVigenciaFim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAJVIGENCIAFIM$12) != 0;
        }
    }
    
    /**
     * Sets the "datajVigenciaFim" element
     */
    public void setDatajVigenciaFim(int datajVigenciaFim)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAJVIGENCIAFIM$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAJVIGENCIAFIM$12);
            }
            target.setIntValue(datajVigenciaFim);
        }
    }
    
    /**
     * Sets (as xml) the "datajVigenciaFim" element
     */
    public void xsetDatajVigenciaFim(org.apache.xmlbeans.XmlInt datajVigenciaFim)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DATAJVIGENCIAFIM$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DATAJVIGENCIAFIM$12);
            }
            target.set(datajVigenciaFim);
        }
    }
    
    /**
     * Unsets the "datajVigenciaFim" element
     */
    public void unsetDatajVigenciaFim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAJVIGENCIAFIM$12, 0);
        }
    }
    
    /**
     * Gets the "datajVigenciaInicio" element
     */
    public int getDatajVigenciaInicio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAJVIGENCIAINICIO$14, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "datajVigenciaInicio" element
     */
    public org.apache.xmlbeans.XmlInt xgetDatajVigenciaInicio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DATAJVIGENCIAINICIO$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "datajVigenciaInicio" element
     */
    public boolean isSetDatajVigenciaInicio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAJVIGENCIAINICIO$14) != 0;
        }
    }
    
    /**
     * Sets the "datajVigenciaInicio" element
     */
    public void setDatajVigenciaInicio(int datajVigenciaInicio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAJVIGENCIAINICIO$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAJVIGENCIAINICIO$14);
            }
            target.setIntValue(datajVigenciaInicio);
        }
    }
    
    /**
     * Sets (as xml) the "datajVigenciaInicio" element
     */
    public void xsetDatajVigenciaInicio(org.apache.xmlbeans.XmlInt datajVigenciaInicio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DATAJVIGENCIAINICIO$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DATAJVIGENCIAINICIO$14);
            }
            target.set(datajVigenciaInicio);
        }
    }
    
    /**
     * Unsets the "datajVigenciaInicio" element
     */
    public void unsetDatajVigenciaInicio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAJVIGENCIAINICIO$14, 0);
        }
    }
    
    /**
     * Gets the "descricaoStatusCartao" element
     */
    public java.lang.String getDescricaoStatusCartao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRICAOSTATUSCARTAO$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "descricaoStatusCartao" element
     */
    public org.apache.xmlbeans.XmlString xgetDescricaoStatusCartao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRICAOSTATUSCARTAO$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "descricaoStatusCartao" element
     */
    public boolean isSetDescricaoStatusCartao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRICAOSTATUSCARTAO$16) != 0;
        }
    }
    
    /**
     * Sets the "descricaoStatusCartao" element
     */
    public void setDescricaoStatusCartao(java.lang.String descricaoStatusCartao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRICAOSTATUSCARTAO$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRICAOSTATUSCARTAO$16);
            }
            target.setStringValue(descricaoStatusCartao);
        }
    }
    
    /**
     * Sets (as xml) the "descricaoStatusCartao" element
     */
    public void xsetDescricaoStatusCartao(org.apache.xmlbeans.XmlString descricaoStatusCartao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRICAOSTATUSCARTAO$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRICAOSTATUSCARTAO$16);
            }
            target.set(descricaoStatusCartao);
        }
    }
    
    /**
     * Unsets the "descricaoStatusCartao" element
     */
    public void unsetDescricaoStatusCartao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRICAOSTATUSCARTAO$16, 0);
        }
    }
    
    /**
     * Gets the "descricaoUnidadePostagemGenerica" element
     */
    public java.lang.String getDescricaoUnidadePostagemGenerica()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRICAOUNIDADEPOSTAGEMGENERICA$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "descricaoUnidadePostagemGenerica" element
     */
    public org.apache.xmlbeans.XmlString xgetDescricaoUnidadePostagemGenerica()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRICAOUNIDADEPOSTAGEMGENERICA$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "descricaoUnidadePostagemGenerica" element
     */
    public boolean isSetDescricaoUnidadePostagemGenerica()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRICAOUNIDADEPOSTAGEMGENERICA$18) != 0;
        }
    }
    
    /**
     * Sets the "descricaoUnidadePostagemGenerica" element
     */
    public void setDescricaoUnidadePostagemGenerica(java.lang.String descricaoUnidadePostagemGenerica)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRICAOUNIDADEPOSTAGEMGENERICA$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRICAOUNIDADEPOSTAGEMGENERICA$18);
            }
            target.setStringValue(descricaoUnidadePostagemGenerica);
        }
    }
    
    /**
     * Sets (as xml) the "descricaoUnidadePostagemGenerica" element
     */
    public void xsetDescricaoUnidadePostagemGenerica(org.apache.xmlbeans.XmlString descricaoUnidadePostagemGenerica)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRICAOUNIDADEPOSTAGEMGENERICA$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRICAOUNIDADEPOSTAGEMGENERICA$18);
            }
            target.set(descricaoUnidadePostagemGenerica);
        }
    }
    
    /**
     * Unsets the "descricaoUnidadePostagemGenerica" element
     */
    public void unsetDescricaoUnidadePostagemGenerica()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRICAOUNIDADEPOSTAGEMGENERICA$18, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HORAJATUALIZACAO$20, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HORAJATUALIZACAO$20, 0);
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
            return get_store().count_elements(HORAJATUALIZACAO$20) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HORAJATUALIZACAO$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HORAJATUALIZACAO$20);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HORAJATUALIZACAO$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(HORAJATUALIZACAO$20);
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
            get_store().remove_element(HORAJATUALIZACAO$20, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMERO$22, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMERO$22, 0);
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
            return get_store().count_elements(NUMERO$22) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMERO$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMERO$22);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMERO$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMERO$22);
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
            get_store().remove_element(NUMERO$22, 0);
        }
    }
    
    /**
     * Gets array of all "servicos" elements
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP[] getServicosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SERVICOS$24, targetList);
            br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP[] result = new br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "servicos" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP getServicosArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP)get_store().find_element_user(SERVICOS$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "servicos" element
     */
    public boolean isNilServicosArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP)get_store().find_element_user(SERVICOS$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "servicos" element
     */
    public int sizeOfServicosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICOS$24);
        }
    }
    
    /**
     * Sets array of all "servicos" element
     */
    public void setServicosArray(br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP[] servicosArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(servicosArray, SERVICOS$24);
        }
    }
    
    /**
     * Sets ith "servicos" element
     */
    public void setServicosArray(int i, br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP servicos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP)get_store().find_element_user(SERVICOS$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(servicos);
        }
    }
    
    /**
     * Nils the ith "servicos" element
     */
    public void setNilServicosArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP)get_store().find_element_user(SERVICOS$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "servicos" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP insertNewServicos(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP)get_store().insert_element_user(SERVICOS$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "servicos" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP addNewServicos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP)get_store().add_element_user(SERVICOS$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "servicos" element
     */
    public void removeServicos(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICOS$24, i);
        }
    }
    
    /**
     * Gets the "statusCartaoPostagem" element
     */
    public java.lang.String getStatusCartaoPostagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSCARTAOPOSTAGEM$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "statusCartaoPostagem" element
     */
    public org.apache.xmlbeans.XmlString xgetStatusCartaoPostagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSCARTAOPOSTAGEM$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "statusCartaoPostagem" element
     */
    public boolean isSetStatusCartaoPostagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUSCARTAOPOSTAGEM$26) != 0;
        }
    }
    
    /**
     * Sets the "statusCartaoPostagem" element
     */
    public void setStatusCartaoPostagem(java.lang.String statusCartaoPostagem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSCARTAOPOSTAGEM$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUSCARTAOPOSTAGEM$26);
            }
            target.setStringValue(statusCartaoPostagem);
        }
    }
    
    /**
     * Sets (as xml) the "statusCartaoPostagem" element
     */
    public void xsetStatusCartaoPostagem(org.apache.xmlbeans.XmlString statusCartaoPostagem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSCARTAOPOSTAGEM$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUSCARTAOPOSTAGEM$26);
            }
            target.set(statusCartaoPostagem);
        }
    }
    
    /**
     * Unsets the "statusCartaoPostagem" element
     */
    public void unsetStatusCartaoPostagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUSCARTAOPOSTAGEM$26, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSCODIGO$28, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSCODIGO$28, 0);
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
            return get_store().count_elements(STATUSCODIGO$28) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSCODIGO$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUSCODIGO$28);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSCODIGO$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUSCODIGO$28);
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
            get_store().remove_element(STATUSCODIGO$28, 0);
        }
    }
    
    /**
     * Gets the "unidadeGenerica" element
     */
    public java.lang.String getUnidadeGenerica()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIDADEGENERICA$30, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "unidadeGenerica" element
     */
    public org.apache.xmlbeans.XmlString xgetUnidadeGenerica()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UNIDADEGENERICA$30, 0);
            return target;
        }
    }
    
    /**
     * True if has "unidadeGenerica" element
     */
    public boolean isSetUnidadeGenerica()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNIDADEGENERICA$30) != 0;
        }
    }
    
    /**
     * Sets the "unidadeGenerica" element
     */
    public void setUnidadeGenerica(java.lang.String unidadeGenerica)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIDADEGENERICA$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNIDADEGENERICA$30);
            }
            target.setStringValue(unidadeGenerica);
        }
    }
    
    /**
     * Sets (as xml) the "unidadeGenerica" element
     */
    public void xsetUnidadeGenerica(org.apache.xmlbeans.XmlString unidadeGenerica)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UNIDADEGENERICA$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UNIDADEGENERICA$30);
            }
            target.set(unidadeGenerica);
        }
    }
    
    /**
     * Unsets the "unidadeGenerica" element
     */
    public void unsetUnidadeGenerica()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNIDADEGENERICA$30, 0);
        }
    }
    
    /**
     * Gets array of all "unidadesPostagem" elements
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP[] getUnidadesPostagemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(UNIDADESPOSTAGEM$32, targetList);
            br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP[] result = new br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "unidadesPostagem" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP getUnidadesPostagemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP)get_store().find_element_user(UNIDADESPOSTAGEM$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "unidadesPostagem" element
     */
    public boolean isNilUnidadesPostagemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP)get_store().find_element_user(UNIDADESPOSTAGEM$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "unidadesPostagem" element
     */
    public int sizeOfUnidadesPostagemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNIDADESPOSTAGEM$32);
        }
    }
    
    /**
     * Sets array of all "unidadesPostagem" element
     */
    public void setUnidadesPostagemArray(br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP[] unidadesPostagemArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(unidadesPostagemArray, UNIDADESPOSTAGEM$32);
        }
    }
    
    /**
     * Sets ith "unidadesPostagem" element
     */
    public void setUnidadesPostagemArray(int i, br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP unidadesPostagem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP)get_store().find_element_user(UNIDADESPOSTAGEM$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(unidadesPostagem);
        }
    }
    
    /**
     * Nils the ith "unidadesPostagem" element
     */
    public void setNilUnidadesPostagemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP)get_store().find_element_user(UNIDADESPOSTAGEM$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "unidadesPostagem" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP insertNewUnidadesPostagem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP)get_store().insert_element_user(UNIDADESPOSTAGEM$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "unidadesPostagem" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP addNewUnidadesPostagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP)get_store().add_element_user(UNIDADESPOSTAGEM$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "unidadesPostagem" element
     */
    public void removeUnidadesPostagem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNIDADESPOSTAGEM$32, i);
        }
    }
}
