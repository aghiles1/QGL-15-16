package championships

import eu.ace_design.island.arena.Run
import eu.ace_design.island.game.{Directions, Plane}
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.stdlib.Resources._
import library.Islands
import library.SI3

object Week04 extends Run with SI3 {

  override val number: String = "04"

  override val seed: Long                = Islands.s04
  override lazy val theIsland: IslandMap = Islands.week04

  override val crew: Int    = 25
  override val budget: Int  = 10000
  override val plane: Plane = Plane(1, 1, Directions.EAST)
  override val objectives   = Set((FUR, 1000), (WOOD, 4000), (GLASS, 100))

  override def players = all - "qaa" - "qcd" - "qcf" - "qdc" - "qdd" - "qde"

}
