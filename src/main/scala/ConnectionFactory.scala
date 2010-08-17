package connectionpool

trait ConnectionFactory[Connection] {
  def create(): Connection
  def validate(connection: Connection): Boolean
  def destroy(connection: Connection): Unit
}
