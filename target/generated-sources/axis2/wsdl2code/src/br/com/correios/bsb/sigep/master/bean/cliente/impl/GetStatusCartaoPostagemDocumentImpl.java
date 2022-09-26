/*
 * An XML document type.
 * Localname: getStatusCartaoPostagem
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagemDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one getStatusCartaoPostagem(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class GetStatusCartaoPostagemDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagemDocument
{
    
    public GetStatusCartaoPostagemDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSTATUSCARTAOPOSTAGEM$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "getStatusCartaoPostagem");
    
    
    /**
     * Gets the "getStatusCartaoPostagem" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagem getGetStatusCartaoPostagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagem target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagem)get_store().find_element_user(GETSTATUSCARTAOPOSTAGEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getStatusCartaoPostagem" element
     */
    public void setGetStatusCartaoPostagem(br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagem getStatusCartaoPostagem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagem target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagem)get_store().find_element_user(GETSTATUSCARTAOPOSTAGEM$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagem)get_store().add_element_user(GETSTATUSCARTAOPOSTAGEM$0);
            }
            target.set(getStatusCartaoPostagem);
        }
    }
    
    /**
     * Appends and returns a new empty "getStatusCartaoPostagem" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagem addNewGetStatusCartaoPostagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagem target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagem)get_store().add_element_user(GETSTATUSCARTAOPOSTAGEM$0);
            return target;
        }
    }
}
