/*
 * An XML document type.
 * Localname: integrarUsuarioScolResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScolResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one integrarUsuarioScolResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class IntegrarUsuarioScolResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScolResponseDocument
{
    
    public IntegrarUsuarioScolResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTEGRARUSUARIOSCOLRESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "integrarUsuarioScolResponse");
    
    
    /**
     * Gets the "integrarUsuarioScolResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScolResponse getIntegrarUsuarioScolResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScolResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScolResponse)get_store().find_element_user(INTEGRARUSUARIOSCOLRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "integrarUsuarioScolResponse" element
     */
    public void setIntegrarUsuarioScolResponse(br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScolResponse integrarUsuarioScolResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScolResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScolResponse)get_store().find_element_user(INTEGRARUSUARIOSCOLRESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScolResponse)get_store().add_element_user(INTEGRARUSUARIOSCOLRESPONSE$0);
            }
            target.set(integrarUsuarioScolResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "integrarUsuarioScolResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScolResponse addNewIntegrarUsuarioScolResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScolResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScolResponse)get_store().add_element_user(INTEGRARUSUARIOSCOLRESPONSE$0);
            return target;
        }
    }
}
