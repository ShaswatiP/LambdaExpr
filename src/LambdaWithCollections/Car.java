package LambdaWithCollections;

import java.util.*;

public class Car {
    String carName;
    String carType;

    public Car(String carName, String carType) {
        this.carName = carName;
        this.carType = carType;
    }
    public String toString(){
        return this.carName+" "+this.carType;
    }
}

class LambdaWithCollectionObject{
public static void main(String[] args){
    List<Car> cars = new ArrayList<>();
    cars.add(new Car("SUV","Diesel"));
    cars.add(new Car("Mercedres","Petrol"));
    cars.add(new Car("Ertiga","CNG"));
    cars.sort(new Comparator<Car>() {
        @Override
        public int compare(Car o1, Car o2) {
            return o1.carType.compareTo(o2.carType);
        }
    });
    cars.stream().forEach(car -> System.out.println(car.toString()));
    Collections.sort(cars,(Car c1, Car c2) -> c2.carType.compareTo(c1.carType));
    cars.stream().forEach(car -> System.out.println(car.toString()));
    
    Car[] arcar = new Car[3];
    arcar[0] = new Car("SUV","Diesel");
    arcar[2] = new Car("Mercedres","Petrol");
    arcar[1] = new Car("Ertiga","CNG");


    Arrays.sort(arcar,(Car c1,Car c2) -> c1.carName.compareTo(c2.carName));
}
}