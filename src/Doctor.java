package HospitalPackage;

public class Doctor extends HospitalPackage.HospitalEmployee {
    String speciality;
    public  Doctor(String name,int number,String speciality){
        super(name,number);
        this.speciality=speciality;

    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name+ " " +number+" "+speciality;
    }

    @Override
    public void work() {

        System.out.println(name+" works for the hospital. "+name+" is a(n) "+speciality+" doctor.");


    }


}