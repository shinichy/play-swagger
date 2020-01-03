import sbt._, Keys._
import bintray.BintrayKeys._

object Publish {

  val coreSettings = Seq(
    bintrayOrganization := Some("shinichy"),
    bintrayPackageLabels := Seq("play-framework", "swagger", "rest-api", "API", "documentation"),
    publishMavenStyle := true,
    licenses := Seq("Apache-2.0" -> url("https://www.apache.org/licenses/LICENSE-2.0.html")),
    homepage := Some(url("http://iheartradio.github.io/play-swagger")),
    scmInfo := Some(ScmInfo(
      url("https://github.com/shinichy/play-swagger"),
      "git@github.com:shinichy/play-swagger.git")),
    pomIncludeRepository := { _ ⇒ false },
    publishArtifact in Test := false)

  val sbtPluginSettings = Seq(
    licenses := Seq("Apache-2.0" -> url("https://www.apache.org/licenses/LICENSE-2.0.html")),
    publishMavenStyle := false,
    bintrayOrganization := Some("shinichy"))
}
