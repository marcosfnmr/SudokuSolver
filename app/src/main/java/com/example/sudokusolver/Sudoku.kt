package com.example.sudokusolver

/**
 * En esta clase se supondra que el tamaño de la matriz es de 4x4 y no cambiara nunca
 */
var dim = 4

class Sudoku(val matriz: Array<Array<Int>>) {
    /**
     * Introduce un numero dentro de su posicion de la matriz
     */
    fun setSudokuNum(fila: Int, columna: Int, num: Int) {
        matriz[fila][columna]=num
    }

    /**
     * Comprueba que la matriz no repite nuemro en las filas ni columnas
     * @param fila en la que se encuentra num
     * @param columna en la que se encuentra num
     * @param num a comprobar
     * @return true si esta repetido, flase si no lo está
     */
    private fun noRepiteFilaColumna(fila: Int,columna: Int, num: Int): Boolean{
        for (i in 0..dim){
            for(j in i..dim){
                if(matriz[fila][i]==matriz[fila][j] && i!=j) return true
                if(matriz[i][columna]==matriz[j][columna]&& i!=j) return true
            }
        }
        return false
    }

    /**
     * Comprueba que la matriz no tenga numeros repetidos en cada uno de los 4 cuadrantes
     */
    private fun noRepiteCuadrante(){
        //TODO Tendre que usar HashMaps para linkear cada cuadrante con su fila y columna

    }

}