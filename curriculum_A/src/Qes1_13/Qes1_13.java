package Qes1_13;

public class Qes1_13 {
    public static void main(String[] args) {
        // ------------------------------
        // 1. 整数系の変数（初期値を代入）
        // ------------------------------
        byte b = 0;           // 初期値 0
        short s = 0;          // 初期値 0
        int i = 0;            // 初期値 0
        long l = 0L;          // 初期値 0

        // 再代入（課題指定値）
        b = 10;
        s = 100;
        i = 1000;
        l = 10000L;

        // ------------------------------
        // 2. 小数系
        // ------------------------------
        float f = 0.0f;
        double d = 0.0;

        f = 9.5f;
        d = 10.5;

        // ------------------------------
        // 3. 文字型・文字列型・ブーリアン型
        // ------------------------------
        char c = ' ';         // 初期値 空白
        String str = "";      // 初期値 空文字
        boolean flag = false; // 初期値 false

        c = 'a';
        str = "ハロー";
        flag = true;

        // ------------------------------
        // 4. 計算・出力
        // ------------------------------
        System.out.println(b + s + i + l);          // 11110
        System.out.println(f + d);                  // 20.0
        System.out.println(c + " " + str + " " + flag); // a ハロー true
        System.out.println(b + s + i + l + f + d); // 11130.5
        System.out.println(b * s * i * l);         // 10000000000
        System.out.println(d / s);                 // 0.105
        System.out.println(b - s);                 // -90

        // ------------------------------
        // 5. 文字列と数値の結合
        // ------------------------------
        String num = "20";
        int num1 = 23;
        System.out.println("ハローJAVA" + (Integer.parseInt(num) + num1)); // ハローJAVA43

        // ------------------------------
        // 6. 自己紹介の変数（初期値）
        // ------------------------------
        String name = "";
        int age = 0;
        double height = 0.0;
        double weight = 0.0;
        String favoriteFood = "";

        // 初期値代入
        name = "山田太郎";
        age = 18;
        height = 170.5;
        weight = 62.2;
        favoriteFood = "寿司";

        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");

        // 再代入（課題指定値）
        name = "鈴木一郎";
        age = 24;
        height = 168.5;
        weight = 64.2;
        favoriteFood = "オムライス";

        // 自己代入（和算）
        age += age;
        height += height;
        weight += weight;

        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");

        // BMI計算
        double bmi = weight / ((height / 100.0) * (height / 100.0));
        System.out.println("BMIは" + String.format("%.2f", bmi) + "です");

        // ------------------------------
        // 7. 数値を文字列に変換して出力
        // ------------------------------
        String ageStr = String.valueOf(age);
        String heightStr = String.valueOf(height);
        String weightStr = String.valueOf(weight);

        System.out.println("年齢: " + ageStr + " 身長: " + heightStr + " 体重: " + weightStr);

        // ------------------------------
        // 8. strAge / strHeight を使用して判定
        // ------------------------------
        String strAge = "25";
        String strHeight = "170";

        int ageFromStr = Integer.parseInt(strAge);
        int heightFromStr = Integer.parseInt(strHeight);

        boolean result = (ageFromStr >= 25) || (heightFromStr >= 160);
        System.out.println("判定結果: " + result); // true
    }
}
