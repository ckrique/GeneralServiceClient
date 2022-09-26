/*
 * XML Type:  contratoERP
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente;


/**
 * An XML contratoERP(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public interface ContratoERP extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ContratoERP.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8AE111D981C96D520F862962551646CA").resolveHandle("contratoerpb7f9type");
    
    /**
     * Gets array of all "cartoesPostagem" elements
     */
    br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP[] getCartoesPostagemArray();
    
    /**
     * Gets ith "cartoesPostagem" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP getCartoesPostagemArray(int i);
    
    /**
     * Tests for nil ith "cartoesPostagem" element
     */
    boolean isNilCartoesPostagemArray(int i);
    
    /**
     * Returns number of "cartoesPostagem" element
     */
    int sizeOfCartoesPostagemArray();
    
    /**
     * Sets array of all "cartoesPostagem" element
     */
    void setCartoesPostagemArray(br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP[] cartoesPostagemArray);
    
    /**
     * Sets ith "cartoesPostagem" element
     */
    void setCartoesPostagemArray(int i, br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP cartoesPostagem);
    
    /**
     * Nils the ith "cartoesPostagem" element
     */
    void setNilCartoesPostagemArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cartoesPostagem" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP insertNewCartoesPostagem(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cartoesPostagem" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP addNewCartoesPostagem();
    
    /**
     * Removes the ith "cartoesPostagem" element
     */
    void removeCartoesPostagem(int i);
    
    /**
     * Gets the "cliente" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP getCliente();
    
    /**
     * True if has "cliente" element
     */
    boolean isSetCliente();
    
    /**
     * Sets the "cliente" element
     */
    void setCliente(br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP cliente);
    
    /**
     * Appends and returns a new empty "cliente" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP addNewCliente();
    
    /**
     * Unsets the "cliente" element
     */
    void unsetCliente();
    
    /**
     * Gets the "codigoCliente" element
     */
    long getCodigoCliente();
    
    /**
     * Gets (as xml) the "codigoCliente" element
     */
    org.apache.xmlbeans.XmlLong xgetCodigoCliente();
    
    /**
     * Sets the "codigoCliente" element
     */
    void setCodigoCliente(long codigoCliente);
    
    /**
     * Sets (as xml) the "codigoCliente" element
     */
    void xsetCodigoCliente(org.apache.xmlbeans.XmlLong codigoCliente);
    
    /**
     * Gets the "codigoDiretoria" element
     */
    java.lang.String getCodigoDiretoria();
    
    /**
     * Gets (as xml) the "codigoDiretoria" element
     */
    org.apache.xmlbeans.XmlString xgetCodigoDiretoria();
    
    /**
     * True if has "codigoDiretoria" element
     */
    boolean isSetCodigoDiretoria();
    
    /**
     * Sets the "codigoDiretoria" element
     */
    void setCodigoDiretoria(java.lang.String codigoDiretoria);
    
    /**
     * Sets (as xml) the "codigoDiretoria" element
     */
    void xsetCodigoDiretoria(org.apache.xmlbeans.XmlString codigoDiretoria);
    
    /**
     * Unsets the "codigoDiretoria" element
     */
    void unsetCodigoDiretoria();
    
    /**
     * Gets the "contratoPK" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ContratoERPPK getContratoPK();
    
    /**
     * True if has "contratoPK" element
     */
    boolean isSetContratoPK();
    
    /**
     * Sets the "contratoPK" element
     */
    void setContratoPK(br.com.correios.bsb.sigep.master.bean.cliente.ContratoERPPK contratoPK);
    
    /**
     * Appends and returns a new empty "contratoPK" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ContratoERPPK addNewContratoPK();
    
    /**
     * Unsets the "contratoPK" element
     */
    void unsetContratoPK();
    
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
     * Gets the "dataAtualizacaoDDMMYYYY" element
     */
    java.lang.String getDataAtualizacaoDDMMYYYY();
    
    /**
     * Gets (as xml) the "dataAtualizacaoDDMMYYYY" element
     */
    org.apache.xmlbeans.XmlString xgetDataAtualizacaoDDMMYYYY();
    
    /**
     * True if has "dataAtualizacaoDDMMYYYY" element
     */
    boolean isSetDataAtualizacaoDDMMYYYY();
    
    /**
     * Sets the "dataAtualizacaoDDMMYYYY" element
     */
    void setDataAtualizacaoDDMMYYYY(java.lang.String dataAtualizacaoDDMMYYYY);
    
    /**
     * Sets (as xml) the "dataAtualizacaoDDMMYYYY" element
     */
    void xsetDataAtualizacaoDDMMYYYY(org.apache.xmlbeans.XmlString dataAtualizacaoDDMMYYYY);
    
    /**
     * Unsets the "dataAtualizacaoDDMMYYYY" element
     */
    void unsetDataAtualizacaoDDMMYYYY();
    
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
     * Gets the "dataVigenciaFimDDMMYYYY" element
     */
    java.lang.String getDataVigenciaFimDDMMYYYY();
    
    /**
     * Gets (as xml) the "dataVigenciaFimDDMMYYYY" element
     */
    org.apache.xmlbeans.XmlString xgetDataVigenciaFimDDMMYYYY();
    
    /**
     * True if has "dataVigenciaFimDDMMYYYY" element
     */
    boolean isSetDataVigenciaFimDDMMYYYY();
    
    /**
     * Sets the "dataVigenciaFimDDMMYYYY" element
     */
    void setDataVigenciaFimDDMMYYYY(java.lang.String dataVigenciaFimDDMMYYYY);
    
    /**
     * Sets (as xml) the "dataVigenciaFimDDMMYYYY" element
     */
    void xsetDataVigenciaFimDDMMYYYY(org.apache.xmlbeans.XmlString dataVigenciaFimDDMMYYYY);
    
    /**
     * Unsets the "dataVigenciaFimDDMMYYYY" element
     */
    void unsetDataVigenciaFimDDMMYYYY();
    
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
     * Gets the "dataVigenciaInicioDDMMYYYY" element
     */
    java.lang.String getDataVigenciaInicioDDMMYYYY();
    
    /**
     * Gets (as xml) the "dataVigenciaInicioDDMMYYYY" element
     */
    org.apache.xmlbeans.XmlString xgetDataVigenciaInicioDDMMYYYY();
    
    /**
     * True if has "dataVigenciaInicioDDMMYYYY" element
     */
    boolean isSetDataVigenciaInicioDDMMYYYY();
    
    /**
     * Sets the "dataVigenciaInicioDDMMYYYY" element
     */
    void setDataVigenciaInicioDDMMYYYY(java.lang.String dataVigenciaInicioDDMMYYYY);
    
    /**
     * Sets (as xml) the "dataVigenciaInicioDDMMYYYY" element
     */
    void xsetDataVigenciaInicioDDMMYYYY(org.apache.xmlbeans.XmlString dataVigenciaInicioDDMMYYYY);
    
    /**
     * Unsets the "dataVigenciaInicioDDMMYYYY" element
     */
    void unsetDataVigenciaInicioDDMMYYYY();
    
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
     * Gets the "descricaoDiretoriaRegional" element
     */
    java.lang.String getDescricaoDiretoriaRegional();
    
    /**
     * Gets (as xml) the "descricaoDiretoriaRegional" element
     */
    org.apache.xmlbeans.XmlString xgetDescricaoDiretoriaRegional();
    
    /**
     * True if has "descricaoDiretoriaRegional" element
     */
    boolean isSetDescricaoDiretoriaRegional();
    
    /**
     * Sets the "descricaoDiretoriaRegional" element
     */
    void setDescricaoDiretoriaRegional(java.lang.String descricaoDiretoriaRegional);
    
    /**
     * Sets (as xml) the "descricaoDiretoriaRegional" element
     */
    void xsetDescricaoDiretoriaRegional(org.apache.xmlbeans.XmlString descricaoDiretoriaRegional);
    
    /**
     * Unsets the "descricaoDiretoriaRegional" element
     */
    void unsetDescricaoDiretoriaRegional();
    
    /**
     * Gets the "descricaoStatus" element
     */
    java.lang.String getDescricaoStatus();
    
    /**
     * Gets (as xml) the "descricaoStatus" element
     */
    org.apache.xmlbeans.XmlString xgetDescricaoStatus();
    
    /**
     * True if has "descricaoStatus" element
     */
    boolean isSetDescricaoStatus();
    
    /**
     * Sets the "descricaoStatus" element
     */
    void setDescricaoStatus(java.lang.String descricaoStatus);
    
    /**
     * Sets (as xml) the "descricaoStatus" element
     */
    void xsetDescricaoStatus(org.apache.xmlbeans.XmlString descricaoStatus);
    
    /**
     * Unsets the "descricaoStatus" element
     */
    void unsetDescricaoStatus();
    
    /**
     * Gets the "diretoriaRegional" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP getDiretoriaRegional();
    
    /**
     * True if has "diretoriaRegional" element
     */
    boolean isSetDiretoriaRegional();
    
    /**
     * Sets the "diretoriaRegional" element
     */
    void setDiretoriaRegional(br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP diretoriaRegional);
    
    /**
     * Appends and returns a new empty "diretoriaRegional" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP addNewDiretoriaRegional();
    
    /**
     * Unsets the "diretoriaRegional" element
     */
    void unsetDiretoriaRegional();
    
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
        public static br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP newInstance() {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
