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

  //Multiplicação elemento x elemento
  def times(a: Matriz, b: Matriz) =
    val res = Array.fill(a.linhas)(Array.fill(a.colunas)(0))
    if (a.linhas equals b.linhas) && (a.colunas equals b.colunas) then
      a.elementos.indices foreach(i =>
        a.elementos(i).indices foreach(j =>
          res(i)(j) = a.elementos(i)(j) * b.elementos(i)(j) ))
    else throw new Error("As dimensoes dos operandos precisam ser iguais")
    Matriz(a.linhas, a.colunas, res)

  //Multiplicacao elemento x escalar
  def times(a: Matriz, b: Int) =
    val res = Array.fill(a.linhas)(Array.fill(a.colunas)(0))
    a.elementos.indices foreach(i =>
      a.elementos(i).indices foreach(j =>
        res(i)(j) = a.elementos(i)(j) * b))
    Matriz(a.linhas,a.colunas, res)

  //Multiplicação Matricial
  def dot(a: Matriz, b: Matriz) =
    val res = Array.fill(a.linhas)(Array.fill(b.colunas)(0))
    /*if a.colunas == b.linhas then
      res.indices foreach(i =>
        res(i).indices foreach(j =>
          b.elementos.indices foreach(m =>
            a.elementos(m).indices foreach(n =>
              res(i)(j) += a.elementos(m)(n) * b.elementos(n)(m) ))
          ))
    else throw new Error("O numero de colunas da primeira matriz precisa ser igual ao numero de linhas da segunda matriz")
    Matriz(a.linhas, b.colunas, res)
    */
