package com.example.sudokusolver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

/**
 *  CADA UNO DE LOS CUADRADOS DEL SUDOKU
 */
private lateinit var a1: CardView
private lateinit var a2: CardView
private lateinit var a3: CardView
private lateinit var a4: CardView
private lateinit var b1: CardView
private lateinit var b2: CardView
private lateinit var b3: CardView
private lateinit var b4: CardView
private lateinit var c1: CardView
private lateinit var c2: CardView
private lateinit var c3: CardView
private lateinit var c4: CardView
private lateinit var d1: CardView
private lateinit var d2: CardView
private lateinit var d3: CardView
private lateinit var d4: CardView




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initComponents()
    }

    private fun initListeners(){
        a1.setOnClickListener{

        }
        a2.setOnClickListener{

        }
        a3.setOnClickListener{

        }
        a4.setOnClickListener{

        }
        b1.setOnClickListener{

        }
        b2.setOnClickListener{

        }
        b3.setOnClickListener{

        }
        b4.setOnClickListener{

        }
        c1.setOnClickListener{

        }
        c2.setOnClickListener{

        }
        c3.setOnClickListener{

        }
        c4.setOnClickListener{

        }
        d1.setOnClickListener{

        }
        d2.setOnClickListener{

        }
        d3.setOnClickListener{

        }
        d4.setOnClickListener{

        }


    }

    private fun initComponents(){
        a1 = findViewById(R.id.a1)
        a2 = findViewById(R.id.a2)
        a3 = findViewById(R.id.a3)
        a4 = findViewById(R.id.a4)
        b1 = findViewById(R.id.b1)
        b2 = findViewById(R.id.b2)
        b3 = findViewById(R.id.b3)
        b4 = findViewById(R.id.b4)
        c1 = findViewById(R.id.c1)
        c2 = findViewById(R.id.c2)
        c3 = findViewById(R.id.c3)
        c4 = findViewById(R.id.c4)
        d1 = findViewById(R.id.c1)
        d2 = findViewById(R.id.d2)
        d3 = findViewById(R.id.d3)
        d4 = findViewById(R.id.d4)
    }
}