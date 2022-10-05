package com.app.myapplication

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import java.util.zip.Inflater

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val biodata = findViewById<Button>(R.id.btn1)
        val masukannama = findViewById<Button>(R.id.btn2)

        biodata.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Siti Agnia Amalia")
                .setMessage("Kelas : XI PPLG 1 No:31")
                .setPositiveButton("yes", DialogInterface.OnClickListener { dialogInterface, i ->
                    Toast.makeText(this, "Tombol yes ditekan", Toast.LENGTH_SHORT).show()
                })
                .setNegativeButton("no", DialogInterface.OnClickListener { dialogInterface, i ->
                    Toast.makeText(this, "Tombol no ditekan", Toast.LENGTH_SHORT).show()
                })
                .show()
        }

        masukannama.setOnClickListener {
            val inflater = layoutInflater
            val dialoglayout = inflater.inflate(R.layout.activity_main2, null)
            val editText = dialoglayout.findViewById<EditText>(R.id.editText)
            AlertDialog.Builder(this)
                .setTitle("Masukkan Nama Lengkap")
                .setView(dialoglayout)
                // Add action buttons
                .setPositiveButton("Benar",
                    DialogInterface.OnClickListener { dialogInterface, i ->
                        Toast.makeText(this,"Nama kamu adalah " + editText.getText().toString(), Toast.LENGTH_SHORT).show()
                    })
                .setNegativeButton("Batal",
                    DialogInterface.OnClickListener { dialogInterface, i ->
                    }) .show()

        }


    }
}