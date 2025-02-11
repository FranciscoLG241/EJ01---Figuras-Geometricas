abstract class Figura(val color: String) {

    abstract fun area(): Double
    abstract fun perimetro(): Double



    fun mostrarColor(): String{
        return "La figura es de color: $color"
    }
}




class Circulo(color: String, private val radio: Double): Figura(color){

    override fun area(): Double{
        return Math.PI * radio * radio
    }


    override fun perimetro(): Double{
        return 2 * Math.PI * radio
    }
}




class Rectangulo(color: String, val altura: Double, val base: Double): Figura(color){

    override fun area(): Double{
        return base * altura
    }


    override fun perimetro(): Double{
        return 2 * (base + altura)
    }
}




class Triangulo(color: String, val altura: Double, val base: Double, val lado1: Double, val lado2: Double, val lado3: Double): Figura(color){

    override fun area(): Double {
        return (base * altura) / 2
    }


    override fun perimetro(): Double {
        return lado1 + lado2 + lado3
    }
}




fun main() {
    val circulo = Circulo("Rojo", 5.0)
    val rectangulo = Rectangulo("Azul", 4.0, 6.0)
    val triangulo = Triangulo("Verde", 3.0, 4.0, 5.0, 6.0, 5.5)

    println("\n **CÍRCULO**")
    println("Círculo - ${circulo.mostrarColor()}, Área: ${"%.2f".format(circulo.area())}, Perímetro: ${"%.2f".format(circulo.perimetro())}")

    println("\n **RECTÁNGULO**")
    println("Rectángulo - ${rectangulo.mostrarColor()}, Área: ${rectangulo.area()}, Perímetro: ${rectangulo.perimetro()}")

    println("\n **TRIÁNGULO**")
    println("Triángulo - ${triangulo.mostrarColor()}, Área: ${triangulo.area()}, Perímetro: ${triangulo.perimetro()}")
}


