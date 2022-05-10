package assignments;

public class Television {
    private boolean isOn;
    private int volume;
    private int channel;
    private boolean connectOnline;
    private boolean disconnectOnline;


    public void turnOn() {
        if(!isOn)
        {isOn = true;
        }else if(isOn){
            isOn = false;
        }
    }
    public boolean isOn(){
        return isOn;
    }


    public void increaseVolume() {
        if (volume >= 0 && volume < 100){
            volume = volume + 1;

        }

    }

    public void decreaseVolume() {

        if (volume > 0 && volume < 100){
            volume = volume - 1;
        }else if( volume < 0){
            volume = 0;
        }
    }

    public int getVolume() {
        return volume;
    }


    public void setVolume(int volume) {
        this.volume = volume;
    }



    public void setStation(int Channel) {
        this.channel = Channel;
    }

    public void decreaseStation() {
        if (channel > 0 && channel < 100){
            channel = channel - 1;
        }
    }

    public int getStation() {
        return channel;
    }


    public void toggleConnector() {
        if (connectOnline == false){
            connectOnline = true;
        }

    }

    public boolean getconnected() {
        return connectOnline;
    }

    public void toggleDisconnector() {
        if (disconnectOnline == true){
            disconnectOnline = false;
        }


    }

    public boolean getdisconnected() {
        return disconnectOnline;
    }

    public void volume(int volume) {
        this.volume=volume;
    }

    public void increaseStation() {
        if (channel > 0 && channel < 100 );{
            channel = channel +1;
        }
    }
}

