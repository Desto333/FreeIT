package lesson_13;

import java.io.File;
import java.io.IOException;
import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.xml.sax.SAXException;

public class XSDValidator {
    public static void main(String[] args) {
        String pathXSD = "C:\\Users\\User\\IdeaProjects\\FreeIT\\lesson_13\\computerParts.xsd";
        String pathXML = "C:\\Users\\User\\IdeaProjects\\FreeIT\\lesson_13\\computerParts.xml";
        System.out.println("Result:" + validateXMLSchema(pathXSD, pathXML));
    }

    public static boolean validateXMLSchema(String xsdPath, String xmlPath) {
        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(xsdPath));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(xmlPath)));
        } catch (IOException | SAXException e) {
            System.out.println("Exception: " + e.getMessage());
            return false;
        }
        return true;
    }
}
