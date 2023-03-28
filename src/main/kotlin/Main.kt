import javax.swing.JOptionPane

fun main(args: Array<String>) {
    var parametro : Double
    var area : Double
    var choose : String = "figura que escogiste"
    var clase : Cuadrilatero

    var escoger = JOptionPane.showInputDialog("1. Para cuadrado \n2. Para rectangulo").toInt()
        if (escoger == 1){
            choose = "cuadrado"
            var lado = JOptionPane.showInputDialog("Ingresa el valor de cada lado de tu cuadrado").toDouble()
            clase = Cuadrilatero(lado)
        }else if(escoger == 2){
            var choose = "rectangulo"
            var ladob = JOptionPane.showInputDialog("Ingresa la base de tu triangulo").toDouble()
            var ladoh = JOptionPane.showInputDialog("Ingresa la altura de tu triangulo").toDouble()
            clase = Cuadrilatero(ladob, ladoh)
        }else{
            clase = Cuadrilatero(0.0)
        }

    JOptionPane.showMessageDialog(null, "El perimetro de tu $choose es ${clase.area} y el perimetro es ${clase.perimetro}")
}