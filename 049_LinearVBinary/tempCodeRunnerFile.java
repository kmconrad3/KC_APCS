 LinearSearch ls = new LinearSearch();
        OneThousandSortedRandomNumbers otsrn = new OneThousandSortedRandomNumbers();

        int x = ls.linearSearch(otsrn.getSortedArray(),7250);
        int y= ls.linearSearch(otsrn.getSortedArray(),9463);
        int z= ls.linearSearch(otsrn.getSortedArray(),1137);
        int a= ls.linearSearch(otsrn.getSortedArray(),4837);

        System.out.println(x + " " + y + " " + z + " " + a);