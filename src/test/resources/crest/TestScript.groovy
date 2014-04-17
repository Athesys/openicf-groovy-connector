/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2014 ForgeRock AS. All Rights Reserved
 *
 * The contents of this file are subject to the terms
 * of the Common Development and Distribution License
 * (the License). You may not use this file except in
 * compliance with the License.
 *
 * You can obtain a copy of the License at
 * http://forgerock.org/license/CDDLv1.0.html
 * See the License for the specific language governing
 * permission and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL
 * Header Notice in each file and include the License file
 * at http://forgerock.org/license/CDDLv1.0.html
 * If applicable, add the following below the CDDL Header,
 * with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 */


import groovy.json.JsonBuilder
import org.forgerock.json.fluent.JsonValue
import org.forgerock.json.resource.ActionRequest
import org.forgerock.json.resource.Connection
import org.forgerock.json.resource.Requests
import org.forgerock.json.resource.RootContext
import org.forgerock.openicf.connectors.scriptedcrest.ScriptedCRESTConfiguration
import org.identityconnectors.common.logging.Log
import org.forgerock.openicf.misc.scriptedcommon.OperationType

def action = action as OperationType
def configuration = configuration as ScriptedCRESTConfiguration
def connection = connection as Connection
def log = log as Log

log.info("This is TestScript")

ActionRequest request = Requests.newActionRequest("users", "clear");
JsonValue result = connection.action(new RootContext(), request);
