package ru.anotherTestCodeForEnnducation;

public class Diamond {
    public static String print(int n) {
        if (n <= 0 || n % 2 == 0) return null;
        String ast = "****************";
        String spase = "                 ";
        String endLn = "\n";
        String res = "";
        int nSpase = (n / 2) + 1;
        int diamonds = -1;
        for (int i = 0; i < (n / 2) + 1; i++){
            diamonds += 2;
            nSpase -= 1;
            res += spase.substring(0, nSpase) + ast.substring(0, diamonds) + endLn;
        }
        for (int i = (n / 2); i < n - 1; i++){
            diamonds -= 2;
            nSpase += 1;
            res += spase.substring(0, nSpase) + ast.substring(0, diamonds) + endLn;
        }
        return res;
    }
}
