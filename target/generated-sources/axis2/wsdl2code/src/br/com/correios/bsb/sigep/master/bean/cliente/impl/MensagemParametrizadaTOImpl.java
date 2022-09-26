/*
 * XML Type:  mensagemParametrizadaTO
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML mensagemParametrizadaTO(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class MensagemParametrizadaTOImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO
{
    
    public MensagemParametrizadaTOImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MENSAGEM$0 = 
        new javax.xml.namespace.QName("", "mensagem");
    private static final javax.xml.namespace.QName TIPO$2 = 
        new javax.xml.namespace.QName("", "tipo");
    private static final javax.xml.namespace.QName TITULO$4 = 
        new javax.xml.namespace.QName("", "titulo");
    
    
    /**
     * Gets the "mensagem" element
     */
    public java.lang.String getMensagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MENSAGEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mensagem" element
     */
    public org.apache.xmlbeans.XmlString xgetMensagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MENSAGEM$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "mensagem" element
     */
    public boolean isSetMensagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MENSAGEM$0) != 0;
        }
    }
    
    /**
     * Sets the "mensagem" element
     */
    public void setMensagem(java.lang.String mensagem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MENSAGEM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MENSAGEM$0);
            }
            target.setStringValue(mensagem);
        }
    }
    
    /**
     * Sets (as xml) the "mensagem" element
     */
    public void xsetMensagem(org.apache.xmlbeans.XmlString mensagem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MENSAGEM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MENSAGEM$0);
            }
            target.set(mensagem);
        }
    }
    
    /**
     * Unsets the "mensagem" element
     */
    public void unsetMensagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MENSAGEM$0, 0);
        }
    }
    
    /**
     * Gets the "tipo" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.TipoMensagem.Enum getTipo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPO$2, 0);
            if (target == null)
            {
                return null;
            }
            return (br.com.correios.bsb.sigep.master.bean.cliente.TipoMensagem.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "tipo" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.TipoMensagem xgetTipo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.TipoMensagem target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.TipoMensagem)get_store().find_element_user(TIPO$2, 0);
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
            return get_store().count_elements(TIPO$2) != 0;
        }
    }
    
    /**
     * Sets the "tipo" element
     */
    public void setTipo(br.com.correios.bsb.sigep.master.bean.cliente.TipoMensagem.Enum tipo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPO$2);
            }
            target.setEnumValue(tipo);
        }
    }
    
    /**
     * Sets (as xml) the "tipo" element
     */
    public void xsetTipo(br.com.correios.bsb.sigep.master.bean.cliente.TipoMensagem tipo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.TipoMensagem target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.TipoMensagem)get_store().find_element_user(TIPO$2, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.TipoMensagem)get_store().add_element_user(TIPO$2);
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
            get_store().remove_element(TIPO$2, 0);
        }
    }
    
    /**
     * Gets the "titulo" element
     */
    public java.lang.String getTitulo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITULO$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "titulo" element
     */
    public org.apache.xmlbeans.XmlString xgetTitulo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITULO$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "titulo" element
     */
    public boolean isSetTitulo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TITULO$4) != 0;
        }
    }
    
    /**
     * Sets the "titulo" element
     */
    public void setTitulo(java.lang.String titulo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITULO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITULO$4);
            }
            target.setStringValue(titulo);
        }
    }
    
    /**
     * Sets (as xml) the "titulo" element
     */
    public void xsetTitulo(org.apache.xmlbeans.XmlString titulo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITULO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITULO$4);
            }
            target.set(titulo);
        }
    }
    
    /**
     * Unsets the "titulo" element
     */
    public void unsetTitulo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TITULO$4, 0);
        }
    }
}
