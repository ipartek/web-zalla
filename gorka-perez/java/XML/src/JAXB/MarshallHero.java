package JAXB;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

	public class MarshallHero {

	public static void main(String[] args) {
		
		Hero redSonja = new Hero();
		redSonja.setId(1);
		redSonja.setName("Red Sonja");
		redSonja.setRace(Race.Human);
		redSonja.setHeroClass(HeroClass.warrior);
		redSonja.setLevel(120);
		
		Hero dritz = new Hero();
		dritz.setId(2);
		dritz.setName("Dritz Dourden");
		dritz.setRace(Race.Elf);
		dritz.setHeroClass(HeroClass.Rogue);
		dritz.setLevel(200);
		
		Heroes heroesList = new Heroes();
		heroesList.add(redSonja);
		heroesList.add(dritz);
		
		try{	
			JAXBContext jaxbContext = JAXBContext.newInstance(Heroes.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(heroesList, new File("C:\\Users\\ZALLA\\Documents\\java\\Heroes.xml"));
			jaxbMarshaller.marshal(heroesList, System.out);
			
		}catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
