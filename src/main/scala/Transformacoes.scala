class Transformacoes:
  val linearAlgebra = new LinearAlgebra
  val matrizesTransformacoes = new MatrizesTransformacoes
  val aux = new Auxiliar

  //rotação
  def rotation2D(vector: Matriz, angle: Double) =
    if aux isVector vector then
      linearAlgebra dot (matrizesTransformacoes rotation2D angle, vector)
    else throw Exception("O primeiro parâmetro precisa ser um Vetor")

  def rotationX3D(vector: Matriz, angle: Double) =
    if aux isVector vector then
      linearAlgebra dot (matrizesTransformacoes rotationX3D angle, vector)
    else throw Exception("O primeiro parâmetro precisa ser um Vetor")

  def rotationY3D(vector: Matriz, angle: Double) =
    if aux isVector vector then
      linearAlgebra dot (matrizesTransformacoes rotationY3D angle, vector)
    else throw Exception("O primeiro parâmetro precisa ser um Vetor")

  def rotationZ3D(vector: Matriz, angle: Double) =
    if aux isVector vector then
      linearAlgebra dot (matrizesTransformacoes rotationZ3D angle, vector)
    else throw Exception("O primeiro parâmetro precisa ser um Vetor")

  //cisalhamento
  def shearingX(vector: Matriz, a: Double) =
    if aux isVector vector then
      linearAlgebra dot (matrizesTransformacoes shearingX a, vector)
    else throw Exception("O primeiro parâmetro precisa ser um Vetor")

  def shearingY(vector: Matriz, a: Double) =
    if aux isVector vector then
      linearAlgebra dot (matrizesTransformacoes shearingY a, vector)
    else throw Exception("O primeiro parâmetro precisa ser um Vetor")

  //reflex
  def reflexX2D(vector: Matriz) =
    if aux isVector vector then
      linearAlgebra dot (matrizesTransformacoes.reflexX2D, vector)
    else throw Exception("O primeiro parâmetro precisa ser um Vetor")

  def reflexY2D(vector: Matriz) =
    if aux isVector vector then
      linearAlgebra dot (matrizesTransformacoes.reflexY2D, vector)
    else throw Exception("O primeiro parâmetro precisa ser um Vetor")

  def reflexX3D(vector: Matriz) =
    if aux isVector vector then
      linearAlgebra dot (matrizesTransformacoes.reflexX3D, vector)
    else throw Exception("O primeiro parâmetro precisa ser um Vetor")

  def reflexY3D(vector: Matriz) =
    if aux isVector vector then
      linearAlgebra dot (matrizesTransformacoes.reflexY3D, vector)
    else throw Exception("O primeiro parâmetro precisa ser um Vetor")

  def reflexZ3D(vector: Matriz) =
    if aux isVector vector then
      linearAlgebra dot (matrizesTransformacoes.reflexZ3D, vector)
    else throw Exception("O primeiro parâmetro precisa ser um Vetor")

  //projeção
  def projectionX2D(vector: Matriz) =
    if aux isVector vector then
      Matriz(2, 1, Array(Array(vector.elementos(0)(0)), Array(0.0)))
    else throw Exception("O primeiro parâmetro precisa ser um Vetor")

  def projectionY2D(vector: Matriz) =
    if aux isVector vector then
      Matriz(2, 1, Array(Array(0.0), Array(vector.elementos(1)(0))))
    else throw Exception("O primeiro parâmetro precisa ser um Vetor")

  def projectionX3D(vector: Matriz) =
    if aux isVector vector then
      Matriz(3, 1, Array(Array(vector.elementos(0)(0)), Array(0.0), Array(0.0)))
    else throw Exception("O primeiro parâmetro precisa ser um Vetor")

  def projectionY3D(vector: Matriz) =
    if aux isVector vector then
      Matriz(3, 1, Array(Array(0.0), Array(vector.elementos(1)(0)), Array(0.0)))
    else throw Exception("O primeiro parâmetro precisa ser um Vetor")

  def projectionZ3D(vector: Matriz) =
    if aux isVector vector then
      Matriz(3, 1, Array(Array(0.0), Array(0.0), Array(vector.elementos(2)(0))))
    else throw Exception("O primeiro parâmetro precisa ser um Vetor")