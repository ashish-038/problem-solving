/*
    Codility Lesson 1 - BinaryGap
    : Find longest sequence of zeros in binary representation of an integer.

    - Level of Difficulty: Painless
    - Task Score: 100%
    - Correntness: 100%
*/

import Foundation
import Glibc

public func solution(_ N: Int) -> Int {
    let binaryArray = makeBinaryArray(N)
    var gaps = [Int]()
    var gap = 0
    
    for (index, binary) in binaryArray.enumerated() {
        if binary == 0 {
            guard index != binaryArray.endIndex else { break }
            gap += 1
        } else {
            gaps.append(gap)
            gap = 0
        }
    }
    
    return gaps.max()!
}

private func makeBinaryArray(_ N: Int) -> [Int] {
    var integer = N
    var array = [Int]()
    
    while integer != 0 {
        array.insert(integer % 2, at: 0)
        integer /= 2
    }
    
    return array
}
