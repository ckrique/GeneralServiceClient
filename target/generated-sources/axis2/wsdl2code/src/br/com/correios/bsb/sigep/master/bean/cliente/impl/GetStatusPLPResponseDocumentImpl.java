/*
 * An XML document type.
 * Localname: getStatusPLPResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLPResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one getStatusPLPResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class GetStatusPLPResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLPResponseDocument
{
    
    public GetStatusPLPResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSTATUSPLPRESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "getStatusPLPResponse");
    
    
    /**
     * Gets the "getStatusPLPResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLPResponse getGetStatusPLPResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLPResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLPResponse)get_store().find_element_user(GETSTATUSPLPRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getStatusPLPResponse" element
     */
    public void setGetStatusPLPResponse(br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLPResponse getStatusPLPResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLPResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLPResponse)get_store().find_element_user(GETSTATUSPLPRESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLPResponse)get_store().add_element_user(GETSTATUSPLPRESPONSE$0);
            }
            target.set(getStatusPLPResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getStatusPLPResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLPResponse addNewGetStatusPLPResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLPResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLPResponse)get_store().add_element_user(GETSTATUSPLPRESPONSE$0);
            return target;
        }
    }
}
