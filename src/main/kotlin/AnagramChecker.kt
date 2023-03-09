fun String.isAnagram (str: String): Boolean{
    val strA = this.lowercase().filterNot { it.isWhitespace() }
    val strB = str.lowercase().filterNot { it.isWhitespace() }

    if (strA.length != strB.length){
        return false
    }

    val characterCountMap = mutableMapOf<Char, Int>()

    for(index in strA.indices){
        characterCountMap[strA[index]] = characterCountMap.getOrDefault(strA[index], 0) + 1
        characterCountMap[strB[index]] = characterCountMap.getOrDefault(strB[index], 0) - 1
    }

    return characterCountMap.values.none { it != 0 }
}