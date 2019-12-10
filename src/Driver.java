
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Director director = new Director();
		CharacterBuilder charaBuilder = new CharacterBuilder();
		director.buildArcher(charaBuilder);
		
		Chara character = charaBuilder.getChara();
		character.getStats();
		
		director.buildMage(charaBuilder);
		
		Chara mageCharacter = charaBuilder.getChara();
		mageCharacter.getStats();
		
		System.out.println("________");
		
		Party party = new Party("Party Squad");
		party.addPartyMember(character);
		party.addPartyMember(mageCharacter);
		
		Iterator iter = party.getIterator();
		while(!iter.done()) {
			iter.getNextCharaStats();
		}
		
		System.out.println("___________");
		
		GuildMember tempGuild = new GuildMember("TOP", mageCharacter);
		GuildMember tempGuild2 = new GuildMember("TOP", character);
		tempGuild.addGuildMember(tempGuild2);
		tempGuild.printInfo();
	}

}
