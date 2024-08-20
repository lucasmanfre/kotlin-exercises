fun main() {
    ex11()
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

fun ex2(){
    print("Digite o tamanho do vetor: ")
    val n = readln().toInt()
    val vetor = IntArray(n)
    for (i in vetor.indices){
        vetor[i] = readln().toInt()
    }
    for (i in vetor.indices){
        println("${vetor[i]}, ")
    }
    for (i in vetor.indices){
        when{
            vetor[i] > 0 -> println("${vetor[i]} - maior que zero")
            vetor[i] < 0 -> println("${vetor[i]} - menor que zero")
            else -> println("${vetor[i]} - igual a zero")
        }
    }

}

fun ex3(){
    print("Digite o tamanho do vetor: ")
    val n = readln().toInt()
    val vetorA = IntArray(n)
    val vetorB = IntArray(n)
    for(i in vetorA.indices){
        vetorA[i] = readln().toInt()
        vetorB[i] = vetorA[i] * 2
    }
    for(i in vetorB.indices){
        print("${vetorB[i]}, ")
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

fun ex6(){
    val vetorNotas = FloatArray(5)
    val vetorPeso = FloatArray(5)
    var mediaPonderada = 0.0
    var div = 0.0

    for (i in vetorNotas.indices){
        vetorNotas[i] = readln().toFloat()
    }
    for (i in vetorPeso.indices){
        vetorPeso[i] = readln().toFloat()
    }
    for (i in 0..4){
        mediaPonderada += vetorNotas[i] * vetorPeso[i]
        div += vetorPeso[i]
    }
    mediaPonderada /= div
    print("Media ponderada: %.2f " .format(mediaPonderada))
}

fun ex7(){
    val vetorA = IntArray(5)
    val vetorB = IntArray(5)
    var validacao = true
    for (i in vetorA.indices){
        vetorA[i] = readln().toInt()
    }
    for (i in vetorB.indices){
        vetorB[i] = readln().toInt()
    }
    for (i in 0..4){
        if(vetorA[i] != vetorB[i]){
            validacao = false
        }
    }
    if(validacao){
        print("Os vetores são iguais")
    }
    else{
        print("Os vetores não são iguais")
    }
}

fun ex8(){
    val vetorA = IntArray(5)
    val vetorB = IntArray(5)
    val vetorC = IntArray(10)
    for (i in vetorA.indices){
        vetorA[i] = readln().toInt()
    }
    for (i in vetorB.indices){
        vetorB[i] = readln().toInt()
    }
    for (i in vetorC.indices){
        if(i < 5) {
            vetorC[i] = vetorA[i]
        }
        else{
            vetorC[i] = vetorB[i-5]
        }
    }
    for(i in vetorC.indices){
        print("${vetorC[i]}, ")
    }
}

fun ex9 (){
    val vetorA = IntArray(5)
    val vetorB = IntArray(5)
    val vetorC = IntArray(5)
    for(i in vetorA.indices){
        vetorA[i] = readln().toInt()
    }
    for(i in vetorB.indices){
        vetorB[i] = readln().toInt()
    }
    for(i in vetorC.indices){
        when{
            i%2 == 0 -> vetorC[i] = vetorA[i]
            else -> vetorC[i] = vetorB[i]
        }
        print("${vetorC[i]}, ")
    }

}

fun ex10(){
    val vetorA = IntArray(5)
    val vetorB = IntArray(5)
    var n = 4
    for(i in vetorA.indices){
        vetorA[i] = readln().toInt()
        vetorB[n] = vetorA[i]
        n--
    }
    for (i in vetorB.indices){
        print("${vetorB[i]}, ")
    }
}

fun ex11(){
    val vetorA = IntArray(5)
    val vetorB = IntArray(5)
    var soma = 0
    for (i in vetorA.indices){
        vetorA[i] = readln().toInt()
    }
    for(i in vetorB.indices){
        vetorB[i] = readln().toInt()
        soma += vetorA[i] * vetorB[i]
    }
    println("$soma")
}