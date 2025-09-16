import java.util.Scanner;

public class QuestionNo23 {

    private int temperature;

    public static final int TEMPERATURE1 = 0;
    public static final int TEMPERATURE2 = 10;
    public static final int TEMPERATURE3 = 20;
    public static final int TEMPERATURE4 = 30;
    public static final int TEMPERATURE5 = 40;

    public QuestionNo23() {
    }

    public QuestionNo23(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void getTemp(){
        System.out.print("Enter The Temperature Of Your Area : ");
        setTemperature(new Scanner(System.in).nextInt());
    }
    public void checkTemp(){
        if (getTemperature() <= TEMPERATURE1){
            System.out.println(getTemperature()+" Degree"+" Too Freezing In Your Area. ");
        }else
            if (getTemperature() > TEMPERATURE1 && getTemperature() < TEMPERATURE2){
                System.out.println(getTemperature()+" Degree"+" Winter In Your Area. ");
            }else
                if (getTemperature() > TEMPERATURE2 && getTemperature() <= TEMPERATURE3){
                    System.out.println(getTemperature()+" Degree"+"  Cold weather In Your Area. ");
                }else
                    if (getTemperature() > TEMPERATURE3 && getTemperature() <TEMPERATURE4){
                        System.out.println(getTemperature()+" Degree"+" Normal Temperature In Your Area. ");
                    }else
                        if (getTemperature() > TEMPERATURE4 && getTemperature() < TEMPERATURE5){
                            System.out.println(getTemperature()+" Degree"+" Very Hot Temperature In Your Area. ");
                        }else
                            if (getTemperature() >= TEMPERATURE5){
                                System.out.println("( Stay Home Stay Safe )");
                        }
    }
}
