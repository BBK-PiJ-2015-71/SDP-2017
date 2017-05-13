package interpreter

object ExpressionUtils {

  def isOperator(s: String): Boolean = s match {
    case "+" => true
    case "-" => true
    case "*" => true
    case "/" => true
    case _ => false
  }

  def getOperator(s: String, left: Expression, right: Expression): Expression =
    {
      var e: Expression = null

      s match {
        case "+" => { e= new Add(left,right); new Number(e.interpret())  }
        case "-" => { e= new Subtract(left,right); new Number(e.interpret())  }
        case "*" => { e= new Product(left,right); new Number(e.interpret())  }
        case "/" => { e= new Divide(left,right); new Number(e.interpret())  }
        case _ => { new Number(0)  }
      }
    }
}