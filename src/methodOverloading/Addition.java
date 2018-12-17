package methodOverloading;

public class Addition {



  static  int Add(int a,int b)
    {
        return a+b;
    }


     static double Add(double a,int b)
    {
         return a+b;
    }

    public static void main(String[] args) {

        System.out.println(Add(10,20));

        System.out.println(Add(10.0,20));
    }
}
