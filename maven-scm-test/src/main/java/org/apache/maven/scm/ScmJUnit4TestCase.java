package org.apache.maven.scm;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import junit.framework.TestCase;
import junit.framework.TestResult;

/**
 * Enables Junit 4 runner for ScmTestCase descendants in the least painful way.
 */
@RunWith( JUnit4.class )
public abstract class ScmJUnit4TestCase
    extends ScmTestCase
{
    /**
     * Overriden public {@link TestCase#setUp()} method already marked with {@link org.junit.Before}.
     */
    @Before
    @Override
    public void setUp()
        throws Exception
    {
        super.setUp();
    }

    /**
     * Overriden public {@link TestCase#tearDown()} method already marked with {@link org.junit.After}.
     */
    @After
    @Override
    public void tearDown()
        throws Exception
    {
        super.tearDown();
    }

    @Override
    public String getName()
    {
        return testNameRule.getMethodName();
    }

    @Deprecated
    @Override
    public void setName( String name )
    {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @Override
    public int countTestCases()
    {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @Override
    public TestResult run()
    {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @Override
    public void run( TestResult result )
    {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @Override
    public void runBare()
        throws Throwable
    {
        throw new UnsupportedOperationException();
    }

    @Rule
    public final TestName testNameRule = new TestName();
}
