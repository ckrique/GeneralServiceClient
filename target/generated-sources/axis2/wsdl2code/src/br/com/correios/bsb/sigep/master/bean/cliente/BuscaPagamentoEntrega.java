/*
 * XML Type:  buscaPagamentoEntrega
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente;


/**
 * An XML buscaPagamentoEntrega(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public interface BuscaPagamentoEntrega extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BuscaPagamentoEntrega.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE691E6D0F7AD129CBDCC7B3C09AD22B2").resolveHandle("buscapagamentoentregaa082type");
    
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
     * Gets the "contrato" element
     */
    java.lang.String getContrato();
    
    /**
     * Gets (as xml) the "contrato" element
     */
    org.apache.xmlbeans.XmlString xgetContrato();
    
    /**
     * True if has "contrato" element
     */
    boolean isSetContrato();
    
    /**
     * Sets the "contrato" element
     */
    void setContrato(java.lang.String contrato);
    
    /**
     * Sets (as xml) the "contrato" element
     */
    void xsetContrato(org.apache.xmlbeans.XmlString contrato);
    
    /**
     * Unsets the "contrato" element
     */
    void unsetContrato();
    
    /**
     * Gets the "dataInicio" element
     */
    java.lang.String getDataInicio();
    
    /**
     * Gets (as xml) the "dataInicio" element
     */
    org.apache.xmlbeans.XmlString xgetDataInicio();
    
    /**
     * True if has "dataInicio" element
     */
    boolean isSetDataInicio();
    
    /**
     * Sets the "dataInicio" element
     */
    void setDataInicio(java.lang.String dataInicio);
    
    /**
     * Sets (as xml) the "dataInicio" element
     */
    void xsetDataInicio(org.apache.xmlbeans.XmlString dataInicio);
    
    /**
     * Unsets the "dataInicio" element
     */
    void unsetDataInicio();
    
    /**
     * Gets the "dataFim" element
     */
    java.lang.String getDataFim();
    
    /**
     * Gets (as xml) the "dataFim" element
     */
    org.apache.xmlbeans.XmlString xgetDataFim();
    
    /**
     * True if has "dataFim" element
     */
    boolean isSetDataFim();
    
    /**
     * Sets the "dataFim" element
     */
    void setDataFim(java.lang.String dataFim);
    
    /**
     * Sets (as xml) the "dataFim" element
     */
    void xsetDataFim(org.apache.xmlbeans.XmlString dataFim);
    
    /**
     * Unsets the "dataFim" element
     */
    void unsetDataFim();
    
    /**
     * Gets the "etiqueta" element
     */
    java.lang.String getEtiqueta();
    
    /**
     * Gets (as xml) the "etiqueta" element
     */
    org.apache.xmlbeans.XmlString xgetEtiqueta();
    
    /**
     * True if has "etiqueta" element
     */
    boolean isSetEtiqueta();
    
    /**
     * Sets the "etiqueta" element
     */
    void setEtiqueta(java.lang.String etiqueta);
    
    /**
     * Sets (as xml) the "etiqueta" element
     */
    void xsetEtiqueta(org.apache.xmlbeans.XmlString etiqueta);
    
    /**
     * Unsets the "etiqueta" element
     */
    void unsetEtiqueta();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega newInstance() {
          return (br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntrega) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
