case class Database(tables: Map[String,Table])
object Database{
  def createTable(database : Database) : Database = ???
  def insertRecords(database: Database) : Database = ???
}

case class Table(columnsName : List[String],
                 records: List[Record])
object Table{
  def createTable() : Table = ???
  def insertRecords(table: Table) : Table = ???
}

case class Record(fieldNameValueMap : Map[String, String])
object Record{
  def createRecord() : Record = ???
}

class CommandLineOption(val commandName: String,
                        val databaseFunction: Database => Database)
object fDMBS{
  val allOptions : Map[String, CommandLineOption]= ???
}

//val f: Database => Database = ???
//val g: Database => Database = ???

//d(Database(Map.empty))
