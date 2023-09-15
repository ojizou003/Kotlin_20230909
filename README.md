# 「社会人のためのAndroid Studioで学ぶプログラミング Kotlin編」 

2023/09/09~09/15

## 学習環境の設定

Android Studioのインストール＆初期設定
プロジェクトの作成とテンプレートの選択
仮想デバイスの作成
ビルド(コンパイル＆実行)テスト
言語はKotlinを使用

## 変数

var 変数名:データ型名 = 代入する値

## 定数

val PI:Double = 3.14
定数名は大文字

## 文字列

String型

## nullの扱い

?,?.,!!

## ビット演算子

and,or,inv(),shr 1

## 論理演算子

&&,||,!

## 配列

配列の作成
val 配列名 = arrayOf(,,,)

配列の呼び出し
配列名[index]

## 多次元配列

val 配列名 = arrayOf(
  arrayOf(,,,),
  arrayOf(,,,),
  arrayOf(,,,)
)

配列の呼び出し
配列名[index][index]

## エルビス演算子

代入される変数 = nullの可能性のある処理?:nullの可能性のある変数がnullの時の処理

## if文

if(判定処理){
  判定が真のときの処理
}else{
  判定が偽のときの処理
}

## 変数のスコープ

{}内で宣言された変数は、この{}の中でのみ有効

## 範囲指定(in,!in)

ex. if(a in 70..100)

## when文

when(値を返す変数または式){
  値1または式1 -> {
    値1または式1に等しいときの処理
  }
  ...
  else ->{
    値または式に等しいものがないときの処理
  }
}

## while文、do-while文

while(繰り返し条件の判定式){
  繰り返す処理
}

do{
  繰り返す処理
}(繰り返し条件の判定式)

## for文

for(要素ごとの値を代入する変数in配列など){
  繰り返す処理
}

## break文とcontinue文

break ..処理を中断して繰り返し処理から抜ける
continue ..処理をスキップして次の繰り返し処理を行う

## break文とcontinue文のラベル

ラベル名@ for()...break,continueの抜け先を指定
break@ラベル名
continue@ラベル名

## 例外処理(try-catch文、throw文)

try{
  対象のプログラム
}catch(例外オブジェクト){
  例外発生時のプログラム
}finally{
  例外発生するしないにかかわらず、必ず実行される処理
}
## 関数

関数は、入力された値(引数)に応じて加工した値(戻り値)を返すプログラム
fun 関数名(仮引数:型、...):戻り値の型{
  関数の中身
}

## FizzBuzz問題

## クラス

クラスでは、変数やデータ構造をプロパティ、処理するプログラムを関数と呼び、クラスの中にまとめて記載する
クラス名：先頭は英大文字

class クラス名 constructor(仮引数:型,...){
  プロパティ宣言
  init...初期化ブロック
  constructor...二次コンストラクター
  fun...関数宣言
  companion object...コンパニオンオブジェクト宣言
}

## クラスのインスタンス化

クラスがインスタンス化された実体(インスタンス)をオブジェクトと呼ぶ
val インスタンス名 = クラス名(コンストラクターへの実引数) ※newは不要

## オブジェクトのプロパティ、関数の呼び出し方

オブジェクト名.プロパティ名
オブジェクト名.関数名(実引数)

## クラスの初期化処理(コンストラクター呼び出し)

クラス名 constructor(仮引数:型,...){
  init{
    この中にインスタンス化の時に行いたい処理を記載
  }
}

## this

クラスから作成されたオブジェクトを示す名前としてthisが利用できる
this.プロパティ名
this.関数名(実引数)

## pacage文

pacageは、関数やクラス、トップレベルで宣言された変数などのコンテンツを分類して管理するための仕組み
pacage パッケージ名

## import文

Kotlinファイルの中にpacage文よりも後に、「import 完全修飾名」と記載することで、Kotlinが自動的に完全修飾名を認識してくれる

## アクセス修飾子

- public
- private
- internal
- protected

## セッター、ゲッター

## 列挙型クラス

enum class 列挙型名{
  列挙子名,
  列挙子名,
  ...
}

## 継承(:)

クラス間の関係を親子関係のように定義することができる

class 子のクラス名(プライマリーコンストラクター): class 親のクラス名(プライマリーコンストラクター){
  子のクラスに固有のフィールドや関数の定義
}

open class 親のクラス名{
  ...
}

## 継承(オーバーライド)

子のクラスで親のクラスと同じ名前の関数を定義することができる

## Data Class

データを保管するためのクラス

## Sealed Class/Sealed Interface

## 抽象クラス

abstract class 抽象クラス名{
  abstract fun 関数名(仮引数)
}

## 継承(キャスト)

## インターフェイス

## Objectキーワード

## 匿名インナークラス

## 関数型インターフェイス(SAM)

## ジェネリックス

アクセス修飾子 class クラス名＜型パラメータ、...>{
  型を型パラメータにした関数定義などのクラスの定義
}
アクセス修飾子 fun＜型パラメータ>関数名(引数:型...):戻り値の型{
  型を型パラメータにした関数定義
}

## 拡張関数、拡張プロパティ

クラスに関数やプロパティを追加することができる
fun クラス名.拡張関数名(仮引数:型、...):戻り値の型=拡張関数の定義

## 委譲プロパティ(DelegatedProperties)

## Stringオブジェクト

- length
- split
- contains
- substring

## Mathオブジェクト

- PI
- max
- floor

## Randomオブジェクト

- nextInt
- nextDouble
- nextL

## LocalDateTimeオブジェクト

LocalDateTimeオブジェクトは、システムの時刻を取得する
- now()
- of()
- parse()

- getYear()
- getMonth()
- getMonthValue()
- getDayofMonth()
- getDayofYear()
- getDayofWeek()
- getHour()
- getMinute()
- getSecond()
- getNano()

## Arrayオブジェクト

- contentEqual()
- sort()
- binarySearch()
- fill()
- copyOf()
- asList()
- toString()

## コレクション

## Iterableインターフェイス

- filter()
- map()
- district()
- sorted()
- reduce()
- fold()
- count()
- any()
- none()

## ArrayListオブジェクト

- ArrayList()
- size
- isEmpty()
- contains()
- indexOf()
- toArray()
- get()
- set()
- add()
- removeAt()
- clear()
- subList()
- iterator()
- forEach()
- removeIf()
- replaceAll()

## LinkedListオブジェクト

## HashMapオブジェクト

キー・バリューの形式でデータを管理する方式がMAP
HashMapはハッシュ表を用いてこのデータ構造を管理する

## HashSetオブジェクト

## スレッド

## Androidアプリ開発

本書ではJetpack Composeを利用して学習

## 自動生成されるファイルについて

### AndroidManifest.xml

このAndroidアプリがどのようなものかを示している(目録)

### MainActivity.kt

マニフェストで指定されたActivityに対応するKotlinプログラム

### strings.xml

文字列を定義するリソースファイル

## レイアウト

レイアウト変更演習
- レイアウト追加による配置変更
- ボタン1、ボタン2追加
- 余白の設定追加
- ボタン3、ボタン4追加
- 文字列リソースの定義(strings.xml)

## テキスト入力域

TextField関数とOutlinedTextField関数

## コールバック

イベントと紐づいて実行される関数をコールバック関数と呼ぶ

## ImageViewリソース

## プログラムの作成

## 自動バトル

1. プロジェクトを新規に作成
2. アイコンを作成
3. 敵、パーティ、戦士、魔術師の各クラス、乱数を返す関数を作成
4. MainActivity.ktに初期化処理、画面レイアウトの定義を追加
5. Jetpack ComposeのViewModelクラスを継承するクラスを作成し、バトル処理関数を作成
6. MainActivity.ktで、ViewModelにアクセスするコードに変更し、ボタンでバトルを開始するようにコールバック関数を追加

## 電卓

1. プロジェクトを新規に作成
2. MainActivity.ktで画面全体のレイアウト、各キーの表示を定義
3. Jetpack ComposeのViewModelクラスを継承するクラスを作成し、電卓表示部処理と電卓制御処理の関数を作成
4. MainActivity.ktで、ViewModelにアクセスするコードに変更し、各キーで電卓制御処理を行うようにコールバック関数を追加

## 図形描画

### DrawScopeオブジェクト

## ライフゲーム
