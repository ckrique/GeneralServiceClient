/*
 * An XML document type.
 * Localname: pesquisarDimensoesServicoResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServicoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one pesquisarDimensoesServicoResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class PesquisarDimensoesServicoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServicoResponseDocument
{
    
    public PesquisarDimensoesServicoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PESQUISARDIMENSOESSERVICORESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "pesquisarDimensoesServicoResponse");
    
    
    /**
     * Gets the "pesquisarDimensoesServicoResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServicoResponse getPesquisarDimensoesServicoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServicoResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServicoResponse)get_store().find_element_user(PESQUISARDIMENSOESSERVICORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pesquisarDimensoesServicoResponse" element
     */
    public void setPesquisarDimensoesServicoResponse(br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServicoResponse pesquisarDimensoesServicoResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServicoResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServicoResponse)get_store().find_element_user(PESQUISARDIMENSOESSERVICORESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServicoResponse)get_store().add_element_user(PESQUISARDIMENSOESSERVICORESPONSE$0);
            }
            target.set(pesquisarDimensoesServicoResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "pesquisarDimensoesServicoResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServicoResponse addNewPesquisarDimensoesServicoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServicoResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServicoResponse)get_store().add_element_user(PESQUISARDIMENSOESSERVICORESPONSE$0);
            return target;
        }
    }
}
