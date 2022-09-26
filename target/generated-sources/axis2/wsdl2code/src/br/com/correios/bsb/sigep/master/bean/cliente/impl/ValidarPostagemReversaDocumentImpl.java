/*
 * An XML document type.
 * Localname: validarPostagemReversa
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversaDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one validarPostagemReversa(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class ValidarPostagemReversaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversaDocument
{
    
    public ValidarPostagemReversaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDARPOSTAGEMREVERSA$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "validarPostagemReversa");
    
    
    /**
     * Gets the "validarPostagemReversa" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversa getValidarPostagemReversa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversa target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversa)get_store().find_element_user(VALIDARPOSTAGEMREVERSA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "validarPostagemReversa" element
     */
    public void setValidarPostagemReversa(br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversa validarPostagemReversa)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversa target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversa)get_store().find_element_user(VALIDARPOSTAGEMREVERSA$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversa)get_store().add_element_user(VALIDARPOSTAGEMREVERSA$0);
            }
            target.set(validarPostagemReversa);
        }
    }
    
    /**
     * Appends and returns a new empty "validarPostagemReversa" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversa addNewValidarPostagemReversa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversa target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversa)get_store().add_element_user(VALIDARPOSTAGEMREVERSA$0);
            return target;
        }
    }
}
