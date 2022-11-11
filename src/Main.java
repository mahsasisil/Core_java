import basics.Person;

public class Main {


   public static void log(String txt){
       System.out.println(txt);

   }
    public static void main(String[] args) {
        Person w=new Person("Mahsa","Movahedi");
        log(w.getFirstName());

    }
}