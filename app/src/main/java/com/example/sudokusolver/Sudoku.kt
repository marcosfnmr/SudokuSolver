package com.example.sudokusolver

/**
 * En esta clase se supondra que el tamaño de la matriz es de 4x4 y no cambiara nunca
 */
var dim = 4
var dim2 = 2

class Sudoku(val matriz: Array<Array<Int>>) {
    /**
     * Introduce un numero dentro de su posicion de la matriz
     */
    fun setSudokuNum(fila: Int, columna: Int, num: Int) {
        matriz[fila][columna] = num
    }

    /**
     * Comprueba que la matriz no repite nuemro en las filas ni columnas
     * @param fila en la que se encuentra num
     * @param columna en la que se encuentra num
     * @param dimension dimension de la matriz, puede ser 2 o 4
     * @return true si esta repetido, flase si no lo está
     */
    private fun noRepiteFilaColumna(fila: Int, columna: Int, dimension: Int): Boolean {
        for (i in 0..dimension) {
            for (j in i..dimension) {
                if (matriz[fila][i] == matriz[fila][j] && i != j) return true
                if (matriz[i][columna] == matriz[j][columna] && i != j) return true
            }
        }
        return false
    }

    /**
     * Comprueba que la matriz no tenga numeros repetidos en cada uno de los 4 cuadrantes
     */
    private fun noRepiteCuadrante(matriz3D: Array<Array<IntArray>>) {

    }

    /**
     * Separa la matriz del sudoku por cuadrantes. Cada cuadrante se indexara en la dimensión "k" de una matriz tridimensional
     * de modo que para cambiar entre cuadrantes solamente habra que incrementar o decrementar "k"
     * @return arrayTridim array tridimensional con el mismo contenido de la matriz original
     */
    private fun separaCuadrantes(): Array<Array<IntArray>>{
        // Creo un array tridimensional
        val arrayTridim = Array(2) { Array(2) { IntArray(2) } }

        for (i in 0..1) {
            for (j in 0..1) {
                // Esto hace que se inicie en m[0][0], m[0][2], m[2][0] y m[2][2]
                val filaInicial = i * 2
                val columnaInicial = j * 2

                for (k in 0..1) {
                    for (l in 0..1) {
                        // Accede a la matriz 3d    // se le suma k y l (valen 0 o 1)para acceder a cada elemento del array 2d
                        // (k * 2 +l) puede valer 0, 1, 2 o 3
                        arrayTridim[i][j][k * 2 + l] = matriz[filaInicial + k][columnaInicial + l]
                    }
                }
            }
        }
        return arrayTridim
    }

}