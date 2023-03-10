/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by jextract

package org.apache.tomcat.util.openssl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$7 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$7() {}
    static final FunctionDescriptor X509_STORE_add_lookup$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle X509_STORE_add_lookup$MH = RuntimeHelper.downcallHandle(
        "X509_STORE_add_lookup",
        constants$7.X509_STORE_add_lookup$FUNC
    );
    static final FunctionDescriptor X509_LOOKUP_hash_dir$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle X509_LOOKUP_hash_dir$MH = RuntimeHelper.downcallHandle(
        "X509_LOOKUP_hash_dir",
        constants$7.X509_LOOKUP_hash_dir$FUNC
    );
    static final FunctionDescriptor X509_LOOKUP_file$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle X509_LOOKUP_file$MH = RuntimeHelper.downcallHandle(
        "X509_LOOKUP_file",
        constants$7.X509_LOOKUP_file$FUNC
    );
    static final FunctionDescriptor X509_LOOKUP_ctrl$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle X509_LOOKUP_ctrl$MH = RuntimeHelper.downcallHandle(
        "X509_LOOKUP_ctrl",
        constants$7.X509_LOOKUP_ctrl$FUNC
    );
    static final FunctionDescriptor X509_STORE_CTX_get_ex_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle X509_STORE_CTX_get_ex_data$MH = RuntimeHelper.downcallHandle(
        "X509_STORE_CTX_get_ex_data",
        constants$7.X509_STORE_CTX_get_ex_data$FUNC
    );
    static final FunctionDescriptor X509_STORE_CTX_get_error$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle X509_STORE_CTX_get_error$MH = RuntimeHelper.downcallHandle(
        "X509_STORE_CTX_get_error",
        constants$7.X509_STORE_CTX_get_error$FUNC
    );
}


