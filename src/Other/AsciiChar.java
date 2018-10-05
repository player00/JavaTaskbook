package Other;

public class AsciiChar {

    public static class AsciiCharSequence implements CharSequence {
        final byte[] sequence;

        AsciiCharSequence(byte[] sequence) {
            this.sequence = sequence.clone();
        }

        @Override
        public int length() {
            return sequence.length;
        }

        @Override
        public char charAt(int index) {
            return (char) sequence[index];
        }

        @Override
        public CharSequence subSequence(int start, int end) {
            int length = end - start;
            int c = 0;
            byte[] newCS = new byte[length];
            for (int i = start; i < end; i++) {
                newCS[c] = sequence[i];
                c++;
            }

            return new AsciiCharSequence(newCS);
        }

        public String toString() {
            StringBuilder res = new StringBuilder("");
            for (byte b:sequence){
                res.append((char) b);
            }
            return res.toString();
        }
    }

    public static void main(String[] args) {
        byte[] example = {72, 101, 108, 108, 111, 33};
        AsciiCharSequence answer = new AsciiCharSequence(example);
        System.out.println("Последовательность - " + answer.toString());//Hello!
        System.out.println("Размер её - " + answer.length());//6
        System.out.println("Символ под № 1 - " + answer.charAt(1));//e
        System.out.println("Подпоследовательность - " + answer.subSequence(1, 5));//ello
//проверка на нарушение инкапсуляции private поля
        System.out.println(answer.toString());//Hello!
        example[0] = 74;
        System.out.println(answer.toString());//Hello!;
    }
}
