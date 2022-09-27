/*
 * XML Type:  enderecoERP
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente;


/**
 * An XML enderecoERP(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public interface EnderecoERP extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EnderecoERP.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE691E6D0F7AD129CBDCC7B3C09AD22B2").resolveHandle("enderecoerp83ectype");
    
    /**
     * Gets the "bairro" element
     */
    java.lang.String getBairro();
    
    /**
     * Gets (as xml) the "bairro" element
     */
    org.apache.xmlbeans.XmlString xgetBairro();
    
    /**
     * True if has "bairro" element
     */
    boolean isSetBairro();
    
    /**
     * Sets the "bairro" element
     */
    void setBairro(java.lang.String bairro);
    
    /**
     * Sets (as xml) the "bairro" element
     */
    void xsetBairro(org.apache.xmlbeans.XmlString bairro);
    
    /**
     * Unsets the "bairro" element
     */
    void unsetBairro();
    
    /**
     * Gets the "cep" element
     */
    java.lang.String getCep();
    
    /**
     * Gets (as xml) the "cep" element
     */
    org.apache.xmlbeans.XmlString xgetCep();
    
    /**
     * True if has "cep" element
     */
    boolean isSetCep();
    
    /**
     * Sets the "cep" element
     */
    void setCep(java.lang.String cep);
    
    /**
     * Sets (as xml) the "cep" element
     */
    void xsetCep(org.apache.xmlbeans.XmlString cep);
    
    /**
     * Unsets the "cep" element
     */
    void unsetCep();
    
    /**
     * Gets the "cidade" element
     */
    java.lang.String getCidade();
    
    /**
     * Gets (as xml) the "cidade" element
     */
    org.apache.xmlbeans.XmlString xgetCidade();
    
    /**
     * True if has "cidade" element
     */
    boolean isSetCidade();
    
    /**
     * Sets the "cidade" element
     */
    void setCidade(java.lang.String cidade);
    
    /**
     * Sets (as xml) the "cidade" element
     */
    void xsetCidade(org.apache.xmlbeans.XmlString cidade);
    
    /**
     * Unsets the "cidade" element
     */
    void unsetCidade();
    
    /**
     * Gets the "complemento2" element
     */
    java.lang.String getComplemento2();
    
    /**
     * Gets (as xml) the "complemento2" element
     */
    org.apache.xmlbeans.XmlString xgetComplemento2();
    
    /**
     * True if has "complemento2" element
     */
    boolean isSetComplemento2();
    
    /**
     * Sets the "complemento2" element
     */
    void setComplemento2(java.lang.String complemento2);
    
    /**
     * Sets (as xml) the "complemento2" element
     */
    void xsetComplemento2(org.apache.xmlbeans.XmlString complemento2);
    
    /**
     * Unsets the "complemento2" element
     */
    void unsetComplemento2();
    
    /**
     * Gets the "end" element
     */
    java.lang.String getEnd();
    
    /**
     * Gets (as xml) the "end" element
     */
    org.apache.xmlbeans.XmlString xgetEnd();
    
    /**
     * True if has "end" element
     */
    boolean isSetEnd();
    
    /**
     * Sets the "end" element
     */
    void setEnd(java.lang.String end);
    
    /**
     * Sets (as xml) the "end" element
     */
    void xsetEnd(org.apache.xmlbeans.XmlString end);
    
    /**
     * Unsets the "end" element
     */
    void unsetEnd();
    
    /**
     * Gets the "uf" element
     */
    java.lang.String getUf();
    
    /**
     * Gets (as xml) the "uf" element
     */
    org.apache.xmlbeans.XmlString xgetUf();
    
    /**
     * True if has "uf" element
     */
    boolean isSetUf();
    
    /**
     * Sets the "uf" element
     */
    void setUf(java.lang.String uf);
    
    /**
     * Sets (as xml) the "uf" element
     */
    void xsetUf(org.apache.xmlbeans.XmlString uf);
    
    /**
     * Unsets the "uf" element
     */
    void unsetUf();
    
    /**
     * Gets array of all "unidadesPostagem" elements
     */
    br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP[] getUnidadesPostagemArray();
    
    /**
     * Gets ith "unidadesPostagem" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP getUnidadesPostagemArray(int i);
    
    /**
     * Tests for nil ith "unidadesPostagem" element
     */
    boolean isNilUnidadesPostagemArray(int i);
    
    /**
     * Returns number of "unidadesPostagem" element
     */
    int sizeOfUnidadesPostagemArray();
    
    /**
     * Sets array of all "unidadesPostagem" element
     */
    void setUnidadesPostagemArray(br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP[] unidadesPostagemArray);
    
    /**
     * Sets ith "unidadesPostagem" element
     */
    void setUnidadesPostagemArray(int i, br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP unidadesPostagem);
    
    /**
     * Nils the ith "unidadesPostagem" element
     */
    void setNilUnidadesPostagemArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "unidadesPostagem" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP insertNewUnidadesPostagem(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "unidadesPostagem" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP addNewUnidadesPostagem();
    
    /**
     * Removes the ith "unidadesPostagem" element
     */
    void removeUnidadesPostagem(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP newInstance() {
          return (br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
