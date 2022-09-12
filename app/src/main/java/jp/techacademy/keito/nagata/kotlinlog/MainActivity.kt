package jp.techacademy.keito.nagata.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.util.Log

class MainActivity() : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Log.d("kotlintest", "ログへの出力テスト")
//        val dog = Dog("ポチ", 3)      // 名前をポチ、年齢3歳で、Dogのインスタンスを作る
//        dog.move()

        val human = Human("太郎", 20, "カメラ")
        human.say()
        human.think()

        val human1 = Human("次郎", 21, "映画鑑賞")
        human1.say()
        human1.think()



    }


}