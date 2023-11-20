package org.lock.util.test.base;

import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

/**
 * @author cartoon
 * @since 2023/11/20 22:22
 */
@Suite
@SelectPackages({"org.lock.util.test"})
@ExcludePackages({"org.manage.log.query.base.provider"})
public class AllTest {
}
