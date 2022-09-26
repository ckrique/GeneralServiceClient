/*
 * An XML document type.
 * Localname: validaEtiquetaPLP
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLPDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one validaEtiquetaPLP(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class ValidaEtiquetaPLPDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLPDocument
{
    
    public ValidaEtiquetaPLPDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDAETIQUETAPLP$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "validaEtiquetaPLP");
    
    
    /**
     * Gets the "validaEtiquetaPLP" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLP getValidaEtiquetaPLP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLP)get_store().find_element_user(VALIDAETIQUETAPLP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "validaEtiquetaPLP" element
     */
    public void setValidaEtiquetaPLP(br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLP validaEtiquetaPLP)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLP)get_store().find_element_user(VALIDAETIQUETAPLP$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLP)get_store().add_element_user(VALIDAETIQUETAPLP$0);
            }
            target.set(validaEtiquetaPLP);
        }
    }
    
    /**
     * Appends and returns a new empty "validaEtiquetaPLP" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLP addNewValidaEtiquetaPLP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLP)get_store().add_element_user(VALIDAETIQUETAPLP$0);
            return target;
        }
    }
}
