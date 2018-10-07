package Variant_9.Paragraph_3;

import Helpers.HTools;

public class H_74 {

    private static String run(int age) {
        String ageString = Integer.toString(age);
        String ageLast = ageString.substring(ageString.length() - 1);

        if (11 <= age && age <= 15) {
            ageString += " лет";
        } else {
            switch (ageLast) {
                case "1":
                    ageString += " год";
                    break;
                case "2":
                case "3":
                case "4":
                    ageString += " года";
                    break;
                default:
                    ageString += " лет";
                    break;
            }
        }

        return ageString;
    }

    public static void main(String[] args) {
        int age = HTools.readInt("Введите возраст", 0, 100);

        System.out.println(run(age));
    }

}
