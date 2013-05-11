package pl.juglodz.losowanie;

import java.io.*;
import java.util.List;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.*;

public class ZapisXml {
    public static void saverXml(List<Osoba> osoby)  throws Exception {
    	
    
        DocumentBuilderFactory factory =
            DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        // Here instead of parsing an existing document we want to
        // create a new one.
        Document testDoc = builder.newDocument();
        Element elOsoby = testDoc.createElement("osoby");
        for (Osoba osoba : osoby) {
        	// This creates a new tag named 'testElem' inside
        	// the document and sets its data to 'TestContent'
        	Element elOsoba = testDoc.createElement("osoba");
        	Element elImie = testDoc.createElement("imie");
        	elImie.setTextContent(osoba.getImie());
        	elOsoby.appendChild(elImie);
        	Element elNazw = testDoc.createElement("nazwisko");
        	elNazw.setTextContent(osoba.getNazwisko());
        	elOsoby.appendChild(elNazw);
        	elOsoby.appendChild(elOsoba);
		}
        testDoc.appendChild(elOsoby);

        // The XML document we created above is still in memory
        // so we have to output it to a real file.
        // In order to do it we first have to create
        // an instance of DOMSource
        DOMSource source = new DOMSource(testDoc);

        // PrintStream will be responsible for writing
        // the text data to the file
        PrintStream ps = new PrintStream("test2.xml");
        StreamResult result = new StreamResult(ps);

        // Once again we are using a factory of some sort,
        // this time for getting a Transformer instance,
        // which we use to output the XML
        TransformerFactory transformerFactory = TransformerFactory
            .newInstance();
        Transformer transformer = transformerFactory.newTransformer();

        // The actual output to a file goes here
        transformer.transform(source, result);
    }
}