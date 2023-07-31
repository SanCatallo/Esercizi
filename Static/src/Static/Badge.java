package Static;

import java.util.Random;

public class Badge {
    private static int totalNumbersOfEmployees = 0;
    private String badgeIdCode;
    public Employee employee;
    public Badge(String badgeIdCode, Employee employee){
        this.badgeIdCode = badgeIdCode;
        this.employee = employee;
        keepTrackOfEmployeesNumber();
    }
    private static void keepTrackOfEmployeesNumber(){
        totalNumbersOfEmployees++;
    }
    private String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder codeBuilder = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            char randomChar = characters.charAt(random.nextInt(characters.length()));
            codeBuilder.append(randomChar);
        }

        return codeBuilder.toString();
    }

    private String generateBadgeIdCode(Employee employeeThatNeedsBadge){
        String randomFirst =  generateRandomString(3);
        String randomLast =  generateRandomString(3);

        return randomFirst + employee.name + employee.surname + randomLast;
    }
    public void showBadgeDetails(){
        System.out.println("Number of employees: " + totalNumbersOfEmployees);
        System.out.println("\nDetails of the employee: " + employee.getEmployeeDetails());
        System.out.println("\nBadge Id Code: " + badgeIdCode);
    }
    public Badge(Employee employeeThatNeedsBadge){

        keepTrackOfEmployeesNumber();
        this.employee = employeeThatNeedsBadge;
        this.badgeIdCode = generateBadgeIdCode(employeeThatNeedsBadge);
    }
}
