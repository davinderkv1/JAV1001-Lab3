package game

class DiceGame() {

    fun run() {
        println("1. Create different size dice using each constructor and roll them") 
        println("2. Choose one Die object and set it to show its highest value")
        println("3. TO 5 six-sided dice. Roll each Die in a loop until you get 5 of a kind and count iterations")
        print("Please choose an option: ")
        val userInput = readLine()?.toIntOrNull()
        when (userInput) {
            1 -> {
                createAndRollDifferentSizedDice()
            }
            2 -> {
                dieHighestValue()
            }
            3 -> {
                rollUntilFiveOfAKind()
            }
            else -> {
                println("Invalid option. Please choose a valid option.")
            }
        }
    }

    private fun createAndRollDifferentSizedDice() {
        println("Creating default die...")
        val die1 = Die()                                //created three dice with diferent constructors
        println("Creating a die with 20 sides...")
        val die2 = Die(Sides.TWENTY)
        println("Creating a Red die with 4 sides\n")
        val die3 = Die(Color.RED, Sides.FOUR)
        println(die1)                                   //printed dices values before roll
        println(die2)
        println(die3)
        println("\nTesting roll method\n")
        println("Rolling die1..")
        println("Rolling die2..")
        println("Rolling die3..")
        die1.roll()                                         // TO roll dices
        die2.roll()
        die3.roll()
        println("\nNew upside in die1 is: ${die1.sideUp}\n")
        println("New upside in die2 is: ${die2.sideUp}\n")
        println("New upside in die3 is: ${die3.sideUp}\n")
    }

    private fun rollUntilFiveOfAKind() {
        println("Creating 5 dice with 6 sides")
        val die1 = Die()
        val die2 = Die()
        val die3 = Die()
        val die4 = Die()
        val die5 = Die()
        var count = 0
        while (!(die1.sideUp == die2.sideUp 
                && die2.sideUp == die3.sideUp 
                && die3.sideUp == die4.sideUp 
                && die4.sideUp == die5.sideUp)) {
            die1.roll()
            die2.roll()
            die3.roll()
            die4.roll()
            die5.roll()
            count++                                             //count of iterations
        }
        println("Number of rolls to get 5 of a kind: $count")
    }

    private fun dieHighestValue() {
        val die = Die(Sides.TWENTY)
        println("The highest side value in the 20-sided Die is: ${die.highestValue()}")
    }
}

fun main() {
    val game = DiceGame()
    game.run()
}
