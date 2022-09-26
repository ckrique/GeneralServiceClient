/*
 * An XML document type.
 * Localname: consultaCEPResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEPResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one consultaCEPResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class ConsultaCEPResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEPResponseDocument
{
    
    public ConsultaCEPResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONSULTACEPRESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "consultaCEPResponse");
    
    
    /**
     * Gets the "consultaCEPResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEPResponse getConsultaCEPResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEPResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEPResponse)get_store().find_element_user(CONSULTACEPRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "consultaCEPResponse" element
     */
    public void setConsultaCEPResponse(br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEPResponse consultaCEPResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEPResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEPResponse)get_store().find_element_user(CONSULTACEPRESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEPResponse)get_store().add_element_user(CONSULTACEPRESPONSE$0);
            }
            target.set(consultaCEPResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "consultaCEPResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEPResponse addNewConsultaCEPResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEPResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEPResponse)get_store().add_element_user(CONSULTACEPRESPONSE$0);
            return target;
        }
    }
}
