/*
 * An XML document type.
 * Localname: cancelarPedidoScol
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScolDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one cancelarPedidoScol(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class CancelarPedidoScolDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScolDocument
{
    
    public CancelarPedidoScolDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CANCELARPEDIDOSCOL$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "cancelarPedidoScol");
    
    
    /**
     * Gets the "cancelarPedidoScol" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol getCancelarPedidoScol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol)get_store().find_element_user(CANCELARPEDIDOSCOL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cancelarPedidoScol" element
     */
    public void setCancelarPedidoScol(br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol cancelarPedidoScol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol)get_store().find_element_user(CANCELARPEDIDOSCOL$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol)get_store().add_element_user(CANCELARPEDIDOSCOL$0);
            }
            target.set(cancelarPedidoScol);
        }
    }
    
    /**
     * Appends and returns a new empty "cancelarPedidoScol" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol addNewCancelarPedidoScol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol)get_store().add_element_user(CANCELARPEDIDOSCOL$0);
            return target;
        }
    }
}
