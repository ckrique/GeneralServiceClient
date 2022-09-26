/*
 * XML Type:  Bet
 * Namespace: http://services.soapworldcupbet.worldcupbet.com.br/xsd
 * Java type: br.com.worldcupbet.soapworldcupbet.services.xsd.Bet
 *
 * Automatically generated - do not modify.
 */
package br.com.worldcupbet.soapworldcupbet.services.xsd.impl;
/**
 * An XML Bet(@http://services.soapworldcupbet.worldcupbet.com.br/xsd).
 *
 * This is a complex type.
 */
public class BetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.worldcupbet.soapworldcupbet.services.xsd.Bet
{
    
    public BetImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BETVALUE$0 = 
        new javax.xml.namespace.QName("http://services.soapworldcupbet.worldcupbet.com.br/xsd", "betValue");
    private static final javax.xml.namespace.QName PUNTERNAME$2 = 
        new javax.xml.namespace.QName("http://services.soapworldcupbet.worldcupbet.com.br/xsd", "punterName");
    private static final javax.xml.namespace.QName TEAMONWHICHBET$4 = 
        new javax.xml.namespace.QName("http://services.soapworldcupbet.worldcupbet.com.br/xsd", "teamOnWhichBet");
    
    
    /**
     * Gets the "betValue" element
     */
    public double getBetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BETVALUE$0, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "betValue" element
     */
    public org.apache.xmlbeans.XmlDouble xgetBetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(BETVALUE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "betValue" element
     */
    public boolean isSetBetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BETVALUE$0) != 0;
        }
    }
    
    /**
     * Sets the "betValue" element
     */
    public void setBetValue(double betValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BETVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BETVALUE$0);
            }
            target.setDoubleValue(betValue);
        }
    }
    
    /**
     * Sets (as xml) the "betValue" element
     */
    public void xsetBetValue(org.apache.xmlbeans.XmlDouble betValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(BETVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(BETVALUE$0);
            }
            target.set(betValue);
        }
    }
    
    /**
     * Unsets the "betValue" element
     */
    public void unsetBetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BETVALUE$0, 0);
        }
    }
    
    /**
     * Gets the "punterName" element
     */
    public java.lang.String getPunterName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUNTERNAME$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUNTERNAME$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUNTERNAME$2, 0);
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
            return get_store().count_elements(PUNTERNAME$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUNTERNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PUNTERNAME$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUNTERNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PUNTERNAME$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUNTERNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PUNTERNAME$2);
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
            get_store().remove_element(PUNTERNAME$2, 0);
        }
    }
    
    /**
     * Gets the "teamOnWhichBet" element
     */
    public java.lang.String getTeamOnWhichBet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEAMONWHICHBET$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "teamOnWhichBet" element
     */
    public org.apache.xmlbeans.XmlString xgetTeamOnWhichBet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEAMONWHICHBET$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "teamOnWhichBet" element
     */
    public boolean isNilTeamOnWhichBet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEAMONWHICHBET$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "teamOnWhichBet" element
     */
    public boolean isSetTeamOnWhichBet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEAMONWHICHBET$4) != 0;
        }
    }
    
    /**
     * Sets the "teamOnWhichBet" element
     */
    public void setTeamOnWhichBet(java.lang.String teamOnWhichBet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEAMONWHICHBET$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEAMONWHICHBET$4);
            }
            target.setStringValue(teamOnWhichBet);
        }
    }
    
    /**
     * Sets (as xml) the "teamOnWhichBet" element
     */
    public void xsetTeamOnWhichBet(org.apache.xmlbeans.XmlString teamOnWhichBet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEAMONWHICHBET$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TEAMONWHICHBET$4);
            }
            target.set(teamOnWhichBet);
        }
    }
    
    /**
     * Nils the "teamOnWhichBet" element
     */
    public void setNilTeamOnWhichBet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEAMONWHICHBET$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TEAMONWHICHBET$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "teamOnWhichBet" element
     */
    public void unsetTeamOnWhichBet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEAMONWHICHBET$4, 0);
        }
    }
}
