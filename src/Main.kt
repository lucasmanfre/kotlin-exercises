fun main() {
    ex1()
}

fun ex1(){
    val vetor = IntArray(5)
    var soma = 0
    for (i in vetor.indices){
        vetor[i] = readln().toInt()
        soma += vetor[i]
    }
    val media = soma/vetor.size
    println("A media dos numeros é $media")
    for (i in vetor.indices){
        if (vetor[i] > media){
            println("O numero ${vetor[i]} está acima da media ")
        }
        else if (vetor[i] < media){
            println("O numero ${vetor[i]} está abaixo da media ")
        }
        else{
            println("O numero ${vetor[i]} está na média")
        }
    }

}