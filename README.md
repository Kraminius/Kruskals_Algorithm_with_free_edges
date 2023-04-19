# Kruskal's Algorithm with free edges

Kruskal's algorithm to sort an algorithm assignment that goes something like:

"The government want to connect islands with bridges and fairies as cheap as possible. Input: Ø, B, F = Islands, Possible Bridges, Fairies available" Next line(B+1): a, b, c = source island, destination island, weighted cost.

Fairies exists, and are free; Find the cheapest way to connect all the islands.

We could have used Prim's or Kruskal. But listening on the water-pipes; The dataset is not very edge-dense, and I decided to opt for Kruskal, seeing this is done in Java - and therefore not very CPU effective.
