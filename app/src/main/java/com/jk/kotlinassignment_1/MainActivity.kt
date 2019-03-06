package com.jk.kotlinassignment_1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    //var carList = ArrayList<GeneralMoters>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*addData()

        sortByPrice()
        sortByYear()
        sortByName()*/

        var carList = ArrayList<GeneralMoters>()

        carList.add(
            GeneralMoters(
                "Chevrolet Cruze", 2001, 800, false, true,
                19000.00
            )
        )
        carList.add(
            GeneralMoters(
                "Chevrolet Malibu", 2010, 1200, false, true,
                30000.00
            )
        )
        carList.add(
            GeneralMoters(
                "GMC terrain", 2008, 1500, true, true,
                22000.00
            )
        )
        carList.add(
            GeneralMoters(
                "Cadillac XT6", 2019, 1300, false, true,
                45000.00
            )
        )
        carList.add(
            GeneralMoters(
                "Buick Encore", 2011, 600, false, false,
                12000.00
            )
        )
        carList.add(
            GeneralMoters(
                "Buick Regal", 1970, 1100, false, true,
                28000.00
            )
        )

        println("----- Sort BY Name ------")
        carList.sortWith(GeneralMoters.SortbyCarName())
        for (i in carList) {
            println(i.carName + "        " + i.releaseYear + "        " + i.horsePower + "        " + i.rearCamera + "        " + i.price)
        }

        println("----- Sort BY Price ------")
        carList.sortWith(GeneralMoters.SortbyCarPrice())
        for (i in carList) {
            println(i.carName + "        " + i.releaseYear + "        " + i.horsePower + "        " + i.rearCamera + "        " + i.price)
        }

        println("----- Sort BY Year ------")
        carList.sortWith(GeneralMoters.SortbyCarYear())
        for (i in carList) {
            println(i.carName + "        " + i.releaseYear + "        " + i.horsePower + "        " + i.rearCamera + "        " + i.price)
        }


    }
}
/*
    fun addData()
    {

        carList.add(ModelData("Chevrolet Cruze",2001,800,false,true,
            19000.00))
        carList.add(ModelData("Chevrolet Malibu",2010,1200,false,true,
            30000.00))
        carList.add(ModelData("GMC terrain",2008,1500,true,true,
            22000.00))
        carList.add(ModelData("Cadillac XT6",2019,1300,false,true,
            45000.00))
        carList.add(ModelData("Buick Encore",2011,600,false,false,
            12000.00))
        carList.add(ModelData("Buick Regal",1970,1100,false,true,
            28000.00))
    }


    fun sortByPrice()
    {
        var sortByPriceList = carList.sortedWith(compareBy({it.price}))
        println("1.-------------------Cars list order by Price-------------------")
        for (i in sortByPriceList)
            println(i.carName +"        "+ i.releaseYear +"        "+ i.horsePower +"        "+ i.rearCamera +"        "+ i.price)
    }

    fun sortByYear()
    {
        var sortByYearList = carList.sortedWith(compareBy({it.releaseYear}))
        println("2.-------------------Cars list order by Release Year-------------------")
        for (i in sortByYearList)
            println(i.carName +"        "+ i.releaseYear +"        "+ i.horsePower +"        "+ i.rearCamera +"        "+ i.price)
    }

    fun sortByName()
    {
        var sortByNameList = carList.sortedWith(compareBy({it.carName}))
        println("3.-------------------Cars list order by Name-------------------")
        for (i in sortByNameList)
            println(i.carName +"        "+ i.releaseYear +"        "+ i.horsePower +"        "+ i.rearCamera +"        "+ i.price)

    }
}
*/