/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.solr.bench.generators;

import java.util.Locale;
import org.quicktheories.generators.ArbitraryDSL;
import org.quicktheories.generators.BigDecimalsDSL;
import org.quicktheories.generators.BigIntegersDSL;
import org.quicktheories.generators.CharactersDSL;
import org.quicktheories.generators.LocalDatesDSL;

/** The type Source dsl. */
public class SourceDSL {

  private SourceDSL() {}

  /**
   * Longs longs dsl.
   *
   * @return the longs dsl
   */
  public static LongsDSL longs() {
    return new LongsDSL();
  }

  /**
   * Integers integers dsl.
   *
   * @return the integers dsl
   */
  public static IntegersDSL integers() {
    return new IntegersDSL();
  }

  /**
   * Doubles doubles dsl.
   *
   * @return the doubles dsl
   */
  public static DoublesDSL doubles() {
    return new DoublesDSL();
  }

  /**
   * Floats floats dsl.
   *
   * @return the floats dsl
   */
  public static FloatsDSL floats() {
    return new FloatsDSL();
  }

  /**
   * Characters characters dsl.
   *
   * @return the characters dsl
   */
  public static CharactersDSL characters() {
    return new CharactersDSL();
  }

  /**
   * Strings strings dsl.
   *
   * @return the strings dsl
   */
  public static StringsDSL strings() {
    return new StringsDSL();
  }

  /**
   * Lists lists dsl.
   *
   * @return the lists dsl
   */
  public static ListsDSL lists() {
    return new ListsDSL();
  }

  /**
   * Maps maps dsl.
   *
   * @return the maps dsl
   */
  public static MapsDSL maps() {
    return new MapsDSL();
  }

  /**
   * Arrays arrays dsl.
   *
   * @return the arrays dsl
   */
  public static ArraysDSL arrays() {
    return new ArraysDSL();
  }

  /**
   * Big integers big integers dsl.
   *
   * @return the big integers dsl
   */
  public static BigIntegersDSL bigIntegers() {
    return new BigIntegersDSL();
  }

  /**
   * Big decimals big decimals dsl.
   *
   * @return the big decimals dsl
   */
  public static BigDecimalsDSL bigDecimals() {
    return new BigDecimalsDSL();
  }

  /**
   * Arbitrary arbitrary dsl.
   *
   * @return the arbitrary dsl
   */
  public static ArbitraryDSL arbitrary() {
    return new ArbitraryDSL();
  }

  /**
   * Dates dates dsl.
   *
   * @return the dates dsl
   */
  public static DatesDSL dates() {
    return new DatesDSL();
  }

  /**
   * Local dates local dates dsl.
   *
   * @return the local dates dsl
   */
  public static LocalDatesDSL localDates() {
    return new LocalDatesDSL();
  }

  /**
   * Booleans booleans dsl.
   *
   * @return the booleans dsl
   */
  public static BooleansDSL booleans() {
    return new BooleansDSL();
  }

  /**
   * Check arguments.
   *
   * @param expression the expression
   * @param errorMessageTemplate the error message template
   * @param errorMessageArgs the error message args
   */
  public static void checkArguments(
      boolean expression, String errorMessageTemplate, Object... errorMessageArgs) {
    if (!expression) {
      throw new IllegalArgumentException(
          String.format(Locale.ENGLISH, errorMessageTemplate, errorMessageArgs));
    }
  }
}
