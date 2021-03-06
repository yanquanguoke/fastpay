/*
 * Copyright 2015-2102 Fast(http://www.cloudate.net) Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.fast.pay.user.dao.impl;

import com.fast.pay.user.entity.RpPayProduct;
import org.springframework.stereotype.Repository;

import com.fast.pay.common.core.dao.impl.BaseDaoImpl;
import com.fast.pay.user.dao.RpPayProductDao;
import com.fast.pay.user.entity.RpPayProduct;

/**
 * 支付产品dao实现类
 */
@Repository
public class RpPayProductDaoImpl  extends BaseDaoImpl<RpPayProduct> implements RpPayProductDao{
}