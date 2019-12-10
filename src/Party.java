import java.util.ArrayList;

public class Party {
	private String partyName;
	private ArrayList<Chara> characters;
	
	public Party(String name) {
		this.partyName = name;
		characters = new ArrayList<Chara>();
	}
	
	public String getPartyName() {
		return partyName;
	}
	
	public void addPartyMember(Chara character) {
		characters.add(character);
	}
	
	public ArrayList<Chara> getCharacter(){
		return this.characters;
	}
	
	public Iterator getIterator() {
		return new StatIterator(this);
	}
	
}
