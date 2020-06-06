fun main(args : Array<String>)
{
    println("Hello world");
    /* using kotlin class */

    var sayan = world();

    sayan.name = "Sayantan";

    println("The name is :" + sayan.name);
    println("The name is :${sayan.name}");

    sayan = world(); /* calling the kotlin class */

    println("The name is :${sayan.name}");


}