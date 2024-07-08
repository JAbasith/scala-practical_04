import scala.io.StdIn.readInt

object QuestionTwo{

	def PatternMatching(n: Int): String= n match{
		case n if n > 0 => n % 2 match {
			case 0 => s"$n is positive and even"
			case _ => s"$n is positive and odd"
		}
		
		case n if n < 0 => n % 2 match {
			case 0 => s"$n is negative and even"
			case _ => s"$n is negative and odd"
		}
		
		case _ => s"$n neither negative nor positive"
	}

	def main(args: Array[String]): Unit={
		println("Enter number: ")
		val number = readInt()
		println(PatternMatching(number))
	}
}
