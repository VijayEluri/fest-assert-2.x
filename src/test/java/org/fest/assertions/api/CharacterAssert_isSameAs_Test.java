/*
 * Created on Oct 24, 2010
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright @2010 the original author or authors.
 */
package org.fest.assertions.api;

import static junit.framework.Assert.assertSame;
import static org.mockito.Mockito.*;

import org.fest.assertions.internal.Objects;
import org.junit.*;

/**
 * Tests for <code>{@link CharacterAssert#isSameAs(Character)}</code>.
 *
 * @author Alex Ruiz
 */
public class CharacterAssert_isSameAs_Test {

  private Objects objects;
  private CharacterAssert assertions;

  @Before public void setUp() {
    objects = mock(Objects.class);
    assertions = new CharacterAssert('a');
    assertions.objects = objects;
  }

  @Test public void should_verify_that_actual_value_is_same_as_expected_value() {
    Character expected = 'b';
    assertions.isSameAs(expected);
    verify(objects).assertSame(assertions.info, assertions.actual, expected);
  }

  @Test public void should_return_this() {
    CharacterAssert returned = assertions.isSameAs('b');
    assertSame(assertions, returned);
  }
}