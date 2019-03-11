package com.jk.kotlinassignment_1

class GeneralMoters:Cars
{

    var carName : String = ""

    constructor(){
    }


    constructor(releaseYear: Int, horsePower: Int, trailer: Boolean, rearCamera: Boolean, price: Double, carName : String):super(releaseYear, horsePower, trailer, rearCamera, price)
    {
        this.carName = carName
    }


    override fun sortByPrice(carList:ArrayList<GeneralMoters>):List<GeneralMoters>
    {
        return carList.sortedWith(compareBy({it.price}))
    }

    override fun sortByName(carList:ArrayList<GeneralMoters>):List<GeneralMoters>
    {
        return carList.sortedWith(compareBy({it.carName}))
    }

    override fun sortByYear(carList:ArrayList<GeneralMoters>):List<GeneralMoters>
    {
        return carList.sortedWith(compareBy({it.releaseYear}))
    }


}