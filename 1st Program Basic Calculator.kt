fun main(args : Array<String>) {

    print("Enter 1st Number: ")  /* if we use readLine It is applicable for string */
    val a = Integer.valueOf(readLine()) /* This is the wayto get value of integer using readLine() */
    print("Enter 2nd Number: ")
    val b = Integer.valueOf(readLine())

    println("1. for Addition 2. for Subtraction 3. for Multiplication 4. for Division")
    print("Enter your choice:")

    var n = Integer.valueOf(readLine())
    var result1 = a+b
    var result2 = a-b
    var result3 = a*b
    var result4 = a/b.toFloat()/* Type casting in kotlin by .toFloat */

    when(n){
        1 -> print("The Sum Of Two number :  $result1")
        2 -> print("The Subtraction of Two number: $result2")
        3 -> print("The Multiplication of Two number: $result3")
        4 -> print("The Division of Two number: $result4")
        else -> print("Enter a right choice.")
    }


}