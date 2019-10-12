package kimura.norihiko.techacademy.kadai3_9

import android.util.Log

open class Human: Animal, Thinkable{
    // 引数付きコンストラクタ
    constructor(name: String, age: String): super(name, age) {
    }

    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。年は" + this.age + "歳です。")
    }

    // Thinkableインターフェースのメソッドをオーバーライド
    override fun think() {
        var hobby = "~~"
        Log.d("kotlintest", "私は" + hobby + "について考える。")
    }
}