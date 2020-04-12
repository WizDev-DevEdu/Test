package Module_04HW;

public class Staff implements Info{
    private String firstName;
    private String lastName;
    private int age;
    int workedDays;
    int rate;

    public Staff() {

    }

    public void setFirstName(String firstName) {
        if (firstName.isEmpty()) {
            System.out.println("Empty fielf((");
        } else {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (lastName.isEmpty()) {
            System.out.println("Empty fielf((");
        } else {
            this.lastName = lastName;
        }
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Wrong age((");
        } else {
            this.age = age;
        }
    }

    public void getInfo() {
        System.out.println(firstName + " " + lastName + " " + age);
    }

    public void setWorkedDays(int workedDays) {
        if (workedDays < 0) {
            System.out.println("Wrong ((");
        } else {
            this.workedDays = workedDays;
        }
    }
    public void setRate(int rate) {
        if (rate < 0) {
            System.out.println("Wrong ((");
        } else {
            this.rate = rate;
        }
    }
    public int calculationOfSalary(int workedDays, int rate) {
        int salary = workedDays * rate;
        return salary;
    }

}