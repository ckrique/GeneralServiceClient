/*
 * XML Type:  coletaSimultanea
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente;


/**
 * An XML coletaSimultanea(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public interface ColetaSimultanea extends br.com.correios.bsb.sigep.master.bean.cliente.Coleta
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ColetaSimultanea.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE691E6D0F7AD129CBDCC7B3C09AD22B2").resolveHandle("coletasimultaneae985type");
    
    /**
     * Gets the "obj" element
     */
    java.lang.String getObj();
    
    /**
     * Gets (as xml) the "obj" element
     */
    org.apache.xmlbeans.XmlString xgetObj();
    
    /**
     * True if has "obj" element
     */
    boolean isSetObj();
    
    /**
     * Sets the "obj" element
     */
    void setObj(java.lang.String obj);
    
    /**
     * Sets (as xml) the "obj" element
     */
    void xsetObj(org.apache.xmlbeans.XmlString obj);
    
    /**
     * Unsets the "obj" element
     */
    void unsetObj();
    
    /**
     * Gets the "obs" element
     */
    java.lang.String getObs();
    
    /**
     * Gets (as xml) the "obs" element
     */
    org.apache.xmlbeans.XmlString xgetObs();
    
    /**
     * True if has "obs" element
     */
    boolean isSetObs();
    
    /**
     * Sets the "obs" element
     */
    void setObs(java.lang.String obs);
    
    /**
     * Sets (as xml) the "obs" element
     */
    void xsetObs(org.apache.xmlbeans.XmlString obs);
    
    /**
     * Unsets the "obs" element
     */
    void unsetObs();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea newInstance() {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
