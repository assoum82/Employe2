package gestiondepai;


public class employePT extends Employe{
    private double weekpayment,prime;
    private int absence;
    private boolean weekend;
    public employePT(String nom, String fonction, double weekpayment, int absence,boolean weekend,double prime) {
        super(nom, fonction);
        this.weekpayment = weekpayment;
        this.absence =absence;
        this.weekend=weekend;
        this.prime = prime;
        
    }
    
    public void setAbsence(int absence) {
        this.absence = absence;
    }
    @Override
    public double calculSalaire() {

        if(this.absence<3 && this.weekend==true ){
            setSalire(this.weekpayment * 4 + prime);
            
        }else {
            setSalire(this.weekpayment * 4);
        }
        return getSalire();
    }
}
