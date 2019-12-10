
public class Chara {
	private Job job;
	private Weapon weapon;
	private int strength;
	private int dexterity;
	private int intellegence;
	private int vitality;
	
	public Chara(Job job, Weapon weapon, int strength, int dex, int intellegence, int vitality) {
		this.job = job;
		this.weapon = weapon;
		this.strength = strength;
		this.dexterity = dex;
		this.intellegence = intellegence;
		this.vitality = vitality;
	}
	
	public Job getJob(){
		return job;
	}
	
	public Weapon getWeapon() {
		return weapon;
	}
	
	public int getStr() {
		return strength;
	}
	
	public int getDex() {
		return dexterity;
	}
	
	public int getInt() {
		return intellegence;
	}
	
	public int getVit() {
		return vitality;
	}
	
	public void getStats() {
		System.out.println(
						   "Str:" + Integer.toString(strength)+
						   " Dex:" + Integer.toString(dexterity)+
						   " Int:" + Integer.toString(intellegence)+
						   " Vit:" + Integer.toString(vitality)
						   );
	}
	
	public void attack() {
		System.out.println("uses " + weapon.name());
	}
}
