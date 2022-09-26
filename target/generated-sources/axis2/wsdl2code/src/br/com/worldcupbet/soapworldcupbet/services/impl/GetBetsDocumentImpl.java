/*
 * An XML document type.
 * Localname: getBets
 * Namespace: http://services.soapworldcupbet.worldcupbet.com.br
 * Java type: br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.worldcupbet.soapworldcupbet.services.impl;
/**
 * A document containing one getBets(@http://services.soapworldcupbet.worldcupbet.com.br) element.
 *
 * This is a complex type.
 */
public class GetBetsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument
{
    
    public GetBetsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETBETS$0 = 
        new javax.xml.namespace.QName("http://services.soapworldcupbet.worldcupbet.com.br", "getBets");
    
    
    /**
     * Gets the "getBets" element
     */
    public br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument.GetBets getGetBets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument.GetBets target = null;
            target = (br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument.GetBets)get_store().find_element_user(GETBETS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getBets" element
     */
    public void setGetBets(br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument.GetBets getBets)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument.GetBets target = null;
            target = (br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument.GetBets)get_store().find_element_user(GETBETS$0, 0);
            if (target == null)
            {
                target = (br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument.GetBets)get_store().add_element_user(GETBETS$0);
            }
            target.set(getBets);
        }
    }
    
    /**
     * Appends and returns a new empty "getBets" element
     */
    public br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument.GetBets addNewGetBets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument.GetBets target = null;
            target = (br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument.GetBets)get_store().add_element_user(GETBETS$0);
            return target;
        }
    }
    /**
     * An XML getBets(@http://services.soapworldcupbet.worldcupbet.com.br).
     *
     * This is a complex type.
     */
    public static class GetBetsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument.GetBets
    {
        
        public GetBetsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
