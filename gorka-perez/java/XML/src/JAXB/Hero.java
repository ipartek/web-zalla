package JAXB;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"heroName", "race", "heroClass", "Level"})

@XmlRootElement
public class Hero {
	String heroName;
	Race race;
	HeroClass heroClass;
	int Level;
	int id;
	
	
	public String getName() {
		return heroName;
	}
	@XmlElement
	public void setName(String name) {
		heroName = name;
	}
	public Race getRace() {
		return race;
	}
	@XmlElement
	public void setRace(Race race) {
		this.race = race;
	}
	public HeroClass getHeroClass() {
		return heroClass;
	}
	@XmlElement
	public void setHeroClass(HeroClass heroClass) {
		this.heroClass = heroClass;
	}
	public int getLevel() {
		return Level;
	}
	@XmlElement
	public void setLevel(int level) {
		Level = level;
	}
	public int getId() {
		return id;
	}

	@XmlAttribute
	public void setId(int id) {
		this.id = id;
	}
}
