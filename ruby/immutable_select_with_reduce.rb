def select(list, fn)
  list.reduce([]) { |acc, n| fn[n] ? acc + [n] : acc }
end

even = -> n { n % 2 == 0 }
list = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

select(list, even) # [2, 4, 6, 8, 10]