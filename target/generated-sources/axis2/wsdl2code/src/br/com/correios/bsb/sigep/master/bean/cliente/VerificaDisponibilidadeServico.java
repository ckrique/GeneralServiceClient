/*
 * XML Type:  verificaDisponibilidadeServico
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente;


/**
 * An XML verificaDisponibilidadeServico(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public interface VerificaDisponibilidadeServico extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(VerificaDisponibilidadeServico.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE691E6D0F7AD129CBDCC7B3C09AD22B2").resolveHandle("verificadisponibilidadeservico0040type");
    
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
     * Gets the "numeroServico" element
     */
    java.lang.String getNumeroServico();
    
    /**
     * Gets (as xml) the "numeroServico" element
     */
    org.apache.xmlbeans.XmlString xgetNumeroServico();
    
    /**
     * True if has "numeroServico" element
     */
    boolean isSetNumeroServico();
    
    /**
     * Sets the "numeroServico" element
     */
    void setNumeroServico(java.lang.String numeroServico);
    
    /**
     * Sets (as xml) the "numeroServico" element
     */
    void xsetNumeroServico(org.apache.xmlbeans.XmlString numeroServico);
    
    /**
     * Unsets the "numeroServico" element
     */
    void unsetNumeroServico();
    
    /**
     * Gets the "cepOrigem" element
     */
    java.lang.String getCepOrigem();
    
    /**
     * Gets (as xml) the "cepOrigem" element
     */
    org.apache.xmlbeans.XmlString xgetCepOrigem();
    
    /**
     * True if has "cepOrigem" element
     */
    boolean isSetCepOrigem();
    
    /**
     * Sets the "cepOrigem" element
     */
    void setCepOrigem(java.lang.String cepOrigem);
    
    /**
     * Sets (as xml) the "cepOrigem" element
     */
    void xsetCepOrigem(org.apache.xmlbeans.XmlString cepOrigem);
    
    /**
     * Unsets the "cepOrigem" element
     */
    void unsetCepOrigem();
    
    /**
     * Gets the "cepDestino" element
     */
    java.lang.String getCepDestino();
    
    /**
     * Gets (as xml) the "cepDestino" element
     */
    org.apache.xmlbeans.XmlString xgetCepDestino();
    
    /**
     * True if has "cepDestino" element
     */
    boolean isSetCepDestino();
    
    /**
     * Sets the "cepDestino" element
     */
    void setCepDestino(java.lang.String cepDestino);
    
    /**
     * Sets (as xml) the "cepDestino" element
     */
    void xsetCepDestino(org.apache.xmlbeans.XmlString cepDestino);
    
    /**
     * Unsets the "cepDestino" element
     */
    void unsetCepDestino();
    
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
        public static br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico newInstance() {
          return (br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServico) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
