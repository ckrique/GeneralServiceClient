/*
 * An XML document type.
 * Localname: buscaPagamentoEntrega
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntregaDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one buscaPagamentoEntrega(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class BuscaPagamentoEntregaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntregaDocument
{
    
    public BuscaPagamentoEntregaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSCAPAGAMENTOENTREGA$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaPagamentoEntrega");
    
    
    /**
     * Gets the "buscaPagamentoEntrega" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega getBuscaPagamentoEntrega()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega)get_store().find_element_user(BUSCAPAGAMENTOENTREGA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "buscaPagamentoEntrega" element
     */
    public void setBuscaPagamentoEntrega(br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega buscaPagamentoEntrega)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega)get_store().find_element_user(BUSCAPAGAMENTOENTREGA$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega)get_store().add_element_user(BUSCAPAGAMENTOENTREGA$0);
            }
            target.set(buscaPagamentoEntrega);
        }
    }
    
    /**
     * Appends and returns a new empty "buscaPagamentoEntrega" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega addNewBuscaPagamentoEntrega()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega)get_store().add_element_user(BUSCAPAGAMENTOENTREGA$0);
            return target;
        }
    }
}
