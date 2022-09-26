/*
 * An XML document type.
 * Localname: solicitaEtiquetas
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetasDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one solicitaEtiquetas(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class SolicitaEtiquetasDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetasDocument
{
    
    public SolicitaEtiquetasDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOLICITAETIQUETAS$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "solicitaEtiquetas");
    
    
    /**
     * Gets the "solicitaEtiquetas" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas getSolicitaEtiquetas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas)get_store().find_element_user(SOLICITAETIQUETAS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "solicitaEtiquetas" element
     */
    public void setSolicitaEtiquetas(br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas solicitaEtiquetas)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas)get_store().find_element_user(SOLICITAETIQUETAS$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas)get_store().add_element_user(SOLICITAETIQUETAS$0);
            }
            target.set(solicitaEtiquetas);
        }
    }
    
    /**
     * Appends and returns a new empty "solicitaEtiquetas" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas addNewSolicitaEtiquetas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas)get_store().add_element_user(SOLICITAETIQUETAS$0);
            return target;
        }
    }
}
