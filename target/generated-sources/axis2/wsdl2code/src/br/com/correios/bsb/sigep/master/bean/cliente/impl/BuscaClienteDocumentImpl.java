/*
 * An XML document type.
 * Localname: buscaCliente
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.BuscaClienteDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one buscaCliente(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class BuscaClienteDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.BuscaClienteDocument
{
    
    public BuscaClienteDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSCACLIENTE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaCliente");
    
    
    /**
     * Gets the "buscaCliente" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BuscaCliente getBuscaCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaCliente target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaCliente)get_store().find_element_user(BUSCACLIENTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "buscaCliente" element
     */
    public void setBuscaCliente(br.com.correios.bsb.sigep.master.bean.cliente.BuscaCliente buscaCliente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaCliente target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaCliente)get_store().find_element_user(BUSCACLIENTE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaCliente)get_store().add_element_user(BUSCACLIENTE$0);
            }
            target.set(buscaCliente);
        }
    }
    
    /**
     * Appends and returns a new empty "buscaCliente" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BuscaCliente addNewBuscaCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaCliente target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaCliente)get_store().add_element_user(BUSCACLIENTE$0);
            return target;
        }
    }
}
