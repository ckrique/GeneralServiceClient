/*
 * XML Type:  cartaoPostagemERP
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente;


/**
 * An XML cartaoPostagemERP(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public interface CartaoPostagemERP extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CartaoPostagemERP.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE691E6D0F7AD129CBDCC7B3C09AD22B2").resolveHandle("cartaopostagemerp4879type");
    
    /**
     * Gets the "codigoAdministrativo" element
     */
    java.lang.String getCodigoAdministrativo();
    
    /**
     * Gets (as xml) the "codigoAdministrativo" element
     */
    org.apache.xmlbeans.XmlString xgetCodigoAdministrativo();
    
    /**
     * True if has "codigoAdministrativo" element
     */
    boolean isSetCodigoAdministrativo();
    
    /**
     * Sets the "codigoAdministrativo" element
     */
    void setCodigoAdministrativo(java.lang.String codigoAdministrativo);
    
    /**
     * Sets (as xml) the "codigoAdministrativo" element
     */
    void xsetCodigoAdministrativo(org.apache.xmlbeans.XmlString codigoAdministrativo);
    
    /**
     * Unsets the "codigoAdministrativo" element
     */
    void unsetCodigoAdministrativo();
    
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
     * Gets the "dataVigenciaFim" element
     */
    java.util.Calendar getDataVigenciaFim();
    
    /**
     * Gets (as xml) the "dataVigenciaFim" element
     */
    org.apache.xmlbeans.XmlDateTime xgetDataVigenciaFim();
    
    /**
     * True if has "dataVigenciaFim" element
     */
    boolean isSetDataVigenciaFim();
    
    /**
     * Sets the "dataVigenciaFim" element
     */
    void setDataVigenciaFim(java.util.Calendar dataVigenciaFim);
    
    /**
     * Sets (as xml) the "dataVigenciaFim" element
     */
    void xsetDataVigenciaFim(org.apache.xmlbeans.XmlDateTime dataVigenciaFim);
    
    /**
     * Unsets the "dataVigenciaFim" element
     */
    void unsetDataVigenciaFim();
    
    /**
     * Gets the "dataVigenciaInicio" element
     */
    java.util.Calendar getDataVigenciaInicio();
    
    /**
     * Gets (as xml) the "dataVigenciaInicio" element
     */
    org.apache.xmlbeans.XmlDateTime xgetDataVigenciaInicio();
    
    /**
     * True if has "dataVigenciaInicio" element
     */
    boolean isSetDataVigenciaInicio();
    
    /**
     * Sets the "dataVigenciaInicio" element
     */
    void setDataVigenciaInicio(java.util.Calendar dataVigenciaInicio);
    
    /**
     * Sets (as xml) the "dataVigenciaInicio" element
     */
    void xsetDataVigenciaInicio(org.apache.xmlbeans.XmlDateTime dataVigenciaInicio);
    
    /**
     * Unsets the "dataVigenciaInicio" element
     */
    void unsetDataVigenciaInicio();
    
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
     * Gets the "datajVigenciaFim" element
     */
    int getDatajVigenciaFim();
    
    /**
     * Gets (as xml) the "datajVigenciaFim" element
     */
    org.apache.xmlbeans.XmlInt xgetDatajVigenciaFim();
    
    /**
     * True if has "datajVigenciaFim" element
     */
    boolean isSetDatajVigenciaFim();
    
    /**
     * Sets the "datajVigenciaFim" element
     */
    void setDatajVigenciaFim(int datajVigenciaFim);
    
    /**
     * Sets (as xml) the "datajVigenciaFim" element
     */
    void xsetDatajVigenciaFim(org.apache.xmlbeans.XmlInt datajVigenciaFim);
    
    /**
     * Unsets the "datajVigenciaFim" element
     */
    void unsetDatajVigenciaFim();
    
    /**
     * Gets the "datajVigenciaInicio" element
     */
    int getDatajVigenciaInicio();
    
    /**
     * Gets (as xml) the "datajVigenciaInicio" element
     */
    org.apache.xmlbeans.XmlInt xgetDatajVigenciaInicio();
    
    /**
     * True if has "datajVigenciaInicio" element
     */
    boolean isSetDatajVigenciaInicio();
    
    /**
     * Sets the "datajVigenciaInicio" element
     */
    void setDatajVigenciaInicio(int datajVigenciaInicio);
    
    /**
     * Sets (as xml) the "datajVigenciaInicio" element
     */
    void xsetDatajVigenciaInicio(org.apache.xmlbeans.XmlInt datajVigenciaInicio);
    
    /**
     * Unsets the "datajVigenciaInicio" element
     */
    void unsetDatajVigenciaInicio();
    
    /**
     * Gets the "descricaoStatusCartao" element
     */
    java.lang.String getDescricaoStatusCartao();
    
    /**
     * Gets (as xml) the "descricaoStatusCartao" element
     */
    org.apache.xmlbeans.XmlString xgetDescricaoStatusCartao();
    
    /**
     * True if has "descricaoStatusCartao" element
     */
    boolean isSetDescricaoStatusCartao();
    
    /**
     * Sets the "descricaoStatusCartao" element
     */
    void setDescricaoStatusCartao(java.lang.String descricaoStatusCartao);
    
    /**
     * Sets (as xml) the "descricaoStatusCartao" element
     */
    void xsetDescricaoStatusCartao(org.apache.xmlbeans.XmlString descricaoStatusCartao);
    
    /**
     * Unsets the "descricaoStatusCartao" element
     */
    void unsetDescricaoStatusCartao();
    
    /**
     * Gets the "descricaoUnidadePostagemGenerica" element
     */
    java.lang.String getDescricaoUnidadePostagemGenerica();
    
    /**
     * Gets (as xml) the "descricaoUnidadePostagemGenerica" element
     */
    org.apache.xmlbeans.XmlString xgetDescricaoUnidadePostagemGenerica();
    
    /**
     * True if has "descricaoUnidadePostagemGenerica" element
     */
    boolean isSetDescricaoUnidadePostagemGenerica();
    
    /**
     * Sets the "descricaoUnidadePostagemGenerica" element
     */
    void setDescricaoUnidadePostagemGenerica(java.lang.String descricaoUnidadePostagemGenerica);
    
    /**
     * Sets (as xml) the "descricaoUnidadePostagemGenerica" element
     */
    void xsetDescricaoUnidadePostagemGenerica(org.apache.xmlbeans.XmlString descricaoUnidadePostagemGenerica);
    
    /**
     * Unsets the "descricaoUnidadePostagemGenerica" element
     */
    void unsetDescricaoUnidadePostagemGenerica();
    
    /**
     * Gets the "horajAtualizacao" element
     */
    int getHorajAtualizacao();
    
    /**
     * Gets (as xml) the "horajAtualizacao" element
     */
    org.apache.xmlbeans.XmlInt xgetHorajAtualizacao();
    
    /**
     * True if has "horajAtualizacao" element
     */
    boolean isSetHorajAtualizacao();
    
    /**
     * Sets the "horajAtualizacao" element
     */
    void setHorajAtualizacao(int horajAtualizacao);
    
    /**
     * Sets (as xml) the "horajAtualizacao" element
     */
    void xsetHorajAtualizacao(org.apache.xmlbeans.XmlInt horajAtualizacao);
    
    /**
     * Unsets the "horajAtualizacao" element
     */
    void unsetHorajAtualizacao();
    
    /**
     * Gets the "numero" element
     */
    java.lang.String getNumero();
    
    /**
     * Gets (as xml) the "numero" element
     */
    org.apache.xmlbeans.XmlString xgetNumero();
    
    /**
     * True if has "numero" element
     */
    boolean isSetNumero();
    
    /**
     * Sets the "numero" element
     */
    void setNumero(java.lang.String numero);
    
    /**
     * Sets (as xml) the "numero" element
     */
    void xsetNumero(org.apache.xmlbeans.XmlString numero);
    
    /**
     * Unsets the "numero" element
     */
    void unsetNumero();
    
    /**
     * Gets array of all "servicos" elements
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP[] getServicosArray();
    
    /**
     * Gets ith "servicos" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP getServicosArray(int i);
    
    /**
     * Tests for nil ith "servicos" element
     */
    boolean isNilServicosArray(int i);
    
    /**
     * Returns number of "servicos" element
     */
    int sizeOfServicosArray();
    
    /**
     * Sets array of all "servicos" element
     */
    void setServicosArray(br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP[] servicosArray);
    
    /**
     * Sets ith "servicos" element
     */
    void setServicosArray(int i, br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP servicos);
    
    /**
     * Nils the ith "servicos" element
     */
    void setNilServicosArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "servicos" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP insertNewServicos(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "servicos" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP addNewServicos();
    
    /**
     * Removes the ith "servicos" element
     */
    void removeServicos(int i);
    
    /**
     * Gets the "statusCartaoPostagem" element
     */
    java.lang.String getStatusCartaoPostagem();
    
    /**
     * Gets (as xml) the "statusCartaoPostagem" element
     */
    org.apache.xmlbeans.XmlString xgetStatusCartaoPostagem();
    
    /**
     * True if has "statusCartaoPostagem" element
     */
    boolean isSetStatusCartaoPostagem();
    
    /**
     * Sets the "statusCartaoPostagem" element
     */
    void setStatusCartaoPostagem(java.lang.String statusCartaoPostagem);
    
    /**
     * Sets (as xml) the "statusCartaoPostagem" element
     */
    void xsetStatusCartaoPostagem(org.apache.xmlbeans.XmlString statusCartaoPostagem);
    
    /**
     * Unsets the "statusCartaoPostagem" element
     */
    void unsetStatusCartaoPostagem();
    
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
     * Gets the "unidadeGenerica" element
     */
    java.lang.String getUnidadeGenerica();
    
    /**
     * Gets (as xml) the "unidadeGenerica" element
     */
    org.apache.xmlbeans.XmlString xgetUnidadeGenerica();
    
    /**
     * True if has "unidadeGenerica" element
     */
    boolean isSetUnidadeGenerica();
    
    /**
     * Sets the "unidadeGenerica" element
     */
    void setUnidadeGenerica(java.lang.String unidadeGenerica);
    
    /**
     * Sets (as xml) the "unidadeGenerica" element
     */
    void xsetUnidadeGenerica(org.apache.xmlbeans.XmlString unidadeGenerica);
    
    /**
     * Unsets the "unidadeGenerica" element
     */
    void unsetUnidadeGenerica();
    
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
        public static br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP newInstance() {
          return (br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
