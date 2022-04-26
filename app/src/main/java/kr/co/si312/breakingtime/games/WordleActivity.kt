package kr.co.si312.breakingtime.games

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kr.co.si312.breakingtime.R
import kr.co.si312.breakingtime.databinding.ActivityWordleBinding
import java.lang.NumberFormatException

class WordleActivity : AppCompatActivity() {

    lateinit var binding: ActivityWordleBinding
    var answer = "ASDFG"
    var wordNow = ""
    var wordNowFull = ""
    var wordCnt = 0
    var word1 : TextView? = null
    var word2 : TextView? = null
    var word3 : TextView? = null
    var word4 : TextView? = null
    var word5 : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityWordleBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        word1 = findViewById<TextView>(R.id.word11)
        word2 = findViewById<TextView>(R.id.word12)
        word3 = findViewById<TextView>(R.id.word13)
        word4 = findViewById<TextView>(R.id.word14)
        word5 = findViewById<TextView>(R.id.word15)

        binding.btnA.setOnClickListener { wordNow = "A"; wordAdd()}
        binding.btnB.setOnClickListener { wordNow = "B"; wordAdd() }
        binding.btnC.setOnClickListener { wordNow = "C"; wordAdd() }
        binding.btnD.setOnClickListener { wordNow = "D"; wordAdd() }
        binding.btnE.setOnClickListener { wordNow = "E"; wordAdd() }
        binding.btnF.setOnClickListener { wordNow = "F"; wordAdd() }
        binding.btnG.setOnClickListener { wordNow = "G"; wordAdd() }
        binding.btnH.setOnClickListener { wordNow = "H"; wordAdd() }
        binding.btnI.setOnClickListener { wordNow = "I"; wordAdd() }
        binding.btnJ.setOnClickListener { wordNow = "J"; wordAdd() }
        binding.btnK.setOnClickListener { wordNow = "K"; wordAdd() }
        binding.btnL.setOnClickListener { wordNow = "L"; wordAdd() }
        binding.btnM.setOnClickListener { wordNow = "M"; wordAdd() }
        binding.btnN.setOnClickListener { wordNow = "N"; wordAdd() }
        binding.btnO.setOnClickListener { wordNow = "O"; wordAdd() }
        binding.btnP.setOnClickListener { wordNow = "P"; wordAdd() }
        binding.btnQ.setOnClickListener { wordNow = "Q"; wordAdd()}
        binding.btnR.setOnClickListener { wordNow = "R"; wordAdd() }
        binding.btnS.setOnClickListener { wordNow = "S"; wordAdd() }
        binding.btnT.setOnClickListener { wordNow = "T"; wordAdd() }
        binding.btnU.setOnClickListener { wordNow = "U"; wordAdd() }
        binding.btnV.setOnClickListener { wordNow = "V"; wordAdd() }
        binding.btnW.setOnClickListener { wordNow = "W"; wordAdd() }
        binding.btnX.setOnClickListener { wordNow = "X"; wordAdd() }
        binding.btnY.setOnClickListener { wordNow = "Y"; wordAdd() }
        binding.btnZ.setOnClickListener { wordNow = "Z"; wordAdd() }
        binding.btnBack.setOnClickListener { wordDelete() }
        binding.btnEnter.setOnClickListener { wordEnter() }




    }
    private fun wordAdd(){
        if (wordNowFull.length<5) {
            wordNowFull += wordNow
        }
        wordRefresh()
    }

    private fun wordDelete(){
        if(wordNowFull.length!=0){
            wordNowFull=wordNowFull.substring(0,wordNowFull.length-1)
            wordRefresh()
        }
    }

    private fun wordRefresh(){
        try {word1?.setText(wordNowFull[0].toString())} catch (e : Exception){word1?.setText("_")}
        try {word2?.setText(wordNowFull[1].toString())} catch (e : Exception){word2?.setText("_")}
        try {word3?.setText(wordNowFull[2].toString())} catch (e : Exception){word3?.setText("_")}
        try {word4?.setText(wordNowFull[3].toString())} catch (e : Exception){word4?.setText("_")}
        try {word5?.setText(wordNowFull[4].toString())} catch (e : Exception){word5?.setText("_")}

    }

    private fun wordEnter(){
        if (wordNowFull.length==5){
            if(wordNowFull.equals(answer)){
                Toast.makeText(this,"Clear",Toast.LENGTH_SHORT).show()
            } else {
                if (wordCnt==5){
                    Toast.makeText(this,"Fail",Toast.LENGTH_SHORT).show()
                } else {
                    if (word1?.text?.equals(answer[0]) == true){
                        word1?.setTextColor(-0xffff01)
                    } else{
                        word1?.setTextColor(-0x9999999)
                    }
                    if (word2?.text?.equals(answer[0]) == true){
                        word2?.setTextColor(-0xffff01)
                    } else{
                        word2?.setTextColor(-0x9999999)
                    }
                    if (word3?.text?.equals(answer[0]) == true){
                        word3?.setTextColor(-0xffff01)
                    } else{
                        word3?.setTextColor(-0x9999999)
                    }
                    if (word4?.text?.equals(answer[0]) == true){
                        word4?.setTextColor(-0xffff01)
                    } else{
                        word4?.setTextColor(-0x9999999)
                    }
                    if (word5?.text?.equals(answer[0]) == true){
                        word5?.setTextColor(-0xffff01)
                    } else{
                        word5?.setTextColor(-0x9999999)
                    }
                    lineChange()
                    Toast.makeText(this,"again",Toast.LENGTH_SHORT).show()
                }
            }
        } else {
            Toast.makeText(this,"다섯 음절을 입력해주세요.",Toast.LENGTH_SHORT).show()
        }
    }

    private fun lineChange(){
        wordCnt++
        wordNowFull=""
        if (wordCnt == 1){
            word1 = findViewById(R.id.word21)
            word2 = findViewById(R.id.word22)
            word3 = findViewById(R.id.word23)
            word4 = findViewById(R.id.word24)
            word5 = findViewById(R.id.word25)
        } else if (wordCnt == 2){
            word1 = findViewById(R.id.word31)
            word2 = findViewById(R.id.word32)
            word3 = findViewById(R.id.word33)
            word4 = findViewById(R.id.word34)
            word5 = findViewById(R.id.word35)
        }else if (wordCnt == 3){
            word1 = findViewById(R.id.word41)
            word2 = findViewById(R.id.word42)
            word3 = findViewById(R.id.word43)
            word4 = findViewById(R.id.word44)
            word5 = findViewById(R.id.word45)
        }else if (wordCnt == 4){
            word1 = findViewById(R.id.word51)
            word2 = findViewById(R.id.word52)
            word3 = findViewById(R.id.word53)
            word4 = findViewById(R.id.word54)
            word5 = findViewById(R.id.word55)
        }

    }
}