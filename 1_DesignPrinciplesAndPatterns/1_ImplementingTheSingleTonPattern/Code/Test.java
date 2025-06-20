class Logger{       //Singleton class
    private Logger(){}      //Constructor made private to prevent instantiation using new keyword by other classes
    private static Logger lg = new Logger();        //The single object returned every time
    public static Logger getInstance(){     //Function to return the object
        return lg;                          //made static so that it can be called without object creation
    }
}

public class Test{
    public static void main(String[] args){
        Logger l1 = Logger.getInstance();       //Creating l1 instance
        Logger l2 = Logger.getInstance();       //Creating l2 instance
        System.out.println(l1);
        System.out.println(l2);     //Both the print statements print the same hexadecimal representation of the hash code
    }
}