/*
 * An XML document type.
 * Localname: validaEtiquetaPLPResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLPResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one validaEtiquetaPLPResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class ValidaEtiquetaPLPResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLPResponseDocument
{
    
    public ValidaEtiquetaPLPResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDAETIQUETAPLPRESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "validaEtiquetaPLPResponse");
    
    
    /**
     * Gets the "validaEtiquetaPLPResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLPResponse getValidaEtiquetaPLPResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLPResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLPResponse)get_store().find_element_user(VALIDAETIQUETAPLPRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "validaEtiquetaPLPResponse" element
     */
    public void setValidaEtiquetaPLPResponse(br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLPResponse validaEtiquetaPLPResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLPResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLPResponse)get_store().find_element_user(VALIDAETIQUETAPLPRESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLPResponse)get_store().add_element_user(VALIDAETIQUETAPLPRESPONSE$0);
            }
            target.set(validaEtiquetaPLPResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "validaEtiquetaPLPResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLPResponse addNewValidaEtiquetaPLPResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLPResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLPResponse)get_store().add_element_user(VALIDAETIQUETAPLPRESPONSE$0);
            return target;
        }
    }
}
