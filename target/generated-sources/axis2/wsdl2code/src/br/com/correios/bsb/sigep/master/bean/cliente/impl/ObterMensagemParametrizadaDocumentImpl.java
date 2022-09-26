/*
 * An XML document type.
 * Localname: obterMensagemParametrizada
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizadaDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one obterMensagemParametrizada(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class ObterMensagemParametrizadaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizadaDocument
{
    
    public ObterMensagemParametrizadaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBTERMENSAGEMPARAMETRIZADA$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "obterMensagemParametrizada");
    
    
    /**
     * Gets the "obterMensagemParametrizada" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizada getObterMensagemParametrizada()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizada target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizada)get_store().find_element_user(OBTERMENSAGEMPARAMETRIZADA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "obterMensagemParametrizada" element
     */
    public void setObterMensagemParametrizada(br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizada obterMensagemParametrizada)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizada target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizada)get_store().find_element_user(OBTERMENSAGEMPARAMETRIZADA$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizada)get_store().add_element_user(OBTERMENSAGEMPARAMETRIZADA$0);
            }
            target.set(obterMensagemParametrizada);
        }
    }
    
    /**
     * Appends and returns a new empty "obterMensagemParametrizada" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizada addNewObterMensagemParametrizada()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizada target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizada)get_store().add_element_user(OBTERMENSAGEMPARAMETRIZADA$0);
            return target;
        }
    }
}
