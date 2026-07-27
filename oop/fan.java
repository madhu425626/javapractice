public class MainFan{
    public static void main(String []args){
        Fan fan = new Fan();
        fan.FanName = IO.readln();
        fan.FanCoil = IO.readln();
        fan.FanWings = Integer.parseInt(IO.readln());

        IO.println("Fan Name : "+fan.FanName);
        IO.println("Fan Coil : "+fan.FanCoil);
        IO.println("Fan Wings : "+fan.FanWings);
        fan.switchOn();
        fan.switchOff();

    }
}

class Fan{

    int FanWings;
    String FanName;
    String FanCoil;

    public void switchOn(){
        IO.println("Fan is switched ON");
    }

    public void switchOff(){
        IO.println("Fan is switched OFF");
    }
}
