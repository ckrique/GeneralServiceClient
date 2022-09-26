/*
 * An XML document type.
 * Localname: getBetsResponse
 * Namespace: http://services.soapworldcupbet.worldcupbet.com.br
 * Java type: br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.worldcupbet.soapworldcupbet.services.impl;
/**
 * A document containing one getBetsResponse(@http://services.soapworldcupbet.worldcupbet.com.br) element.
 *
 * This is a complex type.
 */
public class GetBetsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument
{
    
    public GetBetsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETBETSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://services.soapworldcupbet.worldcupbet.com.br", "getBetsResponse");
    
    
    /**
     * Gets the "getBetsResponse" element
     */
    public br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument.GetBetsResponse getGetBetsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument.GetBetsResponse target = null;
            target = (br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument.GetBetsResponse)get_store().find_element_user(GETBETSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getBetsResponse" element
     */
    public void setGetBetsResponse(br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument.GetBetsResponse getBetsResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument.GetBetsResponse target = null;
            target = (br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument.GetBetsResponse)get_store().find_element_user(GETBETSRESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument.GetBetsResponse)get_store().add_element_user(GETBETSRESPONSE$0);
            }
            target.set(getBetsResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getBetsResponse" element
     */
    public br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument.GetBetsResponse addNewGetBetsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument.GetBetsResponse target = null;
            target = (br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument.GetBetsResponse)get_store().add_element_user(GETBETSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getBetsResponse(@http://services.soapworldcupbet.worldcupbet.com.br).
     *
     * This is a complex type.
     */
    public static class GetBetsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument.GetBetsResponse
    {
        
        public GetBetsResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("http://services.soapworldcupbet.worldcupbet.com.br", "return");
        
        
        /**
         * Gets array of all "return" elements
         */
        public br.com.worldcupbet.soapworldcupbet.services.xsd.Bet[] getReturnArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RETURN$0, targetList);
                br.com.worldcupbet.soapworldcupbet.services.xsd.Bet[] result = new br.com.worldcupbet.soapworldcupbet.services.xsd.Bet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "return" element
         */
        public br.com.worldcupbet.soapworldcupbet.services.xsd.Bet getReturnArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.worldcupbet.soapworldcupbet.services.xsd.Bet target = null;
                target = (br.com.worldcupbet.soapworldcupbet.services.xsd.Bet)get_store().find_element_user(RETURN$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Tests for nil ith "return" element
         */
        public boolean isNilReturnArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.worldcupbet.soapworldcupbet.services.xsd.Bet target = null;
                target = (br.com.worldcupbet.soapworldcupbet.services.xsd.Bet)get_store().find_element_user(RETURN$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "return" element
         */
        public int sizeOfReturnArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RETURN$0);
            }
        }
        
        /**
         * Sets array of all "return" element
         */
        public void setReturnArray(br.com.worldcupbet.soapworldcupbet.services.xsd.Bet[] xreturnArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(xreturnArray, RETURN$0);
            }
        }
        
        /**
         * Sets ith "return" element
         */
        public void setReturnArray(int i, br.com.worldcupbet.soapworldcupbet.services.xsd.Bet xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.worldcupbet.soapworldcupbet.services.xsd.Bet target = null;
                target = (br.com.worldcupbet.soapworldcupbet.services.xsd.Bet)get_store().find_element_user(RETURN$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(xreturn);
            }
        }
        
        /**
         * Nils the ith "return" element
         */
        public void setNilReturnArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.worldcupbet.soapworldcupbet.services.xsd.Bet target = null;
                target = (br.com.worldcupbet.soapworldcupbet.services.xsd.Bet)get_store().find_element_user(RETURN$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "return" element
         */
        public br.com.worldcupbet.soapworldcupbet.services.xsd.Bet insertNewReturn(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.worldcupbet.soapworldcupbet.services.xsd.Bet target = null;
                target = (br.com.worldcupbet.soapworldcupbet.services.xsd.Bet)get_store().insert_element_user(RETURN$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "return" element
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
         * Removes the ith "return" element
         */
        public void removeReturn(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RETURN$0, i);
            }
        }
    }
}
