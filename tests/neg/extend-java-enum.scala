import java.{lang => jl}

class C1 extends jl.Enum[C1] // error: class C1 cannot extend java.lang.Enum

class C2(name: String, ordinal: Int) extends jl.Enum[C2](name, ordinal) // error: class C2 cannot extend java.lang.Enum

trait T extends jl.Enum[T] // error: trait T cannot extend java.lang.Enum
