package InnerClasses;
class outerclass{
    int x = 10 ;
    class innerclass{
        public int myinnerclass(){
            return x;
        }
    }
}
public class Main3 {
    public static void main(String[] arg){
        outerclass ooo = new outerclass();
        outerclass.innerclass oi = ooo.new innerclass();
        System.out.println(oi.myinnerclass());
    } 
}