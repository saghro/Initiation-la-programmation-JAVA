
package serie4.testinterface;

public class Chien implements Animal{

    @Override
    public void manger() {
        System.out.println("je leche les os ");
    }

    @Override
    public void dormir() {
        
    }

    @Override
    public void crier() {
        System.out.println("j'abois");
    }

    @Override
    public void bouger() {
        System.out.println("je cours");
    }
    
}
