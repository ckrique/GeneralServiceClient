/*
 * An XML document type.
 * Localname: pesquisarEmbalagensPorServicoResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one pesquisarEmbalagensPorServicoResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class PesquisarEmbalagensPorServicoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponseDocument
{
    
    public PesquisarEmbalagensPorServicoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PESQUISAREMBALAGENSPORSERVICORESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "pesquisarEmbalagensPorServicoResponse");
    
    
    /**
     * Gets the "pesquisarEmbalagensPorServicoResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse getPesquisarEmbalagensPorServicoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse)get_store().find_element_user(PESQUISAREMBALAGENSPORSERVICORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pesquisarEmbalagensPorServicoResponse" element
     */
    public void setPesquisarEmbalagensPorServicoResponse(br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse pesquisarEmbalagensPorServicoResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse)get_store().find_element_user(PESQUISAREMBALAGENSPORSERVICORESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse)get_store().add_element_user(PESQUISAREMBALAGENSPORSERVICORESPONSE$0);
            }
            target.set(pesquisarEmbalagensPorServicoResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "pesquisarEmbalagensPorServicoResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse addNewPesquisarEmbalagensPorServicoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse)get_store().add_element_user(PESQUISAREMBALAGENSPORSERVICORESPONSE$0);
            return target;
        }
    }
}
