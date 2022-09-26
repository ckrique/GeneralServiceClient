/*
 * XML Type:  contratoERP
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML contratoERP(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class ContratoERPImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP
{
    
    public ContratoERPImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CARTOESPOSTAGEM$0 = 
        new javax.xml.namespace.QName("", "cartoesPostagem");
    private static final javax.xml.namespace.QName CLIENTE$2 = 
        new javax.xml.namespace.QName("", "cliente");
    private static final javax.xml.namespace.QName CODIGOCLIENTE$4 = 
        new javax.xml.namespace.QName("", "codigoCliente");
    private static final javax.xml.namespace.QName CODIGODIRETORIA$6 = 
        new javax.xml.namespace.QName("", "codigoDiretoria");
    private static final javax.xml.namespace.QName CONTRATOPK$8 = 
        new javax.xml.namespace.QName("", "contratoPK");
    private static final javax.xml.namespace.QName DATAATUALIZACAO$10 = 
        new javax.xml.namespace.QName("", "dataAtualizacao");
    private static final javax.xml.namespace.QName DATAATUALIZACAODDMMYYYY$12 = 
        new javax.xml.namespace.QName("", "dataAtualizacaoDDMMYYYY");
    private static final javax.xml.namespace.QName DATAVIGENCIAFIM$14 = 
        new javax.xml.namespace.QName("", "dataVigenciaFim");
    private static final javax.xml.namespace.QName DATAVIGENCIAFIMDDMMYYYY$16 = 
        new javax.xml.namespace.QName("", "dataVigenciaFimDDMMYYYY");
    private static final javax.xml.namespace.QName DATAVIGENCIAINICIO$18 = 
        new javax.xml.namespace.QName("", "dataVigenciaInicio");
    private static final javax.xml.namespace.QName DATAVIGENCIAINICIODDMMYYYY$20 = 
        new javax.xml.namespace.QName("", "dataVigenciaInicioDDMMYYYY");
    private static final javax.xml.namespace.QName DATAJATUALIZACAO$22 = 
        new javax.xml.namespace.QName("", "datajAtualizacao");
    private static final javax.xml.namespace.QName DATAJVIGENCIAFIM$24 = 
        new javax.xml.namespace.QName("", "datajVigenciaFim");
    private static final javax.xml.namespace.QName DATAJVIGENCIAINICIO$26 = 
        new javax.xml.namespace.QName("", "datajVigenciaInicio");
    private static final javax.xml.namespace.QName DESCRICAODIRETORIAREGIONAL$28 = 
        new javax.xml.namespace.QName("", "descricaoDiretoriaRegional");
    private static final javax.xml.namespace.QName DESCRICAOSTATUS$30 = 
        new javax.xml.namespace.QName("", "descricaoStatus");
    private static final javax.xml.namespace.QName DIRETORIAREGIONAL$32 = 
        new javax.xml.namespace.QName("", "diretoriaRegional");
    private static final javax.xml.namespace.QName HORAJATUALIZACAO$34 = 
        new javax.xml.namespace.QName("", "horajAtualizacao");
    private static final javax.xml.namespace.QName STATUSCODIGO$36 = 
        new javax.xml.namespace.QName("", "statusCodigo");
    
    
    /**
     * Gets array of all "cartoesPostagem" elements
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP[] getCartoesPostagemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CARTOESPOSTAGEM$0, targetList);
            br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP[] result = new br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "cartoesPostagem" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP getCartoesPostagemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP)get_store().find_element_user(CARTOESPOSTAGEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "cartoesPostagem" element
     */
    public boolean isNilCartoesPostagemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP)get_store().find_element_user(CARTOESPOSTAGEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "cartoesPostagem" element
     */
    public int sizeOfCartoesPostagemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CARTOESPOSTAGEM$0);
        }
    }
    
    /**
     * Sets array of all "cartoesPostagem" element
     */
    public void setCartoesPostagemArray(br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP[] cartoesPostagemArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(cartoesPostagemArray, CARTOESPOSTAGEM$0);
        }
    }
    
    /**
     * Sets ith "cartoesPostagem" element
     */
    public void setCartoesPostagemArray(int i, br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP cartoesPostagem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP)get_store().find_element_user(CARTOESPOSTAGEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cartoesPostagem);
        }
    }
    
    /**
     * Nils the ith "cartoesPostagem" element
     */
    public void setNilCartoesPostagemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP)get_store().find_element_user(CARTOESPOSTAGEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cartoesPostagem" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP insertNewCartoesPostagem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP)get_store().insert_element_user(CARTOESPOSTAGEM$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cartoesPostagem" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP addNewCartoesPostagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP)get_store().add_element_user(CARTOESPOSTAGEM$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "cartoesPostagem" element
     */
    public void removeCartoesPostagem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CARTOESPOSTAGEM$0, i);
        }
    }
    
    /**
     * Gets the "cliente" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP getCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP)get_store().find_element_user(CLIENTE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cliente" element
     */
    public boolean isSetCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLIENTE$2) != 0;
        }
    }
    
    /**
     * Sets the "cliente" element
     */
    public void setCliente(br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP cliente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP)get_store().find_element_user(CLIENTE$2, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP)get_store().add_element_user(CLIENTE$2);
            }
            target.set(cliente);
        }
    }
    
    /**
     * Appends and returns a new empty "cliente" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP addNewCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP)get_store().add_element_user(CLIENTE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "cliente" element
     */
    public void unsetCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLIENTE$2, 0);
        }
    }
    
    /**
     * Gets the "codigoCliente" element
     */
    public long getCodigoCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGOCLIENTE$4, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "codigoCliente" element
     */
    public org.apache.xmlbeans.XmlLong xgetCodigoCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CODIGOCLIENTE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "codigoCliente" element
     */
    public void setCodigoCliente(long codigoCliente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGOCLIENTE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODIGOCLIENTE$4);
            }
            target.setLongValue(codigoCliente);
        }
    }
    
    /**
     * Sets (as xml) the "codigoCliente" element
     */
    public void xsetCodigoCliente(org.apache.xmlbeans.XmlLong codigoCliente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CODIGOCLIENTE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(CODIGOCLIENTE$4);
            }
            target.set(codigoCliente);
        }
    }
    
    /**
     * Gets the "codigoDiretoria" element
     */
    public java.lang.String getCodigoDiretoria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGODIRETORIA$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codigoDiretoria" element
     */
    public org.apache.xmlbeans.XmlString xgetCodigoDiretoria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGODIRETORIA$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "codigoDiretoria" element
     */
    public boolean isSetCodigoDiretoria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODIGODIRETORIA$6) != 0;
        }
    }
    
    /**
     * Sets the "codigoDiretoria" element
     */
    public void setCodigoDiretoria(java.lang.String codigoDiretoria)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGODIRETORIA$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODIGODIRETORIA$6);
            }
            target.setStringValue(codigoDiretoria);
        }
    }
    
    /**
     * Sets (as xml) the "codigoDiretoria" element
     */
    public void xsetCodigoDiretoria(org.apache.xmlbeans.XmlString codigoDiretoria)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGODIRETORIA$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODIGODIRETORIA$6);
            }
            target.set(codigoDiretoria);
        }
    }
    
    /**
     * Unsets the "codigoDiretoria" element
     */
    public void unsetCodigoDiretoria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODIGODIRETORIA$6, 0);
        }
    }
    
    /**
     * Gets the "contratoPK" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ContratoERPPK getContratoPK()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ContratoERPPK target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ContratoERPPK)get_store().find_element_user(CONTRATOPK$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "contratoPK" element
     */
    public boolean isSetContratoPK()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTRATOPK$8) != 0;
        }
    }
    
    /**
     * Sets the "contratoPK" element
     */
    public void setContratoPK(br.com.correios.bsb.sigep.master.bean.cliente.ContratoERPPK contratoPK)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ContratoERPPK target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ContratoERPPK)get_store().find_element_user(CONTRATOPK$8, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.ContratoERPPK)get_store().add_element_user(CONTRATOPK$8);
            }
            target.set(contratoPK);
        }
    }
    
    /**
     * Appends and returns a new empty "contratoPK" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ContratoERPPK addNewContratoPK()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ContratoERPPK target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ContratoERPPK)get_store().add_element_user(CONTRATOPK$8);
            return target;
        }
    }
    
    /**
     * Unsets the "contratoPK" element
     */
    public void unsetContratoPK()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTRATOPK$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAATUALIZACAO$10, 0);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAATUALIZACAO$10, 0);
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
            return get_store().count_elements(DATAATUALIZACAO$10) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAATUALIZACAO$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAATUALIZACAO$10);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAATUALIZACAO$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATAATUALIZACAO$10);
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
            get_store().remove_element(DATAATUALIZACAO$10, 0);
        }
    }
    
    /**
     * Gets the "dataAtualizacaoDDMMYYYY" element
     */
    public java.lang.String getDataAtualizacaoDDMMYYYY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAATUALIZACAODDMMYYYY$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dataAtualizacaoDDMMYYYY" element
     */
    public org.apache.xmlbeans.XmlString xgetDataAtualizacaoDDMMYYYY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAATUALIZACAODDMMYYYY$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "dataAtualizacaoDDMMYYYY" element
     */
    public boolean isSetDataAtualizacaoDDMMYYYY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAATUALIZACAODDMMYYYY$12) != 0;
        }
    }
    
    /**
     * Sets the "dataAtualizacaoDDMMYYYY" element
     */
    public void setDataAtualizacaoDDMMYYYY(java.lang.String dataAtualizacaoDDMMYYYY)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAATUALIZACAODDMMYYYY$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAATUALIZACAODDMMYYYY$12);
            }
            target.setStringValue(dataAtualizacaoDDMMYYYY);
        }
    }
    
    /**
     * Sets (as xml) the "dataAtualizacaoDDMMYYYY" element
     */
    public void xsetDataAtualizacaoDDMMYYYY(org.apache.xmlbeans.XmlString dataAtualizacaoDDMMYYYY)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAATUALIZACAODDMMYYYY$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATAATUALIZACAODDMMYYYY$12);
            }
            target.set(dataAtualizacaoDDMMYYYY);
        }
    }
    
    /**
     * Unsets the "dataAtualizacaoDDMMYYYY" element
     */
    public void unsetDataAtualizacaoDDMMYYYY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAATUALIZACAODDMMYYYY$12, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAVIGENCIAFIM$14, 0);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAVIGENCIAFIM$14, 0);
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
            return get_store().count_elements(DATAVIGENCIAFIM$14) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAVIGENCIAFIM$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAVIGENCIAFIM$14);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAVIGENCIAFIM$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATAVIGENCIAFIM$14);
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
            get_store().remove_element(DATAVIGENCIAFIM$14, 0);
        }
    }
    
    /**
     * Gets the "dataVigenciaFimDDMMYYYY" element
     */
    public java.lang.String getDataVigenciaFimDDMMYYYY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAVIGENCIAFIMDDMMYYYY$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dataVigenciaFimDDMMYYYY" element
     */
    public org.apache.xmlbeans.XmlString xgetDataVigenciaFimDDMMYYYY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAVIGENCIAFIMDDMMYYYY$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "dataVigenciaFimDDMMYYYY" element
     */
    public boolean isSetDataVigenciaFimDDMMYYYY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAVIGENCIAFIMDDMMYYYY$16) != 0;
        }
    }
    
    /**
     * Sets the "dataVigenciaFimDDMMYYYY" element
     */
    public void setDataVigenciaFimDDMMYYYY(java.lang.String dataVigenciaFimDDMMYYYY)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAVIGENCIAFIMDDMMYYYY$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAVIGENCIAFIMDDMMYYYY$16);
            }
            target.setStringValue(dataVigenciaFimDDMMYYYY);
        }
    }
    
    /**
     * Sets (as xml) the "dataVigenciaFimDDMMYYYY" element
     */
    public void xsetDataVigenciaFimDDMMYYYY(org.apache.xmlbeans.XmlString dataVigenciaFimDDMMYYYY)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAVIGENCIAFIMDDMMYYYY$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATAVIGENCIAFIMDDMMYYYY$16);
            }
            target.set(dataVigenciaFimDDMMYYYY);
        }
    }
    
    /**
     * Unsets the "dataVigenciaFimDDMMYYYY" element
     */
    public void unsetDataVigenciaFimDDMMYYYY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAVIGENCIAFIMDDMMYYYY$16, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAVIGENCIAINICIO$18, 0);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAVIGENCIAINICIO$18, 0);
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
            return get_store().count_elements(DATAVIGENCIAINICIO$18) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAVIGENCIAINICIO$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAVIGENCIAINICIO$18);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAVIGENCIAINICIO$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATAVIGENCIAINICIO$18);
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
            get_store().remove_element(DATAVIGENCIAINICIO$18, 0);
        }
    }
    
    /**
     * Gets the "dataVigenciaInicioDDMMYYYY" element
     */
    public java.lang.String getDataVigenciaInicioDDMMYYYY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAVIGENCIAINICIODDMMYYYY$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dataVigenciaInicioDDMMYYYY" element
     */
    public org.apache.xmlbeans.XmlString xgetDataVigenciaInicioDDMMYYYY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAVIGENCIAINICIODDMMYYYY$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "dataVigenciaInicioDDMMYYYY" element
     */
    public boolean isSetDataVigenciaInicioDDMMYYYY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAVIGENCIAINICIODDMMYYYY$20) != 0;
        }
    }
    
    /**
     * Sets the "dataVigenciaInicioDDMMYYYY" element
     */
    public void setDataVigenciaInicioDDMMYYYY(java.lang.String dataVigenciaInicioDDMMYYYY)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAVIGENCIAINICIODDMMYYYY$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAVIGENCIAINICIODDMMYYYY$20);
            }
            target.setStringValue(dataVigenciaInicioDDMMYYYY);
        }
    }
    
    /**
     * Sets (as xml) the "dataVigenciaInicioDDMMYYYY" element
     */
    public void xsetDataVigenciaInicioDDMMYYYY(org.apache.xmlbeans.XmlString dataVigenciaInicioDDMMYYYY)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAVIGENCIAINICIODDMMYYYY$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATAVIGENCIAINICIODDMMYYYY$20);
            }
            target.set(dataVigenciaInicioDDMMYYYY);
        }
    }
    
    /**
     * Unsets the "dataVigenciaInicioDDMMYYYY" element
     */
    public void unsetDataVigenciaInicioDDMMYYYY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAVIGENCIAINICIODDMMYYYY$20, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAJATUALIZACAO$22, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DATAJATUALIZACAO$22, 0);
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
            return get_store().count_elements(DATAJATUALIZACAO$22) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAJATUALIZACAO$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAJATUALIZACAO$22);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DATAJATUALIZACAO$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DATAJATUALIZACAO$22);
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
            get_store().remove_element(DATAJATUALIZACAO$22, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAJVIGENCIAFIM$24, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DATAJVIGENCIAFIM$24, 0);
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
            return get_store().count_elements(DATAJVIGENCIAFIM$24) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAJVIGENCIAFIM$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAJVIGENCIAFIM$24);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DATAJVIGENCIAFIM$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DATAJVIGENCIAFIM$24);
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
            get_store().remove_element(DATAJVIGENCIAFIM$24, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAJVIGENCIAINICIO$26, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DATAJVIGENCIAINICIO$26, 0);
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
            return get_store().count_elements(DATAJVIGENCIAINICIO$26) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAJVIGENCIAINICIO$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAJVIGENCIAINICIO$26);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DATAJVIGENCIAINICIO$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DATAJVIGENCIAINICIO$26);
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
            get_store().remove_element(DATAJVIGENCIAINICIO$26, 0);
        }
    }
    
    /**
     * Gets the "descricaoDiretoriaRegional" element
     */
    public java.lang.String getDescricaoDiretoriaRegional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRICAODIRETORIAREGIONAL$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "descricaoDiretoriaRegional" element
     */
    public org.apache.xmlbeans.XmlString xgetDescricaoDiretoriaRegional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRICAODIRETORIAREGIONAL$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "descricaoDiretoriaRegional" element
     */
    public boolean isSetDescricaoDiretoriaRegional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRICAODIRETORIAREGIONAL$28) != 0;
        }
    }
    
    /**
     * Sets the "descricaoDiretoriaRegional" element
     */
    public void setDescricaoDiretoriaRegional(java.lang.String descricaoDiretoriaRegional)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRICAODIRETORIAREGIONAL$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRICAODIRETORIAREGIONAL$28);
            }
            target.setStringValue(descricaoDiretoriaRegional);
        }
    }
    
    /**
     * Sets (as xml) the "descricaoDiretoriaRegional" element
     */
    public void xsetDescricaoDiretoriaRegional(org.apache.xmlbeans.XmlString descricaoDiretoriaRegional)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRICAODIRETORIAREGIONAL$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRICAODIRETORIAREGIONAL$28);
            }
            target.set(descricaoDiretoriaRegional);
        }
    }
    
    /**
     * Unsets the "descricaoDiretoriaRegional" element
     */
    public void unsetDescricaoDiretoriaRegional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRICAODIRETORIAREGIONAL$28, 0);
        }
    }
    
    /**
     * Gets the "descricaoStatus" element
     */
    public java.lang.String getDescricaoStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRICAOSTATUS$30, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "descricaoStatus" element
     */
    public org.apache.xmlbeans.XmlString xgetDescricaoStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRICAOSTATUS$30, 0);
            return target;
        }
    }
    
    /**
     * True if has "descricaoStatus" element
     */
    public boolean isSetDescricaoStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRICAOSTATUS$30) != 0;
        }
    }
    
    /**
     * Sets the "descricaoStatus" element
     */
    public void setDescricaoStatus(java.lang.String descricaoStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRICAOSTATUS$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRICAOSTATUS$30);
            }
            target.setStringValue(descricaoStatus);
        }
    }
    
    /**
     * Sets (as xml) the "descricaoStatus" element
     */
    public void xsetDescricaoStatus(org.apache.xmlbeans.XmlString descricaoStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRICAOSTATUS$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRICAOSTATUS$30);
            }
            target.set(descricaoStatus);
        }
    }
    
    /**
     * Unsets the "descricaoStatus" element
     */
    public void unsetDescricaoStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRICAOSTATUS$30, 0);
        }
    }
    
    /**
     * Gets the "diretoriaRegional" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP getDiretoriaRegional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP)get_store().find_element_user(DIRETORIAREGIONAL$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "diretoriaRegional" element
     */
    public boolean isSetDiretoriaRegional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIRETORIAREGIONAL$32) != 0;
        }
    }
    
    /**
     * Sets the "diretoriaRegional" element
     */
    public void setDiretoriaRegional(br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP diretoriaRegional)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP)get_store().find_element_user(DIRETORIAREGIONAL$32, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP)get_store().add_element_user(DIRETORIAREGIONAL$32);
            }
            target.set(diretoriaRegional);
        }
    }
    
    /**
     * Appends and returns a new empty "diretoriaRegional" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP addNewDiretoriaRegional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP)get_store().add_element_user(DIRETORIAREGIONAL$32);
            return target;
        }
    }
    
    /**
     * Unsets the "diretoriaRegional" element
     */
    public void unsetDiretoriaRegional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIRETORIAREGIONAL$32, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HORAJATUALIZACAO$34, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HORAJATUALIZACAO$34, 0);
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
            return get_store().count_elements(HORAJATUALIZACAO$34) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HORAJATUALIZACAO$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HORAJATUALIZACAO$34);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HORAJATUALIZACAO$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(HORAJATUALIZACAO$34);
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
            get_store().remove_element(HORAJATUALIZACAO$34, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSCODIGO$36, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSCODIGO$36, 0);
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
            return get_store().count_elements(STATUSCODIGO$36) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSCODIGO$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUSCODIGO$36);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSCODIGO$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUSCODIGO$36);
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
            get_store().remove_element(STATUSCODIGO$36, 0);
        }
    }
}
