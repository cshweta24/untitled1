package aggregation;

public class Emp {
    int id;
    String name;
    Address address;

    Emp(int id,String name,Address address)
    {
        this.id=id;
        this.name=name;
        this.address=address;
    }
    void display()
    {
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }

    public static void main(String[] args) {

        Address address=new Address("pune","maharashtra","kothrud");
        Emp emp=new Emp(111,"raj",address);
        emp.display();

    }

}
