/*
 * An XML document type.
 * Localname: buscaDataAtual
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtualDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one buscaDataAtual(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class BuscaDataAtualDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtualDocument
{
    
    public BuscaDataAtualDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSCADATAATUAL$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaDataAtual");
    
    
    /**
     * Gets the "buscaDataAtual" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtual getBuscaDataAtual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtual target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtual)get_store().find_element_user(BUSCADATAATUAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "buscaDataAtual" element
     */
    public void setBuscaDataAtual(br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtual buscaDataAtual)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtual target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtual)get_store().find_element_user(BUSCADATAATUAL$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtual)get_store().add_element_user(BUSCADATAATUAL$0);
            }
            target.set(buscaDataAtual);
        }
    }
    
    /**
     * Appends and returns a new empty "buscaDataAtual" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtual addNewBuscaDataAtual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtual target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtual)get_store().add_element_user(BUSCADATAATUAL$0);
            return target;
        }
    }
}
