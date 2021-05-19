package com.example.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
//    var diceImage : ImageView? = null
    lateinit var diceImage : ImageView
    lateinit var diceImage1 : ImageView
    lateinit var diceImage2 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        val resetButton: Button = findViewById(R.id.reset_button)
        rollButton.setOnClickListener { rollDice() }
        resetButton.setOnClickListener { resetRoll() }
        diceImage = findViewById(R.id.dice_image1)
        diceImage1 = findViewById(R.id.dice_image2)
        diceImage2 = findViewById(R.id.dice_image3)
    }
    private fun rollDice() {
        val randomInt = (1..6).random()
        val randomInt1 = (1..6).random()
        val randomInt2 = (1..6).random()
//
//        Toast.makeText(this, "button clicked",
//            Toast.LENGTH_SHORT).show()
        val resultText: TextView = findViewById(R.id.result_text)

        resultText.text = (randomInt + randomInt1 + randomInt2).toString()
//        val diceImage: ImageView = findViewById(R.id.dice_image)
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val drawableResource1 = when (randomInt1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val drawableResource2 = when (randomInt2) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
        diceImage1.setImageResource(drawableResource1)
        diceImage2.setImageResource(drawableResource2)


    }
    private fun resetRoll() {
        val resultText: TextView = findViewById(R.id.result_text)
        diceImage.setImageResource(R.drawable.empty_dice)
        diceImage1.setImageResource(R.drawable.empty_dice)
        diceImage2.setImageResource(R.drawable.empty_dice)
        resultText.text = "0"
    }
}