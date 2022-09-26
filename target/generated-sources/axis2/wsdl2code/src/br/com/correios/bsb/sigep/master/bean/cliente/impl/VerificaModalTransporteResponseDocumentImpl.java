/*
 * An XML document type.
 * Localname: verificaModalTransporteResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporteResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one verificaModalTransporteResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class VerificaModalTransporteResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporteResponseDocument
{
    
    public VerificaModalTransporteResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERIFICAMODALTRANSPORTERESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "verificaModalTransporteResponse");
    
    
    /**
     * Gets the "verificaModalTransporteResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporteResponse getVerificaModalTransporteResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporteResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporteResponse)get_store().find_element_user(VERIFICAMODALTRANSPORTERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "verificaModalTransporteResponse" element
     */
    public void setVerificaModalTransporteResponse(br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporteResponse verificaModalTransporteResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporteResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporteResponse)get_store().find_element_user(VERIFICAMODALTRANSPORTERESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporteResponse)get_store().add_element_user(VERIFICAMODALTRANSPORTERESPONSE$0);
            }
            target.set(verificaModalTransporteResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "verificaModalTransporteResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporteResponse addNewVerificaModalTransporteResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporteResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporteResponse)get_store().add_element_user(VERIFICAMODALTRANSPORTERESPONSE$0);
            return target;
        }
    }
}
