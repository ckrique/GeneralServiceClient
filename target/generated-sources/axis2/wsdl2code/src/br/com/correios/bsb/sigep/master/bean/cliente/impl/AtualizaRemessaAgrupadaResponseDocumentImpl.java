/*
 * An XML document type.
 * Localname: atualizaRemessaAgrupadaResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupadaResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one atualizaRemessaAgrupadaResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class AtualizaRemessaAgrupadaResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupadaResponseDocument
{
    
    public AtualizaRemessaAgrupadaResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATUALIZAREMESSAAGRUPADARESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "atualizaRemessaAgrupadaResponse");
    
    
    /**
     * Gets the "atualizaRemessaAgrupadaResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupadaResponse getAtualizaRemessaAgrupadaResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupadaResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupadaResponse)get_store().find_element_user(ATUALIZAREMESSAAGRUPADARESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "atualizaRemessaAgrupadaResponse" element
     */
    public void setAtualizaRemessaAgrupadaResponse(br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupadaResponse atualizaRemessaAgrupadaResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupadaResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupadaResponse)get_store().find_element_user(ATUALIZAREMESSAAGRUPADARESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupadaResponse)get_store().add_element_user(ATUALIZAREMESSAAGRUPADARESPONSE$0);
            }
            target.set(atualizaRemessaAgrupadaResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "atualizaRemessaAgrupadaResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupadaResponse addNewAtualizaRemessaAgrupadaResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupadaResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupadaResponse)get_store().add_element_user(ATUALIZAREMESSAAGRUPADARESPONSE$0);
            return target;
        }
    }
}
