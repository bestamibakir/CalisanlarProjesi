package com.bestamibakir.calisanlarprojesi

class Calisan(val isim: String, private val maas: Int, val departman: String, val yas: Int) {
    fun maasGoster(){
        println("Çalışanın maaşı: ${this.maas}")
    }
}