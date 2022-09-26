/*
 * An XML document type.
 * Localname: getBets
 * Namespace: http://services.soapworldcupbet.worldcupbet.com.br
 * Java type: br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.worldcupbet.soapworldcupbet.services;


/**
 * A document containing one getBets(@http://services.soapworldcupbet.worldcupbet.com.br) element.
 *
 * This is a complex type.
 */
public interface GetBetsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetBetsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8B1AE84E7770563FF5CB0C8208925841").resolveHandle("getbets8db9doctype");
    
    /**
     * Gets the "getBets" element
     */
    br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument.GetBets getGetBets();
    
    /**
     * Sets the "getBets" element
     */
    void setGetBets(br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument.GetBets getBets);
    
    /**
     * Appends and returns a new empty "getBets" element
     */
    br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument.GetBets addNewGetBets();
    
    /**
     * An XML getBets(@http://services.soapworldcupbet.worldcupbet.com.br).
     *
     * This is a complex type.
     */
    public interface GetBets extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetBets.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8B1AE84E7770563FF5CB0C8208925841").resolveHandle("getbets1d55elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument.GetBets newInstance() {
              return (br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument.GetBets) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument.GetBets newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument.GetBets) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument newInstance() {
          return (br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
