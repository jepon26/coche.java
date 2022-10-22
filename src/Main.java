public class Main {
    public static void main(String[] args){
        Car myCar = new Car();

        myCar.sumdoors();
        System.out.println(myCar.doors);

    }
}

class Car {
    public int doors = 4;
        public void sumdoors(){
        this.doors++;

        }
        }
