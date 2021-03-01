
public class Kinder {
private StreamBefehl streamBefehl;
    
    //Aufrufer wird mit dem konkreten DruckBefehl über einen Setter geladen
    //Alternative: Konstruktor
    public void setStreamBefehl(StreamBefehl streamBefehl) {
        this.streamBefehl = streamBefehl;
    }

    public void streamAusloesen(String serie){
    	streamBefehl.ausfuehren(serie);
    }


}
