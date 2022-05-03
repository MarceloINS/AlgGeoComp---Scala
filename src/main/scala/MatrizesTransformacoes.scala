import scala.math._
class MatrizesTransformacoes:

  //reflex
  def reflexX2D = new Matriz(2,2, Array(Array(1.0,0.0), Array(0.0,-1.0)))
  def reflexY2D = new Matriz(2,2, Array(Array(-1.0,0.0), Array(0.0,1.0)))

  def reflexX3D = new Matriz(3,3, Array(Array(-1.0,0.0,0.0), Array(0.0,1.0,0.0), Array(0.0,0.0,1.0)))
  def reflexY3D = new Matriz(3,3, Array(Array(1.0,0.0,0.0), Array(0.0,-1.0,0.0), Array(0.0,0.0,1.0)))
  def reflexZ3D = new Matriz(3,3, Array(Array(1.0,0.0,0.0), Array(0.0,1.0,0.0), Array(0.0,0.0,-1.0)))

  //cisalhamento
  def shearingX(a: Double) = new Matriz(2,2, Array(Array(1.0,a), Array(0.0,1.0)))
  def shearingY(a: Double) = new Matriz(2,2, Array(Array(1.0,0.0), Array(a,1.0)))

  //rotação
  def rotation2D(angle: Double) = new Matriz(2,2, Array(Array(cos(angle),-(sin(angle))), Array(sin(angle),cos(angle))))
  def rotationX3D(angle: Double) = new Matriz(3,3, Array(Array(1.0, 0.0, 0.0), Array(0.0, cos(angle), -(sin(angle))), Array(0.0, sin(angle), cos(angle))))
  def rotationY3D(angle: Double) = new Matriz(3,3, Array(Array(cos(angle), 0.0, -(sin(angle))), Array(0.0,1.0,0.0), Array(sin(angle), 0.0, cos(angle))))
  def rotationZ3D(angle: Double) = new Matriz(3,3, Array(Array(cos(angle),-(sin(angle)),0.0), Array(0.0,1.0,0.0), Array(0.0,0.0,-1.0)))