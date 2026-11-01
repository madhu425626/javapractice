 int index = 0;

        ShoppingListVector sl = new ShoppingListVector();
        int size = Integer.parseInt(IO.readln());
        sl.shoppingList  = new Vector<>(size);

        for(int i = 0; i<size; i++)
        {
            item = IO.readln();
            sl.shoppingList.add(item);
        }

        index = Integer.parseInt(IO.readln());

        for(int i = 0; i<n; i++)
        {
            if(i == index)
            {
                sl.shoppingList.remove(i);
            }
        }

        IO.println("Updated shopping list:");
        for(String i : sl.shoppingList)
        {
            IO.println(i);
        }
        // Write your code here
        
    }
}
