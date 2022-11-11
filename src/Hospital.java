
package HospitalPackage;

//********************************************************************
//Hospital.java       Authors: Lewis/Loftus
//
//Solution to Programming Project 9.2
//********************************************************************

public class Hospital
{
    //-----------------------------------------------------------------
//  Creates several objects from classes derived from
//  HospitalEmployee.
//-----------------------------------------------------------------
    public static void main (String[] args)
    {
        HospitalPackage.HospitalEmployee vito = new HospitalPackage.HospitalEmployee("Vito", 123);
        HospitalPackage.Doctor michael = new HospitalPackage.Doctor("Michael", 234, "Heart");
        HospitalPackage.Surgeon vincent = new HospitalPackage.Surgeon("Vincent", 645, "Brain", false);
        HospitalPackage.Nurse sonny = new HospitalPackage.Nurse("Sonny", 789, 6);


        // print the employees
        System.out.println (vito);
        System.out.println (michael);
        System.out.println (vincent);
        System.out.println (sonny);


        // invoke the specific methods of the objects
        vito.work();
        michael.work();
        vincent.work();
        sonny.work();

    }
}