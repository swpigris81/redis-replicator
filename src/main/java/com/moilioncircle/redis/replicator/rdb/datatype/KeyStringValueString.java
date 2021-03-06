/*
 * Copyright 2016-2017 Leon Chen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.moilioncircle.redis.replicator.rdb.datatype;

/**
 * @author Leon Chen
 * @since 2.1.0
 */
public class KeyStringValueString extends KeyValuePair<String> {

    private static final long serialVersionUID = 1L;

    protected byte[] rawValue;

    /**
     * @return raw bytes
     * @since 2.2.0
     * @deprecated use {@link #getRawValue} instead. will remove in version 3.0.0
     */
    @Deprecated
    public byte[] getRawBytes() {
        return rawValue;
    }

    /**
     * @param rawBytes raw bytes
     * @since 2.2.0
     * @deprecated use {@link #setRawValue} instead. will remove in version 3.0.0
     */
    @Deprecated
    public void setRawBytes(byte[] rawBytes) {
        this.rawValue = rawBytes;
    }

    public byte[] getRawValue() {
        return rawValue;
    }

    public void setRawValue(byte[] rawValue) {
        this.rawValue = rawValue;
    }
}
