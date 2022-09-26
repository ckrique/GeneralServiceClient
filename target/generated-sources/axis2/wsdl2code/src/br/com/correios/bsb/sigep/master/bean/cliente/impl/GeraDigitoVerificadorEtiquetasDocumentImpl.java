/*
 * An XML document type.
 * Localname: geraDigitoVerificadorEtiquetas
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetasDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one geraDigitoVerificadorEtiquetas(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class GeraDigitoVerificadorEtiquetasDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetasDocument
{
    
    public GeraDigitoVerificadorEtiquetasDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GERADIGITOVERIFICADORETIQUETAS$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "geraDigitoVerificadorEtiquetas");
    
    
    /**
     * Gets the "geraDigitoVerificadorEtiquetas" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetas getGeraDigitoVerificadorEtiquetas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetas target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetas)get_store().find_element_user(GERADIGITOVERIFICADORETIQUETAS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "geraDigitoVerificadorEtiquetas" element
     */
    public void setGeraDigitoVerificadorEtiquetas(br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetas geraDigitoVerificadorEtiquetas)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetas target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetas)get_store().find_element_user(GERADIGITOVERIFICADORETIQUETAS$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetas)get_store().add_element_user(GERADIGITOVERIFICADORETIQUETAS$0);
            }
            target.set(geraDigitoVerificadorEtiquetas);
        }
    }
    
    /**
     * Appends and returns a new empty "geraDigitoVerificadorEtiquetas" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetas addNewGeraDigitoVerificadorEtiquetas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetas target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetas)get_store().add_element_user(GERADIGITOVERIFICADORETIQUETAS$0);
            return target;
        }
    }
}
