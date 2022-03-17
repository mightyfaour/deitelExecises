package assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelevisionTest {
        @Test
        public void tvExistsTest() {

            Television tv = new Television();
            assertNotNull(tv);
        }

        @Test
        public void testThatTvIsOn() {
            Television tv = new Television();
            tv.setisOn();
            assertTrue(tv.isOn());
        }

        @Test
        public void testThatTvIsOnOff() {
            Television tv = new Television();
            tv.setisOn();
            assertTrue(tv.isOn());
            tv.setisOn();
            assertFalse(tv.isOn());
        }


        @Test
        public void testThatVolumeCanBeIncreased() {
            Television tv = new Television();
            tv.setisOn();
            int volume = 1;
            while (volume <= 100) {
                tv.increaseVolume();
                volume++;
            }
            assertEquals(100, tv.getVolume());
        }

        @Test
        public void testThatVolumeCanBeDecrease() {
            Television tv = new Television();
            tv.setisOn();
            int increaseVolume = 0;
            while (increaseVolume < 10) {
                tv.increaseVolume();
                increaseVolume ++;
            }
               int decreaseVolume = 1;
                while (decreaseVolume < 5) {
                    tv.decreaseVolume();
                    decreaseVolume ++;

                }

                assertEquals(6, tv.getVolume());
            }



        @Test
        public void testThatStationCanBeSet() {
            Television tv = new Television();
            tv.isOn();
            tv.setStation(16);
            assertEquals(16,tv.getStation());}

        @Test
        public void testThatStationCanIncrease() {
            Television tv = new Television();
            tv.isOn();
            tv.increaseStation();
            tv.increaseStation();
            tv.increaseStation();
            tv.increaseStation();
            tv.increaseStation();
            tv.increaseStation();
            tv.increaseStation();
            tv.increaseStation();
            tv.increaseStation();
            tv.increaseStation();
            tv.increaseStation();
            tv.increaseStation();
            assertEquals(12,tv.getStation());
        }

        @Test
        public void testThatSationCanBeDecrease() {
            Television tv = new Television();
            tv.setisOn();
            tv.increaseStation();
            tv.increaseStation();
            tv.increaseStation();

            tv.increaseStation();
            tv.increaseStation();
            tv.increaseStation();
            tv.increaseStation();
            tv.increaseStation();
            tv.increaseStation();
            tv.increaseStation();
            tv.increaseStation();
            tv.increaseStation();
            tv.increaseStation();
            tv.increaseStation();
            tv.increaseStation();
            tv.decreaseStation();
            tv.decreaseStation();
            tv.decreaseStation();
            tv.decreaseStation();
            tv.decreaseStation();
            tv.decreaseStation();
            tv.decreaseStation();
            tv.decreaseStation();
            tv.decreaseStation();
            tv.decreaseStation();
            tv.decreaseStation();
            tv.decreaseStation();
            tv.decreaseStation();
            tv.decreaseStation();
            tv.decreaseStation();
            tv.decreaseStation();
            assertEquals(0, tv.getStation());
        }
        @Test
        public void testThatTvConnectsOnline() {
            Television tv = new Television();
            tv.setisOn();
            tv.toggleConnector();
            assertEquals(true, tv.getconnected());
        }

        @Test
        public void testThatTvDisconnectsFromOnline() {
            Television tv = new Television();
            tv.setisOn();
            tv.toggleDisconnector();
            assertEquals(false, tv.getdisconnected());
        }
}



