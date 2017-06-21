package DOM;

//-------XML-related packages--------------------
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.io.File;
//-----------------------------------------------

public class HandlerDOM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File inputFile = new File("C:\\Users\\ZALLA\\Documents\\java\\XMLparaDOM.xml");
			
			//Always create a new instance of DocumentBuilderFactory (dBuilder)----
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			//----------------------------------------------------------------------
			
			//We create the document parsing the XML file.--
			Document doc = dBuilder.parse(inputFile);
			//----------------------------------------------
			
			
			//We normalize the XML document-------
			doc.getDocumentElement().normalize();
			//------------------------------------
			
			//First we get the root element-----------------------------------------------
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			//----------------------------------------------------------------------------
			
			//We have all nodes below the root in nList----------
			NodeList nList = doc.getElementsByTagName("student");
			//---------------------------------------------------
			
			System.out.println("----------------------------");
			
			
			for (int i = 0; i < nList.getLength(); i++) {
				
				Node nNode = nList.item(i);
				System.out.println("\nCurrent Element :" + nNode.getNodeName());
				
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					System.out.println("Student roll no : " + eElement.getAttribute("rollno"));
					System.out.println("First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
					System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
					System.out.println("Nick Name : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
					System.out.println("Marks : " + eElement.getElementsByTagName("marks").item(0).getTextContent());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
