package difficulty_simulation;

public class blockchainSim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(System.currentTimeMillis()*1000);
		eth_sim ES = new eth_sim();
		ES.run();
		while(ES.isFinished()){
			
		}
		System.out.println("50 blocchi finiti");
		
	}

}
