package com.Zrips.CMI.Modules.Search;

public class SearchTypeItemName extends SearchTypeItem {
    String name;

    public SearchTypeItemName(String name) {
        super(null);
    }

    public SearchTypeItemName(SearchTypeItem parent, String name) {
        super(parent);
    }

    public String getName() {
        return null;
    }

    @Override
    protected boolean isValid() {
        return false;
    }

    @Override
    public String getSearchTypeName() {
        return null;
    }
}
