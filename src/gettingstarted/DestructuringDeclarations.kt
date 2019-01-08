package gettingstarted


fun main(args: Array<String>) {

    val ps = PrepStudent("Mahmoud" , "A")
    val  (a , b ) = ps
    print("name $a  grade $b")

}


data class PrepStudent (val name :String , var grade : String)
{
    var a = name
    var b = grade
}