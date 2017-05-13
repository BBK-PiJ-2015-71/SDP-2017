package interpreter

/**
  * Created by User on 13/05/2017.
  */
class Subtract(private val leftExpression: Expression,
               private val rightExpression: Expression) extends Expression {
  override def interpret(): Int =
    leftExpression.interpret() - rightExpression.interpret()
}
