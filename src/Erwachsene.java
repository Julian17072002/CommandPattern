
public class Erwachsene {
private StreamBefehl streamBefehl;
    
    //Aufrufer wird mit dem konkreten DruckBefehl über einen Setter geladen
    //Alternative: Konstruktor
    public void setStreamBefehl(StreamBefehl streamBefehl) {
        this.streamBefehl = streamBefehl;
    }

    public void druckAusloesen(String serie){
    	streamBefehl.ausfuehren(serie);
    }
}
