import java.util.*;
class j102_challenge
{

    private static Scanner sca = new Scanner(System.in);
 public static void main(String[] args) {

        private ArrayList<String> g = new ArrayList<String>();
        g.add("Hi");
        g.add("e");
        System.out.println(g.get(0));
        System.out.println(g.get(1));
        

    System.out.println("Enter the no. of input : ");
        int count = sca.nextInt();
        int[] b = new int[count];
        b = readIntegers(count);

        System.out.println(Arrays.toString(b));
        int m = findMin(b);
        System.out.println("Minimum element is "+ m);

    }


public static int[] readIntegers(int count){
    
    int[] a = new int[count];
    System.out.println("Enter the elements : ");
    for(int i=0 ;i<count;i++)
    {
        a[i] = sca.nextInt();
    }
    return a;
}

public static int findMin(int[] array)
{
    int min=Integer.MIN_VALUE;
    for(int x:array)
    {
        if(x<min)
        min=x;
    }
    return min;
}

}