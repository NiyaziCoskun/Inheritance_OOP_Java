package HospitalPackage;

public class Surgeon extends HospitalPackage.Doctor {
    Boolean operating;

    public Surgeon(String name,int number,String speciality,Boolean operating) {
        super(name,number,speciality);
        this.operating=operating;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name+ " " +number+" "+speciality+ " Operating :"+operating;
    }
    @Override
    public void work() {
        String t = "";
        if(operating == true)
        {
            t = "now.";
        }

        System.out.println(name+" works for the hospital. "+name+" is operating " + t);
    }
}