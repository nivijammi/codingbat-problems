package codecademy;

public class Droid{
    //the state and behavior of the droids using instance fields and methods.
    //instance field
    String name;
    int batteryLevel;
    //constructor
    public Droid(String droidName){
        name = droidName;
        batteryLevel = 100;
    }
    public void performTask(String task){
        System.out.println(name + " is performing the task: " + task);
        batteryLevel = batteryLevel - 10;
        System.out.println("The battery level after "+ task + " "+ "is "+ batteryLevel + ".");

    }

    public String toString(){
        return ("The name of the Droid is "+ name +".");
    }
    //main method
    public static void main(String[]args){
        Droid name = new Droid("Codey");
        System.out.println(name);
        name.performTask("studying");


    }


}
