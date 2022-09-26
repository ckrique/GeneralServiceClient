/*
 * An XML document type.
 * Localname: updateBet
 * Namespace: http://services.soapworldcupbet.worldcupbet.com.br
 * Java type: br.com.worldcupbet.soapworldcupbet.services.UpdateBetDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.worldcupbet.soapworldcupbet.services.impl;
/**
 * A document containing one updateBet(@http://services.soapworldcupbet.worldcupbet.com.br) element.
 *
 * This is a complex type.
 */
public class UpdateBetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.worldcupbet.soapworldcupbet.services.UpdateBetDocument
{
    
    public UpdateBetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATEBET$0 = 
        new javax.xml.namespace.QName("http://services.soapworldcupbet.worldcupbet.com.br", "updateBet");
    
    
    /**
     * Gets the "updateBet" element
     */
    public br.com.worldcupbet.soapworldcupbet.services.UpdateBetDocument.UpdateBet getUpdateBet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.worldcupbet.soapworldcupbet.services.UpdateBetDocument.UpdateBet target = null;
            target = (br.com.worldcupbet.soapworldcupbet.services.UpdateBetDocument.UpdateBet)get_store().find_element_user(UPDATEBET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "updateBet" element
     */
    public void setUpdateBet(br.com.worldcupbet.soapworldcupbet.services.UpdateBetDocument.UpdateBet updateBet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.worldcupbet.soapworldcupbet.services.UpdateBetDocument.UpdateBet target = null;
            target = (br.com.worldcupbet.soapworldcupbet.services.UpdateBetDocument.UpdateBet)get_store().find_element_user(UPDATEBET$0, 0);
            if (target == null)
            {
                target = (br.com.worldcupbet.soapworldcupbet.services.UpdateBetDocument.UpdateBet)get_store().add_element_user(UPDATEBET$0);
            }
            target.set(updateBet);
        }
    }
    
    /**
     * Appends and returns a new empty "updateBet" element
     */
    public br.com.worldcupbet.soapworldcupbet.services.UpdateBetDocument.UpdateBet addNewUpdateBet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.worldcupbet.soapworldcupbet.services.UpdateBetDocument.UpdateBet target = null;
            target = (br.com.worldcupbet.soapworldcupbet.services.UpdateBetDocument.UpdateBet)get_store().add_element_user(UPDATEBET$0);
            return target;
        }
    }
    /**
     * An XML updateBet(@http://services.soapworldcupbet.worldcupbet.com.br).
     *
     * This is a complex type.
     */
    public static class UpdateBetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.worldcupbet.soapworldcupbet.services.UpdateBetDocument.UpdateBet
    {
        
        public UpdateBetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BET$0 = 
            new javax.xml.namespace.QName("http://services.soapworldcupbet.worldcupbet.com.br", "bet");
        
        
        /**
         * Gets the "bet" element
         */
        public br.com.worldcupbet.soapworldcupbet.services.xsd.Bet getBet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.worldcupbet.soapworldcupbet.services.xsd.Bet target = null;
                target = (br.com.worldcupbet.soapworldcupbet.services.xsd.Bet)get_store().find_element_user(BET$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "bet" element
         */
        public boolean isNilBet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.worldcupbet.soapworldcupbet.services.xsd.Bet target = null;
                target = (br.com.worldcupbet.soapworldcupbet.services.xsd.Bet)get_store().find_element_user(BET$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "bet" element
         */
        public boolean isSetBet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BET$0) != 0;
            }
        }
        
        /**
         * Sets the "bet" element
         */
        public void setBet(br.com.worldcupbet.soapworldcupbet.services.xsd.Bet bet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.worldcupbet.soapworldcupbet.services.xsd.Bet target = null;
                target = (br.com.worldcupbet.soapworldcupbet.services.xsd.Bet)get_store().find_element_user(BET$0, 0);
                if (target == null)
                {
                    target = (br.com.worldcupbet.soapworldcupbet.services.xsd.Bet)get_store().add_element_user(BET$0);
                }
                target.set(bet);
            }
        }
        
        /**
         * Appends and returns a new empty "bet" element
         */
        public br.com.worldcupbet.soapworldcupbet.services.xsd.Bet addNewBet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.worldcupbet.soapworldcupbet.services.xsd.Bet target = null;
                target = (br.com.worldcupbet.soapworldcupbet.services.xsd.Bet)get_store().add_element_user(BET$0);
                return target;
            }
        }
        
        /**
         * Nils the "bet" element
         */
        public void setNilBet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.worldcupbet.soapworldcupbet.services.xsd.Bet target = null;
                target = (br.com.worldcupbet.soapworldcupbet.services.xsd.Bet)get_store().find_element_user(BET$0, 0);
                if (target == null)
                {
                    target = (br.com.worldcupbet.soapworldcupbet.services.xsd.Bet)get_store().add_element_user(BET$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "bet" element
         */
        public void unsetBet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BET$0, 0);
            }
        }
    }
}
