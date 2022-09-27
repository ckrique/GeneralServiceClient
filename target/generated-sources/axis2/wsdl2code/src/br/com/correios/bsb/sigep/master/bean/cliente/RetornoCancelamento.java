/*
 * XML Type:  retornoCancelamento
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente;


/**
 * An XML retornoCancelamento(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public interface RetornoCancelamento extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RetornoCancelamento.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE691E6D0F7AD129CBDCC7B3C09AD22B2").resolveHandle("retornocancelamento6001type");
    
    /**
     * Gets the "cod_erro" element
     */
    java.lang.String getCodErro();
    
    /**
     * Gets (as xml) the "cod_erro" element
     */
    org.apache.xmlbeans.XmlString xgetCodErro();
    
    /**
     * True if has "cod_erro" element
     */
    boolean isSetCodErro();
    
    /**
     * Sets the "cod_erro" element
     */
    void setCodErro(java.lang.String codErro);
    
    /**
     * Sets (as xml) the "cod_erro" element
     */
    void xsetCodErro(org.apache.xmlbeans.XmlString codErro);
    
    /**
     * Unsets the "cod_erro" element
     */
    void unsetCodErro();
    
    /**
     * Gets the "codigo_administrativo" element
     */
    java.lang.String getCodigoAdministrativo();
    
    /**
     * Gets (as xml) the "codigo_administrativo" element
     */
    org.apache.xmlbeans.XmlString xgetCodigoAdministrativo();
    
    /**
     * True if has "codigo_administrativo" element
     */
    boolean isSetCodigoAdministrativo();
    
    /**
     * Sets the "codigo_administrativo" element
     */
    void setCodigoAdministrativo(java.lang.String codigoAdministrativo);
    
    /**
     * Sets (as xml) the "codigo_administrativo" element
     */
    void xsetCodigoAdministrativo(org.apache.xmlbeans.XmlString codigoAdministrativo);
    
    /**
     * Unsets the "codigo_administrativo" element
     */
    void unsetCodigoAdministrativo();
    
    /**
     * Gets the "data" element
     */
    java.lang.String getData();
    
    /**
     * Gets (as xml) the "data" element
     */
    org.apache.xmlbeans.XmlString xgetData();
    
    /**
     * True if has "data" element
     */
    boolean isSetData();
    
    /**
     * Sets the "data" element
     */
    void setData(java.lang.String data);
    
    /**
     * Sets (as xml) the "data" element
     */
    void xsetData(org.apache.xmlbeans.XmlString data);
    
    /**
     * Unsets the "data" element
     */
    void unsetData();
    
    /**
     * Gets the "hora" element
     */
    java.lang.String getHora();
    
    /**
     * Gets (as xml) the "hora" element
     */
    org.apache.xmlbeans.XmlString xgetHora();
    
    /**
     * True if has "hora" element
     */
    boolean isSetHora();
    
    /**
     * Sets the "hora" element
     */
    void setHora(java.lang.String hora);
    
    /**
     * Sets (as xml) the "hora" element
     */
    void xsetHora(org.apache.xmlbeans.XmlString hora);
    
    /**
     * Unsets the "hora" element
     */
    void unsetHora();
    
    /**
     * Gets the "msg_erro" element
     */
    java.lang.String getMsgErro();
    
    /**
     * Gets (as xml) the "msg_erro" element
     */
    org.apache.xmlbeans.XmlString xgetMsgErro();
    
    /**
     * True if has "msg_erro" element
     */
    boolean isSetMsgErro();
    
    /**
     * Sets the "msg_erro" element
     */
    void setMsgErro(java.lang.String msgErro);
    
    /**
     * Sets (as xml) the "msg_erro" element
     */
    void xsetMsgErro(org.apache.xmlbeans.XmlString msgErro);
    
    /**
     * Unsets the "msg_erro" element
     */
    void unsetMsgErro();
    
    /**
     * Gets the "objeto_postal" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ObjetoSimplificado getObjetoPostal();
    
    /**
     * True if has "objeto_postal" element
     */
    boolean isSetObjetoPostal();
    
    /**
     * Sets the "objeto_postal" element
     */
    void setObjetoPostal(br.com.correios.bsb.sigep.master.bean.cliente.ObjetoSimplificado objetoPostal);
    
    /**
     * Appends and returns a new empty "objeto_postal" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ObjetoSimplificado addNewObjetoPostal();
    
    /**
     * Unsets the "objeto_postal" element
     */
    void unsetObjetoPostal();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento newInstance() {
          return (br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
