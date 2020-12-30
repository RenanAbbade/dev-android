fun main(){
    
    try{
        println("rnena".toInt())
    }catch(e: NumberFormatException){
        println("Exception of Number Format encountered")
    }catch(e: Exception){
        println("Exception encountered")
    }finally{ 
        println("this value")
    }
}
