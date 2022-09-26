/*
 * An XML document type.
 * Localname: delete
 * Namespace: http://services.soapworldcupbet.worldcupbet.com.br
 * Java type: br.com.worldcupbet.soapworldcupbet.services.DeleteDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.worldcupbet.soapworldcupbet.services.impl;
/**
 * A document containing one delete(@http://services.soapworldcupbet.worldcupbet.com.br) element.
 *
 * This is a complex type.
 */
public class DeleteDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.worldcupbet.soapworldcupbet.services.DeleteDocument
{
    
    public DeleteDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETE$0 = 
        new javax.xml.namespace.QName("http://services.soapworldcupbet.worldcupbet.com.br", "delete");
    
    
    /**
     * Gets the "delete" element
     */
    public br.com.worldcupbet.soapworldcupbet.services.DeleteDocument.Delete getDelete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.worldcupbet.soapworldcupbet.services.DeleteDocument.Delete target = null;
            target = (br.com.worldcupbet.soapworldcupbet.services.DeleteDocument.Delete)get_store().find_element_user(DELETE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "delete" element
     */
    public void setDelete(br.com.worldcupbet.soapworldcupbet.services.DeleteDocument.Delete delete)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.worldcupbet.soapworldcupbet.services.DeleteDocument.Delete target = null;
            target = (br.com.worldcupbet.soapworldcupbet.services.DeleteDocument.Delete)get_store().find_element_user(DELETE$0, 0);
            if (target == null)
            {
                target = (br.com.worldcupbet.soapworldcupbet.services.DeleteDocument.Delete)get_store().add_element_user(DELETE$0);
            }
            target.set(delete);
        }
    }
    
    /**
     * Appends and returns a new empty "delete" element
     */
    public br.com.worldcupbet.soapworldcupbet.services.DeleteDocument.Delete addNewDelete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.worldcupbet.soapworldcupbet.services.DeleteDocument.Delete target = null;
            target = (br.com.worldcupbet.soapworldcupbet.services.DeleteDocument.Delete)get_store().add_element_user(DELETE$0);
            return target;
        }
    }
    /**
     * An XML delete(@http://services.soapworldcupbet.worldcupbet.com.br).
     *
     * This is a complex type.
     */
    public static class DeleteImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.worldcupbet.soapworldcupbet.services.DeleteDocument.Delete
    {
        
        public DeleteImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PUNTERNAME$0 = 
            new javax.xml.namespace.QName("http://services.soapworldcupbet.worldcupbet.com.br", "punterName");
        
        
        /**
         * Gets the "punterName" element
         */
        public java.lang.String getPunterName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUNTERNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "punterName" element
         */
        public org.apache.xmlbeans.XmlString xgetPunterName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUNTERNAME$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "punterName" element
         */
        public boolean isNilPunterName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUNTERNAME$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "punterName" element
         */
        public boolean isSetPunterName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PUNTERNAME$0) != 0;
            }
        }
        
        /**
         * Sets the "punterName" element
         */
        public void setPunterName(java.lang.String punterName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUNTERNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PUNTERNAME$0);
                }
                target.setStringValue(punterName);
            }
        }
        
        /**
         * Sets (as xml) the "punterName" element
         */
        public void xsetPunterName(org.apache.xmlbeans.XmlString punterName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUNTERNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PUNTERNAME$0);
                }
                target.set(punterName);
            }
        }
        
        /**
         * Nils the "punterName" element
         */
        public void setNilPunterName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUNTERNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PUNTERNAME$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "punterName" element
         */
        public void unsetPunterName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PUNTERNAME$0, 0);
            }
        }
    }
}
