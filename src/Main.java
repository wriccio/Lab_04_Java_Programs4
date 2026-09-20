//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Lab_04_Java_Programs4 {
    public static void main(String[] args) {
        int numToExamine = 2;
        int moduloResult = numToExamine % 2;

        System.out.println("Note: A modulo result of 0 means the number is EVEN.");
        System.out.println("      A modulo result of 1 (or -1 for negative numbers) means the number is ODD.");

        System.out.println("The number to examine is: " + numToExamine);
        System.out.println(numToExamine + " mod 2 results in a value of: " + moduloResult);
    }
}