/*
 * An XML document type.
 * Localname: solicitaPLP
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLPDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one solicitaPLP(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class SolicitaPLPDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLPDocument
{
    
    public SolicitaPLPDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOLICITAPLP$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "solicitaPLP");
    
    
    /**
     * Gets the "solicitaPLP" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLP getSolicitaPLP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLP)get_store().find_element_user(SOLICITAPLP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "solicitaPLP" element
     */
    public void setSolicitaPLP(br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLP solicitaPLP)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLP)get_store().find_element_user(SOLICITAPLP$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLP)get_store().add_element_user(SOLICITAPLP$0);
            }
            target.set(solicitaPLP);
        }
    }
    
    /**
     * Appends and returns a new empty "solicitaPLP" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLP addNewSolicitaPLP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLP)get_store().add_element_user(SOLICITAPLP$0);
            return target;
        }
    }
}
