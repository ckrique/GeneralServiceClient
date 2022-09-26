/*
 * XML Type:  objetoPostal
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML objetoPostal(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class ObjetoPostalImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal
{
    
    public ObjetoPostalImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODIGOETIQUETA$0 = 
        new javax.xml.namespace.QName("", "codigoEtiqueta");
    private static final javax.xml.namespace.QName DATAATUALIZACAOCLIENTE$2 = 
        new javax.xml.namespace.QName("", "dataAtualizacaoCliente");
    private static final javax.xml.namespace.QName DATABLOQUEIOOBJETO$4 = 
        new javax.xml.namespace.QName("", "dataBloqueioObjeto");
    private static final javax.xml.namespace.QName DATACANCELAMENTOETIQUETA$6 = 
        new javax.xml.namespace.QName("", "dataCancelamentoEtiqueta");
    private static final javax.xml.namespace.QName DATAINCLUSAO$8 = 
        new javax.xml.namespace.QName("", "dataInclusao");
    private static final javax.xml.namespace.QName OBJETOPOSTALPK$10 = 
        new javax.xml.namespace.QName("", "objetoPostalPK");
    private static final javax.xml.namespace.QName PLPNU$12 = 
        new javax.xml.namespace.QName("", "plpNu");
    private static final javax.xml.namespace.QName PRELISTAPOSTAGEM$14 = 
        new javax.xml.namespace.QName("", "preListaPostagem");
    private static final javax.xml.namespace.QName RESTRICAOAEREA$16 = 
        new javax.xml.namespace.QName("", "restricaoAerea");
    private static final javax.xml.namespace.QName STATUSBLOQUEIO$18 = 
        new javax.xml.namespace.QName("", "statusBloqueio");
    private static final javax.xml.namespace.QName STATUSETIQUETA$20 = 
        new javax.xml.namespace.QName("", "statusEtiqueta");
    
    
    /**
     * Gets the "codigoEtiqueta" element
     */
    public java.lang.String getCodigoEtiqueta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGOETIQUETA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codigoEtiqueta" element
     */
    public org.apache.xmlbeans.XmlString xgetCodigoEtiqueta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOETIQUETA$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "codigoEtiqueta" element
     */
    public boolean isSetCodigoEtiqueta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODIGOETIQUETA$0) != 0;
        }
    }
    
    /**
     * Sets the "codigoEtiqueta" element
     */
    public void setCodigoEtiqueta(java.lang.String codigoEtiqueta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGOETIQUETA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODIGOETIQUETA$0);
            }
            target.setStringValue(codigoEtiqueta);
        }
    }
    
    /**
     * Sets (as xml) the "codigoEtiqueta" element
     */
    public void xsetCodigoEtiqueta(org.apache.xmlbeans.XmlString codigoEtiqueta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOETIQUETA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODIGOETIQUETA$0);
            }
            target.set(codigoEtiqueta);
        }
    }
    
    /**
     * Unsets the "codigoEtiqueta" element
     */
    public void unsetCodigoEtiqueta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODIGOETIQUETA$0, 0);
        }
    }
    
    /**
     * Gets the "dataAtualizacaoCliente" element
     */
    public java.util.Calendar getDataAtualizacaoCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAATUALIZACAOCLIENTE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dataAtualizacaoCliente" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDataAtualizacaoCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAATUALIZACAOCLIENTE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "dataAtualizacaoCliente" element
     */
    public boolean isSetDataAtualizacaoCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAATUALIZACAOCLIENTE$2) != 0;
        }
    }
    
    /**
     * Sets the "dataAtualizacaoCliente" element
     */
    public void setDataAtualizacaoCliente(java.util.Calendar dataAtualizacaoCliente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAATUALIZACAOCLIENTE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAATUALIZACAOCLIENTE$2);
            }
            target.setCalendarValue(dataAtualizacaoCliente);
        }
    }
    
    /**
     * Sets (as xml) the "dataAtualizacaoCliente" element
     */
    public void xsetDataAtualizacaoCliente(org.apache.xmlbeans.XmlDateTime dataAtualizacaoCliente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAATUALIZACAOCLIENTE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATAATUALIZACAOCLIENTE$2);
            }
            target.set(dataAtualizacaoCliente);
        }
    }
    
    /**
     * Unsets the "dataAtualizacaoCliente" element
     */
    public void unsetDataAtualizacaoCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAATUALIZACAOCLIENTE$2, 0);
        }
    }
    
    /**
     * Gets the "dataBloqueioObjeto" element
     */
    public java.util.Calendar getDataBloqueioObjeto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATABLOQUEIOOBJETO$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dataBloqueioObjeto" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDataBloqueioObjeto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATABLOQUEIOOBJETO$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "dataBloqueioObjeto" element
     */
    public boolean isSetDataBloqueioObjeto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATABLOQUEIOOBJETO$4) != 0;
        }
    }
    
    /**
     * Sets the "dataBloqueioObjeto" element
     */
    public void setDataBloqueioObjeto(java.util.Calendar dataBloqueioObjeto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATABLOQUEIOOBJETO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATABLOQUEIOOBJETO$4);
            }
            target.setCalendarValue(dataBloqueioObjeto);
        }
    }
    
    /**
     * Sets (as xml) the "dataBloqueioObjeto" element
     */
    public void xsetDataBloqueioObjeto(org.apache.xmlbeans.XmlDateTime dataBloqueioObjeto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATABLOQUEIOOBJETO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATABLOQUEIOOBJETO$4);
            }
            target.set(dataBloqueioObjeto);
        }
    }
    
    /**
     * Unsets the "dataBloqueioObjeto" element
     */
    public void unsetDataBloqueioObjeto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATABLOQUEIOOBJETO$4, 0);
        }
    }
    
    /**
     * Gets the "dataCancelamentoEtiqueta" element
     */
    public java.util.Calendar getDataCancelamentoEtiqueta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATACANCELAMENTOETIQUETA$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dataCancelamentoEtiqueta" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDataCancelamentoEtiqueta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATACANCELAMENTOETIQUETA$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "dataCancelamentoEtiqueta" element
     */
    public boolean isSetDataCancelamentoEtiqueta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATACANCELAMENTOETIQUETA$6) != 0;
        }
    }
    
    /**
     * Sets the "dataCancelamentoEtiqueta" element
     */
    public void setDataCancelamentoEtiqueta(java.util.Calendar dataCancelamentoEtiqueta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATACANCELAMENTOETIQUETA$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATACANCELAMENTOETIQUETA$6);
            }
            target.setCalendarValue(dataCancelamentoEtiqueta);
        }
    }
    
    /**
     * Sets (as xml) the "dataCancelamentoEtiqueta" element
     */
    public void xsetDataCancelamentoEtiqueta(org.apache.xmlbeans.XmlDateTime dataCancelamentoEtiqueta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATACANCELAMENTOETIQUETA$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATACANCELAMENTOETIQUETA$6);
            }
            target.set(dataCancelamentoEtiqueta);
        }
    }
    
    /**
     * Unsets the "dataCancelamentoEtiqueta" element
     */
    public void unsetDataCancelamentoEtiqueta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATACANCELAMENTOETIQUETA$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAINCLUSAO$8, 0);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAINCLUSAO$8, 0);
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
            return get_store().count_elements(DATAINCLUSAO$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAINCLUSAO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAINCLUSAO$8);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAINCLUSAO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATAINCLUSAO$8);
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
            get_store().remove_element(DATAINCLUSAO$8, 0);
        }
    }
    
    /**
     * Gets the "objetoPostalPK" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostalPK getObjetoPostalPK()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostalPK target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostalPK)get_store().find_element_user(OBJETOPOSTALPK$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "objetoPostalPK" element
     */
    public boolean isSetObjetoPostalPK()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJETOPOSTALPK$10) != 0;
        }
    }
    
    /**
     * Sets the "objetoPostalPK" element
     */
    public void setObjetoPostalPK(br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostalPK objetoPostalPK)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostalPK target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostalPK)get_store().find_element_user(OBJETOPOSTALPK$10, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostalPK)get_store().add_element_user(OBJETOPOSTALPK$10);
            }
            target.set(objetoPostalPK);
        }
    }
    
    /**
     * Appends and returns a new empty "objetoPostalPK" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostalPK addNewObjetoPostalPK()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostalPK target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostalPK)get_store().add_element_user(OBJETOPOSTALPK$10);
            return target;
        }
    }
    
    /**
     * Unsets the "objetoPostalPK" element
     */
    public void unsetObjetoPostalPK()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJETOPOSTALPK$10, 0);
        }
    }
    
    /**
     * Gets the "plpNu" element
     */
    public long getPlpNu()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLPNU$12, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "plpNu" element
     */
    public org.apache.xmlbeans.XmlLong xgetPlpNu()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(PLPNU$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "plpNu" element
     */
    public boolean isSetPlpNu()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLPNU$12) != 0;
        }
    }
    
    /**
     * Sets the "plpNu" element
     */
    public void setPlpNu(long plpNu)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLPNU$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PLPNU$12);
            }
            target.setLongValue(plpNu);
        }
    }
    
    /**
     * Sets (as xml) the "plpNu" element
     */
    public void xsetPlpNu(org.apache.xmlbeans.XmlLong plpNu)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(PLPNU$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(PLPNU$12);
            }
            target.set(plpNu);
        }
    }
    
    /**
     * Unsets the "plpNu" element
     */
    public void unsetPlpNu()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLPNU$12, 0);
        }
    }
    
    /**
     * Gets the "preListaPostagem" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem getPreListaPostagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem)get_store().find_element_user(PRELISTAPOSTAGEM$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "preListaPostagem" element
     */
    public boolean isSetPreListaPostagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRELISTAPOSTAGEM$14) != 0;
        }
    }
    
    /**
     * Sets the "preListaPostagem" element
     */
    public void setPreListaPostagem(br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem preListaPostagem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem)get_store().find_element_user(PRELISTAPOSTAGEM$14, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem)get_store().add_element_user(PRELISTAPOSTAGEM$14);
            }
            target.set(preListaPostagem);
        }
    }
    
    /**
     * Appends and returns a new empty "preListaPostagem" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem addNewPreListaPostagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem)get_store().add_element_user(PRELISTAPOSTAGEM$14);
            return target;
        }
    }
    
    /**
     * Unsets the "preListaPostagem" element
     */
    public void unsetPreListaPostagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRELISTAPOSTAGEM$14, 0);
        }
    }
    
    /**
     * Gets the "restricaoAerea" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.SimNao.Enum getRestricaoAerea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESTRICAOAEREA$16, 0);
            if (target == null)
            {
                return null;
            }
            return (br.com.correios.bsb.sigep.master.bean.cliente.SimNao.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "restricaoAerea" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.SimNao xgetRestricaoAerea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.SimNao target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.SimNao)get_store().find_element_user(RESTRICAOAEREA$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "restricaoAerea" element
     */
    public boolean isSetRestricaoAerea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESTRICAOAEREA$16) != 0;
        }
    }
    
    /**
     * Sets the "restricaoAerea" element
     */
    public void setRestricaoAerea(br.com.correios.bsb.sigep.master.bean.cliente.SimNao.Enum restricaoAerea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESTRICAOAEREA$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESTRICAOAEREA$16);
            }
            target.setEnumValue(restricaoAerea);
        }
    }
    
    /**
     * Sets (as xml) the "restricaoAerea" element
     */
    public void xsetRestricaoAerea(br.com.correios.bsb.sigep.master.bean.cliente.SimNao restricaoAerea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.SimNao target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.SimNao)get_store().find_element_user(RESTRICAOAEREA$16, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.SimNao)get_store().add_element_user(RESTRICAOAEREA$16);
            }
            target.set(restricaoAerea);
        }
    }
    
    /**
     * Unsets the "restricaoAerea" element
     */
    public void unsetRestricaoAerea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESTRICAOAEREA$16, 0);
        }
    }
    
    /**
     * Gets the "statusBloqueio" element
     */
    public java.lang.String getStatusBloqueio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSBLOQUEIO$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "statusBloqueio" element
     */
    public org.apache.xmlbeans.XmlString xgetStatusBloqueio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSBLOQUEIO$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "statusBloqueio" element
     */
    public boolean isSetStatusBloqueio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUSBLOQUEIO$18) != 0;
        }
    }
    
    /**
     * Sets the "statusBloqueio" element
     */
    public void setStatusBloqueio(java.lang.String statusBloqueio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSBLOQUEIO$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUSBLOQUEIO$18);
            }
            target.setStringValue(statusBloqueio);
        }
    }
    
    /**
     * Sets (as xml) the "statusBloqueio" element
     */
    public void xsetStatusBloqueio(org.apache.xmlbeans.XmlString statusBloqueio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSBLOQUEIO$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUSBLOQUEIO$18);
            }
            target.set(statusBloqueio);
        }
    }
    
    /**
     * Unsets the "statusBloqueio" element
     */
    public void unsetStatusBloqueio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUSBLOQUEIO$18, 0);
        }
    }
    
    /**
     * Gets the "statusEtiqueta" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.StatusObjetoPostal.Enum getStatusEtiqueta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSETIQUETA$20, 0);
            if (target == null)
            {
                return null;
            }
            return (br.com.correios.bsb.sigep.master.bean.cliente.StatusObjetoPostal.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "statusEtiqueta" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.StatusObjetoPostal xgetStatusEtiqueta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.StatusObjetoPostal target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.StatusObjetoPostal)get_store().find_element_user(STATUSETIQUETA$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "statusEtiqueta" element
     */
    public boolean isSetStatusEtiqueta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUSETIQUETA$20) != 0;
        }
    }
    
    /**
     * Sets the "statusEtiqueta" element
     */
    public void setStatusEtiqueta(br.com.correios.bsb.sigep.master.bean.cliente.StatusObjetoPostal.Enum statusEtiqueta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSETIQUETA$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUSETIQUETA$20);
            }
            target.setEnumValue(statusEtiqueta);
        }
    }
    
    /**
     * Sets (as xml) the "statusEtiqueta" element
     */
    public void xsetStatusEtiqueta(br.com.correios.bsb.sigep.master.bean.cliente.StatusObjetoPostal statusEtiqueta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.StatusObjetoPostal target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.StatusObjetoPostal)get_store().find_element_user(STATUSETIQUETA$20, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.StatusObjetoPostal)get_store().add_element_user(STATUSETIQUETA$20);
            }
            target.set(statusEtiqueta);
        }
    }
    
    /**
     * Unsets the "statusEtiqueta" element
     */
    public void unsetStatusEtiqueta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUSETIQUETA$20, 0);
        }
    }
}
