package UnicObject;

public class MOMO {
    public static void main(String[] args){

        Singleton obx1 = Singleton.getInstance();
        obx1.setNombre("Pepe");

        Singleton obx2 = Singleton.getInstance();

        System.out.println(obx2.getNombre());


    }

}
