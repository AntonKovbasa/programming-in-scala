val hex = 0x5
val hex2 = 0x00FF
val magic = 0xcafebabe
val dec1 = 31
val dec2 = 255
val dec3 = 20

val prog = 0xCAFEBABEL
val tower = 35L
val of = 31l

val little: Short = 367
val littler: Byte = 38

val big = 1.2345
val bigger = 1.2345e1
val biggerStill = 123E45
val little = 1.2345F
val littleBigger = 3e5f
val anotherDouble = 3e5
val yetAnother = 3e5D

/*
\n line feed (\u000A)
\b backspace (\u0008)
\t tab (\u0009)
\f form feed (\u000C)
\r carriage return (\u000D)
\" double quote (\u0022)
\' single quote (\u0027)
\\ backslash (\u005C)
*/
val a = 'A'
val d = '\u0041'
val f = '\u0044'
val backslash = '\\'

val hello = "hello"
val escapes = "\\\"\'"
println("""Welcome to Ultamix 3000.
Type "HELP" for help.""")
println("""|Welcome to Ultamix 3000.
           |Type "HELP" for help.""".stripMargin)


def updateRecordByName(r: Symbol, value:
Any): Unit = {
  // code goes here
}
updateRecordByName(Symbol("favoriteAlbum"), "OK Computer")
updateRecordByName('favoriteAlbum, "OK Computer")
val s = Symbol("aSymbol")
val nm = s.name


val bool = true
val fool = false



