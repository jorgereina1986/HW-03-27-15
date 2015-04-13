package nyc.c4q.jorgereina1986;

/**
 * Created by Jorge Reina and with assistance of Kenny (TA) on 3/30/15.
 */
public class Person {

    private String name;
    private String phoneNumber;
    private String city;

    public Person(){
    }

    public Person(String name){
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static boolean checkSameCity(Person p1, Person p2) {

        if(p1.getCity().equals(p2.getCity())) {
            return true;
        }
        else
            return false;

    }

    public Person registeredChild(Person parent){
        Person baby = new Person("Abc");   //created baby person

        baby.setCity(parent.getCity());                  //setting baby city to parent city
        baby.setPhoneNumber(parent.getPhoneNumber());   //setting baby phone number to parent city

        return baby;
    }







}
