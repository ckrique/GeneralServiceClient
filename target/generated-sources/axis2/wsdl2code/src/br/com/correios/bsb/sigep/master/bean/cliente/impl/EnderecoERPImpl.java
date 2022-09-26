/*
 * XML Type:  enderecoERP
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML enderecoERP(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class EnderecoERPImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP
{
    
    public EnderecoERPImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BAIRRO$0 = 
        new javax.xml.namespace.QName("", "bairro");
    private static final javax.xml.namespace.QName CEP$2 = 
        new javax.xml.namespace.QName("", "cep");
    private static final javax.xml.namespace.QName CIDADE$4 = 
        new javax.xml.namespace.QName("", "cidade");
    private static final javax.xml.namespace.QName COMPLEMENTO2$6 = 
        new javax.xml.namespace.QName("", "complemento2");
    private static final javax.xml.namespace.QName END$8 = 
        new javax.xml.namespace.QName("", "end");
    private static final javax.xml.namespace.QName UF$10 = 
        new javax.xml.namespace.QName("", "uf");
    private static final javax.xml.namespace.QName UNIDADESPOSTAGEM$12 = 
        new javax.xml.namespace.QName("", "unidadesPostagem");
    
    
    /**
     * Gets the "bairro" element
     */
    public java.lang.String getBairro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BAIRRO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "bairro" element
     */
    public org.apache.xmlbeans.XmlString xgetBairro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BAIRRO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "bairro" element
     */
    public boolean isSetBairro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BAIRRO$0) != 0;
        }
    }
    
    /**
     * Sets the "bairro" element
     */
    public void setBairro(java.lang.String bairro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BAIRRO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BAIRRO$0);
            }
            target.setStringValue(bairro);
        }
    }
    
    /**
     * Sets (as xml) the "bairro" element
     */
    public void xsetBairro(org.apache.xmlbeans.XmlString bairro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BAIRRO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BAIRRO$0);
            }
            target.set(bairro);
        }
    }
    
    /**
     * Unsets the "bairro" element
     */
    public void unsetBairro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BAIRRO$0, 0);
        }
    }
    
    /**
     * Gets the "cep" element
     */
    public java.lang.String getCep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CEP$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cep" element
     */
    public org.apache.xmlbeans.XmlString xgetCep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CEP$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "cep" element
     */
    public boolean isSetCep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CEP$2) != 0;
        }
    }
    
    /**
     * Sets the "cep" element
     */
    public void setCep(java.lang.String cep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CEP$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CEP$2);
            }
            target.setStringValue(cep);
        }
    }
    
    /**
     * Sets (as xml) the "cep" element
     */
    public void xsetCep(org.apache.xmlbeans.XmlString cep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CEP$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CEP$2);
            }
            target.set(cep);
        }
    }
    
    /**
     * Unsets the "cep" element
     */
    public void unsetCep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CEP$2, 0);
        }
    }
    
    /**
     * Gets the "cidade" element
     */
    public java.lang.String getCidade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CIDADE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cidade" element
     */
    public org.apache.xmlbeans.XmlString xgetCidade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CIDADE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "cidade" element
     */
    public boolean isSetCidade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CIDADE$4) != 0;
        }
    }
    
    /**
     * Sets the "cidade" element
     */
    public void setCidade(java.lang.String cidade)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CIDADE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CIDADE$4);
            }
            target.setStringValue(cidade);
        }
    }
    
    /**
     * Sets (as xml) the "cidade" element
     */
    public void xsetCidade(org.apache.xmlbeans.XmlString cidade)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CIDADE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CIDADE$4);
            }
            target.set(cidade);
        }
    }
    
    /**
     * Unsets the "cidade" element
     */
    public void unsetCidade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CIDADE$4, 0);
        }
    }
    
    /**
     * Gets the "complemento2" element
     */
    public java.lang.String getComplemento2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPLEMENTO2$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "complemento2" element
     */
    public org.apache.xmlbeans.XmlString xgetComplemento2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMPLEMENTO2$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "complemento2" element
     */
    public boolean isSetComplemento2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPLEMENTO2$6) != 0;
        }
    }
    
    /**
     * Sets the "complemento2" element
     */
    public void setComplemento2(java.lang.String complemento2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPLEMENTO2$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPLEMENTO2$6);
            }
            target.setStringValue(complemento2);
        }
    }
    
    /**
     * Sets (as xml) the "complemento2" element
     */
    public void xsetComplemento2(org.apache.xmlbeans.XmlString complemento2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMPLEMENTO2$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMPLEMENTO2$6);
            }
            target.set(complemento2);
        }
    }
    
    /**
     * Unsets the "complemento2" element
     */
    public void unsetComplemento2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPLEMENTO2$6, 0);
        }
    }
    
    /**
     * Gets the "end" element
     */
    public java.lang.String getEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(END$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "end" element
     */
    public org.apache.xmlbeans.XmlString xgetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(END$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "end" element
     */
    public boolean isSetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(END$8) != 0;
        }
    }
    
    /**
     * Sets the "end" element
     */
    public void setEnd(java.lang.String end)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(END$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(END$8);
            }
            target.setStringValue(end);
        }
    }
    
    /**
     * Sets (as xml) the "end" element
     */
    public void xsetEnd(org.apache.xmlbeans.XmlString end)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(END$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(END$8);
            }
            target.set(end);
        }
    }
    
    /**
     * Unsets the "end" element
     */
    public void unsetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(END$8, 0);
        }
    }
    
    /**
     * Gets the "uf" element
     */
    public java.lang.String getUf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UF$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "uf" element
     */
    public org.apache.xmlbeans.XmlString xgetUf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UF$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "uf" element
     */
    public boolean isSetUf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UF$10) != 0;
        }
    }
    
    /**
     * Sets the "uf" element
     */
    public void setUf(java.lang.String uf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UF$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UF$10);
            }
            target.setStringValue(uf);
        }
    }
    
    /**
     * Sets (as xml) the "uf" element
     */
    public void xsetUf(org.apache.xmlbeans.XmlString uf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UF$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UF$10);
            }
            target.set(uf);
        }
    }
    
    /**
     * Unsets the "uf" element
     */
    public void unsetUf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UF$10, 0);
        }
    }
    
    /**
     * Gets array of all "unidadesPostagem" elements
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP[] getUnidadesPostagemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(UNIDADESPOSTAGEM$12, targetList);
            br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP[] result = new br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "unidadesPostagem" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP getUnidadesPostagemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP)get_store().find_element_user(UNIDADESPOSTAGEM$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "unidadesPostagem" element
     */
    public boolean isNilUnidadesPostagemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP)get_store().find_element_user(UNIDADESPOSTAGEM$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "unidadesPostagem" element
     */
    public int sizeOfUnidadesPostagemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNIDADESPOSTAGEM$12);
        }
    }
    
    /**
     * Sets array of all "unidadesPostagem" element
     */
    public void setUnidadesPostagemArray(br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP[] unidadesPostagemArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(unidadesPostagemArray, UNIDADESPOSTAGEM$12);
        }
    }
    
    /**
     * Sets ith "unidadesPostagem" element
     */
    public void setUnidadesPostagemArray(int i, br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP unidadesPostagem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP)get_store().find_element_user(UNIDADESPOSTAGEM$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(unidadesPostagem);
        }
    }
    
    /**
     * Nils the ith "unidadesPostagem" element
     */
    public void setNilUnidadesPostagemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP)get_store().find_element_user(UNIDADESPOSTAGEM$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "unidadesPostagem" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP insertNewUnidadesPostagem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP)get_store().insert_element_user(UNIDADESPOSTAGEM$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "unidadesPostagem" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP addNewUnidadesPostagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP)get_store().add_element_user(UNIDADESPOSTAGEM$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "unidadesPostagem" element
     */
    public void removeUnidadesPostagem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNIDADESPOSTAGEM$12, i);
        }
    }
}
