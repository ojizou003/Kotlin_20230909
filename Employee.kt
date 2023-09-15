package com.example.mystudy2

import java.time.LocalDate
import java.time.Period

class Employee (val employeeName:String,val startDate:String=LocalDate.now().toString()) {
  init{}
  constructor(name:String):this(name,"2022-01-01"){}
  constructor():this("名無しの権兵衛"){}
  
  fun yearsOfService():Int{
    val startDateYear:LocalDate=LocalDate.parse(startDate)
    val nowYear:LocalDate=LocalDate.now()
    return Period.between(startDateYear,nowYear).getYears()+1
  }
}

  fun getEmployeeName():String{
    return "とたろう"
  }

  val myName ="登太郎"