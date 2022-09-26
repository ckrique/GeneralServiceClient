/*
 * An XML document type.
 * Localname: obterEmbalagemLRS
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRSDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one obterEmbalagemLRS(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class ObterEmbalagemLRSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRSDocument
{
    
    public ObterEmbalagemLRSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBTEREMBALAGEMLRS$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "obterEmbalagemLRS");
    
    
    /**
     * Gets the "obterEmbalagemLRS" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRS getObterEmbalagemLRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRS target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRS)get_store().find_element_user(OBTEREMBALAGEMLRS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "obterEmbalagemLRS" element
     */
    public void setObterEmbalagemLRS(br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRS obterEmbalagemLRS)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRS target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRS)get_store().find_element_user(OBTEREMBALAGEMLRS$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRS)get_store().add_element_user(OBTEREMBALAGEMLRS$0);
            }
            target.set(obterEmbalagemLRS);
        }
    }
    
    /**
     * Appends and returns a new empty "obterEmbalagemLRS" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRS addNewObterEmbalagemLRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRS target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRS)get_store().add_element_user(OBTEREMBALAGEMLRS$0);
            return target;
        }
    }
}
