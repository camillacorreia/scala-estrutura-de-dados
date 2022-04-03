package examples

object TupleAndMap extends App {
  def f(): Unit = {
    val umaTupla = (2, "Camilla");
    println((umaTupla._2));
    println(umaTupla.copy(_2 = "Nandes"));
    println(umaTupla.swap);

    val listaTelefonica = Map(("João", 1), ("Camilla", 2))
    println(listaTelefonica);

    println(listaTelefonica.contains("João"));
    println(listaTelefonica.contains("Nandes"));
  }

  f();
}

