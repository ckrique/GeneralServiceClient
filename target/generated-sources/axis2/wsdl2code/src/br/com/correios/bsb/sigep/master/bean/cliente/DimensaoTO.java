/*
 * XML Type:  dimensaoTO
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente;


/**
 * An XML dimensaoTO(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public interface DimensaoTO extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DimensaoTO.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE691E6D0F7AD129CBDCC7B3C09AD22B2").resolveHandle("dimensaotoa18ftype");
    
    /**
     * Gets the "altura" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO getAltura();
    
    /**
     * True if has "altura" element
     */
    boolean isSetAltura();
    
    /**
     * Sets the "altura" element
     */
    void setAltura(br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO altura);
    
    /**
     * Appends and returns a new empty "altura" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO addNewAltura();
    
    /**
     * Unsets the "altura" element
     */
    void unsetAltura();
    
    /**
     * Gets the "comprimento" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO getComprimento();
    
    /**
     * True if has "comprimento" element
     */
    boolean isSetComprimento();
    
    /**
     * Sets the "comprimento" element
     */
    void setComprimento(br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO comprimento);
    
    /**
     * Appends and returns a new empty "comprimento" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO addNewComprimento();
    
    /**
     * Unsets the "comprimento" element
     */
    void unsetComprimento();
    
    /**
     * Gets the "diametro" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO getDiametro();
    
    /**
     * True if has "diametro" element
     */
    boolean isSetDiametro();
    
    /**
     * Sets the "diametro" element
     */
    void setDiametro(br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO diametro);
    
    /**
     * Appends and returns a new empty "diametro" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO addNewDiametro();
    
    /**
     * Unsets the "diametro" element
     */
    void unsetDiametro();
    
    /**
     * Gets the "largura" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO getLargura();
    
    /**
     * True if has "largura" element
     */
    boolean isSetLargura();
    
    /**
     * Sets the "largura" element
     */
    void setLargura(br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO largura);
    
    /**
     * Appends and returns a new empty "largura" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO addNewLargura();
    
    /**
     * Unsets the "largura" element
     */
    void unsetLargura();
    
    /**
     * Gets the "peso" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO getPeso();
    
    /**
     * True if has "peso" element
     */
    boolean isSetPeso();
    
    /**
     * Sets the "peso" element
     */
    void setPeso(br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO peso);
    
    /**
     * Appends and returns a new empty "peso" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO addNewPeso();
    
    /**
     * Unsets the "peso" element
     */
    void unsetPeso();
    
    /**
     * Gets the "soma" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO getSoma();
    
    /**
     * True if has "soma" element
     */
    boolean isSetSoma();
    
    /**
     * Sets the "soma" element
     */
    void setSoma(br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO soma);
    
    /**
     * Appends and returns a new empty "soma" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO addNewSoma();
    
    /**
     * Unsets the "soma" element
     */
    void unsetSoma();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO newInstance() {
          return (br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
