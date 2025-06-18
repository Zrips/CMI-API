package com.Zrips.CMI.Modules.Search;

public class SearchTypeItemModelData extends SearchTypeItem {
    int modelData;

    public SearchTypeItemModelData(int modelData) {
        super(null);
    }

    public SearchTypeItemModelData(SearchTypeItem parent, int modelData) {
        super(parent);
    }

    public int getModelData() {
        return 0;
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
