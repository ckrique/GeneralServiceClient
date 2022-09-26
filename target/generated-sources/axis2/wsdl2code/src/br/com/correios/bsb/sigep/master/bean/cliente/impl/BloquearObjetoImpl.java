/*
 * XML Type:  bloquearObjeto
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjeto
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML bloquearObjeto(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class BloquearObjetoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjeto
{
    
    public BloquearObjetoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMEROETIQUETA$0 = 
        new javax.xml.namespace.QName("", "numeroEtiqueta");
    private static final javax.xml.namespace.QName IDPLP$2 = 
        new javax.xml.namespace.QName("", "idPlp");
    private static final javax.xml.namespace.QName TIPOBLOQUEIO$4 = 
        new javax.xml.namespace.QName("", "tipoBloqueio");
    private static final javax.xml.namespace.QName ACAO$6 = 
        new javax.xml.namespace.QName("", "acao");
    private static final javax.xml.namespace.QName USUARIO$8 = 
        new javax.xml.namespace.QName("", "usuario");
    private static final javax.xml.namespace.QName SENHA$10 = 
        new javax.xml.namespace.QName("", "senha");
    
    
    /**
     * Gets the "numeroEtiqueta" element
     */
    public java.lang.String getNumeroEtiqueta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMEROETIQUETA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "numeroEtiqueta" element
     */
    public org.apache.xmlbeans.XmlString xgetNumeroEtiqueta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMEROETIQUETA$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "numeroEtiqueta" element
     */
    public boolean isSetNumeroEtiqueta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMEROETIQUETA$0) != 0;
        }
    }
    
    /**
     * Sets the "numeroEtiqueta" element
     */
    public void setNumeroEtiqueta(java.lang.String numeroEtiqueta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMEROETIQUETA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMEROETIQUETA$0);
            }
            target.setStringValue(numeroEtiqueta);
        }
    }
    
    /**
     * Sets (as xml) the "numeroEtiqueta" element
     */
    public void xsetNumeroEtiqueta(org.apache.xmlbeans.XmlString numeroEtiqueta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMEROETIQUETA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMEROETIQUETA$0);
            }
            target.set(numeroEtiqueta);
        }
    }
    
    /**
     * Unsets the "numeroEtiqueta" element
     */
    public void unsetNumeroEtiqueta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMEROETIQUETA$0, 0);
        }
    }
    
    /**
     * Gets the "idPlp" element
     */
    public long getIdPlp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDPLP$2, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "idPlp" element
     */
    public org.apache.xmlbeans.XmlLong xgetIdPlp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(IDPLP$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "idPlp" element
     */
    public boolean isSetIdPlp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDPLP$2) != 0;
        }
    }
    
    /**
     * Sets the "idPlp" element
     */
    public void setIdPlp(long idPlp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDPLP$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDPLP$2);
            }
            target.setLongValue(idPlp);
        }
    }
    
    /**
     * Sets (as xml) the "idPlp" element
     */
    public void xsetIdPlp(org.apache.xmlbeans.XmlLong idPlp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(IDPLP$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(IDPLP$2);
            }
            target.set(idPlp);
        }
    }
    
    /**
     * Unsets the "idPlp" element
     */
    public void unsetIdPlp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDPLP$2, 0);
        }
    }
    
    /**
     * Gets the "tipoBloqueio" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.TipoBloqueio.Enum getTipoBloqueio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOBLOQUEIO$4, 0);
            if (target == null)
            {
                return null;
            }
            return (br.com.correios.bsb.sigep.master.bean.cliente.TipoBloqueio.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "tipoBloqueio" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.TipoBloqueio xgetTipoBloqueio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.TipoBloqueio target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.TipoBloqueio)get_store().find_element_user(TIPOBLOQUEIO$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "tipoBloqueio" element
     */
    public boolean isSetTipoBloqueio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIPOBLOQUEIO$4) != 0;
        }
    }
    
    /**
     * Sets the "tipoBloqueio" element
     */
    public void setTipoBloqueio(br.com.correios.bsb.sigep.master.bean.cliente.TipoBloqueio.Enum tipoBloqueio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOBLOQUEIO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPOBLOQUEIO$4);
            }
            target.setEnumValue(tipoBloqueio);
        }
    }
    
    /**
     * Sets (as xml) the "tipoBloqueio" element
     */
    public void xsetTipoBloqueio(br.com.correios.bsb.sigep.master.bean.cliente.TipoBloqueio tipoBloqueio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.TipoBloqueio target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.TipoBloqueio)get_store().find_element_user(TIPOBLOQUEIO$4, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.TipoBloqueio)get_store().add_element_user(TIPOBLOQUEIO$4);
            }
            target.set(tipoBloqueio);
        }
    }
    
    /**
     * Unsets the "tipoBloqueio" element
     */
    public void unsetTipoBloqueio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIPOBLOQUEIO$4, 0);
        }
    }
    
    /**
     * Gets the "acao" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.Acao.Enum getAcao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACAO$6, 0);
            if (target == null)
            {
                return null;
            }
            return (br.com.correios.bsb.sigep.master.bean.cliente.Acao.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "acao" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.Acao xgetAcao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.Acao target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.Acao)get_store().find_element_user(ACAO$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "acao" element
     */
    public boolean isSetAcao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACAO$6) != 0;
        }
    }
    
    /**
     * Sets the "acao" element
     */
    public void setAcao(br.com.correios.bsb.sigep.master.bean.cliente.Acao.Enum acao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACAO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACAO$6);
            }
            target.setEnumValue(acao);
        }
    }
    
    /**
     * Sets (as xml) the "acao" element
     */
    public void xsetAcao(br.com.correios.bsb.sigep.master.bean.cliente.Acao acao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.Acao target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.Acao)get_store().find_element_user(ACAO$6, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.Acao)get_store().add_element_user(ACAO$6);
            }
            target.set(acao);
        }
    }
    
    /**
     * Unsets the "acao" element
     */
    public void unsetAcao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACAO$6, 0);
        }
    }
    
    /**
     * Gets the "usuario" element
     */
    public java.lang.String getUsuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USUARIO$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "usuario" element
     */
    public org.apache.xmlbeans.XmlString xgetUsuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USUARIO$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "usuario" element
     */
    public boolean isSetUsuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USUARIO$8) != 0;
        }
    }
    
    /**
     * Sets the "usuario" element
     */
    public void setUsuario(java.lang.String usuario)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USUARIO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USUARIO$8);
            }
            target.setStringValue(usuario);
        }
    }
    
    /**
     * Sets (as xml) the "usuario" element
     */
    public void xsetUsuario(org.apache.xmlbeans.XmlString usuario)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USUARIO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USUARIO$8);
            }
            target.set(usuario);
        }
    }
    
    /**
     * Unsets the "usuario" element
     */
    public void unsetUsuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USUARIO$8, 0);
        }
    }
    
    /**
     * Gets the "senha" element
     */
    public java.lang.String getSenha()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENHA$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "senha" element
     */
    public org.apache.xmlbeans.XmlString xgetSenha()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENHA$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "senha" element
     */
    public boolean isSetSenha()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENHA$10) != 0;
        }
    }
    
    /**
     * Sets the "senha" element
     */
    public void setSenha(java.lang.String senha)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENHA$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENHA$10);
            }
            target.setStringValue(senha);
        }
    }
    
    /**
     * Sets (as xml) the "senha" element
     */
    public void xsetSenha(org.apache.xmlbeans.XmlString senha)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENHA$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SENHA$10);
            }
            target.set(senha);
        }
    }
    
    /**
     * Unsets the "senha" element
     */
    public void unsetSenha()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENHA$10, 0);
        }
    }
}
