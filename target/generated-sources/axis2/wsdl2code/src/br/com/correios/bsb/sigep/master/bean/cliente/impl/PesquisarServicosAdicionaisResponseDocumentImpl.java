/*
 * An XML document type.
 * Localname: pesquisarServicosAdicionaisResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionaisResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one pesquisarServicosAdicionaisResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class PesquisarServicosAdicionaisResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionaisResponseDocument
{
    
    public PesquisarServicosAdicionaisResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PESQUISARSERVICOSADICIONAISRESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "pesquisarServicosAdicionaisResponse");
    
    
    /**
     * Gets the "pesquisarServicosAdicionaisResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionaisResponse getPesquisarServicosAdicionaisResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionaisResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionaisResponse)get_store().find_element_user(PESQUISARSERVICOSADICIONAISRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pesquisarServicosAdicionaisResponse" element
     */
    public void setPesquisarServicosAdicionaisResponse(br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionaisResponse pesquisarServicosAdicionaisResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionaisResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionaisResponse)get_store().find_element_user(PESQUISARSERVICOSADICIONAISRESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionaisResponse)get_store().add_element_user(PESQUISARSERVICOSADICIONAISRESPONSE$0);
            }
            target.set(pesquisarServicosAdicionaisResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "pesquisarServicosAdicionaisResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionaisResponse addNewPesquisarServicosAdicionaisResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionaisResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionaisResponse)get_store().add_element_user(PESQUISARSERVICOSADICIONAISRESPONSE$0);
            return target;
        }
    }
}
