list = [1, 2, 3, 4]

list_without_last = List.delete_at(list, -1)
IO.inspect list_without_last # [1, 2, 3]

list_with_one_more = list ++ [1]
IO.inspect list_with_one_more # [1, 2, 3, 4, 1]

# the list value is immutable
IO.inspect list # [1, 2, 3, 4]
