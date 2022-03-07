@main def main =
  val aux = new Auxiliar
  val linearAlgebra = new LinearAlgebra

  val a = aux.createMatriz(3,3)
  aux.exibirMatriz(a)
  println()

  aux.exibirMatriz(linearAlgebra.transpose(a))