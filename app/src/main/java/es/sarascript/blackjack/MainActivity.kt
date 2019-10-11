
package es.sarascript.blackjack

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var txtPlayer1: TextView
    private lateinit var txtPlayer2: TextView
    private lateinit var txtResultPlayer1: TextView
    private lateinit var txtResultPlayer2: TextView
    private lateinit var btnPlayer1: Button
    private lateinit var btnPlayer2: Button
    private lateinit var btnStopPlayer1: Button
    private lateinit var btnStopPlayer2: Button
    private lateinit var dice1: ImageView
    private lateinit var dice2: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtPlayer1 = findViewById(R.id.j1_txt)
        txtResultPlayer1= findViewById(R.id.score1_txt)
        dice1 = findViewById(R.id.dice1_img)
        txtPlayer2 = findViewById(R.id.j2_txt)
        txtResultPlayer2 = findViewById(R.id.score2_txt)

        btnPlayer1 = findViewById(R.id.j1_btn)
        btnStopPlayer1= findViewById(R.id.stop1_btn)
        dice2 = findViewById(R.id.dice2_img)
        btnPlayer2 = findViewById(R.id.j2_btn)
        btnStopPlayer2 = findViewById(R.id.stop2_btn)

        var contPlayer1 = 0
        var contPlayer2 = 0

        fun randomNumber(): Int {
            var random = (1..6).random()
            return random
        }

        btnPlayer1.setOnClickListener {
            var num = randomNumber()
            when (num) {
                1 -> {
                    contPlayer1 = contPlayer1 + 1
                    dice1.setImageResource(R.drawable.number_1)
                    txtResultPlayer1.text = contPlayer1.toString()

                }
                2 -> {
                    contPlayer1 = contPlayer1 + 2
                    dice1.setImageResource(R.drawable.number_2)
                    txtResultPlayer1.text = contPlayer1.toString()

                }
                3 -> {
                    contPlayer1 = contPlayer1 + 3
                    dice1.setImageResource(R.drawable.number_3)
                    txtResultPlayer1.text = contPlayer1.toString()
                }
                4 -> {
                    contPlayer1 = contPlayer1 + 4
                    dice1.setImageResource(R.drawable.number_4)
                    txtResultPlayer1.text = contPlayer1.toString()
                }
                5 -> {
                    contPlayer1 = contPlayer1 + 5
                    dice1.setImageResource(R.drawable.number_5)
                    txtResultPlayer1.text = contPlayer1.toString()
                }
                6 -> {
                    contPlayer1 = contPlayer1 + 6
                    dice1.setImageResource(R.drawable.number_6)
                    txtResultPlayer1.text = contPlayer1.toString()
                }
            }
        }

        btnPlayer2.setOnClickListener {
            var num = randomNumber()
            when (num) {
                1 -> {
                    contPlayer2 = contPlayer2 + 1
                    dice2.setImageResource(R.drawable.number_1)
                    txtResultPlayer2.text = contPlayer2.toString()

                }
                2 -> {
                    contPlayer2 = contPlayer2 + 2
                    dice2.setImageResource(R.drawable.number_2)
                    txtResultPlayer2.text = contPlayer2.toString()

                }
                3 -> {
                    contPlayer2 = contPlayer2 + 3
                    dice2.setImageResource(R.drawable.number_3)
                    txtResultPlayer2.text = contPlayer2.toString()
                }
                4 -> {
                    contPlayer2 = contPlayer2 + 4
                    dice2.setImageResource(R.drawable.number_4)
                    txtResultPlayer2.text = contPlayer2.toString()
                }
                5 -> {
                    contPlayer2 = contPlayer2 + 5
                    dice2.setImageResource(R.drawable.number_5)
                    txtResultPlayer2.text = contPlayer2.toString()
                }
                6 -> {
                    contPlayer2 = contPlayer2 + 6
                    dice2.setImageResource(R.drawable.number_6)
                    txtResultPlayer2.text = contPlayer2.toString()
                }
            }
        }

        btnStopPlayer1.setOnClickListener {
            btnPlayer1.setEnabled(false)
        }

        btnStopPlayer2.setOnClickListener {
            btnPlayer2.setEnabled(false)
        }

    }

}
