/*
 * An XML document type.
 * Localname: Exception
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ExceptionDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one Exception(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class ExceptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.ExceptionDocument
{
    
    public ExceptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXCEPTION$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "Exception");
    
    
    /**
     * Gets the "Exception" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.Exception getException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.Exception target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.Exception)get_store().find_element_user(EXCEPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Exception" element
     */
    public void setException(br.com.correios.bsb.sigep.master.bean.cliente.Exception exception)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.Exception target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.Exception)get_store().find_element_user(EXCEPTION$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.Exception)get_store().add_element_user(EXCEPTION$0);
            }
            target.set(exception);
        }
    }
    
    /**
     * Appends and returns a new empty "Exception" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.Exception addNewException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.Exception target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.Exception)get_store().add_element_user(EXCEPTION$0);
            return target;
        }
    }
}
