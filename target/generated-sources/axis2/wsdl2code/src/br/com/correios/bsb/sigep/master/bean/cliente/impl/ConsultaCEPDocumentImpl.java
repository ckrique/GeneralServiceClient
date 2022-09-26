/*
 * An XML document type.
 * Localname: consultaCEP
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEPDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one consultaCEP(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class ConsultaCEPDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEPDocument
{
    
    public ConsultaCEPDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONSULTACEP$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "consultaCEP");
    
    
    /**
     * Gets the "consultaCEP" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEP getConsultaCEP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEP)get_store().find_element_user(CONSULTACEP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "consultaCEP" element
     */
    public void setConsultaCEP(br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEP consultaCEP)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEP)get_store().find_element_user(CONSULTACEP$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEP)get_store().add_element_user(CONSULTACEP$0);
            }
            target.set(consultaCEP);
        }
    }
    
    /**
     * Appends and returns a new empty "consultaCEP" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEP addNewConsultaCEP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEP)get_store().add_element_user(CONSULTACEP$0);
            return target;
        }
    }
}
