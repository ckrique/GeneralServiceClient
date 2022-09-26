/*
 * An XML document type.
 * Localname: cancelarPedidoScolResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScolResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one cancelarPedidoScolResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class CancelarPedidoScolResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScolResponseDocument
{
    
    public CancelarPedidoScolResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CANCELARPEDIDOSCOLRESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "cancelarPedidoScolResponse");
    
    
    /**
     * Gets the "cancelarPedidoScolResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScolResponse getCancelarPedidoScolResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScolResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScolResponse)get_store().find_element_user(CANCELARPEDIDOSCOLRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cancelarPedidoScolResponse" element
     */
    public void setCancelarPedidoScolResponse(br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScolResponse cancelarPedidoScolResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScolResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScolResponse)get_store().find_element_user(CANCELARPEDIDOSCOLRESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScolResponse)get_store().add_element_user(CANCELARPEDIDOSCOLRESPONSE$0);
            }
            target.set(cancelarPedidoScolResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "cancelarPedidoScolResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScolResponse addNewCancelarPedidoScolResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScolResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScolResponse)get_store().add_element_user(CANCELARPEDIDOSCOLRESPONSE$0);
            return target;
        }
    }
}
