/*
 * Copyright 1999-2022 Alibaba Group Holding Ltd.
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

package io.appactive.java.api.base.exception.bo;

public interface IMsg {

    /**
     * 取得信息定义Key
     *
     * @return key
     */
    String getKey();

    /**
     * 取得当前信息对应的国际化文本
     * @param params as it is
     * @return msg
     */
    String getMsg(Object... params);
}
