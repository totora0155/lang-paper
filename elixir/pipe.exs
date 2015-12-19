# 7500000000
odd? = &(rem(&1, 2) != 0)
IO.puts 1..100_000 |> Stream.map(&(&1 * 3)) |> Stream.filter(odd?) |> Enum.sum
