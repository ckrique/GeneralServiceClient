/*
 * An XML document type.
 * Localname: fechaPlpVariosServicosResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicosResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one fechaPlpVariosServicosResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class FechaPlpVariosServicosResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicosResponseDocument
{
    
    public FechaPlpVariosServicosResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FECHAPLPVARIOSSERVICOSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "fechaPlpVariosServicosResponse");
    
    
    /**
     * Gets the "fechaPlpVariosServicosResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicosResponse getFechaPlpVariosServicosResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicosResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicosResponse)get_store().find_element_user(FECHAPLPVARIOSSERVICOSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fechaPlpVariosServicosResponse" element
     */
    public void setFechaPlpVariosServicosResponse(br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicosResponse fechaPlpVariosServicosResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicosResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicosResponse)get_store().find_element_user(FECHAPLPVARIOSSERVICOSRESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicosResponse)get_store().add_element_user(FECHAPLPVARIOSSERVICOSRESPONSE$0);
            }
            target.set(fechaPlpVariosServicosResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "fechaPlpVariosServicosResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicosResponse addNewFechaPlpVariosServicosResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicosResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicosResponse)get_store().add_element_user(FECHAPLPVARIOSSERVICOSRESPONSE$0);
            return target;
        }
    }
}
