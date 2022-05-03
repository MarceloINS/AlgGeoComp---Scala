@main def main =
  val aux = new Auxiliar
  val linearAlgebra = new LinearAlgebra
  val transformacoes = new Transformacoes

  val angle = 90

  val a = aux createMatriz (2,1)
  println("Vetor 2d")
  aux exibirMatriz a
  println()

  val b = aux createMatriz (3, 1)
  println("Vetor 3d")
  aux exibirMatriz b
  println()

  //rotação
  println("Matriz rotation 2d")
  aux exibirMatriz (transformacoes rotation2D (a, angle))
  println()
  println("Matriz rotation X3D")
  aux exibirMatriz(transformacoes rotationX3D (b, angle))
  println()
  println("Matriz rotation Y3D")
  aux exibirMatriz (transformacoes rotationY3D (b, angle))
  println()
  println("Matriz rotation Z3D")
  aux exibirMatriz (transformacoes rotationZ3D (b, angle))
  println()

  //reflex
  println("Matriz reflex X2D")
  aux exibirMatriz (transformacoes reflexX2D a)
  println()
  println("Matriz reflex Y2D")
  aux exibirMatriz (transformacoes reflexY2D a)
  println()
  println("Matriz reflex X3D")
  aux exibirMatriz (transformacoes reflexX3D b)
  println()
  println("Matriz reflex Y3D")
  aux exibirMatriz (transformacoes reflexY3D b)
  println()
  println("Matriz reflex Z3D")
  aux exibirMatriz (transformacoes reflexZ3D b)
  println()

  //shearing
  println("Matriz shearing X")
  aux exibirMatriz (transformacoes shearingX (a, 3))
  println()
  println("Matriz shearing Y")
  aux exibirMatriz (transformacoes shearingY (a, 3))
  println()

  //projeção
  println("Matriz projection X2D")
  aux exibirMatriz (transformacoes projectionX2D a)
  println()
  println("Matriz projection Y2D")
  aux exibirMatriz (transformacoes projectionY2D a)
  println()
  println("Matriz projection X3D")
  aux exibirMatriz (transformacoes projectionX3D b)
  println()
  println("Matriz projection Y3D")
  aux exibirMatriz (transformacoes projectionY3D b)
  println()
  println("Matriz projection Z3D")
  aux exibirMatriz (transformacoes projectionZ3D b)
  println()
