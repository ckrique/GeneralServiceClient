/*
 * An XML document type.
 * Localname: SQLException
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.SQLExceptionDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one SQLException(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class SQLExceptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.SQLExceptionDocument
{
    
    public SQLExceptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SQLEXCEPTION$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SQLException");
    
    
    /**
     * Gets the "SQLException" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.SQLException getSQLException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.SQLException target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.SQLException)get_store().find_element_user(SQLEXCEPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SQLException" element
     */
    public void setSQLException(br.com.correios.bsb.sigep.master.bean.cliente.SQLException sqlException)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.SQLException target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.SQLException)get_store().find_element_user(SQLEXCEPTION$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.SQLException)get_store().add_element_user(SQLEXCEPTION$0);
            }
            target.set(sqlException);
        }
    }
    
    /**
     * Appends and returns a new empty "SQLException" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.SQLException addNewSQLException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.SQLException target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.SQLException)get_store().add_element_user(SQLEXCEPTION$0);
            return target;
        }
    }
}
