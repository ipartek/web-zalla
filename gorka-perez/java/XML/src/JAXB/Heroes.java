package JAXB;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "Heroes")
public class Heroes {
	
	List<Hero> heroes;

	@XmlElement(name = "Hero")
	public void setHeroes(List<Hero> heroes) {
		this.heroes = heroes;
	}
	
	public List<Hero> getHeroes() {
		return heroes;
	}

	public void add(Hero hero) {
		if (this.heroes == null) {
			this.heroes = new ArrayList<Hero>();
		}
		this.heroes.add(hero);
	}
}
