/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.opensprinkler.internal.api.exception;

/**
 * The {@link UnauthorizedApiException} exception is thrown when result from the OpenSprinkler
 * API is "result" : 2.
 *
 * @author Chris Graham - Initial contribution
 */
public class UnauthorizedApiException extends Exception {
    /**
     * Serial ID of this error class.
     */
    private static final long serialVersionUID = 3509446091331584139L;

    /**
     * Basic constructor allowing the storing of a single message.
     *
     * @param message Descriptive message about the error.
     */
    public UnauthorizedApiException(String message) {
        super(message);
    }
}
