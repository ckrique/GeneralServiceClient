/*
 * XML Type:  coleta
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.Coleta
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente;


/**
 * An XML coleta(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public interface Coleta extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Coleta.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8AE111D981C96D520F862962551646CA").resolveHandle("coletab156type");
    
    /**
     * Gets the "cklist" element
     */
    java.lang.String getCklist();
    
    /**
     * Gets (as xml) the "cklist" element
     */
    org.apache.xmlbeans.XmlString xgetCklist();
    
    /**
     * True if has "cklist" element
     */
    boolean isSetCklist();
    
    /**
     * Sets the "cklist" element
     */
    void setCklist(java.lang.String cklist);
    
    /**
     * Sets (as xml) the "cklist" element
     */
    void xsetCklist(org.apache.xmlbeans.XmlString cklist);
    
    /**
     * Unsets the "cklist" element
     */
    void unsetCklist();
    
    /**
     * Gets the "descricao" element
     */
    java.lang.String getDescricao();
    
    /**
     * Gets (as xml) the "descricao" element
     */
    org.apache.xmlbeans.XmlString xgetDescricao();
    
    /**
     * True if has "descricao" element
     */
    boolean isSetDescricao();
    
    /**
     * Sets the "descricao" element
     */
    void setDescricao(java.lang.String descricao);
    
    /**
     * Sets (as xml) the "descricao" element
     */
    void xsetDescricao(org.apache.xmlbeans.XmlString descricao);
    
    /**
     * Unsets the "descricao" element
     */
    void unsetDescricao();
    
    /**
     * Gets array of all "documento" elements
     */
    java.lang.String[] getDocumentoArray();
    
    /**
     * Gets ith "documento" element
     */
    java.lang.String getDocumentoArray(int i);
    
    /**
     * Gets (as xml) array of all "documento" elements
     */
    org.apache.xmlbeans.XmlString[] xgetDocumentoArray();
    
    /**
     * Gets (as xml) ith "documento" element
     */
    org.apache.xmlbeans.XmlString xgetDocumentoArray(int i);
    
    /**
     * Tests for nil ith "documento" element
     */
    boolean isNilDocumentoArray(int i);
    
    /**
     * Returns number of "documento" element
     */
    int sizeOfDocumentoArray();
    
    /**
     * Sets array of all "documento" element
     */
    void setDocumentoArray(java.lang.String[] documentoArray);
    
    /**
     * Sets ith "documento" element
     */
    void setDocumentoArray(int i, java.lang.String documento);
    
    /**
     * Sets (as xml) array of all "documento" element
     */
    void xsetDocumentoArray(org.apache.xmlbeans.XmlString[] documentoArray);
    
    /**
     * Sets (as xml) ith "documento" element
     */
    void xsetDocumentoArray(int i, org.apache.xmlbeans.XmlString documento);
    
    /**
     * Nils the ith "documento" element
     */
    void setNilDocumentoArray(int i);
    
    /**
     * Inserts the value as the ith "documento" element
     */
    void insertDocumento(int i, java.lang.String documento);
    
    /**
     * Appends the value as the last "documento" element
     */
    void addDocumento(java.lang.String documento);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "documento" element
     */
    org.apache.xmlbeans.XmlString insertNewDocumento(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "documento" element
     */
    org.apache.xmlbeans.XmlString addNewDocumento();
    
    /**
     * Removes the ith "documento" element
     */
    void removeDocumento(int i);
    
    /**
     * Gets the "id_cliente" element
     */
    java.lang.String getIdCliente();
    
    /**
     * Gets (as xml) the "id_cliente" element
     */
    org.apache.xmlbeans.XmlString xgetIdCliente();
    
    /**
     * True if has "id_cliente" element
     */
    boolean isSetIdCliente();
    
    /**
     * Sets the "id_cliente" element
     */
    void setIdCliente(java.lang.String idCliente);
    
    /**
     * Sets (as xml) the "id_cliente" element
     */
    void xsetIdCliente(org.apache.xmlbeans.XmlString idCliente);
    
    /**
     * Unsets the "id_cliente" element
     */
    void unsetIdCliente();
    
    /**
     * Gets array of all "produto" elements
     */
    br.com.correios.bsb.sigep.master.bean.cliente.Produto[] getProdutoArray();
    
    /**
     * Gets ith "produto" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.Produto getProdutoArray(int i);
    
    /**
     * Tests for nil ith "produto" element
     */
    boolean isNilProdutoArray(int i);
    
    /**
     * Returns number of "produto" element
     */
    int sizeOfProdutoArray();
    
    /**
     * Sets array of all "produto" element
     */
    void setProdutoArray(br.com.correios.bsb.sigep.master.bean.cliente.Produto[] produtoArray);
    
    /**
     * Sets ith "produto" element
     */
    void setProdutoArray(int i, br.com.correios.bsb.sigep.master.bean.cliente.Produto produto);
    
    /**
     * Nils the ith "produto" element
     */
    void setNilProdutoArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "produto" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.Produto insertNewProduto(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "produto" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.Produto addNewProduto();
    
    /**
     * Removes the ith "produto" element
     */
    void removeProduto(int i);
    
    /**
     * Gets the "remetente" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.Remetente getRemetente();
    
    /**
     * True if has "remetente" element
     */
    boolean isSetRemetente();
    
    /**
     * Sets the "remetente" element
     */
    void setRemetente(br.com.correios.bsb.sigep.master.bean.cliente.Remetente remetente);
    
    /**
     * Appends and returns a new empty "remetente" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.Remetente addNewRemetente();
    
    /**
     * Unsets the "remetente" element
     */
    void unsetRemetente();
    
    /**
     * Gets the "tipo" element
     */
    java.lang.String getTipo();
    
    /**
     * Gets (as xml) the "tipo" element
     */
    org.apache.xmlbeans.XmlString xgetTipo();
    
    /**
     * True if has "tipo" element
     */
    boolean isSetTipo();
    
    /**
     * Sets the "tipo" element
     */
    void setTipo(java.lang.String tipo);
    
    /**
     * Sets (as xml) the "tipo" element
     */
    void xsetTipo(org.apache.xmlbeans.XmlString tipo);
    
    /**
     * Unsets the "tipo" element
     */
    void unsetTipo();
    
    /**
     * Gets the "valor_declarado" element
     */
    java.lang.String getValorDeclarado();
    
    /**
     * Gets (as xml) the "valor_declarado" element
     */
    org.apache.xmlbeans.XmlString xgetValorDeclarado();
    
    /**
     * True if has "valor_declarado" element
     */
    boolean isSetValorDeclarado();
    
    /**
     * Sets the "valor_declarado" element
     */
    void setValorDeclarado(java.lang.String valorDeclarado);
    
    /**
     * Sets (as xml) the "valor_declarado" element
     */
    void xsetValorDeclarado(org.apache.xmlbeans.XmlString valorDeclarado);
    
    /**
     * Unsets the "valor_declarado" element
     */
    void unsetValorDeclarado();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.com.correios.bsb.sigep.master.bean.cliente.Coleta newInstance() {
          return (br.com.correios.bsb.sigep.master.bean.cliente.Coleta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.Coleta newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.com.correios.bsb.sigep.master.bean.cliente.Coleta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.com.correios.bsb.sigep.master.bean.cliente.Coleta parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.Coleta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.Coleta parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.Coleta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.com.correios.bsb.sigep.master.bean.cliente.Coleta parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.Coleta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.Coleta parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.Coleta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.Coleta parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.Coleta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.Coleta parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.Coleta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.Coleta parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.Coleta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.Coleta parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.Coleta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.Coleta parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.Coleta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.Coleta parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.Coleta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.Coleta parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.Coleta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.Coleta parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.Coleta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.Coleta parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.Coleta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.Coleta parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.Coleta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.Coleta parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.Coleta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.Coleta parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.Coleta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
