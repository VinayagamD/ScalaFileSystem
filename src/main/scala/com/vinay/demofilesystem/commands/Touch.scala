package com.vinay.demofilesystem.commands
import com.vinay.demofilesystem.files.{DirEntry, File}
import com.vinay.demofilesystem.filesystem.State

class Touch(name: String) extends CreateEntry(name) {

  override def createSpecificEntry(state: State): DirEntry =
    File.empty(state.wd.path, name)

}
