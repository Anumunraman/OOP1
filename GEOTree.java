

public class GEOTree {
    String firstName;
    String lastName;
    int age;
    String country;
    String gender;
    String parent;
    Integer idPerson;
    

    
    public GEOTree() {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.country = "";
        this.gender = "";
        this.parent = null;
        this.idPerson = null;
    }

    public GEOTree(String firstName, String lastName, Integer idPerson) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idPerson = idPerson;
    }

    public void greetings(String msg) {
        System.out.println(msg);
    }

    public void printInfo() {
        System.out.println(printString());
    }



       
    private String printString() {
        return "GEOTree {" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", gender='" + gender + '\'' +
                ", parent=" + parent +
                ", idPerson=" + idPerson + 
                '}';
    }    
    public static void main(String[] args) {
        GEOTree ivanov = new GEOTree("Petr", "Ivanov",1);
        ivanov.printInfo();
             
    }
        

}
