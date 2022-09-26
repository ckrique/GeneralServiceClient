/*
 * XML Type:  pesquisarEmbalagensPorServicoResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML pesquisarEmbalagensPorServicoResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class PesquisarEmbalagensPorServicoResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse
{
    
    public PesquisarEmbalagensPorServicoResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RETURN$0 = 
        new javax.xml.namespace.QName("", "return");
    
    
    /**
     * Gets array of all "return" elements
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem.Enum[] getReturnArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RETURN$0, targetList);
            br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem.Enum[] result = new br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "return" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem.Enum getReturnArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "return" elements
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem[] xgetReturnArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RETURN$0, targetList);
            br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem[] result = new br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "return" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem xgetReturnArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem)get_store().find_element_user(RETURN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem)target;
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
    public void setReturnArray(br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem.Enum[] xreturnArray)
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
    public void setReturnArray(int i, br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem.Enum xreturn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(xreturn);
        }
    }
    
    /**
     * Sets (as xml) array of all "return" element
     */
    public void xsetReturnArray(br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem[]xreturnArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(xreturnArray, RETURN$0);
        }
    }
    
    /**
     * Sets (as xml) ith "return" element
     */
    public void xsetReturnArray(int i, br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem xreturn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem)get_store().find_element_user(RETURN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(xreturn);
        }
    }
    
    /**
     * Inserts the value as the ith "return" element
     */
    public void insertReturn(int i, br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem.Enum xreturn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(RETURN$0, i);
            target.setEnumValue(xreturn);
        }
    }
    
    /**
     * Appends the value as the last "return" element
     */
    public void addReturn(br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem.Enum xreturn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETURN$0);
            target.setEnumValue(xreturn);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "return" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem insertNewReturn(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem)get_store().insert_element_user(RETURN$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "return" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem addNewReturn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem)get_store().add_element_user(RETURN$0);
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
