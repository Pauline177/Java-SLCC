//Pauline Makoma
package weight;

public class WeightDriver {

    public static void main(String[] args){

        Planet Earth = new Planet("Earth", 9.78);
        Planet Mars = new Planet("Mars", 3.71);

        System.out.printf("%s %18s", "Planet Name", "Gravity");
        System.out.printf("\n%s  %20s", Earth.getPlanetName(), Earth.getGravity());
        System.out.printf("\n%s  %21s", Mars.getPlanetName(), Mars.getGravity());

        System.out.println("\n\n\nWeight for mass 22.49");


        System.out.printf("%s   : %.6f", Earth.getPlanetName(),Earth.calcWeight(22.49));
        System.out.printf("\n%s    : %.6f", Mars.getPlanetName(), Mars.calcWeight(22.49));



    }
}
