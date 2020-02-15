public class Car {
    //instance variable
    int maxSpeed = 200;
    int minSpeed = 50;
    double weight = 1000;
    boolean isEngineOn = false;
    char condition = 'A';
    int maxPeople = 4;

    public void pVar() {
        //save and read variables
        System.out.println(maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isEngineOn);
        System.out.println(condition);
    }

    public void travelLight() {
        weight = 100;
    }

    public void checkEngine() {
        if (!isEngineOn) {
            isEngineOn = true;
        }
    }

    public static void main(String[] args) {
        //new object of car
        Car car = new Car(), newCar = new Car(), oldCar = new Car();
        car.pVar();
        car = newCar;
        newCar.travelLight();


    }


}
