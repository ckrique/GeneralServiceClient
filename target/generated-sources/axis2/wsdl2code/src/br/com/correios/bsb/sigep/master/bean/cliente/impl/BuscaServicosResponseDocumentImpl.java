/*
 * An XML document type.
 * Localname: buscaServicosResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one buscaServicosResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class BuscaServicosResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosResponseDocument
{
    
    public BuscaServicosResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSCASERVICOSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaServicosResponse");
    
    
    /**
     * Gets the "buscaServicosResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosResponse getBuscaServicosResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosResponse)get_store().find_element_user(BUSCASERVICOSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "buscaServicosResponse" element
     */
    public void setBuscaServicosResponse(br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosResponse buscaServicosResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosResponse)get_store().find_element_user(BUSCASERVICOSRESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosResponse)get_store().add_element_user(BUSCASERVICOSRESPONSE$0);
            }
            target.set(buscaServicosResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "buscaServicosResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosResponse addNewBuscaServicosResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosResponse)get_store().add_element_user(BUSCASERVICOSRESPONSE$0);
            return target;
        }
    }
}
