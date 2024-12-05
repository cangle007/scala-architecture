package com.rockthejvm

object Main {
    val fansiStr: fansi.Str = fansi.Color.Red("this hould be RED string") //using external library
    def main(args: Array[String]): Unit = println(fansiStr)
}
