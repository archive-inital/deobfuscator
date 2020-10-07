import org.gradle.api.JavaVersion
import org.gradle.kotlin.dsl.DependencyHandlerScope

/*
 * Spectral Powered
 * Copyright (C) 2020 Kyle Escobar
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, @see https://www.gnu.org/licenses/.
 */

object Project {
    const val version = "1.0.0"
    const val kotlinVersion = "1.4.10"
    const val gradleVersion = "6.6.1"
    val jvmVersion = JavaVersion.VERSION_11.toString()
}

object Library {
    private object Version {
        const val logger = "1.0.1"
        const val tinylog = "2.1.2"
        const val asm = "9.0-beta"
        const val spectralAsm = "1.1.0"
        const val dagger = "2.29.1"
        const val glassfish = "3.1.1"
    }

    const val logger = "org.spectral:logger:${Version.logger}"
    const val tinylogApi = "org.tinylog:tinylog-api-kotlin:${Version.tinylog}"
    const val asm = "org.ow2.asm:asm:${Version.asm}"
    const val asmUtil = "org.ow2.asm:asm-util:${Version.asm}"
    const val asmCommons = "org.ow2.asm:asm-commons:${Version.asm}"
    const val asmTree = "org.ow2.asm:asm-tree:${Version.asm}"
    const val spectralAsmCore = "org.spectral:asm-core:${Version.spectralAsm}"
    const val spectralAsmAnalyzer = "org.spectral:asm-analyzer:${Version.spectralAsm}"
    const val daggerCompiler = "com.google.dagger:dagger-compiler:${Version.dagger}"
    const val dagger = "com.google.dagger:dagger:${Version.dagger}"
    const val glassfish = "org.glassfish:javax.annotation:${Version.glassfish}"
}

fun DependencyHandlerScope.logger() {
    "implementation"(Library.logger)
    "implementation"(Library.tinylogApi)
}

fun DependencyHandlerScope.asm() {
    "implementation"(Library.asm)
    "implementation"(Library.asmUtil)
    "implementation"(Library.asmCommons)
    "implementation"(Library.asmTree)
    "implementation"(Library.spectralAsmCore)
    "implementation"(Library.spectralAsmAnalyzer)
}