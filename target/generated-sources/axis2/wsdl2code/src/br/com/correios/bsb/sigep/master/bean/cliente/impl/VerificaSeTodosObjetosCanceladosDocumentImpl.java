/*
 * An XML document type.
 * Localname: VerificaSeTodosObjetosCancelados
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCanceladosDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one VerificaSeTodosObjetosCancelados(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class VerificaSeTodosObjetosCanceladosDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCanceladosDocument
{
    
    public VerificaSeTodosObjetosCanceladosDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERIFICASETODOSOBJETOSCANCELADOS$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "VerificaSeTodosObjetosCancelados");
    
    
    /**
     * Gets the "VerificaSeTodosObjetosCancelados" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCancelados getVerificaSeTodosObjetosCancelados()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCancelados target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCancelados)get_store().find_element_user(VERIFICASETODOSOBJETOSCANCELADOS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "VerificaSeTodosObjetosCancelados" element
     */
    public void setVerificaSeTodosObjetosCancelados(br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCancelados verificaSeTodosObjetosCancelados)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCancelados target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCancelados)get_store().find_element_user(VERIFICASETODOSOBJETOSCANCELADOS$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCancelados)get_store().add_element_user(VERIFICASETODOSOBJETOSCANCELADOS$0);
            }
            target.set(verificaSeTodosObjetosCancelados);
        }
    }
    
    /**
     * Appends and returns a new empty "VerificaSeTodosObjetosCancelados" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCancelados addNewVerificaSeTodosObjetosCancelados()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCancelados target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCancelados)get_store().add_element_user(VERIFICASETODOSOBJETOSCANCELADOS$0);
            return target;
        }
    }
}
