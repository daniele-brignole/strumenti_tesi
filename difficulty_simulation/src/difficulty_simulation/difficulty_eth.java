package difficulty_simulation;

public class difficulty_eth {
	public double newDifficulty(double OldDifficulty, double delta, double numBlocks, boolean uncle){
		double difficulty = 0;
		double x = Math.floor(OldDifficulty/2048);
		int y = uncle ? 2 : 1;
		double c = Math.max(y - Math.floor(delta/9),-99);
		double Hi = Math.max(numBlocks - 3000000,0);
		double Epsilon = Math.pow(2,Math.floor(Hi/100000)-2);
		
		difficulty = OldDifficulty + x * c + Epsilon;
		
		return difficulty;
	}
}
