fun main(args : Array<String>)
{
    var str1 : String = "Sayantan"
    var str2 : String = "Mahua"
    var str3 : String = "Arindam"

    if (str1.equals(str2) && str1.equals(str3)) /* We use '.equals' for compare (We also use in java)*/
        println("All Name Are Same.And the name is ${str1.toUpperCase()}." +
                "And the length is ${str1.length}" )
    else if (str1 == str2 || str1 == str3) /* In Kotlin We use == And also .equals */
        println("Two Name Are Same.And the Name is ${str2.toUpperCase()
        }")
    else
        println("All Name Are Different.")
}



