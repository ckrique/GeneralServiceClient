/*
 * XML Type:  servicoSigep
 * Namespace: http://cliente.bean.master.sigep.bsb.correios.com.br/
 * Java type: br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep
 *
 * Automatically generated - do not modify.
 */
package br.com.correios.bsb.sigep.master.bean.cliente;


/**
 * An XML servicoSigep(@http://cliente.bean.master.sigep.bsb.correios.com.br/).
 *
 * This is a complex type.
 */
public interface ServicoSigep extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServicoSigep.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE691E6D0F7AD129CBDCC7B3C09AD22B2").resolveHandle("servicosigep3a01type");
    
    /**
     * Gets the "categoriaServico" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.CategoriaServico.Enum getCategoriaServico();
    
    /**
     * Gets (as xml) the "categoriaServico" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.CategoriaServico xgetCategoriaServico();
    
    /**
     * True if has "categoriaServico" element
     */
    boolean isSetCategoriaServico();
    
    /**
     * Sets the "categoriaServico" element
     */
    void setCategoriaServico(br.com.correios.bsb.sigep.master.bean.cliente.CategoriaServico.Enum categoriaServico);
    
    /**
     * Sets (as xml) the "categoriaServico" element
     */
    void xsetCategoriaServico(br.com.correios.bsb.sigep.master.bean.cliente.CategoriaServico categoriaServico);
    
    /**
     * Unsets the "categoriaServico" element
     */
    void unsetCategoriaServico();
    
    /**
     * Gets the "chancela" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster getChancela();
    
    /**
     * True if has "chancela" element
     */
    boolean isSetChancela();
    
    /**
     * Sets the "chancela" element
     */
    void setChancela(br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster chancela);
    
    /**
     * Appends and returns a new empty "chancela" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster addNewChancela();
    
    /**
     * Unsets the "chancela" element
     */
    void unsetChancela();
    
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
     * Gets the "exigeDimensoes" element
     */
    boolean getExigeDimensoes();
    
    /**
     * Gets (as xml) the "exigeDimensoes" element
     */
    org.apache.xmlbeans.XmlBoolean xgetExigeDimensoes();
    
    /**
     * True if has "exigeDimensoes" element
     */
    boolean isSetExigeDimensoes();
    
    /**
     * Sets the "exigeDimensoes" element
     */
    void setExigeDimensoes(boolean exigeDimensoes);
    
    /**
     * Sets (as xml) the "exigeDimensoes" element
     */
    void xsetExigeDimensoes(org.apache.xmlbeans.XmlBoolean exigeDimensoes);
    
    /**
     * Unsets the "exigeDimensoes" element
     */
    void unsetExigeDimensoes();
    
    /**
     * Gets the "exigeValorCobrar" element
     */
    boolean getExigeValorCobrar();
    
    /**
     * Gets (as xml) the "exigeValorCobrar" element
     */
    org.apache.xmlbeans.XmlBoolean xgetExigeValorCobrar();
    
    /**
     * True if has "exigeValorCobrar" element
     */
    boolean isSetExigeValorCobrar();
    
    /**
     * Sets the "exigeValorCobrar" element
     */
    void setExigeValorCobrar(boolean exigeValorCobrar);
    
    /**
     * Sets (as xml) the "exigeValorCobrar" element
     */
    void xsetExigeValorCobrar(org.apache.xmlbeans.XmlBoolean exigeValorCobrar);
    
    /**
     * Unsets the "exigeValorCobrar" element
     */
    void unsetExigeValorCobrar();
    
    /**
     * Gets the "imitm" element
     */
    long getImitm();
    
    /**
     * Gets (as xml) the "imitm" element
     */
    org.apache.xmlbeans.XmlLong xgetImitm();
    
    /**
     * Sets the "imitm" element
     */
    void setImitm(long imitm);
    
    /**
     * Sets (as xml) the "imitm" element
     */
    void xsetImitm(org.apache.xmlbeans.XmlLong imitm);
    
    /**
     * Gets the "pagamentoEntrega" element
     */
    java.lang.String getPagamentoEntrega();
    
    /**
     * Gets (as xml) the "pagamentoEntrega" element
     */
    org.apache.xmlbeans.XmlString xgetPagamentoEntrega();
    
    /**
     * True if has "pagamentoEntrega" element
     */
    boolean isSetPagamentoEntrega();
    
    /**
     * Sets the "pagamentoEntrega" element
     */
    void setPagamentoEntrega(java.lang.String pagamentoEntrega);
    
    /**
     * Sets (as xml) the "pagamentoEntrega" element
     */
    void xsetPagamentoEntrega(org.apache.xmlbeans.XmlString pagamentoEntrega);
    
    /**
     * Unsets the "pagamentoEntrega" element
     */
    void unsetPagamentoEntrega();
    
    /**
     * Gets the "remessaAgrupada" element
     */
    java.lang.String getRemessaAgrupada();
    
    /**
     * Gets (as xml) the "remessaAgrupada" element
     */
    org.apache.xmlbeans.XmlString xgetRemessaAgrupada();
    
    /**
     * True if has "remessaAgrupada" element
     */
    boolean isSetRemessaAgrupada();
    
    /**
     * Sets the "remessaAgrupada" element
     */
    void setRemessaAgrupada(java.lang.String remessaAgrupada);
    
    /**
     * Sets (as xml) the "remessaAgrupada" element
     */
    void xsetRemessaAgrupada(org.apache.xmlbeans.XmlString remessaAgrupada);
    
    /**
     * Unsets the "remessaAgrupada" element
     */
    void unsetRemessaAgrupada();
    
    /**
     * Gets the "restricao" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.SimNao.Enum getRestricao();
    
    /**
     * Gets (as xml) the "restricao" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.SimNao xgetRestricao();
    
    /**
     * True if has "restricao" element
     */
    boolean isSetRestricao();
    
    /**
     * Sets the "restricao" element
     */
    void setRestricao(br.com.correios.bsb.sigep.master.bean.cliente.SimNao.Enum restricao);
    
    /**
     * Sets (as xml) the "restricao" element
     */
    void xsetRestricao(br.com.correios.bsb.sigep.master.bean.cliente.SimNao restricao);
    
    /**
     * Unsets the "restricao" element
     */
    void unsetRestricao();
    
    /**
     * Gets the "servico" element
     */
    long getServico();
    
    /**
     * Gets (as xml) the "servico" element
     */
    org.apache.xmlbeans.XmlLong xgetServico();
    
    /**
     * Sets the "servico" element
     */
    void setServico(long servico);
    
    /**
     * Sets (as xml) the "servico" element
     */
    void xsetServico(org.apache.xmlbeans.XmlLong servico);
    
    /**
     * Gets the "servicoERP" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP getServicoERP();
    
    /**
     * True if has "servicoERP" element
     */
    boolean isSetServicoERP();
    
    /**
     * Sets the "servicoERP" element
     */
    void setServicoERP(br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP servicoERP);
    
    /**
     * Appends and returns a new empty "servicoERP" element
     */
    br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP addNewServicoERP();
    
    /**
     * Unsets the "servicoERP" element
     */
    void unsetServicoERP();
    
    /**
     * Gets the "ssiCoCodigoPostal" element
     */
    java.lang.String getSsiCoCodigoPostal();
    
    /**
     * Gets (as xml) the "ssiCoCodigoPostal" element
     */
    org.apache.xmlbeans.XmlString xgetSsiCoCodigoPostal();
    
    /**
     * True if has "ssiCoCodigoPostal" element
     */
    boolean isSetSsiCoCodigoPostal();
    
    /**
     * Sets the "ssiCoCodigoPostal" element
     */
    void setSsiCoCodigoPostal(java.lang.String ssiCoCodigoPostal);
    
    /**
     * Sets (as xml) the "ssiCoCodigoPostal" element
     */
    void xsetSsiCoCodigoPostal(org.apache.xmlbeans.XmlString ssiCoCodigoPostal);
    
    /**
     * Unsets the "ssiCoCodigoPostal" element
     */
    void unsetSsiCoCodigoPostal();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep newInstance() {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
