/*
 * XML Type:  gerenteConta
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente;


/**
 * An XML gerenteConta(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public interface GerenteConta extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GerenteConta.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8AE111D981C96D520F862962551646CA").resolveHandle("gerentecontacf25type");
    
    /**
     * Gets array of all "clientesVisiveis" elements
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP[] getClientesVisiveisArray();
    
    /**
     * Gets ith "clientesVisiveis" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP getClientesVisiveisArray(int i);
    
    /**
     * Tests for nil ith "clientesVisiveis" element
     */
    boolean isNilClientesVisiveisArray(int i);
    
    /**
     * Returns number of "clientesVisiveis" element
     */
    int sizeOfClientesVisiveisArray();
    
    /**
     * Sets array of all "clientesVisiveis" element
     */
    void setClientesVisiveisArray(br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP[] clientesVisiveisArray);
    
    /**
     * Sets ith "clientesVisiveis" element
     */
    void setClientesVisiveisArray(int i, br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP clientesVisiveis);
    
    /**
     * Nils the ith "clientesVisiveis" element
     */
    void setNilClientesVisiveisArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "clientesVisiveis" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP insertNewClientesVisiveis(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "clientesVisiveis" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP addNewClientesVisiveis();
    
    /**
     * Removes the ith "clientesVisiveis" element
     */
    void removeClientesVisiveis(int i);
    
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
     * Gets the "matricula" element
     */
    java.lang.String getMatricula();
    
    /**
     * Gets (as xml) the "matricula" element
     */
    org.apache.xmlbeans.XmlString xgetMatricula();
    
    /**
     * True if has "matricula" element
     */
    boolean isSetMatricula();
    
    /**
     * Sets the "matricula" element
     */
    void setMatricula(java.lang.String matricula);
    
    /**
     * Sets (as xml) the "matricula" element
     */
    void xsetMatricula(org.apache.xmlbeans.XmlString matricula);
    
    /**
     * Unsets the "matricula" element
     */
    void unsetMatricula();
    
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
    br.com.correios.bsb.sigep.master.bean.cliente.StatusGerente.Enum getStatus();
    
    /**
     * Gets (as xml) the "status" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.StatusGerente xgetStatus();
    
    /**
     * True if has "status" element
     */
    boolean isSetStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(br.com.correios.bsb.sigep.master.bean.cliente.StatusGerente.Enum status);
    
    /**
     * Sets (as xml) the "status" element
     */
    void xsetStatus(br.com.correios.bsb.sigep.master.bean.cliente.StatusGerente status);
    
    /**
     * Unsets the "status" element
     */
    void unsetStatus();
    
    /**
     * Gets the "tipoGerente" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.TipoGerente.Enum getTipoGerente();
    
    /**
     * Gets (as xml) the "tipoGerente" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.TipoGerente xgetTipoGerente();
    
    /**
     * True if has "tipoGerente" element
     */
    boolean isSetTipoGerente();
    
    /**
     * Sets the "tipoGerente" element
     */
    void setTipoGerente(br.com.correios.bsb.sigep.master.bean.cliente.TipoGerente.Enum tipoGerente);
    
    /**
     * Sets (as xml) the "tipoGerente" element
     */
    void xsetTipoGerente(br.com.correios.bsb.sigep.master.bean.cliente.TipoGerente tipoGerente);
    
    /**
     * Unsets the "tipoGerente" element
     */
    void unsetTipoGerente();
    
    /**
     * Gets array of all "usuariosInstalacao" elements
     */
    br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao[] getUsuariosInstalacaoArray();
    
    /**
     * Gets ith "usuariosInstalacao" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao getUsuariosInstalacaoArray(int i);
    
    /**
     * Tests for nil ith "usuariosInstalacao" element
     */
    boolean isNilUsuariosInstalacaoArray(int i);
    
    /**
     * Returns number of "usuariosInstalacao" element
     */
    int sizeOfUsuariosInstalacaoArray();
    
    /**
     * Sets array of all "usuariosInstalacao" element
     */
    void setUsuariosInstalacaoArray(br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao[] usuariosInstalacaoArray);
    
    /**
     * Sets ith "usuariosInstalacao" element
     */
    void setUsuariosInstalacaoArray(int i, br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao usuariosInstalacao);
    
    /**
     * Nils the ith "usuariosInstalacao" element
     */
    void setNilUsuariosInstalacaoArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "usuariosInstalacao" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao insertNewUsuariosInstalacao(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "usuariosInstalacao" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao addNewUsuariosInstalacao();
    
    /**
     * Removes the ith "usuariosInstalacao" element
     */
    void removeUsuariosInstalacao(int i);
    
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
        public static br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta newInstance() {
          return (br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
