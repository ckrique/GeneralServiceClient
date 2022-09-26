/*
 * XML Type:  pesquisarEmbalagensPorServicoResponse
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente;


/**
 * An XML pesquisarEmbalagensPorServicoResponse(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public interface PesquisarEmbalagensPorServicoResponse extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PesquisarEmbalagensPorServicoResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8AE111D981C96D520F862962551646CA").resolveHandle("pesquisarembalagensporservicoresponse0ebbtype");
    
    /**
     * Gets array of all "return" elements
     */
    br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem.Enum[] getReturnArray();
    
    /**
     * Gets ith "return" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem.Enum getReturnArray(int i);
    
    /**
     * Gets (as xml) array of all "return" elements
     */
    br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem[] xgetReturnArray();
    
    /**
     * Gets (as xml) ith "return" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem xgetReturnArray(int i);
    
    /**
     * Returns number of "return" element
     */
    int sizeOfReturnArray();
    
    /**
     * Sets array of all "return" element
     */
    void setReturnArray(br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem.Enum[] xreturnArray);
    
    /**
     * Sets ith "return" element
     */
    void setReturnArray(int i, br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem.Enum xreturn);
    
    /**
     * Sets (as xml) array of all "return" element
     */
    void xsetReturnArray(br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem[] xreturnArray);
    
    /**
     * Sets (as xml) ith "return" element
     */
    void xsetReturnArray(int i, br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem xreturn);
    
    /**
     * Inserts the value as the ith "return" element
     */
    void insertReturn(int i, br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem.Enum xreturn);
    
    /**
     * Appends the value as the last "return" element
     */
    void addReturn(br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem.Enum xreturn);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "return" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem insertNewReturn(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "return" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem addNewReturn();
    
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
        public static br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse newInstance() {
          return (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}