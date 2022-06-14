@main def main =
  val aux = new Auxiliar
  val linearAlgebra = new LinearAlgebra
  val transformacoes = new Transformacoes
  
  aux exibirMatriz(linearAlgebra tortura (aux somaLin(aux.getMatrizAdjacencia), aux.getMatrizAdjacencia.linhas))
