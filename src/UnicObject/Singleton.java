package UnicObject;

public class Singleton {

    private static Singleton instanciar = null;
    private String nombre;

    public static Singleton getInstance() {
        if(instanciar==null){
            instanciar = new Singleton();
            }
        return instanciar;
    }



    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }


}
