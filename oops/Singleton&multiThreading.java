// Singleton classes are those whose only single instance can be created ..
// below are the demonstration of multi threading and singleton
class HelloWorld {
    public static void main(String[] args) {
       Thread t1=new Thread(new Runnable(){
           public void run(){
                Singleton ss= Singleton.create();
           }
       
       });
       Thread t2=new Thread(new Runnable(){
        public void run(){
                Singleton ss= Singleton.create();
           }
       });
       t1.start();
       t2.start();
    }
}
class Singleton{
    static Singleton obj;
    private Singleton(){
        System.out.print("instance created");
    };
    
    static synchronized Singleton create(){
        if(obj==null) obj=new Singleton();
        return obj;
    }
}
