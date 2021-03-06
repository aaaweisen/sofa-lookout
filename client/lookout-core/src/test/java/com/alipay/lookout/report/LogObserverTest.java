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
package com.alipay.lookout.report;

import com.alipay.lookout.api.Id;
import com.alipay.lookout.core.DefaultRegistry;
import com.alipay.lookout.remote.model.LookoutMeasurement;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.Marker;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by kevin.luy@alipay.com on 2018/5/15.
 */
public class LogObserverTest {
    private static String str;

    @Test
    public void testUseLogObserver() {
        LogObserver logObserver = new LogObserver(new StringLog());
        Id id = new DefaultRegistry().createId("aa");
        LookoutMeasurement measurement = new LookoutMeasurement(new Date(), id);
        measurement.addTag("k", "v");
        measurement.put("v", 2);

        List<LookoutMeasurement> measurements = new ArrayList<LookoutMeasurement>();
        measurements.add(measurement);
        logObserver.update(measurements, null);
        Assert.assertTrue(str.contains("\"tags\":{\"k\":\"v\"}"));
    }

    @Test
    public void testLogObserverEnable() {
        LogObserver logObserver = new LogObserver();
        Assert.assertTrue(logObserver.isEnable());
    }

    private static class StringLog implements Logger {
        @Override
        public String getName() {
            return null;
        }

        @Override
        public boolean isTraceEnabled() {
            return false;
        }

        @Override
        public void trace(String s) {

        }

        @Override
        public void trace(String s, Object o) {

        }

        @Override
        public void trace(String s, Object o, Object o1) {

        }

        @Override
        public void trace(String s, Object... objects) {

        }

        @Override
        public void trace(String s, Throwable throwable) {

        }

        @Override
        public boolean isTraceEnabled(Marker marker) {
            return false;
        }

        @Override
        public void trace(Marker marker, String s) {

        }

        @Override
        public void trace(Marker marker, String s, Object o) {

        }

        @Override
        public void trace(Marker marker, String s, Object o, Object o1) {

        }

        @Override
        public void trace(Marker marker, String s, Object... objects) {

        }

        @Override
        public void trace(Marker marker, String s, Throwable throwable) {

        }

        @Override
        public boolean isDebugEnabled() {
            return false;
        }

        @Override
        public void debug(String s) {

        }

        @Override
        public void debug(String s, Object o) {

        }

        @Override
        public void debug(String s, Object o, Object o1) {

        }

        @Override
        public void debug(String s, Object... objects) {

        }

        @Override
        public void debug(String s, Throwable throwable) {

        }

        @Override
        public boolean isDebugEnabled(Marker marker) {
            return false;
        }

        @Override
        public void debug(Marker marker, String s) {

        }

        @Override
        public void debug(Marker marker, String s, Object o) {

        }

        @Override
        public void debug(Marker marker, String s, Object o, Object o1) {

        }

        @Override
        public void debug(Marker marker, String s, Object... objects) {

        }

        @Override
        public void debug(Marker marker, String s, Throwable throwable) {

        }

        @Override
        public boolean isInfoEnabled() {
            return false;
        }

        @Override
        public void info(String s) {
            str = s;
        }

        @Override
        public void info(String s, Object o) {

        }

        @Override
        public void info(String s, Object o, Object o1) {

        }

        @Override
        public void info(String s, Object... objects) {

        }

        @Override
        public void info(String s, Throwable throwable) {

        }

        @Override
        public boolean isInfoEnabled(Marker marker) {
            return false;
        }

        @Override
        public void info(Marker marker, String s) {

        }

        @Override
        public void info(Marker marker, String s, Object o) {

        }

        @Override
        public void info(Marker marker, String s, Object o, Object o1) {

        }

        @Override
        public void info(Marker marker, String s, Object... objects) {

        }

        @Override
        public void info(Marker marker, String s, Throwable throwable) {

        }

        @Override
        public boolean isWarnEnabled() {
            return false;
        }

        @Override
        public void warn(String s) {

        }

        @Override
        public void warn(String s, Object o) {

        }

        @Override
        public void warn(String s, Object... objects) {

        }

        @Override
        public void warn(String s, Object o, Object o1) {

        }

        @Override
        public void warn(String s, Throwable throwable) {

        }

        @Override
        public boolean isWarnEnabled(Marker marker) {
            return false;
        }

        @Override
        public void warn(Marker marker, String s) {

        }

        @Override
        public void warn(Marker marker, String s, Object o) {

        }

        @Override
        public void warn(Marker marker, String s, Object o, Object o1) {

        }

        @Override
        public void warn(Marker marker, String s, Object... objects) {

        }

        @Override
        public void warn(Marker marker, String s, Throwable throwable) {

        }

        @Override
        public boolean isErrorEnabled() {
            return false;
        }

        @Override
        public void error(String s) {

        }

        @Override
        public void error(String s, Object o) {

        }

        @Override
        public void error(String s, Object o, Object o1) {

        }

        @Override
        public void error(String s, Object... objects) {

        }

        @Override
        public void error(String s, Throwable throwable) {

        }

        @Override
        public boolean isErrorEnabled(Marker marker) {
            return false;
        }

        @Override
        public void error(Marker marker, String s) {

        }

        @Override
        public void error(Marker marker, String s, Object o) {

        }

        @Override
        public void error(Marker marker, String s, Object o, Object o1) {

        }

        @Override
        public void error(Marker marker, String s, Object... objects) {

        }

        @Override
        public void error(Marker marker, String s, Throwable throwable) {

        }
    }

}
