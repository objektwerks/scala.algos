package objektwerks

/**
  * Find the unpaired number in a list of T.
  */
object A97:
  def findUnpairedItem[T](list: List[T]): Option[T] =
    list
      .view
      .foldLeft[Set[T]](Set.empty) {
        case (set, t) if set.contains(t) => set - t
        case (set, t) => set + t
      }
      .headOption