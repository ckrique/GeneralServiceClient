/*
 * An XML document type.
 * Localname: buscaServicosValorDeclaradoResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclaradoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one buscaServicosValorDeclaradoResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class BuscaServicosValorDeclaradoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclaradoResponseDocument
{
    
    public BuscaServicosValorDeclaradoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSCASERVICOSVALORDECLARADORESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaServicosValorDeclaradoResponse");
    
    
    /**
     * Gets the "buscaServicosValorDeclaradoResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclaradoResponse getBuscaServicosValorDeclaradoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclaradoResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclaradoResponse)get_store().find_element_user(BUSCASERVICOSVALORDECLARADORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "buscaServicosValorDeclaradoResponse" element
     */
    public void setBuscaServicosValorDeclaradoResponse(br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclaradoResponse buscaServicosValorDeclaradoResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclaradoResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclaradoResponse)get_store().find_element_user(BUSCASERVICOSVALORDECLARADORESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclaradoResponse)get_store().add_element_user(BUSCASERVICOSVALORDECLARADORESPONSE$0);
            }
            target.set(buscaServicosValorDeclaradoResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "buscaServicosValorDeclaradoResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclaradoResponse addNewBuscaServicosValorDeclaradoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclaradoResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclaradoResponse)get_store().add_element_user(BUSCASERVICOSVALORDECLARADORESPONSE$0);
            return target;
        }
    }
}
