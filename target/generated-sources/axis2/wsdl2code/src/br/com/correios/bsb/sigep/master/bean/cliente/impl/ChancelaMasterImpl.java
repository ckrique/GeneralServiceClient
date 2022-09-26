/*
 * XML Type:  chancelaMaster
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML chancelaMaster(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class ChancelaMasterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster
{
    
    public ChancelaMasterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATIVO$0 = 
        new javax.xml.namespace.QName("", "ativo");
    private static final javax.xml.namespace.QName CHANCELA$2 = 
        new javax.xml.namespace.QName("", "chancela");
    private static final javax.xml.namespace.QName DATAATUALIZACAO$4 = 
        new javax.xml.namespace.QName("", "dataAtualizacao");
    private static final javax.xml.namespace.QName DESCRICAO$6 = 
        new javax.xml.namespace.QName("", "descricao");
    private static final javax.xml.namespace.QName ID$8 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName SERVICOSSIGEP$10 = 
        new javax.xml.namespace.QName("", "servicosSigep");
    
    
    /**
     * Gets the "ativo" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.SimNao.Enum getAtivo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATIVO$0, 0);
            if (target == null)
            {
                return null;
            }
            return (br.com.correios.bsb.sigep.master.bean.cliente.SimNao.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ativo" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.SimNao xgetAtivo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.SimNao target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.SimNao)get_store().find_element_user(ATIVO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ativo" element
     */
    public boolean isSetAtivo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATIVO$0) != 0;
        }
    }
    
    /**
     * Sets the "ativo" element
     */
    public void setAtivo(br.com.correios.bsb.sigep.master.bean.cliente.SimNao.Enum ativo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATIVO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATIVO$0);
            }
            target.setEnumValue(ativo);
        }
    }
    
    /**
     * Sets (as xml) the "ativo" element
     */
    public void xsetAtivo(br.com.correios.bsb.sigep.master.bean.cliente.SimNao ativo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.SimNao target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.SimNao)get_store().find_element_user(ATIVO$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.SimNao)get_store().add_element_user(ATIVO$0);
            }
            target.set(ativo);
        }
    }
    
    /**
     * Unsets the "ativo" element
     */
    public void unsetAtivo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATIVO$0, 0);
        }
    }
    
    /**
     * Gets the "chancela" element
     */
    public byte[] getChancela()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANCELA$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "chancela" element
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetChancela()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(CHANCELA$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "chancela" element
     */
    public boolean isSetChancela()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHANCELA$2) != 0;
        }
    }
    
    /**
     * Sets the "chancela" element
     */
    public void setChancela(byte[] chancela)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANCELA$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHANCELA$2);
            }
            target.setByteArrayValue(chancela);
        }
    }
    
    /**
     * Sets (as xml) the "chancela" element
     */
    public void xsetChancela(org.apache.xmlbeans.XmlBase64Binary chancela)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(CHANCELA$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(CHANCELA$2);
            }
            target.set(chancela);
        }
    }
    
    /**
     * Unsets the "chancela" element
     */
    public void unsetChancela()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHANCELA$2, 0);
        }
    }
    
    /**
     * Gets the "dataAtualizacao" element
     */
    public java.util.Calendar getDataAtualizacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAATUALIZACAO$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dataAtualizacao" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDataAtualizacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAATUALIZACAO$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "dataAtualizacao" element
     */
    public boolean isSetDataAtualizacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAATUALIZACAO$4) != 0;
        }
    }
    
    /**
     * Sets the "dataAtualizacao" element
     */
    public void setDataAtualizacao(java.util.Calendar dataAtualizacao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAATUALIZACAO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAATUALIZACAO$4);
            }
            target.setCalendarValue(dataAtualizacao);
        }
    }
    
    /**
     * Sets (as xml) the "dataAtualizacao" element
     */
    public void xsetDataAtualizacao(org.apache.xmlbeans.XmlDateTime dataAtualizacao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAATUALIZACAO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATAATUALIZACAO$4);
            }
            target.set(dataAtualizacao);
        }
    }
    
    /**
     * Unsets the "dataAtualizacao" element
     */
    public void unsetDataAtualizacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAATUALIZACAO$4, 0);
        }
    }
    
    /**
     * Gets the "descricao" element
     */
    public java.lang.String getDescricao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRICAO$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "descricao" element
     */
    public org.apache.xmlbeans.XmlString xgetDescricao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRICAO$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "descricao" element
     */
    public boolean isSetDescricao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRICAO$6) != 0;
        }
    }
    
    /**
     * Sets the "descricao" element
     */
    public void setDescricao(java.lang.String descricao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRICAO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRICAO$6);
            }
            target.setStringValue(descricao);
        }
    }
    
    /**
     * Sets (as xml) the "descricao" element
     */
    public void xsetDescricao(org.apache.xmlbeans.XmlString descricao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRICAO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRICAO$6);
            }
            target.set(descricao);
        }
    }
    
    /**
     * Unsets the "descricao" element
     */
    public void unsetDescricao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRICAO$6, 0);
        }
    }
    
    /**
     * Gets the "id" element
     */
    public long getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$8, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" element
     */
    public org.apache.xmlbeans.XmlLong xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(ID$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "id" element
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ID$8) != 0;
        }
    }
    
    /**
     * Sets the "id" element
     */
    public void setId(long id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$8);
            }
            target.setLongValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" element
     */
    public void xsetId(org.apache.xmlbeans.XmlLong id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(ID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(ID$8);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" element
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ID$8, 0);
        }
    }
    
    /**
     * Gets array of all "servicosSigep" elements
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep[] getServicosSigepArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SERVICOSSIGEP$10, targetList);
            br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep[] result = new br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "servicosSigep" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep getServicosSigepArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep)get_store().find_element_user(SERVICOSSIGEP$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "servicosSigep" element
     */
    public boolean isNilServicosSigepArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep)get_store().find_element_user(SERVICOSSIGEP$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "servicosSigep" element
     */
    public int sizeOfServicosSigepArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICOSSIGEP$10);
        }
    }
    
    /**
     * Sets array of all "servicosSigep" element
     */
    public void setServicosSigepArray(br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep[] servicosSigepArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(servicosSigepArray, SERVICOSSIGEP$10);
        }
    }
    
    /**
     * Sets ith "servicosSigep" element
     */
    public void setServicosSigepArray(int i, br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep servicosSigep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep)get_store().find_element_user(SERVICOSSIGEP$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(servicosSigep);
        }
    }
    
    /**
     * Nils the ith "servicosSigep" element
     */
    public void setNilServicosSigepArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep)get_store().find_element_user(SERVICOSSIGEP$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "servicosSigep" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep insertNewServicosSigep(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep)get_store().insert_element_user(SERVICOSSIGEP$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "servicosSigep" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep addNewServicosSigep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep)get_store().add_element_user(SERVICOSSIGEP$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "servicosSigep" element
     */
    public void removeServicosSigep(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICOSSIGEP$10, i);
        }
    }
}
