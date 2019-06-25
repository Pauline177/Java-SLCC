//Pauline Makoma

package weight;

public class Planet {

    private String planetName;
    private double gravity;

    public Planet(String pn, double g){
        planetName = pn;
        gravity = g;
    }

    public String getPlanetName(){
        return planetName ;
    }

    public double getGravity(){
       return  gravity;
    }

    public double calcWeight(double m){
       return gravity * m;
    }
}
