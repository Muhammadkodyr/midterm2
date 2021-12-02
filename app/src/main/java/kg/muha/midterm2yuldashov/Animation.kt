package kg.muha.midterm2yuldashov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class Animation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)

        val perehod = findViewById<LinearLayout>(R.id.ll3)

        perehod.setOnClickListener{
            startActivity(Intent(this,Animation::class.java))
        }
    }
}