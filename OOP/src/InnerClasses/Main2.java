
package InnerClasses;

class Outerclass{
    int x = 10 ;
    static class InnerClass{
        int y = 20;
    }
}

public class Main2 {
    public static void main(String[] arg){
        //Outerclass oo = new Outerclass();
        Outerclass.InnerClass oi = new Outerclass.InnerClass();
        System.out.println(oi.y);
        
    }
    
}
