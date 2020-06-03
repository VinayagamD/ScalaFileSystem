package com.vinay.demofilesystem.commands
import com.vinay.demofilesystem.filesystem.State

class Pwd extends Command {
  override def apply(state: State): State =
    state.setMessage(state.wd.path)
}
