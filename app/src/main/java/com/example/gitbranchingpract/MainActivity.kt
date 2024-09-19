package com.example.gitbranchingpract

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gitbranchingpract.model.About
import java.util.Arrays

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

        val aboutRv: RecyclerView = findViewById(R.id.rvListOfAboutCard)
        aboutRv.layoutManager = LinearLayoutManager(this)

        val sampleAbout = About("Jane Doe",
            "ZZZ",
            R.drawable.jane_doe_dp,
            {view ->
                val intent = Intent(this, AboutDoeJActivity::class.java)
                startActivity(intent)
            })

        aboutRv.adapter = AboutAdapter(Arrays.asList(
            sampleAbout,
            sampleAbout,
            sampleAbout,
            sampleAbout,
            sampleAbout,
            sampleAbout,
            sampleAbout,
            sampleAbout,
            sampleAbout,
            sampleAbout,
            sampleAbout,
            sampleAbout,
            sampleAbout,
            sampleAbout,
            sampleAbout
        ))

    }
}