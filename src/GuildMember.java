import java.util.ArrayList;

public class GuildMember {
	private String guildName;
	private String rank;
	private Chara character;
	private ArrayList<GuildMember> guildMembers;
	
	public GuildMember(String guildName, Chara character) {
		this.guildName = guildName;
		this.rank = "guild member";
		this.character = character;
		guildMembers = new ArrayList<GuildMember>();		
	}
	
	public void addGuildMember(GuildMember guildMember) {
		guildMembers.add(guildMember);
	}
	
	public void removeGuildMember(GuildMember guildMember) {
		guildMembers.remove(guildMember);
	}
	
	public void setGuildLeader() {
		rank = "Guild Leader";
	}
	
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	public ArrayList<GuildMember> getGuildMembers(){
		return guildMembers;
	}
	
	public void printInfo() {
		System.out.println("Guild Name: " + guildName +
						   " Rank: " + rank +
						   " Character Stats: ");
		character.getStats();
		
		if(!(guildMembers.isEmpty())) {
			for(int i = 0; i < guildMembers.size(); i++)
				guildMembers.get(i).printInfo();
		}
	}
}
