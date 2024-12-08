public class Data {
    static int x;
    int Age;
    String Name;

    static
    {
        x=20;
        System.out.println("x from Static Block" +" "+ x);
    }

    public Data(int Age, String Name){
        this.Age = Age;
        this.Name = Name;

        System.out.println("Age from Constructor" +" "+ Age);
        System.out.println("Name from Constructor" +" "+ Name);
    }

    public static int getX() {
        return x;
    }
    public int getAge() {
        return Age;
    }

    public String getName() {
        return Name;
    }
}
