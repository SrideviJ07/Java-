interface Person {
    void salaryCalculator();
    void working();
}

// Abstract class definition
abstract class Edu {
    void greet() {
        System.out.println("Greetings from Education class!");
    }
    abstract void education();
}

// Class Emi definition
class Emi {
    // Fields related to Emi
    double interest;
    double balanceAmount;

    // Constructor
    Emi(double interest, double balanceAmount) {
        this.interest = interest;
        this.balanceAmount = balanceAmount;
    }

    // Other methods related to Emi
}

// Engineer class definition
class Engineer extends Edu implements Person {
    // Fields specific to Engineer
    Emi emi;

    // Constructor
    Engineer(Emi emi) {
        this.emi = emi;
    }

    // Overridden methods from interface and abstract class
    @Override
    public void salaryCalculator() {
        System.out.println("Engineer's salary calculation method.");
    }

    @Override
    public void working() {
        System.out.println("Engineer is working.");
    }

    @Override
    void education() {
        System.out.println("Engineer's education method.");
    }
}

// Doctor class definition
class Doctor extends Edu implements Person {
    // Fields specific to Doctor
    Emi emi;

    // Constructor
    Doctor(Emi emi) {
        this.emi = emi;
    }

    // Overridden methods from interface and abstract class
    @Override
    public void salaryCalculator() {
        System.out.println("Doctor's salary calculation method.");
    }

    @Override
    public void working() {
        System.out.println("Doctor is working.");
    }

    @Override
    void education() {
        System.out.println("Doctor's education method.");
    }
}

// Main class
public class Opptask {
    public static void main(String[] args) {
        // Creating objects of Engineer and Doctor
        Engineer[] engineers = new Engineer[3];
        Doctor[] doctors = new Doctor[2];

        // Assigning specific Emi, salary, education, etc., attributes to each object
        for (int i = 0; i < engineers.length; i++) {
            engineers[i] = new Engineer(new Emi(0.05, 10000)); // Example Emi values
        }

        for (int i = 0; i < doctors.length; i++) {
            doctors[i] = new Doctor(new Emi(0.03, 15000)); // Example Emi values
        }

        // Example method calls
        engineers[0].greet();
        engineers[0].education();
        engineers[0].working();
        engineers[0].salaryCalculator();

        doctors[0].greet();
        doctors[0].education();
        doctors[0].working();
        doctors[0].salaryCalculator();
    }
}
