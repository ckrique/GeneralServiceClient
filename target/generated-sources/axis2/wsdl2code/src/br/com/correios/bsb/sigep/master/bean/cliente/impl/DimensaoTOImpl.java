/*
 * XML Type:  dimensaoTO
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML dimensaoTO(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class DimensaoTOImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO
{
    
    public DimensaoTOImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALTURA$0 = 
        new javax.xml.namespace.QName("", "altura");
    private static final javax.xml.namespace.QName COMPRIMENTO$2 = 
        new javax.xml.namespace.QName("", "comprimento");
    private static final javax.xml.namespace.QName DIAMETRO$4 = 
        new javax.xml.namespace.QName("", "diametro");
    private static final javax.xml.namespace.QName LARGURA$6 = 
        new javax.xml.namespace.QName("", "largura");
    private static final javax.xml.namespace.QName PESO$8 = 
        new javax.xml.namespace.QName("", "peso");
    private static final javax.xml.namespace.QName SOMA$10 = 
        new javax.xml.namespace.QName("", "soma");
    
    
    /**
     * Gets the "altura" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO getAltura()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO)get_store().find_element_user(ALTURA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "altura" element
     */
    public boolean isSetAltura()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALTURA$0) != 0;
        }
    }
    
    /**
     * Sets the "altura" element
     */
    public void setAltura(br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO altura)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO)get_store().find_element_user(ALTURA$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO)get_store().add_element_user(ALTURA$0);
            }
            target.set(altura);
        }
    }
    
    /**
     * Appends and returns a new empty "altura" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO addNewAltura()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO)get_store().add_element_user(ALTURA$0);
            return target;
        }
    }
    
    /**
     * Unsets the "altura" element
     */
    public void unsetAltura()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALTURA$0, 0);
        }
    }
    
    /**
     * Gets the "comprimento" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO getComprimento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO)get_store().find_element_user(COMPRIMENTO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "comprimento" element
     */
    public boolean isSetComprimento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPRIMENTO$2) != 0;
        }
    }
    
    /**
     * Sets the "comprimento" element
     */
    public void setComprimento(br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO comprimento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO)get_store().find_element_user(COMPRIMENTO$2, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO)get_store().add_element_user(COMPRIMENTO$2);
            }
            target.set(comprimento);
        }
    }
    
    /**
     * Appends and returns a new empty "comprimento" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO addNewComprimento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO)get_store().add_element_user(COMPRIMENTO$2);
            return target;
        }
    }
    
    /**
     * Unsets the "comprimento" element
     */
    public void unsetComprimento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPRIMENTO$2, 0);
        }
    }
    
    /**
     * Gets the "diametro" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO getDiametro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO)get_store().find_element_user(DIAMETRO$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "diametro" element
     */
    public boolean isSetDiametro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIAMETRO$4) != 0;
        }
    }
    
    /**
     * Sets the "diametro" element
     */
    public void setDiametro(br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO diametro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO)get_store().find_element_user(DIAMETRO$4, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO)get_store().add_element_user(DIAMETRO$4);
            }
            target.set(diametro);
        }
    }
    
    /**
     * Appends and returns a new empty "diametro" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO addNewDiametro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO)get_store().add_element_user(DIAMETRO$4);
            return target;
        }
    }
    
    /**
     * Unsets the "diametro" element
     */
    public void unsetDiametro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIAMETRO$4, 0);
        }
    }
    
    /**
     * Gets the "largura" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO getLargura()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO)get_store().find_element_user(LARGURA$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "largura" element
     */
    public boolean isSetLargura()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LARGURA$6) != 0;
        }
    }
    
    /**
     * Sets the "largura" element
     */
    public void setLargura(br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO largura)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO)get_store().find_element_user(LARGURA$6, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO)get_store().add_element_user(LARGURA$6);
            }
            target.set(largura);
        }
    }
    
    /**
     * Appends and returns a new empty "largura" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO addNewLargura()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO)get_store().add_element_user(LARGURA$6);
            return target;
        }
    }
    
    /**
     * Unsets the "largura" element
     */
    public void unsetLargura()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LARGURA$6, 0);
        }
    }
    
    /**
     * Gets the "peso" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO getPeso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO)get_store().find_element_user(PESO$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "peso" element
     */
    public boolean isSetPeso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PESO$8) != 0;
        }
    }
    
    /**
     * Sets the "peso" element
     */
    public void setPeso(br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO peso)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO)get_store().find_element_user(PESO$8, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO)get_store().add_element_user(PESO$8);
            }
            target.set(peso);
        }
    }
    
    /**
     * Appends and returns a new empty "peso" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO addNewPeso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO)get_store().add_element_user(PESO$8);
            return target;
        }
    }
    
    /**
     * Unsets the "peso" element
     */
    public void unsetPeso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PESO$8, 0);
        }
    }
    
    /**
     * Gets the "soma" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO getSoma()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO)get_store().find_element_user(SOMA$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "soma" element
     */
    public boolean isSetSoma()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOMA$10) != 0;
        }
    }
    
    /**
     * Sets the "soma" element
     */
    public void setSoma(br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO soma)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO)get_store().find_element_user(SOMA$10, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO)get_store().add_element_user(SOMA$10);
            }
            target.set(soma);
        }
    }
    
    /**
     * Appends and returns a new empty "soma" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO addNewSoma()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO)get_store().add_element_user(SOMA$10);
            return target;
        }
    }
    
    /**
     * Unsets the "soma" element
     */
    public void unsetSoma()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOMA$10, 0);
        }
    }
}
