/*
 * XML Type:  servicoAdicionalERP
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalERP
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML servicoAdicionalERP(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class ServicoAdicionalERPImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalERP
{
    
    public ServicoAdicionalERPImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORIA$0 = 
        new javax.xml.namespace.QName("", "categoria");
    private static final javax.xml.namespace.QName CODIGO$2 = 
        new javax.xml.namespace.QName("", "codigo");
    private static final javax.xml.namespace.QName DATAATUALIZACAO$4 = 
        new javax.xml.namespace.QName("", "dataAtualizacao");
    private static final javax.xml.namespace.QName DATAJATUALIZACAO$6 = 
        new javax.xml.namespace.QName("", "datajAtualizacao");
    private static final javax.xml.namespace.QName DESCRICAO$8 = 
        new javax.xml.namespace.QName("", "descricao");
    private static final javax.xml.namespace.QName HORAJATUALIZACAO$10 = 
        new javax.xml.namespace.QName("", "horajAtualizacao");
    private static final javax.xml.namespace.QName ID$12 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName SIGLA$14 = 
        new javax.xml.namespace.QName("", "sigla");
    private static final javax.xml.namespace.QName VALORDECLARADO$16 = 
        new javax.xml.namespace.QName("", "valorDeclarado");
    
    
    /**
     * Gets the "categoria" element
     */
    public java.lang.String getCategoria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORIA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "categoria" element
     */
    public org.apache.xmlbeans.XmlString xgetCategoria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORIA$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "categoria" element
     */
    public boolean isSetCategoria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORIA$0) != 0;
        }
    }
    
    /**
     * Sets the "categoria" element
     */
    public void setCategoria(java.lang.String categoria)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORIA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORIA$0);
            }
            target.setStringValue(categoria);
        }
    }
    
    /**
     * Sets (as xml) the "categoria" element
     */
    public void xsetCategoria(org.apache.xmlbeans.XmlString categoria)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORIA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CATEGORIA$0);
            }
            target.set(categoria);
        }
    }
    
    /**
     * Unsets the "categoria" element
     */
    public void unsetCategoria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORIA$0, 0);
        }
    }
    
    /**
     * Gets the "codigo" element
     */
    public java.lang.String getCodigo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGO$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGO$2, 0);
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
            return get_store().count_elements(CODIGO$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODIGO$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODIGO$2);
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
            get_store().remove_element(CODIGO$2, 0);
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
     * Gets the "descricao" element
     */
    public java.lang.String getDescricao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRICAO$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRICAO$8, 0);
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
            return get_store().count_elements(DESCRICAO$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRICAO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRICAO$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRICAO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRICAO$8);
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
            get_store().remove_element(DESCRICAO$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HORAJATUALIZACAO$10, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HORAJATUALIZACAO$10, 0);
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
            return get_store().count_elements(HORAJATUALIZACAO$10) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HORAJATUALIZACAO$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HORAJATUALIZACAO$10);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HORAJATUALIZACAO$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(HORAJATUALIZACAO$10);
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
            get_store().remove_element(HORAJATUALIZACAO$10, 0);
        }
    }
    
    /**
     * Gets the "id" element
     */
    public int getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$12, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" element
     */
    public org.apache.xmlbeans.XmlInt xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ID$12, 0);
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
            return get_store().count_elements(ID$12) != 0;
        }
    }
    
    /**
     * Sets the "id" element
     */
    public void setId(int id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$12);
            }
            target.setIntValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" element
     */
    public void xsetId(org.apache.xmlbeans.XmlInt id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ID$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ID$12);
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
            get_store().remove_element(ID$12, 0);
        }
    }
    
    /**
     * Gets the "sigla" element
     */
    public java.lang.String getSigla()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGLA$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sigla" element
     */
    public org.apache.xmlbeans.XmlString xgetSigla()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIGLA$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "sigla" element
     */
    public boolean isSetSigla()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIGLA$14) != 0;
        }
    }
    
    /**
     * Sets the "sigla" element
     */
    public void setSigla(java.lang.String sigla)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGLA$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIGLA$14);
            }
            target.setStringValue(sigla);
        }
    }
    
    /**
     * Sets (as xml) the "sigla" element
     */
    public void xsetSigla(org.apache.xmlbeans.XmlString sigla)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIGLA$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SIGLA$14);
            }
            target.set(sigla);
        }
    }
    
    /**
     * Unsets the "sigla" element
     */
    public void unsetSigla()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIGLA$14, 0);
        }
    }
    
    /**
     * Gets the "valorDeclarado" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ValorDeclarado getValorDeclarado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ValorDeclarado target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ValorDeclarado)get_store().find_element_user(VALORDECLARADO$16, 0);
            if (target == null)
            {
                return null;
            }
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
            return get_store().count_elements(VALORDECLARADO$16) != 0;
        }
    }
    
    /**
     * Sets the "valorDeclarado" element
     */
    public void setValorDeclarado(br.com.correios.bsb.sigep.master.bean.cliente.ValorDeclarado valorDeclarado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ValorDeclarado target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ValorDeclarado)get_store().find_element_user(VALORDECLARADO$16, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.ValorDeclarado)get_store().add_element_user(VALORDECLARADO$16);
            }
            target.set(valorDeclarado);
        }
    }
    
    /**
     * Appends and returns a new empty "valorDeclarado" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ValorDeclarado addNewValorDeclarado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ValorDeclarado target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ValorDeclarado)get_store().add_element_user(VALORDECLARADO$16);
            return target;
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
            get_store().remove_element(VALORDECLARADO$16, 0);
        }
    }
}
