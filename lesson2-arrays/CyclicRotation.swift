/*
    Codility Lesson 2 - Arrays

    CyclicRotation
    : Rotate an array to the right by a given number of steps.
  
    - Level of Difficulty: Painless
    - Task Score: 100%
    - Correntness: 100%  
*/

import Foundation
import Glibc

// you can write to stdout for debugging purposes, e.g.
// print("this is a debug message")

public func solution(_ A : inout [Int], _ K : Int) -> [Int] {
    guard !A.isEmpty else { return A }
    guard K > 0 else { return A }
    guard K % A.count != 0 else { return A }
    
    let subrange = (A.endIndex - (K % A.count))..<A.endIndex
    let elementsToShift = A[subrange]
    A.removeSubrange(subrange)
    A.insert(contentsOf: elementsToShift, at: 0)
    
    return A
}
