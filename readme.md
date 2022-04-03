### ESTRUTUTURA DE DADOS – SCALA

#### Array
```
def main(args: Array[Int]): Unit =
  println(args);
}

main(Array(1, 2, 3, 100))
```

#### Lists

São imutáveis, não pode mudar valores.

```
def main(args: List[Int]): Unit =
  println(args);
}

main(List(1, 2, 3, 100))
```

#### Lists

São imutáveis, não pode mudar valores.

```
def main(args: List[Int]): Unit =
  println(args);
}

main(List(1, 2, 3, 100))
```

##### head

Devolve o primeiro valor que uma lista possui.

```
def main(args: List[Int]): Unit =
  println(args.head) ===> 1
}

main(List(1, 2, 3, 100))
```

##### tail

Devolve uma lista sem o primeiro valor.

```
def main(args: List[Int]): Unit =
  println(args.tail) ===> List(2, 3, 100)
}

main(List(1, 2, 3, 100))
```

##### map

Percorre cada valor da lista e devolve uma nova lista aplicando uma função.

```
def main(args: List[Int]): Unit =
  println(args.map(_ + 1)) ===> List(2, 3, 4, 101)
}

main(List(1, 2, 3, 100))
```

##### filter

Filtra valores dentro da lista.

```
def main(args: List[Int]): Unit =
  println(args.filter(_ % 2)) ===> List(2, 100)
}

main(List(1, 2, 3, 100))
```

##### [flatMap](https://www.geeksforgeeks.org/scala-flatmap-method/)


```
def main(args: List[Int]): Unit =
  var par = (x: Int) => List(x, x+1);

  println(args.flatMap(par)) ===> List(1, 2, 2, 3, 3, 4, 100, 101)

  println(args.map(par)) ===> List(List(1, 2), List(2, 3), List(3, 4), List(100, 101))
}

main(List(1, 2, 3, 100))
```

#### Sets

Não preserva a ordem de apresentação dos valores na ordem que você inseriu.

Não permite valores duplicados.

São imutáveis, não pode mudar valores.

```
def main(args: Set[Int]): Unit =
  println(args) ==> Set(5, 1, 6, 2, 3, 4);
}

main(Set(1, 1, 2, 3, 5, 4, 6))
```

#### Tuple

Agrupam diferentes tipos de coleções e diferentes tipos de dados.

```
val hostPort: (List[String], Int, Int, String) = (List("SP", "RJ"), 80, 70, "BA")

hostPort._3 ===> 70
```

#### Sequências

Agrupa listas, vetores e arrays.

```
val hostPort: (List[String], Int, Int, String) = (List("SP", "RJ"), 80, 70, "BA")

hostPort._3 ===> 70
```

#### [Map](https://docs.scala-lang.org/overviews/collections/maps.html)


```
val gps = Map("pais" -> "Brasil", "cidade" -> "Salvador", "bairro" -> "Federação")

gps. keys = Iterable(pais, cidade, bairro)
gps.values = Iterable(Brasil, Salvador, Federação)

```


#### [Options](https://www.tutorialspoint.com/scala/scala_options.htm)

Pode ser um objeto Some[T] ou None.



