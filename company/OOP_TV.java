package com.company;

class Tv{
    private int channel;
    private int volume;
    private boolean On;
    Tv()
    {
        On = true;
        System.out.println("--> TV ON ");
    }
    public void turnOff()
    {
        On = false;
        System.out.println("--> TV OF ");
    }
    public void SetChannel(int x)
    {
        if(On==true)
        channel = x;
        System.out.println("--> Channel set to "+channel);
    }
    public void SetVolume(int y)
    {
        if(On==true)
        volume = y;
        System.out.println("--> Volume set to "+volume );

    }
    public void ChannelUp()
    {
        System.out.print("--> Channel :" +channel) ;
        if(On==true)
        channel++;
        System.out.println("  To  " + channel);
    }
    public void ChannelDown()
    {
        System.out.print("--> Channel :" +channel) ;
        if(On==true)
        channel--;
        System.out.println("  To  " + channel);

    }
    public void VolumeDown()
    {
        System.out.print("--> Volume : "+volume);
        if(On==true)
        volume--;
        System.out.println("  To  " + volume);
    }public void VolumeUp()
    {
        System.out.print("--> Volume : "+volume);
        if(On==true)
        volume++;
        System.out.println("  To  " + volume);
    }

}
public class OOP_TV {
    public static void main(String[] args) {
        Tv T = new Tv();
        Tv T1 = new Tv();
        T1 = T;        // COpy of object no T1 also referencing T and it can access the method and object of T
        //T.turnOn();
        T.SetChannel(45);
        T.SetVolume(50);
        T.VolumeDown();
        T1.VolumeDown();
        T.ChannelDown();
        T.VolumeUp();
        T.VolumeUp();
        T.turnOff();
    }
}
