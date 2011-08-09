/*
 * Copyright 2011 James Moger.
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
package com.iciql.test.models;

import java.util.Date;

import com.iciql.Iciql.EnumType;
import com.iciql.Iciql.IQColumn;
import com.iciql.Iciql.IQEnum;
import com.iciql.Iciql.IQTable;
import com.iciql.test.models.EnumModels.Tree;

/**
 * Default values model.
 */
@IQTable(name = "DefaultValuesTest")
public class DefaultValuesModel {

	@IQColumn(primaryKey = true, autoIncrement = true)
	public Long myLong;
	
	@SuppressWarnings("deprecation")
	@IQColumn
	public Date myDate = new Date(100, 7, 1);
	
	@IQColumn
	public Integer myInteger = 12345;
	
	@IQColumn
	public Tree myEnumIdTree = Tree.WALNUT;

	@IQColumn
	@IQEnum(EnumType.NAME)
	public Tree myNameTree = Tree.MAPLE;

	@IQColumn
	@IQEnum(EnumType.ORDINAL)
	public Tree myOrdinalTree = Tree.PINE;

	@IQColumn(nullable = true)
	public Tree myNullTree;

	public DefaultValuesModel() {
	}
}
