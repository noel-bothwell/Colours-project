class Colours {

    private val colours = listOf("Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Black", "Silver")

    fun getAll (): List<String>{
        //TODO return the colours list
        return listOf("Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Black", "Silver")
    }

    fun numberOfColours (): Int{
        //TODO return the size of the colours list
        return colours.size
    }

    fun firstColour() : String{
        //TODO return the first colour in the list
        return colours.first()
    }

    fun lastColour() : String{
        //TODO return the last colour list
        return colours.last()
    }

    fun coloursInAplhabeticOrder() : List<String>{
        //TODO return the colours in alphabetical order
        return listOf("this should return colours in alphabetic order")
    }

    fun coloursInAllCapitals() : List<String>{
        //TODO return the colours in ALL CAPS
        return listOf("this should return colours in all capitals")
    }

    fun coloursStartingWithLetter(letter: Char) : List<String>{
        //TODO return the colours starting with the letter passed as a parameter
        return listOf("this should return colours that start with $letter")
    }

    fun coloursWithSpecificNumberOfChars(size: Int) : List<String>{
        //TODO return the colours that have exactly the same number of chars as the number passed as a parameter
        return listOf("this should return colours that have $size chars")
    }

    fun coloursWithLessCharsThan(size: Int) : List<String>{
        //TODO return the colours that have less chars than the number passed as s parameter
        return listOf("this should return colours less than $size chars")
    }

    fun isColourInTheList(colours : String) : Boolean{
        //TODO return true of the colour passed as a parameter is in the list and false otherwise
        // Note: the search should be case insensitive - if blue is passed as a parameter it should find Blue, BLUE etc.
        if (colours.contains(("Blue")))
        return true
        else return false
    }

    //TODO Write THREE additional functions of your choice that will perform some sort of
    // analysis on the colours list.

}