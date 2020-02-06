package difficulty_simulation;

public class eth_sim implements Runnable{
	private int number = 0;
	private double time;
	private double delta;
	private double difficulty = 131072;
	private boolean finished = false;
	difficulty_eth e = new difficulty_eth();
	@Override
	public void run() {
		time = (double)System.currentTimeMillis()*1000;
		double nonce = 1;
		while (number < 50){
			System.out.println("Creazione blocco " + number + " al tempo " + (double)System.currentTimeMillis()*1000);
			delta = (double)System.currentTimeMillis()*1000 - time;
			difficulty = e.newDifficulty(difficulty, delta, number, false);
			while (100000000000.00/nonce > (Math.pow(2, 256))/difficulty){
				nonce++;
			}
			System.out.println("Blocco creato a difficoltà: " + difficulty+ " con nonce: " + nonce);
			System.out.println(delta);
			number++;
		}
		finished = true;
	}
	public boolean isFinished(){
		return finished;
	}
}
