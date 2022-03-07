class Matriz(numLinhas: Int, numColunas: Int, entrada: Array[Array[Int]]):

  val _linhas = numLinhas
  val _colunas = numColunas
  val _elementos = entrada

  def linhas = _linhas
  def colunas = _colunas
  def elementos = _elementos