package com.helios.tools;

import java.io.IOException;

import javax.xml.transform.TransformerException;

import org.w3c.dom.Document;

public class FormatterUtils {
	
	@SuppressWarnings("deprecation")
	public String printResutls(Document doc) throws TransformerException, IOException {

		java.io.ByteArrayOutputStream data = new java.io.ByteArrayOutputStream();
		java.io.PrintStream ps = new java.io.PrintStream(data);

		org.apache.xml.serialize.OutputFormat of = new org.apache.xml.serialize.OutputFormat("XML", "ISO-8859-1", true);
		of.setIndent(1);
		of.setIndenting(true);
		org.apache.xml.serialize.XMLSerializer serializer = new org.apache.xml.serialize.XMLSerializer(ps, of);
		// As a DOM Serializer
		serializer.asDOMSerializer();
		serializer.serialize(doc); 

		System.out.println(data.toString());
		return data.toString();

	}

}
