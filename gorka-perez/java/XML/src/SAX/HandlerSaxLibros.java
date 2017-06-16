package SAX;

import org.xml.sax.Attributes;  
import org.xml.sax.SAXException;  
import org.xml.sax.helpers.DefaultHandler;  
  
/** 
 * Clase que procesa los eventos SAX al leer el xml de un libro. 
 * Guardará todos los datos obtenidos del xml en el objeto libro, 
 * el cual se pasa en el constructor. 
 *  
 * @author Xela 
 * 
 */  
public class HandlerSaxLibros extends DefaultHandler{  
  
   private String valor = null;  
     
   private Libro libro;  
     
   public HandlerSaxLibros(Libro libro){  
      this.libro=libro;  
   }  
     
   @Override  
   public void startElement(String uri, String localName, String name,  
         Attributes attributes) throws SAXException {  
        
      // Limpiamos la variable temporal.  
      valor=null;  
        
      // Si la etiqueta es libro leemos el atributo isbn  
      if(localName.equals("libro")){  
         String isbn = attributes.getValue("isbn");  
         // Lo guardamos en el objeto libro  
         libro.setIsbn(isbn);  
      }  
   }  
     
   @Override  
   public void characters(char[] ch, int start, int length)  
         throws SAXException {  
      // Guardamos el texto en la variable temporal  
      valor = new String(ch,start,length);  
   }  
  
   @Override  
   public void endElement(String uri, String localName, String name)  
         throws SAXException {  
      // Según la etiqueta guardamos el valor leido   
      // en una propiedad del objeto libro  
      if (localName.equals("titulo")){  
         libro.setTitulo(valor);  
         
      }else if (localName.equals("autor")){  
         libro.setAutor(valor);  
         
      }else if (localName.equals("anyo")){  
         libro.setAnyo(valor);  
         
      }else if (localName.equals("editorial")){  
         libro.setEditorial(valor);  
      }  
        
   }  
  
}  

