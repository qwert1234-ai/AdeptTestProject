package com.nikolai.adepttestproject.canculator

class CanculatorViewModel {

    private var currentFirstString: String = ""
    private var currentSecondString: String = ""

    fun add(): Int {
        return currentFirstString.toInt() + currentSecondString.toInt()
    }

    fun minus(): Int {
        return currentFirstString.toInt() - currentSecondString.toInt()

    }

    fun multiply(): Int {
        return currentFirstString.toInt() * currentSecondString.toInt()
    }

    fun divide(): Int {
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

    }
