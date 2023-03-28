class Cuadrilatero {
    var lado0 : Double
    var lado1 : Double

    constructor(lado: Double){
        lado0 = lado
        lado1 = lado
    }

    constructor(ladob : Double, ladoh :Double){
        lado0 = ladoh
        lado1 = ladob
    }

    var perimetro : Double = 0.0
        get() {
            return (lado0 + lado1) * 2
        }

    var area : Double = 0.0
        get() {
            return lado0 * lado1
        }
}