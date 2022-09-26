/*
 * XML Type:  buscaServicosAdicionaisAtivosResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivosResponse
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML buscaServicosAdicionaisAtivosResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class BuscaServicosAdicionaisAtivosResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivosResponse
{
    
    public BuscaServicosAdicionaisAtivosResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RETURN$0 = 
        new javax.xml.namespace.QName("", "return");
    
    
    /**
     * Gets array of all "return" elements
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML[] getReturnArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RETURN$0, targetList);
            br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML[] result = new br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "return" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML getReturnArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML)get_store().find_element_user(RETURN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "return" element
     */
    public int sizeOfReturnArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RETURN$0);
        }
    }
    
    /**
     * Sets array of all "return" element
     */
    public void setReturnArray(br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML[] xreturnArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(xreturnArray, RETURN$0);
        }
    }
    
    /**
     * Sets ith "return" element
     */
    public void setReturnArray(int i, br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML xreturn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML)get_store().find_element_user(RETURN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(xreturn);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "return" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML insertNewReturn(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML)get_store().insert_element_user(RETURN$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "return" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML addNewReturn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML)get_store().add_element_user(RETURN$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "return" element
     */
    public void removeReturn(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RETURN$0, i);
        }
    }
}
