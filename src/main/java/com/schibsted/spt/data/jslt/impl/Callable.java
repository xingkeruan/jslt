
package com.schibsted.spt.data.jslt.impl;

import com.fasterxml.jackson.databind.JsonNode;

/**
 * Common interface for macros and functions, in order to reduce code
 * duplication.
 */
public interface Callable {

  public String getName();

  public int getMinArguments();

  public int getMaxArguments();

}