
fun main() {
    val a = "xyaabbbccccdefww"
    val b = "xxxxyyyyabklmopq"
    print(longest(a,b))
}

fun longest(str1:String ,str2:String):String {
    //join the strings
    val joinStr = str1+str2
    //remove duplicates and sort characters
    val sortStr = joinStr.toSortedSet()
    //rejoins all chars to a string
    return sortStr.joinToString("")
}

