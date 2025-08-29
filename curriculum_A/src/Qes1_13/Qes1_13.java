package Qes1_13;

public class Qes1_13 {
    public static void main(String[] args) {
        // 整数系
        byte b = 10;          // バイト型
        short s = 100;        // 短整数型
        int i = 1000;         // 整数型
        long l = 10000L;      // 長整数型（Lを付ける）

        // 小数系
        float f = 9.5f;       // 単精度浮動小数点数型（末尾に f が必要）
        double d = 10.5;      // 倍精度浮動小数点数型

        // 文字と文字列
        char c = 'a';         // 文字型（シングルクォートで1文字）
        String str = "ハロー"; // 文字列型（ダブルクォートで囲む）

        // 論理型
        boolean flag = true;  // ブーリアン型
        
        
        
        // 1. 11110
        System.out.println(b + s + i + l);

        // 2. 20
        System.out.println(f + d);

        // 3. a ハロー true
        System.out.println(c + " " + str + " " + flag);

        // 4. 11130 （整数だけを足す）
        System.out.println(b + s + i + l + f + d);

        // 5. 10000000000
        System.out.println(b * s * i * l);

        // 6. 0.105
        System.out.println(d / s);

        // 7. -90
        System.out.println(b - s);
        
        
        
        String num = "20";
        int num1 = 23;

        // "20" を int に変換してから足す
        System.out.println("ハローJAVA" + (Integer.parseInt(num) + num1));

        
        
        String name = "山田太郎";     // 名前
        int age = 18;                 // 年齢
        double height = 170.5;        // 身長
        double weight = 62.2;         // 体重
        String favoriteFood = "寿司"; // 好きな食べ物

        // フォーマット通りに出力
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");
        
        // BMIの計算
        double bmi = weight / ((height / 100.0) * (height / 100.0));

        // BMIの出力
        System.out.println("BMIは" + String.format("%.2f", bmi) + "です");
        
    }
}
