package gestiondepai;


public class Employe {
    private double salaire;
    private String nom,fonction;
    public Employe(String nom, String fonction, double salaire){
        this.nom = nom;
        this.fonction = fonction;
        this.salaire = salaire;
    }
    public Employe(String nom, String fonction){
        this.nom = nom;
        this.fonction = fonction;
    }

    public double getSalire() {
        return salaire;
    }

    public void setSalire(double salire) {
        this.salaire = salire;
    }

    public String getNom() {
        return nom;
    }

    public String getFonction() {
        return fonction;
    }


    public double calculSalaire() {
        return salaire;
    }

    public void cheque() {
        System.out.print("||"+this.nom);
        for(int i=0;i<11-this.nom.length();i++)
            System.out.print(" ");
        System.out.print("||"+this.fonction);
        for(int i=0;i<11-this.fonction.length();i++)
            System.out.print(" ");
        String s= calculSalaire()+"";
        System.out.print("||"+s);
        for(int i=0;i<11-s.length()-2;i++)
            System.out.print(" ");
        System.out.print("DA||");
        
    }
}
