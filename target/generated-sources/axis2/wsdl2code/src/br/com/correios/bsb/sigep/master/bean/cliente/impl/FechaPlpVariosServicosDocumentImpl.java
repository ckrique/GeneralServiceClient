/*
 * An XML document type.
 * Localname: fechaPlpVariosServicos
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicosDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one fechaPlpVariosServicos(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class FechaPlpVariosServicosDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicosDocument
{
    
    public FechaPlpVariosServicosDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FECHAPLPVARIOSSERVICOS$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "fechaPlpVariosServicos");
    
    
    /**
     * Gets the "fechaPlpVariosServicos" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicos getFechaPlpVariosServicos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicos target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicos)get_store().find_element_user(FECHAPLPVARIOSSERVICOS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fechaPlpVariosServicos" element
     */
    public void setFechaPlpVariosServicos(br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicos fechaPlpVariosServicos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicos target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicos)get_store().find_element_user(FECHAPLPVARIOSSERVICOS$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicos)get_store().add_element_user(FECHAPLPVARIOSSERVICOS$0);
            }
            target.set(fechaPlpVariosServicos);
        }
    }
    
    /**
     * Appends and returns a new empty "fechaPlpVariosServicos" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicos addNewFechaPlpVariosServicos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicos target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicos)get_store().add_element_user(FECHAPLPVARIOSSERVICOS$0);
            return target;
        }
    }
}
