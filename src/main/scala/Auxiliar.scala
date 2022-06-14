import scala.util.Random

class Auxiliar:

  var r = new Random()
  def createMatriz(linhas: Int, colunas: Int) = new Matriz(linhas, colunas, createElements(linhas, colunas))

  def createElements(linhas: Int, colunas: Int): Array[Array[Double]] =
    val start = Array.fill(linhas)(Array.fill(colunas)(1.0))
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

  def isVector(vector: Matriz) =
    if(vector.colunas != 1) then
      false
    else
      true

  def getMatrizAdjacencia =
    val lin = 10
    val col = 10
    val elem = Array.fill(lin)(Array.fill(col)(0.0))
    elem(0)(1) = 1.0
    elem(5)(1) = 1.0
    elem(5)(2) = 1.0
    elem(5)(3) = 1.0
    elem(0)(4) = 1.0
    elem(1)(4) = 1.0
    elem(2)(4) = 1.0
    elem(5)(4) = 1.0
    elem(7)(4) = 1.0
    elem(3)(5) = 1.0
    elem(8)(5) = 1.0
    elem(9)(5) = 1.0
    elem(3)(6) = 1.0
    elem(0)(7) = 1.0
    elem(4)(7) = 1.0
    elem(5)(7) = 1.0
    elem(5)(9) = 1.0
    elem(6)(9) = 1.0
    Matriz(lin, col, elem)

  def somaLin(a: Matriz) =
    val res = Array.fill(a.linhas)(Array.fill(1)(0.0))
    for(i <- 0 until a.linhas)
      for(j <- 0 until a.linhas)
        res(i)(0) = res(i)(0) + a.elementos(j)(i)
    Matriz(a.linhas, 1, res)

  def somaCol(a: Matriz) =
    val res = Array.fill(a.linhas)(Array.fill(1)(0.0))
    for(i <- 0 until a.linhas)
      for(j <- 0 until a.linhas)
        res(i)(0) = res(i)(0) + a.elementos(i)(j)
    Matriz(a.linhas, 1, res)

  def mod(a: Matriz) =
    var acumulate = 0.0
    for(i <- 0 until a.linhas)
        acumulate = acumulate + a.elementos(i)(0) * a.elementos(i)(0) //caguei pro ^
    acumulate

  def div(a: Matriz, b: Double) =
    val res = Array.fill(a.linhas)(Array.fill(1)(0.0))
    for(i <- 0 until a.linhas)
      res(i)(0) = a.elementos(i)(0)/Math.sqrt(b)
    Matriz(a.linhas,1, res)

//  def rankUp(a: Matriz) =
//    val res = Array.fill(a.linhas)(Array.fill(1)(0.0))
//      for(i <- 2 until a.linhas)
//        var key = a.elementos(i)(0)