/*
 * XML Type:  blocking-rounds
 * Namespace: http://configuration.openempi.openhie.org/sorted-neighborhood-blocking
 * Java type: org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRounds
 *
 * Automatically generated - do not modify.
 */
package org.openhie.openempi.configuration.xml.sortedneighborhoodblocking;


/**
 * An XML blocking-rounds(@http://configuration.openempi.openhie.org/sorted-neighborhood-blocking).
 *
 * This is a complex type.
 */
public interface BlockingRounds extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BlockingRounds.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6F7DFAC2F442F1EFDB0E036D08E1C84A").resolveHandle("blockingroundsf628type");
    
    /**
     * Gets array of all "blocking-round" elements
     */
    org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRound[] getBlockingRoundArray();
    
    /**
     * Gets ith "blocking-round" element
     */
    org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRound getBlockingRoundArray(int i);
    
    /**
     * Returns number of "blocking-round" element
     */
    int sizeOfBlockingRoundArray();
    
    /**
     * Sets array of all "blocking-round" element
     */
    void setBlockingRoundArray(org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRound[] blockingRoundArray);
    
    /**
     * Sets ith "blocking-round" element
     */
    void setBlockingRoundArray(int i, org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRound blockingRound);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "blocking-round" element
     */
    org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRound insertNewBlockingRound(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "blocking-round" element
     */
    org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRound addNewBlockingRound();
    
    /**
     * Removes the ith "blocking-round" element
     */
    void removeBlockingRound(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRounds newInstance() {
          return (org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRounds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRounds newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRounds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRounds parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRounds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRounds parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRounds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRounds parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRounds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRounds parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRounds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRounds parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRounds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRounds parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRounds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRounds parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRounds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRounds parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRounds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRounds parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRounds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRounds parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRounds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRounds parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRounds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRounds parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRounds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRounds parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRounds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRounds parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRounds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRounds parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRounds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRounds parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openhie.openempi.configuration.xml.sortedneighborhoodblocking.BlockingRounds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
