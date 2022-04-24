package kr.co.si312.breakingtime.games

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.co.si312.breakingtime.R
import kr.co.si312.breakingtime.databinding.ActivityWordleBinding

class WordleActivity : AppCompatActivity() {

    lateinit var binding: ActivityWordleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityWordleBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}