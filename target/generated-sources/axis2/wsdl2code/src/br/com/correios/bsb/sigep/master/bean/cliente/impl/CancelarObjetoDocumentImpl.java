/*
 * An XML document type.
 * Localname: cancelarObjeto
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjetoDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one cancelarObjeto(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class CancelarObjetoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjetoDocument
{
    
    public CancelarObjetoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CANCELAROBJETO$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "cancelarObjeto");
    
    
    /**
     * Gets the "cancelarObjeto" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjeto getCancelarObjeto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjeto target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjeto)get_store().find_element_user(CANCELAROBJETO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cancelarObjeto" element
     */
    public void setCancelarObjeto(br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjeto cancelarObjeto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjeto target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjeto)get_store().find_element_user(CANCELAROBJETO$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjeto)get_store().add_element_user(CANCELAROBJETO$0);
            }
            target.set(cancelarObjeto);
        }
    }
    
    /**
     * Appends and returns a new empty "cancelarObjeto" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjeto addNewCancelarObjeto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjeto target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjeto)get_store().add_element_user(CANCELAROBJETO$0);
            return target;
        }
    }
}
