/*
 * An XML document type.
 * Localname: solicitaEtiquetasResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetasResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one solicitaEtiquetasResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class SolicitaEtiquetasResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetasResponseDocument
{
    
    public SolicitaEtiquetasResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOLICITAETIQUETASRESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "solicitaEtiquetasResponse");
    
    
    /**
     * Gets the "solicitaEtiquetasResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetasResponse getSolicitaEtiquetasResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetasResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetasResponse)get_store().find_element_user(SOLICITAETIQUETASRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "solicitaEtiquetasResponse" element
     */
    public void setSolicitaEtiquetasResponse(br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetasResponse solicitaEtiquetasResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetasResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetasResponse)get_store().find_element_user(SOLICITAETIQUETASRESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetasResponse)get_store().add_element_user(SOLICITAETIQUETASRESPONSE$0);
            }
            target.set(solicitaEtiquetasResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "solicitaEtiquetasResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetasResponse addNewSolicitaEtiquetasResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetasResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetasResponse)get_store().add_element_user(SOLICITAETIQUETASRESPONSE$0);
            return target;
        }
    }
}
