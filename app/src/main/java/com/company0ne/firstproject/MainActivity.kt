package com.company0ne.firstproject


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

     lateinit var recyclerView : RecyclerView
     var countryNameList = ArrayList<String>()
    var detailsList = ArrayList<String>()
    var imageList = ArrayList<Int>()
    lateinit var adapter: CountriesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTheme(R.style.Theme_FirstProject)


        recyclerView  = findViewById(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
        countryNameList.add("India")
        countryNameList.add("Canada")
        countryNameList.add("Isreal")
        countryNameList.add("Argentine")
        countryNameList.add("Bhutan")
        countryNameList.add("Cananda")
        countryNameList.add("China")
        countryNameList.add("Turkey")
        countryNameList.add("Brazil")
        countryNameList.add("Bouvat Island")


        //add some more details to see scrollView
        detailsList.add("This is Indian Flag")
        detailsList.add("This is Canada Flag")
        detailsList.add("This is Israel Flag")
        detailsList.add("This is Argentine Flag")
        detailsList.add("This is Bhutan Flag")
        detailsList.add("This is Cananda Flag")
        detailsList.add("This is China Flag")
        detailsList.add("This is Turkey Flag")
        detailsList.add("This is Brazil Flag")
        detailsList.add("This is Bouvat Island Flag")


        imageList.add(R.drawable.india)
        imageList.add(R.drawable.cananda)
        imageList.add(R.drawable.israel)
        imageList.add(R.drawable.argentina)
        imageList.add(R.drawable.bhutan)
        imageList.add(R.drawable.cananda)
        imageList.add(R.drawable.china)
        imageList.add(R.drawable.turky)
        imageList.add(R.drawable.brazil)
        imageList.add(R.drawable.bouvet_island)


        adapter = CountriesAdapter(countryNameList,detailsList,imageList,this@MainActivity)
        recyclerView.adapter = adapter


    }
}