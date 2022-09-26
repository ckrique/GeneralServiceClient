/*
 * An XML document type.
 * Localname: VerificaSeTodosObjetosCanceladosResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCanceladosResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one VerificaSeTodosObjetosCanceladosResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class VerificaSeTodosObjetosCanceladosResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCanceladosResponseDocument
{
    
    public VerificaSeTodosObjetosCanceladosResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERIFICASETODOSOBJETOSCANCELADOSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "VerificaSeTodosObjetosCanceladosResponse");
    
    
    /**
     * Gets the "VerificaSeTodosObjetosCanceladosResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCanceladosResponse getVerificaSeTodosObjetosCanceladosResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCanceladosResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCanceladosResponse)get_store().find_element_user(VERIFICASETODOSOBJETOSCANCELADOSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "VerificaSeTodosObjetosCanceladosResponse" element
     */
    public void setVerificaSeTodosObjetosCanceladosResponse(br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCanceladosResponse verificaSeTodosObjetosCanceladosResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCanceladosResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCanceladosResponse)get_store().find_element_user(VERIFICASETODOSOBJETOSCANCELADOSRESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCanceladosResponse)get_store().add_element_user(VERIFICASETODOSOBJETOSCANCELADOSRESPONSE$0);
            }
            target.set(verificaSeTodosObjetosCanceladosResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "VerificaSeTodosObjetosCanceladosResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCanceladosResponse addNewVerificaSeTodosObjetosCanceladosResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCanceladosResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCanceladosResponse)get_store().add_element_user(VERIFICASETODOSOBJETOSCANCELADOSRESPONSE$0);
            return target;
        }
    }
}
