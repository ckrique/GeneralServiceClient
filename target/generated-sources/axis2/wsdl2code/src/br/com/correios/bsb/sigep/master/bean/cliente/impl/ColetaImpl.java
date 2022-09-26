/*
 * XML Type:  coleta
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.Coleta
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML coleta(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class ColetaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.Coleta
{
    
    public ColetaImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CKLIST$0 = 
        new javax.xml.namespace.QName("", "cklist");
    private static final javax.xml.namespace.QName DESCRICAO$2 = 
        new javax.xml.namespace.QName("", "descricao");
    private static final javax.xml.namespace.QName DOCUMENTO$4 = 
        new javax.xml.namespace.QName("", "documento");
    private static final javax.xml.namespace.QName IDCLIENTE$6 = 
        new javax.xml.namespace.QName("", "id_cliente");
    private static final javax.xml.namespace.QName PRODUTO$8 = 
        new javax.xml.namespace.QName("", "produto");
    private static final javax.xml.namespace.QName REMETENTE$10 = 
        new javax.xml.namespace.QName("", "remetente");
    private static final javax.xml.namespace.QName TIPO$12 = 
        new javax.xml.namespace.QName("", "tipo");
    private static final javax.xml.namespace.QName VALORDECLARADO$14 = 
        new javax.xml.namespace.QName("", "valor_declarado");
    
    
    /**
     * Gets the "cklist" element
     */
    public java.lang.String getCklist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CKLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cklist" element
     */
    public org.apache.xmlbeans.XmlString xgetCklist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CKLIST$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "cklist" element
     */
    public boolean isSetCklist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CKLIST$0) != 0;
        }
    }
    
    /**
     * Sets the "cklist" element
     */
    public void setCklist(java.lang.String cklist)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CKLIST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CKLIST$0);
            }
            target.setStringValue(cklist);
        }
    }
    
    /**
     * Sets (as xml) the "cklist" element
     */
    public void xsetCklist(org.apache.xmlbeans.XmlString cklist)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CKLIST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CKLIST$0);
            }
            target.set(cklist);
        }
    }
    
    /**
     * Unsets the "cklist" element
     */
    public void unsetCklist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CKLIST$0, 0);
        }
    }
    
    /**
     * Gets the "descricao" element
     */
    public java.lang.String getDescricao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRICAO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "descricao" element
     */
    public org.apache.xmlbeans.XmlString xgetDescricao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRICAO$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "descricao" element
     */
    public boolean isSetDescricao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRICAO$2) != 0;
        }
    }
    
    /**
     * Sets the "descricao" element
     */
    public void setDescricao(java.lang.String descricao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRICAO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRICAO$2);
            }
            target.setStringValue(descricao);
        }
    }
    
    /**
     * Sets (as xml) the "descricao" element
     */
    public void xsetDescricao(org.apache.xmlbeans.XmlString descricao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRICAO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRICAO$2);
            }
            target.set(descricao);
        }
    }
    
    /**
     * Unsets the "descricao" element
     */
    public void unsetDescricao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRICAO$2, 0);
        }
    }
    
    /**
     * Gets array of all "documento" elements
     */
    public java.lang.String[] getDocumentoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DOCUMENTO$4, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "documento" element
     */
    public java.lang.String getDocumentoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTO$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "documento" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetDocumentoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DOCUMENTO$4, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "documento" element
     */
    public org.apache.xmlbeans.XmlString xgetDocumentoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTO$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Tests for nil ith "documento" element
     */
    public boolean isNilDocumentoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTO$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "documento" element
     */
    public int sizeOfDocumentoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCUMENTO$4);
        }
    }
    
    /**
     * Sets array of all "documento" element
     */
    public void setDocumentoArray(java.lang.String[] documentoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(documentoArray, DOCUMENTO$4);
        }
    }
    
    /**
     * Sets ith "documento" element
     */
    public void setDocumentoArray(int i, java.lang.String documento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTO$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(documento);
        }
    }
    
    /**
     * Sets (as xml) array of all "documento" element
     */
    public void xsetDocumentoArray(org.apache.xmlbeans.XmlString[]documentoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(documentoArray, DOCUMENTO$4);
        }
    }
    
    /**
     * Sets (as xml) ith "documento" element
     */
    public void xsetDocumentoArray(int i, org.apache.xmlbeans.XmlString documento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTO$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(documento);
        }
    }
    
    /**
     * Nils the ith "documento" element
     */
    public void setNilDocumentoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTO$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts the value as the ith "documento" element
     */
    public void insertDocumento(int i, java.lang.String documento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DOCUMENTO$4, i);
            target.setStringValue(documento);
        }
    }
    
    /**
     * Appends the value as the last "documento" element
     */
    public void addDocumento(java.lang.String documento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCUMENTO$4);
            target.setStringValue(documento);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "documento" element
     */
    public org.apache.xmlbeans.XmlString insertNewDocumento(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(DOCUMENTO$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "documento" element
     */
    public org.apache.xmlbeans.XmlString addNewDocumento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOCUMENTO$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "documento" element
     */
    public void removeDocumento(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCUMENTO$4, i);
        }
    }
    
    /**
     * Gets the "id_cliente" element
     */
    public java.lang.String getIdCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDCLIENTE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id_cliente" element
     */
    public org.apache.xmlbeans.XmlString xgetIdCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDCLIENTE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "id_cliente" element
     */
    public boolean isSetIdCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDCLIENTE$6) != 0;
        }
    }
    
    /**
     * Sets the "id_cliente" element
     */
    public void setIdCliente(java.lang.String idCliente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDCLIENTE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDCLIENTE$6);
            }
            target.setStringValue(idCliente);
        }
    }
    
    /**
     * Sets (as xml) the "id_cliente" element
     */
    public void xsetIdCliente(org.apache.xmlbeans.XmlString idCliente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDCLIENTE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDCLIENTE$6);
            }
            target.set(idCliente);
        }
    }
    
    /**
     * Unsets the "id_cliente" element
     */
    public void unsetIdCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDCLIENTE$6, 0);
        }
    }
    
    /**
     * Gets array of all "produto" elements
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.Produto[] getProdutoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRODUTO$8, targetList);
            br.com.correios.bsb.sigep.master.bean.cliente.Produto[] result = new br.com.correios.bsb.sigep.master.bean.cliente.Produto[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "produto" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.Produto getProdutoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.Produto target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.Produto)get_store().find_element_user(PRODUTO$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "produto" element
     */
    public boolean isNilProdutoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.Produto target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.Produto)get_store().find_element_user(PRODUTO$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "produto" element
     */
    public int sizeOfProdutoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUTO$8);
        }
    }
    
    /**
     * Sets array of all "produto" element
     */
    public void setProdutoArray(br.com.correios.bsb.sigep.master.bean.cliente.Produto[] produtoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(produtoArray, PRODUTO$8);
        }
    }
    
    /**
     * Sets ith "produto" element
     */
    public void setProdutoArray(int i, br.com.correios.bsb.sigep.master.bean.cliente.Produto produto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.Produto target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.Produto)get_store().find_element_user(PRODUTO$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(produto);
        }
    }
    
    /**
     * Nils the ith "produto" element
     */
    public void setNilProdutoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.Produto target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.Produto)get_store().find_element_user(PRODUTO$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "produto" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.Produto insertNewProduto(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.Produto target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.Produto)get_store().insert_element_user(PRODUTO$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "produto" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.Produto addNewProduto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.Produto target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.Produto)get_store().add_element_user(PRODUTO$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "produto" element
     */
    public void removeProduto(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUTO$8, i);
        }
    }
    
    /**
     * Gets the "remetente" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.Remetente getRemetente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.Remetente target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.Remetente)get_store().find_element_user(REMETENTE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "remetente" element
     */
    public boolean isSetRemetente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REMETENTE$10) != 0;
        }
    }
    
    /**
     * Sets the "remetente" element
     */
    public void setRemetente(br.com.correios.bsb.sigep.master.bean.cliente.Remetente remetente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.Remetente target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.Remetente)get_store().find_element_user(REMETENTE$10, 0);
            if (target == null)
            {
                target = (br.com.correios.bsb.sigep.master.bean.cliente.Remetente)get_store().add_element_user(REMETENTE$10);
            }
            target.set(remetente);
        }
    }
    
    /**
     * Appends and returns a new empty "remetente" element
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.Remetente addNewRemetente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.correios.bsb.sigep.master.bean.cliente.Remetente target = null;
            target = (br.com.correios.bsb.sigep.master.bean.cliente.Remetente)get_store().add_element_user(REMETENTE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "remetente" element
     */
    public void unsetRemetente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REMETENTE$10, 0);
        }
    }
    
    /**
     * Gets the "tipo" element
     */
    public java.lang.String getTipo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPO$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tipo" element
     */
    public org.apache.xmlbeans.XmlString xgetTipo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPO$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "tipo" element
     */
    public boolean isSetTipo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIPO$12) != 0;
        }
    }
    
    /**
     * Sets the "tipo" element
     */
    public void setTipo(java.lang.String tipo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPO$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPO$12);
            }
            target.setStringValue(tipo);
        }
    }
    
    /**
     * Sets (as xml) the "tipo" element
     */
    public void xsetTipo(org.apache.xmlbeans.XmlString tipo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPO$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIPO$12);
            }
            target.set(tipo);
        }
    }
    
    /**
     * Unsets the "tipo" element
     */
    public void unsetTipo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIPO$12, 0);
        }
    }
    
    /**
     * Gets the "valor_declarado" element
     */
    public java.lang.String getValorDeclarado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALORDECLARADO$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "valor_declarado" element
     */
    public org.apache.xmlbeans.XmlString xgetValorDeclarado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALORDECLARADO$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "valor_declarado" element
     */
    public boolean isSetValorDeclarado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALORDECLARADO$14) != 0;
        }
    }
    
    /**
     * Sets the "valor_declarado" element
     */
    public void setValorDeclarado(java.lang.String valorDeclarado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALORDECLARADO$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALORDECLARADO$14);
            }
            target.setStringValue(valorDeclarado);
        }
    }
    
    /**
     * Sets (as xml) the "valor_declarado" element
     */
    public void xsetValorDeclarado(org.apache.xmlbeans.XmlString valorDeclarado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALORDECLARADO$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VALORDECLARADO$14);
            }
            target.set(valorDeclarado);
        }
    }
    
    /**
     * Unsets the "valor_declarado" element
     */
    public void unsetValorDeclarado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALORDECLARADO$14, 0);
        }
    }
}
