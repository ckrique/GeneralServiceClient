/*
 * XML Type:  clienteERP
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente;


/**
 * An XML clienteERP(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public interface ClienteERP extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ClienteERP.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE691E6D0F7AD129CBDCC7B3C09AD22B2").resolveHandle("clienteerpca8dtype");
    
    /**
     * Gets the "cnpj" element
     */
    java.lang.String getCnpj();
    
    /**
     * Gets (as xml) the "cnpj" element
     */
    org.apache.xmlbeans.XmlString xgetCnpj();
    
    /**
     * True if has "cnpj" element
     */
    boolean isSetCnpj();
    
    /**
     * Sets the "cnpj" element
     */
    void setCnpj(java.lang.String cnpj);
    
    /**
     * Sets (as xml) the "cnpj" element
     */
    void xsetCnpj(org.apache.xmlbeans.XmlString cnpj);
    
    /**
     * Unsets the "cnpj" element
     */
    void unsetCnpj();
    
    /**
     * Gets array of all "contratos" elements
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP[] getContratosArray();
    
    /**
     * Gets ith "contratos" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP getContratosArray(int i);
    
    /**
     * Tests for nil ith "contratos" element
     */
    boolean isNilContratosArray(int i);
    
    /**
     * Returns number of "contratos" element
     */
    int sizeOfContratosArray();
    
    /**
     * Sets array of all "contratos" element
     */
    void setContratosArray(br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP[] contratosArray);
    
    /**
     * Sets ith "contratos" element
     */
    void setContratosArray(int i, br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP contratos);
    
    /**
     * Nils the ith "contratos" element
     */
    void setNilContratosArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "contratos" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP insertNewContratos(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "contratos" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP addNewContratos();
    
    /**
     * Removes the ith "contratos" element
     */
    void removeContratos(int i);
    
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
     * Gets the "datajAtualizacao" element
     */
    int getDatajAtualizacao();
    
    /**
     * Gets (as xml) the "datajAtualizacao" element
     */
    org.apache.xmlbeans.XmlInt xgetDatajAtualizacao();
    
    /**
     * True if has "datajAtualizacao" element
     */
    boolean isSetDatajAtualizacao();
    
    /**
     * Sets the "datajAtualizacao" element
     */
    void setDatajAtualizacao(int datajAtualizacao);
    
    /**
     * Sets (as xml) the "datajAtualizacao" element
     */
    void xsetDatajAtualizacao(org.apache.xmlbeans.XmlInt datajAtualizacao);
    
    /**
     * Unsets the "datajAtualizacao" element
     */
    void unsetDatajAtualizacao();
    
    /**
     * Gets the "descricaoStatusCliente" element
     */
    java.lang.String getDescricaoStatusCliente();
    
    /**
     * Gets (as xml) the "descricaoStatusCliente" element
     */
    org.apache.xmlbeans.XmlString xgetDescricaoStatusCliente();
    
    /**
     * True if has "descricaoStatusCliente" element
     */
    boolean isSetDescricaoStatusCliente();
    
    /**
     * Sets the "descricaoStatusCliente" element
     */
    void setDescricaoStatusCliente(java.lang.String descricaoStatusCliente);
    
    /**
     * Sets (as xml) the "descricaoStatusCliente" element
     */
    void xsetDescricaoStatusCliente(org.apache.xmlbeans.XmlString descricaoStatusCliente);
    
    /**
     * Unsets the "descricaoStatusCliente" element
     */
    void unsetDescricaoStatusCliente();
    
    /**
     * Gets array of all "gerenteConta" elements
     */
    br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta[] getGerenteContaArray();
    
    /**
     * Gets ith "gerenteConta" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta getGerenteContaArray(int i);
    
    /**
     * Tests for nil ith "gerenteConta" element
     */
    boolean isNilGerenteContaArray(int i);
    
    /**
     * Returns number of "gerenteConta" element
     */
    int sizeOfGerenteContaArray();
    
    /**
     * Sets array of all "gerenteConta" element
     */
    void setGerenteContaArray(br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta[] gerenteContaArray);
    
    /**
     * Sets ith "gerenteConta" element
     */
    void setGerenteContaArray(int i, br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta gerenteConta);
    
    /**
     * Nils the ith "gerenteConta" element
     */
    void setNilGerenteContaArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "gerenteConta" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta insertNewGerenteConta(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "gerenteConta" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta addNewGerenteConta();
    
    /**
     * Removes the ith "gerenteConta" element
     */
    void removeGerenteConta(int i);
    
    /**
     * Gets the "horajAtualizacao" element
     */
    long getHorajAtualizacao();
    
    /**
     * Gets (as xml) the "horajAtualizacao" element
     */
    org.apache.xmlbeans.XmlLong xgetHorajAtualizacao();
    
    /**
     * True if has "horajAtualizacao" element
     */
    boolean isSetHorajAtualizacao();
    
    /**
     * Sets the "horajAtualizacao" element
     */
    void setHorajAtualizacao(long horajAtualizacao);
    
    /**
     * Sets (as xml) the "horajAtualizacao" element
     */
    void xsetHorajAtualizacao(org.apache.xmlbeans.XmlLong horajAtualizacao);
    
    /**
     * Unsets the "horajAtualizacao" element
     */
    void unsetHorajAtualizacao();
    
    /**
     * Gets the "id" element
     */
    long getId();
    
    /**
     * Gets (as xml) the "id" element
     */
    org.apache.xmlbeans.XmlLong xgetId();
    
    /**
     * Sets the "id" element
     */
    void setId(long id);
    
    /**
     * Sets (as xml) the "id" element
     */
    void xsetId(org.apache.xmlbeans.XmlLong id);
    
    /**
     * Gets the "inscricaoEstadual" element
     */
    java.lang.String getInscricaoEstadual();
    
    /**
     * Gets (as xml) the "inscricaoEstadual" element
     */
    org.apache.xmlbeans.XmlString xgetInscricaoEstadual();
    
    /**
     * True if has "inscricaoEstadual" element
     */
    boolean isSetInscricaoEstadual();
    
    /**
     * Sets the "inscricaoEstadual" element
     */
    void setInscricaoEstadual(java.lang.String inscricaoEstadual);
    
    /**
     * Sets (as xml) the "inscricaoEstadual" element
     */
    void xsetInscricaoEstadual(org.apache.xmlbeans.XmlString inscricaoEstadual);
    
    /**
     * Unsets the "inscricaoEstadual" element
     */
    void unsetInscricaoEstadual();
    
    /**
     * Gets the "nome" element
     */
    java.lang.String getNome();
    
    /**
     * Gets (as xml) the "nome" element
     */
    org.apache.xmlbeans.XmlString xgetNome();
    
    /**
     * True if has "nome" element
     */
    boolean isSetNome();
    
    /**
     * Sets the "nome" element
     */
    void setNome(java.lang.String nome);
    
    /**
     * Sets (as xml) the "nome" element
     */
    void xsetNome(org.apache.xmlbeans.XmlString nome);
    
    /**
     * Unsets the "nome" element
     */
    void unsetNome();
    
    /**
     * Gets the "statusCodigo" element
     */
    java.lang.String getStatusCodigo();
    
    /**
     * Gets (as xml) the "statusCodigo" element
     */
    org.apache.xmlbeans.XmlString xgetStatusCodigo();
    
    /**
     * True if has "statusCodigo" element
     */
    boolean isSetStatusCodigo();
    
    /**
     * Sets the "statusCodigo" element
     */
    void setStatusCodigo(java.lang.String statusCodigo);
    
    /**
     * Sets (as xml) the "statusCodigo" element
     */
    void xsetStatusCodigo(org.apache.xmlbeans.XmlString statusCodigo);
    
    /**
     * Unsets the "statusCodigo" element
     */
    void unsetStatusCodigo();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP newInstance() {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
