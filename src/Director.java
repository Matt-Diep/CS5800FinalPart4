
public class Director {
	public void buildArcher(ClassBuilder builder) {
		builder.setJob(Job.ARCHER);
		builder.setWeapon(Weapon.BOW);
		builder.setStr(7);
		builder.setDex(10);
		builder.setIntel(3);
		builder.setVit(5);
	}
	
	public void buildWarrior(ClassBuilder builder) {
		builder.setJob(Job.WARRIOR);
		builder.setWeapon(Weapon.AXE);
		builder.setStr(10);
		builder.setDex(6);
		builder.setIntel(2);
		builder.setVit(8);
	}
	
	public void buildMage(ClassBuilder builder) {
		builder.setJob(Job.MAGE);
		builder.setWeapon(Weapon.STAFF);
		builder.setStr(2);
		builder.setDex(4);
		builder.setIntel(12);
		builder.setVit(5);
	}
	
	public void buildRogue(ClassBuilder builder) {
		builder.setJob(Job.ROGUE);
		builder.setWeapon(Weapon.DAGGER);
		builder.setStr(7);
		builder.setDex(10);
		builder.setIntel(3);
		builder.setVit(5);
	}
	
	public void buildAxeEnemy(ClassBuilder builder) {
		builder.setJob(Job.ENEMY);
		builder.setWeapon(Weapon.AXE);
		builder.setStr(5);
		builder.setDex(5);
		builder.setIntel(1);
		builder.setVit(5);
	}
}
