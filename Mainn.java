package serie4.mainn;

public class Mainn {

    public static void main(String[] args) {
       Voiture voiture1 = new Voiture("dacia", "logan", "2010");
       Camoin camion1 = new Camoin("wimhmu","buy", "1999");
       voiture1.accelerer();
        System.out.println(camion1);
        System.out.println(voiture1.getVitesse());
    }
}
