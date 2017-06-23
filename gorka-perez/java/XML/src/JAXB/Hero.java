package JAXB;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"name", "race", "heroClass", "level"})

@XmlRootElement
public class Hero {
	String name;
	Race race;
	HeroClass heroClass;
	int level;
	int id;
	
	public String getName() {
		return this.name;
	}
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	public Race getRace() {
		return this.race;
	}
	@XmlElement
	public void setRace(Race race) {
		this.race = race;	
	}
	public HeroClass getHeroClass() {
		return this.heroClass;
	}
	@XmlElement
	public void setHeroClass(HeroClass heroClass) {
		this.heroClass = heroClass;
	}
	public int getLevel() {
		return this.level;
	}
	@XmlElement
	public void setLevel(int level) {
		this.level = level;
	}
	public int getId() {
		return this.id;
	}
	@XmlAttribute
	public void setId(int id) {
		this.id = id;
	}
}
