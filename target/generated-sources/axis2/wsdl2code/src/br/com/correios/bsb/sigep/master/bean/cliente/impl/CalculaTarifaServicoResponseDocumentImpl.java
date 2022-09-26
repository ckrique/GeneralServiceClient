/*
 * An XML document type.
 * Localname: calculaTarifaServicoResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServicoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one calculaTarifaServicoResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class CalculaTarifaServicoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServicoResponseDocument
{
    
    public CalculaTarifaServicoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALCULATARIFASERVICORESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "calculaTarifaServicoResponse");
    
    
    /**
     * Gets the "calculaTarifaServicoResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServicoResponse getCalculaTarifaServicoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServicoResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServicoResponse)get_store().find_element_user(CALCULATARIFASERVICORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "calculaTarifaServicoResponse" element
     */
    public void setCalculaTarifaServicoResponse(br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServicoResponse calculaTarifaServicoResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServicoResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServicoResponse)get_store().find_element_user(CALCULATARIFASERVICORESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServicoResponse)get_store().add_element_user(CALCULATARIFASERVICORESPONSE$0);
            }
            target.set(calculaTarifaServicoResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "calculaTarifaServicoResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServicoResponse addNewCalculaTarifaServicoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServicoResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServicoResponse)get_store().add_element_user(CALCULATARIFASERVICORESPONSE$0);
            return target;
        }
    }
}
