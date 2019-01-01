# Push: mutable
list = [1, 2, 3]
list.push(4)
list # [1, 2, 3, 4]

# <<: mutable
list = [1, 2, 3]
list << 4
list # [1, 2, 3, 4]

# +: immutable
list = [1, 2, 3]
list + [4] # [1, 2, 3, 4]
list # [1, 2, 3]
