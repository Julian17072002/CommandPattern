
public class Main {

	public static void main(String[] args) {
		AmazonPrime amazonPrime = new AmazonPrime();
		Netflix netflix = new Netflix();
		DisneyPlus disneyPlus = new DisneyPlus();
		ARDPlus ardplus = new ARDPlus();

		Kinder kinder = new Kinder();
		kinder.setStreamBefehl(new NetflixBefehl(netflix));

		kinder.streamAusloesen("Family Guy");

		kinder.setStreamBefehl(new ARDPlusBefehl(ardplus));

		kinder.streamAusloesen("Tatort");
	}

}
