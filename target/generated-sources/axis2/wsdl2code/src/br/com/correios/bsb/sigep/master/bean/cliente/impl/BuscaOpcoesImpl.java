/*
 * XML Type:  buscaOpcoes
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.BuscaOpcoes
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente.impl;
/**
 * An XML buscaOpcoes(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public class BuscaOpcoesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.correios.bsb.sigep.master.bean.cliente.BuscaOpcoes
{
    
    public BuscaOpcoesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTAOBJETOS$0 = 
        new javax.xml.namespace.QName("", "listaObjetos");
    private static final javax.xml.namespace.QName TIPORESULTADO$2 = 
        new javax.xml.namespace.QName("", "tipoResultado");
    private static final javax.xml.namespace.QName USUARIO$4 = 
        new javax.xml.namespace.QName("", "usuario");
    private static final javax.xml.namespace.QName SENHA$6 = 
        new javax.xml.namespace.QName("", "senha");
    
    
    /**
     * Gets array of all "listaObjetos" elements
     */
    public java.lang.String[] getListaObjetosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LISTAOBJETOS$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "listaObjetos" element
     */
    public java.lang.String getListaObjetosArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LISTAOBJETOS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "listaObjetos" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetListaObjetosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LISTAOBJETOS$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "listaObjetos" element
     */
    public org.apache.xmlbeans.XmlString xgetListaObjetosArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LISTAOBJETOS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "listaObjetos" element
     */
    public int sizeOfListaObjetosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LISTAOBJETOS$0);
        }
    }
    
    /**
     * Sets array of all "listaObjetos" element
     */
    public void setListaObjetosArray(java.lang.String[] listaObjetosArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(listaObjetosArray, LISTAOBJETOS$0);
        }
    }
    
    /**
     * Sets ith "listaObjetos" element
     */
    public void setListaObjetosArray(int i, java.lang.String listaObjetos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LISTAOBJETOS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(listaObjetos);
        }
    }
    
    /**
     * Sets (as xml) array of all "listaObjetos" element
     */
    public void xsetListaObjetosArray(org.apache.xmlbeans.XmlString[]listaObjetosArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(listaObjetosArray, LISTAOBJETOS$0);
        }
    }
    
    /**
     * Sets (as xml) ith "listaObjetos" element
     */
    public void xsetListaObjetosArray(int i, org.apache.xmlbeans.XmlString listaObjetos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LISTAOBJETOS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(listaObjetos);
        }
    }
    
    /**
     * Inserts the value as the ith "listaObjetos" element
     */
    public void insertListaObjetos(int i, java.lang.String listaObjetos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(LISTAOBJETOS$0, i);
            target.setStringValue(listaObjetos);
        }
    }
    
    /**
     * Appends the value as the last "listaObjetos" element
     */
    public void addListaObjetos(java.lang.String listaObjetos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LISTAOBJETOS$0);
            target.setStringValue(listaObjetos);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "listaObjetos" element
     */
    public org.apache.xmlbeans.XmlString insertNewListaObjetos(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(LISTAOBJETOS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "listaObjetos" element
     */
    public org.apache.xmlbeans.XmlString addNewListaObjetos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LISTAOBJETOS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "listaObjetos" element
     */
    public void removeListaObjetos(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LISTAOBJETOS$0, i);
        }
    }
    
    /**
     * Gets the "tipoResultado" element
     */
    public java.lang.String getTipoResultado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPORESULTADO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tipoResultado" element
     */
    public org.apache.xmlbeans.XmlString xgetTipoResultado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPORESULTADO$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "tipoResultado" element
     */
    public boolean isSetTipoResultado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIPORESULTADO$2) != 0;
        }
    }
    
    /**
     * Sets the "tipoResultado" element
     */
    public void setTipoResultado(java.lang.String tipoResultado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPORESULTADO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPORESULTADO$2);
            }
            target.setStringValue(tipoResultado);
        }
    }
    
    /**
     * Sets (as xml) the "tipoResultado" element
     */
    public void xsetTipoResultado(org.apache.xmlbeans.XmlString tipoResultado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPORESULTADO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIPORESULTADO$2);
            }
            target.set(tipoResultado);
        }
    }
    
    /**
     * Unsets the "tipoResultado" element
     */
    public void unsetTipoResultado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIPORESULTADO$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USUARIO$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USUARIO$4, 0);
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
            return get_store().count_elements(USUARIO$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USUARIO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USUARIO$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USUARIO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USUARIO$4);
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
            get_store().remove_element(USUARIO$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENHA$6, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENHA$6, 0);
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
            return get_store().count_elements(SENHA$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENHA$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENHA$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENHA$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SENHA$6);
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
            get_store().remove_element(SENHA$6, 0);
        }
    }
}
