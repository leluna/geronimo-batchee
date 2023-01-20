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
package org.apache.batchee.csv;

import org.apache.batchee.csv.util.IOs;
import org.apache.batchee.util.Batches;
import org.apache.commons.csv.CSVRecord;
import org.testng.annotations.Test;

import jakarta.batch.api.chunk.ItemProcessor;
import jakarta.batch.operations.JobOperator;
import jakarta.batch.runtime.BatchRuntime;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import static org.testng.Assert.assertEquals;

public class CommonsCsvReaderWithMapperTest {
    @Test
    public void read() throws Exception {
        final String path = "target/work/CommonsCsvReaderWithMapperTest.txt";

        final Properties jobParams = new Properties();
        jobParams.setProperty("input", path);

        final JobOperator jobOperator = BatchRuntime.getJobOperator();
        IOs.write(path, "v11,v12\nv21,v22\nv31,v32");
        Batches.waitForEnd(jobOperator, jobOperator.start("csv-reader-mapper", jobParams));

        final int size = StoreItems.ITEMS.size();
        assertEquals(size, 3);
        for (int i = 1; i <= size; i++) {
            final Record record = StoreItems.ITEMS.get(i - 1);
            assertEquals("v" + i + "1", record.c1);
            assertEquals("v" + i + "2", record.c2);
        }
    }

    public static class StoreItems implements ItemProcessor {
        public static final List<Record> ITEMS = new ArrayList<Record>(3);

        @Override
        public Object processItem(final Object item) throws Exception {
            ITEMS.add(Record.class.cast(item));
            return item;
        }
    }

    public static class Record {
        private final String c1;
        private final String c2;

        public Record(final String c1, final String c2) {
            this.c1 = c1;
            this.c2 = c2;
        }
    }

    public static class Mapper implements CsvReaderMapper<Record> {
        @Override
        public Record fromRecord(final CSVRecord record) {
            return new Record(record.get(0), record.get(1));
        }
    }
}
