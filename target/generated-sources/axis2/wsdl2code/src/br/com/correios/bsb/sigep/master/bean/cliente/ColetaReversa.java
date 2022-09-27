/*
 * XML Type:  coletaReversa
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente;


/**
 * An XML coletaReversa(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public interface ColetaReversa extends br.com.correios.bsb.sigep.master.bean.cliente.Coleta
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ColetaReversa.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE691E6D0F7AD129CBDCC7B3C09AD22B2").resolveHandle("coletareversa663etype");
    
    /**
     * Gets the "ag" element
     */
    java.lang.String getAg();
    
    /**
     * Gets (as xml) the "ag" element
     */
    org.apache.xmlbeans.XmlString xgetAg();
    
    /**
     * True if has "ag" element
     */
    boolean isSetAg();
    
    /**
     * Sets the "ag" element
     */
    void setAg(java.lang.String ag);
    
    /**
     * Sets (as xml) the "ag" element
     */
    void xsetAg(org.apache.xmlbeans.XmlString ag);
    
    /**
     * Unsets the "ag" element
     */
    void unsetAg();
    
    /**
     * Gets the "ar" element
     */
    int getAr();
    
    /**
     * Gets (as xml) the "ar" element
     */
    org.apache.xmlbeans.XmlInt xgetAr();
    
    /**
     * True if has "ar" element
     */
    boolean isSetAr();
    
    /**
     * Sets the "ar" element
     */
    void setAr(int ar);
    
    /**
     * Sets (as xml) the "ar" element
     */
    void xsetAr(org.apache.xmlbeans.XmlInt ar);
    
    /**
     * Unsets the "ar" element
     */
    void unsetAr();
    
    /**
     * Gets the "cartao" element
     */
    java.lang.String getCartao();
    
    /**
     * Gets (as xml) the "cartao" element
     */
    org.apache.xmlbeans.XmlString xgetCartao();
    
    /**
     * True if has "cartao" element
     */
    boolean isSetCartao();
    
    /**
     * Sets the "cartao" element
     */
    void setCartao(java.lang.String cartao);
    
    /**
     * Sets (as xml) the "cartao" element
     */
    void xsetCartao(org.apache.xmlbeans.XmlString cartao);
    
    /**
     * Unsets the "cartao" element
     */
    void unsetCartao();
    
    /**
     * Gets the "numero" element
     */
    int getNumero();
    
    /**
     * Gets (as xml) the "numero" element
     */
    org.apache.xmlbeans.XmlInt xgetNumero();
    
    /**
     * True if has "numero" element
     */
    boolean isSetNumero();
    
    /**
     * Sets the "numero" element
     */
    void setNumero(int numero);
    
    /**
     * Sets (as xml) the "numero" element
     */
    void xsetNumero(org.apache.xmlbeans.XmlInt numero);
    
    /**
     * Unsets the "numero" element
     */
    void unsetNumero();
    
    /**
     * Gets array of all "obj_col" elements
     */
    br.com.correios.bsb.sigep.master.bean.cliente.Objeto[] getObjColArray();
    
    /**
     * Gets ith "obj_col" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.Objeto getObjColArray(int i);
    
    /**
     * Tests for nil ith "obj_col" element
     */
    boolean isNilObjColArray(int i);
    
    /**
     * Returns number of "obj_col" element
     */
    int sizeOfObjColArray();
    
    /**
     * Sets array of all "obj_col" element
     */
    void setObjColArray(br.com.correios.bsb.sigep.master.bean.cliente.Objeto[] objColArray);
    
    /**
     * Sets ith "obj_col" element
     */
    void setObjColArray(int i, br.com.correios.bsb.sigep.master.bean.cliente.Objeto objCol);
    
    /**
     * Nils the ith "obj_col" element
     */
    void setNilObjColArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "obj_col" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.Objeto insertNewObjCol(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "obj_col" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.Objeto addNewObjCol();
    
    /**
     * Removes the ith "obj_col" element
     */
    void removeObjCol(int i);
    
    /**
     * Gets the "servico_adicional" element
     */
    java.lang.String getServicoAdicional();
    
    /**
     * Gets (as xml) the "servico_adicional" element
     */
    org.apache.xmlbeans.XmlString xgetServicoAdicional();
    
    /**
     * True if has "servico_adicional" element
     */
    boolean isSetServicoAdicional();
    
    /**
     * Sets the "servico_adicional" element
     */
    void setServicoAdicional(java.lang.String servicoAdicional);
    
    /**
     * Sets (as xml) the "servico_adicional" element
     */
    void xsetServicoAdicional(org.apache.xmlbeans.XmlString servicoAdicional);
    
    /**
     * Unsets the "servico_adicional" element
     */
    void unsetServicoAdicional();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa newInstance() {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
