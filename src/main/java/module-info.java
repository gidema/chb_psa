/**
 * 
 */
module passengerstopassignment {
    requires transitive jakarta.xml.bind;
    requires jakarta.activation;
    requires java.base;
    requires java.xml;
    exports nl.chb.psa;
    exports nl.chb.psa.binding;
    
    opens nl.chb.psa to jakarta.xml.bind;
}