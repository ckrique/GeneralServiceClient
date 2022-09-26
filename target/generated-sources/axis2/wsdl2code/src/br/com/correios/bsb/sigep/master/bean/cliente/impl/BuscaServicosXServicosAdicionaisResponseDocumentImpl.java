/*
 * An XML document type.
 * Localname: buscaServicosXServicosAdicionaisResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionaisResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one buscaServicosXServicosAdicionaisResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class BuscaServicosXServicosAdicionaisResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionaisResponseDocument
{
    
    public BuscaServicosXServicosAdicionaisResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSCASERVICOSXSERVICOSADICIONAISRESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaServicosXServicosAdicionaisResponse");
    
    
    /**
     * Gets the "buscaServicosXServicosAdicionaisResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionaisResponse getBuscaServicosXServicosAdicionaisResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionaisResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionaisResponse)get_store().find_element_user(BUSCASERVICOSXSERVICOSADICIONAISRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "buscaServicosXServicosAdicionaisResponse" element
     */
    public void setBuscaServicosXServicosAdicionaisResponse(br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionaisResponse buscaServicosXServicosAdicionaisResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionaisResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionaisResponse)get_store().find_element_user(BUSCASERVICOSXSERVICOSADICIONAISRESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionaisResponse)get_store().add_element_user(BUSCASERVICOSXSERVICOSADICIONAISRESPONSE$0);
            }
            target.set(buscaServicosXServicosAdicionaisResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "buscaServicosXServicosAdicionaisResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionaisResponse addNewBuscaServicosXServicosAdicionaisResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionaisResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionaisResponse)get_store().add_element_user(BUSCASERVICOSXSERVICOSADICIONAISRESPONSE$0);
            return target;
        }
    }
}
