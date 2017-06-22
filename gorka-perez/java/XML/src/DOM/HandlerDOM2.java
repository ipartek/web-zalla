package DOM;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;

public class HandlerDOM2 {

	public static void main(String[] args) {

		try {
			File file = new File("C:\\Users\\ZALLA\\Documents\\java\\XMLparaDOM.xml");

			DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();

			Document doc = dBuilder.parse(file);

			// We normalize the XML document-------
			doc.getDocumentElement().normalize();
			// ------------------------------------

			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

			if (doc.hasChildNodes()) {

				printNote(doc.getChildNodes());
				addSubject(doc);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void addSubject(Document doc) {
		for (int i = 0; i < doc.getElementsByTagName("student").getLength(); i++){
			
		Node student = doc.getElementsByTagName("student").item(i);
		// append a new node to staff
		
		Element subject = doc.createElement("subject");
		subject.appendChild(doc.createTextNode("clase de java"));
		
		student.appendChild(subject);
		}
	}

	private static void printNote(NodeList nodeList) {

		for (int count = 0; count < nodeList.getLength(); count++) {

			Node tempNode = nodeList.item(count);

			// make sure it's element node.
			if (tempNode.getNodeType() == Node.ELEMENT_NODE) {

				// get node name and value
				System.out.println("\nNode Name =" + tempNode.getNodeName() + " [OPEN]");
				System.out.println("Node Value =" + tempNode.getTextContent());

				if (tempNode.hasAttributes()) {

					// get attributes names and values
					NamedNodeMap nodeMap = tempNode.getAttributes();

					for (int i = 0; i < nodeMap.getLength(); i++) {

						Node node = nodeMap.item(i);
						System.out.println("attr name : " + node.getNodeName());
						System.out.println("attr value : " + node.getNodeValue());
					}
				}
				if (tempNode.hasChildNodes()) {

					// loop again if has child nodes
					printNote(tempNode.getChildNodes());
				}

				System.out.println("Node Name =" + tempNode.getNodeName() + " [CLOSE]");
			}
		}
	}
}
