/*
 * XML Type:  buscaPagamentoEntrega
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML buscaPagamentoEntrega(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class BuscaPagamentoEntregaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega
{
    
    public BuscaPagamentoEntregaImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USUARIO$0 = 
        new javax.xml.namespace.QName("", "usuario");
    private static final javax.xml.namespace.QName SENHA$2 = 
        new javax.xml.namespace.QName("", "senha");
    private static final javax.xml.namespace.QName CONTRATO$4 = 
        new javax.xml.namespace.QName("", "contrato");
    private static final javax.xml.namespace.QName DATAINICIO$6 = 
        new javax.xml.namespace.QName("", "dataInicio");
    private static final javax.xml.namespace.QName DATAFIM$8 = 
        new javax.xml.namespace.QName("", "dataFim");
    private static final javax.xml.namespace.QName ETIQUETA$10 = 
        new javax.xml.namespace.QName("", "etiqueta");
    
    
    /**
     * Gets the "usuario" element
     */
    public java.lang.String getUsuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USUARIO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "usuario" element
     */
    public org.apache.xmlbeans.XmlString xgetUsuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USUARIO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "usuario" element
     */
    public boolean isSetUsuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USUARIO$0) != 0;
        }
    }
    
    /**
     * Sets the "usuario" element
     */
    public void setUsuario(java.lang.String usuario)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USUARIO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USUARIO$0);
            }
            target.setStringValue(usuario);
        }
    }
    
    /**
     * Sets (as xml) the "usuario" element
     */
    public void xsetUsuario(org.apache.xmlbeans.XmlString usuario)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USUARIO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USUARIO$0);
            }
            target.set(usuario);
        }
    }
    
    /**
     * Unsets the "usuario" element
     */
    public void unsetUsuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USUARIO$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENHA$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENHA$2, 0);
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
            return get_store().count_elements(SENHA$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENHA$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENHA$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENHA$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SENHA$2);
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
            get_store().remove_element(SENHA$2, 0);
        }
    }
    
    /**
     * Gets the "contrato" element
     */
    public java.lang.String getContrato()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTRATO$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "contrato" element
     */
    public org.apache.xmlbeans.XmlString xgetContrato()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTRATO$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "contrato" element
     */
    public boolean isSetContrato()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTRATO$4) != 0;
        }
    }
    
    /**
     * Sets the "contrato" element
     */
    public void setContrato(java.lang.String contrato)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTRATO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTRATO$4);
            }
            target.setStringValue(contrato);
        }
    }
    
    /**
     * Sets (as xml) the "contrato" element
     */
    public void xsetContrato(org.apache.xmlbeans.XmlString contrato)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTRATO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTRATO$4);
            }
            target.set(contrato);
        }
    }
    
    /**
     * Unsets the "contrato" element
     */
    public void unsetContrato()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTRATO$4, 0);
        }
    }
    
    /**
     * Gets the "dataInicio" element
     */
    public java.lang.String getDataInicio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAINICIO$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dataInicio" element
     */
    public org.apache.xmlbeans.XmlString xgetDataInicio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAINICIO$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "dataInicio" element
     */
    public boolean isSetDataInicio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAINICIO$6) != 0;
        }
    }
    
    /**
     * Sets the "dataInicio" element
     */
    public void setDataInicio(java.lang.String dataInicio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAINICIO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAINICIO$6);
            }
            target.setStringValue(dataInicio);
        }
    }
    
    /**
     * Sets (as xml) the "dataInicio" element
     */
    public void xsetDataInicio(org.apache.xmlbeans.XmlString dataInicio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAINICIO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATAINICIO$6);
            }
            target.set(dataInicio);
        }
    }
    
    /**
     * Unsets the "dataInicio" element
     */
    public void unsetDataInicio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAINICIO$6, 0);
        }
    }
    
    /**
     * Gets the "dataFim" element
     */
    public java.lang.String getDataFim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAFIM$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dataFim" element
     */
    public org.apache.xmlbeans.XmlString xgetDataFim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAFIM$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "dataFim" element
     */
    public boolean isSetDataFim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAFIM$8) != 0;
        }
    }
    
    /**
     * Sets the "dataFim" element
     */
    public void setDataFim(java.lang.String dataFim)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAFIM$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAFIM$8);
            }
            target.setStringValue(dataFim);
        }
    }
    
    /**
     * Sets (as xml) the "dataFim" element
     */
    public void xsetDataFim(org.apache.xmlbeans.XmlString dataFim)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAFIM$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATAFIM$8);
            }
            target.set(dataFim);
        }
    }
    
    /**
     * Unsets the "dataFim" element
     */
    public void unsetDataFim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAFIM$8, 0);
        }
    }
    
    /**
     * Gets the "etiqueta" element
     */
    public java.lang.String getEtiqueta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ETIQUETA$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "etiqueta" element
     */
    public org.apache.xmlbeans.XmlString xgetEtiqueta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ETIQUETA$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "etiqueta" element
     */
    public boolean isSetEtiqueta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ETIQUETA$10) != 0;
        }
    }
    
    /**
     * Sets the "etiqueta" element
     */
    public void setEtiqueta(java.lang.String etiqueta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ETIQUETA$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ETIQUETA$10);
            }
            target.setStringValue(etiqueta);
        }
    }
    
    /**
     * Sets (as xml) the "etiqueta" element
     */
    public void xsetEtiqueta(org.apache.xmlbeans.XmlString etiqueta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ETIQUETA$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ETIQUETA$10);
            }
            target.set(etiqueta);
        }
    }
    
    /**
     * Unsets the "etiqueta" element
     */
    public void unsetEtiqueta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ETIQUETA$10, 0);
        }
    }
}
