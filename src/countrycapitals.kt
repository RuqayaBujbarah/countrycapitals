fun main(){
    var clist = listOf<String>("Saudi Arabia","Qatar","Kuwait")
    var arrlst = arrayListOf<String>()
    println("Enter the capital of each country: ")
    for (i in 0..2){
        print(clist[i]+": ")
        arrlst.add(readLine().toString())
    }
    for (i in 0..2){
        println(clist[i]+", "+arrlst[i])
    }
}