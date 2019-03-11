package com.jk.kotlinassignment_1

abstract class Cars
{
    var releaseYear : Int = 0
        get() = field
        set(value) {
            field = value
        }
    var horsePower : Int = 0
        get() = field
        set(value) {
            field = value
        }
    var trailer : Boolean = false
        get() = field
        set(value) {
            field = value
        }
    var rearCamera : Boolean = false
        get() = field
        set(value) {
            field = value
        }
    var price : Double = 0.0
        get() = field
        set(value) {
            field = value
        }


    constructor(){
    }

    constructor(releaseYear: Int, horsePower: Int, trailer: Boolean, rearCamera: Boolean, price: Double) {
        this.releaseYear = releaseYear
        this.horsePower = horsePower
        this.trailer = trailer
        this.rearCamera = rearCamera
        this.price = price
    }
    //-------



    abstract fun sortByPrice(carList:ArrayList<GeneralMoters>):List<GeneralMoters>

    abstract fun sortByYear(carList:ArrayList<GeneralMoters>):List<GeneralMoters>

    abstract fun sortByName(carList:ArrayList<GeneralMoters>):List<GeneralMoters>

}

