package game

class DiceGame(){
    
    fun run(){
        println("1. Create different size dice using each constructor and roll them")
        print("Please choose an option: ")
        val userInput = readLine()?.toIntOrNull()
        when(userInput){
            1-> {
                println("Creating default die...")
               var die1 = Die()
               println("Creating a die with 20 sides...")
               var  die2 = Die(Sides.TWENTY)
               println("Creating a Red die with 4 sides\n")
               var  die3 = Die(Color.RED,Sides.FOUR)
               println(die1)
               println(die2)
               println(die3)
               println("\nRolling die1..")
               println("Rolling die2..")
               println("Rolling die3..")
               die1.roll()
               die2.roll()
               die3.roll()
               println("\nNew upside in die1 is : ${die1.sideUp}\n")
               println("New upside in die2 is : ${die2.sideUp}\n")
               println("New upside in die3 is : ${die3.sideUp}\n")
            }
        }


    }
}

fun main(){
    val game = DiceGame()
    game.run()
}