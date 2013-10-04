/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.imesh.sample.wso2.mb.queue;

import javax.jms.JMSException;

public class QueueSenderMain {
    public static void main(String[] args) {
        QueueSender queueSender = null;
        try {
            queueSender = new QueueSender("SampleQueue");
            queueSender.connect();

            queueSender.sendMessage("Sample message 1");
            queueSender.sendMessage("Sample message 2");
            queueSender.sendMessage("Sample message 3");

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(queueSender != null)
                    queueSender.close();
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }
    }
}
