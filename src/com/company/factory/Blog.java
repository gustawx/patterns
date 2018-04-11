package com.company.factory;

import com.company.factory.sites.AboutPage;
import com.company.factory.sites.CommentPage;
import com.company.factory.sites.ContactPage;
import com.company.factory.sites.PostPage;

public class Blog extends Website{
    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
