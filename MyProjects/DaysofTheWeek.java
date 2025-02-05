public enum DaysofTheWeek {
    public static void main(String[]){
        DaysofTheWeek day = DaysofTheWeek.SUNDAY;
        if (day == DaysofTheWeek.SUNDAY){
            system.out.println("Sunday");
        }
        for (DaysofTheWeek myDay : DaysofTheWeek.Values()){
            System.out.println(myDay);
        }
    }
}