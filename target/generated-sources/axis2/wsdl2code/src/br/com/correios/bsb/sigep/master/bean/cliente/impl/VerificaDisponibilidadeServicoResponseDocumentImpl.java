/*
 * An XML document type.
 * Localname: verificaDisponibilidadeServicoResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServicoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one verificaDisponibilidadeServicoResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class VerificaDisponibilidadeServicoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServicoResponseDocument
{
    
    public VerificaDisponibilidadeServicoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERIFICADISPONIBILIDADESERVICORESPONSE$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "verificaDisponibilidadeServicoResponse");
    
    
    /**
     * Gets the "verificaDisponibilidadeServicoResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServicoResponse getVerificaDisponibilidadeServicoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServicoResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServicoResponse)get_store().find_element_user(VERIFICADISPONIBILIDADESERVICORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "verificaDisponibilidadeServicoResponse" element
     */
    public void setVerificaDisponibilidadeServicoResponse(br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServicoResponse verificaDisponibilidadeServicoResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServicoResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServicoResponse)get_store().find_element_user(VERIFICADISPONIBILIDADESERVICORESPONSE$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServicoResponse)get_store().add_element_user(VERIFICADISPONIBILIDADESERVICORESPONSE$0);
            }
            target.set(verificaDisponibilidadeServicoResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "verificaDisponibilidadeServicoResponse" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServicoResponse addNewVerificaDisponibilidadeServicoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServicoResponse target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServicoResponse)get_store().add_element_user(VERIFICADISPONIBILIDADESERVICORESPONSE$0);
            return target;
        }
    }
}
