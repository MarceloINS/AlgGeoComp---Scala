class LinearAlgebra:

  //Transposta
  def transpose(a: Matriz) =
    val res = Array.fill(a.linhas)(Array.fill(a.colunas)(0))
    a.elementos.indices foreach (i =>
      a.elementos(i).indices foreach (j =>
        res(j)(i) = a.elementos(i)(j)))
    Matriz(a.colunas, a.linhas, res)


  //Soma de matrizes
  def sum(a: Matriz, b: Matriz) =
    val res = Array.fill(a.linhas)(Array.fill(a.colunas)(0))
    if (a.linhas equals b.linhas) && (a.colunas equals b.colunas) then
      a.elementos.indices foreach(i =>
        a.elementos(i).indices foreach(j =>
          res(i)(j) = a.elementos(i)(j) + b.elementos(i)(j)))
    else throw new Error("As dimensoes dos operandos precisam ser iguais")
    Matriz(a.linhas, a.colunas, res)

  //Times
  def times(a: Matriz, b: Matriz) =
    val res = Array.fill(a.linhas)(Array.fill(a.colunas)(0))
    if (a.linhas equals b.linhas) && (a.colunas equals b.colunas) then
      a.elementos.indices foreach(i =>
        a.elementos(i).indices foreach(j =>
          res(i)(j) = a.elementos(i)(j) * b.elementos(i)(j)))
    else throw new Error("As dimensoes dos operandos precisam ser iguais")
    Matriz(a.linhas, a.colunas, res)

    def times(a: Matriz, b: Int) =
      val res = Array.fill(a.linhas)(Array.fill(a.colunas)(0))
      a.elementos.indices foreach(i =>
        a.elementos(i).indices foreach(j =>
          res(i)(j) = a.elementos(i)(j) * b))
      Matriz(a.linhas,a.colunas, res)