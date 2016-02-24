unmanagedSourceDirectories in Compile := Seq(baseDirectory.value / "src/main/scala")

unmanagedSourceDirectories in Test := Seq(baseDirectory.value / "src/test/scala")
