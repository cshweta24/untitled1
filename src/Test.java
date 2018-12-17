/*class MultiMain
{

    public static void main(int i)
    {
        System.out.println("Integer main");
    }
    public static void main(char a)
    {
        System.out.println("Char main");
    }
    public static void main(String[] args)
    {
        main(1);
        main('a');
    }
}

*/
class Car {
    void run()
    {
        System.out.println("car is running");
    }
}
class Audi extends Car {
    void run()
    {
        System.out.println("Audi is running with 100km");
    }
    public static void main(String args[])
    {
        Car b= new Audi();
        b.run();
    }
}