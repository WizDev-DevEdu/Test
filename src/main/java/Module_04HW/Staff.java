package Module_04HW;

public class Staff {
    private String firstName;
    private String lastName;
    private int age;
    private int number;
    private int workedDays;
    private int rate;

//    public Staff(String firstName, String lastName, int age, int number, int workedDays, int rate) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age = age;
//        this.number = number;
//        this.workedDays = workedDays;
//        this.rate = rate;
//    }

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

    public int calcularionOfSalary(int workedDays, int rate) {
        int salary = workedDays * rate;
        return salary;
    }

}