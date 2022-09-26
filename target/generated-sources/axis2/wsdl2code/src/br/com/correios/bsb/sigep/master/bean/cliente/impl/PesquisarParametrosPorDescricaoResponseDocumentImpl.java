/*
 * An XML document type.
 * Localname: pesquisarParametrosPorDescricaoResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.PesquisarParametrosPorDescricaoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one pesquisarParametrosPorDescricaoResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class PesquisarParametrosPorDescricaoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.PesquisarParametrosPorDescricaoResponseDocument
{
    
    public PesquisarParametrosPorDescricaoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PESQUISARPARAMETROSPORDESCRICAORESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "pesquisarParametrosPorDescricaoResponse");
    
    
    /**
     * Gets the "pesquisarParametrosPorDescricaoResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.PesquisarParametrosPorDescricaoResponse getPesquisarParametrosPorDescricaoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.PesquisarParametrosPorDescricaoResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarParametrosPorDescricaoResponse)get_store().find_element_user(PESQUISARPARAMETROSPORDESCRICAORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pesquisarParametrosPorDescricaoResponse" element
     */
    public void setPesquisarParametrosPorDescricaoResponse(br.com.correios.bsb.sigep.master.bean.cliente.PesquisarParametrosPorDescricaoResponse pesquisarParametrosPorDescricaoResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.PesquisarParametrosPorDescricaoResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarParametrosPorDescricaoResponse)get_store().find_element_user(PESQUISARPARAMETROSPORDESCRICAORESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarParametrosPorDescricaoResponse)get_store().add_element_user(PESQUISARPARAMETROSPORDESCRICAORESPONSE$0);
            }
            target.set(pesquisarParametrosPorDescricaoResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "pesquisarParametrosPorDescricaoResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.PesquisarParametrosPorDescricaoResponse addNewPesquisarParametrosPorDescricaoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.PesquisarParametrosPorDescricaoResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarParametrosPorDescricaoResponse)get_store().add_element_user(PESQUISARPARAMETROSPORDESCRICAORESPONSE$0);
            return target;
        }
    }
}
