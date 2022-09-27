/*
 * XML Type:  cancelarPedidoScol
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente;


/**
 * An XML cancelarPedidoScol(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public interface CancelarPedidoScol extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CancelarPedidoScol.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE691E6D0F7AD129CBDCC7B3C09AD22B2").resolveHandle("cancelarpedidoscol9d21type");
    
    /**
     * Gets the "codAdministrativo" element
     */
    java.lang.String getCodAdministrativo();
    
    /**
     * Gets (as xml) the "codAdministrativo" element
     */
    org.apache.xmlbeans.XmlString xgetCodAdministrativo();
    
    /**
     * True if has "codAdministrativo" element
     */
    boolean isSetCodAdministrativo();
    
    /**
     * Sets the "codAdministrativo" element
     */
    void setCodAdministrativo(java.lang.String codAdministrativo);
    
    /**
     * Sets (as xml) the "codAdministrativo" element
     */
    void xsetCodAdministrativo(org.apache.xmlbeans.XmlString codAdministrativo);
    
    /**
     * Unsets the "codAdministrativo" element
     */
    void unsetCodAdministrativo();
    
    /**
     * Gets the "idPostagem" element
     */
    java.lang.String getIdPostagem();
    
    /**
     * Gets (as xml) the "idPostagem" element
     */
    org.apache.xmlbeans.XmlString xgetIdPostagem();
    
    /**
     * True if has "idPostagem" element
     */
    boolean isSetIdPostagem();
    
    /**
     * Sets the "idPostagem" element
     */
    void setIdPostagem(java.lang.String idPostagem);
    
    /**
     * Sets (as xml) the "idPostagem" element
     */
    void xsetIdPostagem(org.apache.xmlbeans.XmlString idPostagem);
    
    /**
     * Unsets the "idPostagem" element
     */
    void unsetIdPostagem();
    
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
        public static br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol newInstance() {
          return (br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
