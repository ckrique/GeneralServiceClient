/*
 * An XML document type.
 * Localname: ErroMontagemRelatorio
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ErroMontagemRelatorioDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one ErroMontagemRelatorio(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class ErroMontagemRelatorioDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.ErroMontagemRelatorioDocument
{
    
    public ErroMontagemRelatorioDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERROMONTAGEMRELATORIO$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "ErroMontagemRelatorio");
    
    
    /**
     * Gets the "ErroMontagemRelatorio" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ErroMontagemRelatorio getErroMontagemRelatorio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ErroMontagemRelatorio target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ErroMontagemRelatorio)get_store().find_element_user(ERROMONTAGEMRELATORIO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ErroMontagemRelatorio" element
     */
    public void setErroMontagemRelatorio(br.com.correios.bsb.sigep.master.bean.cliente.ErroMontagemRelatorio erroMontagemRelatorio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ErroMontagemRelatorio target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ErroMontagemRelatorio)get_store().find_element_user(ERROMONTAGEMRELATORIO$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.ErroMontagemRelatorio)get_store().add_element_user(ERROMONTAGEMRELATORIO$0);
            }
            target.set(erroMontagemRelatorio);
        }
    }
    
    /**
     * Appends and returns a new empty "ErroMontagemRelatorio" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ErroMontagemRelatorio addNewErroMontagemRelatorio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ErroMontagemRelatorio target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ErroMontagemRelatorio)get_store().add_element_user(ERROMONTAGEMRELATORIO$0);
            return target;
        }
    }
}
