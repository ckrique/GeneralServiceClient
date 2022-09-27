/*
 * XML Type:  preListaPostagem
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente;


/**
 * An XML preListaPostagem(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public interface PreListaPostagem extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PreListaPostagem.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE691E6D0F7AD129CBDCC7B3C09AD22B2").resolveHandle("prelistapostagem5fb2type");
    
    /**
     * Gets the "cartaoPostagem" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP getCartaoPostagem();
    
    /**
     * True if has "cartaoPostagem" element
     */
    boolean isSetCartaoPostagem();
    
    /**
     * Sets the "cartaoPostagem" element
     */
    void setCartaoPostagem(br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP cartaoPostagem);
    
    /**
     * Appends and returns a new empty "cartaoPostagem" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP addNewCartaoPostagem();
    
    /**
     * Unsets the "cartaoPostagem" element
     */
    void unsetCartaoPostagem();
    
    /**
     * Gets the "conteudoProibido" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.SimNao.Enum getConteudoProibido();
    
    /**
     * Gets (as xml) the "conteudoProibido" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.SimNao xgetConteudoProibido();
    
    /**
     * True if has "conteudoProibido" element
     */
    boolean isSetConteudoProibido();
    
    /**
     * Sets the "conteudoProibido" element
     */
    void setConteudoProibido(br.com.correios.bsb.sigep.master.bean.cliente.SimNao.Enum conteudoProibido);
    
    /**
     * Sets (as xml) the "conteudoProibido" element
     */
    void xsetConteudoProibido(br.com.correios.bsb.sigep.master.bean.cliente.SimNao conteudoProibido);
    
    /**
     * Unsets the "conteudoProibido" element
     */
    void unsetConteudoProibido();
    
    /**
     * Gets the "dataAtualizacaoCliente" element
     */
    java.util.Calendar getDataAtualizacaoCliente();
    
    /**
     * Gets (as xml) the "dataAtualizacaoCliente" element
     */
    org.apache.xmlbeans.XmlDateTime xgetDataAtualizacaoCliente();
    
    /**
     * True if has "dataAtualizacaoCliente" element
     */
    boolean isSetDataAtualizacaoCliente();
    
    /**
     * Sets the "dataAtualizacaoCliente" element
     */
    void setDataAtualizacaoCliente(java.util.Calendar dataAtualizacaoCliente);
    
    /**
     * Sets (as xml) the "dataAtualizacaoCliente" element
     */
    void xsetDataAtualizacaoCliente(org.apache.xmlbeans.XmlDateTime dataAtualizacaoCliente);
    
    /**
     * Unsets the "dataAtualizacaoCliente" element
     */
    void unsetDataAtualizacaoCliente();
    
    /**
     * Gets the "dataAtualizacaoSara" element
     */
    java.util.Calendar getDataAtualizacaoSara();
    
    /**
     * Gets (as xml) the "dataAtualizacaoSara" element
     */
    org.apache.xmlbeans.XmlDateTime xgetDataAtualizacaoSara();
    
    /**
     * True if has "dataAtualizacaoSara" element
     */
    boolean isSetDataAtualizacaoSara();
    
    /**
     * Sets the "dataAtualizacaoSara" element
     */
    void setDataAtualizacaoSara(java.util.Calendar dataAtualizacaoSara);
    
    /**
     * Sets (as xml) the "dataAtualizacaoSara" element
     */
    void xsetDataAtualizacaoSara(org.apache.xmlbeans.XmlDateTime dataAtualizacaoSara);
    
    /**
     * Unsets the "dataAtualizacaoSara" element
     */
    void unsetDataAtualizacaoSara();
    
    /**
     * Gets the "dataFechamento" element
     */
    java.util.Calendar getDataFechamento();
    
    /**
     * Gets (as xml) the "dataFechamento" element
     */
    org.apache.xmlbeans.XmlDateTime xgetDataFechamento();
    
    /**
     * True if has "dataFechamento" element
     */
    boolean isSetDataFechamento();
    
    /**
     * Sets the "dataFechamento" element
     */
    void setDataFechamento(java.util.Calendar dataFechamento);
    
    /**
     * Sets (as xml) the "dataFechamento" element
     */
    void xsetDataFechamento(org.apache.xmlbeans.XmlDateTime dataFechamento);
    
    /**
     * Unsets the "dataFechamento" element
     */
    void unsetDataFechamento();
    
    /**
     * Gets the "dataPostagem" element
     */
    java.util.Calendar getDataPostagem();
    
    /**
     * Gets (as xml) the "dataPostagem" element
     */
    org.apache.xmlbeans.XmlDateTime xgetDataPostagem();
    
    /**
     * True if has "dataPostagem" element
     */
    boolean isSetDataPostagem();
    
    /**
     * Sets the "dataPostagem" element
     */
    void setDataPostagem(java.util.Calendar dataPostagem);
    
    /**
     * Sets (as xml) the "dataPostagem" element
     */
    void xsetDataPostagem(org.apache.xmlbeans.XmlDateTime dataPostagem);
    
    /**
     * Unsets the "dataPostagem" element
     */
    void unsetDataPostagem();
    
    /**
     * Gets the "dataPostagemSara" element
     */
    java.util.Calendar getDataPostagemSara();
    
    /**
     * Gets (as xml) the "dataPostagemSara" element
     */
    org.apache.xmlbeans.XmlDateTime xgetDataPostagemSara();
    
    /**
     * True if has "dataPostagemSara" element
     */
    boolean isSetDataPostagemSara();
    
    /**
     * Sets the "dataPostagemSara" element
     */
    void setDataPostagemSara(java.util.Calendar dataPostagemSara);
    
    /**
     * Sets (as xml) the "dataPostagemSara" element
     */
    void xsetDataPostagemSara(org.apache.xmlbeans.XmlDateTime dataPostagemSara);
    
    /**
     * Unsets the "dataPostagemSara" element
     */
    void unsetDataPostagemSara();
    
    /**
     * Gets array of all "objetosPostais" elements
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal[] getObjetosPostaisArray();
    
    /**
     * Gets ith "objetosPostais" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal getObjetosPostaisArray(int i);
    
    /**
     * Tests for nil ith "objetosPostais" element
     */
    boolean isNilObjetosPostaisArray(int i);
    
    /**
     * Returns number of "objetosPostais" element
     */
    int sizeOfObjetosPostaisArray();
    
    /**
     * Sets array of all "objetosPostais" element
     */
    void setObjetosPostaisArray(br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal[] objetosPostaisArray);
    
    /**
     * Sets ith "objetosPostais" element
     */
    void setObjetosPostaisArray(int i, br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal objetosPostais);
    
    /**
     * Nils the ith "objetosPostais" element
     */
    void setNilObjetosPostaisArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "objetosPostais" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal insertNewObjetosPostais(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "objetosPostais" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal addNewObjetosPostais();
    
    /**
     * Removes the ith "objetosPostais" element
     */
    void removeObjetosPostais(int i);
    
    /**
     * Gets the "plpCliente" element
     */
    long getPlpCliente();
    
    /**
     * Gets (as xml) the "plpCliente" element
     */
    org.apache.xmlbeans.XmlLong xgetPlpCliente();
    
    /**
     * Sets the "plpCliente" element
     */
    void setPlpCliente(long plpCliente);
    
    /**
     * Sets (as xml) the "plpCliente" element
     */
    void xsetPlpCliente(org.apache.xmlbeans.XmlLong plpCliente);
    
    /**
     * Gets the "plpNu" element
     */
    long getPlpNu();
    
    /**
     * Gets (as xml) the "plpNu" element
     */
    org.apache.xmlbeans.XmlLong xgetPlpNu();
    
    /**
     * Sets the "plpNu" element
     */
    void setPlpNu(long plpNu);
    
    /**
     * Sets (as xml) the "plpNu" element
     */
    void xsetPlpNu(org.apache.xmlbeans.XmlLong plpNu);
    
    /**
     * Gets array of all "plpXml" elements
     */
    int[] getPlpXmlArray();
    
    /**
     * Gets ith "plpXml" element
     */
    int getPlpXmlArray(int i);
    
    /**
     * Gets (as xml) array of all "plpXml" elements
     */
    org.apache.xmlbeans.XmlUnsignedShort[] xgetPlpXmlArray();
    
    /**
     * Gets (as xml) ith "plpXml" element
     */
    org.apache.xmlbeans.XmlUnsignedShort xgetPlpXmlArray(int i);
    
    /**
     * Tests for nil ith "plpXml" element
     */
    boolean isNilPlpXmlArray(int i);
    
    /**
     * Returns number of "plpXml" element
     */
    int sizeOfPlpXmlArray();
    
    /**
     * Sets array of all "plpXml" element
     */
    void setPlpXmlArray(int[] plpXmlArray);
    
    /**
     * Sets ith "plpXml" element
     */
    void setPlpXmlArray(int i, int plpXml);
    
    /**
     * Sets (as xml) array of all "plpXml" element
     */
    void xsetPlpXmlArray(org.apache.xmlbeans.XmlUnsignedShort[] plpXmlArray);
    
    /**
     * Sets (as xml) ith "plpXml" element
     */
    void xsetPlpXmlArray(int i, org.apache.xmlbeans.XmlUnsignedShort plpXml);
    
    /**
     * Nils the ith "plpXml" element
     */
    void setNilPlpXmlArray(int i);
    
    /**
     * Inserts the value as the ith "plpXml" element
     */
    void insertPlpXml(int i, int plpXml);
    
    /**
     * Appends the value as the last "plpXml" element
     */
    void addPlpXml(int plpXml);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "plpXml" element
     */
    org.apache.xmlbeans.XmlUnsignedShort insertNewPlpXml(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "plpXml" element
     */
    org.apache.xmlbeans.XmlUnsignedShort addNewPlpXml();
    
    /**
     * Removes the ith "plpXml" element
     */
    void removePlpXml(int i);
    
    /**
     * Gets array of all "plpXmlRetorno" elements
     */
    int[] getPlpXmlRetornoArray();
    
    /**
     * Gets ith "plpXmlRetorno" element
     */
    int getPlpXmlRetornoArray(int i);
    
    /**
     * Gets (as xml) array of all "plpXmlRetorno" elements
     */
    org.apache.xmlbeans.XmlUnsignedShort[] xgetPlpXmlRetornoArray();
    
    /**
     * Gets (as xml) ith "plpXmlRetorno" element
     */
    org.apache.xmlbeans.XmlUnsignedShort xgetPlpXmlRetornoArray(int i);
    
    /**
     * Tests for nil ith "plpXmlRetorno" element
     */
    boolean isNilPlpXmlRetornoArray(int i);
    
    /**
     * Returns number of "plpXmlRetorno" element
     */
    int sizeOfPlpXmlRetornoArray();
    
    /**
     * Sets array of all "plpXmlRetorno" element
     */
    void setPlpXmlRetornoArray(int[] plpXmlRetornoArray);
    
    /**
     * Sets ith "plpXmlRetorno" element
     */
    void setPlpXmlRetornoArray(int i, int plpXmlRetorno);
    
    /**
     * Sets (as xml) array of all "plpXmlRetorno" element
     */
    void xsetPlpXmlRetornoArray(org.apache.xmlbeans.XmlUnsignedShort[] plpXmlRetornoArray);
    
    /**
     * Sets (as xml) ith "plpXmlRetorno" element
     */
    void xsetPlpXmlRetornoArray(int i, org.apache.xmlbeans.XmlUnsignedShort plpXmlRetorno);
    
    /**
     * Nils the ith "plpXmlRetorno" element
     */
    void setNilPlpXmlRetornoArray(int i);
    
    /**
     * Inserts the value as the ith "plpXmlRetorno" element
     */
    void insertPlpXmlRetorno(int i, int plpXmlRetorno);
    
    /**
     * Appends the value as the last "plpXmlRetorno" element
     */
    void addPlpXmlRetorno(int plpXmlRetorno);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "plpXmlRetorno" element
     */
    org.apache.xmlbeans.XmlUnsignedShort insertNewPlpXmlRetorno(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "plpXmlRetorno" element
     */
    org.apache.xmlbeans.XmlUnsignedShort addNewPlpXmlRetorno();
    
    /**
     * Removes the ith "plpXmlRetorno" element
     */
    void removePlpXmlRetorno(int i);
    
    /**
     * Gets the "status" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.StatusPlp.Enum getStatus();
    
    /**
     * Gets (as xml) the "status" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.StatusPlp xgetStatus();
    
    /**
     * True if has "status" element
     */
    boolean isSetStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(br.com.correios.bsb.sigep.master.bean.cliente.StatusPlp.Enum status);
    
    /**
     * Sets (as xml) the "status" element
     */
    void xsetStatus(br.com.correios.bsb.sigep.master.bean.cliente.StatusPlp status);
    
    /**
     * Unsets the "status" element
     */
    void unsetStatus();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem newInstance() {
          return (br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
