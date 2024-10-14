package com.bestamibakir.calisanlarprojesi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val calisan1 = Calisan("Ayşe Yılmaz",7500,"Pazarlama",28)
        val calisan2 = Calisan("Mehmet Demir",8500,"Yazılım",34)
        val calisan3 = Calisan("Elif Kaya",6000,"İK",24)
        val calisan4 = Calisan("Ahmet Öz",9500,"Yazılım",32)
        val calisan5 = Calisan("Selin Akar",5000,"Muhasebe",22)
        val calisan6 = Calisan("Kerem Çelik",7800,"Satış",29)
        val calisan7 = Calisan("Zeynep Ersoy",6700,"Pazarlama",27)
        val calisan8 = Calisan("Burak Aksoy",9800,"Yazılım",40)
        val calisan9 = Calisan("Derya Tuncer",6200,"İK",23)
        val calisan10 = Calisan("Cenk Güner",8000,"Lojistik",31)

        val calisanlar = arrayListOf(calisan1,calisan2,calisan3,calisan4,calisan5,calisan6,calisan7,calisan8,calisan9,calisan10)

        println("Yaşı 30'dan büyük ve departmanı Yazılım olan  çalışanlar")
        val otuzYasindanBuyukVeYazilimAlanindaCalisanlar = calisanlar.filter { it.yas > 30 && it.departman == "Yazılım" }.map { it.maasGoster() }

        println("Yaşı 25'ten küçük olan çalışanların isimleri")
        val yasiYirmiBestenKucukOlanlarinIsimleri = calisanlar.filter { it.yas < 25 }.map { it.isim }
        yasiYirmiBestenKucukOlanlarinIsimleri.forEach { println(it) }
    }
}