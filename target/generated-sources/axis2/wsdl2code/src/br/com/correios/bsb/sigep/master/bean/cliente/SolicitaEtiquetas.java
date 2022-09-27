/*
 * XML Type:  solicitaEtiquetas
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente;


/**
 * An XML solicitaEtiquetas(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public interface SolicitaEtiquetas extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SolicitaEtiquetas.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE691E6D0F7AD129CBDCC7B3C09AD22B2").resolveHandle("solicitaetiquetas7025type");
    
    /**
     * Gets the "tipoDestinatario" element
     */
    java.lang.String getTipoDestinatario();
    
    /**
     * Gets (as xml) the "tipoDestinatario" element
     */
    org.apache.xmlbeans.XmlString xgetTipoDestinatario();
    
    /**
     * True if has "tipoDestinatario" element
     */
    boolean isSetTipoDestinatario();
    
    /**
     * Sets the "tipoDestinatario" element
     */
    void setTipoDestinatario(java.lang.String tipoDestinatario);
    
    /**
     * Sets (as xml) the "tipoDestinatario" element
     */
    void xsetTipoDestinatario(org.apache.xmlbeans.XmlString tipoDestinatario);
    
    /**
     * Unsets the "tipoDestinatario" element
     */
    void unsetTipoDestinatario();
    
    /**
     * Gets the "identificador" element
     */
    java.lang.String getIdentificador();
    
    /**
     * Gets (as xml) the "identificador" element
     */
    org.apache.xmlbeans.XmlString xgetIdentificador();
    
    /**
     * True if has "identificador" element
     */
    boolean isSetIdentificador();
    
    /**
     * Sets the "identificador" element
     */
    void setIdentificador(java.lang.String identificador);
    
    /**
     * Sets (as xml) the "identificador" element
     */
    void xsetIdentificador(org.apache.xmlbeans.XmlString identificador);
    
    /**
     * Unsets the "identificador" element
     */
    void unsetIdentificador();
    
    /**
     * Gets the "idServico" element
     */
    long getIdServico();
    
    /**
     * Gets (as xml) the "idServico" element
     */
    org.apache.xmlbeans.XmlLong xgetIdServico();
    
    /**
     * True if has "idServico" element
     */
    boolean isSetIdServico();
    
    /**
     * Sets the "idServico" element
     */
    void setIdServico(long idServico);
    
    /**
     * Sets (as xml) the "idServico" element
     */
    void xsetIdServico(org.apache.xmlbeans.XmlLong idServico);
    
    /**
     * Unsets the "idServico" element
     */
    void unsetIdServico();
    
    /**
     * Gets the "qtdEtiquetas" element
     */
    int getQtdEtiquetas();
    
    /**
     * Gets (as xml) the "qtdEtiquetas" element
     */
    org.apache.xmlbeans.XmlInt xgetQtdEtiquetas();
    
    /**
     * True if has "qtdEtiquetas" element
     */
    boolean isSetQtdEtiquetas();
    
    /**
     * Sets the "qtdEtiquetas" element
     */
    void setQtdEtiquetas(int qtdEtiquetas);
    
    /**
     * Sets (as xml) the "qtdEtiquetas" element
     */
    void xsetQtdEtiquetas(org.apache.xmlbeans.XmlInt qtdEtiquetas);
    
    /**
     * Unsets the "qtdEtiquetas" element
     */
    void unsetQtdEtiquetas();
    
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
        public static br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas newInstance() {
          return (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetas) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
