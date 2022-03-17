package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingBasketTest {

    @Test
    public void totalOfEmptyBasket() {

        //given
        ShopingBasket basket = new ShopingBasket();
        //when
        //ascert
        assertEquals(0.0, basket.getTotal(), 0.0);
    }
}
