import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class ArrayListCol  {

    //create arraylist of non generic type
    //non generic arraylist can hold any value
    ArrayList nonGeneric = new ArrayList<>();

    //generic arraylist i.e arrayList of a specific type
    ArrayList<Integer> genericInt = new ArrayList<Integer>();

    //creating generic arraylist of custom type i.e Person type
    ArrayList<Person> genericPerson = new ArrayList<Person>();


    //insert into nonGeneric arraylist
    public void insertNonGeneric()
    {
        nonGeneric.add(2);
        nonGeneric.add("hi");
        nonGeneric.add("good"+"morning");
        nonGeneric.add(9);
    }

    public void displayNonGeneric()
    {
        //using for loop
        System.out.println("using for loop: ");
        for(int i=0;i<nonGeneric.size();i++)
            System.out.print(nonGeneric.get(i) +" ");

        //using iterator
        System.out.println("\nusing iterator: ");
        Iterator i = nonGeneric.iterator();
        while(i.hasNext())
        {
            System.out.print(i.next()+" ");
        }
    }

    //insert into generic int type
    public void insertInt()
    {
        genericInt.add(2);
        genericInt.add(9);
        genericInt.add(121);
        //genericInt.add("hi");  ---> will give error
    }
    public void displayInt()
    {
        //using for loop
        System.out.println("\nusing for loop: ");
        for(int i=0;i<genericInt.size();i++)
            System.out.print(genericInt.get(i) +" ");

        //using iterator
        System.out.println("\nusing iterator: ");
        Iterator<Integer> i = genericInt.iterator();
        while(i.hasNext())
        {
            System.out.print(i.next()+" ");
        }
    }

    //insert into generic person type
    public void insertPerson(Person p)
    {
        genericPerson.add(p);
    }

    //display arrayListvalue of type person
    public void displayPerson()
    {
        //using for loop
        System.out.println("\nusing for loop: ");
        for(int i=0;i<genericPerson.size();i++)
            System.out.println(genericPerson.get(i) +" ");

        //using iterator
        System.out.println("using iterator: ");
        Iterator<Person> i = genericPerson.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next()+" ");
        }
    }

    //sort arraylist of type person. sorting can be done on generic collection only


    //sorting without using comparable
    public void sortNoComp()
    {
        System.out.println("\nsorting integer type arraylist");
        Collections.sort(genericInt);

        displayInt();
    }

    //sorting person type arraylist using comparator as it does not have its own comparator
    public void sortComp()
    {
        System.out.println("\nsorting person type arraylist on the basis of id using comparator");

        Collections.sort(genericPerson,new sortByID());
        displayPerson();
    }

    public static void main(String arg[])
    {
        ArrayListCol arrayList = new ArrayListCol();
        //calling non-generic arraylist function
        arrayList.insertNonGeneric();
        arrayList.displayNonGeneric();

        //calling generic arraylist of type Integer
        arrayList.insertInt();
        arrayList.displayInt();

        //calling generic arraylist of type person
        arrayList.insertPerson(new Person(2,"Riya",15,'F'));
        arrayList.insertPerson(new Person(4,"Tejas",20,'M'));
        arrayList.insertPerson(new Person(3,"Mehak",21,'F'));
        arrayList.insertPerson(new Person(1,"Gouri",15,'F'));

        arrayList.displayPerson();

        //sorting genericInt arraylist
        arrayList.sortNoComp();

        //sorting genericPerson arraylist
        arrayList.sortComp();
    }


}

