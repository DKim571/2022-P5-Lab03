
public class Lab03 {
    public static void main(String[] args) {
        int startingValue = 10000123;
        int hours = startingValue / 3600000;
        int minutes = startingValue % 3600000;
        int realminutes = minutes / 60000;
        int seconds = startingValue / 1000;
        int realseconds= seconds % 60;
        int millisec= startingValue % 1000;
        System.out.println("Lab03, 100 Point Version");
        System.out.println();
        System.out.println("Starting milli-seconds: " + startingValue);
        System.out.println("Hours:                  " + hours);
        System.out.println("Minutes:                " + realminutes);
        System.out.println("Seconds:                " + realseconds);
        System.out.println("Milli Seconds:          " + millisec );


    }
}
