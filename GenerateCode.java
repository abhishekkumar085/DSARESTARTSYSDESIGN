public class GenerateCode {

    public static String generateCode(String code) {
        if (code == null || code.isEmpty())
            return "P001";

        // Split the prefix and numeric part
        String prefix = code.replaceAll("\\d", ""); // "P"
        String numberPart = code.replaceAll("\\D", ""); // "001"

        // Convert number to int and increment
        int number = Integer.parseInt(numberPart);
        number += 1;

        // Preserve the leading zeros using String.format
        String newNumberPart = String.format("%0" + numberPart.length() + "d", number);

        return prefix + newNumberPart;
    }

    public static void main(String[] args) {
        String oldCode = "P001";
        String newCode = generateCode(oldCode);
        System.out.println(newCode); // Output: P002
    }
}