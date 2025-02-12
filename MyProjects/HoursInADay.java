public interface HoursInADay {
    int getStandardHours();
    int getCustomHours();
}
public class InnerHoursInADay implements HoursInADay{
    int getStandardHours(){
        return 24;
    }
    int getCustomHours(int hours){
        return hours;
    }
}
public class HoursInADay {
    public static void main(String[]args){
        InnerHoursInADay calculator = new InnerHoursInADay();
        System.out.println("Standard hours in a day:" + calculator.getStandardHours);
        int CustomHours = 30;
        System.out.println("Custom hours in a day:" + calculator.getCustomHours(CustomHours));
    }

    
}