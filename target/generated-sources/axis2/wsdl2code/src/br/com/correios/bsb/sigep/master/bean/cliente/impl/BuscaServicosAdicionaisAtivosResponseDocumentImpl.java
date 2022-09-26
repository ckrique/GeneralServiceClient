/*
 * An XML document type.
 * Localname: buscaServicosAdicionaisAtivosResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivosResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one buscaServicosAdicionaisAtivosResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class BuscaServicosAdicionaisAtivosResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivosResponseDocument
{
    
    public BuscaServicosAdicionaisAtivosResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSCASERVICOSADICIONAISATIVOSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaServicosAdicionaisAtivosResponse");
    
    
    /**
     * Gets the "buscaServicosAdicionaisAtivosResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivosResponse getBuscaServicosAdicionaisAtivosResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivosResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivosResponse)get_store().find_element_user(BUSCASERVICOSADICIONAISATIVOSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "buscaServicosAdicionaisAtivosResponse" element
     */
    public void setBuscaServicosAdicionaisAtivosResponse(br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivosResponse buscaServicosAdicionaisAtivosResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivosResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivosResponse)get_store().find_element_user(BUSCASERVICOSADICIONAISATIVOSRESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivosResponse)get_store().add_element_user(BUSCASERVICOSADICIONAISATIVOSRESPONSE$0);
            }
            target.set(buscaServicosAdicionaisAtivosResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "buscaServicosAdicionaisAtivosResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivosResponse addNewBuscaServicosAdicionaisAtivosResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivosResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivosResponse)get_store().add_element_user(BUSCASERVICOSADICIONAISATIVOSRESPONSE$0);
            return target;
        }
    }
}
