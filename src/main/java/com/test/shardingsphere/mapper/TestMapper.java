/*
 * Copyright © 2019 Airparking HERE <ryan.cao@airparking.cn>
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
package com.test.shardingsphere.mapper;

import com.test.shardingsphere.entity.Test;
import tk.mybatis.mapper.common.Mapper;

/**
 * Created by ryan on 2019-04-04 17:32:45.
 */
@org.apache.ibatis.annotations.Mapper
public interface TestMapper extends Mapper<Test> {
}