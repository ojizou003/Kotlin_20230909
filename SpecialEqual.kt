package com.example.mystudy

class SpecialEqual <S>{
  var first:S? =null
  private set
  var second:S?=null
  private set
  var third:S?=null
  private set
  var fourth:S?=null
  private set

  fun checkEqual():Boolean{
    return first == second && third == fourth
  }

  fun setFirst(first:S){
    this.first = first
  }
  fun setSecond(second:S){
    this.second = second
  }
  fun setThird(third:S){
    this.third = third
  }
  fun setFourth(fourth:S){
    this.fourth = fourth
  }
}