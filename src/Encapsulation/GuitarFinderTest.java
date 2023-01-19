package Encapsulation;

import java.util.Collections;
import java.util.List;

public class GuitarFinderTest {
    public static void main(String[] args){
        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        GuitarSpec searchedGuitar = new GuitarSpec(Builder.HAMER,"solid body",Wood.INDIAN_ROSEWOOD,Wood.ALDER,Type.ELECTRIC);
        List<Guitar> availableGuitars = inventory.search(searchedGuitar);
        if(!availableGuitars.isEmpty()){
            System.out.println("!!You May Like These!! "+ availableGuitars.toString() );
        }
    }

    private static void initializeInventory(Inventory inventory) {
        Guitar guitar = new Guitar(10000.0,123L,new GuitarSpec(Builder.HAMER,"solid body",Wood.INDIAN_ROSEWOOD,Wood.ALDER,Type.ELECTRIC));
        inventory.addGuitar(guitar);
    }
}
