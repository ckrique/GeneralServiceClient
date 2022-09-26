/*
 * An XML document type.
 * Localname: getBetsResponse
 * Namespace: http://services.soapworldcupbet.worldcupbet.com.br
 * Java type: br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.worldcupbet.soapworldcupbet.services;


/**
 * A document containing one getBetsResponse(@http://services.soapworldcupbet.worldcupbet.com.br) element.
 *
 * This is a complex type.
 */
public interface GetBetsResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetBetsResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8B1AE84E7770563FF5CB0C8208925841").resolveHandle("getbetsresponse42b8doctype");
    
    /**
     * Gets the "getBetsResponse" element
     */
    br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument.GetBetsResponse getGetBetsResponse();
    
    /**
     * Sets the "getBetsResponse" element
     */
    void setGetBetsResponse(br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument.GetBetsResponse getBetsResponse);
    
    /**
     * Appends and returns a new empty "getBetsResponse" element
     */
    br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument.GetBetsResponse addNewGetBetsResponse();
    
    /**
     * An XML getBetsResponse(@http://services.soapworldcupbet.worldcupbet.com.br).
     *
     * This is a complex type.
     */
    public interface GetBetsResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetBetsResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8B1AE84E7770563FF5CB0C8208925841").resolveHandle("getbetsresponse7a93elemtype");
        
        /**
         * Gets array of all "return" elements
         */
        br.com.worldcupbet.soapworldcupbet.services.xsd.Bet[] getReturnArray();
        
        /**
         * Gets ith "return" element
         */
        br.com.worldcupbet.soapworldcupbet.services.xsd.Bet getReturnArray(int i);
        
        /**
         * Tests for nil ith "return" element
         */
        boolean isNilReturnArray(int i);
        
        /**
         * Returns number of "return" element
         */
        int sizeOfReturnArray();
        
        /**
         * Sets array of all "return" element
         */
        void setReturnArray(br.com.worldcupbet.soapworldcupbet.services.xsd.Bet[] xreturnArray);
        
        /**
         * Sets ith "return" element
         */
        void setReturnArray(int i, br.com.worldcupbet.soapworldcupbet.services.xsd.Bet xreturn);
        
        /**
         * Nils the ith "return" element
         */
        void setNilReturnArray(int i);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "return" element
         */
        br.com.worldcupbet.soapworldcupbet.services.xsd.Bet insertNewReturn(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "return" element
         */
        br.com.worldcupbet.soapworldcupbet.services.xsd.Bet addNewReturn();
        
        /**
         * Removes the ith "return" element
         */
        void removeReturn(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument.GetBetsResponse newInstance() {
              return (br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument.GetBetsResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument.GetBetsResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument.GetBetsResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument newInstance() {
          return (br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
