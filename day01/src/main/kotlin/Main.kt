package org.example

fun main() {
    val calibrationList = listOf(
        "dssmtmrkonedbbhdhjbf9hq",
        "2njsevenszzsfltconesixhsflpbpd",
        "6shgbprkpbksnfourfivemvncvg2eight",
        "eightseventhree7lfqpnclxnnineninemgkjtqksrdone",
        "bsxxzhkmmfcslmdhhrgf9seven665lsknmbpgj",
        "9fourfiveqjv4sxdbpcj77",
        "24twoonefive",
        "threesixfiveonefour36nggvfvdkzsix",
        "zvoneightngnpvvq8mpmsdjmvznrntwo",
        "fourbdqlr7pdqvhnjfnbrcnd8",
        "jtdvqdsixkfnmlrxc58",
        "dgcvchcdmksvqhdqvs29onenddxsqseven",
        "dqc57tf1xmkdnll",
        "cndpcrpnssix4fourxmdkreightvtxflcsg6",
        "5qnnsvrtwo1ninerzmtkdcm8six",
        "43onegx3ddqrp",
        "six76hljnssix8",
        "six4kzjdcbbbhvnineseveneight6sevenfive",
        "4rx6tpghlcgf",
        "67mcmfive1sixonefive",
        "97two19",
        "six7ninetwosgtrpsqzltmjqkghrgbninexnmbbj",
        "pvxbdnqlvnx5slshseven748nine",
        "six9234pg7ninehmvrhxhhrc",
        "qhzp72twopxttldgmvqthgdnxhvht2nine",
        "8865zhhzgmzbglrmtdpdrt7",
        "7874",
        "fvmzfsck614",
        "2nine73eight4five",
        "2threefivengnvkrzmg6two",
        "21pzrckpscqnineseven",
        "dpcxmtdhrkjcvxqsrsl7fivehtfljvjh",
        "4dqhvlfmjfive14",
        "qzhmmsqfc7",
        "3kbklxmh",
        "eightf1mhkbdl4beight4",
        "k5rbcsrxtgd1vfhzmltqtcgmcmgtdjtxk",
        "9ldshn2twothreetwocmqjfourfxhb",
        "fkjpjmtvrz7fcpfmvbmlxn",
        "xkvzhqj75",
        "one6rzeight61eightrdxgsdxx4",
        "htfcnddhsl2d9zgqbdmfzsixtwosix",
        "ctvrqbrrzg3nine2dhbrmcs",
        "slcfsjt232fivebmjtdqfivempxzzhmmx",
        "bxqvkfour3jfkkqttxgsclstjg",
        "five5fournghbgprmfninephcmfzxksvqfvklrcnqnk",
        "sixrthreeseven74oneightssl",
        "gzd2l8seven",
        "qjvhxbzdp311sixonetwo",
        "hljdmsjbhclftbzqmtg636229",
        "9sixkmljpgnc6nbjmpgsstjrzhlsdck",
        "23slthree36qngbd",
        "6seventhglqeightcqltbdjxponefive",
        "preightthreeqk51",
        "pnhcr27ninesevenbvllhkdxc1",
        "zxrnhmthree4rlbhkzfl2",
        "djcz9foursevencrhgsxkkbln",
        "lmdvnnmjkg4qdcdkseven",
        "3rfvvnlp9pdjnxkqtv5bnpfzdcv",
        "cgnjnsnj1kvdlzdjvtjgkptjsevenhmmxxlone",
        "kzxt29fivejhbddgbncbvdqzeight",
        "6ninefour",
        "7nxlv",
        "fhdftpbb2vqqbtnjrjb8hmfks8",
        "7bgkfthree",
        "twozxfknjnrmv99xhddsqrxs",
        "twogndc12dgcghk",
    )
}

fun extractDigitsFromString(stringWithDigits: String): String {
    return stringWithDigits.filter { it.isDigit() }
}

fun getFirstAndLastDigit(stringWithDigits: String): String {
    return "${stringWithDigits.first()}${stringWithDigits.last()}"
}

fun doubleOutputIfSingleDigit(singleDigitString: String): String {
    return singleDigitString + singleDigitString
}
