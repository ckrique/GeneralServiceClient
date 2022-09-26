/*
 * An XML document type.
 * Localname: atualizaRemessaAgrupada
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupadaDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one atualizaRemessaAgrupada(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class AtualizaRemessaAgrupadaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupadaDocument
{
    
    public AtualizaRemessaAgrupadaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATUALIZAREMESSAAGRUPADA$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "atualizaRemessaAgrupada");
    
    
    /**
     * Gets the "atualizaRemessaAgrupada" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupada getAtualizaRemessaAgrupada()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupada target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupada)get_store().find_element_user(ATUALIZAREMESSAAGRUPADA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "atualizaRemessaAgrupada" element
     */
    public void setAtualizaRemessaAgrupada(br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupada atualizaRemessaAgrupada)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupada target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupada)get_store().find_element_user(ATUALIZAREMESSAAGRUPADA$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupada)get_store().add_element_user(ATUALIZAREMESSAAGRUPADA$0);
            }
            target.set(atualizaRemessaAgrupada);
        }
    }
    
    /**
     * Appends and returns a new empty "atualizaRemessaAgrupada" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupada addNewAtualizaRemessaAgrupada()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupada target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupada)get_store().add_element_user(ATUALIZAREMESSAAGRUPADA$0);
            return target;
        }
    }
}
