package Variant_9.Paragraph_3;

import Helpers.HTools;

public class H_74 {

    public static void main(String[] args) {
        int age;
        String ageString, ageLast;

        age = HTools.readInt("Введите возраст", 0, 100);

        ageString = Integer.toString(age);
        ageLast = ageString.substring(ageString.length() - 1);

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
        System.out.println(ageString);
    }

}
