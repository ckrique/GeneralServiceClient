/*
 * XML Type:  fechaPlp
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente;


/**
 * An XML fechaPlp(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public interface FechaPlp extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FechaPlp.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE691E6D0F7AD129CBDCC7B3C09AD22B2").resolveHandle("fechaplp7a7btype");
    
    /**
     * Gets the "xml" element
     */
    java.lang.String getXml();
    
    /**
     * Gets (as xml) the "xml" element
     */
    org.apache.xmlbeans.XmlString xgetXml();
    
    /**
     * True if has "xml" element
     */
    boolean isSetXml();
    
    /**
     * Sets the "xml" element
     */
    void setXml(java.lang.String xml);
    
    /**
     * Sets (as xml) the "xml" element
     */
    void xsetXml(org.apache.xmlbeans.XmlString xml);
    
    /**
     * Unsets the "xml" element
     */
    void unsetXml();
    
    /**
     * Gets the "idPlpCliente" element
     */
    long getIdPlpCliente();
    
    /**
     * Gets (as xml) the "idPlpCliente" element
     */
    org.apache.xmlbeans.XmlLong xgetIdPlpCliente();
    
    /**
     * True if has "idPlpCliente" element
     */
    boolean isSetIdPlpCliente();
    
    /**
     * Sets the "idPlpCliente" element
     */
    void setIdPlpCliente(long idPlpCliente);
    
    /**
     * Sets (as xml) the "idPlpCliente" element
     */
    void xsetIdPlpCliente(org.apache.xmlbeans.XmlLong idPlpCliente);
    
    /**
     * Unsets the "idPlpCliente" element
     */
    void unsetIdPlpCliente();
    
    /**
     * Gets the "cartaoPostagem" element
     */
    java.lang.String getCartaoPostagem();
    
    /**
     * Gets (as xml) the "cartaoPostagem" element
     */
    org.apache.xmlbeans.XmlString xgetCartaoPostagem();
    
    /**
     * True if has "cartaoPostagem" element
     */
    boolean isSetCartaoPostagem();
    
    /**
     * Sets the "cartaoPostagem" element
     */
    void setCartaoPostagem(java.lang.String cartaoPostagem);
    
    /**
     * Sets (as xml) the "cartaoPostagem" element
     */
    void xsetCartaoPostagem(org.apache.xmlbeans.XmlString cartaoPostagem);
    
    /**
     * Unsets the "cartaoPostagem" element
     */
    void unsetCartaoPostagem();
    
    /**
     * Gets the "faixaEtiquetas" element
     */
    java.lang.String getFaixaEtiquetas();
    
    /**
     * Gets (as xml) the "faixaEtiquetas" element
     */
    org.apache.xmlbeans.XmlString xgetFaixaEtiquetas();
    
    /**
     * True if has "faixaEtiquetas" element
     */
    boolean isSetFaixaEtiquetas();
    
    /**
     * Sets the "faixaEtiquetas" element
     */
    void setFaixaEtiquetas(java.lang.String faixaEtiquetas);
    
    /**
     * Sets (as xml) the "faixaEtiquetas" element
     */
    void xsetFaixaEtiquetas(org.apache.xmlbeans.XmlString faixaEtiquetas);
    
    /**
     * Unsets the "faixaEtiquetas" element
     */
    void unsetFaixaEtiquetas();
    
    /**
     * Gets the "usuario" element
     */
    java.lang.String getUsuario();
    
    /**
     * Gets (as xml) the "usuario" element
     */
    org.apache.xmlbeans.XmlString xgetUsuario();
    
    /**
     * True if has "usuario" element
     */
    boolean isSetUsuario();
    
    /**
     * Sets the "usuario" element
     */
    void setUsuario(java.lang.String usuario);
    
    /**
     * Sets (as xml) the "usuario" element
     */
    void xsetUsuario(org.apache.xmlbeans.XmlString usuario);
    
    /**
     * Unsets the "usuario" element
     */
    void unsetUsuario();
    
    /**
     * Gets the "senha" element
     */
    java.lang.String getSenha();
    
    /**
     * Gets (as xml) the "senha" element
     */
    org.apache.xmlbeans.XmlString xgetSenha();
    
    /**
     * True if has "senha" element
     */
    boolean isSetSenha();
    
    /**
     * Sets the "senha" element
     */
    void setSenha(java.lang.String senha);
    
    /**
     * Sets (as xml) the "senha" element
     */
    void xsetSenha(org.apache.xmlbeans.XmlString senha);
    
    /**
     * Unsets the "senha" element
     */
    void unsetSenha();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp newInstance() {
          return (br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.FechaPlp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
