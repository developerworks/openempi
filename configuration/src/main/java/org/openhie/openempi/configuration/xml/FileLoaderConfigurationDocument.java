/*
 * An XML document type.
 * Localname: file-loader-configuration
 * Namespace: http://configuration.openempi.openhie.org/mpiconfig
 * Java type: org.openhie.openempi.configuration.xml.FileLoaderConfigurationDocument
 *
 * Automatically generated - do not modify.
 */
package org.openhie.openempi.configuration.xml;


/**
 * A document containing one file-loader-configuration(@http://configuration.openempi.openhie.org/mpiconfig) element.
 *
 * This is a complex type.
 */
public interface FileLoaderConfigurationDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FileLoaderConfigurationDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6F7DFAC2F442F1EFDB0E036D08E1C84A").resolveHandle("fileloaderconfiguration49a4doctype");
    
    /**
     * Gets the "file-loader-configuration" element
     */
    org.openhie.openempi.configuration.xml.FileLoaderConfigurationType getFileLoaderConfiguration();
    
    /**
     * Sets the "file-loader-configuration" element
     */
    void setFileLoaderConfiguration(org.openhie.openempi.configuration.xml.FileLoaderConfigurationType fileLoaderConfiguration);
    
    /**
     * Appends and returns a new empty "file-loader-configuration" element
     */
    org.openhie.openempi.configuration.xml.FileLoaderConfigurationType addNewFileLoaderConfiguration();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.openhie.openempi.configuration.xml.FileLoaderConfigurationDocument newInstance() {
          return (org.openhie.openempi.configuration.xml.FileLoaderConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.openhie.openempi.configuration.xml.FileLoaderConfigurationDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.openhie.openempi.configuration.xml.FileLoaderConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.openhie.openempi.configuration.xml.FileLoaderConfigurationDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.FileLoaderConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.FileLoaderConfigurationDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.FileLoaderConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.openhie.openempi.configuration.xml.FileLoaderConfigurationDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.FileLoaderConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.FileLoaderConfigurationDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.FileLoaderConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.FileLoaderConfigurationDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.FileLoaderConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.FileLoaderConfigurationDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.FileLoaderConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.FileLoaderConfigurationDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.FileLoaderConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.FileLoaderConfigurationDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.FileLoaderConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.FileLoaderConfigurationDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.FileLoaderConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.FileLoaderConfigurationDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.FileLoaderConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.FileLoaderConfigurationDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.FileLoaderConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.FileLoaderConfigurationDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.FileLoaderConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.FileLoaderConfigurationDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.FileLoaderConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.FileLoaderConfigurationDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.FileLoaderConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openhie.openempi.configuration.xml.FileLoaderConfigurationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openhie.openempi.configuration.xml.FileLoaderConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openhie.openempi.configuration.xml.FileLoaderConfigurationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openhie.openempi.configuration.xml.FileLoaderConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
