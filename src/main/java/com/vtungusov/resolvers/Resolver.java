package com.vtungusov.resolvers;

public interface Resolver<RESOLVER_RESULT, RESOLVER_CRITERIA> {
    RESOLVER_RESULT resolve(RESOLVER_CRITERIA productOrder);
}
