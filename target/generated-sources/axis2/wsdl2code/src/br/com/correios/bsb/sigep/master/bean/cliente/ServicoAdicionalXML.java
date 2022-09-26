/*
 * XML Type:  servicoAdicionalXML
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente;


/**
 * An XML servicoAdicionalXML(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public interface ServicoAdicionalXML extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServicoAdicionalXML.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8AE111D981C96D520F862962551646CA").resolveHandle("servicoadicionalxmld452type");
    
    /**
     * Gets the "categoria" element
     */
    java.lang.String getCategoria();
    
    /**
     * Gets (as xml) the "categoria" element
     */
    org.apache.xmlbeans.XmlString xgetCategoria();
    
    /**
     * True if has "categoria" element
     */
    boolean isSetCategoria();
    
    /**
     * Sets the "categoria" element
     */
    void setCategoria(java.lang.String categoria);
    
    /**
     * Sets (as xml) the "categoria" element
     */
    void xsetCategoria(org.apache.xmlbeans.XmlString categoria);
    
    /**
     * Unsets the "categoria" element
     */
    void unsetCategoria();
    
    /**
     * Gets the "codigo" element
     */
    java.lang.String getCodigo();
    
    /**
     * Gets (as xml) the "codigo" element
     */
    org.apache.xmlbeans.XmlString xgetCodigo();
    
    /**
     * True if has "codigo" element
     */
    boolean isSetCodigo();
    
    /**
     * Sets the "codigo" element
     */
    void setCodigo(java.lang.String codigo);
    
    /**
     * Sets (as xml) the "codigo" element
     */
    void xsetCodigo(org.apache.xmlbeans.XmlString codigo);
    
    /**
     * Unsets the "codigo" element
     */
    void unsetCodigo();
    
    /**
     * Gets the "descricao" element
     */
    java.lang.String getDescricao();
    
    /**
     * Gets (as xml) the "descricao" element
     */
    org.apache.xmlbeans.XmlString xgetDescricao();
    
    /**
     * True if has "descricao" element
     */
    boolean isSetDescricao();
    
    /**
     * Sets the "descricao" element
     */
    void setDescricao(java.lang.String descricao);
    
    /**
     * Sets (as xml) the "descricao" element
     */
    void xsetDescricao(org.apache.xmlbeans.XmlString descricao);
    
    /**
     * Unsets the "descricao" element
     */
    void unsetDescricao();
    
    /**
     * Gets the "maximoValorDeclarado" element
     */
    double getMaximoValorDeclarado();
    
    /**
     * Gets (as xml) the "maximoValorDeclarado" element
     */
    org.apache.xmlbeans.XmlDouble xgetMaximoValorDeclarado();
    
    /**
     * True if has "maximoValorDeclarado" element
     */
    boolean isSetMaximoValorDeclarado();
    
    /**
     * Sets the "maximoValorDeclarado" element
     */
    void setMaximoValorDeclarado(double maximoValorDeclarado);
    
    /**
     * Sets (as xml) the "maximoValorDeclarado" element
     */
    void xsetMaximoValorDeclarado(org.apache.xmlbeans.XmlDouble maximoValorDeclarado);
    
    /**
     * Unsets the "maximoValorDeclarado" element
     */
    void unsetMaximoValorDeclarado();
    
    /**
     * Gets the "minimoValorDeclarado" element
     */
    double getMinimoValorDeclarado();
    
    /**
     * Gets (as xml) the "minimoValorDeclarado" element
     */
    org.apache.xmlbeans.XmlDouble xgetMinimoValorDeclarado();
    
    /**
     * True if has "minimoValorDeclarado" element
     */
    boolean isSetMinimoValorDeclarado();
    
    /**
     * Sets the "minimoValorDeclarado" element
     */
    void setMinimoValorDeclarado(double minimoValorDeclarado);
    
    /**
     * Sets (as xml) the "minimoValorDeclarado" element
     */
    void xsetMinimoValorDeclarado(org.apache.xmlbeans.XmlDouble minimoValorDeclarado);
    
    /**
     * Unsets the "minimoValorDeclarado" element
     */
    void unsetMinimoValorDeclarado();
    
    /**
     * Gets the "sigla" element
     */
    java.lang.String getSigla();
    
    /**
     * Gets (as xml) the "sigla" element
     */
    org.apache.xmlbeans.XmlString xgetSigla();
    
    /**
     * True if has "sigla" element
     */
    boolean isSetSigla();
    
    /**
     * Sets the "sigla" element
     */
    void setSigla(java.lang.String sigla);
    
    /**
     * Sets (as xml) the "sigla" element
     */
    void xsetSigla(org.apache.xmlbeans.XmlString sigla);
    
    /**
     * Unsets the "sigla" element
     */
    void unsetSigla();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML newInstance() {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
