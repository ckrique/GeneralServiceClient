/*
 * An XML document type.
 * Localname: AutenticacaoException
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one AutenticacaoException(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class AutenticacaoExceptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument
{
    
    public AutenticacaoExceptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTENTICACAOEXCEPTION$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException");
    
    
    /**
     * Gets the "AutenticacaoException" element
     */
    public java.lang.String getAutenticacaoException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTENTICACAOEXCEPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AutenticacaoException" element
     */
    public org.apache.xmlbeans.XmlString xgetAutenticacaoException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTENTICACAOEXCEPTION$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "AutenticacaoException" element
     */
    public boolean isNilAutenticacaoException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTENTICACAOEXCEPTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "AutenticacaoException" element
     */
    public void setAutenticacaoException(java.lang.String autenticacaoException)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTENTICACAOEXCEPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTENTICACAOEXCEPTION$0);
            }
            target.setStringValue(autenticacaoException);
        }
    }
    
    /**
     * Sets (as xml) the "AutenticacaoException" element
     */
    public void xsetAutenticacaoException(org.apache.xmlbeans.XmlString autenticacaoException)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTENTICACAOEXCEPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AUTENTICACAOEXCEPTION$0);
            }
            target.set(autenticacaoException);
        }
    }
    
    /**
     * Nils the "AutenticacaoException" element
     */
    public void setNilAutenticacaoException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTENTICACAOEXCEPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AUTENTICACAOEXCEPTION$0);
            }
            target.setNil();
        }
    }
}
