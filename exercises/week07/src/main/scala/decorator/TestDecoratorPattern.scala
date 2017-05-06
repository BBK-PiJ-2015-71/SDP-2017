package decorator

import java.text.DecimalFormat

object TestDecoratorPattern {
  private var dformat: DecimalFormat = new DecimalFormat("#.##")

  def main(args: Array[String]) {
    print(new Spinach(new GreenOlives(new RomaTomatoes(new SimplyVegPizza))))
    print(new Ham(new Cheese(new Cheese(new Meat(new SimplyNonVegPizza)))))
  }

  private def print(pizza: Pizza) {
    System.out.println("Desc: " + pizza.getDesc)
    System.out.println("Price: " + dformat.format(pizza.getPrice))
  }
}
