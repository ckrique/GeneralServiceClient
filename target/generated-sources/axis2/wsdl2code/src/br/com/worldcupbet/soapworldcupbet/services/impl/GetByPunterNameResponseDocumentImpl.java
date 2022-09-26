/*
 * An XML document type.
 * Localname: getByPunterNameResponse
 * Namespace: http://services.soapworldcupbet.worldcupbet.com.br
 * Java type: br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.worldcupbet.soapworldcupbet.services.impl;
/**
 * A document containing one getByPunterNameResponse(@http://services.soapworldcupbet.worldcupbet.com.br) element.
 *
 * This is a complex type.
 */
public class GetByPunterNameResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument
{
    
    public GetByPunterNameResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETBYPUNTERNAMERESPONSE$0 = 
        new javax.xml.namespace.QName("http://services.soapworldcupbet.worldcupbet.com.br", "getByPunterNameResponse");
    
    
    /**
     * Gets the "getByPunterNameResponse" element
     */
    public br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument.GetByPunterNameResponse getGetByPunterNameResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument.GetByPunterNameResponse target = null;
            target = (br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument.GetByPunterNameResponse)get_store().find_element_user(GETBYPUNTERNAMERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getByPunterNameResponse" element
     */
    public void setGetByPunterNameResponse(br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument.GetByPunterNameResponse getByPunterNameResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument.GetByPunterNameResponse target = null;
            target = (br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument.GetByPunterNameResponse)get_store().find_element_user(GETBYPUNTERNAMERESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument.GetByPunterNameResponse)get_store().add_element_user(GETBYPUNTERNAMERESPONSE$0);
            }
            target.set(getByPunterNameResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getByPunterNameResponse" element
     */
    public br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument.GetByPunterNameResponse addNewGetByPunterNameResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument.GetByPunterNameResponse target = null;
            target = (br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument.GetByPunterNameResponse)get_store().add_element_user(GETBYPUNTERNAMERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getByPunterNameResponse(@http://services.soapworldcupbet.worldcupbet.com.br).
     *
     * This is a complex type.
     */
    public static class GetByPunterNameResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument.GetByPunterNameResponse
    {
        
        public GetByPunterNameResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("http://services.soapworldcupbet.worldcupbet.com.br", "return");
        
        
        /**
         * Gets the "return" element
         */
        public br.com.worldcupbet.soapworldcupbet.services.xsd.Bet getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.worldcupbet.soapworldcupbet.services.xsd.Bet target = null;
                target = (br.com.worldcupbet.soapworldcupbet.services.xsd.Bet)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "return" element
         */
        public boolean isNilReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.worldcupbet.soapworldcupbet.services.xsd.Bet target = null;
                target = (br.com.worldcupbet.soapworldcupbet.services.xsd.Bet)get_store().find_element_user(RETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "return" element
         */
        public boolean isSetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RETURN$0) != 0;
            }
        }
        
        /**
         * Sets the "return" element
         */
        public void setReturn(br.com.worldcupbet.soapworldcupbet.services.xsd.Bet xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.worldcupbet.soapworldcupbet.services.xsd.Bet target = null;
                target = (br.com.worldcupbet.soapworldcupbet.services.xsd.Bet)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (br.com.worldcupbet.soapworldcupbet.services.xsd.Bet)get_store().add_element_user(RETURN$0);
                }
                target.set(xreturn);
            }
        }
        
        /**
         * Appends and returns a new empty "return" element
         */
        public br.com.worldcupbet.soapworldcupbet.services.xsd.Bet addNewReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.worldcupbet.soapworldcupbet.services.xsd.Bet target = null;
                target = (br.com.worldcupbet.soapworldcupbet.services.xsd.Bet)get_store().add_element_user(RETURN$0);
                return target;
            }
        }
        
        /**
         * Nils the "return" element
         */
        public void setNilReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.worldcupbet.soapworldcupbet.services.xsd.Bet target = null;
                target = (br.com.worldcupbet.soapworldcupbet.services.xsd.Bet)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (br.com.worldcupbet.soapworldcupbet.services.xsd.Bet)get_store().add_element_user(RETURN$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "return" element
         */
        public void unsetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RETURN$0, 0);
            }
        }
    }
}
