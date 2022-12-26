fun main() {
    print(solution(1000000, 490000, 900000))
}

@Suppress("NAME_SHADOWING")
fun solution(n: Int, l: Int, r: Int): Int {
    var l = l
    var r = r

    var count = 0

    while (l <= r) {
        println(l + r)
        if (l + r == n)
            count++

        if (l + r >= n) {
            r--
            continue
        }
        l++
    }

    return count
}
