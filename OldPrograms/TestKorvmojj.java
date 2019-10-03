package OldPrograms;

public class TestKorvmojj {
    public static void main(String[] args){
        Person p1 = new Person();
        p1.hungry = true;
        Person p2 = new Person();
        p2.hungry = true;
        Korvmojj Korv = new Korvmojj();
         System.out.println(p1);
         Korv.feedSausageToPerson(p1);
         System.out.println(p2);
         Korv.feedSausageToPerson(p2);
    }
}
