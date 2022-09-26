/*
 * XML Type:  getStatusCartaoPostagemResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagemResponse
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML getStatusCartaoPostagemResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class GetStatusCartaoPostagemResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagemResponse
{
    
    public GetStatusCartaoPostagemResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RETURN$0 = 
        new javax.xml.namespace.QName("", "return");
    
    
    /**
     * Gets the "return" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.StatusCartao.Enum getReturn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURN$0, 0);
            if (target == null)
            {
                return null;
            }
            return (br.com.correios.bsb.sigep.master.bean.cliente.StatusCartao.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "return" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.StatusCartao xgetReturn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.StatusCartao target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.StatusCartao)get_store().find_element_user(RETURN$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "return" element
     */
    public boolean isSetReturn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RETURN$0) != 0;
        }
    }
    
    /**
     * Sets the "return" element
     */
    public void setReturn(br.com.correios.bsb.sigep.master.bean.cliente.StatusCartao.Enum xreturn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETURN$0);
            }
            target.setEnumValue(xreturn);
        }
    }
    
    /**
     * Sets (as xml) the "return" element
     */
    public void xsetReturn(br.com.correios.bsb.sigep.master.bean.cliente.StatusCartao xreturn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.StatusCartao target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.StatusCartao)get_store().find_element_user(RETURN$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.StatusCartao)get_store().add_element_user(RETURN$0);
            }
            target.set(xreturn);
        }
    }
    
    /**
     * Unsets the "return" element
     */
    public void unsetReturn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RETURN$0, 0);
        }
    }
}
