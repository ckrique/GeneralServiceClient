/*
 * An XML document type.
 * Localname: WorldCupBetServiceException
 * Namespace: http://services.soapworldcupbet.worldcupbet.com.br
 * Java type: br.com.worldcupbet.soapworldcupbet.services.WorldCupBetServiceExceptionDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.worldcupbet.soapworldcupbet.services.impl;
/**
 * A document containing one WorldCupBetServiceException(@http://services.soapworldcupbet.worldcupbet.com.br) element.
 *
 * This is a complex type.
 */
public class WorldCupBetServiceExceptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.worldcupbet.soapworldcupbet.services.WorldCupBetServiceExceptionDocument
{
    
    public WorldCupBetServiceExceptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WORLDCUPBETSERVICEEXCEPTION$0 = 
        new javax.xml.namespace.QName("http://services.soapworldcupbet.worldcupbet.com.br", "WorldCupBetServiceException");
    
    
    /**
     * Gets the "WorldCupBetServiceException" element
     */
    public br.com.worldcupbet.soapworldcupbet.services.WorldCupBetServiceExceptionDocument.WorldCupBetServiceException getWorldCupBetServiceException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.worldcupbet.soapworldcupbet.services.WorldCupBetServiceExceptionDocument.WorldCupBetServiceException target = null;
            target = (br.com.worldcupbet.soapworldcupbet.services.WorldCupBetServiceExceptionDocument.WorldCupBetServiceException)get_store().find_element_user(WORLDCUPBETSERVICEEXCEPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "WorldCupBetServiceException" element
     */
    public void setWorldCupBetServiceException(br.com.worldcupbet.soapworldcupbet.services.WorldCupBetServiceExceptionDocument.WorldCupBetServiceException worldCupBetServiceException)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.worldcupbet.soapworldcupbet.services.WorldCupBetServiceExceptionDocument.WorldCupBetServiceException target = null;
            target = (br.com.worldcupbet.soapworldcupbet.services.WorldCupBetServiceExceptionDocument.WorldCupBetServiceException)get_store().find_element_user(WORLDCUPBETSERVICEEXCEPTION$0, 0);
            if (target == null)
            {
                target = (br.com.worldcupbet.soapworldcupbet.services.WorldCupBetServiceExceptionDocument.WorldCupBetServiceException)get_store().add_element_user(WORLDCUPBETSERVICEEXCEPTION$0);
            }
            target.set(worldCupBetServiceException);
        }
    }
    
    /**
     * Appends and returns a new empty "WorldCupBetServiceException" element
     */
    public br.com.worldcupbet.soapworldcupbet.services.WorldCupBetServiceExceptionDocument.WorldCupBetServiceException addNewWorldCupBetServiceException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.worldcupbet.soapworldcupbet.services.WorldCupBetServiceExceptionDocument.WorldCupBetServiceException target = null;
            target = (br.com.worldcupbet.soapworldcupbet.services.WorldCupBetServiceExceptionDocument.WorldCupBetServiceException)get_store().add_element_user(WORLDCUPBETSERVICEEXCEPTION$0);
            return target;
        }
    }
    /**
     * An XML WorldCupBetServiceException(@http://services.soapworldcupbet.worldcupbet.com.br).
     *
     * This is a complex type.
     */
    public static class WorldCupBetServiceExceptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.worldcupbet.soapworldcupbet.services.WorldCupBetServiceExceptionDocument.WorldCupBetServiceException
    {
        
        public WorldCupBetServiceExceptionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName WORLDCUPBETSERVICEEXCEPTION$0 = 
            new javax.xml.namespace.QName("http://services.soapworldcupbet.worldcupbet.com.br", "WorldCupBetServiceException");
        
        
        /**
         * Gets the "WorldCupBetServiceException" element
         */
        public br.com.worldcupbet.soapworldcupbet.services.Exception getWorldCupBetServiceException()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.worldcupbet.soapworldcupbet.services.Exception target = null;
                target = (br.com.worldcupbet.soapworldcupbet.services.Exception)get_store().find_element_user(WORLDCUPBETSERVICEEXCEPTION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "WorldCupBetServiceException" element
         */
        public boolean isNilWorldCupBetServiceException()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.worldcupbet.soapworldcupbet.services.Exception target = null;
                target = (br.com.worldcupbet.soapworldcupbet.services.Exception)get_store().find_element_user(WORLDCUPBETSERVICEEXCEPTION$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "WorldCupBetServiceException" element
         */
        public boolean isSetWorldCupBetServiceException()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WORLDCUPBETSERVICEEXCEPTION$0) != 0;
            }
        }
        
        /**
         * Sets the "WorldCupBetServiceException" element
         */
        public void setWorldCupBetServiceException(br.com.worldcupbet.soapworldcupbet.services.Exception worldCupBetServiceException)
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.worldcupbet.soapworldcupbet.services.Exception target = null;
                target = (br.com.worldcupbet.soapworldcupbet.services.Exception)get_store().find_element_user(WORLDCUPBETSERVICEEXCEPTION$0, 0);
                if (target == null)
                {
                    target = (br.com.worldcupbet.soapworldcupbet.services.Exception)get_store().add_element_user(WORLDCUPBETSERVICEEXCEPTION$0);
                }
                target.set(worldCupBetServiceException);
            }
        }
        
        /**
         * Appends and returns a new empty "WorldCupBetServiceException" element
         */
        public br.com.worldcupbet.soapworldcupbet.services.Exception addNewWorldCupBetServiceException()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.worldcupbet.soapworldcupbet.services.Exception target = null;
                target = (br.com.worldcupbet.soapworldcupbet.services.Exception)get_store().add_element_user(WORLDCUPBETSERVICEEXCEPTION$0);
                return target;
            }
        }
        
        /**
         * Nils the "WorldCupBetServiceException" element
         */
        public void setNilWorldCupBetServiceException()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.worldcupbet.soapworldcupbet.services.Exception target = null;
                target = (br.com.worldcupbet.soapworldcupbet.services.Exception)get_store().find_element_user(WORLDCUPBETSERVICEEXCEPTION$0, 0);
                if (target == null)
                {
                    target = (br.com.worldcupbet.soapworldcupbet.services.Exception)get_store().add_element_user(WORLDCUPBETSERVICEEXCEPTION$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "WorldCupBetServiceException" element
         */
        public void unsetWorldCupBetServiceException()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WORLDCUPBETSERVICEEXCEPTION$0, 0);
            }
        }
    }
}
