
package inheritance;

public class Interface3 implements Interface1,Interface2 {
    @Override
    public void play(){
        System.out.println("Interface3 implements Interface1,Interface2");
    }
    
}
