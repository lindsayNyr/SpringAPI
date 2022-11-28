package univ.TP3;

public class Singleton {


    private int id ;


    private Singleton(){
        this.id = 0;
    }

    private static Singleton instance = new Singleton();

    public static  Singleton getInstance(){
        return  instance;
    }


    public int getId(){

        return this.id += 1;
    }


}