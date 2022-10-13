fun main() {

    var userName: String? = null
    var needAnyhelp: String? = null

    print("Enter your name: ")
    userName = readLine().toString()
    println("hi $userName")
    println ("Do you need any help? (Y/N)")
    needAnyhelp = readLine().toString()

    if(needAnyhelp.lowercase() == "y"){
        println("How may I help you")
    }else if(needAnyhelp.lowercase() =="n"){
        println("Don't Forget I am here...")
    }else{
        println("oh okay")
    }
    println("Thank you very much")
}
