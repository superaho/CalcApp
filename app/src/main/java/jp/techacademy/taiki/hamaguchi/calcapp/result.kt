package jp.techacademy.taiki.hamaguchi.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)


        val type  = intent.getIntExtra("TYPE", 1)
        val value1 = intent.getStringExtra("VALUE1")
        val value2 = intent.getStringExtra("VALUE2")


        val Deform1 = StringToIntFloat(value1!!)
        val Deform2 = StringToIntFloat(value2!!)

        var result: Float = 0F
        when (type){
            1 ->
                result = Deform1 + Deform2
            2 ->
                result = Deform1 - Deform2
            3 ->
                result = Deform1 * Deform2
            4 ->
                result = Deform1 / Deform2
        }

        textView.text = "${result}"
    }

    fun StringToIntFloat(v: String): Float{
        try {
            val num: Float = v.toFloat()
            return num
        } catch (e: NumberFormatException) {
            print("error")
            return 0F
        }
    }
}