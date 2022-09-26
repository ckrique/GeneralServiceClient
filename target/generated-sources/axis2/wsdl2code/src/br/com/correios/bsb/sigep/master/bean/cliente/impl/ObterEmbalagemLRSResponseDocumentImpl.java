/*
 * An XML document type.
 * Localname: obterEmbalagemLRSResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRSResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one obterEmbalagemLRSResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class ObterEmbalagemLRSResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRSResponseDocument
{
    
    public ObterEmbalagemLRSResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBTEREMBALAGEMLRSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "obterEmbalagemLRSResponse");
    
    
    /**
     * Gets the "obterEmbalagemLRSResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRSResponse getObterEmbalagemLRSResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRSResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRSResponse)get_store().find_element_user(OBTEREMBALAGEMLRSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "obterEmbalagemLRSResponse" element
     */
    public void setObterEmbalagemLRSResponse(br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRSResponse obterEmbalagemLRSResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRSResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRSResponse)get_store().find_element_user(OBTEREMBALAGEMLRSRESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRSResponse)get_store().add_element_user(OBTEREMBALAGEMLRSRESPONSE$0);
            }
            target.set(obterEmbalagemLRSResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "obterEmbalagemLRSResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRSResponse addNewObterEmbalagemLRSResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRSResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRSResponse)get_store().add_element_user(OBTEREMBALAGEMLRSRESPONSE$0);
            return target;
        }
    }
}
