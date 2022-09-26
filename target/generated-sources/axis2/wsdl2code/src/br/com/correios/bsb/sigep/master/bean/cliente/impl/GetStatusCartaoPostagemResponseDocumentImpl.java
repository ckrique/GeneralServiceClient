/*
 * An XML document type.
 * Localname: getStatusCartaoPostagemResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagemResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one getStatusCartaoPostagemResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class GetStatusCartaoPostagemResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagemResponseDocument
{
    
    public GetStatusCartaoPostagemResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSTATUSCARTAOPOSTAGEMRESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "getStatusCartaoPostagemResponse");
    
    
    /**
     * Gets the "getStatusCartaoPostagemResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagemResponse getGetStatusCartaoPostagemResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagemResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagemResponse)get_store().find_element_user(GETSTATUSCARTAOPOSTAGEMRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getStatusCartaoPostagemResponse" element
     */
    public void setGetStatusCartaoPostagemResponse(br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagemResponse getStatusCartaoPostagemResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagemResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagemResponse)get_store().find_element_user(GETSTATUSCARTAOPOSTAGEMRESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagemResponse)get_store().add_element_user(GETSTATUSCARTAOPOSTAGEMRESPONSE$0);
            }
            target.set(getStatusCartaoPostagemResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getStatusCartaoPostagemResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagemResponse addNewGetStatusCartaoPostagemResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagemResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagemResponse)get_store().add_element_user(GETSTATUSCARTAOPOSTAGEMRESPONSE$0);
            return target;
        }
    }
}
