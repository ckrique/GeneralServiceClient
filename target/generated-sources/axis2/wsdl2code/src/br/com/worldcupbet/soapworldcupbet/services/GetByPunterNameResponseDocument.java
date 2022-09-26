/*
 * An XML document type.
 * Localname: getByPunterNameResponse
 * Namespace: http://services.soapworldcupbet.worldcupbet.com.br
 * Java type: br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.worldcupbet.soapworldcupbet.services;


/**
 * A document containing one getByPunterNameResponse(@http://services.soapworldcupbet.worldcupbet.com.br) element.
 *
 * This is a complex type.
 */
public interface GetByPunterNameResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetByPunterNameResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8B1AE84E7770563FF5CB0C8208925841").resolveHandle("getbypunternameresponse5fe0doctype");
    
    /**
     * Gets the "getByPunterNameResponse" element
     */
    br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument.GetByPunterNameResponse getGetByPunterNameResponse();
    
    /**
     * Sets the "getByPunterNameResponse" element
     */
    void setGetByPunterNameResponse(br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument.GetByPunterNameResponse getByPunterNameResponse);
    
    /**
     * Appends and returns a new empty "getByPunterNameResponse" element
     */
    br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument.GetByPunterNameResponse addNewGetByPunterNameResponse();
    
    /**
     * An XML getByPunterNameResponse(@http://services.soapworldcupbet.worldcupbet.com.br).
     *
     * This is a complex type.
     */
    public interface GetByPunterNameResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetByPunterNameResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8B1AE84E7770563FF5CB0C8208925841").resolveHandle("getbypunternameresponsef8e3elemtype");
        
        /**
         * Gets the "return" element
         */
        br.com.worldcupbet.soapworldcupbet.services.xsd.Bet getReturn();
        
        /**
         * Tests for nil "return" element
         */
        boolean isNilReturn();
        
        /**
         * True if has "return" element
         */
        boolean isSetReturn();
        
        /**
         * Sets the "return" element
         */
        void setReturn(br.com.worldcupbet.soapworldcupbet.services.xsd.Bet xreturn);
        
        /**
         * Appends and returns a new empty "return" element
         */
        br.com.worldcupbet.soapworldcupbet.services.xsd.Bet addNewReturn();
        
        /**
         * Nils the "return" element
         */
        void setNilReturn();
        
        /**
         * Unsets the "return" element
         */
        void unsetReturn();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument.GetByPunterNameResponse newInstance() {
              return (br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument.GetByPunterNameResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument.GetByPunterNameResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument.GetByPunterNameResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument newInstance() {
          return (br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
