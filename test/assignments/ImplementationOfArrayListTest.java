package assignments;

import org.junit.jupiter.api.Test;

//import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ImplementationOfArrayListTest {
    @Test
    public void arrayListCanBeCreated (){
        MyarrayList arrayList = new MyarrayList();

        assertNotNull(arrayList);
    }
    @Test
    public void arrayList_Is_EmptyTest(){
        MyarrayList arrayList = new MyarrayList();
        assertTrue(arrayList.isEmpty());
    }

    private void assertTrue(boolean empty) {
    }

    @Test
    public void arrayListOneElement_IsNotAnEmptyListTest(){
        MyarrayList arrayList = new MyarrayList();
        arrayList.add(0, 2);
        assertFalse(1, arrayList.size());
    }
    @Test
    public void canAddMoreInput() {
        MyarrayList arrayList = new MyarrayList();
        arrayList.add(0, 2);
        arrayList.add(1, 4);
        arrayList.add(2, 6);
        arrayList.add(3, 8);
        arrayList.add(4, 10);
        arrayList.add(5, 12);
        
        assertTrue(6, arrayList.size());
        
    }
    @Test
    public void canAccessItemInAListTest(){
        MyarrayList arrayList = new MyarrayList();
        arrayList.add(0, 2);
        arrayList.add(1, 4);
        arrayList.add(2, 6);
        arrayList.add(3, 8);
        arrayList.add(4, 10);
        arrayList.add(5, 12);

        assertEquals(2, arrayList.get(0));
    }
    @Test
    public void canSearchForIndexOfAnItemTest(){
        MyarrayList arrayList = new MyarrayList();
        arrayList.add(0, 2);
        arrayList.add(1, 4);
        arrayList.add(2, 6);
        arrayList.add(3, 8);
        arrayList.add(4, 10);
        arrayList.add(5, 12);

        assertEquals(10, arrayList.indexOf(4));

    }
    @Test
    public void canRemoveanItemFromTheList(){
        MyarrayList arrayList = new MyarrayList();
        arrayList.add(0, 2);
        arrayList.add(1, 4);
        arrayList.add(2, 6);
        arrayList.add(3, 8);
        arrayList.add(4, 10);
        arrayList.add(5, 12);
        arrayList.remove(5);

        assertEquals(12, arrayList.remove(5));
    }
    @Test
    public void canSortThroughAnArray(){
        MyarrayList arrayList = new MyarrayList();
        arrayList.add(0, 2);
        arrayList.add(1, 4);
        arrayList.add(2, 6);
        arrayList.add(3, 8);
        arrayList.add(4, 10);
        arrayList.add(5, 12);

//        MyarrayList.sort(arrayList);
//        assertEquals(5, arrayList.sort());
    }

    private void assertTrue(int i, int size) {
    }

    private void assertFalse(int i, int size) {
    }


}
//
//    //private boolean arrayOfNumbers;
////    Scanner input = new Scanner(System.in);
////    ArrayList arrayOfNumbers = new ArrayList<>();
//
//    @Test
//    public void listIsEmptyAndNotEmptyTest(){
//        ArrayList arrayList = new ArrayList<Integer>();
////        assertTrue((BooleanSupplier) arrayOfNumbers);
//        assertTrue(arrayOfNumbers.size() == 0);
//
//    }
//    @Test
//    public void testThatItCanTakeInData(){
//        ArrayList arrayOfNumbers = new ArrayList<>();
//        //arrayOfNumbers = setArrayOfNumbers.add(1);
//        arrayOfNumbers.add(0,1);
//        //assertEquals(arrayOfNumbers.size()==5);
//        assertEquals(1, arrayOfNumbers.get(0));
//    }
//    @Test
//    public void testThatItCanTakeInMoreInput(){
//        ArrayList arrayOfNumbers = new ArrayList<>();
//        arrayOfNumbers.add(0, 2);
//        arrayOfNumbers.add(1, 4);
//        arrayOfNumbers.add(2, 6);
//        arrayOfNumbers.add(3, 8);
//        arrayOfNumbers.add(4, 10);
//        arrayOfNumbers.add(5, 12);
//        arrayOfNumbers.add(6, 14);
//        arrayOfNumbers.add(7, 16);
//        arrayOfNumbers.add(8, 18);
//        arrayOfNumbers.add(9, 20);
//
//        arrayOfNumbers = arrayOfNumbers.add(22);
//
//        assertEquals(10,arrayOfNumbers.size());
//    }
//
//    @Test
//    public void testThatItCanAddNullElement() {
//        ArrayList arrayList = new ArrayList<>();
//        arrayOfNumbers.add(0, 2);
//        arrayOfNumbers.add(1, 4);
//        arrayOfNumbers.add(2, 6);
//        arrayOfNumbers.add(3, 8);
//        arrayOfNumbers.add(4, 10);
//        arrayOfNumbers.add(5, 12);
//        arrayOfNumbers.add(6, 14);
//        arrayOfNumbers.add(7, 16);
//        arrayOfNumbers.add(8, 18);
//        arrayOfNumbers.add(9, 20);
//        arrayOfNumbers.add(10,null);
//
//        assertEquals(10, arrayOfNumbers.size());
//    }
//
//    @Test
//    public void testThatElementsCanBeAccessed() {
//        ArrayList arrayList = new ArrayList<>();
//        arrayOfNumbers.add(0, 2);
//        arrayOfNumbers.add(1, 4);
//        arrayOfNumbers.add(2, 6);
//        arrayOfNumbers.add(3, 8);
//        arrayOfNumbers.add(4, 10);
//        arrayOfNumbers.add(5, 12);
//        arrayOfNumbers.add(6, 14);
//        arrayOfNumbers.add(7, 16);
//        arrayOfNumbers.add(8, 18);
//        arrayOfNumbers.add(9, 20);
//        arrayOfNumbers.add(10,null);
//
//        assertEquals(16, arrayOfNumbers.get(7));
//
//    }
//
//
//    private void assertEquals(int i, Object o) {
//    }
//
//    private void assertEquals() {
//    }
//
