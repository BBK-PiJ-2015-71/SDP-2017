package prototype

class User(var userName: String,
           var level: String,
           var accessControl: AccessControl) {

  override def toString() = "Name: "+ userName +", Level: "+ level + ", Access Control Level:"+accessControl.controlLevel +
  ", Access: "+accessControl.access

  /**
    * Name: User A, Level: USER Level, Access Control Level:USER, Access: DO_WORK
    */
}
