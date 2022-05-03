class Transformacoes:
  val linearAlgebra = new LinearAlgebra
  val matrizesTransformacoes = new MatrizesTransformacoes
  
  //rotação
  def rotation2D(vector: Matriz, angle: Double) =
    if(vector.colunas != 1) then
      throw Exception("O primeiro parâmetro precisa ser um Vetor")
    else
      linearAlgebra.dot(matrizesTransformacoes.rotation2D(angle), vector)

  def rotationX3D(vector: Matriz, angle: Double) =
    if(vector.colunas != 1) then
      throw Exception("O primeiro parâmetro precisa ser um Vetor")
    else
      linearAlgebra.dot(matrizesTransformacoes.rotationX3D(angle), vector)

  def rotationY3D(vector: Matriz, angle: Double) =
    if(vector.colunas != 1) then
      throw Exception("O primeiro parâmetro precisa ser um Vetor")
    else
      linearAlgebra.dot(matrizesTransformacoes.rotationY3D(angle), vector)

  def rotationZ3D(vector: Matriz, angle: Double) =
    if(vector.colunas != 1) then
      throw Exception("O primeiro parâmetro precisa ser um Vetor")
    else
      linearAlgebra.dot(matrizesTransformacoes.rotationZ3D(angle), vector)

  //cisalhamento
  def shearingX(vector: Matriz, a: Double) =
    if(vector.colunas != 1) then
      throw Exception("O primeiro parâmetro precisa ser um Vetor")
    else
      linearAlgebra.dot(matrizesTransformacoes.shearingX(a), vector)

  def shearingY(vector: Matriz, a: Double) =
    if(vector.colunas != 1) then
      throw Exception("O primeiro parâmetro precisa ser um Vetor")
    else
      linearAlgebra.dot(matrizesTransformacoes.shearingY(a), vector)

  //reflex
  def reflexX2D(vector: Matriz) =
    if(vector.colunas != 1) then
      throw Exception("O primeiro parâmetro precisa ser um Vetor")
    else
      linearAlgebra.dot(matrizesTransformacoes.reflexX2D, vector)

  def reflexY2D(vector: Matriz) =
    if(vector.colunas != 1) then
      throw Exception("O primeiro parâmetro precisa ser um Vetor")
    else
      linearAlgebra.dot(matrizesTransformacoes.reflexY2D, vector)

  def reflexX3D(vector: Matriz) =
    if(vector.colunas != 1) then
      throw Exception("O primeiro parâmetro precisa ser um Vetor")
    else
      linearAlgebra.dot(matrizesTransformacoes.reflexX3D, vector)

  def reflexY3D(vector: Matriz) =
    if(vector.colunas != 1) then
      throw Exception("O primeiro parâmetro precisa ser um Vetor")
    else
      linearAlgebra.dot(matrizesTransformacoes.reflexY3D, vector)

  def reflexZ3D(vector: Matriz) =
    if(vector.colunas != 1) then
      throw Exception("O primeiro parâmetro precisa ser um Vetor")
    else
      linearAlgebra.dot(matrizesTransformacoes.reflexZ3D, vector)