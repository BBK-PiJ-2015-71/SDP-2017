package prototype

object AccessControlProvider {

  private var map  = scala.collection.mutable.Map(("USER", new AccessControl("USER", "DO_WORK")))

  println("Fetching data from external resources and creating access control objects...")

  // UNCOMMENT
  //map.put("USER", new AccessControl("USER", "DO_WORK"))

  map.put("ADMIN", new AccessControl("ADMIN", "ADD/REMOVE USERS"))

  map.put("MANAGER", new AccessControl("MANAGER", "GENERATE/READ REPORTS"))

  map.put("VP", new AccessControl("VP", "MODIFY REPORTS"))

  def getAccessControlObject(controlLevel: String): AccessControl = controlLevel match {
    case "USER"  => new AccessControl("USER", "DO_WORK")
    case "ADMIN" => new AccessControl("ADMIN", "ADD/REMOVE USERS")
    case "MANAGER" => new AccessControl("MANAGER", "GENERATE/READ REPORTS")
    case "VP" => new AccessControl("VP", "MODIFY REPORTS")
    case _ => null
  }

}