
package InnerClasses;

class OuterClass{
    int x = 10;
    class InnerClass{
    int y = 20;
    }
}


public class Main1 {
    public static void main(String[] args){
        OuterClass o = new OuterClass();
        OuterClass.InnerClass i = o.new InnerClass();
        System.out.println(o.x + i.y);
    }
  
}
