/*
 * XML Type:  servicoSigep
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML servicoSigep(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class ServicoSigepImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep
{
    
    public ServicoSigepImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORIASERVICO$0 = 
        new javax.xml.namespace.QName("", "categoriaServico");
    private static final javax.xml.namespace.QName CHANCELA$2 = 
        new javax.xml.namespace.QName("", "chancela");
    private static final javax.xml.namespace.QName DESCRICAO$4 = 
        new javax.xml.namespace.QName("", "descricao");
    private static final javax.xml.namespace.QName EXIGEDIMENSOES$6 = 
        new javax.xml.namespace.QName("", "exigeDimensoes");
    private static final javax.xml.namespace.QName EXIGEVALORCOBRAR$8 = 
        new javax.xml.namespace.QName("", "exigeValorCobrar");
    private static final javax.xml.namespace.QName IMITM$10 = 
        new javax.xml.namespace.QName("", "imitm");
    private static final javax.xml.namespace.QName PAGAMENTOENTREGA$12 = 
        new javax.xml.namespace.QName("", "pagamentoEntrega");
    private static final javax.xml.namespace.QName REMESSAAGRUPADA$14 = 
        new javax.xml.namespace.QName("", "remessaAgrupada");
    private static final javax.xml.namespace.QName RESTRICAO$16 = 
        new javax.xml.namespace.QName("", "restricao");
    private static final javax.xml.namespace.QName SERVICO$18 = 
        new javax.xml.namespace.QName("", "servico");
    private static final javax.xml.namespace.QName SERVICOERP$20 = 
        new javax.xml.namespace.QName("", "servicoERP");
    private static final javax.xml.namespace.QName SSICOCODIGOPOSTAL$22 = 
        new javax.xml.namespace.QName("", "ssiCoCodigoPostal");
    
    
    /**
     * Gets the "categoriaServico" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.CategoriaServico.Enum getCategoriaServico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORIASERVICO$0, 0);
            if (target == null)
            {
                return null;
            }
            return (br.com.correios.bsb.sigep.master.bean.cliente.CategoriaServico.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "categoriaServico" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.CategoriaServico xgetCategoriaServico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.CategoriaServico target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.CategoriaServico)get_store().find_element_user(CATEGORIASERVICO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "categoriaServico" element
     */
    public boolean isSetCategoriaServico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORIASERVICO$0) != 0;
        }
    }
    
    /**
     * Sets the "categoriaServico" element
     */
    public void setCategoriaServico(br.com.correios.bsb.sigep.master.bean.cliente.CategoriaServico.Enum categoriaServico)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORIASERVICO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORIASERVICO$0);
            }
            target.setEnumValue(categoriaServico);
        }
    }
    
    /**
     * Sets (as xml) the "categoriaServico" element
     */
    public void xsetCategoriaServico(br.com.correios.bsb.sigep.master.bean.cliente.CategoriaServico categoriaServico)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.CategoriaServico target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.CategoriaServico)get_store().find_element_user(CATEGORIASERVICO$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.CategoriaServico)get_store().add_element_user(CATEGORIASERVICO$0);
            }
            target.set(categoriaServico);
        }
    }
    
    /**
     * Unsets the "categoriaServico" element
     */
    public void unsetCategoriaServico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORIASERVICO$0, 0);
        }
    }
    
    /**
     * Gets the "chancela" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster getChancela()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster)get_store().find_element_user(CHANCELA$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "chancela" element
     */
    public boolean isSetChancela()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHANCELA$2) != 0;
        }
    }
    
    /**
     * Sets the "chancela" element
     */
    public void setChancela(br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster chancela)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster)get_store().find_element_user(CHANCELA$2, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster)get_store().add_element_user(CHANCELA$2);
            }
            target.set(chancela);
        }
    }
    
    /**
     * Appends and returns a new empty "chancela" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster addNewChancela()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster)get_store().add_element_user(CHANCELA$2);
            return target;
        }
    }
    
    /**
     * Unsets the "chancela" element
     */
    public void unsetChancela()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHANCELA$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRICAO$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRICAO$4, 0);
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
            return get_store().count_elements(DESCRICAO$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRICAO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRICAO$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRICAO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRICAO$4);
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
            get_store().remove_element(DESCRICAO$4, 0);
        }
    }
    
    /**
     * Gets the "exigeDimensoes" element
     */
    public boolean getExigeDimensoes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXIGEDIMENSOES$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "exigeDimensoes" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetExigeDimensoes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(EXIGEDIMENSOES$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "exigeDimensoes" element
     */
    public boolean isSetExigeDimensoes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXIGEDIMENSOES$6) != 0;
        }
    }
    
    /**
     * Sets the "exigeDimensoes" element
     */
    public void setExigeDimensoes(boolean exigeDimensoes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXIGEDIMENSOES$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXIGEDIMENSOES$6);
            }
            target.setBooleanValue(exigeDimensoes);
        }
    }
    
    /**
     * Sets (as xml) the "exigeDimensoes" element
     */
    public void xsetExigeDimensoes(org.apache.xmlbeans.XmlBoolean exigeDimensoes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(EXIGEDIMENSOES$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(EXIGEDIMENSOES$6);
            }
            target.set(exigeDimensoes);
        }
    }
    
    /**
     * Unsets the "exigeDimensoes" element
     */
    public void unsetExigeDimensoes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXIGEDIMENSOES$6, 0);
        }
    }
    
    /**
     * Gets the "exigeValorCobrar" element
     */
    public boolean getExigeValorCobrar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXIGEVALORCOBRAR$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "exigeValorCobrar" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetExigeValorCobrar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(EXIGEVALORCOBRAR$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "exigeValorCobrar" element
     */
    public boolean isSetExigeValorCobrar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXIGEVALORCOBRAR$8) != 0;
        }
    }
    
    /**
     * Sets the "exigeValorCobrar" element
     */
    public void setExigeValorCobrar(boolean exigeValorCobrar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXIGEVALORCOBRAR$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXIGEVALORCOBRAR$8);
            }
            target.setBooleanValue(exigeValorCobrar);
        }
    }
    
    /**
     * Sets (as xml) the "exigeValorCobrar" element
     */
    public void xsetExigeValorCobrar(org.apache.xmlbeans.XmlBoolean exigeValorCobrar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(EXIGEVALORCOBRAR$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(EXIGEVALORCOBRAR$8);
            }
            target.set(exigeValorCobrar);
        }
    }
    
    /**
     * Unsets the "exigeValorCobrar" element
     */
    public void unsetExigeValorCobrar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXIGEVALORCOBRAR$8, 0);
        }
    }
    
    /**
     * Gets the "imitm" element
     */
    public long getImitm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMITM$10, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "imitm" element
     */
    public org.apache.xmlbeans.XmlLong xgetImitm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(IMITM$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "imitm" element
     */
    public void setImitm(long imitm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMITM$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMITM$10);
            }
            target.setLongValue(imitm);
        }
    }
    
    /**
     * Sets (as xml) the "imitm" element
     */
    public void xsetImitm(org.apache.xmlbeans.XmlLong imitm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(IMITM$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(IMITM$10);
            }
            target.set(imitm);
        }
    }
    
    /**
     * Gets the "pagamentoEntrega" element
     */
    public java.lang.String getPagamentoEntrega()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGAMENTOENTREGA$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "pagamentoEntrega" element
     */
    public org.apache.xmlbeans.XmlString xgetPagamentoEntrega()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAGAMENTOENTREGA$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "pagamentoEntrega" element
     */
    public boolean isSetPagamentoEntrega()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAGAMENTOENTREGA$12) != 0;
        }
    }
    
    /**
     * Sets the "pagamentoEntrega" element
     */
    public void setPagamentoEntrega(java.lang.String pagamentoEntrega)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGAMENTOENTREGA$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAGAMENTOENTREGA$12);
            }
            target.setStringValue(pagamentoEntrega);
        }
    }
    
    /**
     * Sets (as xml) the "pagamentoEntrega" element
     */
    public void xsetPagamentoEntrega(org.apache.xmlbeans.XmlString pagamentoEntrega)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAGAMENTOENTREGA$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PAGAMENTOENTREGA$12);
            }
            target.set(pagamentoEntrega);
        }
    }
    
    /**
     * Unsets the "pagamentoEntrega" element
     */
    public void unsetPagamentoEntrega()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAGAMENTOENTREGA$12, 0);
        }
    }
    
    /**
     * Gets the "remessaAgrupada" element
     */
    public java.lang.String getRemessaAgrupada()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REMESSAAGRUPADA$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "remessaAgrupada" element
     */
    public org.apache.xmlbeans.XmlString xgetRemessaAgrupada()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REMESSAAGRUPADA$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "remessaAgrupada" element
     */
    public boolean isSetRemessaAgrupada()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REMESSAAGRUPADA$14) != 0;
        }
    }
    
    /**
     * Sets the "remessaAgrupada" element
     */
    public void setRemessaAgrupada(java.lang.String remessaAgrupada)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REMESSAAGRUPADA$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REMESSAAGRUPADA$14);
            }
            target.setStringValue(remessaAgrupada);
        }
    }
    
    /**
     * Sets (as xml) the "remessaAgrupada" element
     */
    public void xsetRemessaAgrupada(org.apache.xmlbeans.XmlString remessaAgrupada)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REMESSAAGRUPADA$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REMESSAAGRUPADA$14);
            }
            target.set(remessaAgrupada);
        }
    }
    
    /**
     * Unsets the "remessaAgrupada" element
     */
    public void unsetRemessaAgrupada()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REMESSAAGRUPADA$14, 0);
        }
    }
    
    /**
     * Gets the "restricao" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.SimNao.Enum getRestricao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESTRICAO$16, 0);
            if (target == null)
            {
                return null;
            }
            return (br.com.correios.bsb.sigep.master.bean.cliente.SimNao.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "restricao" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.SimNao xgetRestricao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.SimNao target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.SimNao)get_store().find_element_user(RESTRICAO$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "restricao" element
     */
    public boolean isSetRestricao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESTRICAO$16) != 0;
        }
    }
    
    /**
     * Sets the "restricao" element
     */
    public void setRestricao(br.com.correios.bsb.sigep.master.bean.cliente.SimNao.Enum restricao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESTRICAO$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESTRICAO$16);
            }
            target.setEnumValue(restricao);
        }
    }
    
    /**
     * Sets (as xml) the "restricao" element
     */
    public void xsetRestricao(br.com.correios.bsb.sigep.master.bean.cliente.SimNao restricao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.SimNao target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.SimNao)get_store().find_element_user(RESTRICAO$16, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.SimNao)get_store().add_element_user(RESTRICAO$16);
            }
            target.set(restricao);
        }
    }
    
    /**
     * Unsets the "restricao" element
     */
    public void unsetRestricao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESTRICAO$16, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICO$18, 0);
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
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(SERVICO$18, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICO$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICO$18);
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
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(SERVICO$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(SERVICO$18);
            }
            target.set(servico);
        }
    }
    
    /**
     * Gets the "servicoERP" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP getServicoERP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP)get_store().find_element_user(SERVICOERP$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "servicoERP" element
     */
    public boolean isSetServicoERP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICOERP$20) != 0;
        }
    }
    
    /**
     * Sets the "servicoERP" element
     */
    public void setServicoERP(br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP servicoERP)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP)get_store().find_element_user(SERVICOERP$20, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP)get_store().add_element_user(SERVICOERP$20);
            }
            target.set(servicoERP);
        }
    }
    
    /**
     * Appends and returns a new empty "servicoERP" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP addNewServicoERP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP)get_store().add_element_user(SERVICOERP$20);
            return target;
        }
    }
    
    /**
     * Unsets the "servicoERP" element
     */
    public void unsetServicoERP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICOERP$20, 0);
        }
    }
    
    /**
     * Gets the "ssiCoCodigoPostal" element
     */
    public java.lang.String getSsiCoCodigoPostal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SSICOCODIGOPOSTAL$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ssiCoCodigoPostal" element
     */
    public org.apache.xmlbeans.XmlString xgetSsiCoCodigoPostal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SSICOCODIGOPOSTAL$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "ssiCoCodigoPostal" element
     */
    public boolean isSetSsiCoCodigoPostal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SSICOCODIGOPOSTAL$22) != 0;
        }
    }
    
    /**
     * Sets the "ssiCoCodigoPostal" element
     */
    public void setSsiCoCodigoPostal(java.lang.String ssiCoCodigoPostal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SSICOCODIGOPOSTAL$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SSICOCODIGOPOSTAL$22);
            }
            target.setStringValue(ssiCoCodigoPostal);
        }
    }
    
    /**
     * Sets (as xml) the "ssiCoCodigoPostal" element
     */
    public void xsetSsiCoCodigoPostal(org.apache.xmlbeans.XmlString ssiCoCodigoPostal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SSICOCODIGOPOSTAL$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SSICOCODIGOPOSTAL$22);
            }
            target.set(ssiCoCodigoPostal);
        }
    }
    
    /**
     * Unsets the "ssiCoCodigoPostal" element
     */
    public void unsetSsiCoCodigoPostal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SSICOCODIGOPOSTAL$22, 0);
        }
    }
}
