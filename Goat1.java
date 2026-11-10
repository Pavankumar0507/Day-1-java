 class Animal {
    float weight=65;
    String color="Red";
    Double height=5.5;
    void legs(){
        System.out.println("It as 4 legs");
    }   
}
class Goat1 {
    public static void main(String[] args) {
        Animal an=new Animal();
        System.out.println(an.weight);
        System.out.println(an.color);
        System.out.println(an.height);
        an.legs();
    }
}