/*
 * XML Type:  usuarioInstalacao
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente;


/**
 * An XML usuarioInstalacao(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public interface UsuarioInstalacao extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UsuarioInstalacao.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE691E6D0F7AD129CBDCC7B3C09AD22B2").resolveHandle("usuarioinstalacao7e21type");
    
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
     * Gets the "dataInclusao" element
     */
    java.util.Calendar getDataInclusao();
    
    /**
     * Gets (as xml) the "dataInclusao" element
     */
    org.apache.xmlbeans.XmlDateTime xgetDataInclusao();
    
    /**
     * True if has "dataInclusao" element
     */
    boolean isSetDataInclusao();
    
    /**
     * Sets the "dataInclusao" element
     */
    void setDataInclusao(java.util.Calendar dataInclusao);
    
    /**
     * Sets (as xml) the "dataInclusao" element
     */
    void xsetDataInclusao(org.apache.xmlbeans.XmlDateTime dataInclusao);
    
    /**
     * Unsets the "dataInclusao" element
     */
    void unsetDataInclusao();
    
    /**
     * Gets the "dataSenha" element
     */
    java.util.Calendar getDataSenha();
    
    /**
     * Gets (as xml) the "dataSenha" element
     */
    org.apache.xmlbeans.XmlDateTime xgetDataSenha();
    
    /**
     * True if has "dataSenha" element
     */
    boolean isSetDataSenha();
    
    /**
     * Sets the "dataSenha" element
     */
    void setDataSenha(java.util.Calendar dataSenha);
    
    /**
     * Sets (as xml) the "dataSenha" element
     */
    void xsetDataSenha(org.apache.xmlbeans.XmlDateTime dataSenha);
    
    /**
     * Unsets the "dataSenha" element
     */
    void unsetDataSenha();
    
    /**
     * Gets the "gerenteMaster" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta getGerenteMaster();
    
    /**
     * True if has "gerenteMaster" element
     */
    boolean isSetGerenteMaster();
    
    /**
     * Sets the "gerenteMaster" element
     */
    void setGerenteMaster(br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta gerenteMaster);
    
    /**
     * Appends and returns a new empty "gerenteMaster" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta addNewGerenteMaster();
    
    /**
     * Unsets the "gerenteMaster" element
     */
    void unsetGerenteMaster();
    
    /**
     * Gets the "hashSenha" element
     */
    java.lang.String getHashSenha();
    
    /**
     * Gets (as xml) the "hashSenha" element
     */
    org.apache.xmlbeans.XmlString xgetHashSenha();
    
    /**
     * True if has "hashSenha" element
     */
    boolean isSetHashSenha();
    
    /**
     * Sets the "hashSenha" element
     */
    void setHashSenha(java.lang.String hashSenha);
    
    /**
     * Sets (as xml) the "hashSenha" element
     */
    void xsetHashSenha(org.apache.xmlbeans.XmlString hashSenha);
    
    /**
     * Unsets the "hashSenha" element
     */
    void unsetHashSenha();
    
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
     * Gets the "login" element
     */
    java.lang.String getLogin();
    
    /**
     * Gets (as xml) the "login" element
     */
    org.apache.xmlbeans.XmlString xgetLogin();
    
    /**
     * True if has "login" element
     */
    boolean isSetLogin();
    
    /**
     * Sets the "login" element
     */
    void setLogin(java.lang.String login);
    
    /**
     * Sets (as xml) the "login" element
     */
    void xsetLogin(org.apache.xmlbeans.XmlString login);
    
    /**
     * Unsets the "login" element
     */
    void unsetLogin();
    
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
     * Gets array of all "parametros" elements
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ParametroMaster[] getParametrosArray();
    
    /**
     * Gets ith "parametros" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ParametroMaster getParametrosArray(int i);
    
    /**
     * Tests for nil ith "parametros" element
     */
    boolean isNilParametrosArray(int i);
    
    /**
     * Returns number of "parametros" element
     */
    int sizeOfParametrosArray();
    
    /**
     * Sets array of all "parametros" element
     */
    void setParametrosArray(br.com.correios.bsb.sigep.master.bean.cliente.ParametroMaster[] parametrosArray);
    
    /**
     * Sets ith "parametros" element
     */
    void setParametrosArray(int i, br.com.correios.bsb.sigep.master.bean.cliente.ParametroMaster parametros);
    
    /**
     * Nils the ith "parametros" element
     */
    void setNilParametrosArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "parametros" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ParametroMaster insertNewParametros(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "parametros" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ParametroMaster addNewParametros();
    
    /**
     * Removes the ith "parametros" element
     */
    void removeParametros(int i);
    
    /**
     * Gets the "senha" element
     */
    java.lang.String getSenha();
    
    /**
     * Gets (as xml) the "senha" element
     */
    org.apache.xmlbeans.XmlString xgetSenha();
    
    /**
     * True if has "senha" element
     */
    boolean isSetSenha();
    
    /**
     * Sets the "senha" element
     */
    void setSenha(java.lang.String senha);
    
    /**
     * Sets (as xml) the "senha" element
     */
    void xsetSenha(org.apache.xmlbeans.XmlString senha);
    
    /**
     * Unsets the "senha" element
     */
    void unsetSenha();
    
    /**
     * Gets the "status" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.StatusUsuario.Enum getStatus();
    
    /**
     * Gets (as xml) the "status" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.StatusUsuario xgetStatus();
    
    /**
     * True if has "status" element
     */
    boolean isSetStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(br.com.correios.bsb.sigep.master.bean.cliente.StatusUsuario.Enum status);
    
    /**
     * Sets (as xml) the "status" element
     */
    void xsetStatus(br.com.correios.bsb.sigep.master.bean.cliente.StatusUsuario status);
    
    /**
     * Unsets the "status" element
     */
    void unsetStatus();
    
    /**
     * Gets the "validade" element
     */
    java.lang.String getValidade();
    
    /**
     * Gets (as xml) the "validade" element
     */
    org.apache.xmlbeans.XmlString xgetValidade();
    
    /**
     * True if has "validade" element
     */
    boolean isSetValidade();
    
    /**
     * Sets the "validade" element
     */
    void setValidade(java.lang.String validade);
    
    /**
     * Sets (as xml) the "validade" element
     */
    void xsetValidade(org.apache.xmlbeans.XmlString validade);
    
    /**
     * Unsets the "validade" element
     */
    void unsetValidade();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao newInstance() {
          return (br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
