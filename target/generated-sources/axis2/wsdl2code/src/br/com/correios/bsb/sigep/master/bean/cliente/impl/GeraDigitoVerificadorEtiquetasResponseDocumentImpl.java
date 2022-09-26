/*
 * An XML document type.
 * Localname: geraDigitoVerificadorEtiquetasResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetasResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one geraDigitoVerificadorEtiquetasResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class GeraDigitoVerificadorEtiquetasResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetasResponseDocument
{
    
    public GeraDigitoVerificadorEtiquetasResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GERADIGITOVERIFICADORETIQUETASRESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "geraDigitoVerificadorEtiquetasResponse");
    
    
    /**
     * Gets the "geraDigitoVerificadorEtiquetasResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetasResponse getGeraDigitoVerificadorEtiquetasResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetasResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetasResponse)get_store().find_element_user(GERADIGITOVERIFICADORETIQUETASRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "geraDigitoVerificadorEtiquetasResponse" element
     */
    public void setGeraDigitoVerificadorEtiquetasResponse(br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetasResponse geraDigitoVerificadorEtiquetasResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetasResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetasResponse)get_store().find_element_user(GERADIGITOVERIFICADORETIQUETASRESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetasResponse)get_store().add_element_user(GERADIGITOVERIFICADORETIQUETASRESPONSE$0);
            }
            target.set(geraDigitoVerificadorEtiquetasResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "geraDigitoVerificadorEtiquetasResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetasResponse addNewGeraDigitoVerificadorEtiquetasResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetasResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetasResponse)get_store().add_element_user(GERADIGITOVERIFICADORETIQUETASRESPONSE$0);
            return target;
        }
    }
}
