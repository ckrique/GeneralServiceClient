/*
 * An XML document type.
 * Localname: validarPostagemSimultaneaResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultaneaResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one validarPostagemSimultaneaResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class ValidarPostagemSimultaneaResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultaneaResponseDocument
{
    
    public ValidarPostagemSimultaneaResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDARPOSTAGEMSIMULTANEARESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "validarPostagemSimultaneaResponse");
    
    
    /**
     * Gets the "validarPostagemSimultaneaResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultaneaResponse getValidarPostagemSimultaneaResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultaneaResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultaneaResponse)get_store().find_element_user(VALIDARPOSTAGEMSIMULTANEARESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "validarPostagemSimultaneaResponse" element
     */
    public void setValidarPostagemSimultaneaResponse(br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultaneaResponse validarPostagemSimultaneaResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultaneaResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultaneaResponse)get_store().find_element_user(VALIDARPOSTAGEMSIMULTANEARESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultaneaResponse)get_store().add_element_user(VALIDARPOSTAGEMSIMULTANEARESPONSE$0);
            }
            target.set(validarPostagemSimultaneaResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "validarPostagemSimultaneaResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultaneaResponse addNewValidarPostagemSimultaneaResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultaneaResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultaneaResponse)get_store().add_element_user(VALIDARPOSTAGEMSIMULTANEARESPONSE$0);
            return target;
        }
    }
}
