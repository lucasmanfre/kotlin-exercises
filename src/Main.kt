fun main() {
    ex5()
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

fun ex4(){
    val vetor = IntArray(5)
    print("Digite um numero: ")
    val n = readln().toInt()
    for (i in vetor.indices){
        vetor[i] = readln().toInt()
    }
    for(i in vetor.indices){
        when{
            vetor[i] < n -> println("${vetor[i]} é menor que $n")
        }
    }
}

fun ex5(){
    val vetor = IntArray(5)
    var qtd = 0
    for (i in vetor.indices){
        vetor[i] = readln().toInt()
    }
    print("Digite um numero: ")
    val n = readln().toInt()
    for (i in vetor.indices){
        when{
            vetor[i]==n -> qtd++
        }
    }
    print("O número $n aparece $qtd veze(s) no array")
}