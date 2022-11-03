package tec;

class ArretCalme implements ArretComportement{
    private final static ArretCalme CALME=new ArretCalme();
    public static ArretCalme obtenirInstance(){
	return CALME;
    }
    private ArretCalme(){}
    public void choixPlaceArret(Passager p, Vehicule v, int distanceDestination){}
}
