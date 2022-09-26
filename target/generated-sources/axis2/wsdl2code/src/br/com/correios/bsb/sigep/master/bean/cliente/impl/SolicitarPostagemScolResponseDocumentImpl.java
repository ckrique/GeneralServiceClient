/*
 * An XML document type.
 * Localname: solicitarPostagemScolResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScolResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one solicitarPostagemScolResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class SolicitarPostagemScolResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScolResponseDocument
{
    
    public SolicitarPostagemScolResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOLICITARPOSTAGEMSCOLRESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "solicitarPostagemScolResponse");
    
    
    /**
     * Gets the "solicitarPostagemScolResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScolResponse getSolicitarPostagemScolResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScolResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScolResponse)get_store().find_element_user(SOLICITARPOSTAGEMSCOLRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "solicitarPostagemScolResponse" element
     */
    public void setSolicitarPostagemScolResponse(br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScolResponse solicitarPostagemScolResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScolResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScolResponse)get_store().find_element_user(SOLICITARPOSTAGEMSCOLRESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScolResponse)get_store().add_element_user(SOLICITARPOSTAGEMSCOLRESPONSE$0);
            }
            target.set(solicitarPostagemScolResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "solicitarPostagemScolResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScolResponse addNewSolicitarPostagemScolResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScolResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScolResponse)get_store().add_element_user(SOLICITARPOSTAGEMSCOLRESPONSE$0);
            return target;
        }
    }
}
