@main def main =
  val aux = new Auxiliar
  val linearAlgebra = new LinearAlgebra

  val a = aux.createMatriz(2,3)
  aux.exibirMatriz(a)
  println()

  val b = aux.createMatriz(3,2)
  aux.exibirMatriz(b)
  println()

  aux.exibirMatriz(linearAlgebra.dot(a,b))