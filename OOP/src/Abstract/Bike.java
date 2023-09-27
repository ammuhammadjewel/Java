
package Abstract;

public class Bike extends Vehicle
{
	int cost;
        String name;
        public Bike(String color,String  model,int cost,String name){
            super(color, model);
            this.cost = cost;
            this.name = name;
        }
        @Override
        void show(){
            System.out.println("Bike color: "+color);
            System.out.println("Bike model: "+model);
            System.out.println("Bike cost: "+cost);
            System.out.println("Bike name: "+name);
        
    }

    @Override
    void drive() {
        System.out.println("Bike is in drive mode");
    }

    @Override
    void stop() {
        System.out.println("Bike is in stop mode");
    }

    @Override
    void park() {
        System.out.println("Bike is in park mode");
    }
}