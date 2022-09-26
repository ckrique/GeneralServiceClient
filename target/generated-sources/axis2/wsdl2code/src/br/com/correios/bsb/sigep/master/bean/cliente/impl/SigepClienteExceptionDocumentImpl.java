/*
 * An XML document type.
 * Localname: SigepClienteException
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one SigepClienteException(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class SigepClienteExceptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument
{
    
    public SigepClienteExceptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SIGEPCLIENTEEXCEPTION$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException");
    
    
    /**
     * Gets the "SigepClienteException" element
     */
    public java.lang.String getSigepClienteException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGEPCLIENTEEXCEPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SigepClienteException" element
     */
    public org.apache.xmlbeans.XmlString xgetSigepClienteException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIGEPCLIENTEEXCEPTION$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SigepClienteException" element
     */
    public boolean isNilSigepClienteException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIGEPCLIENTEEXCEPTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SigepClienteException" element
     */
    public void setSigepClienteException(java.lang.String sigepClienteException)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGEPCLIENTEEXCEPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIGEPCLIENTEEXCEPTION$0);
            }
            target.setStringValue(sigepClienteException);
        }
    }
    
    /**
     * Sets (as xml) the "SigepClienteException" element
     */
    public void xsetSigepClienteException(org.apache.xmlbeans.XmlString sigepClienteException)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIGEPCLIENTEEXCEPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SIGEPCLIENTEEXCEPTION$0);
            }
            target.set(sigepClienteException);
        }
    }
    
    /**
     * Nils the "SigepClienteException" element
     */
    public void setNilSigepClienteException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIGEPCLIENTEEXCEPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SIGEPCLIENTEEXCEPTION$0);
            }
            target.setNil();
        }
    }
}
