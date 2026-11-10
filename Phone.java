class Smartph {
    String model="Apple";
    String storage="256";
    String os="IOS";
    void takephoto(){
        System.out.println("Click photo captured");}
        void browser(){
            System.out.println("Loading Website");
        }
    }   
    class Phone {
    public static void main(String[] args) {
        Smartph sp = new Smartph();
        System.out.println(sp.model);
        System.out.println(sp.storage);
        System.out.println(sp.os);
        sp.takephoto();
        sp.browser();
    } 
}