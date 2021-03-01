
public interface StreamBefehl {
	 public void ausfuehren(String streamen);
		
}
	
	class NetflixBefehl implements StreamBefehl{
	    private Netflix streamen;
	    
	    //Der Befehl wird seinem Zieldrucker bei Instanziierung bekannt gemacht
	    public NetflixBefehl(Netflix streamen) {
	        this.streamen = streamen;
	    }

	    public void ausfuehren(String serie) {
	    	streamen.konfigurieren();
	    	streamen.streamen(serie);
	    }
	}
	class AmazonPrimeBefehl implements StreamBefehl{
	    private AmazonPrime streamen;
	    
	    //Der Befehl wird seinem Zieldrucker bei Instanziierung bekannt gemacht
	    public AmazonPrimeBefehl(AmazonPrime streamen) {
	        this.streamen = streamen;
	    }
	    
	    public void ausfuehren(String serie) {
	    	streamen.streamen(serie);
	    }
	}
	class ARDPlusBefehl implements StreamBefehl{
	    private ARDPlus streamen;
	    
	    //Der Befehl wird seinem Zieldrucker bei Instanziierung bekannt gemacht
	    public ARDPlusBefehl(ARDPlus streamen) {
	        this.streamen = streamen;
	    }
	    
	    public void ausfuehren(String serie) {
	    	
	        streamen.streamen(serie);
	    }
	}
	class DisneyPlusBefehl implements StreamBefehl{
	    private DisneyPlus streamen;
	    
	    //Der Befehl wird seinem Zieldrucker bei Instanziierung bekannt gemacht
	    public DisneyPlusBefehl(DisneyPlus streamen) {
	        this.streamen = streamen;
	    }
	    
	    public void ausfuehren(String serie) {
	    	streamen.streamen(serie);
	    }
	}			