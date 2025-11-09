package in.Coding;

import in.Coding.Inheritance.Vehicle;

public class TwoWheeler extends Vehicle {
    public TwoWheeler(){
        setnumberOfTires(2);
       numberOfTires = 4;
   }
    public void balance(){
        System.out.println("I am balancing on two tires");
    }

}
