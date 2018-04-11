package com.company.factory;

import com.company.factory.sites.CartPage;
import com.company.factory.sites.ItemPage;
import com.company.factory.sites.SearchPage;

public class Shop extends Website {
    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
