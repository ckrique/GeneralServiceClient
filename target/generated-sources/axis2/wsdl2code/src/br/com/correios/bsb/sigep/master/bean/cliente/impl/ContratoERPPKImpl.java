/*
 * XML Type:  contratoERPPK
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ContratoERPPK
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML contratoERPPK(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class ContratoERPPKImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.ContratoERPPK
{
    
    public ContratoERPPKImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIRETORIA$0 = 
        new javax.xml.namespace.QName("", "diretoria");
    private static final javax.xml.namespace.QName NUMERO$2 = 
        new javax.xml.namespace.QName("", "numero");
    
    
    /**
     * Gets the "diretoria" element
     */
    public long getDiretoria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRETORIA$0, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "diretoria" element
     */
    public org.apache.xmlbeans.XmlLong xgetDiretoria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(DIRETORIA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "diretoria" element
     */
    public void setDiretoria(long diretoria)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRETORIA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIRETORIA$0);
            }
            target.setLongValue(diretoria);
        }
    }
    
    /**
     * Sets (as xml) the "diretoria" element
     */
    public void xsetDiretoria(org.apache.xmlbeans.XmlLong diretoria)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(DIRETORIA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(DIRETORIA$0);
            }
            target.set(diretoria);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMERO$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMERO$2, 0);
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
            return get_store().count_elements(NUMERO$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMERO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMERO$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMERO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMERO$2);
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
            get_store().remove_element(NUMERO$2, 0);
        }
    }
}
