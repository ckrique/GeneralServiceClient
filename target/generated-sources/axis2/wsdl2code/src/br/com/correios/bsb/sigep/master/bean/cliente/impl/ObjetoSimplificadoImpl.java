/*
 * XML Type:  objetoSimplificado
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ObjetoSimplificado
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML objetoSimplificado(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class ObjetoSimplificadoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.ObjetoSimplificado
{
    
    public ObjetoSimplificadoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAHORACANCELAMENTO$0 = 
        new javax.xml.namespace.QName("", "datahora_cancelamento");
    private static final javax.xml.namespace.QName NUMEROPEDIDO$2 = 
        new javax.xml.namespace.QName("", "numero_pedido");
    private static final javax.xml.namespace.QName STATUSPEDIDO$4 = 
        new javax.xml.namespace.QName("", "status_pedido");
    
    
    /**
     * Gets the "datahora_cancelamento" element
     */
    public java.lang.String getDatahoraCancelamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAHORACANCELAMENTO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "datahora_cancelamento" element
     */
    public org.apache.xmlbeans.XmlString xgetDatahoraCancelamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAHORACANCELAMENTO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "datahora_cancelamento" element
     */
    public boolean isSetDatahoraCancelamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAHORACANCELAMENTO$0) != 0;
        }
    }
    
    /**
     * Sets the "datahora_cancelamento" element
     */
    public void setDatahoraCancelamento(java.lang.String datahoraCancelamento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAHORACANCELAMENTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAHORACANCELAMENTO$0);
            }
            target.setStringValue(datahoraCancelamento);
        }
    }
    
    /**
     * Sets (as xml) the "datahora_cancelamento" element
     */
    public void xsetDatahoraCancelamento(org.apache.xmlbeans.XmlString datahoraCancelamento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAHORACANCELAMENTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATAHORACANCELAMENTO$0);
            }
            target.set(datahoraCancelamento);
        }
    }
    
    /**
     * Unsets the "datahora_cancelamento" element
     */
    public void unsetDatahoraCancelamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAHORACANCELAMENTO$0, 0);
        }
    }
    
    /**
     * Gets the "numero_pedido" element
     */
    public int getNumeroPedido()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMEROPEDIDO$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "numero_pedido" element
     */
    public org.apache.xmlbeans.XmlInt xgetNumeroPedido()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMEROPEDIDO$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "numero_pedido" element
     */
    public boolean isSetNumeroPedido()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMEROPEDIDO$2) != 0;
        }
    }
    
    /**
     * Sets the "numero_pedido" element
     */
    public void setNumeroPedido(int numeroPedido)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMEROPEDIDO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMEROPEDIDO$2);
            }
            target.setIntValue(numeroPedido);
        }
    }
    
    /**
     * Sets (as xml) the "numero_pedido" element
     */
    public void xsetNumeroPedido(org.apache.xmlbeans.XmlInt numeroPedido)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMEROPEDIDO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMEROPEDIDO$2);
            }
            target.set(numeroPedido);
        }
    }
    
    /**
     * Unsets the "numero_pedido" element
     */
    public void unsetNumeroPedido()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMEROPEDIDO$2, 0);
        }
    }
    
    /**
     * Gets the "status_pedido" element
     */
    public java.lang.String getStatusPedido()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSPEDIDO$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "status_pedido" element
     */
    public org.apache.xmlbeans.XmlString xgetStatusPedido()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSPEDIDO$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "status_pedido" element
     */
    public boolean isSetStatusPedido()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUSPEDIDO$4) != 0;
        }
    }
    
    /**
     * Sets the "status_pedido" element
     */
    public void setStatusPedido(java.lang.String statusPedido)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSPEDIDO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUSPEDIDO$4);
            }
            target.setStringValue(statusPedido);
        }
    }
    
    /**
     * Sets (as xml) the "status_pedido" element
     */
    public void xsetStatusPedido(org.apache.xmlbeans.XmlString statusPedido)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSPEDIDO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUSPEDIDO$4);
            }
            target.set(statusPedido);
        }
    }
    
    /**
     * Unsets the "status_pedido" element
     */
    public void unsetStatusPedido()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUSPEDIDO$4, 0);
        }
    }
}
