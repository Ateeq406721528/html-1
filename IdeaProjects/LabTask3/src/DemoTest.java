public class DemoTest {

    public static void main(String[] args) {

        Music m1 = new Music ("song" , "1:30" , "xyz" ,new Person ("Alpha","Male","India",2010,new Date(15,7,2020)));
        System.out.println(m1);
        Music m2 = new Music("music","2:00","abc",new Person("Beta","Female","Pak",2012,new Date(20,10,2024)));
        System.out.println(m2);
    }
}
