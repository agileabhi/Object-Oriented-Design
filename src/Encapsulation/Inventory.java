package Encapsulation;

import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Guitar> listOfGuitars;
    public void addGuitar(Guitar guitar){
        this.listOfGuitars.add(guitar);
    }

    public Inventory(){
        this.listOfGuitars = new LinkedList<>();
    }

    public List<Guitar> search(GuitarSpec spec){
        List<Guitar> matchingGuitars = new LinkedList<>();
        for(Guitar guitar:listOfGuitars){
            if(guitar.getSpec().equals(spec)){
                matchingGuitars.add(guitar);
            }
        }
        return matchingGuitars;
    }
}
