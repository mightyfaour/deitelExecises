package chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PetrolPurchaseTest {
   private PetrolPurchase1 station;
    @BeforeEach
       public void startWith(){ station = new PetrolPurchase1("noWhere","noneYet", 0, 0, 0);}
    @Test
    public void canCreatePetrolPurchase(){
        assertNotNull(station);
    }

    @Test
    public void canGetStationLocation(){

        station.getLocation("Oando");
        assertEquals("Oando", station.getLocation("Oando"));
    }

    @Test
    public void canGetPetrolType(){

        station.setPetrolType("Kerosene");
        assertEquals("Kerosene", station.getPetrolType());
        station.setPetrolType("diesel");
        assertEquals("diesel", station.getPetrolType());

    }

    @Test
    public void canGetQuantityAmount(){

        station.getPetrolType("kerosene");
        station.setQuantity(150);
        assertEquals(150, station.getQuantity());
    }
    
    @Test
    public void canGetPricePerLitre() {

        station.getPetrolType("kerosene");
        station.setPrice(120);
        assertEquals(120,station.getPrice());
    }

    @Test
    public void canGetPercentageDiscount() {

        station.getPetrolType("kerosene");
        station.setPercentageDiscount(114);
        assertEquals(114,station.getPercentageDiscount());
    }

    @Test
    public void getPurchasedAmount() {

        station.getPetrolType("kerosene");
        station.setQuantity(10);
        station.setPrice(120);
        station.setPurchasedAmount(1200.0, 5);
        assertEquals(1140, station.getPurchasedAmount());
    }


}
