package com.jk.kotlinassignment_1

class GeneralMoters (var carName : String , var releaseYear : Int,var horsePower : Int,var trailer : Boolean,var rearCamera : Boolean,var price : Double)
{

    internal class SortbyCarName : Comparator<GeneralMoters> {
        // Used for sorting in ascending order of
        // car name
        override fun compare(a: GeneralMoters, b: GeneralMoters): Int {
            return a.carName.compareTo(b.carName)
        }
    }

    internal class SortbyCarPrice : Comparator<GeneralMoters> {
        // Used for sorting in ascending order of
        // price
        override fun compare(a: GeneralMoters, b: GeneralMoters): Int {
            return a.price.compareTo(b.price)
        }
    }

    internal class SortbyCarYear : Comparator<GeneralMoters> {
        // Used for sorting in ascending order of
        // price
        override fun compare(a: GeneralMoters, b: GeneralMoters): Int {
            return a.releaseYear.compareTo(b.releaseYear)
        }
    }

}