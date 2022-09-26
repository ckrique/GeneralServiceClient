/*
 * XML Type:  unidadePostagemERP
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML unidadePostagemERP(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class UnidadePostagemERPImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP
{
    
    public UnidadePostagemERPImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIRETORIAREGIONAL$0 = 
        new javax.xml.namespace.QName("", "diretoriaRegional");
    private static final javax.xml.namespace.QName ENDERECO$2 = 
        new javax.xml.namespace.QName("", "endereco");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName NOME$6 = 
        new javax.xml.namespace.QName("", "nome");
    private static final javax.xml.namespace.QName STATUS$8 = 
        new javax.xml.namespace.QName("", "status");
    private static final javax.xml.namespace.QName TIPO$10 = 
        new javax.xml.namespace.QName("", "tipo");
    
    
    /**
     * Gets the "diretoriaRegional" element
     */
    public java.lang.String getDiretoriaRegional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRETORIAREGIONAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "diretoriaRegional" element
     */
    public org.apache.xmlbeans.XmlString xgetDiretoriaRegional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIRETORIAREGIONAL$0, 0);
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
            return get_store().count_elements(DIRETORIAREGIONAL$0) != 0;
        }
    }
    
    /**
     * Sets the "diretoriaRegional" element
     */
    public void setDiretoriaRegional(java.lang.String diretoriaRegional)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRETORIAREGIONAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIRETORIAREGIONAL$0);
            }
            target.setStringValue(diretoriaRegional);
        }
    }
    
    /**
     * Sets (as xml) the "diretoriaRegional" element
     */
    public void xsetDiretoriaRegional(org.apache.xmlbeans.XmlString diretoriaRegional)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIRETORIAREGIONAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DIRETORIAREGIONAL$0);
            }
            target.set(diretoriaRegional);
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
            get_store().remove_element(DIRETORIAREGIONAL$0, 0);
        }
    }
    
    /**
     * Gets the "endereco" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP getEndereco()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP)get_store().find_element_user(ENDERECO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "endereco" element
     */
    public boolean isSetEndereco()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDERECO$2) != 0;
        }
    }
    
    /**
     * Sets the "endereco" element
     */
    public void setEndereco(br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP endereco)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP)get_store().find_element_user(ENDERECO$2, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP)get_store().add_element_user(ENDERECO$2);
            }
            target.set(endereco);
        }
    }
    
    /**
     * Appends and returns a new empty "endereco" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP addNewEndereco()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP)get_store().add_element_user(ENDERECO$2);
            return target;
        }
    }
    
    /**
     * Unsets the "endereco" element
     */
    public void unsetEndereco()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDERECO$2, 0);
        }
    }
    
    /**
     * Gets the "id" element
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" element
     */
    public org.apache.xmlbeans.XmlString xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$4, 0);
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
            return get_store().count_elements(ID$4) != 0;
        }
    }
    
    /**
     * Sets the "id" element
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$4);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" element
     */
    public void xsetId(org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ID$4);
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
            get_store().remove_element(ID$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOME$6, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOME$6, 0);
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
            return get_store().count_elements(NOME$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOME$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOME$6);
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
            get_store().remove_element(NOME$6, 0);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public java.lang.String getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "status" element
     */
    public org.apache.xmlbeans.XmlString xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$8, 0);
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
            return get_store().count_elements(STATUS$8) != 0;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(java.lang.String status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$8);
            }
            target.setStringValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "status" element
     */
    public void xsetStatus(org.apache.xmlbeans.XmlString status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUS$8);
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
            get_store().remove_element(STATUS$8, 0);
        }
    }
    
    /**
     * Gets the "tipo" element
     */
    public java.lang.String getTipo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPO$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tipo" element
     */
    public org.apache.xmlbeans.XmlString xgetTipo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPO$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "tipo" element
     */
    public boolean isSetTipo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIPO$10) != 0;
        }
    }
    
    /**
     * Sets the "tipo" element
     */
    public void setTipo(java.lang.String tipo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPO$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPO$10);
            }
            target.setStringValue(tipo);
        }
    }
    
    /**
     * Sets (as xml) the "tipo" element
     */
    public void xsetTipo(org.apache.xmlbeans.XmlString tipo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPO$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIPO$10);
            }
            target.set(tipo);
        }
    }
    
    /**
     * Unsets the "tipo" element
     */
    public void unsetTipo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIPO$10, 0);
        }
    }
}
