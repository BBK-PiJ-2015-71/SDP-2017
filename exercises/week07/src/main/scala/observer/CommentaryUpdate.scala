package observer

/**
  * Created by User on 01/05/2017.
  */
class CommentaryUpdate(val sub: Subject) extends Commentary{
  override def setDesc(desc: String): Unit = {
    sub.asInstanceOf[CommentaryObject].updateCommentary(desc)
    }
}
