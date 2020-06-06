fun main(args : Array<String>){

    var num1 : Int = 4
    var num2 : Int = 7
    var result : Int = 0

    /* In java if-else only a dessition pending
    statement but in kotlin this ia an expression(which return some value) */

    /* code 1 */

    if (num1>num2)
        result = num1
    else
        result = num2

    println("The grater number is : $result")
/* code2 */
    var num4 : Int = 4
    var num3 : Int = 7
    var result2 : Int = 0

    result2=if (num4>num3)
        num4
    else
        num3

    println("The grater number is : $result2")
    
/* The code1 and code2 both is same and correct.
The code1 is semiler to the java code but in kotlin
the if-else is treated as expression so it return some value
the code2 is an expression (because here we assign if-else
in the result2)*/

}