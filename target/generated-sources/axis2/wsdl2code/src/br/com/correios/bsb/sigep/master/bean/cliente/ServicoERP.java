/*
 * XML Type:  servicoERP
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente;


/**
 * An XML servicoERP(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public interface ServicoERP extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServicoERP.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE691E6D0F7AD129CBDCC7B3C09AD22B2").resolveHandle("servicoerp5568type");
    
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
     * Gets the "servicoSigep" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep getServicoSigep();
    
    /**
     * True if has "servicoSigep" element
     */
    boolean isSetServicoSigep();
    
    /**
     * Sets the "servicoSigep" element
     */
    void setServicoSigep(br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep servicoSigep);
    
    /**
     * Appends and returns a new empty "servicoSigep" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep addNewServicoSigep();
    
    /**
     * Unsets the "servicoSigep" element
     */
    void unsetServicoSigep();
    
    /**
     * Gets array of all "servicosAdicionais" elements
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalERP[] getServicosAdicionaisArray();
    
    /**
     * Gets ith "servicosAdicionais" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalERP getServicosAdicionaisArray(int i);
    
    /**
     * Tests for nil ith "servicosAdicionais" element
     */
    boolean isNilServicosAdicionaisArray(int i);
    
    /**
     * Returns number of "servicosAdicionais" element
     */
    int sizeOfServicosAdicionaisArray();
    
    /**
     * Sets array of all "servicosAdicionais" element
     */
    void setServicosAdicionaisArray(br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalERP[] servicosAdicionaisArray);
    
    /**
     * Sets ith "servicosAdicionais" element
     */
    void setServicosAdicionaisArray(int i, br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalERP servicosAdicionais);
    
    /**
     * Nils the ith "servicosAdicionais" element
     */
    void setNilServicosAdicionaisArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "servicosAdicionais" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalERP insertNewServicosAdicionais(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "servicosAdicionais" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalERP addNewServicosAdicionais();
    
    /**
     * Removes the ith "servicosAdicionais" element
     */
    void removeServicosAdicionais(int i);
    
    /**
     * Gets the "tipo1Codigo" element
     */
    java.lang.String getTipo1Codigo();
    
    /**
     * Gets (as xml) the "tipo1Codigo" element
     */
    org.apache.xmlbeans.XmlString xgetTipo1Codigo();
    
    /**
     * True if has "tipo1Codigo" element
     */
    boolean isSetTipo1Codigo();
    
    /**
     * Sets the "tipo1Codigo" element
     */
    void setTipo1Codigo(java.lang.String tipo1Codigo);
    
    /**
     * Sets (as xml) the "tipo1Codigo" element
     */
    void xsetTipo1Codigo(org.apache.xmlbeans.XmlString tipo1Codigo);
    
    /**
     * Unsets the "tipo1Codigo" element
     */
    void unsetTipo1Codigo();
    
    /**
     * Gets the "tipo1Descricao" element
     */
    java.lang.String getTipo1Descricao();
    
    /**
     * Gets (as xml) the "tipo1Descricao" element
     */
    org.apache.xmlbeans.XmlString xgetTipo1Descricao();
    
    /**
     * True if has "tipo1Descricao" element
     */
    boolean isSetTipo1Descricao();
    
    /**
     * Sets the "tipo1Descricao" element
     */
    void setTipo1Descricao(java.lang.String tipo1Descricao);
    
    /**
     * Sets (as xml) the "tipo1Descricao" element
     */
    void xsetTipo1Descricao(org.apache.xmlbeans.XmlString tipo1Descricao);
    
    /**
     * Unsets the "tipo1Descricao" element
     */
    void unsetTipo1Descricao();
    
    /**
     * Gets the "tipo2Codigo" element
     */
    java.lang.String getTipo2Codigo();
    
    /**
     * Gets (as xml) the "tipo2Codigo" element
     */
    org.apache.xmlbeans.XmlString xgetTipo2Codigo();
    
    /**
     * True if has "tipo2Codigo" element
     */
    boolean isSetTipo2Codigo();
    
    /**
     * Sets the "tipo2Codigo" element
     */
    void setTipo2Codigo(java.lang.String tipo2Codigo);
    
    /**
     * Sets (as xml) the "tipo2Codigo" element
     */
    void xsetTipo2Codigo(org.apache.xmlbeans.XmlString tipo2Codigo);
    
    /**
     * Unsets the "tipo2Codigo" element
     */
    void unsetTipo2Codigo();
    
    /**
     * Gets the "tipo2Descricao" element
     */
    java.lang.String getTipo2Descricao();
    
    /**
     * Gets (as xml) the "tipo2Descricao" element
     */
    org.apache.xmlbeans.XmlString xgetTipo2Descricao();
    
    /**
     * True if has "tipo2Descricao" element
     */
    boolean isSetTipo2Descricao();
    
    /**
     * Sets the "tipo2Descricao" element
     */
    void setTipo2Descricao(java.lang.String tipo2Descricao);
    
    /**
     * Sets (as xml) the "tipo2Descricao" element
     */
    void xsetTipo2Descricao(org.apache.xmlbeans.XmlString tipo2Descricao);
    
    /**
     * Unsets the "tipo2Descricao" element
     */
    void unsetTipo2Descricao();
    
    /**
     * Gets the "vigencia" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.VigenciaERP getVigencia();
    
    /**
     * True if has "vigencia" element
     */
    boolean isSetVigencia();
    
    /**
     * Sets the "vigencia" element
     */
    void setVigencia(br.com.correios.bsb.sigep.master.bean.cliente.VigenciaERP vigencia);
    
    /**
     * Appends and returns a new empty "vigencia" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.VigenciaERP addNewVigencia();
    
    /**
     * Unsets the "vigencia" element
     */
    void unsetVigencia();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP newInstance() {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
