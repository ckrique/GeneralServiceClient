/*
 * XML Type:  validarPostagemSimultanea
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente;


/**
 * An XML validarPostagemSimultanea(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public interface ValidarPostagemSimultanea extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ValidarPostagemSimultanea.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE691E6D0F7AD129CBDCC7B3C09AD22B2").resolveHandle("validarpostagemsimultanea5c7ctype");
    
    /**
     * Gets the "codAdministrativo" element
     */
    int getCodAdministrativo();
    
    /**
     * Gets (as xml) the "codAdministrativo" element
     */
    org.apache.xmlbeans.XmlInt xgetCodAdministrativo();
    
    /**
     * True if has "codAdministrativo" element
     */
    boolean isSetCodAdministrativo();
    
    /**
     * Sets the "codAdministrativo" element
     */
    void setCodAdministrativo(int codAdministrativo);
    
    /**
     * Sets (as xml) the "codAdministrativo" element
     */
    void xsetCodAdministrativo(org.apache.xmlbeans.XmlInt codAdministrativo);
    
    /**
     * Unsets the "codAdministrativo" element
     */
    void unsetCodAdministrativo();
    
    /**
     * Gets the "codigoServico" element
     */
    int getCodigoServico();
    
    /**
     * Gets (as xml) the "codigoServico" element
     */
    org.apache.xmlbeans.XmlInt xgetCodigoServico();
    
    /**
     * True if has "codigoServico" element
     */
    boolean isSetCodigoServico();
    
    /**
     * Sets the "codigoServico" element
     */
    void setCodigoServico(int codigoServico);
    
    /**
     * Sets (as xml) the "codigoServico" element
     */
    void xsetCodigoServico(org.apache.xmlbeans.XmlInt codigoServico);
    
    /**
     * Unsets the "codigoServico" element
     */
    void unsetCodigoServico();
    
    /**
     * Gets the "idCartaoPostagem" element
     */
    java.lang.String getIdCartaoPostagem();
    
    /**
     * Gets (as xml) the "idCartaoPostagem" element
     */
    org.apache.xmlbeans.XmlString xgetIdCartaoPostagem();
    
    /**
     * True if has "idCartaoPostagem" element
     */
    boolean isSetIdCartaoPostagem();
    
    /**
     * Sets the "idCartaoPostagem" element
     */
    void setIdCartaoPostagem(java.lang.String idCartaoPostagem);
    
    /**
     * Sets (as xml) the "idCartaoPostagem" element
     */
    void xsetIdCartaoPostagem(org.apache.xmlbeans.XmlString idCartaoPostagem);
    
    /**
     * Unsets the "idCartaoPostagem" element
     */
    void unsetIdCartaoPostagem();
    
    /**
     * Gets the "cepDestinatario" element
     */
    java.lang.String getCepDestinatario();
    
    /**
     * Gets (as xml) the "cepDestinatario" element
     */
    org.apache.xmlbeans.XmlString xgetCepDestinatario();
    
    /**
     * True if has "cepDestinatario" element
     */
    boolean isSetCepDestinatario();
    
    /**
     * Sets the "cepDestinatario" element
     */
    void setCepDestinatario(java.lang.String cepDestinatario);
    
    /**
     * Sets (as xml) the "cepDestinatario" element
     */
    void xsetCepDestinatario(org.apache.xmlbeans.XmlString cepDestinatario);
    
    /**
     * Unsets the "cepDestinatario" element
     */
    void unsetCepDestinatario();
    
    /**
     * Gets the "coleta" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea getColeta();
    
    /**
     * True if has "coleta" element
     */
    boolean isSetColeta();
    
    /**
     * Sets the "coleta" element
     */
    void setColeta(br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea coleta);
    
    /**
     * Appends and returns a new empty "coleta" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea addNewColeta();
    
    /**
     * Unsets the "coleta" element
     */
    void unsetColeta();
    
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
        public static br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea newInstance() {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultanea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
