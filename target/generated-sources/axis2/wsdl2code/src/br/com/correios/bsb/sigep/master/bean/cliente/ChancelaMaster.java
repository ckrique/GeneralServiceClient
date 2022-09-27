/*
 * XML Type:  chancelaMaster
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente;


/**
 * An XML chancelaMaster(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public interface ChancelaMaster extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ChancelaMaster.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE691E6D0F7AD129CBDCC7B3C09AD22B2").resolveHandle("chancelamaster9aeftype");
    
    /**
     * Gets the "ativo" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.SimNao.Enum getAtivo();
    
    /**
     * Gets (as xml) the "ativo" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.SimNao xgetAtivo();
    
    /**
     * True if has "ativo" element
     */
    boolean isSetAtivo();
    
    /**
     * Sets the "ativo" element
     */
    void setAtivo(br.com.correios.bsb.sigep.master.bean.cliente.SimNao.Enum ativo);
    
    /**
     * Sets (as xml) the "ativo" element
     */
    void xsetAtivo(br.com.correios.bsb.sigep.master.bean.cliente.SimNao ativo);
    
    /**
     * Unsets the "ativo" element
     */
    void unsetAtivo();
    
    /**
     * Gets the "chancela" element
     */
    byte[] getChancela();
    
    /**
     * Gets (as xml) the "chancela" element
     */
    org.apache.xmlbeans.XmlBase64Binary xgetChancela();
    
    /**
     * True if has "chancela" element
     */
    boolean isSetChancela();
    
    /**
     * Sets the "chancela" element
     */
    void setChancela(byte[] chancela);
    
    /**
     * Sets (as xml) the "chancela" element
     */
    void xsetChancela(org.apache.xmlbeans.XmlBase64Binary chancela);
    
    /**
     * Unsets the "chancela" element
     */
    void unsetChancela();
    
    /**
     * Gets the "dataAtualizacao" element
     */
    java.util.Calendar getDataAtualizacao();
    
    /**
     * Gets (as xml) the "dataAtualizacao" element
     */
    org.apache.xmlbeans.XmlDateTime xgetDataAtualizacao();
    
    /**
     * True if has "dataAtualizacao" element
     */
    boolean isSetDataAtualizacao();
    
    /**
     * Sets the "dataAtualizacao" element
     */
    void setDataAtualizacao(java.util.Calendar dataAtualizacao);
    
    /**
     * Sets (as xml) the "dataAtualizacao" element
     */
    void xsetDataAtualizacao(org.apache.xmlbeans.XmlDateTime dataAtualizacao);
    
    /**
     * Unsets the "dataAtualizacao" element
     */
    void unsetDataAtualizacao();
    
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
     * Gets the "id" element
     */
    long getId();
    
    /**
     * Gets (as xml) the "id" element
     */
    org.apache.xmlbeans.XmlLong xgetId();
    
    /**
     * True if has "id" element
     */
    boolean isSetId();
    
    /**
     * Sets the "id" element
     */
    void setId(long id);
    
    /**
     * Sets (as xml) the "id" element
     */
    void xsetId(org.apache.xmlbeans.XmlLong id);
    
    /**
     * Unsets the "id" element
     */
    void unsetId();
    
    /**
     * Gets array of all "servicosSigep" elements
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep[] getServicosSigepArray();
    
    /**
     * Gets ith "servicosSigep" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep getServicosSigepArray(int i);
    
    /**
     * Tests for nil ith "servicosSigep" element
     */
    boolean isNilServicosSigepArray(int i);
    
    /**
     * Returns number of "servicosSigep" element
     */
    int sizeOfServicosSigepArray();
    
    /**
     * Sets array of all "servicosSigep" element
     */
    void setServicosSigepArray(br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep[] servicosSigepArray);
    
    /**
     * Sets ith "servicosSigep" element
     */
    void setServicosSigepArray(int i, br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep servicosSigep);
    
    /**
     * Nils the ith "servicosSigep" element
     */
    void setNilServicosSigepArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "servicosSigep" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep insertNewServicosSigep(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "servicosSigep" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep addNewServicosSigep();
    
    /**
     * Removes the ith "servicosSigep" element
     */
    void removeServicosSigep(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster newInstance() {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
