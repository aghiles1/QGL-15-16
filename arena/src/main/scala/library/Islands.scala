package library

import eu.ace_design.island.dsl.DiSLand
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.map.processes.AssignPitch
import eu.ace_design.island.stdlib.WhittakerDiagrams

object Islands extends DiSLand {


  // Big island, easy to find.
  val s46 = 0xE2D3535222C0D8B2L
  lazy val week46: IslandMap = {
    createIsland shapedAs ellipsis(80.percent, 50.percent, 72) withSize 1000 having 1200.faces builtWith Seq(
      plateau(20), flowing(rivers = 10, distance = 0.4), withMoisture(soils.wet, distance = 200),
      AssignPitch, usingBiomes(WhittakerDiagrams.caribbean)) usingSeed s46
  }


  // Round island, quite big. Easy to exploit.
  val s47 = 0x7C86C8F0AE471824L
  lazy val week47: IslandMap = {
    createIsland shapedAs donut(70.percent, 30.percent) withSize 1600 having 1200.faces builtWith Seq(
      plateau(30), flowing(rivers = 30, distance = 0.4), withMoisture(soils.normal, distance = 700),
      AssignPitch, usingBiomes(WhittakerDiagrams.caribbean)) usingSeed s47
  }

  // Needle in an haystack
  val s48 = 0x7099D003D471C6D9L
  lazy val week48: IslandMap = {
    createIsland shapedAs donut(40.percent, 5.percent) withSize 1600 having 1200.faces builtWith Seq(
      plateau(10), flowing(rivers = 5, distance = 0.4), withMoisture(soils.dry, distance = 100),
      AssignPitch, usingBiomes(WhittakerDiagrams.caribbean)) usingSeed s48
  }

  // Let the game begin: ocean inside!
  val s49 = 0x19ABF6AA7B22F38BL
  lazy val week49: IslandMap = {
    createIsland shapedAs radial(factor = 1.57) withSize 1600 having 1200.faces builtWith Seq(
      plateau(30), flowing(rivers = 40, distance = 0.1), withMoisture(soils.wet, distance = 100),
      AssignPitch, usingBiomes(WhittakerDiagrams.caribbean)) usingSeed s49
  }


  // Large island, three capes, but few wood.
  val s50 = 0xBE3EF65BEF2BD459L
  lazy val week50: IslandMap = {
    createIsland shapedAs radial(factor = 0.42) withSize 1600 having 1200.faces builtWith Seq(
      plateau(5), flowing(rivers = 10, distance = 0.9), withMoisture(soils.dry, distance = 200),
      AssignPitch, usingBiomes(WhittakerDiagrams.caribbean)) usingSeed s50
  }


}