package com.jk.kotlinassignment_1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

//Test
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
                2001, 800, false, true, 19000.00, "Chevrolet Cruze"
            )
        )
        carList.add(
            GeneralMoters(
                2010, 1200, false, true, 30000.00, "Chevrolet Malibu"
            )

        )
        carList.add(

            GeneralMoters(
                2008, 1500, true, true, 22000.00, "GMC terrain"
            )

        )
        carList.add(
            GeneralMoters(
                2019, 1300, false, true, 45000.00, "Cadillac XT6"
            )

        )
        carList.add(
            GeneralMoters(
                2011, 600, false, false, 12000.00, "Buick Encore"
            )

        )
        carList.add(
            GeneralMoters(
                1970, 1100, false, true, 28000.00, "Buick Regal"
            )
        )

        var gm = GeneralMoters()

        val sortByPrice = gm.sortByPrice(carList)
        val sortByYear = gm.sortByYear(carList)
        val sortByName = gm.sortByName(carList)

        println("----- Sort BY Price ------")
        for (i in sortByPrice) {
            println(i.carName + "        " + i.releaseYear + "        " + i.horsePower + "        " + i.rearCamera + "        " + i.price)
        }


        println("----- Sort BY Year ------")
        for (i in sortByYear) {
            println(i.carName + "        " + i.releaseYear + "        " + i.horsePower + "        " + i.rearCamera + "        " + i.price)
        }

        println("----- Sort BY Name ------")
        for (i in sortByName) {
            println(i.carName + "        " + i.releaseYear + "        " + i.horsePower + "        " + i.rearCamera + "        " + i.price)
        }
    }
}