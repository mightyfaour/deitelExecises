package chapterFour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GasMileageTest {
    @Test
    public void canCalculateMilesPerGallonTest (){
        GasMileage gasMileage = new GasMileage (100, 20);
        gasMileage.setMilesPerGallon();
        assertEquals(5.0, gasMileage.getMilesPerGallon());

    }

    @Test
    public void canCalculateCombinedMilesPerGallonTest (){
        GasMileage gasMileage = new GasMileage (100, 20);
        GasMileage gasMileage1 = new GasMileage (600, 10);
        GasMileage gasMileage2 = new GasMileage (200, 8);
        GasMileage gasMileage3 = new GasMileage (-1, 8);
        gasMileage.setMilesPerGallon();
        assertEquals(5.0, gasMileage.getMilesPerGallon());

    }
}
