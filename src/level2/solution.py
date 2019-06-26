import math

def parent(height, node):
    size = long(math.pow(2, height) - 1)
    if node == size: return -1

    prev = 0
    while True:
        size = (size & 0xffffffffL) >> 1
        left = prev + size
        right = left + size
        current = right + 1

        if left == node or right == node: return current
        if node > left: prev = left
    return 0

def solution(h, q):
    return [parent(h, n) for n in q]