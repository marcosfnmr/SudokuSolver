package com.example.sudokusolver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.example.sudokusolver.Sudoku



private lateinit var cvSelected: CardView
private lateinit var tvSelected: TextView

private lateinit var btnSolve: Button
private lateinit var sudoku: Sudoku
private lateinit var listaNums: Array<Int>

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

/**
 * BOTONES DEL PAD DE NUMEROS
 */
private lateinit var btnNum1: Button
private lateinit var btnNum2: Button
private lateinit var btnNum3: Button
private lateinit var btnNum4: Button
private lateinit var btnZero: Button


/**
 *  TEXTVIEW DE CADA CUADRADO
 */
private lateinit var a1Text: TextView
private lateinit var a2Text: TextView
private lateinit var a3Text: TextView
private lateinit var a4Text: TextView
private lateinit var b1Text: TextView
private lateinit var b2Text: TextView
private lateinit var b3Text: TextView
private lateinit var b4Text: TextView
private lateinit var c1Text: TextView
private lateinit var c2Text: TextView
private lateinit var c3Text: TextView
private lateinit var c4Text: TextView
private lateinit var d1Text: TextView
private lateinit var d2Text: TextView
private lateinit var d3Text: TextView
private lateinit var d4Text: TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initComponents()
        initListeners()
    }

    private fun initListeners() {
        a1.setOnClickListener {
            cardDeselector()
            selectSquare(a1, a1Text)
        }
        a2.setOnClickListener {
            cardDeselector()
            selectSquare(a2, a2Text)
        }
        a3.setOnClickListener {
            cardDeselector()
            selectSquare(a3, a3Text)
        }
        a4.setOnClickListener {
            cardDeselector()
            selectSquare(a4, a4Text)
        }
        b1.setOnClickListener {
            cardDeselector()
            selectSquare(b1, b1Text)
        }
        b2.setOnClickListener {
            cardDeselector()
            selectSquare(b2, b2Text)
        }
        b3.setOnClickListener {
            cardDeselector()
            selectSquare(b3, b3Text)
        }
        b4.setOnClickListener {
            cardDeselector()
            selectSquare(b4, b4Text)
        }
        c1.setOnClickListener {
            cardDeselector()
            selectSquare(c1, c1Text)
        }
        c2.setOnClickListener {
            cardDeselector()
            selectSquare(c2, c2Text)
        }
        c3.setOnClickListener {
            cardDeselector()
            selectSquare(c3, c3Text)
        }
        c4.setOnClickListener {
            cardDeselector()
            selectSquare(c4, c4Text)
        }
        d1.setOnClickListener {
            cardDeselector()
            selectSquare(d1, d1Text)
        }
        d2.setOnClickListener {
            cardDeselector()
            selectSquare(d2, d2Text)
        }
        d3.setOnClickListener {
            cardDeselector()
            selectSquare(d3, d3Text)
        }
        d4.setOnClickListener {
            cardDeselector()
            selectSquare(d4, d4Text)
        }

        btnNum1.setOnClickListener {
            tvSelected!!.text = btnNum1.text.toString()
            cardDeselector()
        }
        btnNum2.setOnClickListener {
            tvSelected!!.text = btnNum2.text.toString()
            cardDeselector()
        }
        btnNum3.setOnClickListener {
            tvSelected!!.text = btnNum3.text.toString()
            cardDeselector()
        }
        btnNum4.setOnClickListener {
            tvSelected!!.text = btnNum4.text.toString()
            cardDeselector()
        }
        btnZero.setOnClickListener {
            tvSelected!!.text = ""
            cardDeselector()
        }

        btnSolve.setOnClickListener{
            // Carga los numeros en el array
            addArray()
            // Añade los numeros al array
            setSudoku()
        }

    }

    private fun initComponents() {


        // CARDVIEWS
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
        d1 = findViewById(R.id.d1)
        d2 = findViewById(R.id.d2)
        d3 = findViewById(R.id.d3)
        d4 = findViewById(R.id.d4)

        // TEXTVIEWS
        a1Text = findViewById(R.id.a1Text)
        a2Text = findViewById(R.id.a2Text)
        a3Text = findViewById(R.id.a3Text)
        a4Text = findViewById(R.id.a4Text)
        b1Text = findViewById(R.id.b1Text)
        b2Text = findViewById(R.id.b2Text)
        b3Text = findViewById(R.id.b3Text)
        b4Text = findViewById(R.id.b4Text)
        c1Text = findViewById(R.id.c1Text)
        c2Text = findViewById(R.id.c2Text)
        c3Text = findViewById(R.id.c3Text)
        c4Text = findViewById(R.id.c4Text)
        d1Text = findViewById(R.id.d1Text)
        d2Text = findViewById(R.id.d2Text)
        d3Text = findViewById(R.id.d3Text)
        d4Text = findViewById(R.id.d4Text)

        //BOTONES DE NUMEROS
        btnNum1 = findViewById(R.id.btnNum1)
        btnNum2 = findViewById(R.id.btnNum2)
        btnNum3 = findViewById(R.id.btnNum3)
        btnNum4 = findViewById(R.id.btnNum4)
        btnZero = findViewById(R.id.btnzero)

        cvSelected = a1
        tvSelected = a1Text
        btnSolve = findViewById(R.id.btnSolve)
    }

    /**
     * Selecciona un cuadrado del sudoku
     * @param cv cuadrado a seleccionar
     */
    private fun selectSquare(cv: CardView, tv: TextView) {
        //Cambio el color a seleccionado
        cv.setCardBackgroundColor(getColor(R.color.colorSelected))
        cvSelected = cv
        tvSelected = tv
    }

    /**
     * Elimina la selección de todos los cuadrados y devuelve el color de fondo
     */
    private fun cardDeselector() {
        a1.setCardBackgroundColor(getColor(R.color.cuadradoGrid))
        a2.setCardBackgroundColor(getColor(R.color.cuadradoGrid))
        a3.setCardBackgroundColor(getColor(R.color.cuadradoGrid))
        a4.setCardBackgroundColor(getColor(R.color.cuadradoGrid))
        b1.setCardBackgroundColor(getColor(R.color.cuadradoGrid))
        b2.setCardBackgroundColor(getColor(R.color.cuadradoGrid))
        b3.setCardBackgroundColor(getColor(R.color.cuadradoGrid))
        b4.setCardBackgroundColor(getColor(R.color.cuadradoGrid))
        a1.setCardBackgroundColor(getColor(R.color.cuadradoGrid))
        d1.setCardBackgroundColor(getColor(R.color.cuadradoGrid))
        d2.setCardBackgroundColor(getColor(R.color.cuadradoGrid))
        d3.setCardBackgroundColor(getColor(R.color.cuadradoGrid))
        d4.setCardBackgroundColor(getColor(R.color.cuadradoGrid))
        c1.setCardBackgroundColor(getColor(R.color.cuadradoGrid))
        c2.setCardBackgroundColor(getColor(R.color.cuadradoGrid))
        c3.setCardBackgroundColor(getColor(R.color.cuadradoGrid))
        c4.setCardBackgroundColor(getColor(R.color.cuadradoGrid))
    }
    private fun addArray(){
        listaNums = arrayOf(a1Text.toString().toInt(), a2Text.toString().toInt(), a3Text.toString().toInt(), a4Text.toString().toInt(),
                            b1Text.toString().toInt(), b2Text.toString().toInt(), b3Text.toString().toInt(), b4Text.toString().toInt(),
                            c1Text.toString().toInt(), c2Text.toString().toInt(), c3Text.toString().toInt(), c4Text.toString().toInt(),
                            d1Text.toString().toInt(), d2Text.toString().toInt(), d3Text.toString().toInt(), d4Text.toString().toInt())
    }
    private fun setSudoku(){
        var n=0
        for (i in 0..4){
            for(j in 0..4){
                // Añade el numero y si es un blanco añade un 0
                if(listaNums[n]==1 || listaNums[n]==2 || listaNums[n]==3 || listaNums[n]==4) {
                    sudoku.setSudokuNum(i, j, listaNums[n])
                    n++
                }else{
                    sudoku.setSudokuNum(i, j, 0)
                }
            }
        }
    }

}