# Build an anonymous function that applies a tax of 12% to a given price.
# It should print a message with the new price and tax value.
# Bind the anonymous function to a variable called apply_tax.
# You should use apply_tax with Enum.each/2, like in the following example.

print = fn total_price, taxed_price ->
  IO.puts "Price: #{total_price} - Tax: #{taxed_price}"
end

apply_tax = fn price ->
  taxed_price = price * 0.12
  total_price = price + taxed_price
  print.(total_price, taxed_price)

  total_price
end

Enum.each [12.5, 30.99, 250.49, 18.80], apply_tax
