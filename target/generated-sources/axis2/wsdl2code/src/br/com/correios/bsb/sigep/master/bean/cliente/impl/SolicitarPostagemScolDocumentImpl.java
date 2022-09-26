/*
 * An XML document type.
 * Localname: solicitarPostagemScol
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScolDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one solicitarPostagemScol(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class SolicitarPostagemScolDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScolDocument
{
    
    public SolicitarPostagemScolDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOLICITARPOSTAGEMSCOL$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "solicitarPostagemScol");
    
    
    /**
     * Gets the "solicitarPostagemScol" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScol getSolicitarPostagemScol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScol target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScol)get_store().find_element_user(SOLICITARPOSTAGEMSCOL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "solicitarPostagemScol" element
     */
    public void setSolicitarPostagemScol(br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScol solicitarPostagemScol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScol target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScol)get_store().find_element_user(SOLICITARPOSTAGEMSCOL$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScol)get_store().add_element_user(SOLICITARPOSTAGEMSCOL$0);
            }
            target.set(solicitarPostagemScol);
        }
    }
    
    /**
     * Appends and returns a new empty "solicitarPostagemScol" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScol addNewSolicitarPostagemScol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScol target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScol)get_store().add_element_user(SOLICITARPOSTAGEMSCOL$0);
            return target;
        }
    }
}
