import java.util.HashMap;
import java.util.Map;

public class MapCol {
    //create a non-generic map
    Map nonGeneric = new HashMap();

    //create generic map of type person
    Map<Person,Integer> generic = new HashMap<Person,Integer>();

    //insert into nonGenric map
    void insertNonGeneric()
    {
        nonGeneric.put(1,"priya"); //1=>key priya=>value
        nonGeneric.put(2,new Person(1,"Yash",23,'M'));
        nonGeneric.put(3,45);
    }

    void displayNonGeneric()
    {
        //displaying hashcode of nongeneric array
        for(Object entry:nonGeneric.entrySet())
        {
            System.out.println("hashcode: "+entry.hashCode()+" key-value: "+entry);
        }
    }

    //insert into generic map
    void insertGeneric(Person p)
    {
        generic.put(p,p.getId());
    }

    //display hashcode and key-value pair
    void displayGeneric()
    {
        //here hashcode is person's id
        for(Map.Entry<Person,Integer> entry:generic.entrySet())
        {
            System.out.println(" key-value pair: "+entry);
        }
    }

    boolean checkEquality(Person p1,Person p2)
    {
        //we have overridden equals method to compare id of two objects
        return p1.equals(p2);
    }

    public static void main(String args[])
    {
        MapCol m= new MapCol();
        m.insertNonGeneric();
        m.displayNonGeneric();

        m.insertGeneric(new Person(2,"Riya",15,'F'));
        m.insertGeneric(new Person(4,"Tejas",20,'M'));
        m.insertGeneric(new Person(3,"Mehak",21,'F'));
        m.insertGeneric(new Person(1,"Gouri",15,'F'));

        m.displayGeneric();
        System.out.println("check whether two objects are equals or not: "+ m.checkEquality(new Person(2,"Riya",15,'F'),new Person(3,"Mehak",21,'F')));
        System.out.println("check whether two objects are equals or not: "+ m.checkEquality(new Person(3,"Mehak",21,'F'),new Person(3,"Mehak",21,'F')));

        //performing some basic operation on object

        //checking whether two object with same values have same or different hashcode
//        comment the hashcode method in the person class for results
        Person p1 = new Person(1,"prisha",23,'F');
        Person p2 = new Person(1,"prisha",23,'F');
        System.out.println("check object hashcode: "+(p1.hashCode() == p2.hashCode()));

    }
}
