/*
 * An XML document type.
 * Localname: buscaServicosValorDeclarado
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclaradoDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one buscaServicosValorDeclarado(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class BuscaServicosValorDeclaradoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclaradoDocument
{
    
    public BuscaServicosValorDeclaradoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSCASERVICOSVALORDECLARADO$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaServicosValorDeclarado");
    
    
    /**
     * Gets the "buscaServicosValorDeclarado" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclarado getBuscaServicosValorDeclarado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclarado target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclarado)get_store().find_element_user(BUSCASERVICOSVALORDECLARADO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "buscaServicosValorDeclarado" element
     */
    public void setBuscaServicosValorDeclarado(br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclarado buscaServicosValorDeclarado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclarado target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclarado)get_store().find_element_user(BUSCASERVICOSVALORDECLARADO$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclarado)get_store().add_element_user(BUSCASERVICOSVALORDECLARADO$0);
            }
            target.set(buscaServicosValorDeclarado);
        }
    }
    
    /**
     * Appends and returns a new empty "buscaServicosValorDeclarado" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclarado addNewBuscaServicosValorDeclarado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclarado target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclarado)get_store().add_element_user(BUSCASERVICOSVALORDECLARADO$0);
            return target;
        }
    }
}
