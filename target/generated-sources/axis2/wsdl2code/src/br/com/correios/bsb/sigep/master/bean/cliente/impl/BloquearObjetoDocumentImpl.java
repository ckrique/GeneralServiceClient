/*
 * An XML document type.
 * Localname: bloquearObjeto
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjetoDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one bloquearObjeto(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class BloquearObjetoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjetoDocument
{
    
    public BloquearObjetoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLOQUEAROBJETO$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "bloquearObjeto");
    
    
    /**
     * Gets the "bloquearObjeto" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjeto getBloquearObjeto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjeto target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjeto)get_store().find_element_user(BLOQUEAROBJETO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "bloquearObjeto" element
     */
    public void setBloquearObjeto(br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjeto bloquearObjeto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjeto target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjeto)get_store().find_element_user(BLOQUEAROBJETO$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjeto)get_store().add_element_user(BLOQUEAROBJETO$0);
            }
            target.set(bloquearObjeto);
        }
    }
    
    /**
     * Appends and returns a new empty "bloquearObjeto" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjeto addNewBloquearObjeto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjeto target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjeto)get_store().add_element_user(BLOQUEAROBJETO$0);
            return target;
        }
    }
}
