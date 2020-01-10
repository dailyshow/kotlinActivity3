package com.cis.activityapp3

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_test.*

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val data1 = intent.getIntExtra("data1", 0)
        val data2 = intent.getDoubleExtra("data2", 0.0)

        app3SecondTv.text = "받은 data1 : ${data1}\n"
        app3SecondTv.append("받은 data2 : ${data2}")

        app3SecondBtn.setOnClickListener { view ->
            val intent3 = Intent()
            intent3.putExtra("value1", 33)
            intent3.putExtra("value2", 33.33)

            setResult(Activity.RESULT_CANCELED, intent3)
            finish()
        }
    }
}
