description = "Deobfuscator Core Module"

dependencies {
    kapt(Library.daggerCompiler)
    implementation(Library.dagger)
    compileOnly(Library.glassfish)
    asm()
}