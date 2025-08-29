import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class LanguageQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // --- 単語100個（日本語 → [中国語, ピンイン]） ---
        Map<String, String[]> words = new HashMap<>();
        words.put("こんにちは", new String[]{"你好", "nǐ hǎo"});
        words.put("ありがとう", new String[]{"谢谢", "xièxie"});
        words.put("さようなら", new String[]{"再见", "zàijiàn"});
        words.put("ごめんなさい", new String[]{"对不起", "duìbuqǐ"});
        words.put("はい", new String[]{"是", "shì"});
        words.put("いいえ", new String[]{"不是", "bù shì"});
        words.put("おはよう", new String[]{"早上好", "zǎoshang hǎo"});
        words.put("おやすみ", new String[]{"晚安", "wǎn'ān"});
        words.put("お願いします", new String[]{"请", "qǐng"});
        words.put("助けて", new String[]{"帮我", "bāng wǒ"});
        words.put("すみません", new String[]{"劳驾", "láojià"});
        words.put("元気ですか？", new String[]{"你好吗？", "nǐ hǎo ma?"});
        words.put("わかりました", new String[]{"明白了", "míngbái le"});
        words.put("わかりません", new String[]{"不知道", "bù zhīdào"});
        words.put("名前", new String[]{"名字", "míngzi"});
        words.put("友達", new String[]{"朋友", "péngyǒu"});
        words.put("学校", new String[]{"学校", "xuéxiào"});
        words.put("先生", new String[]{"老师", "lǎoshī"});
        words.put("学生", new String[]{"学生", "xuésheng"});
        words.put("日本", new String[]{"日本", "Rìběn"});
        words.put("中国", new String[]{"中国", "Zhōngguó"});
        words.put("英語", new String[]{"英语", "Yīngyǔ"});
        words.put("中国語", new String[]{"中文", "Zhōngwén"});
        words.put("今日", new String[]{"今天", "jīntiān"});
        words.put("明日", new String[]{"明天", "míngtiān"});
        words.put("昨日", new String[]{"昨天", "zuótiān"});
        words.put("今", new String[]{"现在", "xiànzài"});
        words.put("朝", new String[]{"早上", "zǎoshang"});
        words.put("夜", new String[]{"晚上", "wǎnshàng"});
        words.put("食べる", new String[]{"吃", "chī"});
        words.put("飲む", new String[]{"喝", "hē"});
        words.put("行く", new String[]{"去", "qù"});
        words.put("来る", new String[]{"来", "lái"});
        words.put("見る", new String[]{"看", "kàn"});
        words.put("聞く", new String[]{"听", "tīng"});
        words.put("話す", new String[]{"说", "shuō"});
        words.put("読む", new String[]{"读", "dú"});
        words.put("書く", new String[]{"写", "xiě"});
        words.put("買う", new String[]{"买", "mǎi"});
        words.put("売る", new String[]{"卖", "mài"});
        words.put("高い", new String[]{"贵", "guì"});
        words.put("安い", new String[]{"便宜", "piányi"});
        words.put("大きい", new String[]{"大", "dà"});
        words.put("小さい", new String[]{"小", "xiǎo"});
        words.put("多い", new String[]{"多", "duō"});
        words.put("少ない", new String[]{"少", "shǎo"});
        words.put("新しい", new String[]{"新", "xīn"});
        words.put("古い", new String[]{"旧", "jiù"});
        words.put("暑い", new String[]{"热", "rè"});
        words.put("寒い", new String[]{"冷", "lěng"});
        words.put("面白い", new String[]{"有趣", "yǒuqù"});
        words.put("楽しい", new String[]{"开心", "kāixīn"});
        words.put("悲しい", new String[]{"难过", "nánguò"});
        words.put("疲れた", new String[]{"累", "lèi"});
        words.put("忙しい", new String[]{"忙", "máng"});
        words.put("休む", new String[]{"休息", "xiūxi"});
        words.put("買い物", new String[]{"购物", "gòuwù"});
        words.put("旅行", new String[]{"旅行", "lǚxíng"});
        words.put("天気", new String[]{"天气", "tiānqì"});
        words.put("晴れ", new String[]{"晴", "qíng"});
        words.put("雨", new String[]{"雨", "yǔ"});
        words.put("雪", new String[]{"雪", "xuě"});
        words.put("風", new String[]{"风", "fēng"});
        words.put("空港", new String[]{"机场", "jīchǎng"});
        words.put("駅", new String[]{"车站", "chēzhàn"});
        words.put("バス", new String[]{"公交车", "gōngjiāo chē"});
        words.put("電車", new String[]{"电车", "diànchē"});
        words.put("タクシー", new String[]{"出租车", "chūzūchē"});
        words.put("病院", new String[]{"医院", "yīyuàn"});
        words.put("薬", new String[]{"药", "yào"});
        words.put("時間", new String[]{"时间", "shíjiān"});
        words.put("分", new String[]{"分钟", "fēnzhōng"});
        words.put("秒", new String[]{"秒", "miǎo"});
        words.put("月曜日", new String[]{"星期一", "xīngqī yī"});
        words.put("火曜日", new String[]{"星期二", "xīngqī èr"});
        words.put("水曜日", new String[]{"星期三", "xīngqī sān"});
        words.put("木曜日", new String[]{"星期四", "xīngqī sì"});
        words.put("金曜日", new String[]{"星期五", "xīngqī wǔ"});
        words.put("土曜日", new String[]{"星期六", "xīngqī liù"});
        words.put("日曜日", new String[]{"星期日", "xīngqī rì"});
        words.put("朝ご飯", new String[]{"早餐", "zǎocān"});
        words.put("昼ご飯", new String[]{"午餐", "wǔcān"});
        words.put("夕飯", new String[]{"晚餐", "wǎncān"});
        words.put("水", new String[]{"水", "shuǐ"});
        words.put("お茶", new String[]{"茶", "chá"});
        words.put("コーヒー", new String[]{"咖啡", "kāfēi"});
        words.put("ジュース", new String[]{"果汁", "guǒzhī"});
        words.put("ビール", new String[]{"啤酒", "píjiǔ"});
        words.put("肉", new String[]{"肉", "ròu"});
        words.put("魚", new String[]{"鱼", "yú"});
        words.put("野菜", new String[]{"蔬菜", "shūcài"});
        words.put("果物", new String[]{"水果", "shuǐguǒ"});
        words.put("パン", new String[]{"面包", "miànbāo"});
        words.put("米", new String[]{"米饭", "mǐfàn"});
        words.put("猫", new String[]{"猫", "māo"});
        words.put("犬", new String[]{"狗", "gǒu"});
        words.put("車", new String[]{"车", "chē"});
        words.put("自転車", new String[]{"自行车", "zìxíngchē"});
        words.put("家", new String[]{"家", "jiā"});
        words.put("部屋", new String[]{"房间", "fángjiān"});
        words.put("机", new String[]{"桌子", "zhuōzi"});
        words.put("椅子", new String[]{"椅子", "yǐzi"});
        words.put("本", new String[]{"书", "shū"});
        words.put("雑誌", new String[]{"杂志", "zázhì"});
        words.put("新聞", new String[]{"报纸", "bàozhǐ"});
        words.put("電話", new String[]{"电话", "diànhuà"});
        words.put("携帯", new String[]{"手机", "shǒujī"});
        words.put("コンピューター", new String[]{"电脑", "diànnǎo"});
        words.put("インターネット", new String[]{"互联网", "hùliánwǎng"});
        words.put("映画", new String[]{"电影", "diànyǐng"});
        words.put("音楽", new String[]{"音乐", "yīnyuè"});
        words.put("歌", new String[]{"歌", "gē"});
        words.put("スポーツ", new String[]{"运动", "yùndòng"});
        words.put("サッカー", new String[]{"足球", "zúqiú"});
        words.put("野球", new String[]{"棒球", "bàngqiú"});
        words.put("銀行", new String[]{"银行", "yínháng"});
        words.put("お金", new String[]{"钱", "qián"});
        words.put("財布", new String[]{"钱包", "qiánbāo"});
        words.put("切符", new String[]{"票", "piào"});
        words.put("駅員", new String[]{"售票员", "shòupiàoyuán"});
        words.put("勉強する", new String[]{"学习", "xuéxí"});
        words.put("教える", new String[]{"教", "jiāo"});
        words.put("質問", new String[]{"问题", "wèntí"});
        words.put("答え", new String[]{"答案", "dá'àn"});
        words.put("理解する", new String[]{"理解", "lǐjiě"});
        words.put("練習する", new String[]{"练习", "liànxí"});

        // --- 例文100個（サンプル: 最初の10個、残り90個は同様に追加可能） ---
        Map<String, String[]> sentences = new HashMap<>();
        sentences.put("私は学生です。", new String[]{"我是学生。", "wǒ shì xuésheng."});
        sentences.put("これはペンです。", new String[]{"这是笔。", "zhè shì bǐ."});
        sentences.put("あなたの名前は何ですか？", new String[]{"你叫什么名字？", "nǐ jiào shénme míngzi?"});
        sentences.put("私は日本から来ました。", new String[]{"我来自日本。", "wǒ láizì Rìběn."});
        sentences.put("今日はいい天気ですね。", new String[]{"今天天气很好。", "jīntiān tiānqì hěn hǎo."});
        sentences.put("昨日、映画を見ました。", new String[]{"昨天我看电影了。", "zuótiān wǒ kàn diànyǐng le."});
        sentences.put("明日、仕事があります。", new String[]{"明天有工作。", "míngtiān yǒu gōngzuò."});
        sentences.put("私は毎日中国語を勉強しています。", new String[]{"我每天学习中文。", "wǒ měitiān xuéxí zhōngwén."});
        sentences.put("旅行は楽しかったです。", new String[]{"旅行很开心。", "lǚxíng hěn kāixīn."});
        sentences.put("この問題は難しいです。", new String[]{"这个问题很难。", "zhège wèntí hěn nán."});
        sentences.put("私は音楽が好きです。", new String[]{"我喜欢音乐。", "wǒ xǐhuān yīnyuè."});
        sentences.put("彼は私の友達です。", new String[]{"他是我的朋友。", "tā shì wǒ de péngyǒu."});
        sentences.put("今日は忙しいですか？", new String[]{"你今天忙吗？", "nǐ jīntiān máng ma?"});
        sentences.put("これは私の本です。", new String[]{"这是我的书。", "zhè shì wǒ de shū."});
        sentences.put("明日は雨が降ります。", new String[]{"明天会下雨。", "míngtiān huì xiàyǔ."});
        sentences.put("あなたは何歳ですか？", new String[]{"你几岁？", "nǐ jǐ suì?"});
        sentences.put("私は毎朝6時に起きます。", new String[]{"我每天早上六点起床。", "wǒ měitiān zǎoshang liù diǎn qǐchuáng."});
        sentences.put("今日は月曜日です。", new String[]{"今天是星期一。", "jīntiān shì xīngqī yī."});
        sentences.put("明日の予定は何ですか？", new String[]{"你明天有什么计划？", "nǐ míngtiān yǒu shénme jìhuà?"});
        sentences.put("私は日本語を勉強しています。", new String[]{"我在学习日语。", "wǒ zài xuéxí Rìyǔ."});
        sentences.put("彼女は先生です。", new String[]{"她是老师。", "tā shì lǎoshī."});
        sentences.put("これはおいしいです。", new String[]{"这个很好吃。", "zhè ge hěn hǎo chī."});
        sentences.put("私は犬が好きです。", new String[]{"我喜欢狗。", "wǒ xǐhuān gǒu."});
        sentences.put("今日は暑いですね。", new String[]{"今天很热。", "jīntiān hěn rè."});
        sentences.put("昨日は寒かったです。", new String[]{"昨天很冷。", "zuótiān hěn lěng."});
        sentences.put("私は映画館に行きます。", new String[]{"我要去电影院。", "wǒ yào qù diànyǐngyuàn."});
        sentences.put("これは私の家です。", new String[]{"这是我的家。", "zhè shì wǒ de jiā."});
        sentences.put("彼はどこに住んでいますか？", new String[]{"他住在哪里？", "tā zhù zài nǎlǐ?"});
        sentences.put("私は水を飲みます。", new String[]{"我喝水。", "wǒ hē shuǐ."});
        sentences.put("私は毎朝ジョギングをします。", new String[]{"我每天早上跑步。", "wǒ měitiān zǎoshang pǎobù."});
        sentences.put("あなたは何をしていますか？", new String[]{"你在做什么？", "nǐ zài zuò shénme?"});
        sentences.put("私は昨日本を読みました。", new String[]{"我昨天读了书。", "wǒ zuótiān dú le shū."});
        sentences.put("これはいくらですか？", new String[]{"这个多少钱？", "zhè ge duōshǎo qián?"});
        sentences.put("私は音楽を聞きます。", new String[]{"我听音乐。", "wǒ tīng yīnyuè."});
        sentences.put("彼女は美しいです。", new String[]{"她很漂亮。", "tā hěn piàoliang."});
        sentences.put("今日はどこに行きますか？", new String[]{"你今天去哪儿？", "nǐ jīntiān qù nǎr?"});
        sentences.put("私は日本に行きたいです。", new String[]{"我想去日本。", "wǒ xiǎng qù Rìběn."});
        sentences.put("彼はとても優しいです。", new String[]{"他很温柔。", "tā hěn wēnróu."});
        sentences.put("これは面白いです。", new String[]{"这个很有趣。", "zhè ge hěn yǒuqù."});
        sentences.put("私はよく映画を見ます。", new String[]{"我经常看电影。", "wǒ jīngcháng kàn diànyǐng."});
        sentences.put("今日は仕事があります。", new String[]{"今天有工作。", "jīntiān yǒu gōngzuò."});
        sentences.put("私は中国語を勉強しています。", new String[]{"我学习中文。", "wǒ xuéxí zhōngwén."});
        sentences.put("彼は学生です。", new String[]{"他是学生。", "tā shì xuésheng."});
        sentences.put("これは私の財布です。", new String[]{"这是我的钱包。", "zhè shì wǒ de qiánbāo."});
        sentences.put("私はパンを食べます。", new String[]{"我吃面包。", "wǒ chī miànbāo."});
        sentences.put("昨日は雨でした。", new String[]{"昨天下雨了。", "zuótiān xià yǔ le."});
        sentences.put("私はコーヒーが好きです。", new String[]{"我喜欢咖啡。", "wǒ xǐhuān kāfēi."});
        sentences.put("これは私のペンです。", new String[]{"这是我的笔。", "zhè shì wǒ de bǐ."});
        sentences.put("彼女は学生ですか？", new String[]{"她是学生吗？", "tā shì xuésheng ma?"});
        sentences.put("私は本を読みます。", new String[]{"我读书。", "wǒ dú shū."});
        sentences.put("今日は金曜日です。", new String[]{"今天是星期五。", "jīntiān shì xīngqī wǔ."});
        sentences.put("私は毎日勉強します。", new String[]{"我每天学习。", "wǒ měitiān xuéxí."});
        sentences.put("彼は忙しいです。", new String[]{"他很忙。", "tā hěn máng."});
        sentences.put("私は昨日映画を見ました。", new String[]{"我昨天看了电影。", "wǒ zuótiān kàn le diànyǐng."});
        sentences.put("今日は天気がいいです。", new String[]{"今天天气很好。", "jīntiān tiānqì hěn hǎo."});
        sentences.put("私は日本語を話せます。", new String[]{"我会说日语。", "wǒ huì shuō Rìyǔ."});
        sentences.put("彼女はどこにいますか？", new String[]{"她在哪里？", "tā zài nǎlǐ?"});
        sentences.put("私は毎朝ジョギングをします。", new String[]{"我每天早上跑步。", "wǒ měitiān zǎoshang pǎobù."});
        sentences.put("これはとても美味しいです。", new String[]{"这个很好吃。", "zhè ge hěn hǎo chī."});
        sentences.put("私は昨日友達に会いました。", new String[]{"我昨天见了朋友。", "wǒ zuótiān jiàn le péngyǒu."});
        sentences.put("明日は休みです。", new String[]{"明天放假。", "míngtiān fàngjià."});
        sentences.put("私は毎日水を飲みます。", new String[]{"我每天喝水。", "wǒ měitiān hē shuǐ."});
        sentences.put("彼は音楽を聞きます。", new String[]{"他听音乐。", "tā tīng yīnyuè."});
        sentences.put("私は日本に行きたいです。", new String[]{"我想去日本。", "wǒ xiǎng qù Rìběn."});
        sentences.put("彼女は親切です。", new String[]{"她很亲切。", "tā hěn qīnqiè."});
        sentences.put("今日は忙しいですか？", new String[]{"你今天忙吗？", "nǐ jīntiān máng ma?"});
        sentences.put("私は毎朝6時に起きます。", new String[]{"我每天早上六点起床。", "wǒ měitiān zǎoshang liù diǎn qǐchuáng."});
        sentences.put("これは私の家です。", new String[]{"这是我的家。", "zhè shì wǒ de jiā."});
        sentences.put("彼はどこに住んでいますか？", new String[]{"他住在哪里？", "tā zhù zài nǎlǐ?"});
        sentences.put("私は昨日本を読みました。", new String[]{"我昨天读了书。", "wǒ zuótiān dú le shū."});
        sentences.put("これはいくらですか？", new String[]{"这个多少钱？", "zhè ge duōshǎo qián?"});
        sentences.put("私は映画館に行きます。", new String[]{"我要去电影院。", "wǒ yào qù diànyǐngyuàn."});
        sentences.put("彼女は美しいです。", new String[]{"她很漂亮。", "tā hěn piàoliang."});
        sentences.put("これは面白いです。", new String[]{"这个很有趣。", "zhè ge hěn yǒuqù."});
        sentences.put("私は日本語を勉強しています。", new String[]{"我学习日语。", "wǒ xuéxí Rìyǔ."});
        sentences.put("今日は水曜日です。", new String[]{"今天是星期三。", "jīntiān shì xīngqī sān."});
        sentences.put("明日は土曜日です。", new String[]{"明天是星期六。", "míngtiān shì xīngqī liù."});
        sentences.put("昨日は日曜日でした。", new String[]{"昨天是星期日。", "zuótiān shì xīngqī rì."});
        sentences.put("私は友達と話します。", new String[]{"我跟朋友说话。", "wǒ gēn péngyǒu shuōhuà."});
        sentences.put("今日は図書館に行きます。", new String[]{"今天我要去图书馆。", "jīntiān wǒ yào qù túshūguǎn."});
        sentences.put("私は毎日勉強しています。", new String[]{"我每天学习。", "wǒ měitiān xuéxí."});
        sentences.put("彼は親切です。", new String[]{"他很亲切。", "tā hěn qīnqiè."});
        sentences.put("私は朝ご飯を食べました。", new String[]{"我吃了早餐。", "wǒ chī le zǎocān."});
        sentences.put("今日は天気が悪いです。", new String[]{"今天天气不好。", "jīntiān tiānqì bù hǎo."});
        sentences.put("明日は晴れるでしょう。", new String[]{"明天会晴。", "míngtiān huì qíng."});
        sentences.put("私は野菜が好きです。", new String[]{"我喜欢蔬菜。", "wǒ xǐhuān shūcài."});
        sentences.put("彼女は優しいです。", new String[]{"她很温柔。", "tā hěn wēnróu."});
        sentences.put("私は毎日運動します。", new String[]{"我每天运动。", "wǒ měitiān yùndòng."});

        
        // --- ゲーム開始 ---
        System.out.println("🎉 中国語学習ゲーム 🎉");
        int rounds = 10; // 出題数
        int score = 0;
        int combo = 0;

        Object[] wordKeys = words.keySet().toArray();
        Object[] sentenceKeys = sentences.keySet().toArray();

        for (int i = 0; i < rounds; i++) {
            boolean isWord = random.nextBoolean();
            String question;
            String[] answerData;

            if (isWord) {
                question = (String) wordKeys[random.nextInt(wordKeys.length)];
                answerData = words.get(question);
                System.out.println((i + 1) + "問（単語）: 「" + question + "」の中文は？");
            } else {
                question = (String) sentenceKeys[random.nextInt(sentenceKeys.length)];
                answerData = sentences.get(question);
                System.out.println((i + 1) + "問（例文）: 「" + question + "」の中文は？");
            }

            System.out.println("ヒント（ピンイン）: " + answerData[1]);
            System.out.print("答え: ");
            String answer = scanner.nextLine();

            if (answer.equals(answerData[0])) {
                combo++;
                int points = 1 + combo / 2;
                score += points;
                System.out.println("✅ 正解！ +" + points + "点（連続正解 " + combo + "）\n");
            } else {
                System.out.println("❌ 不正解... 正解は「" + answerData[0] + "」です。\n");
                combo = 0;
            }
        }

        System.out.println("🏁 ゲーム終了！あなたの総得点: " + score + "/" + (rounds * 2));
        scanner.close();
    }
}
