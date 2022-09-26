/*
 * An XML document type.
 * Localname: solicitaXmlPlpResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlpResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one solicitaXmlPlpResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class SolicitaXmlPlpResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlpResponseDocument
{
    
    public SolicitaXmlPlpResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOLICITAXMLPLPRESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "solicitaXmlPlpResponse");
    
    
    /**
     * Gets the "solicitaXmlPlpResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlpResponse getSolicitaXmlPlpResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlpResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlpResponse)get_store().find_element_user(SOLICITAXMLPLPRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "solicitaXmlPlpResponse" element
     */
    public void setSolicitaXmlPlpResponse(br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlpResponse solicitaXmlPlpResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlpResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlpResponse)get_store().find_element_user(SOLICITAXMLPLPRESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlpResponse)get_store().add_element_user(SOLICITAXMLPLPRESPONSE$0);
            }
            target.set(solicitaXmlPlpResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "solicitaXmlPlpResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlpResponse addNewSolicitaXmlPlpResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlpResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlpResponse)get_store().add_element_user(SOLICITAXMLPLPRESPONSE$0);
            return target;
        }
    }
}
