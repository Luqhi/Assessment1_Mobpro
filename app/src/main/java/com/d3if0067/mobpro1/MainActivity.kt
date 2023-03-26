package com.d3if0067.mobpro1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.d3if0067.mobpro1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTambah.setOnClickListener { tambah() }
        binding.btnKurang.setOnClickListener { kurang() }
        binding.btnKali.setOnClickListener { kali() }
        binding.btnBagi.setOnClickListener { bagi() }
        binding.btnModulus.setOnClickListener { modulus() }
        binding.btnClear.setOnClickListener { clear() }
    }

    fun clear() {
        val cekBil1 = binding.bil1Inp.text.toString()
        val cekBil2 = binding.bil2Inp.text.toString()
        val cekHasil = binding.hasilOprasi.text
        if(TextUtils.isEmpty(cekBil1) && TextUtils.isEmpty(cekBil2) && cekHasil == "0") {
            Toast.makeText(this, R.string.clear_invalid, Toast.LENGTH_LONG).show()
            return
        }

        val input1 = binding.bil1Inp
        val input2 = binding.bil2Inp
        val hasil = binding.hasilOprasi

        input1.text = null
        input2.text = null
        hasil.text = "0"
    }

    fun tambah() {
        val bil1 = binding.bil1Inp.text.toString()
        if(TextUtils.isEmpty(bil1)){
            Toast.makeText(this, R.string.bil1_invalid, Toast.LENGTH_LONG).show()
            return
        }
        val bil2 = binding.bil2Inp.text.toString()
        if(TextUtils.isEmpty(bil2)){
            Toast.makeText(this, R.string.bil2_invalid, Toast.LENGTH_LONG).show()
            return
        }

        val input1 = binding.bil1Inp
        val input2 = binding.bil2Inp
        val hasil = binding.hasilOprasi

        val angka1 = input1.text.toString().toDouble()
        val angka2 = input2.text.toString().toDouble()

        val operasi = angka1 + angka2

        hasil.text = operasi.toString()
    }

    fun kurang() {
        val bil1 = binding.bil1Inp.text.toString()
        if(TextUtils.isEmpty(bil1)){
            Toast.makeText(this, R.string.bil1_invalid, Toast.LENGTH_LONG).show()
            return
        }
        val bil2 = binding.bil2Inp.text.toString()
        if(TextUtils.isEmpty(bil2)){
            Toast.makeText(this, R.string.bil2_invalid, Toast.LENGTH_LONG).show()
            return
        }

        val input1 = binding.bil1Inp
        val input2 = binding.bil2Inp
        val hasil = binding.hasilOprasi

        val angka1 = input1.text.toString().toDouble()
        val angka2 = input2.text.toString().toDouble()

        val operasi = angka1 - angka2

        hasil.text = operasi.toString()
    }

    fun kali() {
        val bil1 = binding.bil1Inp.text.toString()
        if(TextUtils.isEmpty(bil1)){
            Toast.makeText(this, R.string.bil1_invalid, Toast.LENGTH_LONG).show()
            return
        }
        val bil2 = binding.bil2Inp.text.toString()
        if(TextUtils.isEmpty(bil2)){
            Toast.makeText(this, R.string.bil2_invalid, Toast.LENGTH_LONG).show()
            return
        }

        val input1 = binding.bil1Inp
        val input2 = binding.bil2Inp
        val hasil = binding.hasilOprasi

        val angka1 = input1.text.toString().toDouble()
        val angka2 = input2.text.toString().toDouble()

        val operasi = angka1 * angka2

        hasil.text = operasi.toString()
    }

    fun bagi() {
        val bil1 = binding.bil1Inp.text.toString()
        if(TextUtils.isEmpty(bil1)){
            Toast.makeText(this, R.string.bil1_invalid, Toast.LENGTH_LONG).show()
            return
        }
        val bil2 = binding.bil2Inp.text.toString()
        if(TextUtils.isEmpty(bil2)){
            Toast.makeText(this, R.string.bil2_invalid, Toast.LENGTH_LONG).show()
            return
        }

        val input1 = binding.bil1Inp
        val input2 = binding.bil2Inp
        val hasil = binding.hasilOprasi

        val angka1 = input1.text.toString().toDouble()
        val angka2 = input2.text.toString().toDouble()

        val operasi = angka1 / angka2

        hasil.text = operasi.toString()
    }

    fun modulus() {
        val bil1 = binding.bil1Inp.text.toString()
        if(TextUtils.isEmpty(bil1)){
            Toast.makeText(this, R.string.bil1_invalid, Toast.LENGTH_LONG).show()
            return
        }
        val bil2 = binding.bil2Inp.text.toString()
        if(TextUtils.isEmpty(bil2)){
            Toast.makeText(this, R.string.bil2_invalid, Toast.LENGTH_LONG).show()
            return
        }

        val input1 = binding.bil1Inp
        val input2 = binding.bil2Inp
        val hasil = binding.hasilOprasi

        val angka1 = input1.text.toString().toDouble()
        val angka2 = input2.text.toString().toDouble()

        val operasi = angka1 % angka2

        hasil.text = operasi.toString()
    }
}