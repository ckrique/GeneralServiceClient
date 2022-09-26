/*
 * XML Type:  Bet
 * Namespace: http://services.soapworldcupbet.worldcupbet.com.br/xsd
 * Java type: br.com.worldcupbet.soapworldcupbet.services.xsd.Bet
 *
 * Automatically generated - do not modify.
 */
package br.com.worldcupbet.soapworldcupbet.services.xsd;


/**
 * An XML Bet(@http://services.soapworldcupbet.worldcupbet.com.br/xsd).
 *
 * This is a complex type.
 */
public interface Bet extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Bet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8B1AE84E7770563FF5CB0C8208925841").resolveHandle("beta7catype");
    
    /**
     * Gets the "betValue" element
     */
    double getBetValue();
    
    /**
     * Gets (as xml) the "betValue" element
     */
    org.apache.xmlbeans.XmlDouble xgetBetValue();
    
    /**
     * True if has "betValue" element
     */
    boolean isSetBetValue();
    
    /**
     * Sets the "betValue" element
     */
    void setBetValue(double betValue);
    
    /**
     * Sets (as xml) the "betValue" element
     */
    void xsetBetValue(org.apache.xmlbeans.XmlDouble betValue);
    
    /**
     * Unsets the "betValue" element
     */
    void unsetBetValue();
    
    /**
     * Gets the "punterName" element
     */
    java.lang.String getPunterName();
    
    /**
     * Gets (as xml) the "punterName" element
     */
    org.apache.xmlbeans.XmlString xgetPunterName();
    
    /**
     * Tests for nil "punterName" element
     */
    boolean isNilPunterName();
    
    /**
     * True if has "punterName" element
     */
    boolean isSetPunterName();
    
    /**
     * Sets the "punterName" element
     */
    void setPunterName(java.lang.String punterName);
    
    /**
     * Sets (as xml) the "punterName" element
     */
    void xsetPunterName(org.apache.xmlbeans.XmlString punterName);
    
    /**
     * Nils the "punterName" element
     */
    void setNilPunterName();
    
    /**
     * Unsets the "punterName" element
     */
    void unsetPunterName();
    
    /**
     * Gets the "teamOnWhichBet" element
     */
    java.lang.String getTeamOnWhichBet();
    
    /**
     * Gets (as xml) the "teamOnWhichBet" element
     */
    org.apache.xmlbeans.XmlString xgetTeamOnWhichBet();
    
    /**
     * Tests for nil "teamOnWhichBet" element
     */
    boolean isNilTeamOnWhichBet();
    
    /**
     * True if has "teamOnWhichBet" element
     */
    boolean isSetTeamOnWhichBet();
    
    /**
     * Sets the "teamOnWhichBet" element
     */
    void setTeamOnWhichBet(java.lang.String teamOnWhichBet);
    
    /**
     * Sets (as xml) the "teamOnWhichBet" element
     */
    void xsetTeamOnWhichBet(org.apache.xmlbeans.XmlString teamOnWhichBet);
    
    /**
     * Nils the "teamOnWhichBet" element
     */
    void setNilTeamOnWhichBet();
    
    /**
     * Unsets the "teamOnWhichBet" element
     */
    void unsetTeamOnWhichBet();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.com.worldcupbet.soapworldcupbet.services.xsd.Bet newInstance() {
          return (br.com.worldcupbet.soapworldcupbet.services.xsd.Bet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.xsd.Bet newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.com.worldcupbet.soapworldcupbet.services.xsd.Bet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.com.worldcupbet.soapworldcupbet.services.xsd.Bet parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.com.worldcupbet.soapworldcupbet.services.xsd.Bet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.xsd.Bet parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.worldcupbet.soapworldcupbet.services.xsd.Bet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.com.worldcupbet.soapworldcupbet.services.xsd.Bet parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.worldcupbet.soapworldcupbet.services.xsd.Bet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.xsd.Bet parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.worldcupbet.soapworldcupbet.services.xsd.Bet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.xsd.Bet parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.worldcupbet.soapworldcupbet.services.xsd.Bet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.xsd.Bet parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.worldcupbet.soapworldcupbet.services.xsd.Bet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.xsd.Bet parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.worldcupbet.soapworldcupbet.services.xsd.Bet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.xsd.Bet parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.worldcupbet.soapworldcupbet.services.xsd.Bet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.xsd.Bet parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.worldcupbet.soapworldcupbet.services.xsd.Bet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.xsd.Bet parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.worldcupbet.soapworldcupbet.services.xsd.Bet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.xsd.Bet parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.com.worldcupbet.soapworldcupbet.services.xsd.Bet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.xsd.Bet parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.worldcupbet.soapworldcupbet.services.xsd.Bet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.xsd.Bet parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.com.worldcupbet.soapworldcupbet.services.xsd.Bet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.com.worldcupbet.soapworldcupbet.services.xsd.Bet parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.worldcupbet.soapworldcupbet.services.xsd.Bet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.worldcupbet.soapworldcupbet.services.xsd.Bet parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.worldcupbet.soapworldcupbet.services.xsd.Bet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.worldcupbet.soapworldcupbet.services.xsd.Bet parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.worldcupbet.soapworldcupbet.services.xsd.Bet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
