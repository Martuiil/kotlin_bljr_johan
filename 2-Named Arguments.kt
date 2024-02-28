fun joinOptions(options: Collection<String>) =
        options.joinToString(prefix = "[", postfix = "]") 

println(joinOptions(listOf("a", "b", "c")))
// tambahi prefix sama postfix contoh output : [a, b, c] default : a, b, c
