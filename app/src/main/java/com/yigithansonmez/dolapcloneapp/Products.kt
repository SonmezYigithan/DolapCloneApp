package com.yigithansonmez.dolapcloneapp

import java.io.Serializable

data class Products(var productName:String,
                    var productPrice:Int,
                    var productFavNum:Int,
                    var productImgName:String) : Serializable{
}