import scala.util.Random

class Auxiliar:

  var r = new Random()
  def createMatriz(linhas: Int, colunas: Int) = new Matriz(linhas, colunas, createElements(linhas, colunas))

  def createElements(linhas: Int, colunas: Int): Array[Array[Double]] =
    var start = Array.fill(linhas)(Array.fill(colunas)(1.0))
    for(i <- 0 until linhas)
      for(j <- 0 until colunas)
        start(i)(j) = r.between(1.0, 10.0).round
    start

  def exibirMatriz(a: Matriz) =
    a.elementos.indices foreach (i =>
      a.elementos(i).indices foreach (j =>
        if j == (a.colunas-1) then
          println(a.elementos(i)(j))
        else print(s"${a.elementos(i)(j)} ")))