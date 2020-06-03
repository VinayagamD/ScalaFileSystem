package com.vinay.demofilesystem.commands
import com.vinay.demofilesystem.files.{DirEntry, Directory}
import com.vinay.demofilesystem.filesystem.State

class Mkdir(name: String) extends CreateEntry(name = name) {

  override def createSpecificEntry(state: State): DirEntry =
    Directory.empty(state.wd.path, name)

}
