package difficulty_simulation;

public class difficulty_bit {
	public double newDifficulty(double OldDifficulty, double delta){
		double difficulty = 0;
		difficulty = OldDifficulty * (60*24*14/delta);
		return difficulty;
	}
}
