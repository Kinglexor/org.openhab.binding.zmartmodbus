/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.zmartmodbus.internal.exceptions;

/**
 * @author Peter Kristensen
 *
 *         The ProtocolException class is the superclass of all errors and
 *         exceptions in the Kura Protocol project. It extends the JDK Exception
 *         class by requesting its invokers to provide an error code when
 *         building its instances. The code is one value of ProtocolErrorCode
 *         enum; the code is used to document the possible error conditions
 *         generated by the platform as well as to identify the localized
 *         exception messages to be reported. Exceptions messages are stored in
 *         the ProtocolExceptionMessagesBundle Properties Bundle and they are
 *         keyed on the exception code.
 *
 */
public class ModbusProtocolException extends Exception {

    private static final long serialVersionUID = -6155136065068974723L;

    protected ModbusProtocolErrorCode m_code;

    @SuppressWarnings("unused")
    private ModbusProtocolException() {
        super();
    }

    @SuppressWarnings("unused")
    private ModbusProtocolException(String message) {
        super(message);
    }

    @SuppressWarnings("unused")
    private ModbusProtocolException(String message, Throwable cause) {
        super(message, cause);
    }

    @SuppressWarnings("unused")
    private ModbusProtocolException(Throwable t) {
        super(t);
    }

    /**
     * Builds a new EdcException instance based on the supplied EdcErrorCode.
     *
     * @param code
     */
    public ModbusProtocolException(ModbusProtocolErrorCode code) {
        this.m_code = code;
    }

    /**
     * Builds a new EdcException instance based on the supplied EdcErrorCode and an optional complement string
     *
     * @param code
     * @param complement
     */
    public ModbusProtocolException(ModbusProtocolErrorCode code, String complement) {
        this.m_code = code;
    }

    /**
     * Builds a new EdcException instance based on the supplied EdcErrorCode, an optional Throwable cause, and optional
     * arguments for the associated exception message.
     *
     * @param code
     * @param arguments
     */
    public ModbusProtocolException(ModbusProtocolErrorCode code, Throwable cause, Object... arguments) {
        super(cause);

        this.m_code = code;
    }

    public ModbusProtocolErrorCode getCode() {
        return this.m_code;
    }

}
