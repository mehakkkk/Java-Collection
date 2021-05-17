import java.util.Comparator;

class sortByID implements Comparator
{
    //using comparator to sort user-defined object
    public int compare(Object t1, Object t2) {
        return ((Person)t1).getId()-((Person)t2).getId();
    }
}

public class Person {
    private String name;
    private int age;
    private int id;
    private char gender;

    //constructor
    Person(int id,String name,int age,char gender)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //overriding toString method to print object value
    public String toString()
    {
        return ("id: "+id+" name: "+name+" age: "+age + " gender: "+gender);
    }

    public int getId()
    {
        return this.id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    //method to return unique hashcode for fast performance for hashset/hashmap
    //here id is the hashcode for each person
//    public int hashCode()
//    {
//        return this.id;
//    }

//    public boolean equals(Object o)
//    {
//        if(o instanceof Person && ((Person)o).getId() == this.getId())
//            return true;
//        else
//            return false;
//    }

}
