/*
 * An XML document type.
 * Localname: calculaTarifaServico
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServicoDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one calculaTarifaServico(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class CalculaTarifaServicoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServicoDocument
{
    
    public CalculaTarifaServicoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALCULATARIFASERVICO$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "calculaTarifaServico");
    
    
    /**
     * Gets the "calculaTarifaServico" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServico getCalculaTarifaServico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServico target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServico)get_store().find_element_user(CALCULATARIFASERVICO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "calculaTarifaServico" element
     */
    public void setCalculaTarifaServico(br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServico calculaTarifaServico)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServico target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServico)get_store().find_element_user(CALCULATARIFASERVICO$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServico)get_store().add_element_user(CALCULATARIFASERVICO$0);
            }
            target.set(calculaTarifaServico);
        }
    }
    
    /**
     * Appends and returns a new empty "calculaTarifaServico" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServico addNewCalculaTarifaServico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServico target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServico)get_store().add_element_user(CALCULATARIFASERVICO$0);
            return target;
        }
    }
}
