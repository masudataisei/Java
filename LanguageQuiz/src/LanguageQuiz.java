import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class LanguageQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 单词列表：日语 -> [中文, 拼音]
        Map<String, String[]> words = new HashMap<>();
        words.put("こんにちは", new String[]{"你好", "nǐ hǎo"});
        words.put("ありがとう", new String[]{"谢谢", "xièxie"});
        words.put("さようなら", new String[]{"再见", "zàijiàn"});
        words.put("ごめんなさい", new String[]{"对不起", "duìbuqǐ"});
        words.put("はい", new String[]{"是", "shì"});
        words.put("いいえ", new String[]{"不是", "bù shì"});
        words.put("おはよう", new String[]{"早上好", "zǎoshang hǎo"});
        words.put("おやすみ", new String[]{"晚安", "wǎn'ān"});
        words.put("すみません", new String[]{"劳驾", "láojià"});
        words.put("元気ですか？", new String[]{"你好吗？", "nǐ hǎo ma?"});
        words.put("お願いします", new String[]{"请", "qǐng"});
        words.put("助けて", new String[]{"帮我", "bāng wǒ"});

        // 例句列表：日语 -> [中文, 拼音]
        Map<String, String[]> sentences = new HashMap<>();
        sentences.put("私は学生です。", new String[]{"我是学生。", "wǒ shì xuésheng."});
        sentences.put("これはペンです。", new String[]{"这是笔。", "zhè shì bǐ."});
        sentences.put("あなたの名前は何ですか？", new String[]{"你叫什么名字？", "nǐ jiào shénme míngzi?"});
        sentences.put("私は日本から来ました。", new String[]{"我来自日本。", "wǒ láizì Rìběn."});
        sentences.put("これはいくらですか？", new String[]{"这个多少钱？", "zhège duōshǎo qián?"});
        sentences.put("どこに行きますか？", new String[]{"你要去哪里？", "nǐ yào qù nǎlǐ?"});
        sentences.put("トイレはどこですか？", new String[]{"厕所在哪里？", "cèsuǒ zài nǎlǐ?"});

        System.out.println("🎉 中文初学者向け学習ゲーム 🎉");
        System.out.println("単語と例文を覚えながら中国語を練習しよう！");
        System.out.println("入力時は中文を入力してください。\n");

        int rounds = 10; // 出題数
        int score = 0;
        int combo = 0; // 连对奖励

        Object[] wordKeys = words.keySet().toArray();
        Object[] sentenceKeys = sentences.keySet().toArray();

        for (int i = 0; i < rounds; i++) {
            boolean isWord = random.nextBoolean(); // 单词或例句
            String question;
            String[] answerData;

            if (isWord) {
                question = (String) wordKeys[random.nextInt(wordKeys.length)];
                answerData = words.get(question);
                System.out.println((i + 1) + "问（单词）: 「" + question + "」的中文是什么？");
                System.out.println("提示（拼音）: " + answerData[1]);
            } else {
                question = (String) sentenceKeys[random.nextInt(sentenceKeys.length)];
                answerData = sentences.get(question);
                System.out.println((i + 1) + "问（例句）: 「" + question + "」的中文是什么？");
                System.out.println("提示（拼音）: " + answerData[1]);
            }

            System.out.print("答え: ");
            String answer = scanner.nextLine();

            if (answer.equals(answerData[0])) {
                combo++;
                int points = 1 + combo / 2; // 连对奖励
                score += points;
                System.out.println("✅ 正解！ +"+ points +"分（连对" + combo + "）\n");
            } else {
                System.out.println("❌ 不正解... 正确答案: 「" + answerData[0] + "」\n");
                combo = 0;
            }
        }

        System.out.println("🏁 游戏结束！你的总分: " + score + "/" + rounds*2 + "（满分可调）");
        scanner.close();
    }
}
