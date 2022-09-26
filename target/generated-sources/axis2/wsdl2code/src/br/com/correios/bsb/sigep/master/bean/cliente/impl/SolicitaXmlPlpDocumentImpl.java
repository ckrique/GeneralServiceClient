/*
 * An XML document type.
 * Localname: solicitaXmlPlp
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlpDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one solicitaXmlPlp(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class SolicitaXmlPlpDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlpDocument
{
    
    public SolicitaXmlPlpDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOLICITAXMLPLP$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "solicitaXmlPlp");
    
    
    /**
     * Gets the "solicitaXmlPlp" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlp getSolicitaXmlPlp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlp target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlp)get_store().find_element_user(SOLICITAXMLPLP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "solicitaXmlPlp" element
     */
    public void setSolicitaXmlPlp(br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlp solicitaXmlPlp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlp target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlp)get_store().find_element_user(SOLICITAXMLPLP$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlp)get_store().add_element_user(SOLICITAXMLPLP$0);
            }
            target.set(solicitaXmlPlp);
        }
    }
    
    /**
     * Appends and returns a new empty "solicitaXmlPlp" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlp addNewSolicitaXmlPlp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlp target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlp)get_store().add_element_user(SOLICITAXMLPLP$0);
            return target;
        }
    }
}
