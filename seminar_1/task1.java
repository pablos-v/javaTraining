// Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму. 
// Пример 1: а = 3, b = 2, ответ: 9 
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1
// Пример 4: а = 0, b = 0, ответ: не определено
// Пример 5
// входные данные находятся в файле input.txt в виде
// b 3
// a 10
// Результат нужно сохранить в файле output.txt
// 1000

import java.io.*;

public class task1 {
    public static void main(String[] args) throws Exception {
        double a = Reader("input.txt")[0];
        double b = Reader("input.txt")[1];
        Pow(a, b);
    }

    static int[] Reader(String file) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String str;
        int i = 0;
        int[] number = new int[2];
        while ((str = br.readLine()) != null) {
            int index = str.indexOf(' ') + 1;
            number[i++] = Integer.parseInt(str.substring(index));
        }
        br.close();
        return number;
    }

    static void Writer(String s) throws Exception {
        try (FileWriter fw = new FileWriter("output.txt", false)) {
            fw.write(s);
            fw.flush();
        }
    }

    static void Pow(double a, double b) throws Exception {
        double res = 1;
        if (b < 0) {
            a = 1 / a;
            b *= -1;
        }
        if (a == 0) {
            System.out.println("Not Defined");
            return;
        }
        for (int i = 1; i <= b; i++) {
            res *= a;
        }
        String ans = Double.toString(res);
        Writer(ans);
    }
}