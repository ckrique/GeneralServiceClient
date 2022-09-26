/*
 * An XML document type.
 * Localname: validaPlp
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlpDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one validaPlp(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class ValidaPlpDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlpDocument
{
    
    public ValidaPlpDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDAPLP$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "validaPlp");
    
    
    /**
     * Gets the "validaPlp" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlp getValidaPlp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlp target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlp)get_store().find_element_user(VALIDAPLP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "validaPlp" element
     */
    public void setValidaPlp(br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlp validaPlp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlp target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlp)get_store().find_element_user(VALIDAPLP$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlp)get_store().add_element_user(VALIDAPLP$0);
            }
            target.set(validaPlp);
        }
    }
    
    /**
     * Appends and returns a new empty "validaPlp" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlp addNewValidaPlp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlp target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlp)get_store().add_element_user(VALIDAPLP$0);
            return target;
        }
    }
}
