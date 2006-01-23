/*
 * Copyright  2004-2005 Stefan Reuter
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package net.sf.asterisk.manager.event;

/**
 * A ParkedCallEvent is triggered when a channel is parked (in this case no
 * action id is set) and in response to a ParkedCallsAction.<br>
 * It is implemented in <code>res/res_features.c</code>
 * 
 * @see net.sf.asterisk.manager.action.ParkedCallsAction
 * @author srt
 * @version $Id: ParkedCallEvent.java,v 1.3 2005/08/27 04:04:29 srt Exp $
 */
public class ParkedCallEvent extends ResponseEvent
{
    /**
     * Serializable version identifier
     */
    private static final long serialVersionUID = -7437833328723536814L;
    private String exten;
    private String channel;
    private String from;
    private Integer timeout;
    private String callerId;
    private String callerIdName;
    private String uniqueId;

    /**
     * @param source
     */
    public ParkedCallEvent(Object source)
    {
        super(source);
    }

    /**
     * Returns the extension the channel is parked at.
     */
    public String getExten()
    {
        return exten;
    }

    /**
     * Sets the extension the channel is parked at.
     */
    public void setExten(String exten)
    {
        this.exten = exten;
    }

    /**
     * Returns the name of the channel that is parked.
     */
    public String getChannel()
    {
        return channel;
    }

    /**
     * Sets the name of the channel that is parked.
     */
    public void setChannel(String channel)
    {
        this.channel = channel;
    }

    /**
     * Returns the name of the channel that parked the call.
     */
    public String getFrom()
    {
        return from;
    }

    /**
     * Sets the name of the channel that parked the call.
     */
    public void setFrom(String from)
    {
        this.from = from;
    }

    /**
     * Returns the number of seconds this call will be parked.<br>
     * This corresponds to the <code>parkingtime</code> option in
     * <code>features.conf</code>.
     */
    public Integer getTimeout()
    {
        return timeout;
    }

    /**
     * Sets the number of seconds this call will be parked.
     */
    public void setTimeout(Integer timeout)
    {
        this.timeout = timeout;
    }

    /**
     * Returns the Caller*ID number of the parked channel.
     * @return the Caller*ID number of the parked channel.
     */
    public String getCallerId()
    {
        return callerId;
    }

    /**
     * Sets the Caller*ID number of the parked channel.
     * @param callerId the Caller*ID number of the parked channel.
     */
    public void setCallerId(String callerId)
    {
        this.callerId = callerId;
    }

    /**
     * Returns the Caller*ID name of the parked channel.
     * 
     * @return the Caller*ID name of the parked channel.
     * @since 0.2
     */
    public String getCallerIdName()
    {
        return callerIdName;
    }

    /**
     * Sets the Caller*ID name of the parked channel.
     * 
     * @param callerIdName the Caller*ID name of the parked channel.
     * @since 0.2
     */
    public void setCallerIdName(String callerIdName)
    {
        this.callerIdName = callerIdName;
    }

    /**
     * Returns the unique id of the parked channel.
     */
    public String getUniqueId()
    {
        return uniqueId;
    }

    /**
     * Sets the unique id of the parked channel.
     */
    public void setUniqueId(String uniqueId)
    {
        this.uniqueId = uniqueId;
    }
}