/*
 * An XML document type.
 * Localname: obterMensagemParametrizadaResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizadaResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one obterMensagemParametrizadaResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class ObterMensagemParametrizadaResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizadaResponseDocument
{
    
    public ObterMensagemParametrizadaResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBTERMENSAGEMPARAMETRIZADARESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "obterMensagemParametrizadaResponse");
    
    
    /**
     * Gets the "obterMensagemParametrizadaResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizadaResponse getObterMensagemParametrizadaResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizadaResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizadaResponse)get_store().find_element_user(OBTERMENSAGEMPARAMETRIZADARESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "obterMensagemParametrizadaResponse" element
     */
    public void setObterMensagemParametrizadaResponse(br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizadaResponse obterMensagemParametrizadaResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizadaResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizadaResponse)get_store().find_element_user(OBTERMENSAGEMPARAMETRIZADARESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizadaResponse)get_store().add_element_user(OBTERMENSAGEMPARAMETRIZADARESPONSE$0);
            }
            target.set(obterMensagemParametrizadaResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "obterMensagemParametrizadaResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizadaResponse addNewObterMensagemParametrizadaResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizadaResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizadaResponse)get_store().add_element_user(OBTERMENSAGEMPARAMETRIZADARESPONSE$0);
            return target;
        }
    }
}
