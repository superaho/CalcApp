package jp.techacademy.taiki.hamaguchi.calcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.view.View
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.button1 ->
                if (emptyCheck(editText.text.toString(), editText2.text.toString(), v)) {
                    val intent = Intent(this, result::class.java)
                    intent.putExtra("TYPE", 1)
                    intent.putExtra("VALUE1", editText.text.toString())
                    intent.putExtra("VALUE2", editText2.text.toString())
                    startActivity(intent)
                }
            R.id.button2 ->
                if (emptyCheck(editText.text.toString(), editText2.text.toString(), v)) {
                    val intent = Intent(this, result::class.java)
                    intent.putExtra("TYPE", 2)
                    intent.putExtra("VALUE1", editText.text.toString())
                    intent.putExtra("VALUE2", editText2.text.toString())
                    startActivity(intent)
                }
            R.id.button3 ->
                if (emptyCheck(editText.text.toString(), editText2.text.toString(), v)) {
                    val intent = Intent(this, result::class.java)
                    intent.putExtra("TYPE", 3)
                    intent.putExtra("VALUE1", editText.text.toString())
                    intent.putExtra("VALUE2", editText2.text.toString())
                    startActivity(intent)
                }
            R.id.button4 ->
                if (emptyCheck(editText.text.toString(), editText2.text.toString(), v)) {
                    val intent = Intent(this, result::class.java)
                    intent.putExtra("TYPE", 4)
                    intent.putExtra("VALUE1", editText.text.toString())
                    intent.putExtra("VALUE2", editText2.text.toString())
                    startActivity(intent)
                }
        }
    }

    fun emptyCheck(param1: String, param2: String, view: View): Boolean {
        if (param1.isNullOrBlank() || param2.isNullOrBlank() || param1 == "-" || param1 == "." || param2 == "-" || param2 == ".") {
            Snackbar.make(view, "数値を入力してください", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
            return false
        } else {
            return true
        }
    }
}