package gestiondepai;



public class employertp extends Employe {
    private int workhours = 35;
    private int absenceH=0;
    private static double salaireheur;
    
    public employertp(String nom, String fonction , double salaireheur){
        super(nom,fonction);
        this.salaireheur =salaireheur ;
    }
    public void setAbsenceH(int absenceH){
    this.absenceH=absenceH;
    }
    @Override
    public double calculSalaire() {
        setSalire((this.workhours-this.absenceH) * this.salaireheur);
        return getSalire();
    }
}
