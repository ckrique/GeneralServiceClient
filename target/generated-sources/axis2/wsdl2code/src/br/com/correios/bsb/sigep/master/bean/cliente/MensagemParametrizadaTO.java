/*
 * XML Type:  mensagemParametrizadaTO
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente;


/**
 * An XML mensagemParametrizadaTO(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public interface MensagemParametrizadaTO extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MensagemParametrizadaTO.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE691E6D0F7AD129CBDCC7B3C09AD22B2").resolveHandle("mensagemparametrizadatod179type");
    
    /**
     * Gets the "mensagem" element
     */
    java.lang.String getMensagem();
    
    /**
     * Gets (as xml) the "mensagem" element
     */
    org.apache.xmlbeans.XmlString xgetMensagem();
    
    /**
     * True if has "mensagem" element
     */
    boolean isSetMensagem();
    
    /**
     * Sets the "mensagem" element
     */
    void setMensagem(java.lang.String mensagem);
    
    /**
     * Sets (as xml) the "mensagem" element
     */
    void xsetMensagem(org.apache.xmlbeans.XmlString mensagem);
    
    /**
     * Unsets the "mensagem" element
     */
    void unsetMensagem();
    
    /**
     * Gets the "tipo" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.TipoMensagem.Enum getTipo();
    
    /**
     * Gets (as xml) the "tipo" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.TipoMensagem xgetTipo();
    
    /**
     * True if has "tipo" element
     */
    boolean isSetTipo();
    
    /**
     * Sets the "tipo" element
     */
    void setTipo(br.com.correios.bsb.sigep.master.bean.cliente.TipoMensagem.Enum tipo);
    
    /**
     * Sets (as xml) the "tipo" element
     */
    void xsetTipo(br.com.correios.bsb.sigep.master.bean.cliente.TipoMensagem tipo);
    
    /**
     * Unsets the "tipo" element
     */
    void unsetTipo();
    
    /**
     * Gets the "titulo" element
     */
    java.lang.String getTitulo();
    
    /**
     * Gets (as xml) the "titulo" element
     */
    org.apache.xmlbeans.XmlString xgetTitulo();
    
    /**
     * True if has "titulo" element
     */
    boolean isSetTitulo();
    
    /**
     * Sets the "titulo" element
     */
    void setTitulo(java.lang.String titulo);
    
    /**
     * Sets (as xml) the "titulo" element
     */
    void xsetTitulo(org.apache.xmlbeans.XmlString titulo);
    
    /**
     * Unsets the "titulo" element
     */
    void unsetTitulo();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO newInstance() {
          return (br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
