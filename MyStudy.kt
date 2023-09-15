package com.example.mystudy

fun practice():String {
  // ここから
  val department:String?
  val name:String?

  val se =SpecialEqual<String>()

  se.setFirst("総務部")
  se.setSecond("総務部")
  // se.setThird("山田太郎")
  se.setThird(123)
  se.setFourth("山田太郎")

  val flag=se.checkEqual()

  department=se.first
  name=se.third

  return if (flag){
    "同じ部署に同姓同名の人がいます。部署は${department}、氏名は${name}です。"
  } else{
    "同じ部署に同姓同名の人はいません。"
  }
  // ここまで
}
