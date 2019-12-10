
public class MonsterBuilder implements ClassBuilder {
	private Job job;
	private Weapon weapon;
	private int strength;
	private int dexterity;
	private int intellegence;
	private int vitality;
	
	@Override
	public void setJob(Job job) {
		// TODO Auto-generated method stub
		this.job = job;
	}

	@Override
	public void setWeapon(Weapon weapon) {
		// TODO Auto-generated method stub
		this.weapon = weapon;
	}
	@Override
	public void setStr(int str) {
		// TODO Auto-generated method stub
		this.strength = str;
	}

	@Override
	public void setDex(int dex) {
		// TODO Auto-generated method stub
		this.dexterity = dex;
	}

	@Override
	public void setIntel(int intel) {
		// TODO Auto-generated method stub
		this.intellegence = intel;
	}

	@Override
	public void setVit(int vitality) {
		// TODO Auto-generated method stub
		this.vitality = vitality;
	}

	public Monster getMonster() {
		return new Monster(job, weapon, strength, dexterity, intellegence, vitality);
	}
}
