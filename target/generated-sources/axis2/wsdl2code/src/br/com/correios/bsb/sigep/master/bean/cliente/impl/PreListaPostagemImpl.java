/*
 * XML Type:  preListaPostagem
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML preListaPostagem(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class PreListaPostagemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem
{
    
    public PreListaPostagemImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CARTAOPOSTAGEM$0 = 
        new javax.xml.namespace.QName("", "cartaoPostagem");
    private static final javax.xml.namespace.QName CONTEUDOPROIBIDO$2 = 
        new javax.xml.namespace.QName("", "conteudoProibido");
    private static final javax.xml.namespace.QName DATAATUALIZACAOCLIENTE$4 = 
        new javax.xml.namespace.QName("", "dataAtualizacaoCliente");
    private static final javax.xml.namespace.QName DATAATUALIZACAOSARA$6 = 
        new javax.xml.namespace.QName("", "dataAtualizacaoSara");
    private static final javax.xml.namespace.QName DATAFECHAMENTO$8 = 
        new javax.xml.namespace.QName("", "dataFechamento");
    private static final javax.xml.namespace.QName DATAPOSTAGEM$10 = 
        new javax.xml.namespace.QName("", "dataPostagem");
    private static final javax.xml.namespace.QName DATAPOSTAGEMSARA$12 = 
        new javax.xml.namespace.QName("", "dataPostagemSara");
    private static final javax.xml.namespace.QName OBJETOSPOSTAIS$14 = 
        new javax.xml.namespace.QName("", "objetosPostais");
    private static final javax.xml.namespace.QName PLPCLIENTE$16 = 
        new javax.xml.namespace.QName("", "plpCliente");
    private static final javax.xml.namespace.QName PLPNU$18 = 
        new javax.xml.namespace.QName("", "plpNu");
    private static final javax.xml.namespace.QName PLPXML$20 = 
        new javax.xml.namespace.QName("", "plpXml");
    private static final javax.xml.namespace.QName PLPXMLRETORNO$22 = 
        new javax.xml.namespace.QName("", "plpXmlRetorno");
    private static final javax.xml.namespace.QName STATUS$24 = 
        new javax.xml.namespace.QName("", "status");
    
    
    /**
     * Gets the "cartaoPostagem" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP getCartaoPostagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP)get_store().find_element_user(CARTAOPOSTAGEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cartaoPostagem" element
     */
    public boolean isSetCartaoPostagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CARTAOPOSTAGEM$0) != 0;
        }
    }
    
    /**
     * Sets the "cartaoPostagem" element
     */
    public void setCartaoPostagem(br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP cartaoPostagem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP)get_store().find_element_user(CARTAOPOSTAGEM$0, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP)get_store().add_element_user(CARTAOPOSTAGEM$0);
            }
            target.set(cartaoPostagem);
        }
    }
    
    /**
     * Appends and returns a new empty "cartaoPostagem" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP addNewCartaoPostagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP)get_store().add_element_user(CARTAOPOSTAGEM$0);
            return target;
        }
    }
    
    /**
     * Unsets the "cartaoPostagem" element
     */
    public void unsetCartaoPostagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CARTAOPOSTAGEM$0, 0);
        }
    }
    
    /**
     * Gets the "conteudoProibido" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.SimNao.Enum getConteudoProibido()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTEUDOPROIBIDO$2, 0);
            if (target == null)
            {
                return null;
            }
            return (br.com.correios.bsb.sigep.master.bean.cliente.SimNao.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "conteudoProibido" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.SimNao xgetConteudoProibido()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.SimNao target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.SimNao)get_store().find_element_user(CONTEUDOPROIBIDO$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "conteudoProibido" element
     */
    public boolean isSetConteudoProibido()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTEUDOPROIBIDO$2) != 0;
        }
    }
    
    /**
     * Sets the "conteudoProibido" element
     */
    public void setConteudoProibido(br.com.correios.bsb.sigep.master.bean.cliente.SimNao.Enum conteudoProibido)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTEUDOPROIBIDO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTEUDOPROIBIDO$2);
            }
            target.setEnumValue(conteudoProibido);
        }
    }
    
    /**
     * Sets (as xml) the "conteudoProibido" element
     */
    public void xsetConteudoProibido(br.com.correios.bsb.sigep.master.bean.cliente.SimNao conteudoProibido)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.SimNao target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.SimNao)get_store().find_element_user(CONTEUDOPROIBIDO$2, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.SimNao)get_store().add_element_user(CONTEUDOPROIBIDO$2);
            }
            target.set(conteudoProibido);
        }
    }
    
    /**
     * Unsets the "conteudoProibido" element
     */
    public void unsetConteudoProibido()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTEUDOPROIBIDO$2, 0);
        }
    }
    
    /**
     * Gets the "dataAtualizacaoCliente" element
     */
    public java.util.Calendar getDataAtualizacaoCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAATUALIZACAOCLIENTE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dataAtualizacaoCliente" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDataAtualizacaoCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAATUALIZACAOCLIENTE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "dataAtualizacaoCliente" element
     */
    public boolean isSetDataAtualizacaoCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAATUALIZACAOCLIENTE$4) != 0;
        }
    }
    
    /**
     * Sets the "dataAtualizacaoCliente" element
     */
    public void setDataAtualizacaoCliente(java.util.Calendar dataAtualizacaoCliente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAATUALIZACAOCLIENTE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAATUALIZACAOCLIENTE$4);
            }
            target.setCalendarValue(dataAtualizacaoCliente);
        }
    }
    
    /**
     * Sets (as xml) the "dataAtualizacaoCliente" element
     */
    public void xsetDataAtualizacaoCliente(org.apache.xmlbeans.XmlDateTime dataAtualizacaoCliente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAATUALIZACAOCLIENTE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATAATUALIZACAOCLIENTE$4);
            }
            target.set(dataAtualizacaoCliente);
        }
    }
    
    /**
     * Unsets the "dataAtualizacaoCliente" element
     */
    public void unsetDataAtualizacaoCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAATUALIZACAOCLIENTE$4, 0);
        }
    }
    
    /**
     * Gets the "dataAtualizacaoSara" element
     */
    public java.util.Calendar getDataAtualizacaoSara()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAATUALIZACAOSARA$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dataAtualizacaoSara" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDataAtualizacaoSara()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAATUALIZACAOSARA$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "dataAtualizacaoSara" element
     */
    public boolean isSetDataAtualizacaoSara()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAATUALIZACAOSARA$6) != 0;
        }
    }
    
    /**
     * Sets the "dataAtualizacaoSara" element
     */
    public void setDataAtualizacaoSara(java.util.Calendar dataAtualizacaoSara)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAATUALIZACAOSARA$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAATUALIZACAOSARA$6);
            }
            target.setCalendarValue(dataAtualizacaoSara);
        }
    }
    
    /**
     * Sets (as xml) the "dataAtualizacaoSara" element
     */
    public void xsetDataAtualizacaoSara(org.apache.xmlbeans.XmlDateTime dataAtualizacaoSara)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAATUALIZACAOSARA$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATAATUALIZACAOSARA$6);
            }
            target.set(dataAtualizacaoSara);
        }
    }
    
    /**
     * Unsets the "dataAtualizacaoSara" element
     */
    public void unsetDataAtualizacaoSara()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAATUALIZACAOSARA$6, 0);
        }
    }
    
    /**
     * Gets the "dataFechamento" element
     */
    public java.util.Calendar getDataFechamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAFECHAMENTO$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dataFechamento" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDataFechamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAFECHAMENTO$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "dataFechamento" element
     */
    public boolean isSetDataFechamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAFECHAMENTO$8) != 0;
        }
    }
    
    /**
     * Sets the "dataFechamento" element
     */
    public void setDataFechamento(java.util.Calendar dataFechamento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAFECHAMENTO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAFECHAMENTO$8);
            }
            target.setCalendarValue(dataFechamento);
        }
    }
    
    /**
     * Sets (as xml) the "dataFechamento" element
     */
    public void xsetDataFechamento(org.apache.xmlbeans.XmlDateTime dataFechamento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAFECHAMENTO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATAFECHAMENTO$8);
            }
            target.set(dataFechamento);
        }
    }
    
    /**
     * Unsets the "dataFechamento" element
     */
    public void unsetDataFechamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAFECHAMENTO$8, 0);
        }
    }
    
    /**
     * Gets the "dataPostagem" element
     */
    public java.util.Calendar getDataPostagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAPOSTAGEM$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dataPostagem" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDataPostagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAPOSTAGEM$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "dataPostagem" element
     */
    public boolean isSetDataPostagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAPOSTAGEM$10) != 0;
        }
    }
    
    /**
     * Sets the "dataPostagem" element
     */
    public void setDataPostagem(java.util.Calendar dataPostagem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAPOSTAGEM$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAPOSTAGEM$10);
            }
            target.setCalendarValue(dataPostagem);
        }
    }
    
    /**
     * Sets (as xml) the "dataPostagem" element
     */
    public void xsetDataPostagem(org.apache.xmlbeans.XmlDateTime dataPostagem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAPOSTAGEM$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATAPOSTAGEM$10);
            }
            target.set(dataPostagem);
        }
    }
    
    /**
     * Unsets the "dataPostagem" element
     */
    public void unsetDataPostagem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAPOSTAGEM$10, 0);
        }
    }
    
    /**
     * Gets the "dataPostagemSara" element
     */
    public java.util.Calendar getDataPostagemSara()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAPOSTAGEMSARA$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dataPostagemSara" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDataPostagemSara()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAPOSTAGEMSARA$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "dataPostagemSara" element
     */
    public boolean isSetDataPostagemSara()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAPOSTAGEMSARA$12) != 0;
        }
    }
    
    /**
     * Sets the "dataPostagemSara" element
     */
    public void setDataPostagemSara(java.util.Calendar dataPostagemSara)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAPOSTAGEMSARA$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAPOSTAGEMSARA$12);
            }
            target.setCalendarValue(dataPostagemSara);
        }
    }
    
    /**
     * Sets (as xml) the "dataPostagemSara" element
     */
    public void xsetDataPostagemSara(org.apache.xmlbeans.XmlDateTime dataPostagemSara)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAPOSTAGEMSARA$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATAPOSTAGEMSARA$12);
            }
            target.set(dataPostagemSara);
        }
    }
    
    /**
     * Unsets the "dataPostagemSara" element
     */
    public void unsetDataPostagemSara()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAPOSTAGEMSARA$12, 0);
        }
    }
    
    /**
     * Gets array of all "objetosPostais" elements
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal[] getObjetosPostaisArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OBJETOSPOSTAIS$14, targetList);
            br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal[] result = new br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "objetosPostais" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal getObjetosPostaisArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal)get_store().find_element_user(OBJETOSPOSTAIS$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "objetosPostais" element
     */
    public boolean isNilObjetosPostaisArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal)get_store().find_element_user(OBJETOSPOSTAIS$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "objetosPostais" element
     */
    public int sizeOfObjetosPostaisArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJETOSPOSTAIS$14);
        }
    }
    
    /**
     * Sets array of all "objetosPostais" element
     */
    public void setObjetosPostaisArray(br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal[] objetosPostaisArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(objetosPostaisArray, OBJETOSPOSTAIS$14);
        }
    }
    
    /**
     * Sets ith "objetosPostais" element
     */
    public void setObjetosPostaisArray(int i, br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal objetosPostais)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal)get_store().find_element_user(OBJETOSPOSTAIS$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(objetosPostais);
        }
    }
    
    /**
     * Nils the ith "objetosPostais" element
     */
    public void setNilObjetosPostaisArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal)get_store().find_element_user(OBJETOSPOSTAIS$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "objetosPostais" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal insertNewObjetosPostais(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal)get_store().insert_element_user(OBJETOSPOSTAIS$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "objetosPostais" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal addNewObjetosPostais()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal)get_store().add_element_user(OBJETOSPOSTAIS$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "objetosPostais" element
     */
    public void removeObjetosPostais(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJETOSPOSTAIS$14, i);
        }
    }
    
    /**
     * Gets the "plpCliente" element
     */
    public long getPlpCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLPCLIENTE$16, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "plpCliente" element
     */
    public org.apache.xmlbeans.XmlLong xgetPlpCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(PLPCLIENTE$16, 0);
            return target;
        }
    }
    
    /**
     * Sets the "plpCliente" element
     */
    public void setPlpCliente(long plpCliente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLPCLIENTE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PLPCLIENTE$16);
            }
            target.setLongValue(plpCliente);
        }
    }
    
    /**
     * Sets (as xml) the "plpCliente" element
     */
    public void xsetPlpCliente(org.apache.xmlbeans.XmlLong plpCliente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(PLPCLIENTE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(PLPCLIENTE$16);
            }
            target.set(plpCliente);
        }
    }
    
    /**
     * Gets the "plpNu" element
     */
    public long getPlpNu()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLPNU$18, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "plpNu" element
     */
    public org.apache.xmlbeans.XmlLong xgetPlpNu()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(PLPNU$18, 0);
            return target;
        }
    }
    
    /**
     * Sets the "plpNu" element
     */
    public void setPlpNu(long plpNu)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLPNU$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PLPNU$18);
            }
            target.setLongValue(plpNu);
        }
    }
    
    /**
     * Sets (as xml) the "plpNu" element
     */
    public void xsetPlpNu(org.apache.xmlbeans.XmlLong plpNu)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(PLPNU$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(PLPNU$18);
            }
            target.set(plpNu);
        }
    }
    
    /**
     * Gets array of all "plpXml" elements
     */
    public int[] getPlpXmlArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PLPXML$20, targetList);
            int[] result = new int[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getIntValue();
            return result;
        }
    }
    
    /**
     * Gets ith "plpXml" element
     */
    public int getPlpXmlArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLPXML$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "plpXml" elements
     */
    public org.apache.xmlbeans.XmlUnsignedShort[] xgetPlpXmlArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PLPXML$20, targetList);
            org.apache.xmlbeans.XmlUnsignedShort[] result = new org.apache.xmlbeans.XmlUnsignedShort[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "plpXml" element
     */
    public org.apache.xmlbeans.XmlUnsignedShort xgetPlpXmlArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_element_user(PLPXML$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlUnsignedShort)target;
        }
    }
    
    /**
     * Tests for nil ith "plpXml" element
     */
    public boolean isNilPlpXmlArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_element_user(PLPXML$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "plpXml" element
     */
    public int sizeOfPlpXmlArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLPXML$20);
        }
    }
    
    /**
     * Sets array of all "plpXml" element
     */
    public void setPlpXmlArray(int[] plpXmlArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(plpXmlArray, PLPXML$20);
        }
    }
    
    /**
     * Sets ith "plpXml" element
     */
    public void setPlpXmlArray(int i, int plpXml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLPXML$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setIntValue(plpXml);
        }
    }
    
    /**
     * Sets (as xml) array of all "plpXml" element
     */
    public void xsetPlpXmlArray(org.apache.xmlbeans.XmlUnsignedShort[]plpXmlArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(plpXmlArray, PLPXML$20);
        }
    }
    
    /**
     * Sets (as xml) ith "plpXml" element
     */
    public void xsetPlpXmlArray(int i, org.apache.xmlbeans.XmlUnsignedShort plpXml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_element_user(PLPXML$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(plpXml);
        }
    }
    
    /**
     * Nils the ith "plpXml" element
     */
    public void setNilPlpXmlArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_element_user(PLPXML$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts the value as the ith "plpXml" element
     */
    public void insertPlpXml(int i, int plpXml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PLPXML$20, i);
            target.setIntValue(plpXml);
        }
    }
    
    /**
     * Appends the value as the last "plpXml" element
     */
    public void addPlpXml(int plpXml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PLPXML$20);
            target.setIntValue(plpXml);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "plpXml" element
     */
    public org.apache.xmlbeans.XmlUnsignedShort insertNewPlpXml(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().insert_element_user(PLPXML$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "plpXml" element
     */
    public org.apache.xmlbeans.XmlUnsignedShort addNewPlpXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().add_element_user(PLPXML$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "plpXml" element
     */
    public void removePlpXml(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLPXML$20, i);
        }
    }
    
    /**
     * Gets array of all "plpXmlRetorno" elements
     */
    public int[] getPlpXmlRetornoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PLPXMLRETORNO$22, targetList);
            int[] result = new int[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getIntValue();
            return result;
        }
    }
    
    /**
     * Gets ith "plpXmlRetorno" element
     */
    public int getPlpXmlRetornoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLPXMLRETORNO$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "plpXmlRetorno" elements
     */
    public org.apache.xmlbeans.XmlUnsignedShort[] xgetPlpXmlRetornoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PLPXMLRETORNO$22, targetList);
            org.apache.xmlbeans.XmlUnsignedShort[] result = new org.apache.xmlbeans.XmlUnsignedShort[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "plpXmlRetorno" element
     */
    public org.apache.xmlbeans.XmlUnsignedShort xgetPlpXmlRetornoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_element_user(PLPXMLRETORNO$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlUnsignedShort)target;
        }
    }
    
    /**
     * Tests for nil ith "plpXmlRetorno" element
     */
    public boolean isNilPlpXmlRetornoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_element_user(PLPXMLRETORNO$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "plpXmlRetorno" element
     */
    public int sizeOfPlpXmlRetornoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLPXMLRETORNO$22);
        }
    }
    
    /**
     * Sets array of all "plpXmlRetorno" element
     */
    public void setPlpXmlRetornoArray(int[] plpXmlRetornoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(plpXmlRetornoArray, PLPXMLRETORNO$22);
        }
    }
    
    /**
     * Sets ith "plpXmlRetorno" element
     */
    public void setPlpXmlRetornoArray(int i, int plpXmlRetorno)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLPXMLRETORNO$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setIntValue(plpXmlRetorno);
        }
    }
    
    /**
     * Sets (as xml) array of all "plpXmlRetorno" element
     */
    public void xsetPlpXmlRetornoArray(org.apache.xmlbeans.XmlUnsignedShort[]plpXmlRetornoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(plpXmlRetornoArray, PLPXMLRETORNO$22);
        }
    }
    
    /**
     * Sets (as xml) ith "plpXmlRetorno" element
     */
    public void xsetPlpXmlRetornoArray(int i, org.apache.xmlbeans.XmlUnsignedShort plpXmlRetorno)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_element_user(PLPXMLRETORNO$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(plpXmlRetorno);
        }
    }
    
    /**
     * Nils the ith "plpXmlRetorno" element
     */
    public void setNilPlpXmlRetornoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_element_user(PLPXMLRETORNO$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts the value as the ith "plpXmlRetorno" element
     */
    public void insertPlpXmlRetorno(int i, int plpXmlRetorno)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PLPXMLRETORNO$22, i);
            target.setIntValue(plpXmlRetorno);
        }
    }
    
    /**
     * Appends the value as the last "plpXmlRetorno" element
     */
    public void addPlpXmlRetorno(int plpXmlRetorno)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PLPXMLRETORNO$22);
            target.setIntValue(plpXmlRetorno);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "plpXmlRetorno" element
     */
    public org.apache.xmlbeans.XmlUnsignedShort insertNewPlpXmlRetorno(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().insert_element_user(PLPXMLRETORNO$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "plpXmlRetorno" element
     */
    public org.apache.xmlbeans.XmlUnsignedShort addNewPlpXmlRetorno()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().add_element_user(PLPXMLRETORNO$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "plpXmlRetorno" element
     */
    public void removePlpXmlRetorno(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLPXMLRETORNO$22, i);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.StatusPlp.Enum getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$24, 0);
            if (target == null)
            {
                return null;
            }
            return (br.com.correios.bsb.sigep.master.bean.cliente.StatusPlp.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "status" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.StatusPlp xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.StatusPlp target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.StatusPlp)get_store().find_element_user(STATUS$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "status" element
     */
    public boolean isSetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUS$24) != 0;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(br.com.correios.bsb.sigep.master.bean.cliente.StatusPlp.Enum status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$24);
            }
            target.setEnumValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "status" element
     */
    public void xsetStatus(br.com.correios.bsb.sigep.master.bean.cliente.StatusPlp status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.StatusPlp target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.StatusPlp)get_store().find_element_user(STATUS$24, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.StatusPlp)get_store().add_element_user(STATUS$24);
            }
            target.set(status);
        }
    }
    
    /**
     * Unsets the "status" element
     */
    public void unsetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUS$24, 0);
        }
    }
}
