/*
 * An XML document type.
 * Localname: buscaContratoResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.BuscaContratoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one buscaContratoResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class BuscaContratoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.BuscaContratoResponseDocument
{
    
    public BuscaContratoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSCACONTRATORESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaContratoResponse");
    
    
    /**
     * Gets the "buscaContratoResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BuscaContratoResponse getBuscaContratoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaContratoResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaContratoResponse)get_store().find_element_user(BUSCACONTRATORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "buscaContratoResponse" element
     */
    public void setBuscaContratoResponse(br.com.correios.bsb.sigep.master.bean.cliente.BuscaContratoResponse buscaContratoResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaContratoResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaContratoResponse)get_store().find_element_user(BUSCACONTRATORESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaContratoResponse)get_store().add_element_user(BUSCACONTRATORESPONSE$0);
            }
            target.set(buscaContratoResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "buscaContratoResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BuscaContratoResponse addNewBuscaContratoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaContratoResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaContratoResponse)get_store().add_element_user(BUSCACONTRATORESPONSE$0);
            return target;
        }
    }
}
