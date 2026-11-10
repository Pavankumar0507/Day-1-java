class Employee {
    String name="Teja";
    double id=115;
    void work(){
        System.out.println("Laptop is Starting");}
        void get_bonus(){
            System.out.println("Bonus credited");
        }
    }   
    class Emp {
    public static void main(String[] args) {
        Employee ep=new Employee();
        System.out.println(ep.name);
        System.out.println(ep.id);
        ep.work();
        ep.get_bonus();
    }
}