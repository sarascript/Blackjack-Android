
package es.sarascript.blackjack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtPlayer1 = findViewById(R.id.j1_txt)
        txtResultPlayer1= findViewById(R.id.score1_txt)
        txtPlayer2 = findViewById(R.id.j2_txt)
        txtResultPlayer2 = findViewById(R.id.score2_txt)

        btnPlayer1 = findViewById(R.id.j1_btn)
        btnStopPlayer1= findViewById(R.id.stop1_btn)
        btnPlayer2 = findViewById(R.id.j2_btn)
        btnStopPlayer2 = findViewById(R.id.stop2_btn)


    }

}
