package tec;


abstract public class PassagerAbstrait implements Passager,Usager {

    private String nom;
    private int destination;
    private Position maPosition;

    final private ArretComportement comportement;
    
    public PassagerAbstrait(String nom, int destination, ArretComportement comportement) {
        this.nom = nom;
        this.destination = destination;
        this.maPosition = Position.dehors();
	this.comportement=comportement;
    }

    public String nom() {
        return nom;
    }

    public boolean estDehors() {
        return maPosition.estDehors();
    }

    public boolean estAssis() {
        return maPosition.estAssis();
    }

    public boolean estDebout() {
        return maPosition.estDebout();
    }

    public void changerEnDehors() {
        maPosition = Position.dehors();
    }

    public void changerEnAssis() {
        maPosition = Position.assis();
    }

    public void changerEnDebout() {
        maPosition = Position.debout();
    }

    public void monterDans(Transport t) {
	Vehicule v=(Vehicule)t;
        choixPlaceMontee(v);
    }

    public void nouvelArret(Vehicule v, int numeroArret) {
        if (numeroArret == destination)
            v.arretDemanderSortie(this);
	comportement.choixPlaceArret(this,v,destination-numeroArret);
    }

    public String toString() {
        return nom + " " + maPosition;
    }

    abstract void choixPlaceMontee(Vehicule v);
}
