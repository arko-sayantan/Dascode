/*Here we use 'When' in spite of using switch because
in 'switch' we have to use break statement and it also deficult and
It is lengthy.Kotlin supports only When expression.
When and switch both are use for multiple cases. */

fun main(args : Array<String>)
{
    var n : Int  = 5

    when(n){

        1 -> println("The number is one.") /* And 1 is a case 1 here is 5 case and one default case */
        2 -> println("The number is two.")
        3 -> println("The number is three.")
        4 -> println("The number is four.")
        5 -> println("The number is five.")
        else -> println("Does not match.") /* Here else stand for default case */

    }
}