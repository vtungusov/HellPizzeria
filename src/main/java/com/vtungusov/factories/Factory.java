package com.vtungusov.factories;

import com.vtungusov.resolvers.Supports;

public interface Factory<FACTORY_RESULT, SUP_CRITERIA>
        extends Supports<SUP_CRITERIA> {
    FACTORY_RESULT create(SUP_CRITERIA productOrder);
}
