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
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The aws-kms is used for managing Amazon EKS
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface EKSEndpointBuilderFactory {


    /**
     * Builder for endpoint for the AWS EKS component.
     */
    public interface EKSEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedEKSEndpointBuilder advanced() {
            return (AdvancedEKSEndpointBuilder) this;
        }
        /**
         * Logical name.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default EKSEndpointBuilder label(String label) {
            setProperty("label", label);
            return this;
        }
        /**
         * The region in which EKS client needs to work. When using this
         * parameter, the configuration will expect the capitalized name of the
         * region (for example AP_EAST_1) You'll need to use the name
         * Regions.EU_WEST_1.name().
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default EKSEndpointBuilder region(String region) {
            setProperty("region", region);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the AWS EKS component.
     */
    public interface AdvancedEKSEndpointBuilder
            extends
                EndpointProducerBuilder {
        default EKSEndpointBuilder basic() {
            return (EKSEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedEKSEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedEKSEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedEKSEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedEKSEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.aws.eks.EKSOperations</code> enum.
     */
    enum EKSOperations {
        listClusters,
        describeCluster,
        createCluster,
        deleteCluster;
    }
    /**
     * AWS EKS (camel-aws-eks)
     * The aws-kms is used for managing Amazon EKS
     * 
     * Category: cloud,management
     * Available as of version: 3.0
     * Maven coordinates: org.apache.camel:camel-aws-eks
     * 
     * Syntax: <code>aws-eks:label</code>
     * 
     * Path parameter: label (required)
     * Logical name
     */
    default EKSEndpointBuilder eKS(String path) {
        class EKSEndpointBuilderImpl extends AbstractEndpointBuilder implements EKSEndpointBuilder, AdvancedEKSEndpointBuilder {
            public EKSEndpointBuilderImpl(String path) {
                super("aws-eks", path);
            }
        }
        return new EKSEndpointBuilderImpl(path);
    }
}
