package com.example.diceactivity_asistin_dizon

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val d1 = findViewById<TextView>(R.id.dice1)
        val d2 = findViewById<TextView>(R.id.dice2)
        val d3 = findViewById<TextView>(R.id.dice3)
        val l1 = findViewById<TextView>(R.id.lucky1)
        val l2 = findViewById<TextView>(R.id.lucky2)
        val l3 = findViewById<TextView>(R.id.lucky3)
        val cb = findViewById<CheckBox>(R.id.checkbox)
        val p = findViewById<Button>(R.id.play)
        val pn = findViewById<EditText>(R.id.player)
        var counter:Int = 0
        var str1:String = ""
        var str2:String = ""
        var str3:String = ""

        p.setOnClickListener{
            counter=0
            val cDice = Dice()

            d1.text = "Dice No. 1: " + cDice.die1.toString()
            d2.text = "Dice No. 2: " + cDice.die2.toString()
            d3.text = "Dice No. 3: " + cDice.die3.toString()

            if (cDice.die1Res==true){
                l1.text = "Lucky"
                counter++
            } else{
                l1.text = "Unlucky"
            }

            if (cDice.die2Res==true){
                l2.text = "Lucky"
                counter++
            } else{
                l2.text = "Unlucky"
            }

            if (cDice.die3Res==true){
                l3.text = "Lucky"
                counter++
            } else{
                l3.text = "Unlucky"
            }

            Log.d("TAG",cDice.die1Res.toString())
            Log.d("TAG",cDice.die2Res.toString())
            Log.d("TAG",cDice.die3Res.toString())

            if (cb.isChecked){
                if (counter!=0){
                    val toast = Toast.makeText(applicationContext,pn.text.toString() + ", you won "+ counter.toString()+" out of 3!",Toast.LENGTH_SHORT)
                    toast.show()
                } else{
                    val toast = Toast.makeText(applicationContext,pn.text.toString() + ", you lose!",Toast.LENGTH_SHORT)
                    toast.show()
                }
            }
        }
    }
}