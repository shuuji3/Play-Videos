package controllers

import javax.inject._

import play.api.mvc._
import play.api.i18n._

@Singleton
class TaskList1  @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  def taskList = Action {
    Ok("This works!")
  }
}
