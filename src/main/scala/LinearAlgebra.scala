class LinearAlgebra:

  //Transposta
  def transpose(a: Matriz) =
    val res = Array.fill(a.linhas)(Array.fill(a.colunas)(0.0))
    a.elementos.indices foreach (i =>
      a.elementos(i).indices foreach (j =>
        res(j)(i) = a.elementos(i)(j)))
    Matriz(a.colunas, a.linhas, res)

  //Soma de matrizes
  def sum(a: Matriz, b: Matriz) =
    val res = Array.fill(a.linhas)(Array.fill(a.colunas)(0.0))
    if (a.linhas equals b.linhas) && (a.colunas equals b.colunas) then
      a.elementos.indices foreach(i =>
        a.elementos(i).indices foreach(j =>
          res(i)(j) = a.elementos(i)(j) + b.elementos(i)(j)))
    else throw new Error("As dimensoes dos operandos precisam ser iguais")
    Matriz(a.linhas, a.colunas, res)

  //Multiplicação elemento x elemento
  def times(a: Matriz, b: Matriz) =
    val res = Array.fill(a.linhas)(Array.fill(a.colunas)(0.0))
    if (a.linhas equals b.linhas) && (a.colunas equals b.colunas) then
      a.elementos.indices foreach(i =>
        a.elementos(i).indices foreach(j =>
          res(i)(j) = a.elementos(i)(j) * b.elementos(i)(j) ))
    else throw new Error("As dimensoes dos operandos precisam ser iguais")
    Matriz(a.linhas, a.colunas, res)

  //Multiplicacao elemento x escalar
  def times(a: Matriz, b: Int) =
    val res = Array.fill(a.linhas)(Array.fill(a.colunas)(0.0))
    a.elementos.indices foreach(i =>
      a.elementos(i).indices foreach(j =>
        res(i)(j) = a.elementos(i)(j) * b))
    Matriz(a.linhas,a.colunas, res)

  def dot(a: Matriz, b: Matriz) =
    val res = Array.fill(a.linhas)(Array.fill(b.colunas)(0.0))
    if(a.colunas == b.linhas)
      for(i <- 0 until res.length)
        for(j <- 0 until res(i).length)
          for(k <- 0 until a.colunas)
            res(i)(j) = res(i)(j) +  a.elementos(i)(k) * b.elementos(k)(j)
    else throw Exception("O numero de colunas da primeira matriz precisam ser igual ao numero de linhas da segunda matriz")
    new Matriz(a.linhas, b.colunas, res);