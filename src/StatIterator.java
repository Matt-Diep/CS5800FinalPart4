
public class StatIterator implements Iterator {
	private Party party;
	private int currentPosition = 0;
	
	public StatIterator(Party party) {
		// TODO Auto-generated constructor stub
		this.party = party;
	}
	
	@Override
	public void getNextCharaStats() {
		// TODO Auto-generated method stub
		party.getCharacter().get(currentPosition).getStats();
		currentPosition++;
	}

	@Override
	public boolean done() {
		// TODO Auto-generated method stub
		return currentPosition >= party.getCharacter().size();
	}

}
