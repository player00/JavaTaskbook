package Other;

public class PrintTextPerRole {

    private static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder result = new StringBuilder("");
        for (String role : roles) {
            int counter = 0;
            result.append(role + ":\n");
            for (String line : textLines) {
                counter++;
                String lineRole = line.substring(0, line.indexOf(':'));
                String text = line.substring(line.indexOf(':') + 1);
                if (role.equals(lineRole)) {
                    result.append(counter + ")" + text + "\n");
                }
            }
            result.append("\n");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String[] roles = {
                "Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"
        };
        String[] lines = {
                "Городничий:Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие:к нам едет ревизор.",
                "Аммос Федорович:Как ревизор?",
                "Артемий Филиппович:Как ревизор?",
                "Городничий:Ревизор из Петербурга, инкогнито.И еще с секретным предписаньем.",
                "Аммос Федорович:Вот те на !",
                "Артемий Филиппович:Вот не было заботы, так подай !",
                "Лука Лукич:Господи боже !еще и с секретным предписаньем !",
        };
        System.out.println(printTextPerRole(roles, lines));
    }

}
