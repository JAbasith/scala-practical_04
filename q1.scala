object QuestionOne{

	var itemName = Array("Toffee","Chocolate","Soap","Book","Pen")
	var quantity = Array(5,8,2,1,12)

	def displayInventory(itemName: Array[String],quantity: Array[Int]): Unit={
		if(!itemName.isEmpty){
			println(s"${itemName.head} -> ${quantity.head}");displayInventory(itemName.tail,quantity.tail)
		}
	}
	
	def restockItem(item: String,amount: Int): Unit= itemName.indexOf(item) match{
		case -1 => println("No item found")
		case  x => quantity(x) = quantity(x) + amount
	}
	
	def sellItem(item: String,amount: Int): Unit= itemName.indexOf(item) match{
		case -1 => println("No item found")
		case  x if quantity(x) < amount => println("Not enough stock")
		case  x => quantity(x) = quantity(x) - amount
	}

	def main(args: Array[String]): Unit={
	
		//displayInventory(itemName,quantity)
		//restockItem(itemName,quantity,"Toffee",3)
		//restockItem("Book",8)
		//restockItem("Tooth-Brush",8)
		//sellItem("Toffee",3)
		//displayInventory(itemName,quantity)
		//sellItem("Toff",3)
		//sellItem("Book",1)
		//displayInventory(itemName,quantity)
	}
}
