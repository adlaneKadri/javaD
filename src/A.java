import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Element;

public class A {
    public static void main(String[] args) throws ParserConfigurationException {
        XmlFile xmlFile = new XmlFile("Adlane");
for (int i = 1 ; i< 4; i++ ) {
    Element a1 =  xmlFile.appendXMLroot(xmlFile.root, "adlane1");
    Element a2 =  xmlFile.appendXMLroot(xmlFile.root,"adlane2");
    Element a3 = xmlFile.appendXMLroot(xmlFile.root,"adlane3");
    xmlFile.appendXMLattribut(a1, "aa1", "1");
    xmlFile.appendXMLattribut(a1, "aa3", "2");
    xmlFile.appendXMLattribut(a1, "aa4", "3");

    xmlFile.appendXMLattribut(a2, "a2a2a2", "3333");
    xmlFile.appendXMLattribut(a2, "a2a932113", "300");
    if (i==1)
        xmlFile.appendXMLattribut(a2, "a2a2a99", "1233");
    if(i==2)
    xmlFile.appendXMLattribut(a2, "a2a2as", "3993");

    xmlFile.appendXMLattribut(a3, "sh", "op");
    xmlFile.appendXMLattribut(a3, "hello", "world");
}
        xmlFile.buildXMLfile();
    }
}
