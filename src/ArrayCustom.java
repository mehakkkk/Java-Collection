
//creating custom arraylist of type int
class ArrayCustom
{
    private int []arr;
    private int i =0,size =20,iterate =0;

    //default constructor
    ArrayCustom()
    {
        arr = new int[size];
    }


    //parametrised constructor
    ArrayCustom(int size)
    {
        this.size = size;
        arr = new int[size];
    }

    //check whether there is next value
    public boolean hasNext() {
        if (iterate >=i) {
            iterate =0;
            return false;
        } else {
            return true;
        }
    }

    //get next value
    public int next() {
        return get(iterate++);
    }

    //method to increase/double the size of array and copy all elements
    private void increase_size()
    {
        int[] copy_array = new int[size];
        for(int j =0;j<i;j++)
            copy_array[j] = arr[j];

        //increase size
        size*=2;
        arr = new int[size];

        //copy back to original
        for(int j =0;j<i;j++)
            arr[j] = copy_array[j];

    }

    //check whether empty or not
    private boolean isEmpty()
    {
        if(i == size)
        {
            System.out.println("empty");
            return false;
        }

        return true;
    }

    //function to shift all element at right:insertion
    private void shift_right(int index)
    {
        //System.out.println("i: "+i);
        for(int k = i;k>=index;k--)
        {
            arr[k+1] = arr[k];
        }
        i++;
        //System.out.println("i: "+i);
    }

    //method to shift left: deletion
    private void shift_left(int index)
    {
        for(int j=index;j<i;j++)
        {
            arr[j] = arr[j+1];
        }
        i--;
    }

    //add method to insert element into array
    public void add(int e)
    {
        //if not empty increase size
        if(!isEmpty())
        {
            increase_size();
        }


        arr[i++] = e;//set value at default index
    }

    //add mehtod to insert at particular index
    public void add(int index,int e)
    {
        if(i<index)
        {
            System.out.println("Exception: out of bound");
            return;
        }

        if(!isEmpty())
        {
            increase_size();
        }

        shift_right(index);
        arr[index] = e;

    }

    //get from particular index
    int get(int index)
    {
        if(i<index)
        {
            System.out.println("Exception: out of bound");
            return -1;
        }
        return arr[index];
    }

    //remove element from particular index and reduce i;
    void remove(int index)
    {
        if(i<index)
        {
            System.out.println("Exception: out of bound");
            return ;
        }
        shift_left(index);
    }

    //whether array contains particular value
    boolean contains(int e)
    {
        for(int j =0;j<i;j++)
        {
            if(arr[j] == e)
                return true;
        }

        return false;
    }
}
class Main
{
    public static void main(String[] args) {
        //System.out.println("Hello World");
        ArrayCustom array = new ArrayCustom();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(0,0);

        System.out.println(array.get(3));
        System.out.println(array.contains(2));

        array.remove(1);

        System.out.println(array.get(1));

        while(array.hasNext())
        {
            System.out.println(array.next());
        }

        while(array.hasNext())
        {
            System.out.println(array.next());
        }


    }
}
