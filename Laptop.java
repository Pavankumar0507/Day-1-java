class Lapt {
    String ram="16";
    String brand="HP";
    void bootup(){
        System.out.println("Laptop is Starting");

    }   
}
class Laptop {
    public static void main(String[] args) {
        Lapt Lp=new Lapt();
        System.out.println(Lp.ram);
        System.out.println(Lp.brand);
        Lp.bootup();
    }
}