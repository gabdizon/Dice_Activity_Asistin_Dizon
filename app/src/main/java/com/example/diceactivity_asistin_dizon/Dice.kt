package com.example.diceactivity_asistin_dizon

import android.util.Log

class Dice {
    var die1 = (1..6).random()
    var die2 = (1..12).random()
    var die3 = (1..18).random()
    val luck1 = 5
    val luck2 = 10
    val luck3 = 15
    var die1Res:Boolean = false
    var die2Res:Boolean = false
    var die3Res:Boolean = false

    private fun luckyChecker() {
        die1Res = die1 == luck1
        die2Res = die2 == luck2
        die3Res = die3 == luck3
    }

    val callfun = luckyChecker()
 }