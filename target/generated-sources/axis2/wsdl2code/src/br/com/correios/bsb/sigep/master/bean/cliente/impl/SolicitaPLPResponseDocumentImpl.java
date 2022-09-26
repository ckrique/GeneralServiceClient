/*
 * An XML document type.
 * Localname: solicitaPLPResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLPResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one solicitaPLPResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class SolicitaPLPResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLPResponseDocument
{
    
    public SolicitaPLPResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOLICITAPLPRESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "solicitaPLPResponse");
    
    
    /**
     * Gets the "solicitaPLPResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLPResponse getSolicitaPLPResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLPResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLPResponse)get_store().find_element_user(SOLICITAPLPRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "solicitaPLPResponse" element
     */
    public void setSolicitaPLPResponse(br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLPResponse solicitaPLPResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLPResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLPResponse)get_store().find_element_user(SOLICITAPLPRESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLPResponse)get_store().add_element_user(SOLICITAPLPRESPONSE$0);
            }
            target.set(solicitaPLPResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "solicitaPLPResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLPResponse addNewSolicitaPLPResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLPResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLPResponse)get_store().add_element_user(SOLICITAPLPRESPONSE$0);
            return target;
        }
    }
}
