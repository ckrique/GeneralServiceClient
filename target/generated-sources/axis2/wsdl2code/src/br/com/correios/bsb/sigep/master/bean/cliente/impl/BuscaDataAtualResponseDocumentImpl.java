/*
 * An XML document type.
 * Localname: buscaDataAtualResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtualResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one buscaDataAtualResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class BuscaDataAtualResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtualResponseDocument
{
    
    public BuscaDataAtualResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSCADATAATUALRESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaDataAtualResponse");
    
    
    /**
     * Gets the "buscaDataAtualResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtualResponse getBuscaDataAtualResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtualResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtualResponse)get_store().find_element_user(BUSCADATAATUALRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "buscaDataAtualResponse" element
     */
    public void setBuscaDataAtualResponse(br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtualResponse buscaDataAtualResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtualResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtualResponse)get_store().find_element_user(BUSCADATAATUALRESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtualResponse)get_store().add_element_user(BUSCADATAATUALRESPONSE$0);
            }
            target.set(buscaDataAtualResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "buscaDataAtualResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtualResponse addNewBuscaDataAtualResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtualResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtualResponse)get_store().add_element_user(BUSCADATAATUALRESPONSE$0);
            return target;
        }
    }
}
