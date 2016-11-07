package gestiondepai;


public class Main {
    public static void main(String[] args) {
        Employe []tabemploye = new Employe[3];
        tabemploye[0] = new Employe("Salim","pdg",150000);
        tabemploye[1] = new employePT("Halima","secrètaire",20000,0,true,200);
        tabemploye[2] = new employertp("Abdelhalim","agent",1500);
        System.out.println("_________________________________________");
        System.out.println("|| nom       || fonction  || salaire   ||");
        System.out.println("----------------------------------------");       
        for (int i = 0; i <tabemploye.length ; i++) {
            tabemploye[i].cheque();
            System.out.println("");
            System.out.println("----------------------------------------");
            System.out.println("");
        }
    }
}

