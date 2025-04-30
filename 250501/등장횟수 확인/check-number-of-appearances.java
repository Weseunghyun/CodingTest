package main

import "fmt"

func main() {
    var numbers = []int{124, 341, 547, 56, 23}
    var count int
    for i := range numbers {
        if numbers[i] % 2 == 0 {
            count++
        }
    }
    fmt.Println(count)
}