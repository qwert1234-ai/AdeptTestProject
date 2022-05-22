package com.nikolai.adepttestproject.canculator

class CanculatorViewModel {

    private var currentFirstString: String = ""
    private var currentSecondString: String = ""

    fun add(): Int {
        checkParameters()

        return currentFirstString.toInt() + currentSecondString.toInt()
    }

    fun minus(): Int {
        checkParameters()
        return currentFirstString.toInt() - currentSecondString.toInt()

    }

    fun multiply(): Int {
        checkParameters()
        return currentFirstString.toInt() * currentSecondString.toInt()
    }

    fun divide(): Int {
        checkParameters()
        val second = currentSecondString.toInt()
        if (second != 0) {
            return currentFirstString.toInt() / currentSecondString.toInt()
        } else {
            throw Exception("Деление на ноль")
        }
    }

    fun updateFirst(firstNumber: String) {
        currentFirstString = firstNumber

    }
    fun updateSecond(secondNumber: String) {
        currentSecondString = secondNumber

    }

    fun checkParameters() {
        if (currentFirstString == "" || currentSecondString == "") {
            throw Exception("Один из операторов пустой")
        }
    }

    }
