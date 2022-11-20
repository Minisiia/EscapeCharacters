public class EscapeCharacters {
    public static void main(String[] args) {
        String stringOne = "\nмій рядок 1"; // перехід на новий рядок
        String stringTwo = "\tмій рядок 1"; // табуляція або 4 пробіли
        //String stringThree = "\aмій рядок 3"; // помилка, не існує такої керуючої послідовності
        System.out.println(stringOne);
        System.out.println(stringTwo);
        //System.out.println(stringThree);

    }
}
