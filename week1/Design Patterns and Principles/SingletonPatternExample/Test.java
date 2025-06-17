class Logger{
    private Logger(){}
    private static Logger lg = new Logger();
    public static Logger getInstance(){
        return lg;
    }
}

public class Test{
    public static void main(String[] args){
        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();
        System.out.println(l1);
        System.out.println(l2);
    }
}