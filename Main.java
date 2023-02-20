package BoksOyunu;

public class Main {
    public static void main(String[] args) {
        Fighter f1=new Fighter("Kaplan",90,10,60,30);
        Fighter f2=new Fighter("Aslan",85,15,80,20);
        Match match1=new Match(f1,f2,50,100);
        match1.run();
    }
}
