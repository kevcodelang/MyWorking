fun main(){
    println(petals(3,12))
}
fun petals(timmy:Int,sarah:Int):Boolean{
    if ((timmy %2==0) .xor (sarah %2==0)) return true
    return false
}
