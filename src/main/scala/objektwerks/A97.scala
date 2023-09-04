package objektwerks

/**
  * Find the unpaired number in a list.
  */
object A97:
  def findUnpairedItem[T](list: List[T]): Option[T] =
    list
      .foldLeft[Set[T]](Set.empty) {
        case (set, t) if set.contains(t) => set - t
        case (set, t) => set + t
      }
      .headOption