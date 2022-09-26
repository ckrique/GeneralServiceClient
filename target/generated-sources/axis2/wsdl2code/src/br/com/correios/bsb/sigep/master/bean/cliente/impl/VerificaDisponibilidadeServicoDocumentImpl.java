/*
 * An XML document type.
 * Localname: verificaDisponibilidadeServico
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServicoDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * A document containing one verificaDisponibilidadeServico(@http://cliente.bean.master.sigep.bsb.correios.com.br/) element.
 *
 * This is a complex type.
 */
public class VerificaDisponibilidadeServicoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServicoDocument
{
    
    public VerificaDisponibilidadeServicoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERIFICADISPONIBILIDADESERVICO$0 = 
        new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "verificaDisponibilidadeServico");
    
    
    /**
     * Gets the "verificaDisponibilidadeServico" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico getVerificaDisponibilidadeServico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico)get_store().find_element_user(VERIFICADISPONIBILIDADESERVICO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "verificaDisponibilidadeServico" element
     */
    public void setVerificaDisponibilidadeServico(br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico verificaDisponibilidadeServico)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico)get_store().find_element_user(VERIFICADISPONIBILIDADESERVICO$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico)get_store().add_element_user(VERIFICADISPONIBILIDADESERVICO$0);
            }
            target.set(verificaDisponibilidadeServico);
        }
    }
    
    /**
     * Appends and returns a new empty "verificaDisponibilidadeServico" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico addNewVerificaDisponibilidadeServico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico)get_store().add_element_user(VERIFICADISPONIBILIDADESERVICO$0);
            return target;
        }
    }
}
