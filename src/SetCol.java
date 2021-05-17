import java.util.HashSet;
import java.util.Set;

//Set stores unique values only
public class SetCol {
    //create a non-generic set
    //hashcode not overridden
    Set nonGeneric = new HashSet();

    Set<Person>generic = new <Person>HashSet();

    public void insertNonGeneric()
    {
        nonGeneric.add(2);
        nonGeneric.add("hello");
        nonGeneric.add(1);
        nonGeneric.add(2);//adding duplicate value
    }

    public void displayDefHash() //display default hashcodes for non-generic types
    {
        //using for loop
        System.out.println("using for loop: ");
        for(Object o:nonGeneric)
        {
            System.out.println("hashcode: "+o.hashCode()+" value: "+o); //get hashcode of each object
        }
    }

    public void insertGeneric(Person p)
    {
        generic.add(p);

    }

    //display hashcodes and values of generic set type person where hashcode is overridden
    public void displayHashGen()
    {
        System.out.println("using for loop: ");
        for(Object o:generic)
        {
            System.out.println("hashcode: "+((Person)o).hashCode()+" value: "+((Person)o)); //get hashcode of each object
        }
    }

    public static void main(String arg[])
    {
        SetCol set = new SetCol();
        //invoking non-generic set methods
        set.insertNonGeneric();
        set.displayDefHash();

        //invoking generic set type person methods
        set.insertGeneric(new Person(2,"Riya",15,'F'));
        set.insertGeneric(new Person(4,"Tejas",20,'M'));
        set.insertGeneric(new Person(3,"Mehak",21,'F'));
        set.insertGeneric(new Person(1,"Gouri",15,'F'));

        set.displayHashGen();
    }
}
