/*
 * An XML document type.
 * Localname: buscaTarifaValeResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaValeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one buscaTarifaValeResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class BuscaTarifaValeResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaValeResponseDocument
{
    
    public BuscaTarifaValeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSCATARIFAVALERESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaTarifaValeResponse");
    
    
    /**
     * Gets the "buscaTarifaValeResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaValeResponse getBuscaTarifaValeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaValeResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaValeResponse)get_store().find_element_user(BUSCATARIFAVALERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "buscaTarifaValeResponse" element
     */
    public void setBuscaTarifaValeResponse(br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaValeResponse buscaTarifaValeResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaValeResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaValeResponse)get_store().find_element_user(BUSCATARIFAVALERESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaValeResponse)get_store().add_element_user(BUSCATARIFAVALERESPONSE$0);
            }
            target.set(buscaTarifaValeResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "buscaTarifaValeResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaValeResponse addNewBuscaTarifaValeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaValeResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaValeResponse)get_store().add_element_user(BUSCATARIFAVALERESPONSE$0);
            return target;
        }
    }
}
