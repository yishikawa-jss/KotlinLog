package jp.techacademy.yuya.ishikawa.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        val dog = Dog("ポチ", 3)      // 名前をポチ、年齢3歳で、Dogのインスタンスを作る
        dog.say()
        dog.move()
*/
        val humanA = Human("AAAA", 100, "soccer")
        humanA.say()
        humanA.think()

        val humanB = Human("BBBB", 5, "baseball")
        humanB.say()
        humanB.think()
    }

}