package com.vinay.demofilesystem.filesystem

import java.util.Scanner

import com.vinay.demofilesystem.commands.Command
import com.vinay.demofilesystem.files.Directory

import scala.io.Source

object FileSystem extends App {
  val root = Directory.ROOT
  // [1, 2, 3, 4]
  /*
    0 (op) 1 => 1
    2 (op) 2 => 3
    3 (op) 3 => 6
    6 (op) 4 => your last value , 10

    List(1,2,3,4).foldLeft(0) ((x,y) => x+y)
   */
/*

  io.Source.stdin.getLines().foldLeft(State(root,root))((currentState, newLine) => {
    currentState.show
    Command.from(newLine).apply(currentState)
  })
*/
//  println(Source.stdin.getLines())

  var state = State(root, root)
  val scanner = new Scanner(System.in)
  while (true) {
    state.show
    val input = scanner.nextLine()
    state = Command.from(input).apply(state)
  }
 /* Source.stdin.getLines().foldLeft(State(root,root))((currentState, newLine)=>{
//    println(newLine)
    currentState.show
    Command.from(newLine).apply(currentState)
  })*/

}
