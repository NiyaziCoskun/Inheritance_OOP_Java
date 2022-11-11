package HospitalPackage;

public class Nurse extends HospitalPackage.HospitalEmployee {
    int numOfPatients;
    public Nurse(String name,int number,int numOfPatients){
        super(name,number);
        this.numOfPatients=numOfPatients;


    }
    @Override
    public String toString() {
        return  name+ " " +number+" has "+numOfPatients+" patients";
    }

    @Override
    public void work() {

        System.out.println(name+" works for the hospital. "+name+" is a nurse with "+numOfPatients+" patients.");
    }
}