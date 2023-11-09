package com.example.sudokusolver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.cardview.widget.CardView


var cvSelected: CardView? = null
var tvSelected: TextView? = null
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
private lateinit var btnNum5: Button
private lateinit var btnNum6: Button
private lateinit var btnNum7: Button
private lateinit var btnNum8: Button
private lateinit var btnNum9: Button
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

    private fun initListeners(){
        a1.setOnClickListener{
            selectSquare(a1, a1Text)
        }
        a2.setOnClickListener{
            selectSquare(a2, a2Text)
        }
        a3.setOnClickListener{
            selectSquare(a3, a3Text)
        }
        a4.setOnClickListener{
            selectSquare(a4, a4Text)
        }
        b1.setOnClickListener{
            selectSquare(b1, b1Text)
        }
        b2.setOnClickListener{
            selectSquare(b2, b2Text)
        }
        b3.setOnClickListener{
            selectSquare(b3, b3Text)
        }
        b4.setOnClickListener{
            selectSquare(b4, b4Text)
        }
        c1.setOnClickListener{
            selectSquare(c1, c1Text)
        }
        c2.setOnClickListener{
            selectSquare(c2, c2Text)
        }
        c3.setOnClickListener{
            selectSquare(c3, c3Text)
        }
        c4.setOnClickListener{
            selectSquare(c4, c4Text)
        }
        d1.setOnClickListener{
            selectSquare(d1, d1Text)
        }
        d2.setOnClickListener{
            selectSquare(d2, d2Text)
        }
        d3.setOnClickListener{
            selectSquare(d3, d3Text)
        }
        d4.setOnClickListener{
            selectSquare(d4, d4Text)
        }

        btnNum1.setOnClickListener{
            tvSelected!!.text = btnNum1.text.toString()
            cvSelected!!.setCardBackgroundColor(getColor(R.color.colorFondo))
        }
        btnNum2.setOnClickListener{
            tvSelected!!.text = btnNum2.text.toString()
            cvSelected!!.setCardBackgroundColor(getColor(R.color.colorFondo))
        }
        btnNum3.setOnClickListener{
            tvSelected!!.text = btnNum3.text.toString()
            cvSelected!!.setCardBackgroundColor(getColor(R.color.colorFondo))
        }
        btnNum4.setOnClickListener{
            tvSelected!!.text = btnNum4.text.toString()
            cvSelected!!.setCardBackgroundColor(getColor(R.color.colorFondo))
        }
        btnNum5.setOnClickListener{
            tvSelected!!.text = btnNum5.text.toString()
            cvSelected!!.setCardBackgroundColor(getColor(R.color.colorFondo))
        }
        btnNum6.setOnClickListener{
            tvSelected!!.text = btnNum6.text.toString()
            cvSelected!!.setCardBackgroundColor(getColor(R.color.colorFondo))
        }
        btnNum7.setOnClickListener{
            tvSelected!!.text = btnNum7.text.toString()
            cvSelected!!.setCardBackgroundColor(getColor(R.color.colorFondo))
        }
        btnNum8.setOnClickListener{
            tvSelected!!.text = btnNum8.text.toString()
            cvSelected!!.setCardBackgroundColor(getColor(R.color.colorFondo))
        }
        btnNum9.setOnClickListener{
            tvSelected!!.text = btnNum9.text.toString()
            cvSelected!!.setCardBackgroundColor(getColor(R.color.colorFondo))
        }
        btnZero.setOnClickListener{
            tvSelected!!.text = ""
            cvSelected!!.setCardBackgroundColor(getColor(R.color.colorFondo))
        }

    }

    private fun initComponents(){

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
        btnNum5 = findViewById(R.id.btnNum5)
        btnNum6 = findViewById(R.id.btnNum6)
        btnNum7 = findViewById(R.id.btnNum7)
        btnNum8 = findViewById(R.id.btnNum8)
        btnNum9 = findViewById(R.id.btnNum9)
        btnZero = findViewById(R.id.btnzero)

    }

    /**
     * Función que selecciona un cuadrado del sudoku
     * @param cv cuadrado a seleccionar
     */
    private fun selectSquare(cv: CardView, tv: TextView){
        //Cambio el color a seleccionado
        cv.setCardBackgroundColor(getColor(R.color.colorSelected))
        cvSelected = cv
        tvSelected = tv
    }

    private fun textSelector(tv: TextView?, cv: CardView?){

        //val textToSet = etNum.text.toString()
        //if (isValid(textToSet)) tv!!.text = textToSet

        cv!!.setCardBackgroundColor(getColor(R.color.colorFondo))
    }

    /**
     * Método al que si se le pasa una string, en caso de ser número devuelve true, en caso contrario
     * maneja la excepción y devuelve false.
     *
     * @param num numero a comprobar
     * @return true: Si es un numero, false: si no es un número
     */
    private fun isValid(num:String): Boolean{
        return try{
            num.toDouble()
            true
        }catch (e: NumberFormatException){
            false
        }
    }
}