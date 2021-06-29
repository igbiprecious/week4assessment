
fun main(){
println(evenlySpaced(2,4,6))
}
fun evenlySpaced(a: Int, b : Int, c : Int ): Boolean{


        if( a > b && a > c && b > c){
            return a - b == b - c
        }else if( a > b && a > c && c > b ){
            return a - c == c - b
        }else if ( b > a && b > c && a > c){
            return b - a == a - c
        }else if ( b > a && b > c && c > a){
            return b - c == c - a
        }else if ( c > a && c > b && a > b){
            return c - a == a - b
        }
    return c - b == b - a
}