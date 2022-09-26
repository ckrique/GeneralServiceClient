/*
 * An XML document type.
 * Localname: validarPostagemReversaResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversaResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one validarPostagemReversaResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class ValidarPostagemReversaResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversaResponseDocument
{
    
    public ValidarPostagemReversaResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDARPOSTAGEMREVERSARESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "validarPostagemReversaResponse");
    
    
    /**
     * Gets the "validarPostagemReversaResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversaResponse getValidarPostagemReversaResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversaResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversaResponse)get_store().find_element_user(VALIDARPOSTAGEMREVERSARESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "validarPostagemReversaResponse" element
     */
    public void setValidarPostagemReversaResponse(br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversaResponse validarPostagemReversaResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversaResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversaResponse)get_store().find_element_user(VALIDARPOSTAGEMREVERSARESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversaResponse)get_store().add_element_user(VALIDARPOSTAGEMREVERSARESPONSE$0);
            }
            target.set(validarPostagemReversaResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "validarPostagemReversaResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversaResponse addNewValidarPostagemReversaResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversaResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversaResponse)get_store().add_element_user(VALIDARPOSTAGEMREVERSARESPONSE$0);
            return target;
        }
    }
}
