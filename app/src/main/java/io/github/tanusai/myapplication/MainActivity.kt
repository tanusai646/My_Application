package io.github.tanusai.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val hallotext: TextView = findViewById(R.id.text1)
        val button1: Button = findViewById(R.id.button)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)

        var h: Int = 0
        //インクリメント設定
        button1.setOnClickListener {
            h++
            hallotext.text = h.toString()
        }
        //デクリメント設定
        button2.setOnClickListener {
            h--
            hallotext.text = h.toString()
        }

        button3.setOnClickListener {
            val intent = Intent(this, SubActivity::class.java)
            //h++
            //hallotext.text = h.toString()
            //startActivity(intent)
            startActivity(intent)
        }
    }
}
