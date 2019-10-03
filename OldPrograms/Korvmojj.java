package OldPrograms;

public class Korvmojj {
    public int amountOfSausagesLeft = 5;

    public void feedSausageToPerson(Person p) {
        if ((p.hungry==true) && (amountOfSausagesLeft > 5)) {
            amountOfSausagesLeft--;
            p.hungry = false;
        } else {
            System.out.println(("Sorry"));
        }
    }
}



