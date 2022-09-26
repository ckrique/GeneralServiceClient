/*
 * An XML document type.
 * Localname: validarPostagemSimultanea
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultaneaDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one validarPostagemSimultanea(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class ValidarPostagemSimultaneaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultaneaDocument
{
    
    public ValidarPostagemSimultaneaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDARPOSTAGEMSIMULTANEA$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "validarPostagemSimultanea");
    
    
    /**
     * Gets the "validarPostagemSimultanea" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea getValidarPostagemSimultanea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea)get_store().find_element_user(VALIDARPOSTAGEMSIMULTANEA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "validarPostagemSimultanea" element
     */
    public void setValidarPostagemSimultanea(br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea validarPostagemSimultanea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea)get_store().find_element_user(VALIDARPOSTAGEMSIMULTANEA$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea)get_store().add_element_user(VALIDARPOSTAGEMSIMULTANEA$0);
            }
            target.set(validarPostagemSimultanea);
        }
    }
    
    /**
     * Appends and returns a new empty "validarPostagemSimultanea" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea addNewValidarPostagemSimultanea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea)get_store().add_element_user(VALIDARPOSTAGEMSIMULTANEA$0);
            return target;
        }
    }
}
