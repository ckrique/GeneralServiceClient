/*
 * An XML document type.
 * Localname: fechaPlp
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one fechaPlp(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class FechaPlpDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpDocument
{
    
    public FechaPlpDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FECHAPLP$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "fechaPlp");
    
    
    /**
     * Gets the "fechaPlp" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp getFechaPlp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp)get_store().find_element_user(FECHAPLP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fechaPlp" element
     */
    public void setFechaPlp(br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp fechaPlp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp)get_store().find_element_user(FECHAPLP$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp)get_store().add_element_user(FECHAPLP$0);
            }
            target.set(fechaPlp);
        }
    }
    
    /**
     * Appends and returns a new empty "fechaPlp" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp addNewFechaPlp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp)get_store().add_element_user(FECHAPLP$0);
            return target;
        }
    }
}
