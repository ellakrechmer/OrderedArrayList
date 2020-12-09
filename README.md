# OrderedArrayList
Part I: NoNullArrayList

We talked about how we need to basically just check to see if the input is null, and if it is we will throw an extension; and we can access the "old" methods by using super.

Part II: OrderedArrayList

We mentioned that comparing values would be much easier with integers than with strings, but since we're using the Comparable interface, we can use the compareTo method to order strings; it's actually not that difficult to add values in because you just go through the ArrayList until you reach a value greater than your input (or until you reach the end), and then you would just add your input in front of the greater value; and it's a bit more difficult to sort values in the first place, so we might have to make a separate ArrayList and transfer our values into our data; we talked about two different ways to sort
