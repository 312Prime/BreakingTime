package kr.co.si312.breakingtime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.co.si312.breakingtime.databinding.ActivityMainBinding
import kr.co.si312.breakingtime.games.KordleActivity
import kr.co.si312.breakingtime.games.WordleActivity

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.wordleBtn.setOnClickListener {
            val intent = Intent(this,WordleActivity::class.java)
            startActivity(intent)
        }
        binding.kordleBtn.setOnClickListener {
            val intent = Intent(this,KordleActivity::class.java)
            startActivity(intent)
        }


    }
}