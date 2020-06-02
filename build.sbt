name := "caliban-blog-series"

version := "0.1"

scalaVersion := "2.13.1"

libraryDependencies ++= Seq(
  "com.github.ghostdogpr"        %% "caliban"                       % "0.8.1",
  "com.github.ghostdogpr"        %% "caliban-http4s"                % "0.8.1",
  "com.github.ghostdogpr"        %% "caliban-client"                % "0.8.1",
  "com.softwaremill.sttp.client" %% "async-http-client-backend-zio" % "2.1.5"
)

enablePlugins(CodegenPlugin)
