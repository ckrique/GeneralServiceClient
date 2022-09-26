/*
 * XML Type:  coletaReversa
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML coletaReversa(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class ColetaReversaImpl extends br.com.correios.bsb.sigep.master.bean.cliente.impl.ColetaImpl implements br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa
{
    
    public ColetaReversaImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AG$0 = 
        new javax.xml.namespace.QName("", "ag");
    private static final javax.xml.namespace.QName AR$2 = 
        new javax.xml.namespace.QName("", "ar");
    private static final javax.xml.namespace.QName CARTAO$4 = 
        new javax.xml.namespace.QName("", "cartao");
    private static final javax.xml.namespace.QName NUMERO$6 = 
        new javax.xml.namespace.QName("", "numero");
    private static final javax.xml.namespace.QName OBJCOL$8 = 
        new javax.xml.namespace.QName("", "obj_col");
    private static final javax.xml.namespace.QName SERVICOADICIONAL$10 = 
        new javax.xml.namespace.QName("", "servico_adicional");
    
    
    /**
     * Gets the "ag" element
     */
    public java.lang.String getAg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ag" element
     */
    public org.apache.xmlbeans.XmlString xgetAg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AG$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ag" element
     */
    public boolean isSetAg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AG$0) != 0;
        }
    }
    
    /**
     * Sets the "ag" element
     */
    public void setAg(java.lang.String ag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AG$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AG$0);
            }
            target.setStringValue(ag);
        }
    }
    
    /**
     * Sets (as xml) the "ag" element
     */
    public void xsetAg(org.apache.xmlbeans.XmlString ag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AG$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AG$0);
            }
            target.set(ag);
        }
    }
    
    /**
     * Unsets the "ag" element
     */
    public void unsetAg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AG$0, 0);
        }
    }
    
    /**
     * Gets the "ar" element
     */
    public int getAr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AR$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ar" element
     */
    public org.apache.xmlbeans.XmlInt xgetAr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(AR$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "ar" element
     */
    public boolean isSetAr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AR$2) != 0;
        }
    }
    
    /**
     * Sets the "ar" element
     */
    public void setAr(int ar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AR$2);
            }
            target.setIntValue(ar);
        }
    }
    
    /**
     * Sets (as xml) the "ar" element
     */
    public void xsetAr(org.apache.xmlbeans.XmlInt ar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(AR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(AR$2);
            }
            target.set(ar);
        }
    }
    
    /**
     * Unsets the "ar" element
     */
    public void unsetAr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AR$2, 0);
        }
    }
    
    /**
     * Gets the "cartao" element
     */
    public java.lang.String getCartao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARTAO$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cartao" element
     */
    public org.apache.xmlbeans.XmlString xgetCartao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CARTAO$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "cartao" element
     */
    public boolean isSetCartao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CARTAO$4) != 0;
        }
    }
    
    /**
     * Sets the "cartao" element
     */
    public void setCartao(java.lang.String cartao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARTAO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CARTAO$4);
            }
            target.setStringValue(cartao);
        }
    }
    
    /**
     * Sets (as xml) the "cartao" element
     */
    public void xsetCartao(org.apache.xmlbeans.XmlString cartao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CARTAO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CARTAO$4);
            }
            target.set(cartao);
        }
    }
    
    /**
     * Unsets the "cartao" element
     */
    public void unsetCartao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CARTAO$4, 0);
        }
    }
    
    /**
     * Gets the "numero" element
     */
    public int getNumero()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMERO$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "numero" element
     */
    public org.apache.xmlbeans.XmlInt xgetNumero()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMERO$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "numero" element
     */
    public boolean isSetNumero()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMERO$6) != 0;
        }
    }
    
    /**
     * Sets the "numero" element
     */
    public void setNumero(int numero)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMERO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMERO$6);
            }
            target.setIntValue(numero);
        }
    }
    
    /**
     * Sets (as xml) the "numero" element
     */
    public void xsetNumero(org.apache.xmlbeans.XmlInt numero)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMERO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMERO$6);
            }
            target.set(numero);
        }
    }
    
    /**
     * Unsets the "numero" element
     */
    public void unsetNumero()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMERO$6, 0);
        }
    }
    
    /**
     * Gets array of all "obj_col" elements
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.Objeto[] getObjColArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OBJCOL$8, targetList);
            br.com.correios.bsb.sigep.master.bean.cliente.Objeto[] result = new br.com.correios.bsb.sigep.master.bean.cliente.Objeto[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "obj_col" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.Objeto getObjColArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.Objeto target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.Objeto)get_store().find_element_user(OBJCOL$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "obj_col" element
     */
    public boolean isNilObjColArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.Objeto target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.Objeto)get_store().find_element_user(OBJCOL$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "obj_col" element
     */
    public int sizeOfObjColArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJCOL$8);
        }
    }
    
    /**
     * Sets array of all "obj_col" element
     */
    public void setObjColArray(br.com.correios.bsb.sigep.master.bean.cliente.Objeto[] objColArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(objColArray, OBJCOL$8);
        }
    }
    
    /**
     * Sets ith "obj_col" element
     */
    public void setObjColArray(int i, br.com.correios.bsb.sigep.master.bean.cliente.Objeto objCol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.Objeto target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.Objeto)get_store().find_element_user(OBJCOL$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(objCol);
        }
    }
    
    /**
     * Nils the ith "obj_col" element
     */
    public void setNilObjColArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.Objeto target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.Objeto)get_store().find_element_user(OBJCOL$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "obj_col" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.Objeto insertNewObjCol(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.Objeto target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.Objeto)get_store().insert_element_user(OBJCOL$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "obj_col" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.Objeto addNewObjCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.Objeto target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.Objeto)get_store().add_element_user(OBJCOL$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "obj_col" element
     */
    public void removeObjCol(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJCOL$8, i);
        }
    }
    
    /**
     * Gets the "servico_adicional" element
     */
    public java.lang.String getServicoAdicional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICOADICIONAL$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "servico_adicional" element
     */
    public org.apache.xmlbeans.XmlString xgetServicoAdicional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICOADICIONAL$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "servico_adicional" element
     */
    public boolean isSetServicoAdicional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICOADICIONAL$10) != 0;
        }
    }
    
    /**
     * Sets the "servico_adicional" element
     */
    public void setServicoAdicional(java.lang.String servicoAdicional)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICOADICIONAL$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICOADICIONAL$10);
            }
            target.setStringValue(servicoAdicional);
        }
    }
    
    /**
     * Sets (as xml) the "servico_adicional" element
     */
    public void xsetServicoAdicional(org.apache.xmlbeans.XmlString servicoAdicional)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICOADICIONAL$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SERVICOADICIONAL$10);
            }
            target.set(servicoAdicional);
        }
    }
    
    /**
     * Unsets the "servico_adicional" element
     */
    public void unsetServicoAdicional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICOADICIONAL$10, 0);
        }
    }
}
