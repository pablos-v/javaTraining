// На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть две команды
// - команда 1 (к1): увеличить в с раза, а умножается на c
// - команда 2 (к2): увеличить на d ( +2 ), к a прибавляется d
// написать программу, которая выдаёт набор команд, позволяющий число a превратить в число b или сообщить, что это невозможно
// Пример 1: а = 1, b = 7, c = 2, d = 1
// ответ: к1, к1, к1, к1, к1, к1 или к1, к2, к1, к1, к1 или к1, к1, к2, к1. 
// Пример 2: а = 11, b = 7, c = 2, d = 1
// ответ: нет решения. 
// *Подумать над тем, как сделать минимальное количество команд

public class task2 {
    public static void main(String[] args) {
        System.out.println(counter(1, 7, 2, 1));
        if (test()) System.out.println("Tests passed!");
    }

    static String counter(int a, int b, int c, int d) {
        if (a > b)
            return "Нет решения";
        String ans = "";
        while (a * c < b) {
            a *= c;
            ans += "* ";
        }
        while (a + d <= b) {
            a += d;
            ans += "+ ";
        }
        return ans;
    }

    static boolean test() {
        assert counter(1, 7, 2, 1) == "* * + + + ";
        assert counter(11, 7, 2, 1) == "Нет решения";
        return true;
    }
}
