/*
 * An XML document type.
 * Localname: verificaModalTransporte
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporteDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one verificaModalTransporte(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class VerificaModalTransporteDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporteDocument
{
    
    public VerificaModalTransporteDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERIFICAMODALTRANSPORTE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "verificaModalTransporte");
    
    
    /**
     * Gets the "verificaModalTransporte" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporte getVerificaModalTransporte()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporte target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporte)get_store().find_element_user(VERIFICAMODALTRANSPORTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "verificaModalTransporte" element
     */
    public void setVerificaModalTransporte(br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporte verificaModalTransporte)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporte target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporte)get_store().find_element_user(VERIFICAMODALTRANSPORTE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporte)get_store().add_element_user(VERIFICAMODALTRANSPORTE$0);
            }
            target.set(verificaModalTransporte);
        }
    }
    
    /**
     * Appends and returns a new empty "verificaModalTransporte" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporte addNewVerificaModalTransporte()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporte target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporte)get_store().add_element_user(VERIFICAMODALTRANSPORTE$0);
            return target;
        }
    }
}
