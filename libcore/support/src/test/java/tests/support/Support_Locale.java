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

package tests.support;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;


/**
 * Helper class for {@link Locale} tests
 */
public class Support_Locale {

    /**
     * Helper method to determine if given locales are available.
     *
     * @param requiredLocales - the set of {@link Locale} to check
     *
     * @return true if all requiredLocales are available.
     */
    public static boolean areLocalesAvailable(Locale[] requiredLocales) {
        Locale[] availableLocales = Locale.getAvailableLocales();
        Set<Locale> localeSet = new HashSet<Locale>(Arrays.asList(availableLocales));
        for (Locale requiredLocale : requiredLocales) {
            if (!localeSet.contains(requiredLocale)) {
                return false;
            }
        }
        return true;
    }

}