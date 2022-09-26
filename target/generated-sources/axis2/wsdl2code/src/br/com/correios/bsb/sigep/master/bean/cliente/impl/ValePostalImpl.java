/*
 * XML Type:  valePostal
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ValePostal
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML valePostal(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class ValePostalImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.ValePostal
{
    
    public ValePostalImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CIDNOCIDADE$0 = 
        new javax.xml.namespace.QName("", "cidNoCidade");
    private static final javax.xml.namespace.QName CTCCOAADMINISTRATIVO$2 = 
        new javax.xml.namespace.QName("", "ctcCoAadministrativo");
    private static final javax.xml.namespace.QName CTCNUCONTRATO$4 = 
        new javax.xml.namespace.QName("", "ctcNuContrato");
    private static final javax.xml.namespace.QName CTCNUCONTRATOECT$6 = 
        new javax.xml.namespace.QName("", "ctcNuContratoEct");
    private static final javax.xml.namespace.QName CVPEDBAIRRO$8 = 
        new javax.xml.namespace.QName("", "cvpEdBairro");
    private static final javax.xml.namespace.QName CVPEDCLIENTE$10 = 
        new javax.xml.namespace.QName("", "cvpEdCliente");
    private static final javax.xml.namespace.QName CVPEDCOMPLEMENTO$12 = 
        new javax.xml.namespace.QName("", "cvpEdComplemento");
    private static final javax.xml.namespace.QName CVPEDNUMERO$14 = 
        new javax.xml.namespace.QName("", "cvpEdNumero");
    private static final javax.xml.namespace.QName CVPNOCLIENTE$16 = 
        new javax.xml.namespace.QName("", "cvpNoCliente");
    private static final javax.xml.namespace.QName CVPNUCEP$18 = 
        new javax.xml.namespace.QName("", "cvpNuCep");
    private static final javax.xml.namespace.QName DESCRICAOERRO$20 = 
        new javax.xml.namespace.QName("", "descricaoErro");
    private static final javax.xml.namespace.QName ESTSGESTADO$22 = 
        new javax.xml.namespace.QName("", "estSgEstado");
    private static final javax.xml.namespace.QName MONVARTARIFAADICIONAL$24 = 
        new javax.xml.namespace.QName("", "monVarTarifaAdicional");
    private static final javax.xml.namespace.QName MONVARTARIFASERVICO$26 = 
        new javax.xml.namespace.QName("", "monVarTarifaServico");
    private static final javax.xml.namespace.QName MONVARVALORDESCONTOS$28 = 
        new javax.xml.namespace.QName("", "monVarValorDescontos");
    private static final javax.xml.namespace.QName MONVARVALORIMPOSTO$30 = 
        new javax.xml.namespace.QName("", "monVarValorImposto");
    private static final javax.xml.namespace.QName PRSCOPRODUTOSERVICO$32 = 
        new javax.xml.namespace.QName("", "prsCoProdutoServico");
    private static final javax.xml.namespace.QName PVENU$34 = 
        new javax.xml.namespace.QName("", "pveNu");
    private static final javax.xml.namespace.QName PVEORGNUAGENCIA$36 = 
        new javax.xml.namespace.QName("", "pveOrgNuAgencia");
    private static final javax.xml.namespace.QName PVEORGNUAGENCIADES$38 = 
        new javax.xml.namespace.QName("", "pveOrgNuAgenciaDes");
    private static final javax.xml.namespace.QName PVEORGNUAGENCIAORI$40 = 
        new javax.xml.namespace.QName("", "pveOrgNuAgenciaOri");
    private static final javax.xml.namespace.QName RETORNACODERRO$42 = 
        new javax.xml.namespace.QName("", "retornaCodErro");
    private static final javax.xml.namespace.QName SITNOSITUACAO$44 = 
        new javax.xml.namespace.QName("", "sitNoSituacao");
    private static final javax.xml.namespace.QName TLGTXDESCRICAO$46 = 
        new javax.xml.namespace.QName("", "tlgTxDescricao");
    private static final javax.xml.namespace.QName VAPDHTRANSACAO$48 = 
        new javax.xml.namespace.QName("", "vapDhTransacao");
    private static final javax.xml.namespace.QName VAPNUETIQUETAENCOMENDA$50 = 
        new javax.xml.namespace.QName("", "vapNuEtiquetaEncomenda");
    private static final javax.xml.namespace.QName VAPVRCOBRADOECT$52 = 
        new javax.xml.namespace.QName("", "vapVrCobradoEct");
    private static final javax.xml.namespace.QName VAPVRNOMINAL$54 = 
        new javax.xml.namespace.QName("", "vapVrNominal");
    
    
    /**
     * Gets the "cidNoCidade" element
     */
    public java.lang.String getCidNoCidade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CIDNOCIDADE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cidNoCidade" element
     */
    public org.apache.xmlbeans.XmlString xgetCidNoCidade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CIDNOCIDADE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "cidNoCidade" element
     */
    public boolean isSetCidNoCidade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CIDNOCIDADE$0) != 0;
        }
    }
    
    /**
     * Sets the "cidNoCidade" element
     */
    public void setCidNoCidade(java.lang.String cidNoCidade)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CIDNOCIDADE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CIDNOCIDADE$0);
            }
            target.setStringValue(cidNoCidade);
        }
    }
    
    /**
     * Sets (as xml) the "cidNoCidade" element
     */
    public void xsetCidNoCidade(org.apache.xmlbeans.XmlString cidNoCidade)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CIDNOCIDADE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CIDNOCIDADE$0);
            }
            target.set(cidNoCidade);
        }
    }
    
    /**
     * Unsets the "cidNoCidade" element
     */
    public void unsetCidNoCidade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CIDNOCIDADE$0, 0);
        }
    }
    
    /**
     * Gets the "ctcCoAadministrativo" element
     */
    public java.lang.String getCtcCoAadministrativo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CTCCOAADMINISTRATIVO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ctcCoAadministrativo" element
     */
    public org.apache.xmlbeans.XmlString xgetCtcCoAadministrativo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CTCCOAADMINISTRATIVO$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "ctcCoAadministrativo" element
     */
    public boolean isSetCtcCoAadministrativo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CTCCOAADMINISTRATIVO$2) != 0;
        }
    }
    
    /**
     * Sets the "ctcCoAadministrativo" element
     */
    public void setCtcCoAadministrativo(java.lang.String ctcCoAadministrativo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CTCCOAADMINISTRATIVO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CTCCOAADMINISTRATIVO$2);
            }
            target.setStringValue(ctcCoAadministrativo);
        }
    }
    
    /**
     * Sets (as xml) the "ctcCoAadministrativo" element
     */
    public void xsetCtcCoAadministrativo(org.apache.xmlbeans.XmlString ctcCoAadministrativo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CTCCOAADMINISTRATIVO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CTCCOAADMINISTRATIVO$2);
            }
            target.set(ctcCoAadministrativo);
        }
    }
    
    /**
     * Unsets the "ctcCoAadministrativo" element
     */
    public void unsetCtcCoAadministrativo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CTCCOAADMINISTRATIVO$2, 0);
        }
    }
    
    /**
     * Gets the "ctcNuContrato" element
     */
    public long getCtcNuContrato()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CTCNUCONTRATO$4, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "ctcNuContrato" element
     */
    public org.apache.xmlbeans.XmlLong xgetCtcNuContrato()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CTCNUCONTRATO$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "ctcNuContrato" element
     */
    public boolean isSetCtcNuContrato()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CTCNUCONTRATO$4) != 0;
        }
    }
    
    /**
     * Sets the "ctcNuContrato" element
     */
    public void setCtcNuContrato(long ctcNuContrato)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CTCNUCONTRATO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CTCNUCONTRATO$4);
            }
            target.setLongValue(ctcNuContrato);
        }
    }
    
    /**
     * Sets (as xml) the "ctcNuContrato" element
     */
    public void xsetCtcNuContrato(org.apache.xmlbeans.XmlLong ctcNuContrato)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CTCNUCONTRATO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(CTCNUCONTRATO$4);
            }
            target.set(ctcNuContrato);
        }
    }
    
    /**
     * Unsets the "ctcNuContrato" element
     */
    public void unsetCtcNuContrato()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CTCNUCONTRATO$4, 0);
        }
    }
    
    /**
     * Gets the "ctcNuContratoEct" element
     */
    public long getCtcNuContratoEct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CTCNUCONTRATOECT$6, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "ctcNuContratoEct" element
     */
    public org.apache.xmlbeans.XmlLong xgetCtcNuContratoEct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CTCNUCONTRATOECT$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "ctcNuContratoEct" element
     */
    public boolean isSetCtcNuContratoEct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CTCNUCONTRATOECT$6) != 0;
        }
    }
    
    /**
     * Sets the "ctcNuContratoEct" element
     */
    public void setCtcNuContratoEct(long ctcNuContratoEct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CTCNUCONTRATOECT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CTCNUCONTRATOECT$6);
            }
            target.setLongValue(ctcNuContratoEct);
        }
    }
    
    /**
     * Sets (as xml) the "ctcNuContratoEct" element
     */
    public void xsetCtcNuContratoEct(org.apache.xmlbeans.XmlLong ctcNuContratoEct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CTCNUCONTRATOECT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(CTCNUCONTRATOECT$6);
            }
            target.set(ctcNuContratoEct);
        }
    }
    
    /**
     * Unsets the "ctcNuContratoEct" element
     */
    public void unsetCtcNuContratoEct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CTCNUCONTRATOECT$6, 0);
        }
    }
    
    /**
     * Gets the "cvpEdBairro" element
     */
    public java.lang.String getCvpEdBairro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CVPEDBAIRRO$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cvpEdBairro" element
     */
    public org.apache.xmlbeans.XmlString xgetCvpEdBairro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CVPEDBAIRRO$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "cvpEdBairro" element
     */
    public boolean isSetCvpEdBairro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CVPEDBAIRRO$8) != 0;
        }
    }
    
    /**
     * Sets the "cvpEdBairro" element
     */
    public void setCvpEdBairro(java.lang.String cvpEdBairro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CVPEDBAIRRO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CVPEDBAIRRO$8);
            }
            target.setStringValue(cvpEdBairro);
        }
    }
    
    /**
     * Sets (as xml) the "cvpEdBairro" element
     */
    public void xsetCvpEdBairro(org.apache.xmlbeans.XmlString cvpEdBairro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CVPEDBAIRRO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CVPEDBAIRRO$8);
            }
            target.set(cvpEdBairro);
        }
    }
    
    /**
     * Unsets the "cvpEdBairro" element
     */
    public void unsetCvpEdBairro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CVPEDBAIRRO$8, 0);
        }
    }
    
    /**
     * Gets the "cvpEdCliente" element
     */
    public java.lang.String getCvpEdCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CVPEDCLIENTE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cvpEdCliente" element
     */
    public org.apache.xmlbeans.XmlString xgetCvpEdCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CVPEDCLIENTE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "cvpEdCliente" element
     */
    public boolean isSetCvpEdCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CVPEDCLIENTE$10) != 0;
        }
    }
    
    /**
     * Sets the "cvpEdCliente" element
     */
    public void setCvpEdCliente(java.lang.String cvpEdCliente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CVPEDCLIENTE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CVPEDCLIENTE$10);
            }
            target.setStringValue(cvpEdCliente);
        }
    }
    
    /**
     * Sets (as xml) the "cvpEdCliente" element
     */
    public void xsetCvpEdCliente(org.apache.xmlbeans.XmlString cvpEdCliente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CVPEDCLIENTE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CVPEDCLIENTE$10);
            }
            target.set(cvpEdCliente);
        }
    }
    
    /**
     * Unsets the "cvpEdCliente" element
     */
    public void unsetCvpEdCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CVPEDCLIENTE$10, 0);
        }
    }
    
    /**
     * Gets the "cvpEdComplemento" element
     */
    public java.lang.String getCvpEdComplemento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CVPEDCOMPLEMENTO$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cvpEdComplemento" element
     */
    public org.apache.xmlbeans.XmlString xgetCvpEdComplemento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CVPEDCOMPLEMENTO$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "cvpEdComplemento" element
     */
    public boolean isSetCvpEdComplemento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CVPEDCOMPLEMENTO$12) != 0;
        }
    }
    
    /**
     * Sets the "cvpEdComplemento" element
     */
    public void setCvpEdComplemento(java.lang.String cvpEdComplemento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CVPEDCOMPLEMENTO$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CVPEDCOMPLEMENTO$12);
            }
            target.setStringValue(cvpEdComplemento);
        }
    }
    
    /**
     * Sets (as xml) the "cvpEdComplemento" element
     */
    public void xsetCvpEdComplemento(org.apache.xmlbeans.XmlString cvpEdComplemento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CVPEDCOMPLEMENTO$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CVPEDCOMPLEMENTO$12);
            }
            target.set(cvpEdComplemento);
        }
    }
    
    /**
     * Unsets the "cvpEdComplemento" element
     */
    public void unsetCvpEdComplemento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CVPEDCOMPLEMENTO$12, 0);
        }
    }
    
    /**
     * Gets the "cvpEdNumero" element
     */
    public java.lang.String getCvpEdNumero()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CVPEDNUMERO$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cvpEdNumero" element
     */
    public org.apache.xmlbeans.XmlString xgetCvpEdNumero()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CVPEDNUMERO$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "cvpEdNumero" element
     */
    public boolean isSetCvpEdNumero()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CVPEDNUMERO$14) != 0;
        }
    }
    
    /**
     * Sets the "cvpEdNumero" element
     */
    public void setCvpEdNumero(java.lang.String cvpEdNumero)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CVPEDNUMERO$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CVPEDNUMERO$14);
            }
            target.setStringValue(cvpEdNumero);
        }
    }
    
    /**
     * Sets (as xml) the "cvpEdNumero" element
     */
    public void xsetCvpEdNumero(org.apache.xmlbeans.XmlString cvpEdNumero)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CVPEDNUMERO$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CVPEDNUMERO$14);
            }
            target.set(cvpEdNumero);
        }
    }
    
    /**
     * Unsets the "cvpEdNumero" element
     */
    public void unsetCvpEdNumero()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CVPEDNUMERO$14, 0);
        }
    }
    
    /**
     * Gets the "cvpNoCliente" element
     */
    public java.lang.String getCvpNoCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CVPNOCLIENTE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cvpNoCliente" element
     */
    public org.apache.xmlbeans.XmlString xgetCvpNoCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CVPNOCLIENTE$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "cvpNoCliente" element
     */
    public boolean isSetCvpNoCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CVPNOCLIENTE$16) != 0;
        }
    }
    
    /**
     * Sets the "cvpNoCliente" element
     */
    public void setCvpNoCliente(java.lang.String cvpNoCliente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CVPNOCLIENTE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CVPNOCLIENTE$16);
            }
            target.setStringValue(cvpNoCliente);
        }
    }
    
    /**
     * Sets (as xml) the "cvpNoCliente" element
     */
    public void xsetCvpNoCliente(org.apache.xmlbeans.XmlString cvpNoCliente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CVPNOCLIENTE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CVPNOCLIENTE$16);
            }
            target.set(cvpNoCliente);
        }
    }
    
    /**
     * Unsets the "cvpNoCliente" element
     */
    public void unsetCvpNoCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CVPNOCLIENTE$16, 0);
        }
    }
    
    /**
     * Gets the "cvpNuCep" element
     */
    public long getCvpNuCep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CVPNUCEP$18, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "cvpNuCep" element
     */
    public org.apache.xmlbeans.XmlLong xgetCvpNuCep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CVPNUCEP$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "cvpNuCep" element
     */
    public boolean isSetCvpNuCep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CVPNUCEP$18) != 0;
        }
    }
    
    /**
     * Sets the "cvpNuCep" element
     */
    public void setCvpNuCep(long cvpNuCep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CVPNUCEP$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CVPNUCEP$18);
            }
            target.setLongValue(cvpNuCep);
        }
    }
    
    /**
     * Sets (as xml) the "cvpNuCep" element
     */
    public void xsetCvpNuCep(org.apache.xmlbeans.XmlLong cvpNuCep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CVPNUCEP$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(CVPNUCEP$18);
            }
            target.set(cvpNuCep);
        }
    }
    
    /**
     * Unsets the "cvpNuCep" element
     */
    public void unsetCvpNuCep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CVPNUCEP$18, 0);
        }
    }
    
    /**
     * Gets the "descricaoErro" element
     */
    public java.lang.String getDescricaoErro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRICAOERRO$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "descricaoErro" element
     */
    public org.apache.xmlbeans.XmlString xgetDescricaoErro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRICAOERRO$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "descricaoErro" element
     */
    public boolean isSetDescricaoErro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRICAOERRO$20) != 0;
        }
    }
    
    /**
     * Sets the "descricaoErro" element
     */
    public void setDescricaoErro(java.lang.String descricaoErro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRICAOERRO$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRICAOERRO$20);
            }
            target.setStringValue(descricaoErro);
        }
    }
    
    /**
     * Sets (as xml) the "descricaoErro" element
     */
    public void xsetDescricaoErro(org.apache.xmlbeans.XmlString descricaoErro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRICAOERRO$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRICAOERRO$20);
            }
            target.set(descricaoErro);
        }
    }
    
    /**
     * Unsets the "descricaoErro" element
     */
    public void unsetDescricaoErro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRICAOERRO$20, 0);
        }
    }
    
    /**
     * Gets the "estSgEstado" element
     */
    public java.lang.String getEstSgEstado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTSGESTADO$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "estSgEstado" element
     */
    public org.apache.xmlbeans.XmlString xgetEstSgEstado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESTSGESTADO$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "estSgEstado" element
     */
    public boolean isSetEstSgEstado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ESTSGESTADO$22) != 0;
        }
    }
    
    /**
     * Sets the "estSgEstado" element
     */
    public void setEstSgEstado(java.lang.String estSgEstado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTSGESTADO$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ESTSGESTADO$22);
            }
            target.setStringValue(estSgEstado);
        }
    }
    
    /**
     * Sets (as xml) the "estSgEstado" element
     */
    public void xsetEstSgEstado(org.apache.xmlbeans.XmlString estSgEstado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESTSGESTADO$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ESTSGESTADO$22);
            }
            target.set(estSgEstado);
        }
    }
    
    /**
     * Unsets the "estSgEstado" element
     */
    public void unsetEstSgEstado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ESTSGESTADO$22, 0);
        }
    }
    
    /**
     * Gets the "monVarTarifaAdicional" element
     */
    public int getMonVarTarifaAdicional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONVARTARIFAADICIONAL$24, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "monVarTarifaAdicional" element
     */
    public org.apache.xmlbeans.XmlInt xgetMonVarTarifaAdicional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MONVARTARIFAADICIONAL$24, 0);
            return target;
        }
    }
    
    /**
     * Sets the "monVarTarifaAdicional" element
     */
    public void setMonVarTarifaAdicional(int monVarTarifaAdicional)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONVARTARIFAADICIONAL$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MONVARTARIFAADICIONAL$24);
            }
            target.setIntValue(monVarTarifaAdicional);
        }
    }
    
    /**
     * Sets (as xml) the "monVarTarifaAdicional" element
     */
    public void xsetMonVarTarifaAdicional(org.apache.xmlbeans.XmlInt monVarTarifaAdicional)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MONVARTARIFAADICIONAL$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MONVARTARIFAADICIONAL$24);
            }
            target.set(monVarTarifaAdicional);
        }
    }
    
    /**
     * Gets the "monVarTarifaServico" element
     */
    public int getMonVarTarifaServico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONVARTARIFASERVICO$26, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "monVarTarifaServico" element
     */
    public org.apache.xmlbeans.XmlInt xgetMonVarTarifaServico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MONVARTARIFASERVICO$26, 0);
            return target;
        }
    }
    
    /**
     * Sets the "monVarTarifaServico" element
     */
    public void setMonVarTarifaServico(int monVarTarifaServico)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONVARTARIFASERVICO$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MONVARTARIFASERVICO$26);
            }
            target.setIntValue(monVarTarifaServico);
        }
    }
    
    /**
     * Sets (as xml) the "monVarTarifaServico" element
     */
    public void xsetMonVarTarifaServico(org.apache.xmlbeans.XmlInt monVarTarifaServico)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MONVARTARIFASERVICO$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MONVARTARIFASERVICO$26);
            }
            target.set(monVarTarifaServico);
        }
    }
    
    /**
     * Gets the "monVarValorDescontos" element
     */
    public int getMonVarValorDescontos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONVARVALORDESCONTOS$28, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "monVarValorDescontos" element
     */
    public org.apache.xmlbeans.XmlInt xgetMonVarValorDescontos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MONVARVALORDESCONTOS$28, 0);
            return target;
        }
    }
    
    /**
     * Sets the "monVarValorDescontos" element
     */
    public void setMonVarValorDescontos(int monVarValorDescontos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONVARVALORDESCONTOS$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MONVARVALORDESCONTOS$28);
            }
            target.setIntValue(monVarValorDescontos);
        }
    }
    
    /**
     * Sets (as xml) the "monVarValorDescontos" element
     */
    public void xsetMonVarValorDescontos(org.apache.xmlbeans.XmlInt monVarValorDescontos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MONVARVALORDESCONTOS$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MONVARVALORDESCONTOS$28);
            }
            target.set(monVarValorDescontos);
        }
    }
    
    /**
     * Gets the "monVarValorImposto" element
     */
    public int getMonVarValorImposto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONVARVALORIMPOSTO$30, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "monVarValorImposto" element
     */
    public org.apache.xmlbeans.XmlInt xgetMonVarValorImposto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MONVARVALORIMPOSTO$30, 0);
            return target;
        }
    }
    
    /**
     * Sets the "monVarValorImposto" element
     */
    public void setMonVarValorImposto(int monVarValorImposto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONVARVALORIMPOSTO$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MONVARVALORIMPOSTO$30);
            }
            target.setIntValue(monVarValorImposto);
        }
    }
    
    /**
     * Sets (as xml) the "monVarValorImposto" element
     */
    public void xsetMonVarValorImposto(org.apache.xmlbeans.XmlInt monVarValorImposto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MONVARVALORIMPOSTO$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MONVARVALORIMPOSTO$30);
            }
            target.set(monVarValorImposto);
        }
    }
    
    /**
     * Gets the "prsCoProdutoServico" element
     */
    public long getPrsCoProdutoServico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRSCOPRODUTOSERVICO$32, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "prsCoProdutoServico" element
     */
    public org.apache.xmlbeans.XmlLong xgetPrsCoProdutoServico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(PRSCOPRODUTOSERVICO$32, 0);
            return target;
        }
    }
    
    /**
     * True if has "prsCoProdutoServico" element
     */
    public boolean isSetPrsCoProdutoServico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRSCOPRODUTOSERVICO$32) != 0;
        }
    }
    
    /**
     * Sets the "prsCoProdutoServico" element
     */
    public void setPrsCoProdutoServico(long prsCoProdutoServico)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRSCOPRODUTOSERVICO$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRSCOPRODUTOSERVICO$32);
            }
            target.setLongValue(prsCoProdutoServico);
        }
    }
    
    /**
     * Sets (as xml) the "prsCoProdutoServico" element
     */
    public void xsetPrsCoProdutoServico(org.apache.xmlbeans.XmlLong prsCoProdutoServico)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(PRSCOPRODUTOSERVICO$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(PRSCOPRODUTOSERVICO$32);
            }
            target.set(prsCoProdutoServico);
        }
    }
    
    /**
     * Unsets the "prsCoProdutoServico" element
     */
    public void unsetPrsCoProdutoServico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRSCOPRODUTOSERVICO$32, 0);
        }
    }
    
    /**
     * Gets the "pveNu" element
     */
    public long getPveNu()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PVENU$34, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "pveNu" element
     */
    public org.apache.xmlbeans.XmlLong xgetPveNu()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(PVENU$34, 0);
            return target;
        }
    }
    
    /**
     * True if has "pveNu" element
     */
    public boolean isSetPveNu()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PVENU$34) != 0;
        }
    }
    
    /**
     * Sets the "pveNu" element
     */
    public void setPveNu(long pveNu)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PVENU$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PVENU$34);
            }
            target.setLongValue(pveNu);
        }
    }
    
    /**
     * Sets (as xml) the "pveNu" element
     */
    public void xsetPveNu(org.apache.xmlbeans.XmlLong pveNu)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(PVENU$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(PVENU$34);
            }
            target.set(pveNu);
        }
    }
    
    /**
     * Unsets the "pveNu" element
     */
    public void unsetPveNu()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PVENU$34, 0);
        }
    }
    
    /**
     * Gets the "pveOrgNuAgencia" element
     */
    public long getPveOrgNuAgencia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PVEORGNUAGENCIA$36, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "pveOrgNuAgencia" element
     */
    public org.apache.xmlbeans.XmlLong xgetPveOrgNuAgencia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(PVEORGNUAGENCIA$36, 0);
            return target;
        }
    }
    
    /**
     * True if has "pveOrgNuAgencia" element
     */
    public boolean isSetPveOrgNuAgencia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PVEORGNUAGENCIA$36) != 0;
        }
    }
    
    /**
     * Sets the "pveOrgNuAgencia" element
     */
    public void setPveOrgNuAgencia(long pveOrgNuAgencia)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PVEORGNUAGENCIA$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PVEORGNUAGENCIA$36);
            }
            target.setLongValue(pveOrgNuAgencia);
        }
    }
    
    /**
     * Sets (as xml) the "pveOrgNuAgencia" element
     */
    public void xsetPveOrgNuAgencia(org.apache.xmlbeans.XmlLong pveOrgNuAgencia)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(PVEORGNUAGENCIA$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(PVEORGNUAGENCIA$36);
            }
            target.set(pveOrgNuAgencia);
        }
    }
    
    /**
     * Unsets the "pveOrgNuAgencia" element
     */
    public void unsetPveOrgNuAgencia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PVEORGNUAGENCIA$36, 0);
        }
    }
    
    /**
     * Gets the "pveOrgNuAgenciaDes" element
     */
    public long getPveOrgNuAgenciaDes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PVEORGNUAGENCIADES$38, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "pveOrgNuAgenciaDes" element
     */
    public org.apache.xmlbeans.XmlLong xgetPveOrgNuAgenciaDes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(PVEORGNUAGENCIADES$38, 0);
            return target;
        }
    }
    
    /**
     * True if has "pveOrgNuAgenciaDes" element
     */
    public boolean isSetPveOrgNuAgenciaDes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PVEORGNUAGENCIADES$38) != 0;
        }
    }
    
    /**
     * Sets the "pveOrgNuAgenciaDes" element
     */
    public void setPveOrgNuAgenciaDes(long pveOrgNuAgenciaDes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PVEORGNUAGENCIADES$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PVEORGNUAGENCIADES$38);
            }
            target.setLongValue(pveOrgNuAgenciaDes);
        }
    }
    
    /**
     * Sets (as xml) the "pveOrgNuAgenciaDes" element
     */
    public void xsetPveOrgNuAgenciaDes(org.apache.xmlbeans.XmlLong pveOrgNuAgenciaDes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(PVEORGNUAGENCIADES$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(PVEORGNUAGENCIADES$38);
            }
            target.set(pveOrgNuAgenciaDes);
        }
    }
    
    /**
     * Unsets the "pveOrgNuAgenciaDes" element
     */
    public void unsetPveOrgNuAgenciaDes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PVEORGNUAGENCIADES$38, 0);
        }
    }
    
    /**
     * Gets the "pveOrgNuAgenciaOri" element
     */
    public long getPveOrgNuAgenciaOri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PVEORGNUAGENCIAORI$40, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "pveOrgNuAgenciaOri" element
     */
    public org.apache.xmlbeans.XmlLong xgetPveOrgNuAgenciaOri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(PVEORGNUAGENCIAORI$40, 0);
            return target;
        }
    }
    
    /**
     * True if has "pveOrgNuAgenciaOri" element
     */
    public boolean isSetPveOrgNuAgenciaOri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PVEORGNUAGENCIAORI$40) != 0;
        }
    }
    
    /**
     * Sets the "pveOrgNuAgenciaOri" element
     */
    public void setPveOrgNuAgenciaOri(long pveOrgNuAgenciaOri)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PVEORGNUAGENCIAORI$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PVEORGNUAGENCIAORI$40);
            }
            target.setLongValue(pveOrgNuAgenciaOri);
        }
    }
    
    /**
     * Sets (as xml) the "pveOrgNuAgenciaOri" element
     */
    public void xsetPveOrgNuAgenciaOri(org.apache.xmlbeans.XmlLong pveOrgNuAgenciaOri)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(PVEORGNUAGENCIAORI$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(PVEORGNUAGENCIAORI$40);
            }
            target.set(pveOrgNuAgenciaOri);
        }
    }
    
    /**
     * Unsets the "pveOrgNuAgenciaOri" element
     */
    public void unsetPveOrgNuAgenciaOri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PVEORGNUAGENCIAORI$40, 0);
        }
    }
    
    /**
     * Gets the "retornaCodErro" element
     */
    public int getRetornaCodErro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETORNACODERRO$42, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "retornaCodErro" element
     */
    public org.apache.xmlbeans.XmlInt xgetRetornaCodErro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RETORNACODERRO$42, 0);
            return target;
        }
    }
    
    /**
     * Sets the "retornaCodErro" element
     */
    public void setRetornaCodErro(int retornaCodErro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETORNACODERRO$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETORNACODERRO$42);
            }
            target.setIntValue(retornaCodErro);
        }
    }
    
    /**
     * Sets (as xml) the "retornaCodErro" element
     */
    public void xsetRetornaCodErro(org.apache.xmlbeans.XmlInt retornaCodErro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RETORNACODERRO$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(RETORNACODERRO$42);
            }
            target.set(retornaCodErro);
        }
    }
    
    /**
     * Gets the "sitNoSituacao" element
     */
    public java.lang.String getSitNoSituacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITNOSITUACAO$44, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sitNoSituacao" element
     */
    public org.apache.xmlbeans.XmlString xgetSitNoSituacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SITNOSITUACAO$44, 0);
            return target;
        }
    }
    
    /**
     * True if has "sitNoSituacao" element
     */
    public boolean isSetSitNoSituacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SITNOSITUACAO$44) != 0;
        }
    }
    
    /**
     * Sets the "sitNoSituacao" element
     */
    public void setSitNoSituacao(java.lang.String sitNoSituacao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITNOSITUACAO$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SITNOSITUACAO$44);
            }
            target.setStringValue(sitNoSituacao);
        }
    }
    
    /**
     * Sets (as xml) the "sitNoSituacao" element
     */
    public void xsetSitNoSituacao(org.apache.xmlbeans.XmlString sitNoSituacao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SITNOSITUACAO$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SITNOSITUACAO$44);
            }
            target.set(sitNoSituacao);
        }
    }
    
    /**
     * Unsets the "sitNoSituacao" element
     */
    public void unsetSitNoSituacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SITNOSITUACAO$44, 0);
        }
    }
    
    /**
     * Gets the "tlgTxDescricao" element
     */
    public java.lang.String getTlgTxDescricao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TLGTXDESCRICAO$46, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tlgTxDescricao" element
     */
    public org.apache.xmlbeans.XmlString xgetTlgTxDescricao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TLGTXDESCRICAO$46, 0);
            return target;
        }
    }
    
    /**
     * True if has "tlgTxDescricao" element
     */
    public boolean isSetTlgTxDescricao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TLGTXDESCRICAO$46) != 0;
        }
    }
    
    /**
     * Sets the "tlgTxDescricao" element
     */
    public void setTlgTxDescricao(java.lang.String tlgTxDescricao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TLGTXDESCRICAO$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TLGTXDESCRICAO$46);
            }
            target.setStringValue(tlgTxDescricao);
        }
    }
    
    /**
     * Sets (as xml) the "tlgTxDescricao" element
     */
    public void xsetTlgTxDescricao(org.apache.xmlbeans.XmlString tlgTxDescricao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TLGTXDESCRICAO$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TLGTXDESCRICAO$46);
            }
            target.set(tlgTxDescricao);
        }
    }
    
    /**
     * Unsets the "tlgTxDescricao" element
     */
    public void unsetTlgTxDescricao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TLGTXDESCRICAO$46, 0);
        }
    }
    
    /**
     * Gets the "vapDhTransacao" element
     */
    public java.util.Calendar getVapDhTransacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VAPDHTRANSACAO$48, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "vapDhTransacao" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetVapDhTransacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(VAPDHTRANSACAO$48, 0);
            return target;
        }
    }
    
    /**
     * True if has "vapDhTransacao" element
     */
    public boolean isSetVapDhTransacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VAPDHTRANSACAO$48) != 0;
        }
    }
    
    /**
     * Sets the "vapDhTransacao" element
     */
    public void setVapDhTransacao(java.util.Calendar vapDhTransacao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VAPDHTRANSACAO$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VAPDHTRANSACAO$48);
            }
            target.setCalendarValue(vapDhTransacao);
        }
    }
    
    /**
     * Sets (as xml) the "vapDhTransacao" element
     */
    public void xsetVapDhTransacao(org.apache.xmlbeans.XmlDateTime vapDhTransacao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(VAPDHTRANSACAO$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(VAPDHTRANSACAO$48);
            }
            target.set(vapDhTransacao);
        }
    }
    
    /**
     * Unsets the "vapDhTransacao" element
     */
    public void unsetVapDhTransacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VAPDHTRANSACAO$48, 0);
        }
    }
    
    /**
     * Gets the "vapNuEtiquetaEncomenda" element
     */
    public java.lang.String getVapNuEtiquetaEncomenda()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VAPNUETIQUETAENCOMENDA$50, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "vapNuEtiquetaEncomenda" element
     */
    public org.apache.xmlbeans.XmlString xgetVapNuEtiquetaEncomenda()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VAPNUETIQUETAENCOMENDA$50, 0);
            return target;
        }
    }
    
    /**
     * True if has "vapNuEtiquetaEncomenda" element
     */
    public boolean isSetVapNuEtiquetaEncomenda()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VAPNUETIQUETAENCOMENDA$50) != 0;
        }
    }
    
    /**
     * Sets the "vapNuEtiquetaEncomenda" element
     */
    public void setVapNuEtiquetaEncomenda(java.lang.String vapNuEtiquetaEncomenda)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VAPNUETIQUETAENCOMENDA$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VAPNUETIQUETAENCOMENDA$50);
            }
            target.setStringValue(vapNuEtiquetaEncomenda);
        }
    }
    
    /**
     * Sets (as xml) the "vapNuEtiquetaEncomenda" element
     */
    public void xsetVapNuEtiquetaEncomenda(org.apache.xmlbeans.XmlString vapNuEtiquetaEncomenda)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VAPNUETIQUETAENCOMENDA$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VAPNUETIQUETAENCOMENDA$50);
            }
            target.set(vapNuEtiquetaEncomenda);
        }
    }
    
    /**
     * Unsets the "vapNuEtiquetaEncomenda" element
     */
    public void unsetVapNuEtiquetaEncomenda()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VAPNUETIQUETAENCOMENDA$50, 0);
        }
    }
    
    /**
     * Gets the "vapVrCobradoEct" element
     */
    public double getVapVrCobradoEct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VAPVRCOBRADOECT$52, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "vapVrCobradoEct" element
     */
    public org.apache.xmlbeans.XmlDouble xgetVapVrCobradoEct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(VAPVRCOBRADOECT$52, 0);
            return target;
        }
    }
    
    /**
     * True if has "vapVrCobradoEct" element
     */
    public boolean isSetVapVrCobradoEct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VAPVRCOBRADOECT$52) != 0;
        }
    }
    
    /**
     * Sets the "vapVrCobradoEct" element
     */
    public void setVapVrCobradoEct(double vapVrCobradoEct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VAPVRCOBRADOECT$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VAPVRCOBRADOECT$52);
            }
            target.setDoubleValue(vapVrCobradoEct);
        }
    }
    
    /**
     * Sets (as xml) the "vapVrCobradoEct" element
     */
    public void xsetVapVrCobradoEct(org.apache.xmlbeans.XmlDouble vapVrCobradoEct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(VAPVRCOBRADOECT$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(VAPVRCOBRADOECT$52);
            }
            target.set(vapVrCobradoEct);
        }
    }
    
    /**
     * Unsets the "vapVrCobradoEct" element
     */
    public void unsetVapVrCobradoEct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VAPVRCOBRADOECT$52, 0);
        }
    }
    
    /**
     * Gets the "vapVrNominal" element
     */
    public double getVapVrNominal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VAPVRNOMINAL$54, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "vapVrNominal" element
     */
    public org.apache.xmlbeans.XmlDouble xgetVapVrNominal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(VAPVRNOMINAL$54, 0);
            return target;
        }
    }
    
    /**
     * True if has "vapVrNominal" element
     */
    public boolean isSetVapVrNominal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VAPVRNOMINAL$54) != 0;
        }
    }
    
    /**
     * Sets the "vapVrNominal" element
     */
    public void setVapVrNominal(double vapVrNominal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VAPVRNOMINAL$54, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VAPVRNOMINAL$54);
            }
            target.setDoubleValue(vapVrNominal);
        }
    }
    
    /**
     * Sets (as xml) the "vapVrNominal" element
     */
    public void xsetVapVrNominal(org.apache.xmlbeans.XmlDouble vapVrNominal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(VAPVRNOMINAL$54, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(VAPVRNOMINAL$54);
            }
            target.set(vapVrNominal);
        }
    }
    
    /**
     * Unsets the "vapVrNominal" element
     */
    public void unsetVapVrNominal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VAPVRNOMINAL$54, 0);
        }
    }
}
