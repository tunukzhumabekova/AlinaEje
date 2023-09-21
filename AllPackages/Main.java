package AllPackages;

import AllPackages.DataBase.DataBase;
import AllPackages.Enum.Gender;
import AllPackages.Imp.DepartmentImpl;
import AllPackages.Imp.DoctorImpl;
import AllPackages.Imp.HospitalImpl;
import AllPackages.Imp.PatientImpl;
import AllPackages.Model.Department;
import AllPackages.Model.Doctor;
import AllPackages.Model.Hospital;
import AllPackages.Model.Patient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Patient patient1 = new Patient("John", "Doe", 35, Gender.MALE);
        Patient patient2 = new Patient("Alice", "Smith", 42, Gender.FEMALE);
        Patient patient3 = new Patient("Robert", "Johnson", 28, Gender.MALE);
        Patient patient4 = new Patient("Emily", "Davis", 50, Gender.FEMALE);

        List<Patient> patients1 = new ArrayList<>();
        patients1.add(patient1);
        patients1.add(patient2);

        List<Patient> patients2 = new ArrayList<>();
        patients1.add(patient3);
        patients1.add(patient4);


        Doctor doctor1 = new Doctor("John", "Smith", Gender.MALE, 10);
        Doctor doctor2 = new Doctor("Alice", "Johnson", Gender.FEMALE, 5);
        Doctor doctor3 = new Doctor("Robert", "Davis", Gender.MALE, 15);
        Doctor doctor4 = new Doctor("Emily", "Brown", Gender.FEMALE, 8);
        List<Doctor> doctors1 = new ArrayList<>();
        doctors1.add(doctor2);
        doctors1.add(doctor1);

        List<Doctor> doctors2 = new ArrayList<>();
        doctors1.add(doctor3);
        doctors1.add(doctor4);


        Department department1 = new Department("Cardiology", doctors1);
        Department department2 = new Department("Orthopedics", doctors2);
        List<Department> departments1 = new ArrayList<>();
        departments1.add(department1);
        List<Department> departments2 = new ArrayList<>();
        departments2.add(department2);

        Hospital hospital1 = new Hospital("City General Hospital", "123 Main Street", departments1, doctors1, patients1);
        Hospital hospital2 = new Hospital("County Medical Center", "456 Oak Avenue", departments2, doctors2, patients2);
        List<Hospital>hospitals=new ArrayList<>(Arrays.asList(hospital1,hospital2));

        DataBase dataBase=new DataBase(hospitals);
        DepartmentImpl Dep=new DepartmentImpl(dataBase);
        DoctorImpl Doc=new DoctorImpl(dataBase);
        HospitalImpl H=new HospitalImpl(dataBase);
        PatientImpl P=new PatientImpl(dataBase);

        Scanner scanner =new Scanner(System.in);


            while(true){
                int a=scanner.nextInt();
                System.out.println("1 ");
                System.out.println("2 ");
                System.out.println("3 ");
                System.out.println("4 ");
                System.out.println("5 ");
                System.out.println("6 ");
                System.out.println("7 ");
                System.out.println("8 ");
                System.out.println("9 ");
                System.out.println("10 ");
                System.out.println("11 ");
                System.out.println("12 ");
                System.out.println("13 ");
                System.out.println("14 ");
                System.out.println("15 ");
                System.out.println("16 ");
                System.out.println("17 ");
                System.out.println("18 ");
                System.out.println("19 ");
                System.out.println("20 ");


                switch (a){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        break;
                    case 10:
                        break;
                    case 11:
                        break;
                    case 12:
                        break;
                    case 13:
                        break;
                    case 14:
                        break;
                    case 15:
                        break;
                    case 16:
                        break;
                    case 17:
                        break;
                    case 18:
                        break;
                    case 19:
                        break;
                    case 20:
                        break;

            }
        }

    }
}
